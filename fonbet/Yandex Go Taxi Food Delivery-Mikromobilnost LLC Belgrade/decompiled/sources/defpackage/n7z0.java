package defpackage;

/* loaded from: classes6.dex */
public final class n7z0 {
    public final o7z0 a;
    public final o7z0 b;
    public final o7z0 c;
    public final o7z0 d;

    public n7z0(o7z0 o7z0Var, o7z0 o7z0Var2, o7z0 o7z0Var3, o7z0 o7z0Var4) {
        this.a = o7z0Var;
        this.b = o7z0Var2;
        this.c = o7z0Var3;
        this.d = o7z0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7z0)) {
            return false;
        }
        n7z0 n7z0Var = (n7z0) obj;
        return jl40.l(this.a, n7z0Var.a) && jl40.l(this.b, n7z0Var.b) && jl40.l(this.c, n7z0Var.c) && jl40.l(this.d, n7z0Var.d);
    }

    public final int hashCode() {
        o7z0 o7z0Var = this.a;
        int hashCode = (o7z0Var == null ? 0 : o7z0Var.hashCode()) * 31;
        o7z0 o7z0Var2 = this.b;
        int hashCode2 = (hashCode + (o7z0Var2 == null ? 0 : o7z0Var2.hashCode())) * 31;
        o7z0 o7z0Var3 = this.c;
        int hashCode3 = (hashCode2 + (o7z0Var3 == null ? 0 : o7z0Var3.hashCode())) * 31;
        o7z0 o7z0Var4 = this.d;
        return hashCode3 + (o7z0Var4 != null ? o7z0Var4.hashCode() : 0);
    }
}
