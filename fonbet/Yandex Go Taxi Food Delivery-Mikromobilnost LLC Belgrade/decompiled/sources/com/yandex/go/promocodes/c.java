package com.yandex.go.promocodes;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import defpackage.dqe0;
import defpackage.eqh;
import defpackage.m950;
import defpackage.nni0;
import defpackage.o3h;
import defpackage.qrf0;
import defpackage.ra00;
import defpackage.rrf0;
import defpackage.tje;
import defpackage.y50;
import defpackage.yvf0;

/* loaded from: classes13.dex */
public final class c extends BaseRootNavigationRouter {
    public final y50 D;
    public final dqe0 E;
    public final ra00 F;
    public final yvf0 G;
    public final nni0 H;
    public final o3h I;
    public final eqh J;
    public final BaseRootNavigationRouter.a K = new BaseRootNavigationRouter.a(null, null, BaseRootNavigationRouter.AnimationType.SLIDE, 11);

    public c(y50 y50Var, dqe0 dqe0Var, ra00 ra00Var, yvf0 yvf0Var, nni0 nni0Var, o3h o3hVar, eqh eqhVar) {
        this.D = y50Var;
        this.E = dqe0Var;
        this.F = ra00Var;
        this.G = yvf0Var;
        this.H = nni0Var;
        this.I = o3hVar;
        this.J = eqhVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PromocodesRootRouterImpl$onLaunch$1(this, null), 3);
        A((m950) this.G.get(), (qrf0) obj, new rrf0(this, 0));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.K;
    }
}
