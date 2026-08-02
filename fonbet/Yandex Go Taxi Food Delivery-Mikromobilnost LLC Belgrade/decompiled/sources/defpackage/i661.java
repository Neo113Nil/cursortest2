package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.snackbar.SnackbarView;
import com.ybsdk.widgets.common.tabview.TabView;

/* loaded from: classes3.dex */
public final class i661 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final TextView c;
    public final ToolbarView d;
    public final wz51 e;
    public final NumberKeyboardView f;
    public final YbButtonView g;
    public final SnackbarView h;
    public final LoadableInput i;
    public final TabView j;

    public i661(ConstraintLayout constraintLayout, ErrorView errorView, TextView textView, ToolbarView toolbarView, wz51 wz51Var, NumberKeyboardView numberKeyboardView, YbButtonView ybButtonView, SnackbarView snackbarView, LoadableInput loadableInput, TabView tabView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = textView;
        this.d = toolbarView;
        this.e = wz51Var;
        this.f = numberKeyboardView;
        this.g = ybButtonView;
        this.h = snackbarView;
        this.i = loadableInput;
        this.j = tabView;
    }

    public static i661 o(LayoutInflater layoutInflater) {
        View O;
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_limit, (ViewGroup) null, false);
        int i = sah0.cardLimitErrorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = sah0.cardLimitHint;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = sah0.card_limit_toolbar;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                if (toolbarView != null && (O = cma1.O((i = sah0.cardLimitsSkeleton), inflate)) != null) {
                    wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 4);
                    i = sah0.keyboard;
                    NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                    if (numberKeyboardView != null) {
                        i = sah0.saveButton;
                        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                        if (ybButtonView != null) {
                            i = sah0.snackbar;
                            SnackbarView snackbarView = (SnackbarView) cma1.O(i, inflate);
                            if (snackbarView != null) {
                                i = sah0.sumInput;
                                LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
                                if (loadableInput != null) {
                                    i = sah0.tabView;
                                    TabView tabView = (TabView) cma1.O(i, inflate);
                                    if (tabView != null) {
                                        return new i661((ConstraintLayout) inflate, errorView, textView, toolbarView, wz51Var, numberKeyboardView, ybButtonView, snackbarView, loadableInput, tabView);
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
