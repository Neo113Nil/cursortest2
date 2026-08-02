package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes12.dex */
public final class afm extends BaseRootNavigationRouter implements zem {
    public final yvf0 D;
    public final rcm E;
    public final BaseRootNavigationRouter.a F = new BaseRootNavigationRouter.a(Screen.DRIVE_DISCOVERY, BaseRootNavigationRouter.Background.MAP, null, 12);

    public afm(yvf0 yvf0Var, rcm rcmVar) {
        this.D = yvf0Var;
        this.E = rcmVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.E.a = (sdm) obj;
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.E.a = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A((m950) this.D.get(), new jvx((sdm) obj), new wui(this, 2));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.F;
    }
}
