package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class g861 implements zo31 {
    public final ConstraintLayout a;
    public final AppBarLayout b;
    public final CoordinatorLayout c;
    public final ErrorView d;
    public final RecyclerView e;
    public final YbDivView f;
    public final YbDivView g;
    public final m6v0 h;
    public final DivSkeletonsView i;
    public final DivSkeletonsView j;
    public final LinearLayout k;
    public final m6v0 l;
    public final CustomSwipeRefreshLayout m;
    public final ToolbarView n;
    public final BottomBarNavigation o;

    public g861(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, ErrorView errorView, RecyclerView recyclerView, YbDivView ybDivView, YbDivView ybDivView2, m6v0 m6v0Var, DivSkeletonsView divSkeletonsView, DivSkeletonsView divSkeletonsView2, LinearLayout linearLayout, m6v0 m6v0Var2, CustomSwipeRefreshLayout customSwipeRefreshLayout, ToolbarView toolbarView, BottomBarNavigation bottomBarNavigation) {
        this.a = constraintLayout;
        this.b = appBarLayout;
        this.c = coordinatorLayout;
        this.d = errorView;
        this.e = recyclerView;
        this.f = ybDivView;
        this.g = ybDivView2;
        this.h = m6v0Var;
        this.i = divSkeletonsView;
        this.j = divSkeletonsView2;
        this.k = linearLayout;
        this.l = m6v0Var2;
        this.m = customSwipeRefreshLayout;
        this.n = toolbarView;
        this.o = bottomBarNavigation;
    }

    public static g861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View inflate = layoutInflater.inflate(loh0.ybsdk_screen_transactions_feed, viewGroup, false);
        int i = ach0.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i, inflate);
        if (appBarLayout != null) {
            i = ach0.contentContainer;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) cma1.O(i, inflate);
            if (coordinatorLayout != null) {
                i = ach0.error;
                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                if (errorView != null) {
                    i = ach0.feedViewItems;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = ach0.filtersDivView;
                        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                        if (ybDivView != null) {
                            i = ach0.headerDivView;
                            YbDivView ybDivView2 = (YbDivView) cma1.O(i, inflate);
                            if (ybDivView2 != null && (O = cma1.O((i = ach0.shimmer), inflate)) != null) {
                                m6v0 m6v0Var = new m6v0((LinearLayoutCompat) O, 1);
                                i = ach0.shimmerDivKitFeed;
                                DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
                                if (divSkeletonsView != null) {
                                    i = ach0.shimmerDivKitFeedHeader;
                                    DivSkeletonsView divSkeletonsView2 = (DivSkeletonsView) cma1.O(i, inflate);
                                    if (divSkeletonsView2 != null) {
                                        i = ach0.shimmerDivKitLayout;
                                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                                        if (linearLayout != null && (O2 = cma1.O((i = ach0.shimmerWithoutFilters), inflate)) != null) {
                                            m6v0 m6v0Var2 = new m6v0((LinearLayoutCompat) O2, 2);
                                            i = ach0.swipeRefreshContainer;
                                            CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i, inflate);
                                            if (customSwipeRefreshLayout != null) {
                                                i = ach0.toolbarView;
                                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                if (toolbarView != null) {
                                                    i = ach0.transactionsFeedBottomBar;
                                                    BottomBarNavigation bottomBarNavigation = (BottomBarNavigation) cma1.O(i, inflate);
                                                    if (bottomBarNavigation != null) {
                                                        return new g861((ConstraintLayout) inflate, appBarLayout, coordinatorLayout, errorView, recyclerView, ybDivView, ybDivView2, m6v0Var, divSkeletonsView, divSkeletonsView2, linearLayout, m6v0Var2, customSwipeRefreshLayout, toolbarView, bottomBarNavigation);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
}
