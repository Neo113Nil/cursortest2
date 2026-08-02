package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes3.dex */
public final class i061 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final DivSkeletonsView c;
    public final ErrorView d;
    public final LoadableInput e;
    public final NumberKeyboardView f;
    public final ToolbarView g;

    public i061(ConstraintLayout constraintLayout, YbButtonView ybButtonView, DivSkeletonsView divSkeletonsView, ErrorView errorView, LoadableInput loadableInput, NumberKeyboardView numberKeyboardView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = divSkeletonsView;
        this.d = errorView;
        this.e = loadableInput;
        this.f = numberKeyboardView;
        this.g = toolbarView;
    }

    public static i061 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_budget_charges_uin_input, viewGroup, false);
        int i = cch0.budgetChargesSearchButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = cch0.budgetChargesSearchDivSkeletons;
            DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
            if (divSkeletonsView != null) {
                i = cch0.budgetChargesSearchErrorView;
                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                if (errorView != null) {
                    i = cch0.budgetChargesSearchInput;
                    LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
                    if (loadableInput != null) {
                        i = cch0.budgetChargesSearchKeyboard;
                        NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                        if (numberKeyboardView != null) {
                            i = cch0.budgetChargesSearchToolbar;
                            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                            if (toolbarView != null) {
                                return new i061((ConstraintLayout) inflate, ybButtonView, divSkeletonsView, errorView, loadableInput, numberKeyboardView, toolbarView);
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
