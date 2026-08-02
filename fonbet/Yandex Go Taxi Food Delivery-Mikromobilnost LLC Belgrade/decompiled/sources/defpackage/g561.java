package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.savings.internal.views.SavingsAccountTickerView;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import com.ybsdk.feature.savings.internal.views.SavingsDivCardView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class g561 implements zo31 {
    public final CustomSwipeRefreshLayout a;
    public final View b;
    public final ho4 c;
    public final nzm d;
    public final ho4 e;
    public final ErrorView f;
    public final MotionLayout g;
    public final AppCompatTextView h;
    public final RecyclerView i;
    public final SavingsAccountTickerView j;
    public final AppCompatTextView k;
    public final SpoilerTextView l;
    public final AppCompatTextView m;
    public final AppCompatImageView n;
    public final ShimmerFrameLayout o;
    public final SpoilerFrameLayout p;
    public final AppCompatImageView q;

    public g561(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view, ho4 ho4Var, nzm nzmVar, ho4 ho4Var2, ErrorView errorView, MotionLayout motionLayout, AppCompatTextView appCompatTextView, RecyclerView recyclerView, SavingsAccountTickerView savingsAccountTickerView, AppCompatTextView appCompatTextView2, SpoilerTextView spoilerTextView, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout, SpoilerFrameLayout spoilerFrameLayout, AppCompatImageView appCompatImageView2) {
        this.a = customSwipeRefreshLayout;
        this.b = view;
        this.c = ho4Var;
        this.d = nzmVar;
        this.e = ho4Var2;
        this.f = errorView;
        this.g = motionLayout;
        this.h = appCompatTextView;
        this.i = recyclerView;
        this.j = savingsAccountTickerView;
        this.k = appCompatTextView2;
        this.l = spoilerTextView;
        this.m = appCompatTextView3;
        this.n = appCompatImageView;
        this.o = shimmerFrameLayout;
        this.p = spoilerFrameLayout;
        this.q = appCompatImageView2;
    }

    public static g561 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        View O;
        View inflate = layoutInflater.inflate(doh0.ybsdk_savings_dashboard_fragment_v2, viewGroup, false);
        int i = tbh0.dragAndDropOnboardingBackground;
        View O2 = cma1.O(i, inflate);
        if (O2 != null && (O = cma1.O((i = tbh0.dragAndDropOnboardingCells), inflate)) != null) {
            LinearLayout linearLayout = (LinearLayout) O;
            int i2 = tbh0.savingsCell1;
            SavingsCardView savingsCardView = (SavingsCardView) cma1.O(i2, O);
            if (savingsCardView != null) {
                i2 = tbh0.savingsCell2;
                SavingsCardView savingsCardView2 = (SavingsCardView) cma1.O(i2, O);
                if (savingsCardView2 != null) {
                    ho4 ho4Var = new ho4(linearLayout, savingsCardView, savingsCardView2, 24);
                    i = tbh0.dragAndDropOnboardingDialog;
                    View O3 = cma1.O(i, inflate);
                    if (O3 != null) {
                        int i3 = tbh0.primaryButton;
                        YbButtonView ybButtonView = (YbButtonView) cma1.O(i3, O3);
                        if (ybButtonView == null) {
                            ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i3)));
                            return null;
                        }
                        nzm nzmVar = new nzm(ybButtonView, 14, (LinearLayout) O3);
                        i = tbh0.dragAndDropOnboardingDivCells;
                        View O4 = cma1.O(i, inflate);
                        if (O4 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) O4;
                            int i4 = tbh0.savingsDivCell1;
                            SavingsDivCardView savingsDivCardView = (SavingsDivCardView) cma1.O(i4, O4);
                            if (savingsDivCardView != null) {
                                i4 = tbh0.savingsDivCell2;
                                SavingsDivCardView savingsDivCardView2 = (SavingsDivCardView) cma1.O(i4, O4);
                                if (savingsDivCardView2 != null) {
                                    ho4 ho4Var2 = new ho4(linearLayout2, savingsDivCardView, savingsDivCardView2, 25);
                                    i = tbh0.errorView;
                                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                    if (errorView != null) {
                                        i = tbh0.motionLayout;
                                        MotionLayout motionLayout = (MotionLayout) cma1.O(i, inflate);
                                        if (motionLayout != null) {
                                            i = tbh0.noAccountsTitle;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                            if (appCompatTextView != null) {
                                                i = tbh0.recycler;
                                                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                if (recyclerView != null) {
                                                    i = tbh0.savingsBalanceView;
                                                    SavingsAccountTickerView savingsAccountTickerView = (SavingsAccountTickerView) cma1.O(i, inflate);
                                                    if (savingsAccountTickerView != null) {
                                                        str = "Missing required view with ID: ";
                                                        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) inflate;
                                                        i = tbh0.savingsDescription;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                                                        if (appCompatTextView2 != null) {
                                                            i = tbh0.savingsDescriptionBalance;
                                                            SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i, inflate);
                                                            if (spoilerTextView != null) {
                                                                i = tbh0.savingsTitle;
                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i, inflate);
                                                                if (appCompatTextView3 != null) {
                                                                    i = tbh0.savingsTitleImage;
                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                                                    if (appCompatImageView != null) {
                                                                        i = tbh0.shimmer;
                                                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                                                        if (shimmerFrameLayout != null) {
                                                                            i = tbh0.spoilerSavingsBalanceView;
                                                                            SpoilerFrameLayout spoilerFrameLayout = (SpoilerFrameLayout) cma1.O(i, inflate);
                                                                            if (spoilerFrameLayout != null) {
                                                                                i = tbh0.titleViewsBarrier;
                                                                                if (((Barrier) cma1.O(i, inflate)) != null) {
                                                                                    i = tbh0.toolbarIconSupport;
                                                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                                                                                    if (appCompatImageView2 != null) {
                                                                                        i = tbh0.toolbarIconsContainer;
                                                                                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                                                                            return new g561(customSwipeRefreshLayout, O2, ho4Var, nzmVar, ho4Var2, errorView, motionLayout, appCompatTextView, recyclerView, savingsAccountTickerView, appCompatTextView2, spoilerTextView, appCompatTextView3, appCompatImageView, shimmerFrameLayout, spoilerFrameLayout, appCompatImageView2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ny61.t(str.concat(inflate.getResources().getResourceName(i)));
                                                        return null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ny61.t("Missing required view with ID: ".concat(O4.getResources().getResourceName(i4)));
                            return null;
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            return null;
        }
        str = "Missing required view with ID: ";
        ny61.t(str.concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final CustomSwipeRefreshLayout o() {
        return this.a;
    }
}
