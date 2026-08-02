package defpackage;

/* loaded from: classes2.dex */
public final class fk21 implements za70 {
    public final gk21 a;

    public fk21(gk21 gk21Var) {
        this.a = gk21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk21) && jl40.l(this.a, ((fk21) obj).a);
    }

    public final int hashCode() {
        gk21 gk21Var = this.a;
        if (gk21Var == null) {
            return 0;
        }
        return gk21Var.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ')';
    }
}
