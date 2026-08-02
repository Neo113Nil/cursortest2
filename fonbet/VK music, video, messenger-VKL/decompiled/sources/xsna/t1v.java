package xsna;

/* compiled from: HeightInLinesModifier.kt */
/* loaded from: classes11.dex */
final class t1v extends d730<w1v> {
    public final nmo0 a;
    public final int b;
    public final int c;

    public t1v(nmo0 nmo0Var, int i, int i2) {
        this.a = nmo0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1v)) {
            return false;
        }
        t1v t1vVar = (t1v) obj;
        return epx.f(this.a, t1vVar.a) && this.b == t1vVar.b && this.c == t1vVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    @Override // xsna.d730
    public final w1v r() {
        w1v w1vVar = new w1v();
        w1vVar.p = this.a;
        w1vVar.q = this.b;
        w1vVar.r = this.c;
        w1vVar.t = -1;
        w1vVar.u = -1;
        return w1vVar;
    }

    @Override // xsna.d730
    public final void s(w1v w1vVar) {
        w1v w1vVar2 = w1vVar;
        nmo0 nmo0Var = w1vVar2.p;
        nmo0 nmo0Var2 = this.a;
        boolean f = epx.f(nmo0Var, nmo0Var2);
        int i = this.b;
        int i2 = this.c;
        if (f && w1vVar2.q == i && w1vVar2.r == i2) {
            return;
        }
        w1vVar2.p = nmo0Var2;
        w1vVar2.q = i;
        w1vVar2.r = i2;
        w1vVar2.v = tmo0.a(nmo0Var2, itl.f(w1vVar2).A);
        w1vVar2.s = true;
        itl.f(w1vVar2).Q();
    }
}
