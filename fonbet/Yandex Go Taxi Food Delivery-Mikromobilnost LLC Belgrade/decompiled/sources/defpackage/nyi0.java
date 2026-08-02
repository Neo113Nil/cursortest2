package defpackage;

/* loaded from: classes10.dex */
public final class nyi0 {
    public final bjs0 a;
    public final bjs0 b;
    public final bjs0 c;
    public final bjs0 d;

    public nyi0(bjs0 bjs0Var, bjs0 bjs0Var2, bjs0 bjs0Var3, bjs0 bjs0Var4) {
        this.a = bjs0Var;
        this.b = bjs0Var2;
        this.c = bjs0Var3;
        this.d = bjs0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyi0)) {
            return false;
        }
        nyi0 nyi0Var = (nyi0) obj;
        return jl40.l(this.a, nyi0Var.a) && jl40.l(this.b, nyi0Var.b) && jl40.l(this.c, nyi0Var.c) && jl40.l(this.d, nyi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Paddings(top=" + this.a + ", right=" + this.b + ", bottom=" + this.c + ", left=" + this.d + ')';
    }
}
