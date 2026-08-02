package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes14.dex */
public final class l5i extends BaseRootNavigationRouter implements k5i {
    public final yvf0 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.BLANK, null, 13);

    public l5i(yvf0 yvf0Var) {
        this.D = yvf0Var;
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
        A((m950) this.D.get(), (p4i) obj, new dl1(16, this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
