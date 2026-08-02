package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.PinCodeDotsView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes3.dex */
public final class p761 implements zo31 {
    public final ConstraintLayout a;
    public final PinCodeDotsView b;
    public final PinCodeDotsView c;
    public final NumberKeyboardView d;
    public final AppCompatTextView e;
    public final ViewSwitcher f;

    public p761(ConstraintLayout constraintLayout, PinCodeDotsView pinCodeDotsView, PinCodeDotsView pinCodeDotsView2, NumberKeyboardView numberKeyboardView, AppCompatTextView appCompatTextView, ViewSwitcher viewSwitcher) {
        this.a = constraintLayout;
        this.b = pinCodeDotsView;
        this.c = pinCodeDotsView2;
        this.d = numberKeyboardView;
        this.e = appCompatTextView;
        this.f = viewSwitcher;
    }

    public static p761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_pin_creation, viewGroup, false);
        int i = sah0.dotsFirst;
        PinCodeDotsView pinCodeDotsView = (PinCodeDotsView) cma1.O(i, inflate);
        if (pinCodeDotsView != null) {
            i = sah0.dotsSecond;
            PinCodeDotsView pinCodeDotsView2 = (PinCodeDotsView) cma1.O(i, inflate);
            if (pinCodeDotsView2 != null) {
                i = sah0.keyboard;
                NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                if (numberKeyboardView != null) {
                    i = sah0.pinHintText;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                    if (appCompatTextView != null) {
                        i = sah0.switcherDots;
                        ViewSwitcher viewSwitcher = (ViewSwitcher) cma1.O(i, inflate);
                        if (viewSwitcher != null) {
                            i = sah0.textSubtitle;
                            if (((TextView) cma1.O(i, inflate)) != null) {
                                i = sah0.toolbar;
                                if (((ToolbarView) cma1.O(i, inflate)) != null) {
                                    return new p761((ConstraintLayout) inflate, pinCodeDotsView, pinCodeDotsView2, numberKeyboardView, appCompatTextView, viewSwitcher);
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
