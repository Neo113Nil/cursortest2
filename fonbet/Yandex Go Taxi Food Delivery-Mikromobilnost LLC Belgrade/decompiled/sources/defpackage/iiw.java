package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class iiw extends h55 {
    public final tfw D;
    public final rqt E;
    public final mwq F;
    public final h3y G;
    public final ycq0 H;
    public final kpi0 I;
    public final ifw J;
    public sls K;
    public e L;

    public iiw(tfw tfwVar, rqt rqtVar, mwq mwqVar, h3y h3yVar, ycq0 ycq0Var, kpi0 kpi0Var, ifw ifwVar) {
        super(null);
        this.D = tfwVar;
        this.E = rqtVar;
        this.F = mwqVar;
        this.G = h3yVar;
        this.H = ycq0Var;
        this.I = kpi0Var;
        this.J = ifwVar;
    }

    public static final void P(iiw iiwVar) {
        e eVar = iiwVar.L;
        if (eVar != null) {
            iiwVar.j(new epb(eVar));
        }
        iiwVar.L = null;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        sls slsVar = this.K;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.K = null;
        Q();
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.L = null;
    }

    public final void Q() {
        m950 m950Var = this.L;
        if (m950Var == null || !v(m950Var)) {
            kpi0 kpi0Var = this.I;
            kpi0Var.b();
            if (kpi0Var.a().a == null) {
                this.H.b(lv90.f);
            }
            e eVar = (e) this.D.get();
            z(eVar, new giw(this));
            this.L = eVar;
        }
    }

    public final void R(v8b1 v8b1Var) {
        ifw ifwVar = this.J;
        hfw hfwVar = (hfw) ifwVar.a.getValue();
        if (hfwVar != null) {
            hfw hfwVar2 = new hfw(hfwVar.a, v8b1Var, hfwVar.c);
            r0 r0Var = ifwVar.a;
            r0Var.getClass();
            r0Var.m(null, hfwVar2);
        }
    }
}
