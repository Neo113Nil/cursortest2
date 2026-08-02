package defpackage;

/* loaded from: classes8.dex */
public final class bv11 {
    public final String a;
    public final String b;

    public bv11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv11)) {
            return false;
        }
        bv11 bv11Var = (bv11) obj;
        return jl40.l(this.a, bv11Var.a) && jl40.l(this.b, bv11Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
