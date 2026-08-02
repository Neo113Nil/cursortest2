package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.WidgetWithButtonView;
import com.ybsdk.widgets.common.WidgetWithSwitchView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.snackbar.SnackbarView;

/* loaded from: classes3.dex */
public final class ca61 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final WidgetWithButtonView c;
    public final WidgetWithSwitchView d;
    public final OperationProgressView e;
    public final ToolbarView f;
    public final TextView g;
    public final TextView h;
    public final SnackbarView i;
    public final TextView j;
    public final ImageView k;

    public ca61(ConstraintLayout constraintLayout, YbButtonView ybButtonView, WidgetWithButtonView widgetWithButtonView, WidgetWithSwitchView widgetWithSwitchView, OperationProgressView operationProgressView, ToolbarView toolbarView, TextView textView, TextView textView2, SnackbarView snackbarView, TextView textView3, ImageView imageView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = widgetWithButtonView;
        this.d = widgetWithSwitchView;
        this.e = operationProgressView;
        this.f = toolbarView;
        this.g = textView;
        this.h = textView2;
        this.i = snackbarView;
        this.j = textView3;
        this.k = imageView;
    }

    public static ca61 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(moh0.ybsdk_transfer_result, viewGroup, false);
        int i = bch0.actionButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = bch0.autoTopupOfferButton;
            WidgetWithButtonView widgetWithButtonView = (WidgetWithButtonView) cma1.O(i, inflate);
            if (widgetWithButtonView != null) {
                i = bch0.autoTopupOfferSwitch;
                WidgetWithSwitchView widgetWithSwitchView = (WidgetWithSwitchView) cma1.O(i, inflate);
                if (widgetWithSwitchView != null) {
                    i = bch0.progressBar;
                    OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                    if (operationProgressView != null) {
                        i = bch0.toolbar;
                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                        if (toolbarView != null) {
                            i = bch0.transferComment;
                            TextView textView = (TextView) cma1.O(i, inflate);
                            if (textView != null) {
                                i = bch0.transferMessage;
                                TextView textView2 = (TextView) cma1.O(i, inflate);
                                if (textView2 != null) {
                                    i = bch0.transferResultSnackbar;
                                    SnackbarView snackbarView = (SnackbarView) cma1.O(i, inflate);
                                    if (snackbarView != null) {
                                        i = bch0.transferTitle;
                                        TextView textView3 = (TextView) cma1.O(i, inflate);
                                        if (textView3 != null) {
                                            i = bch0.ybIcon;
                                            ImageView imageView = (ImageView) cma1.O(i, inflate);
                                            if (imageView != null) {
                                                return new ca61((ConstraintLayout) inflate, ybButtonView, widgetWithButtonView, widgetWithSwitchView, operationProgressView, toolbarView, textView, textView2, snackbarView, textView3, imageView);
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
