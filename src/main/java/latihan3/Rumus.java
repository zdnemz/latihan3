package latihan3;

// nama     : Maulana Zidane
// NPM      : 2310010235
// kelas    : 4D Reguler Banjarbaru

public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
    Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }
    
    void setLuasPersegi() {
        this.hasil = this.sisi * this.sisi;
    }
    
    void setLuasPersegiPanjang() {
        this.hasil = this.panjang * this.lebar;
    }
    
    int getHasil() {
        return this.hasil;
    }
}
