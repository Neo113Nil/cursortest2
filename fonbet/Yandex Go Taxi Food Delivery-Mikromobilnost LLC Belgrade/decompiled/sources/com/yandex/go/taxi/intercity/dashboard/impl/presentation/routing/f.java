package com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.aiw;
import defpackage.dcw;
import defpackage.egw;
import defpackage.hfw;
import defpackage.ifw;
import defpackage.iiw;
import defpackage.lcw;
import defpackage.tje;
import defpackage.wui;
import defpackage.ynw;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class f extends BaseRootNavigationRouter implements aiw {
    public final lcw D;
    public final ru.yandex.taxi.deeplinks.b E;
    public final dcw F;
    public final ifw G;
    public final BaseRootNavigationRouter.a H = new BaseRootNavigationRouter.a(Screen.INTERCITY_DASHBOARD, BaseRootNavigationRouter.Background.MAP, null, 12);

    public f(lcw lcwVar, ru.yandex.taxi.deeplinks.b bVar, dcw dcwVar, ifw ifwVar) {
        this.D = lcwVar;
        this.E = bVar;
        this.F = dcwVar;
        this.G = ifwVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        egw egwVar = (egw) obj;
        iiw iiwVar = (iiw) this.D.get();
        hfw hfwVar = new hfw(egwVar.a, egwVar.b, egwVar.d);
        ifw ifwVar = this.G;
        r0 r0Var = ifwVar.a;
        r0Var.getClass();
        r0Var.m(null, hfwVar);
        ynw ynwVar = new ynw(egwVar.c);
        r0 r0Var2 = ifwVar.b;
        r0Var2.getClass();
        r0Var2.m(null, ynwVar);
        z(iiwVar, new wui(this, 11));
        tje.N(o(), null, null, new IntercityDashboardRootRouterImpl$onLaunch$2(this, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.H;
    }
}
