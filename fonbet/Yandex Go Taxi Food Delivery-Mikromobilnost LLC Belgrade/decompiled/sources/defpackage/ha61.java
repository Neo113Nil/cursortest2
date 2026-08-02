package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TopButtonsListView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardSlideableView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.GuidelinesWidgetView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;

/* loaded from: classes3.dex */
public final class ha61 implements zo31 {
    public final ConstraintLayout a;
    public final CoordinatorLayout b;
    public final BottomBarNavigation c;
    public final TransfersDashboardSlideableView d;
    public final TopButtonsListView e;
    public final FrameLayout f;
    public final GuidelinesWidgetView g;

    public ha61(ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout, BottomBarNavigation bottomBarNavigation, TransfersDashboardSlideableView transfersDashboardSlideableView, TopButtonsListView topButtonsListView, FrameLayout frameLayout, GuidelinesWidgetView guidelinesWidgetView) {
        this.a = constraintLayout;
        this.b = coordinatorLayout;
        this.c = bottomBarNavigation;
        this.d = transfersDashboardSlideableView;
        this.e = topButtonsListView;
        this.f = frameLayout;
        this.g = guidelinesWidgetView;
    }

    public static ha61 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfers_dashboard, viewGroup, false);
        int i = cch0.transfersCoordinator;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) cma1.O(i, inflate);
        if (coordinatorLayout != null) {
            i = cch0.transfersDashboardBottomBar;
            BottomBarNavigation bottomBarNavigation = (BottomBarNavigation) cma1.O(i, inflate);
            if (bottomBarNavigation != null) {
                i = cch0.transfersDashboardBottomSheet;
                TransfersDashboardSlideableView transfersDashboardSlideableView = (TransfersDashboardSlideableView) cma1.O(i, inflate);
                if (transfersDashboardSlideableView != null) {
                    i = cch0.transfersDashboardButtonsContainer;
                    TopButtonsListView topButtonsListView = (TopButtonsListView) cma1.O(i, inflate);
                    if (topButtonsListView != null) {
                        i = cch0.transfersDashboardFragmentsContainer;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                        if (frameLayout != null) {
                            i = cch0.transfersDashboardGuidelinesWidget;
                            GuidelinesWidgetView guidelinesWidgetView = (GuidelinesWidgetView) cma1.O(i, inflate);
                            if (guidelinesWidgetView != null) {
                                return new ha61((ConstraintLayout) inflate, coordinatorLayout, bottomBarNavigation, transfersDashboardSlideableView, topButtonsListView, frameLayout, guidelinesWidgetView);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
