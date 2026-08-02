package defpackage;

/* loaded from: classes5.dex */
public final class a570 implements b151 {
    public final r9x0 a;
    public final g8l0 b;

    public a570(r9x0 r9x0Var, g8l0 g8l0Var) {
        this.a = r9x0Var;
        this.b = g8l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a570)) {
            return false;
        }
        a570 a570Var = (a570) obj;
        return jl40.l(this.a, a570Var.a) && this.b.equals(a570Var.b);
    }

    public final int hashCode() {
        r9x0 r9x0Var = this.a;
        return (this.b.hashCode() + ((r9x0Var == null ? 0 : r9x0Var.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "OpenDetailsWidgetAction(action=" + this.a + ", routePointsInterval=" + this.b + ", analyticsData=null)";
    }
}
