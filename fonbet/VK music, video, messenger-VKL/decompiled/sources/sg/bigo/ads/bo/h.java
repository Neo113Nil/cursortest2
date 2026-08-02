package sg.bigo.ads.bo;

/* loaded from: classes9.dex */
public class h extends Exception {
    public final int a;
    private String b;
    private Exception c;

    public h(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.c;
        return exc != null ? exc.getMessage() : this.b;
    }
}
