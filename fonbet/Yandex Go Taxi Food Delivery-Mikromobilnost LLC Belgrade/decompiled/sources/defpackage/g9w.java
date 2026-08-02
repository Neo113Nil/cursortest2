package defpackage;

/* loaded from: classes6.dex */
public final class g9w {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public g9w(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9w)) {
            return false;
        }
        g9w g9wVar = (g9w) obj;
        return this.a.equals(g9wVar.a) && jl40.l(this.b, g9wVar.b) && jl40.l(this.c, g9wVar.c) && this.d == g9wVar.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(false) + unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
