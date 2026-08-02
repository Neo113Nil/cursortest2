package xsna;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
final class y5q0 extends d730<z5q0> {
    public final float a;
    public final float b;

    public y5q0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y5q0)) {
            return false;
        }
        y5q0 y5q0Var = (y5q0) obj;
        return pco.b(this.a, y5q0Var.a) && pco.b(this.b, y5q0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // xsna.d730
    public final z5q0 r() {
        z5q0 z5q0Var = new z5q0();
        z5q0Var.p = this.a;
        z5q0Var.q = this.b;
        return z5q0Var;
    }

    @Override // xsna.d730
    public final void s(z5q0 z5q0Var) {
        z5q0 z5q0Var2 = z5q0Var;
        z5q0Var2.p = this.a;
        z5q0Var2.q = this.b;
    }
}
