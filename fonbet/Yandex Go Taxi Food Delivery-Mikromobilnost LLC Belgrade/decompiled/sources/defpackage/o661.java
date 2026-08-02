package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final class o661 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final YbButtonView c;
    public final YbButtonView d;
    public final TextView e;
    public final OperationProgressView f;
    public final TextView g;
    public final ToolbarView h;

    public o661(ConstraintLayout constraintLayout, ErrorView errorView, YbButtonView ybButtonView, YbButtonView ybButtonView2, TextView textView, OperationProgressView operationProgressView, TextView textView2, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = ybButtonView;
        this.d = ybButtonView2;
        this.e = textView;
        this.f = operationProgressView;
        this.g = textView2;
        this.h = toolbarView;
    }

    public static o661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_screen_change_phone_status, viewGroup, false);
        int i = jah0.changePhoneErrorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = jah0.changePhoneLogoutButton;
            YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
            if (ybButtonView != null) {
                i = jah0.changePhoneStatusButton;
                YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView2 != null) {
                    i = jah0.changePhoneStatusDescription;
                    TextView textView = (TextView) cma1.O(i, inflate);
                    if (textView != null) {
                        i = jah0.changePhoneStatusIndicator;
                        OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                        if (operationProgressView != null) {
                            i = jah0.changePhoneStatusTitle;
                            TextView textView2 = (TextView) cma1.O(i, inflate);
                            if (textView2 != null) {
                                i = jah0.changePhoneStatusToolbar;
                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                if (toolbarView != null) {
                                    return new o661((ConstraintLayout) inflate, errorView, ybButtonView, ybButtonView2, textView, operationProgressView, textView2, toolbarView);
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
