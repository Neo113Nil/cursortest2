package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.savings.internal.views.SavingsAccountTickerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class h561 implements zo31 {
    public final FrameLayout a;
    public final View b;
    public final View c;
    public final CustomSwipeRefreshLayout d;
    public final AppCompatImageView e;
    public final ErrorView f;
    public final View g;
    public final YbDivView h;
    public final i561 i;
    public final AppCompatTextView j;
    public final AppCompatImageView k;
    public final SpoilerFrameLayout l;
    public final SavingsAccountTickerView m;
    public final MotionLayout n;
    public final RecyclerView o;

    public h561(FrameLayout frameLayout, View view, View view2, CustomSwipeRefreshLayout customSwipeRefreshLayout, AppCompatImageView appCompatImageView, ErrorView errorView, View view3, YbDivView ybDivView, i561 i561Var, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, SpoilerFrameLayout spoilerFrameLayout, SavingsAccountTickerView savingsAccountTickerView, MotionLayout motionLayout, RecyclerView recyclerView) {
        this.a = frameLayout;
        this.b = view;
        this.c = view2;
        this.d = customSwipeRefreshLayout;
        this.e = appCompatImageView;
        this.f = errorView;
        this.g = view3;
        this.h = ybDivView;
        this.i = i561Var;
        this.j = appCompatTextView;
        this.k = appCompatImageView2;
        this.l = spoilerFrameLayout;
        this.m = savingsAccountTickerView;
        this.n = motionLayout;
        this.o = recyclerView;
    }

    public static h561 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View O3;
        View inflate = layoutInflater.inflate(doh0.ybsdk_savings_dashboard_fragment_v4, viewGroup, false);
        int i = tbh0.backgroundGradient;
        View O4 = cma1.O(i, inflate);
        if (O4 != null && (O = cma1.O((i = tbh0.contentShimmer), inflate)) != null) {
            i = tbh0.dashboardContainer;
            CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i, inflate);
            if (customSwipeRefreshLayout != null) {
                i = tbh0.endIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView != null) {
                    i = tbh0.errorView;
                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                    if (errorView != null && (O2 = cma1.O((i = tbh0.headerBackground), inflate)) != null) {
                        i = tbh0.headerBarrier;
                        if (((Barrier) cma1.O(i, inflate)) != null) {
                            i = tbh0.headerDivView;
                            YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                            if (ybDivView != null && (O3 = cma1.O((i = tbh0.headerShimmer), inflate)) != null) {
                                int i2 = tbh0.skeletonsContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i2, O3);
                                if (constraintLayout != null) {
                                    i2 = tbh0.subtitleSkeleton;
                                    if (((SkeletonView) cma1.O(i2, O3)) != null) {
                                        i2 = tbh0.titleSkeleton;
                                        if (((SkeletonView) cma1.O(i2, O3)) != null) {
                                            i2 = tbh0.totalAmountSkeleton;
                                            if (((SkeletonView) cma1.O(i2, O3)) != null) {
                                                i561 i561Var = new i561((ShimmerFrameLayout) O3, constraintLayout);
                                                i = tbh0.headerTitle;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                                if (appCompatTextView != null) {
                                                    i = tbh0.headerTitleImage;
                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                                                    if (appCompatImageView2 != null) {
                                                        i = tbh0.headerTotalAmountSpoiler;
                                                        SpoilerFrameLayout spoilerFrameLayout = (SpoilerFrameLayout) cma1.O(i, inflate);
                                                        if (spoilerFrameLayout != null) {
                                                            i = tbh0.headerTotalAmountView;
                                                            SavingsAccountTickerView savingsAccountTickerView = (SavingsAccountTickerView) cma1.O(i, inflate);
                                                            if (savingsAccountTickerView != null) {
                                                                i = tbh0.motionLayout;
                                                                MotionLayout motionLayout = (MotionLayout) cma1.O(i, inflate);
                                                                if (motionLayout != null) {
                                                                    i = tbh0.recyclerContent;
                                                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                                    if (recyclerView != null) {
                                                                        i = tbh0.toolbarIconsContainer;
                                                                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                                                            return new h561((FrameLayout) inflate, O4, O, customSwipeRefreshLayout, appCompatImageView, errorView, O2, ybDivView, i561Var, appCompatTextView, appCompatImageView2, spoilerFrameLayout, savingsAccountTickerView, motionLayout, recyclerView);
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
                                ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i2)));
                                return null;
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

    public final FrameLayout o() {
        return this.a;
    }
}
