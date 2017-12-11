
package count;
 //here to the find the number of lines words and characters in a text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 public class CountInFile{ 
	  
	 public static void main(String[] args) { //creating main method
		 
						 
	        BufferedReader reader = null;    
	      //Create BufferedReader object to read the input text file line by line	         
	      //BufferedReader is used to read the text from a character based inputStream.It is to read data line
	      	    
	        //Initializing charCount, wordCount and lineCount to 0
	         
	        int charCount = 0;
	         
	        int wordCount = 0;
	         
	        int lineCount = 0;
	         
	        try{
	        
	            //Creating BufferedReader object and given the path of a source file
	            reader = new BufferedReader(new FileReader("C:/Users/USER/My/a.txt"));
	             
	            //Reading the first line into currentLine
	             
	            String currentLine = reader.readLine();
	             
	            //while loop is used to iterate a part of the program several times
	            while (currentLine != null){
	         
	                //giving  the lineCount              
	                lineCount++;
	                 
	                //Getting number of words in currentLine
	                 
	                String[] words = currentLine.split(" ");
	                 
	                //taking  the wordCount and length
	                 
	                wordCount = wordCount + words.length;
	                 
	                // here it is Iterating each word
	              //while loop is used to iterate a part of the program several times. if it is fixed the it use loop 
	                for (String word : words)
	                {
	                    //Updating the charCount
	                     
	                    charCount = charCount + word.length();
	                }
	                 
	                //Reading next line into currentLine
	                 
	                currentLine = reader.readLine();
	            }
	             
	            //Printing charCount, wordCount and lineCount
	          
	            System.out.println("Number Of Characters  In A  File : "+charCount);
	             
	            System.out.println("Number Of Words In A File : "+wordCount);
	             
	            System.out.println("Number Of Lines In A File : "+lineCount);
	        } 
	        catch (IOException e)  //has it gives exception to handle those put it in a try catch block
	        {
	            e.printStackTrace();
	        }
	        finally
	        //this is used to execute important code such as closing connection,it always executed whether is handled or not
	        {
	            try
	        /*the code is prone to exceptions is placed in the try block
	      *when exception occurs that exception occurred is handled by the 
	       *catch block associated with it
	        */	            
	            {
	            	//this method closes the stream and releases any system resources associated with it
	                reader.close();           // here Closing the reader
	            }
	            catch (IOException e) 
	            //IOException is for when input or output is failed or interrupted
	            {
	            	//prints stack trace for this throwable object
	            	e.printStackTrace();
	            }
	        }
	    }    
 }
