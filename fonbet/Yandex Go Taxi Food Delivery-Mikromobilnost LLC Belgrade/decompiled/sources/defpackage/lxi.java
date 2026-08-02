package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llxi;", "Lj530;", "Lmxi;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class lxi extends j530 {
    public final p651 a;
    public final tls b;
    public final dy31 c;

    public lxi(p651 p651Var, tls tlsVar, dy31 dy31Var) {
        this.a = p651Var;
        this.b = tlsVar;
        this.c = dy31Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        mxi mxiVar = new mxi();
        mxiVar.c = this.a;
        mxiVar.w = this.c;
        mxiVar.x = w8a1.a;
        return mxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxi)) {
            return false;
        }
        lxi lxiVar = (lxi) obj;
        return jl40.l(this.a, lxiVar.a) && this.c == lxiVar.c;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        mxi mxiVar = (mxi) e530Var;
        p651 p651Var = mxiVar.c;
        p651 p651Var2 = this.a;
        boolean l = jl40.l(p651Var, p651Var2);
        dy31 dy31Var = this.c;
        if (l && dy31Var == mxiVar.w) {
            return;
        }
        mxiVar.c = p651Var2;
        mxiVar.w = dy31Var;
        mxiVar.x = new ako(p651Var2, mxiVar.a);
        qje.P(mxiVar).C();
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }
}
