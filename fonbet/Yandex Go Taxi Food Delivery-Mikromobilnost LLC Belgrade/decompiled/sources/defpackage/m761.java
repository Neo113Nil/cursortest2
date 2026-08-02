package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final class m761 implements zo31 {
    public final ConstraintLayout a;
    public final f461 b;
    public final ErrorView c;
    public final ToolbarView d;

    public m761(ConstraintLayout constraintLayout, f461 f461Var, ErrorView errorView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = f461Var;
        this.c = errorView;
        this.d = toolbarView;
    }

    public static m761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View inflate = layoutInflater.inflate(qmh0.ybsdk_screen_phone_confirmation, viewGroup, false);
        int i = jah0.phoneConfirmationContainer;
        View O3 = cma1.O(i, inflate);
        if (O3 != null) {
            int i2 = jah0.agreement;
            TextView textView = (TextView) cma1.O(i2, O3);
            if (textView != null) {
                i2 = jah0.changeNumberButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, O3);
                if (ybButtonView != null) {
                    i2 = jah0.phoneConfirmationButton;
                    YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i2, O3);
                    if (ybButtonView2 != null) {
                        i2 = jah0.phoneContainer;
                        if (((ConstraintLayout) cma1.O(i2, O3)) != null) {
                            i2 = jah0.phoneErrorHint;
                            TextView textView2 = (TextView) cma1.O(i2, O3);
                            if (textView2 != null) {
                                i2 = jah0.phoneHint;
                                TextView textView3 = (TextView) cma1.O(i2, O3);
                                if (textView3 != null && (O = cma1.O((i2 = jah0.phoneHintPlaceholder), O3)) != null) {
                                    i2 = jah0.phoneInput;
                                    EditText editText = (EditText) cma1.O(i2, O3);
                                    if (editText != null && (O2 = cma1.O((i2 = jah0.phonePlaceholder), O3)) != null) {
                                        i2 = jah0.predefinedPhone;
                                        TextView textView4 = (TextView) cma1.O(i2, O3);
                                        if (textView4 != null) {
                                            f461 f461Var = new f461((ConstraintLayout) O3, textView, ybButtonView, ybButtonView2, textView2, textView3, O, editText, O2, textView4);
                                            i = jah0.phoneConfirmationErrorView;
                                            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                            if (errorView != null) {
                                                i = jah0.toolbar;
                                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                if (toolbarView != null) {
                                                    return new m761((ConstraintLayout) inflate, f461Var, errorView, toolbarView);
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
            ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i2)));
            return null;
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
