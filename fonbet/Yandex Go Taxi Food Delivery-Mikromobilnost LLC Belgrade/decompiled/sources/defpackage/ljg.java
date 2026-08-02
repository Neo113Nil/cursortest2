package defpackage;

import android.view.View;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes13.dex */
public final /* synthetic */ class ljg implements llf, mlf {
    public final /* synthetic */ DashboardFragment a;

    public /* synthetic */ ljg(DashboardFragment dashboardFragment) {
        this.a = dashboardFragment;
    }

    @Override // defpackage.mlf
    public void onRefresh() {
        DashboardFragment.setupListeners$lambda$31$lambda$24(this.a);
    }

    @Override // defpackage.llf
    public boolean q(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        boolean z;
        z = DashboardFragment.setupListeners$lambda$31$lambda$23(this.a, customSwipeRefreshLayout, view);
        return z;
    }
}
