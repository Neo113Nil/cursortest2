package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardCollapsedAnimation$CollapsedState;
import com.ybsdk.feature.divkit.internal.ui.collapsingtoolbar.DivKitCollapsingToolbarLayoutView;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class iig implements ip2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iig(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gp2
    public final void a(AppBarLayout appBarLayout, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                lig ligVar = (lig) obj;
                float totalScrollRange = (appBarLayout.getTotalScrollRange() + i) / appBarLayout.getTotalScrollRange();
                ligVar.b.setAlpha(totalScrollRange > 0.25f ? totalScrollRange : 0.0f);
                DashboardCollapsedAnimation$CollapsedState dashboardCollapsedAnimation$CollapsedState = totalScrollRange == 0.0f ? DashboardCollapsedAnimation$CollapsedState.COLLAPSED : totalScrollRange == 1.0f ? DashboardCollapsedAnimation$CollapsedState.EXPANDED : DashboardCollapsedAnimation$CollapsedState.SCROLL;
                ligVar.g = dashboardCollapsedAnimation$CollapsedState;
                DashboardCollapsedAnimation$CollapsedState dashboardCollapsedAnimation$CollapsedState2 = DashboardCollapsedAnimation$CollapsedState.COLLAPSED;
                if (dashboardCollapsedAnimation$CollapsedState == dashboardCollapsedAnimation$CollapsedState2) {
                    int a = ligVar.a();
                    RecyclerView recyclerView = ligVar.a;
                    int i3 = ligVar.h;
                    if (a >= (-i3) && recyclerView.getScrollState() == 0 && a < 56 && ligVar.g == dashboardCollapsedAnimation$CollapsedState2) {
                        recyclerView.smoothScrollBy(0, i3 - a);
                        break;
                    }
                }
                break;
            case 1:
                DivKitCollapsingToolbarLayoutView.setupOffsetChangeListener$lambda$2((DivKitCollapsingToolbarLayoutView) obj, appBarLayout, i);
                break;
            case 2:
                ((MerchantOffersFragment) obj).onAppBarOffsetChanged(appBarLayout, i);
                break;
            default:
                TransactionsFeedFragment.onViewCreated$lambda$9$lambda$6((g861) obj, appBarLayout, i);
                break;
        }
    }
}
