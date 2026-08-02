package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes12.dex */
public final class d811 extends BaseRootNavigationRouter implements b811 {
    public final xcz D;
    public final s730 E;
    public final yvf0 F;

    public d811(xcz xczVar, s730 s730Var, yvf0 yvf0Var) {
        this.D = xczVar;
        this.E = s730Var;
        this.F = yvf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        w711 w711Var = (w711) obj;
        if (w711Var instanceof t711) {
            A((m950) this.E.get(), new bz30(((t711) w711Var).a), new c811(this, 0));
            return;
        }
        if (w711Var instanceof u711) {
            A((m950) this.D.get(), new k640(((u711) w711Var).a), new c811(this, 1));
        } else {
            if (!(w711Var instanceof v711)) {
                w511.b();
                return;
            }
            String str = ((v711) w711Var).a.b;
            if (str != null) {
                ((a60) ((y50) this.F.get())).c(str, v770.c);
            }
        }
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    }
}
