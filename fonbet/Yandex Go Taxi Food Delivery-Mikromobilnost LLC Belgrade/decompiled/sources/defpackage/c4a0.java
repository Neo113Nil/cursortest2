package defpackage;

/* loaded from: classes2.dex */
public final class c4a0 {
    public final String a;
    public final String b;
    public final a4a0 c;
    public final z3a0 d;
    public final v3a0 e;

    public c4a0(String str, String str2, a4a0 a4a0Var, z3a0 z3a0Var, v3a0 v3a0Var) {
        this.a = str;
        this.b = str2;
        this.c = a4a0Var;
        this.d = z3a0Var;
        this.e = v3a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a0)) {
            return false;
        }
        c4a0 c4a0Var = (c4a0) obj;
        return this.a.equals(c4a0Var.a) && this.b.equals(c4a0Var.b) && this.c.equals(c4a0Var.c) && this.d.equals(c4a0Var.d) && jl40.l(this.e, c4a0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        v3a0 v3a0Var = this.e;
        return hashCode + (v3a0Var == null ? 0 : v3a0Var.hashCode());
    }

    public final String toString() {
        return "PaymentMethod(id=" + this.a + ", title=" + this.b + ", lightTheme=" + this.c + ", darkTheme=" + this.d + ", asset=" + this.e + ')';
    }
}
