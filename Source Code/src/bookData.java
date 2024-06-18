package bookshopmanagementsystem;

import java.sql.Date;

public class bookData {
    private Integer bookId;
    private String title;
    private String author;
    private String genre;
    private Date date;
    private Integer price;
    private String image;
    
    public bookData(Integer bookId, String title, String author, String genre
            , Date date, Integer price, String image){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.date = date;
        this.price = price;
        this.image = image;
    }
    public Integer getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public Date getDate(){
        return date;
    }
    public Integer getPrice(){
        return price;
    }
    public String getImage(){
        return image;
    }
}