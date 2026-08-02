package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.SelectedItemFormView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class k561 implements zo31 {
    public final ConstraintLayout a;
    public final LoadableInput b;
    public final YbButtonViewGroup c;
    public final YbDivView d;
    public final ErrorView e;
    public final Group f;
    public final SelectedItemFormView g;
    public final FullscreenStatusView h;
    public final TextView i;
    public final TextView j;

    public k561(ConstraintLayout constraintLayout, LoadableInput loadableInput, YbButtonViewGroup ybButtonViewGroup, YbDivView ybDivView, ErrorView errorView, Group group, SelectedItemFormView selectedItemFormView, FullscreenStatusView fullscreenStatusView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = loadableInput;
        this.c = ybButtonViewGroup;
        this.d = ybDivView;
        this.e = errorView;
        this.f = group;
        this.g = selectedItemFormView;
        this.h = fullscreenStatusView;
        this.i = textView;
        this.j = textView2;
    }

    public static k561 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_savings_fund_fragment, viewGroup, false);
        int i = tbh0.amountInput;
        LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
        if (loadableInput != null) {
            i = tbh0.buttonsGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
            if (ybButtonViewGroup != null) {
                i = tbh0.divView;
                YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                if (ybDivView != null) {
                    i = tbh0.errorView;
                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                    if (errorView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        i = tbh0.openAndBuyGroup;
                        Group group = (Group) cma1.O(i, inflate);
                        if (group != null) {
                            i = tbh0.paymentMethod;
                            SelectedItemFormView selectedItemFormView = (SelectedItemFormView) cma1.O(i, inflate);
                            if (selectedItemFormView != null) {
                                i = tbh0.statusView;
                                FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
                                if (fullscreenStatusView != null) {
                                    i = tbh0.subtitle;
                                    TextView textView = (TextView) cma1.O(i, inflate);
                                    if (textView != null) {
                                        i = tbh0.title;
                                        TextView textView2 = (TextView) cma1.O(i, inflate);
                                        if (textView2 != null) {
                                            i = tbh0.toolbar;
                                            if (((ToolbarView) cma1.O(i, inflate)) != null) {
                                                return new k561(constraintLayout, loadableInput, ybButtonViewGroup, ybDivView, errorView, group, selectedItemFormView, fullscreenStatusView, textView, textView2);
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
