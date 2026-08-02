package defpackage;

/* loaded from: classes10.dex */
public final class a4 {
    public final String a;
    public int b;
    public int c;

    public /* synthetic */ a4(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.a = str;
    }

    public String a(String str) {
        String p = b64.p(new StringBuilder("["), str.substring(this.b, (str.length() - this.c) + 1), ']');
        int i = this.b;
        String str2 = this.a;
        if (i > 0) {
            p = (i > 20 ? "..." : "").concat(str2.substring(Math.max(0, i - 20), this.b)).concat(p);
        }
        if (this.c <= 0) {
            return p;
        }
        return p.concat(str2.substring((str2.length() - this.c) + 1, Math.min((str2.length() - this.c) + 21, str2.length())).concat((str2.length() - this.c) + 1 < str2.length() - 20 ? "..." : ""));
    }

    public a4(String str, String str2) {
        this.a = str;
    }

    public a4(String str, int i, int i2, int i3, long j) {
        this.a = str;
        this.c = i;
        this.b = i2;
    }
}
