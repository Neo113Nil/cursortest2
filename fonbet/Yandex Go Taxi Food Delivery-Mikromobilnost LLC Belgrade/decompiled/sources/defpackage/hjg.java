package defpackage;

import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class hjg implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ r661 b;

    public /* synthetic */ hjg(r661 r661Var, int i) {
        this.a = i;
        this.b = r661Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 render$lambda$43$lambda$39$lambda$38;
        zy11 onViewCreated$lambda$7$lambda$5;
        int i = this.a;
        r661 r661Var = this.b;
        switch (i) {
            case 0:
                render$lambda$43$lambda$39$lambda$38 = DashboardFragment.render$lambda$43$lambda$39$lambda$38(r661Var);
                return render$lambda$43$lambda$39$lambda$38;
            default:
                onViewCreated$lambda$7$lambda$5 = DashboardFragment.onViewCreated$lambda$7$lambda$5(r661Var);
                return onViewCreated$lambda$7$lambda$5;
        }
    }
}
