package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupToggleView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.NoAutoScrollForFocusedView;
import com.ybsdk.widgets.common.SelectedItemFormView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.tabview.TabView;

/* loaded from: classes3.dex */
public final class a061 implements zo31 {
    public final ConstraintLayout a;
    public final LoadableInput b;
    public final LinearLayout c;
    public final AutoTopupToggleView d;
    public final LoadableInput e;
    public final ErrorView f;
    public final LinearLayout g;
    public final NumberKeyboardView h;
    public final SelectedItemFormView i;
    public final YbButtonViewGroup j;
    public final TabView k;
    public final wz51 l;
    public final AutoTopupToggleView m;
    public final LoadableInput n;
    public final ToolbarView o;
    public final CommunicationFullScreenView p;
    public final NoAutoScrollForFocusedView q;

    public a061(ConstraintLayout constraintLayout, LoadableInput loadableInput, LinearLayout linearLayout, AutoTopupToggleView autoTopupToggleView, LoadableInput loadableInput2, ErrorView errorView, LinearLayout linearLayout2, NumberKeyboardView numberKeyboardView, SelectedItemFormView selectedItemFormView, YbButtonViewGroup ybButtonViewGroup, TabView tabView, wz51 wz51Var, AutoTopupToggleView autoTopupToggleView2, LoadableInput loadableInput3, ToolbarView toolbarView, CommunicationFullScreenView communicationFullScreenView, NoAutoScrollForFocusedView noAutoScrollForFocusedView) {
        this.a = constraintLayout;
        this.b = loadableInput;
        this.c = linearLayout;
        this.d = autoTopupToggleView;
        this.e = loadableInput2;
        this.f = errorView;
        this.g = linearLayout2;
        this.h = numberKeyboardView;
        this.i = selectedItemFormView;
        this.j = ybButtonViewGroup;
        this.k = tabView;
        this.l = wz51Var;
        this.m = autoTopupToggleView2;
        this.n = loadableInput3;
        this.o = toolbarView;
        this.p = communicationFullScreenView;
        this.q = noAutoScrollForFocusedView;
    }

    public static a061 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(xmh0.ybsdk_auto_topup_setup, viewGroup, false);
        int i = pah0.autoFundAmountInput;
        LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
        if (loadableInput != null) {
            i = pah0.autoFundHolder;
            LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
            if (linearLayout != null) {
                i = pah0.autoFundSwitch;
                AutoTopupToggleView autoTopupToggleView = (AutoTopupToggleView) cma1.O(i, inflate);
                if (autoTopupToggleView != null) {
                    i = pah0.autoTopupAmountInput;
                    LoadableInput loadableInput2 = (LoadableInput) cma1.O(i, inflate);
                    if (loadableInput2 != null) {
                        i = pah0.autoTopupErrorView;
                        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                        if (errorView != null) {
                            i = pah0.autoTopupHolder;
                            LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                            if (linearLayout2 != null) {
                                i = pah0.autoTopupKeyboard;
                                NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                                if (numberKeyboardView != null) {
                                    i = pah0.autoTopupPaymentMethod;
                                    SelectedItemFormView selectedItemFormView = (SelectedItemFormView) cma1.O(i, inflate);
                                    if (selectedItemFormView != null) {
                                        i = pah0.autoTopupSaveButtons;
                                        YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
                                        if (ybButtonViewGroup != null) {
                                            i = pah0.autoTopupSetupTabView;
                                            TabView tabView = (TabView) cma1.O(i, inflate);
                                            if (tabView != null && (O = cma1.O((i = pah0.autoTopupSkeleton), inflate)) != null) {
                                                wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 2);
                                                i = pah0.autoTopupSwitch;
                                                AutoTopupToggleView autoTopupToggleView2 = (AutoTopupToggleView) cma1.O(i, inflate);
                                                if (autoTopupToggleView2 != null) {
                                                    i = pah0.autoTopupThresholdInput;
                                                    LoadableInput loadableInput3 = (LoadableInput) cma1.O(i, inflate);
                                                    if (loadableInput3 != null) {
                                                        i = pah0.autoTopupToolbar;
                                                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                        if (toolbarView != null) {
                                                            i = pah0.communicationFullScreen;
                                                            CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
                                                            if (communicationFullScreenView != null) {
                                                                i = pah0.nestedScrollView;
                                                                NoAutoScrollForFocusedView noAutoScrollForFocusedView = (NoAutoScrollForFocusedView) cma1.O(i, inflate);
                                                                if (noAutoScrollForFocusedView != null) {
                                                                    return new a061((ConstraintLayout) inflate, loadableInput, linearLayout, autoTopupToggleView, loadableInput2, errorView, linearLayout2, numberKeyboardView, selectedItemFormView, ybButtonViewGroup, tabView, wz51Var, autoTopupToggleView2, loadableInput3, toolbarView, communicationFullScreenView, noAutoScrollForFocusedView);
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
}
