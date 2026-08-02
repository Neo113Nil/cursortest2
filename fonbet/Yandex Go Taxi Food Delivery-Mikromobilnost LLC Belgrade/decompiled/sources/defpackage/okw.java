package defpackage;

/* loaded from: classes14.dex */
public final class okw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final nkw e;

    public okw(String str, String str2, String str3, String str4, nkw nkwVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = nkwVar;
    }

    public static okw a(okw okwVar, nkw nkwVar) {
        String str = okwVar.a;
        String str2 = okwVar.b;
        String str3 = okwVar.c;
        String str4 = okwVar.d;
        okwVar.getClass();
        return new okw(str, str2, str3, str4, nkwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okw)) {
            return false;
        }
        okw okwVar = (okw) obj;
        return jl40.l(this.a, okwVar.a) && this.b.equals(okwVar.b) && this.c.equals(okwVar.c) && jl40.l(this.d, okwVar.d) && this.e.equals(okwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
