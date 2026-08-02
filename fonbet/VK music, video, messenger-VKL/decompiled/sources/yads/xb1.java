package yads;

/* loaded from: classes10.dex */
public final class xb1 extends RuntimeException {
    public final String b;
    public final String c;

    public xb1(String str, String str2) {
        super(str);
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
