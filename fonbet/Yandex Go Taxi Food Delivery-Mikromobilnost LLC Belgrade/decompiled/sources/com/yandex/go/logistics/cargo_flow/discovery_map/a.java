package com.yandex.go.logistics.cargo_flow.discovery_map;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import defpackage.a3v;
import defpackage.g18;
import defpackage.gh00;
import defpackage.gzx;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.l30;
import defpackage.lbi;
import defpackage.lcw;
import defpackage.lu8;
import defpackage.m950;
import defpackage.ma91;
import defpackage.mu8;
import defpackage.ou8;
import defpackage.po21;
import defpackage.pq00;
import defpackage.qoi0;
import defpackage.qwc;
import defpackage.tje;
import defpackage.w030;
import defpackage.wd7;
import defpackage.yvf0;
import java.util.Locale;
import ru.yandex.taxi.layers.b;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;
import ru.yandex.taxi.layers.experiments.p;
import ru.yandex.taxi.layers.presentation.optimalview.c;

/* loaded from: classes.dex */
public final class a extends BaseRootNavigationRouter implements pq00 {
    public final w030 D;
    public final lu8 E;
    public final a3v F;
    public final h3y G;
    public final h3y H;
    public final h3y I;
    public final po21 J;
    public final qwc K;
    public final h3y L;
    public final p M;
    public final b N;
    public final yvf0 O;
    public final BaseRootNavigationRouter.a P = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    public g18 Q = g18.u1;
    public lcw R;
    public CargoFlowDiscoveryMapModalView S;

    public a(w030 w030Var, lu8 lu8Var, a3v a3vVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, po21 po21Var, qwc qwcVar, h3y h3yVar4, p pVar, b bVar, yvf0 yvf0Var) {
        this.D = w030Var;
        this.E = lu8Var;
        this.F = a3vVar;
        this.G = h3yVar;
        this.H = h3yVar2;
        this.I = h3yVar3;
        this.J = po21Var;
        this.K = qwcVar;
        this.L = h3yVar4;
        this.M = pVar;
        this.N = bVar;
        this.O = yvf0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        lcw lcwVar = this.R;
        c cVar = lcwVar != null ? (c) lcwVar.get() : null;
        if (cVar != null) {
            cVar.Cg();
        }
        this.Q.cancel();
        CargoFlowDiscoveryMapModalView cargoFlowDiscoveryMapModalView = this.S;
        if (cargoFlowDiscoveryMapModalView != null) {
            cargoFlowDiscoveryMapModalView.dismiss();
        }
        ((gzx) this.I.get()).detach();
        this.F.a0(qoi0.a(a.class));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        g18 g18Var;
        mu8 mu8Var = (mu8) obj;
        String a = mu8Var.a();
        String obj2 = Mode.DELIVERY_INTERCITY.toString();
        ScreenModeMapProvidersExperiment.b a2 = this.M.a(a);
        if (a2 != null ? a2.d : false) {
            wd7 wd7Var = (wd7) this.L.get();
            wd7Var.b.put(obj2.toLowerCase(Locale.ROOT), ((gh00) wd7Var.a.a).e.b());
            g18Var = new l30(2, this, obj2);
        } else {
            g18Var = g18.u1;
        }
        this.Q = g18Var;
        tje.N(o(), null, null, new CargoFlowDiscoveryMapRouter$onLaunch$1(this, mu8Var, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.P;
    }

    public final void Q(String str) {
        lbi b = ((mu8) n()).b();
        E((m950) this.O.get(), new lbi(ma91.c(b.b().getIndex()), b.b(), b.a(), b.d(), b.c(), false, str, b.e(), 65), new ou8(this, 0), hxx.a);
    }

    @Override // defpackage.pq00
    public final void a() {
        this.R = null;
    }

    @Override // defpackage.pq00
    public final void d(lcw lcwVar) {
        this.R = lcwVar;
    }
}
