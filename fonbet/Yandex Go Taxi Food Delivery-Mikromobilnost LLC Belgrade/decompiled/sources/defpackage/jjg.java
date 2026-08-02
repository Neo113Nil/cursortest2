package defpackage;

import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class jjg implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DashboardFragment b;

    public /* synthetic */ jjg(DashboardFragment dashboardFragment, int i) {
        this.a = i;
        this.b = dashboardFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 lastItemScrollListener_delegate$lambda$1$lambda$0;
        zy11 zy11Var;
        gsx lastItemScrollListener_delegate$lambda$1;
        zy11 adapter$lambda$3;
        zy11 showAutotopupTooltip$lambda$53;
        zy11 onViewCreated$lambda$7$lambda$6;
        zy11 onViewCreated$lambda$10;
        zy11 onViewCreated$lambda$11;
        int i = this.a;
        DashboardFragment dashboardFragment = this.b;
        switch (i) {
            case 0:
                lastItemScrollListener_delegate$lambda$1$lambda$0 = DashboardFragment.lastItemScrollListener_delegate$lambda$1$lambda$0(dashboardFragment);
                return lastItemScrollListener_delegate$lambda$1$lambda$0;
            case 1:
                zy11Var = DashboardFragment.setupListeners$lambda$31$lambda$29(dashboardFragment);
                return zy11Var;
            case 2:
                lastItemScrollListener_delegate$lambda$1 = DashboardFragment.lastItemScrollListener_delegate$lambda$1(dashboardFragment);
                return lastItemScrollListener_delegate$lambda$1;
            case 3:
                adapter$lambda$3 = DashboardFragment.adapter$lambda$3(dashboardFragment);
                return adapter$lambda$3;
            case 4:
                showAutotopupTooltip$lambda$53 = DashboardFragment.showAutotopupTooltip$lambda$53(dashboardFragment);
                return showAutotopupTooltip$lambda$53;
            case 5:
                onViewCreated$lambda$7$lambda$6 = DashboardFragment.onViewCreated$lambda$7$lambda$6(dashboardFragment);
                return onViewCreated$lambda$7$lambda$6;
            case 6:
                onViewCreated$lambda$10 = DashboardFragment.onViewCreated$lambda$10(dashboardFragment);
                return onViewCreated$lambda$10;
            default:
                onViewCreated$lambda$11 = DashboardFragment.onViewCreated$lambda$11(dashboardFragment);
                return onViewCreated$lambda$11;
        }
    }
}
