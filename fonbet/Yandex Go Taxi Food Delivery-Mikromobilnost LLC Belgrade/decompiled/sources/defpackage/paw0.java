package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes13.dex */
public final class paw0 extends BaseRootNavigationRouter {
    public final m5v0 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.NONE, null, 13);

    public paw0(m5v0 m5v0Var) {
        this.D = m5v0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A((m950) this.D.get(), (oaw0) obj, new p4g0(this, 16));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
