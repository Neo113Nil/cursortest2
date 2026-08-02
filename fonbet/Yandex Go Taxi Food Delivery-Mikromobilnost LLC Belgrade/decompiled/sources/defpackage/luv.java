package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes6.dex */
public final class luv extends BaseRootNavigationRouter {
    public final gc D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.NONE, BaseRootNavigationRouter.AnimationType.SLIDE, 9);

    public luv(gc gcVar) {
        this.D = gcVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        z((m950) this.D.get(), new dl1(19, this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
