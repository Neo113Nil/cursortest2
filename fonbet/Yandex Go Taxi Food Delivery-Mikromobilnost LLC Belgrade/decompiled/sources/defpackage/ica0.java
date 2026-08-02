package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes13.dex */
public final class ica0 extends BaseRootNavigationRouter {
    public final e5d0 D;
    public final c8w E;
    public final BaseRootNavigationRouter.a F = new BaseRootNavigationRouter.a(null, null, BaseRootNavigationRouter.AnimationType.SLIDE, 11);

    public ica0(yvf0 yvf0Var, e5d0 e5d0Var, c8w c8wVar) {
        this.D = e5d0Var;
        this.E = c8wVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        rm10 rm10Var = (rm10) obj;
        rm10Var.getClass();
        A((m950) this.E.get(), new h9a0(false, null, this.D.a(), rm10Var.a, null, null, 32), new j2f(this, 5));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.F;
    }
}
