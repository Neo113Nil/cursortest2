package xsna;

/* compiled from: Transformable.kt */
/* loaded from: classes11.dex */
final class tkp0 extends d730<xkp0> {
    public final alp0 a;
    public final fyi0 b;
    public final boolean c = true;

    public tkp0(alp0 alp0Var, fyi0 fyi0Var) {
        this.a = alp0Var;
        this.b = fyi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tkp0.class != obj.getClass()) {
            return false;
        }
        tkp0 tkp0Var = (tkp0) obj;
        return epx.f(this.a, tkp0Var.a) && this.b == tkp0Var.b && this.c == tkp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }

    @Override // xsna.d730
    public final xkp0 r() {
        return new xkp0(this.a, this.b, this.c);
    }

    @Override // xsna.d730
    public final void s(xkp0 xkp0Var) {
        xkp0 xkp0Var2 = xkp0Var;
        xkp0Var2.s = this.b;
        alp0 alp0Var = xkp0Var2.r;
        alp0 alp0Var2 = this.a;
        boolean f = epx.f(alp0Var, alp0Var2);
        boolean z = this.c;
        if (f && xkp0Var2.t == z) {
            return;
        }
        xkp0Var2.r = alp0Var2;
        xkp0Var2.t = z;
        xkp0Var2.x.x0();
    }
}
