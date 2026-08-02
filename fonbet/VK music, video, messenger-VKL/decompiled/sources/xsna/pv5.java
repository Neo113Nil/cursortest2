package xsna;

/* compiled from: BackdropBlur.kt */
/* loaded from: classes17.dex */
final class pv5 extends d730<qv5> {
    public final rv5 a;
    public final boolean b = true;
    public final long c;

    public pv5(rv5 rv5Var, long j) {
        this.a = rv5Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv5)) {
            return false;
        }
        pv5 pv5Var = (pv5) obj;
        return epx.f(this.a, pv5Var.a) && this.b == pv5Var.b && l5g.d(this.c, pv5Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        int i = l5g.l;
        return Long.hashCode(this.c) + b;
    }

    @Override // xsna.d730
    public final qv5 r() {
        qv5 qv5Var = new qv5();
        qv5Var.p = this.b;
        rv5 rv5Var = this.a;
        qv5Var.q = rv5Var;
        rv5Var.c = this.c;
        return qv5Var;
    }

    @Override // xsna.d730
    public final void s(qv5 qv5Var) {
        qv5 qv5Var2 = qv5Var;
        rv5 rv5Var = this.a;
        qv5Var2.q = rv5Var;
        qv5Var2.p = this.b;
        rv5Var.c = this.c;
        mio.a(qv5Var2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackdropContentElement(state=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return pm0.d(')', this.c, sb);
    }
}
