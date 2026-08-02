package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.settings.experiments.SuperAppConfigAppSettingsExperiment;

/* loaded from: classes13.dex */
public final class gdr0 extends BaseRootNavigationRouter {
    public final yvf0 D;
    public final hs50 E;
    public final yvf0 F;
    public final vw2 G;
    public final ji3 H;
    public final b8w I;
    public final ssv0 J;
    public final BaseRootNavigationRouter.a K = new BaseRootNavigationRouter.a(null, null, BaseRootNavigationRouter.AnimationType.SLIDE, 11);

    public gdr0(yvf0 yvf0Var, hs50 hs50Var, yvf0 yvf0Var2, vw2 vw2Var, ji3 ji3Var, b8w b8wVar, ssv0 ssv0Var) {
        this.D = yvf0Var;
        this.E = hs50Var;
        this.F = yvf0Var2;
        this.G = vw2Var;
        this.H = ji3Var;
        this.I = b8wVar;
        this.J = ssv0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        mdr0 mdr0Var = (mdr0) obj;
        if (mdr0Var instanceof idr0) {
            z((m950) this.D.get(), new srn(new b7p0(17, this), 0));
            return;
        }
        if (mdr0Var instanceof ldr0) {
            Q(((ldr0) mdr0Var).a);
            return;
        }
        if (mdr0Var instanceof jdr0) {
            z((m950) this.I.get(), new cdr0(this, 0));
        } else {
            if (!(mdr0Var instanceof kdr0)) {
                w511.b();
                return;
            }
            A((m950) this.H.get(), ((kdr0) mdr0Var).a, new cdr0(this, 1));
        }
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.K;
    }

    public final void Q(String str) {
        int i = fdr0.a[((SuperAppConfigAppSettingsExperiment) this.J.a.c()).b.ordinal()];
        if (i == 1) {
            A((m950) this.F.get(), new hbr0(true ^ this.E.a().a.equals("default")), new edr0(this, str));
        } else if (i == 2) {
            A((m950) this.G.get(), new tw2(str), new cdr0(this, 2));
        } else {
            w511.b();
        }
    }
}
