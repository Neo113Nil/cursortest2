package com.yandex.go.chargers;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dl1;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.s2a;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class a extends BaseRootNavigationRouter {
    public final h3y D;
    public final ru.yandex.taxi.deeplinks.b E;
    public final BaseRootNavigationRouter.a F = new BaseRootNavigationRouter.a(Screen.CHARGERS_DISCOVERY, BaseRootNavigationRouter.Background.MAP, null, 12);

    public a(h3y h3yVar, ru.yandex.taxi.deeplinks.b bVar) {
        this.D = h3yVar;
        this.E = bVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        if (t()) {
            return;
        }
        i();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object obj2 = (s2a) obj;
        tje.N(o(), null, null, new ChargersRootRouterImpl$onLaunch$1(this, null), 3);
        e eVar = (e) this.D.get();
        if (gtq0.u(eVar)) {
            eVar.i();
        }
        A(eVar, obj2, new dl1(10, this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.F;
    }
}
