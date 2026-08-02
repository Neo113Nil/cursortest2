package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes12.dex */
public final class ht40 extends BaseRootNavigationRouter {
    public final v0g D;

    public ht40(v0g v0gVar) {
        this.D = v0gVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        E((m950) this.D.get(), (ju40) obj, new j2f(this, 4), hxx.a);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    }
}
