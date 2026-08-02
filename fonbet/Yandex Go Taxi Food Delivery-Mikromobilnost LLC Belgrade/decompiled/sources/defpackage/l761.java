package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmExpandedCategoryHeaderView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFiltersView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFunFactView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class l761 implements zo31 {
    public final ConstraintLayout a;
    public final AppBarLayout b;
    public final PfmCategoriesView c;
    public final FrameLayout d;
    public final ErrorView e;
    public final AppBarLayout f;
    public final PfmCategoriesView g;
    public final FrameLayout h;
    public final PfmExpandedCategoryHeaderView i;
    public final RecyclerView j;
    public final PfmFiltersView k;
    public final PfmFunFactView l;
    public final CustomSwipeRefreshLayout m;
    public final BottomBarNavigation n;

    public l761(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, PfmCategoriesView pfmCategoriesView, FrameLayout frameLayout, ErrorView errorView, AppBarLayout appBarLayout2, PfmCategoriesView pfmCategoriesView2, FrameLayout frameLayout2, PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView, RecyclerView recyclerView, PfmFiltersView pfmFiltersView, PfmFunFactView pfmFunFactView, CustomSwipeRefreshLayout customSwipeRefreshLayout, BottomBarNavigation bottomBarNavigation) {
        this.a = constraintLayout;
        this.b = appBarLayout;
        this.c = pfmCategoriesView;
        this.d = frameLayout;
        this.e = errorView;
        this.f = appBarLayout2;
        this.g = pfmCategoriesView2;
        this.h = frameLayout2;
        this.i = pfmExpandedCategoryHeaderView;
        this.j = recyclerView;
        this.k = pfmFiltersView;
        this.l = pfmFunFactView;
        this.m = customSwipeRefreshLayout;
        this.n = bottomBarNavigation;
    }

    public static l761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(unh0.ybsdk_screen_pfm, viewGroup, false);
        int i = lbh0.pfmAppBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i, inflate);
        if (appBarLayout != null) {
            i = lbh0.pfmCategoriesRecyclerView;
            PfmCategoriesView pfmCategoriesView = (PfmCategoriesView) cma1.O(i, inflate);
            if (pfmCategoriesView != null) {
                i = lbh0.pfmCategoriesWrapper;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                if (frameLayout != null) {
                    i = lbh0.pfmContentContainer;
                    if (((CoordinatorLayout) cma1.O(i, inflate)) != null) {
                        i = lbh0.pfmError;
                        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                        if (errorView != null) {
                            i = lbh0.pfmExpandedCategoriesAppBarLayout;
                            AppBarLayout appBarLayout2 = (AppBarLayout) cma1.O(i, inflate);
                            if (appBarLayout2 != null) {
                                i = lbh0.pfmExpandedCategoriesRecyclerView;
                                PfmCategoriesView pfmCategoriesView2 = (PfmCategoriesView) cma1.O(i, inflate);
                                if (pfmCategoriesView2 != null) {
                                    i = lbh0.pfmExpandedCategoriesWrapper;
                                    FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, inflate);
                                    if (frameLayout2 != null) {
                                        i = lbh0.pfmExpandedCategoryHeader;
                                        PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView = (PfmExpandedCategoryHeaderView) cma1.O(i, inflate);
                                        if (pfmExpandedCategoryHeaderView != null) {
                                            i = lbh0.pfmFeedViewItems;
                                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                            if (recyclerView != null) {
                                                i = lbh0.pfmFiltersRecyclerView;
                                                PfmFiltersView pfmFiltersView = (PfmFiltersView) cma1.O(i, inflate);
                                                if (pfmFiltersView != null) {
                                                    i = lbh0.pfmFunFact;
                                                    PfmFunFactView pfmFunFactView = (PfmFunFactView) cma1.O(i, inflate);
                                                    if (pfmFunFactView != null) {
                                                        i = lbh0.pfmSwipeRefresh;
                                                        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i, inflate);
                                                        if (customSwipeRefreshLayout != null) {
                                                            i = lbh0.pfmTransactionsBottomBar;
                                                            BottomBarNavigation bottomBarNavigation = (BottomBarNavigation) cma1.O(i, inflate);
                                                            if (bottomBarNavigation != null) {
                                                                return new l761((ConstraintLayout) inflate, appBarLayout, pfmCategoriesView, frameLayout, errorView, appBarLayout2, pfmCategoriesView2, frameLayout2, pfmExpandedCategoryHeaderView, recyclerView, pfmFiltersView, pfmFunFactView, customSwipeRefreshLayout, bottomBarNavigation);
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
