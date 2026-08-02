package xsna;

import androidx.compose.ui.state.ToggleableState;

/* compiled from: Toggleable.kt */
/* loaded from: classes11.dex */
final class cqp0 extends d730<dqp0> {
    public final ToggleableState a;
    public final sg50 b;
    public final guw c;
    public final boolean d;
    public final boolean e;
    public final plg0 f;
    public final gzs<s3q0> g;

    public cqp0() {
        throw null;
    }

    public cqp0(ToggleableState toggleableState, sg50 sg50Var, mlg0 mlg0Var, boolean z, boolean z2, plg0 plg0Var, gzs gzsVar) {
        this.a = toggleableState;
        this.b = sg50Var;
        this.c = mlg0Var;
        this.d = z;
        this.e = z2;
        this.f = plg0Var;
        this.g = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cqp0.class != obj.getClass()) {
            return false;
        }
        cqp0 cqp0Var = (cqp0) obj;
        return this.a == cqp0Var.a && epx.f(this.b, cqp0Var.b) && epx.f(this.c, cqp0Var.c) && this.d == cqp0Var.d && this.e == cqp0Var.e && epx.f(this.f, cqp0Var.f) && this.g == cqp0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sg50 sg50Var = this.b;
        int hashCode2 = (hashCode + (sg50Var != null ? sg50Var.hashCode() : 0)) * 31;
        guw guwVar = this.c;
        int b = qoy.b(qoy.b((hashCode2 + (guwVar != null ? guwVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        plg0 plg0Var = this.f;
        return this.g.hashCode() + ((b + (plg0Var != null ? Integer.hashCode(plg0Var.a) : 0)) * 31);
    }

    @Override // xsna.d730
    public final dqp0 r() {
        dqp0 dqp0Var = new dqp0(this.b, this.c, this.d, this.e, null, this.f, this.g);
        dqp0Var.P = this.a;
        return dqp0Var;
    }

    @Override // xsna.d730
    public final void s(dqp0 dqp0Var) {
        dqp0 dqp0Var2 = dqp0Var;
        ToggleableState toggleableState = dqp0Var2.P;
        ToggleableState toggleableState2 = this.a;
        if (toggleableState != toggleableState2) {
            dqp0Var2.P = toggleableState2;
            itl.f(dqp0Var2).R();
        }
        dqp0Var2.x2(this.b, this.c, this.d, this.e, null, this.f, this.g);
    }
}
