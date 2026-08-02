package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes12.dex */
public final class ee50 extends BaseRootNavigationRouter {
    public final yvf0 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(Screen.NAVIGATOR, BaseRootNavigationRouter.Background.BLANK, BaseRootNavigationRouter.AnimationType.STAR_WARS, 8);

    public ee50(rx4 rx4Var) {
        this.D = rx4Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        C((m950) this.D.get(), new de50(this));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
