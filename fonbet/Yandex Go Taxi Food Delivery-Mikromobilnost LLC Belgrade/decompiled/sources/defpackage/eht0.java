package defpackage;

import android.view.View;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.overdraft.ui.g;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.preorder.address.a;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.HashMap;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.t;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.yaplus.b;

/* loaded from: classes6.dex */
public final class eht0 extends ad5 {
    public final c A;
    public final rjt0 B;
    public final spb0 C;
    public final m2c0 D;
    public final ru.yandex.taxi.preorder.source.data.c E;
    public final b F;
    public final g G;
    public final h3y H;
    public final mqz0 I;
    public final e J;
    public final ght0 K;
    public final wiq0 L;
    public final z3g0 M;
    public final h3y N;
    public final xj0 O;
    public final lcv0 P;
    public final jc00 Q;
    public final pei R;
    public final r S;
    public final rft0 T;
    public final nzb0 U;
    public final a V;
    public final pgu0 W;
    public final xvw Z;
    public final evr a0;
    public final ou7 b0;
    public final u c0;
    public final set0 d0;
    public final h3y e0;
    public final h3y f0;
    public final biv0 g0;
    public final w330 h0;
    public final vvx0 i0;
    public final lgt0 j0;
    public final gax0 k0;
    public final hvd0 l0;
    public final ah00 m0;
    public final uet0 n0;
    public final xit0 o0;
    public final xfv0 p0;
    public final mhf q0;
    public final qy41 r0;
    public final f0l0 s0;
    public final l56 t0;
    public final cc60 u0;
    public final ru.yandex.taxi.analytics.r v0;
    public final oft0 x;
    public final tit0 y;
    public final com.yandex.go.route.interactor.b z;

    public eht0(t tVar, oft0 oft0Var, tit0 tit0Var, com.yandex.go.route.interactor.b bVar, c cVar, rjt0 rjt0Var, spb0 spb0Var, m2c0 m2c0Var, ru.yandex.taxi.preorder.source.data.c cVar2, b bVar2, g gVar, h3y h3yVar, mqz0 mqz0Var, e eVar, ght0 ght0Var, wiq0 wiq0Var, z3g0 z3g0Var, v vVar, h3y h3yVar2, xj0 xj0Var, lcv0 lcv0Var, jc00 jc00Var, pei peiVar, r rVar, rft0 rft0Var, nzb0 nzb0Var, a aVar, pgu0 pgu0Var, xvw xvwVar, evr evrVar, ou7 ou7Var, u uVar, set0 set0Var, h3y h3yVar3, h3y h3yVar4, biv0 biv0Var, w330 w330Var, vvx0 vvx0Var, lgt0 lgt0Var, gax0 gax0Var, hvd0 hvd0Var, ah00 ah00Var, uet0 uet0Var, xit0 xit0Var, xfv0 xfv0Var, mhf mhfVar, qy41 qy41Var, f0l0 f0l0Var, l56 l56Var, cc60 cc60Var, ru.yandex.taxi.analytics.r rVar2) {
        super(mgt0.class);
        this.x = oft0Var;
        this.y = tit0Var;
        this.z = bVar;
        this.A = cVar;
        this.B = rjt0Var;
        this.C = spb0Var;
        this.D = m2c0Var;
        this.E = cVar2;
        this.F = bVar2;
        this.G = gVar;
        this.H = h3yVar;
        this.I = mqz0Var;
        this.J = eVar;
        this.K = ght0Var;
        this.L = wiq0Var;
        this.M = z3g0Var;
        this.N = h3yVar2;
        this.O = xj0Var;
        this.P = lcv0Var;
        this.Q = jc00Var;
        this.R = peiVar;
        this.S = rVar;
        this.T = rft0Var;
        this.U = nzb0Var;
        this.V = aVar;
        this.W = pgu0Var;
        this.Z = xvwVar;
        this.a0 = evrVar;
        this.b0 = ou7Var;
        this.c0 = uVar;
        this.d0 = set0Var;
        this.e0 = h3yVar3;
        this.f0 = h3yVar4;
        this.g0 = biv0Var;
        this.h0 = w330Var;
        this.i0 = vvx0Var;
        this.j0 = lgt0Var;
        this.k0 = gax0Var;
        this.l0 = hvd0Var;
        this.m0 = ah00Var;
        this.n0 = uet0Var;
        this.o0 = xit0Var;
        this.p0 = xfv0Var;
        this.q0 = mhfVar;
        this.r0 = qy41Var;
        this.s0 = f0l0Var;
        this.t0 = l56Var;
        this.u0 = cc60Var;
        this.v0 = rVar2;
        tVar.u = oft0Var.b;
        ftx ftxVar = vVar.c;
        ftxVar.a.l(vVar.a.c());
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        qht0 qht0Var = (qht0) this.T;
        m950 m950Var = qht0Var.a;
        if (m950Var != null) {
            ((h55) m950Var).i();
            qht0Var.a = null;
        }
        this.y.c = null;
        this.G.C = g.E;
        r rVar = this.S;
        rVar.e.pause();
        rVar.x.a = null;
        rVar.e.A.i = null;
        ndt0 ndt0Var = rVar.G;
        if (ndt0Var != null) {
            View a = ((ejt0) rVar.A).a();
            if (a != null) {
                a.removeCallbacks(ndt0Var);
            }
            rVar.G = null;
        }
        rVar.a.d(rVar.B);
    }

    @Override // defpackage.zc5
    public final void Fg() {
        Kg();
    }

    @Override // defpackage.zc5
    public final void Gg() {
        if (((mgt0) Dg()).noModalViews()) {
            jpv0 b = this.g0.b();
            b.getClass();
            if ((b instanceof fpv0) || ((icv0) this.b0.d.get()).a(new SuitabilityCheckType[0]) || !this.o0.a()) {
                return;
            }
            this.n0.a();
        }
    }

    public final void Kg() {
        Address g = this.A.g();
        if (g == null) {
            return;
        }
        mgt0 mgt0Var = (mgt0) Dg();
        if (!mgt0Var.isMapMoving()) {
            if (this.z.h) {
                ((com.yandex.go.preorder.address.e) this.e0.get()).c(new pv0(g, null, null, null, null, null, null, null, 1022), false);
                return;
            }
            return;
        }
        mgt0Var.setMapToPoint(g.B());
        com.yandex.go.route.interactor.b bVar = this.z;
        bVar.h = true;
        n0 n0Var = bVar.f;
        d0l0.Companion.getClass();
        n0Var.g(h5l0.a);
        ((com.yandex.go.preorder.address.e) this.e0.get()).c(new pv0(g, null, null, null, null, null, null, null, 1022), false);
    }

    public final void Lg() {
        if (this.J.a.a().l()) {
            this.c0.d(RouteSelectorOpenReason.PIN);
            rjt0 rjt0Var = this.B;
            rjt0Var.getClass();
            rjt0.b(rjt0Var, "Edit");
        } else {
            jpv0 b = this.g0.b();
            b.getClass();
            if (b instanceof hpv0) {
                this.P.b(null);
                if (!this.R.a(((k) this.L).m())) {
                    this.d0.c(SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY);
                }
            } else if (this.q0.b() == Screen.ROUTE_STOPS_V2) {
                this.v0.b();
            }
        }
        spb0 spb0Var = this.C;
        spb0Var.getClass();
        spb0Var.a.a("pickup_location.tapPin", new HashMap(), 1, new HashMap());
    }
}
