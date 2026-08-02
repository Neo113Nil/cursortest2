package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes12.dex */
public final class ao5 extends BaseRootNavigationRouter {
    public final ln5 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.NONE, null, 13);

    public ao5(ln5 ln5Var) {
        this.D = ln5Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A((m950) this.D.get(), (zn5) obj, new dl1(4, this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
