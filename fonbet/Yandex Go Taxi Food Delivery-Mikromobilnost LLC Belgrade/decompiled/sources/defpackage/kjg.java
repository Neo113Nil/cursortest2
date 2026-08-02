package defpackage;

import android.view.View;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class kjg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DashboardFragment b;

    public /* synthetic */ kjg(DashboardFragment dashboardFragment, int i) {
        this.a = i;
        this.b = dashboardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        DashboardFragment dashboardFragment = this.b;
        switch (i) {
            case 0:
                DashboardFragment.setupListeners$lambda$31$lambda$21(dashboardFragment, view);
                break;
            case 1:
                DashboardFragment.setupListeners$lambda$31$lambda$22(dashboardFragment, view);
                break;
            case 2:
                DashboardFragment.bottomSheet$lambda$49$lambda$48$lambda$45(dashboardFragment, view);
                break;
            case 3:
                DashboardFragment.setupListeners$lambda$31$lambda$25(dashboardFragment, view);
                break;
            case 4:
                DashboardFragment.setupListeners$lambda$31$lambda$26(dashboardFragment, view);
                break;
            case 5:
                DashboardFragment.setupListeners$lambda$31$lambda$27(dashboardFragment, view);
                break;
            case 6:
                dashboardFragment.scrollScreenToTop();
                break;
            case 7:
                DashboardFragment.setupListeners$lambda$31$lambda$30(dashboardFragment, view);
                break;
            default:
                DashboardFragment.bottomSheet$lambda$49$lambda$48$lambda$46(dashboardFragment, view);
                break;
        }
    }
}
