package defpackage;

import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class dmg implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DashboardV3Fragment b;

    public /* synthetic */ dmg(DashboardV3Fragment dashboardV3Fragment, int i) {
        this.a = i;
        this.b = dashboardV3Fragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$19;
        zy11 renderEducationV2$lambda$26$lambda$25$lambda$24;
        zlg analyticsInteractor_delegate$lambda$0;
        qa3 leftToolbarButtonAdapter_delegate$lambda$2;
        qa3 rightToolbarButtonAdapter_delegate$lambda$4;
        e7n widgetsAdapter_delegate$lambda$9;
        zy11 requestFocusOnFirstItem$lambda$32;
        zy11 widgetsAnimator$lambda$22;
        zy11 widgetsAdapter_delegate$lambda$9$lambda$8;
        zy11 onViewCreated$lambda$17$lambda$14;
        zy11 onViewCreated$lambda$17$lambda$15;
        int i = this.a;
        DashboardV3Fragment dashboardV3Fragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$19 = DashboardV3Fragment.onViewCreated$lambda$19(dashboardV3Fragment);
                return onViewCreated$lambda$19;
            case 1:
                renderEducationV2$lambda$26$lambda$25$lambda$24 = DashboardV3Fragment.renderEducationV2$lambda$26$lambda$25$lambda$24(dashboardV3Fragment);
                return renderEducationV2$lambda$26$lambda$25$lambda$24;
            case 2:
                analyticsInteractor_delegate$lambda$0 = DashboardV3Fragment.analyticsInteractor_delegate$lambda$0(dashboardV3Fragment);
                return analyticsInteractor_delegate$lambda$0;
            case 3:
                leftToolbarButtonAdapter_delegate$lambda$2 = DashboardV3Fragment.leftToolbarButtonAdapter_delegate$lambda$2(dashboardV3Fragment);
                return leftToolbarButtonAdapter_delegate$lambda$2;
            case 4:
                rightToolbarButtonAdapter_delegate$lambda$4 = DashboardV3Fragment.rightToolbarButtonAdapter_delegate$lambda$4(dashboardV3Fragment);
                return rightToolbarButtonAdapter_delegate$lambda$4;
            case 5:
                widgetsAdapter_delegate$lambda$9 = DashboardV3Fragment.widgetsAdapter_delegate$lambda$9(dashboardV3Fragment);
                return widgetsAdapter_delegate$lambda$9;
            case 6:
                requestFocusOnFirstItem$lambda$32 = DashboardV3Fragment.requestFocusOnFirstItem$lambda$32(dashboardV3Fragment);
                return requestFocusOnFirstItem$lambda$32;
            case 7:
                widgetsAnimator$lambda$22 = DashboardV3Fragment.setWidgetsAnimator$lambda$22(dashboardV3Fragment);
                return widgetsAnimator$lambda$22;
            case 8:
                DashboardV3Fragment.widgetsAdapter_delegate$lambda$9$lambda$7(dashboardV3Fragment);
                return null;
            case 9:
                widgetsAdapter_delegate$lambda$9$lambda$8 = DashboardV3Fragment.widgetsAdapter_delegate$lambda$9$lambda$8(dashboardV3Fragment);
                return widgetsAdapter_delegate$lambda$9$lambda$8;
            case 10:
                onViewCreated$lambda$17$lambda$14 = DashboardV3Fragment.onViewCreated$lambda$17$lambda$14(dashboardV3Fragment);
                return onViewCreated$lambda$17$lambda$14;
            default:
                onViewCreated$lambda$17$lambda$15 = DashboardV3Fragment.onViewCreated$lambda$17$lambda$15(dashboardV3Fragment);
                return onViewCreated$lambda$17$lambda$15;
        }
    }
}
