package com.yandex.go.taxi.main;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.cey;
import defpackage.d5y0;
import defpackage.dl1;
import defpackage.h3y;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.lux;
import defpackage.m950;
import defpackage.ofb;
import defpackage.p500;
import defpackage.p630;
import defpackage.qa00;
import defpackage.qse0;
import defpackage.rre0;
import defpackage.tje;
import defpackage.vpe0;
import defpackage.wui;
import defpackage.yvf0;

/* loaded from: classes14.dex */
public final class f extends BaseRootNavigationRouter implements qa00 {
    public final Lifecycle D;
    public final ru.yandex.taxi.am.g E;
    public final com.yandex.go.preload.e F;
    public final com.yandex.go.superapp.order.multi.old.provider.g G;
    public final com.yandex.go.navigation.screen.c H;
    public final yvf0 I;
    public final h3y J;
    public final lux K;
    public final ofb L;
    public final yvf0 M;
    public final BaseRootNavigationRouter.a N = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    public boolean O;

    public f(Lifecycle lifecycle, ru.yandex.taxi.am.g gVar, com.yandex.go.preload.e eVar, com.yandex.go.superapp.order.multi.old.provider.g gVar2, com.yandex.go.navigation.screen.c cVar, yvf0 yvf0Var, h3y h3yVar, lux luxVar, ofb ofbVar, yvf0 yvf0Var2) {
        this.D = lifecycle;
        this.E = gVar;
        this.F = eVar;
        this.G = gVar2;
        this.H = cVar;
        this.I = yvf0Var;
        this.J = h3yVar;
        this.K = luxVar;
        this.L = ofbVar;
        this.M = yvf0Var2;
    }

    public static final void Q(f fVar, qse0 qse0Var, String str) {
        fVar.getClass();
        fVar.R(new hre0(new vpe0(new Preorder(0)), qse0Var, str));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        p630 p630Var = (p630) obj;
        if (this.O) {
            return;
        }
        tje.N(o(), null, null, new MonoAppMainScreenRouterImpl$onAttach$1(p630Var, this, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.O = true;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new MonoAppMainScreenRouterImpl$onLaunch$1(this, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.N;
    }

    public final void R(rre0 rre0Var) {
        Lifecycle lifecycle = this.D;
        if (lifecycle.b().a(Lifecycle.State.STARTED)) {
            E((m950) this.M.get(), rre0Var, new wui(this, 26), hxx.a);
        } else {
            cey.b(lifecycle, Lifecycle.Event.ON_START, new p500(28, this, rre0Var));
        }
    }

    public final void S(d5y0 d5y0Var) {
        E((m950) this.I.get(), d5y0Var, new dl1(22, this), hxx.a);
    }
}
