package xsna;

/* compiled from: Toggleable.kt */
/* loaded from: classes11.dex */
final class b1p0 extends d730<e1p0> {
    public final boolean a;
    public final sg50 b;
    public final boolean c;
    public final boolean d;
    public final plg0 e;
    public final izs<Boolean, s3q0> f;

    public b1p0() {
        throw null;
    }

    public b1p0(boolean z, sg50 sg50Var, boolean z2, boolean z3, plg0 plg0Var, izs izsVar) {
        this.a = z;
        this.b = sg50Var;
        this.c = z2;
        this.d = z3;
        this.e = plg0Var;
        this.f = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1p0.class != obj.getClass()) {
            return false;
        }
        b1p0 b1p0Var = (b1p0) obj;
        return this.a == b1p0Var.a && epx.f(this.b, b1p0Var.b) && this.c == b1p0Var.c && this.d == b1p0Var.d && epx.f(this.e, b1p0Var.e) && this.f == b1p0Var.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        sg50 sg50Var = this.b;
        int b = qoy.b(qoy.b((hashCode + (sg50Var != null ? sg50Var.hashCode() : 0)) * 961, 31, this.c), 31, this.d);
        plg0 plg0Var = this.e;
        return this.f.hashCode() + ((b + (plg0Var != null ? Integer.hashCode(plg0Var.a) : 0)) * 31);
    }

    @Override // xsna.d730
    public final e1p0 r() {
        return new e1p0(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // xsna.d730
    public final void s(e1p0 e1p0Var) {
        e1p0 e1p0Var2 = e1p0Var;
        boolean z = e1p0Var2.P;
        boolean z2 = this.a;
        if (z != z2) {
            e1p0Var2.P = z2;
            itl.f(e1p0Var2).R();
        }
        e1p0Var2.Q = this.f;
        e1p0Var2.x2(this.b, null, this.c, this.d, null, this.e, e1p0Var2.R);
    }
}
