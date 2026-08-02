package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.soloader.MinElf;
import xsna.q630;
import xsna.v4s;

/* compiled from: TextFieldSize.kt */
/* loaded from: classes11.dex */
public final class sho0 extends q630.c implements nvi, noy {
    public final nmo0 p;
    public mtk0<? extends Object> q;
    public qho0 r;

    public sho0(nmo0 nmo0Var) {
        this.p = nmo0Var;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        nmo0 a = tmo0.a(this.p, itl.f(this).A);
        v4s.a aVar = (v4s.a) ovi.a(this, uvi.k);
        i2(a, aVar);
        LayoutDirection layoutDirection = itl.f(this).A;
        azl azlVar = itl.f(this).z;
        mtk0<? extends Object> mtk0Var = this.q;
        if (mtk0Var == null) {
            throw jq.f("Font resolution state is not set.");
        }
        this.r = new qho0(layoutDirection, azlVar, aVar, a, mtk0Var.getValue());
    }

    @Override // xsna.q630.c
    public final void b2() {
        this.q = null;
        this.r = null;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        long a;
        qho0 qho0Var = this.r;
        if (qho0Var == null) {
            throw jq.f("Min size state is not set.");
        }
        wh50 wh50Var = qho0Var.f;
        mtk0<? extends Object> mtk0Var = this.q;
        if (mtk0Var == null) {
            throw jq.f("Font resolution state is not set.");
        }
        Object value = mtk0Var.getValue();
        if (!epx.f(value, qho0Var.e)) {
            qho0Var.e = value;
            ((zak0) wh50Var).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
            a = sfo0.a(qho0Var.d, qho0Var.b, qho0Var.c, sfo0.a, 1);
            qho0Var.g = a;
            ((zak0) wh50Var).setValue(Boolean.FALSE);
        }
        long j2 = qho0Var.g;
        tra0 N = zo10Var.N(s6j.e(j, s6j.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return ep10Var.Q(N.b, N.c, jgp.b, new pln0(N, 1));
    }

    public final void i2(nmo0 nmo0Var, v4s.a aVar) {
        hik0 hik0Var = nmo0Var.a;
        v4s v4sVar = hik0Var.f;
        b6s b6sVar = hik0Var.c;
        if (b6sVar == null) {
            b6sVar = b6s.h;
        }
        u5s u5sVar = hik0Var.d;
        int i = u5sVar != null ? u5sVar.a : 0;
        v5s v5sVar = hik0Var.e;
        this.q = aVar.a(v4sVar, b6sVar, i, v5sVar != null ? v5sVar.a : MinElf.PN_XNUM);
        itl.f(this).Q();
    }

    @Override // xsna.htl, xsna.cmb0
    public final void q() {
        qho0 qho0Var = this.r;
        if (qho0Var != null) {
            qho0.a(qho0Var, null, itl.f(this).z, null, 29);
        }
        itl.f(this).Q();
    }

    @Override // xsna.htl
    public final void y1() {
        qho0 qho0Var = this.r;
        if (qho0Var != null) {
            qho0.a(qho0Var, itl.f(this).A, null, null, 30);
        }
        itl.f(this).Q();
    }
}
