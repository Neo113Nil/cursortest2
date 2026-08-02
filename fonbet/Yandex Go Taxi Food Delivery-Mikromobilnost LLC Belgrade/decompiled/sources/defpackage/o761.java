package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.feature.pin.internal.screens.checkpin.views.PinActionButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.PinCodeDotsView;
import com.ybsdk.widgets.common.SignOutButton;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes3.dex */
public final class o761 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final AppCompatTextView c;
    public final NumberKeyboardView d;
    public final PinActionButtonView e;
    public final PinCodeDotsView f;
    public final AppCompatTextView g;
    public final SignOutButton h;
    public final Group i;
    public final ToolbarView j;
    public final ImageView k;

    public o761(ConstraintLayout constraintLayout, ErrorView errorView, AppCompatTextView appCompatTextView, NumberKeyboardView numberKeyboardView, PinActionButtonView pinActionButtonView, PinCodeDotsView pinCodeDotsView, AppCompatTextView appCompatTextView2, SignOutButton signOutButton, Group group, ToolbarView toolbarView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = appCompatTextView;
        this.d = numberKeyboardView;
        this.e = pinActionButtonView;
        this.f = pinCodeDotsView;
        this.g = appCompatTextView2;
        this.h = signOutButton;
        this.i = group;
        this.j = toolbarView;
        this.k = imageView;
    }

    public static o761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(xnh0.ybsdk_screen_pin_check, viewGroup, false);
        int i = nbh0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = nbh0.forgetPinText;
            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
            if (appCompatTextView != null) {
                i = nbh0.keyboard;
                NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                if (numberKeyboardView != null) {
                    i = nbh0.pinActionButton;
                    PinActionButtonView pinActionButtonView = (PinActionButtonView) cma1.O(i, inflate);
                    if (pinActionButtonView != null) {
                        i = nbh0.pinCodeDots;
                        PinCodeDotsView pinCodeDotsView = (PinCodeDotsView) cma1.O(i, inflate);
                        if (pinCodeDotsView != null) {
                            i = nbh0.pinHintText;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                            if (appCompatTextView2 != null) {
                                i = nbh0.pinSignOut;
                                SignOutButton signOutButton = (SignOutButton) cma1.O(i, inflate);
                                if (signOutButton != null) {
                                    i = nbh0.pinViews;
                                    Group group = (Group) cma1.O(i, inflate);
                                    if (group != null) {
                                        i = nbh0.toolbar;
                                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                        if (toolbarView != null) {
                                            i = nbh0.toolbar_bottom;
                                            if (((Guideline) cma1.O(i, inflate)) != null) {
                                                i = nbh0.ybLogo;
                                                ImageView imageView = (ImageView) cma1.O(i, inflate);
                                                if (imageView != null) {
                                                    return new o761((ConstraintLayout) inflate, errorView, appCompatTextView, numberKeyboardView, pinActionButtonView, pinCodeDotsView, appCompatTextView2, signOutButton, group, toolbarView, imageView);
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
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
