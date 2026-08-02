package defpackage;

import android.app.Activity;
import com.yandex.go.blockeduser.data.c;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes13.dex */
public final class i46 extends BaseRootNavigationRouter implements g46 {
    public final Activity D;
    public final c E;
    public final b46 F;
    public final qc G = new qc(8, this);
    public final BaseRootNavigationRouter.a H = new BaseRootNavigationRouter.a(null, null, null, 15);

    public i46(Activity activity, c cVar, b46 b46Var) {
        this.D = activity;
        this.E = cVar;
        this.F = b46Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G.g();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        z((m950) this.F.get(), new h46(this));
        tje.a0(this.D, this.G);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.H;
    }
}
