package xsna;

/* compiled from: WindowInsetsSize.kt */
/* loaded from: classes11.dex */
final class b1m extends d730<c1m> {
    public final zpx0 a;
    public final izs<z5x, s3q0> b;
    public final ryt0 c;

    public b1m(zpx0 zpx0Var, izs izsVar) {
        ryt0 ryt0Var = pli.d;
        this.a = zpx0Var;
        this.b = izsVar;
        this.c = ryt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1m)) {
            return false;
        }
        b1m b1mVar = (b1m) obj;
        return epx.f(this.a, b1mVar.a) && this.c == b1mVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final c1m r() {
        c1m c1mVar = new c1m();
        c1mVar.r = this.a;
        c1mVar.s = this.c;
        c1mVar.t = ao8.e;
        return c1mVar;
    }

    @Override // xsna.d730
    public final void s(c1m c1mVar) {
        c1m c1mVar2 = c1mVar;
        zpx0 zpx0Var = c1mVar2.r;
        zpx0 zpx0Var2 = this.a;
        boolean f = epx.f(zpx0Var, zpx0Var2);
        ryt0 ryt0Var = this.c;
        if (f && ryt0Var == c1mVar2.s) {
            return;
        }
        c1mVar2.r = zpx0Var2;
        c1mVar2.s = ryt0Var;
        c1mVar2.t = new r2q(zpx0Var2, c1mVar2.p);
        itl.f(c1mVar2).Q();
    }
}
