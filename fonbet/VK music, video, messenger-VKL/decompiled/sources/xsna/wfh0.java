package xsna;

import androidx.compose.foundation.gestures.Orientation;
import xsna.dak0;
import xsna.q630;

/* compiled from: Scroll.kt */
/* loaded from: classes11.dex */
public final class wfh0 extends q630.c implements noy, fgi0 {
    public jgh0 p;
    public boolean q;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        rdi.n(j, this.q ? Orientation.Vertical : Orientation.Horizontal);
        tra0 N = zo10Var.N(o6j.b(0, j, this.q ? o6j.i(j) : Integer.MAX_VALUE, 0, this.q ? Integer.MAX_VALUE : o6j.h(j), 5));
        int i = N.b;
        int i2 = o6j.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = N.c;
        int h = o6j.h(j);
        if (i3 > h) {
            i3 = h;
        }
        int i4 = N.c - i3;
        int i5 = N.b - i;
        if (!this.q) {
            i4 = i5;
        }
        jgh0 jgh0Var = this.p;
        rg50 rg50Var = jgh0Var.e;
        rg50 rg50Var2 = jgh0Var.a;
        ((wak0) rg50Var).C(i4);
        dak0 a = dak0.a.a();
        izs<Object, s3q0> e = a != null ? a.e() : null;
        dak0 b = dak0.a.b(a);
        try {
            if (((wak0) rg50Var2).getIntValue() > i4) {
                ((wak0) rg50Var2).C(i4);
            }
            s3q0 s3q0Var = s3q0.a;
            dak0.a.d(a, b, e);
            ((wak0) this.p.b).C(this.q ? i3 : i);
            ((wak0) this.p.c).C(this.q ? N.c : N.b);
            return ep10Var.Q(i, i3, jgp.b, new vfh0(this, i4, N));
        } catch (Throwable th) {
            dak0.a.d(a, b, e);
            throw th;
        }
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (!this.q) {
            i = Integer.MAX_VALUE;
        }
        return zoxVar.Z(i);
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        qgi0.u(tgi0Var);
        qeh0 qeh0Var = new qeh0(new xsw(this, 27), new fm20(this, 23));
        if (this.q) {
            sgi0<qeh0> sgi0Var = ngi0.w;
            qcy<Object> qcyVar = qgi0.a[13];
            tgi0Var.a(sgi0Var, qeh0Var);
        } else {
            sgi0<qeh0> sgi0Var2 = ngi0.v;
            qcy<Object> qcyVar2 = qgi0.a[12];
            tgi0Var.a(sgi0Var2, qeh0Var);
        }
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (this.q) {
            i = Integer.MAX_VALUE;
        }
        return zoxVar.M(i);
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (!this.q) {
            i = Integer.MAX_VALUE;
        }
        return zoxVar.j0(i);
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (this.q) {
            i = Integer.MAX_VALUE;
        }
        return zoxVar.l0(i);
    }
}
