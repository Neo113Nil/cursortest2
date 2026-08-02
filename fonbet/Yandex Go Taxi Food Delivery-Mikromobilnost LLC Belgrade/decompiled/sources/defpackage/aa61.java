package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.WidgetWithSwitchView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class aa61 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final YbButtonView c;
    public final TextView d;
    public final AppCompatImageView e;
    public final OperationProgressView f;
    public final TextView g;
    public final ToolbarView h;
    public final WidgetWithSwitchView i;

    public aa61(ConstraintLayout constraintLayout, TextView textView, YbButtonView ybButtonView, TextView textView2, AppCompatImageView appCompatImageView, OperationProgressView operationProgressView, TextView textView3, ToolbarView toolbarView, WidgetWithSwitchView widgetWithSwitchView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = ybButtonView;
        this.d = textView2;
        this.e = appCompatImageView;
        this.f = operationProgressView;
        this.g = textView3;
        this.h = toolbarView;
        this.i = widgetWithSwitchView;
    }

    public static aa61 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer_me2me_result, viewGroup, false);
        int i = cch0.me2meDebitResultAmount;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = cch0.me2meDebitResultButton;
            YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
            if (ybButtonView != null) {
                i = cch0.me2meDebitResultDescription;
                TextView textView2 = (TextView) cma1.O(i, inflate);
                if (textView2 != null) {
                    i = cch0.me2meDebitResultImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        i = cch0.me2meDebitResultProgress;
                        OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                        if (operationProgressView != null) {
                            i = cch0.me2meDebitResultTitle;
                            TextView textView3 = (TextView) cma1.O(i, inflate);
                            if (textView3 != null) {
                                i = cch0.me2meDebitResultToolbar;
                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                if (toolbarView != null) {
                                    i = cch0.me2meDebitResultWidget;
                                    WidgetWithSwitchView widgetWithSwitchView = (WidgetWithSwitchView) cma1.O(i, inflate);
                                    if (widgetWithSwitchView != null) {
                                        return new aa61((ConstraintLayout) inflate, textView, ybButtonView, textView2, appCompatImageView, operationProgressView, textView3, toolbarView, widgetWithSwitchView);
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
