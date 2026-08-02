package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes12.dex */
public final class hw40 extends BaseRootNavigationRouter {
    public final i6r D;
    public c4g E;

    public hw40(i6r i6rVar) {
        this.D = i6rVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.E = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        q911 q911Var = (q911) obj;
        c4g c4gVar = this.E;
        if (c4gVar == null) {
            i6r i6rVar = this.D;
            i6rVar.getClass();
            c4g c4gVar2 = new c4g(i6rVar);
            this.E = c4gVar2;
            c4gVar = c4gVar2;
        }
        A(c4gVar.c(), q911Var, new ou40(this, q911Var, 1));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    }
}
