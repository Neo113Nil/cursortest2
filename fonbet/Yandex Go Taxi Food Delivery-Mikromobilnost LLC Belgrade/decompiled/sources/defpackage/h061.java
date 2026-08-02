package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class h061 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final ErrorView c;
    public final ImageView d;
    public final OperationProgressView e;
    public final TextView f;
    public final TextView g;
    public final ToolbarView h;

    public h061(ConstraintLayout constraintLayout, YbButtonView ybButtonView, ErrorView errorView, ImageView imageView, OperationProgressView operationProgressView, TextView textView, TextView textView2, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = errorView;
        this.d = imageView;
        this.e = operationProgressView;
        this.f = textView;
        this.g = textView2;
        this.h = toolbarView;
    }

    public static h061 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_budget_charges_search_status, viewGroup, false);
        int i = cch0.budgetSearchStatusButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = cch0.budgetSearchStatusErrorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = cch0.budgetSearchStatusIcon;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    i = cch0.budgetSearchStatusIndicator;
                    OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                    if (operationProgressView != null) {
                        i = cch0.budgetSearchStatusSubtitle;
                        TextView textView = (TextView) cma1.O(i, inflate);
                        if (textView != null) {
                            i = cch0.budgetSearchStatusTitle;
                            TextView textView2 = (TextView) cma1.O(i, inflate);
                            if (textView2 != null) {
                                i = cch0.budgetSearchStatusToolbar;
                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                if (toolbarView != null) {
                                    return new h061((ConstraintLayout) inflate, ybButtonView, errorView, imageView, operationProgressView, textView, textView2, toolbarView);
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
