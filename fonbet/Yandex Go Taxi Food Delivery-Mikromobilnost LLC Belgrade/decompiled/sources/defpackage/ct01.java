package defpackage;

/* loaded from: classes14.dex */
public final class ct01 {
    public static final ct01 f = new ct01("", null, null, false, false);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public ct01(String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct01)) {
            return false;
        }
        ct01 ct01Var = (ct01) obj;
        return jl40.l(this.a, ct01Var.a) && jl40.l(this.b, ct01Var.b) && jl40.l(this.c, ct01Var.c) && this.d == ct01Var.d && this.e == ct01Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.e) + unr0.e((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }
}
