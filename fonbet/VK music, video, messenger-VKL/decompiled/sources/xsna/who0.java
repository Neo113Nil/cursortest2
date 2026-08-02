package xsna;

/* compiled from: TextFormat.kt */
/* loaded from: classes8.dex */
public final class who0 implements er10 {
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: TextFormat.kt */
    public static final class a {
    }

    public who0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // xsna.er10
    public final String a() {
        return this.b;
    }

    public final String toString() {
        return i5s.a(xe9.a("TextFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", language: "), this.c, ")");
    }
}
