package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class h661 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final OperationProgressView c;
    public final TextView d;
    public final TextView e;
    public final ToolbarView f;

    public h661(ConstraintLayout constraintLayout, YbButtonView ybButtonView, OperationProgressView operationProgressView, TextView textView, TextView textView2, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = operationProgressView;
        this.d = textView;
        this.e = textView2;
        this.f = toolbarView;
    }

    public static h661 o(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_issue, (ViewGroup) null, false);
        int i = sah0.buttonBottom;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = sah0.guideline;
            if (((Guideline) cma1.O(i, inflate)) != null) {
                i = sah0.progress;
                OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                if (operationProgressView != null) {
                    i = sah0.textDescription;
                    TextView textView = (TextView) cma1.O(i, inflate);
                    if (textView != null) {
                        i = sah0.textMessage;
                        TextView textView2 = (TextView) cma1.O(i, inflate);
                        if (textView2 != null) {
                            i = sah0.toolbarView;
                            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                            if (toolbarView != null) {
                                return new h661((ConstraintLayout) inflate, ybButtonView, operationProgressView, textView, textView2, toolbarView);
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
