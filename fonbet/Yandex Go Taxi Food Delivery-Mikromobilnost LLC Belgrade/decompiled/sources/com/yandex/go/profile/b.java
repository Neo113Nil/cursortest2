package com.yandex.go.profile;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import defpackage.agf0;
import defpackage.ci3;
import defpackage.cxq0;
import defpackage.eja1;
import defpackage.j230;
import defpackage.p8w0;
import defpackage.pef0;
import defpackage.q8w0;
import defpackage.tje;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class b extends BaseRootNavigationRouter implements q8w0 {
    public final cxq0 D;
    public final yvf0 E;
    public final ru.yandex.taxi.deeplinks.b F;
    public final agf0 G;
    public final BaseRootNavigationRouter.a H = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.NONE, BaseRootNavigationRouter.AnimationType.SLIDE, 9);

    public b(cxq0 cxq0Var, ci3 ci3Var, ru.yandex.taxi.deeplinks.b bVar, agf0 agf0Var) {
        this.D = cxq0Var;
        this.E = ci3Var;
        this.F = bVar;
        this.G = agf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        p8w0 p8w0Var = (p8w0) obj;
        this.G.a = p8w0Var.a;
        tje.N(eja1.s(this), null, null, new SuperProfileRootRouterImpl$onLaunch$1(this, null), 3);
        A((pef0) this.E.get(), this.D.C(p8w0Var), new j230(this, 2));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.H;
    }
}
