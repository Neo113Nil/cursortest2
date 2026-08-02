package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ScrollableNestedScrollView;
import com.ybsdk.widgets.common.SelectedItemFormView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class a661 implements zo31 {
    public final ConstraintLayout a;
    public final SelectedItemFormView b;
    public final YbButtonViewGroup c;
    public final YbDivView d;
    public final RecyclerView e;
    public final dna f;
    public final ScrollableNestedScrollView g;
    public final wz51 h;
    public final View i;
    public final AppCompatImageView j;
    public final AppCompatTextView k;
    public final AutoTopupSummaryView l;
    public final AppCompatTextView m;
    public final v161 n;
    public final CommunicationFullScreenView o;
    public final ErrorView p;
    public final ToolbarView q;

    public a661(ConstraintLayout constraintLayout, SelectedItemFormView selectedItemFormView, YbButtonViewGroup ybButtonViewGroup, YbDivView ybDivView, RecyclerView recyclerView, dna dnaVar, ScrollableNestedScrollView scrollableNestedScrollView, wz51 wz51Var, View view, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AutoTopupSummaryView autoTopupSummaryView, AppCompatTextView appCompatTextView2, v161 v161Var, CommunicationFullScreenView communicationFullScreenView, ErrorView errorView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = selectedItemFormView;
        this.c = ybButtonViewGroup;
        this.d = ybDivView;
        this.e = recyclerView;
        this.f = dnaVar;
        this.g = scrollableNestedScrollView;
        this.h = wz51Var;
        this.i = view;
        this.j = appCompatImageView;
        this.k = appCompatTextView;
        this.l = autoTopupSummaryView;
        this.m = appCompatTextView2;
        this.n = v161Var;
        this.o = communicationFullScreenView;
        this.p = errorView;
        this.q = toolbarView;
    }

    public static a661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View O3;
        View O4;
        View O5;
        View O6;
        View inflate = layoutInflater.inflate(xmh0.ybsdk_screen_auto_topup_regular, viewGroup, false);
        int i = pah0.autoTopupPaymentMethod;
        SelectedItemFormView selectedItemFormView = (SelectedItemFormView) cma1.O(i, inflate);
        if (selectedItemFormView != null) {
            i = pah0.autotopupButtonGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
            if (ybButtonViewGroup != null) {
                i = pah0.autotopupDateBarrier;
                if (((Barrier) cma1.O(i, inflate)) != null) {
                    i = pah0.autotopupDivView;
                    YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                    if (ybDivView != null) {
                        i = pah0.autotopupFrequencyList;
                        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                        if (recyclerView != null && (O = cma1.O((i = pah0.autotopupOnce), inflate)) != null) {
                            int i2 = pah0.autotopupAmount;
                            LoadableInput loadableInput = (LoadableInput) cma1.O(i2, O);
                            if (loadableInput != null) {
                                i2 = pah0.autotopupDateArrow;
                                if (((AppCompatImageView) cma1.O(i2, O)) != null && (O2 = cma1.O((i2 = pah0.autotopupDateBackground), O)) != null) {
                                    i2 = pah0.autotopupDateHint;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, O);
                                    if (appCompatTextView != null) {
                                        i2 = pah0.autotopupDateTitle;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, O);
                                        if (appCompatTextView2 != null) {
                                            dna dnaVar = new dna((ConstraintLayout) O, loadableInput, O2, appCompatTextView, appCompatTextView2, 8);
                                            i = pah0.autotopupScrollView;
                                            ScrollableNestedScrollView scrollableNestedScrollView = (ScrollableNestedScrollView) cma1.O(i, inflate);
                                            if (scrollableNestedScrollView != null && (O3 = cma1.O((i = pah0.autotopupSkeletons), inflate)) != null) {
                                                int i3 = pah0.amount;
                                                if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                    i3 = pah0.button;
                                                    if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                        i3 = pah0.date;
                                                        if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                            i3 = pah0.frequency1;
                                                            if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                                i3 = pah0.frequency2;
                                                                if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                                    i3 = pah0.frequency3;
                                                                    if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                                        i3 = pah0.source;
                                                                        if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                                            i3 = pah0.title;
                                                                            if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                                                i3 = pah0.triviaLink;
                                                                                if (((SkeletonView) cma1.O(i3, O3)) != null) {
                                                                                    wz51 wz51Var = new wz51((ShimmerFrameLayout) O3, 17);
                                                                                    i = pah0.autotopupSourceErrorButton;
                                                                                    View O7 = cma1.O(i, inflate);
                                                                                    if (O7 != null) {
                                                                                        i = pah0.autotopupSourceErrorImage;
                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                                                                        if (appCompatImageView != null) {
                                                                                            i = pah0.autotopupSourceErrorText;
                                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i, inflate);
                                                                                            if (appCompatTextView3 != null) {
                                                                                                i = pah0.autotopupSummaryView;
                                                                                                AutoTopupSummaryView autoTopupSummaryView = (AutoTopupSummaryView) cma1.O(i, inflate);
                                                                                                if (autoTopupSummaryView != null) {
                                                                                                    i = pah0.autotopupTriviaLink;
                                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i, inflate);
                                                                                                    if (appCompatTextView4 != null && (O4 = cma1.O((i = pah0.autotopupTwicePerMonth), inflate)) != null) {
                                                                                                        int i4 = pah0.autotopupFirstAmount;
                                                                                                        LoadableInput loadableInput2 = (LoadableInput) cma1.O(i4, O4);
                                                                                                        if (loadableInput2 != null) {
                                                                                                            i4 = pah0.autotopupFirstDateArrow;
                                                                                                            if (((AppCompatImageView) cma1.O(i4, O4)) != null && (O5 = cma1.O((i4 = pah0.autotopupFirstDateBackground), O4)) != null) {
                                                                                                                i4 = pah0.autotopupFirstDateHint;
                                                                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) cma1.O(i4, O4);
                                                                                                                if (appCompatTextView5 != null) {
                                                                                                                    i4 = pah0.autotopupFirstDateTitle;
                                                                                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) cma1.O(i4, O4);
                                                                                                                    if (appCompatTextView6 != null) {
                                                                                                                        i4 = pah0.autotopupSecondAmount;
                                                                                                                        LoadableInput loadableInput3 = (LoadableInput) cma1.O(i4, O4);
                                                                                                                        if (loadableInput3 != null) {
                                                                                                                            i4 = pah0.autotopupSecondDateArrow;
                                                                                                                            if (((AppCompatImageView) cma1.O(i4, O4)) != null && (O6 = cma1.O((i4 = pah0.autotopupSecondDateBackground), O4)) != null) {
                                                                                                                                i4 = pah0.autotopupSecondDateHint;
                                                                                                                                AppCompatTextView appCompatTextView7 = (AppCompatTextView) cma1.O(i4, O4);
                                                                                                                                if (appCompatTextView7 != null) {
                                                                                                                                    i4 = pah0.autotopupSecondDateTitle;
                                                                                                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) cma1.O(i4, O4);
                                                                                                                                    if (appCompatTextView8 != null) {
                                                                                                                                        v161 v161Var = new v161((ConstraintLayout) O4, loadableInput2, O5, appCompatTextView5, appCompatTextView6, loadableInput3, O6, appCompatTextView7, appCompatTextView8);
                                                                                                                                        i = pah0.autotopupWidgetBarrier;
                                                                                                                                        if (((Barrier) cma1.O(i, inflate)) != null) {
                                                                                                                                            i = pah0.communicationFullScreen;
                                                                                                                                            CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
                                                                                                                                            if (communicationFullScreenView != null) {
                                                                                                                                                i = pah0.error;
                                                                                                                                                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                                                                                                                                if (errorView != null) {
                                                                                                                                                    i = pah0.toolbar;
                                                                                                                                                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                                                                                                    if (toolbarView != null) {
                                                                                                                                                        return new a661((ConstraintLayout) inflate, selectedItemFormView, ybButtonViewGroup, ybDivView, recyclerView, dnaVar, scrollableNestedScrollView, wz51Var, O7, appCompatImageView, appCompatTextView3, autoTopupSummaryView, appCompatTextView4, v161Var, communicationFullScreenView, errorView, toolbarView);
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
                                                                                                        ny61.t("Missing required view with ID: ".concat(O4.getResources().getResourceName(i4)));
                                                                                                        return null;
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
                                                ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i3)));
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                            return null;
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
