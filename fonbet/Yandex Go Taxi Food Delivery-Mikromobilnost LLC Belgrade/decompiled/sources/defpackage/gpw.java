package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes14.dex */
public final class gpw extends BaseRootNavigationRouter {
    public final udw D;
    public final zjw E;
    public final c2x0 F;
    public final BaseRootNavigationRouter.a G = new BaseRootNavigationRouter.a(Screen.INTERCITY_DASHBOARD, BaseRootNavigationRouter.Background.BLANK, null, 12);
    public final olw H;

    public gpw(w030 w030Var, udw udwVar, zjw zjwVar, c2x0 c2x0Var) {
        this.D = udwVar;
        this.E = zjwVar;
        this.F = c2x0Var;
        this.H = new olw(w030Var);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        ((d2x0) this.F).a(0, qoi0.a(gpw.class), false);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        ((d2x0) this.F).b(qoi0.a(gpw.class));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        olw olwVar = this.H;
        g18 g18Var = olwVar.c;
        if (g18Var != null) {
            g18Var.cancel();
        }
        olwVar.c = null;
        olwVar.b.clear();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        olw olwVar = this.H;
        olwVar.c = olwVar.a.g(new nlw(0, olwVar));
        A(this.D.a(new ofw(this, 1), olwVar, new k6x(), new dir()), new vdw(((vdw) obj).a, null), new wui(this, 15));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.G;
    }
}
