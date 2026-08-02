package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class d661 implements zo31 {
    public final ConstraintLayout a;
    public final LoadableInput b;
    public final YbButtonView c;
    public final YbButtonView d;
    public final AppCompatImageView e;
    public final AppCompatTextView f;
    public final View g;
    public final ErrorView h;
    public final NumberKeyboardView i;
    public final TextView j;
    public final ShimmerFrameLayout k;
    public final ErrorView l;
    public final Group m;
    public final View n;
    public final Group o;
    public final YbButtonView p;
    public final YbButtonView q;
    public final AppCompatTextView r;
    public final View s;
    public final Group t;
    public final ToolbarView u;

    public d661(ConstraintLayout constraintLayout, LoadableInput loadableInput, YbButtonView ybButtonView, YbButtonView ybButtonView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, View view, ErrorView errorView, NumberKeyboardView numberKeyboardView, TextView textView, ShimmerFrameLayout shimmerFrameLayout, ErrorView errorView2, Group group, View view2, Group group2, YbButtonView ybButtonView3, YbButtonView ybButtonView4, AppCompatTextView appCompatTextView2, View view3, Group group3, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = loadableInput;
        this.c = ybButtonView;
        this.d = ybButtonView2;
        this.e = appCompatImageView;
        this.f = appCompatTextView;
        this.g = view;
        this.h = errorView;
        this.i = numberKeyboardView;
        this.j = textView;
        this.k = shimmerFrameLayout;
        this.l = errorView2;
        this.m = group;
        this.n = view2;
        this.o = group2;
        this.p = ybButtonView3;
        this.q = ybButtonView4;
        this.r = appCompatTextView2;
        this.s = view3;
        this.t = group3;
        this.u = toolbarView;
    }

    public static d661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_activation_input_card, viewGroup, false);
        int i = sah0.activationSuccessIcon;
        if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
            i = sah0.activeInput;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
            if (loadableInput != null) {
                i = sah0.buttonBack;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView != null) {
                    i = sah0.buttonContinue;
                    YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i, inflate);
                    if (ybButtonView2 != null) {
                        i = sah0.cardBackground;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                        if (appCompatImageView != null) {
                            i = sah0.cardNumber;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                            if (appCompatTextView != null) {
                                i = sah0.cardSkeleton;
                                if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    i = sah0.cvvGuideline;
                                    View O3 = cma1.O(i, inflate);
                                    if (O3 != null) {
                                        i = sah0.error;
                                        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                        if (errorView != null) {
                                            i = sah0.keyboard;
                                            NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                                            if (numberKeyboardView != null) {
                                                i = sah0.labelCardNumber;
                                                TextView textView = (TextView) cma1.O(i, inflate);
                                                if (textView != null) {
                                                    i = sah0.loadingBackground;
                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                                    if (shimmerFrameLayout != null) {
                                                        i = sah0.pollingError;
                                                        ErrorView errorView2 = (ErrorView) cma1.O(i, inflate);
                                                        if (errorView2 != null) {
                                                            i = sah0.pollingErrorGroup;
                                                            Group group = (Group) cma1.O(i, inflate);
                                                            if (group != null && (O = cma1.O((i = sah0.progressBackground), inflate)) != null) {
                                                                i = sah0.progressBar;
                                                                if (((CircularProgressIndicator) cma1.O(i, inflate)) != null) {
                                                                    i = sah0.progressGroup;
                                                                    Group group2 = (Group) cma1.O(i, inflate);
                                                                    if (group2 != null) {
                                                                        i = sah0.progressSubtitle;
                                                                        if (((TextView) cma1.O(i, inflate)) != null) {
                                                                            i = sah0.progressTitle;
                                                                            if (((TextView) cma1.O(i, inflate)) != null) {
                                                                                i = sah0.setPinButton;
                                                                                YbButtonView ybButtonView3 = (YbButtonView) cma1.O(i, inflate);
                                                                                if (ybButtonView3 != null) {
                                                                                    i = sah0.skipPinButton;
                                                                                    YbButtonView ybButtonView4 = (YbButtonView) cma1.O(i, inflate);
                                                                                    if (ybButtonView4 != null) {
                                                                                        i = sah0.statusText;
                                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                                                                                        if (appCompatTextView2 != null && (O2 = cma1.O((i = sah0.successBackground), inflate)) != null) {
                                                                                            i = sah0.successGroup;
                                                                                            Group group3 = (Group) cma1.O(i, inflate);
                                                                                            if (group3 != null) {
                                                                                                i = sah0.successSubtitle;
                                                                                                if (((TextView) cma1.O(i, inflate)) != null) {
                                                                                                    i = sah0.successTitle;
                                                                                                    if (((TextView) cma1.O(i, inflate)) != null) {
                                                                                                        i = sah0.toolbar;
                                                                                                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                                                        if (toolbarView != null) {
                                                                                                            return new d661(constraintLayout, loadableInput, ybButtonView, ybButtonView2, appCompatImageView, appCompatTextView, O3, errorView, numberKeyboardView, textView, shimmerFrameLayout, errorView2, group, O, group2, ybButtonView3, ybButtonView4, appCompatTextView2, O2, group3, toolbarView);
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
