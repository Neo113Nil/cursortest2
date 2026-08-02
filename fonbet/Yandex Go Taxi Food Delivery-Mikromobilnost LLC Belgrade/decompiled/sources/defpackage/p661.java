package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SignOutButton;
import com.ybsdk.widgets.common.SmsCodeEditText;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes2.dex */
public final class p661 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final SmsCodeEditText c;
    public final YbButtonView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final NumberKeyboardView h;
    public final SignOutButton i;
    public final ShimmerFrameLayout j;
    public final ShimmerFrameLayout k;
    public final FrameLayout l;
    public final TextView m;
    public final TextView n;
    public final ToolbarView o;
    public final ImageView p;
    public final TextView q;

    public p661(ConstraintLayout constraintLayout, ErrorView errorView, SmsCodeEditText smsCodeEditText, YbButtonView ybButtonView, TextView textView, TextView textView2, TextView textView3, NumberKeyboardView numberKeyboardView, SignOutButton signOutButton, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, FrameLayout frameLayout, TextView textView4, TextView textView5, ToolbarView toolbarView, ImageView imageView, TextView textView6) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = smsCodeEditText;
        this.d = ybButtonView;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = numberKeyboardView;
        this.i = signOutButton;
        this.j = shimmerFrameLayout;
        this.k = shimmerFrameLayout2;
        this.l = frameLayout;
        this.m = textView4;
        this.n = textView5;
        this.o = toolbarView;
        this.p = imageView;
        this.q = textView6;
    }

    public static p661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_screen_code_confirmation, viewGroup, false);
        int i = jah0.codeConfirmationErrorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = jah0.codeInput;
            SmsCodeEditText smsCodeEditText = (SmsCodeEditText) cma1.O(i, inflate);
            if (smsCodeEditText != null) {
                i = jah0.errorOptionsButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView != null) {
                    i = jah0.getNewCodeButton;
                    TextView textView = (TextView) cma1.O(i, inflate);
                    if (textView != null) {
                        i = jah0.headerTextView;
                        TextView textView2 = (TextView) cma1.O(i, inflate);
                        if (textView2 != null) {
                            i = jah0.infoMessage;
                            TextView textView3 = (TextView) cma1.O(i, inflate);
                            if (textView3 != null) {
                                i = jah0.keyboard;
                                NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                                if (numberKeyboardView != null) {
                                    i = jah0.pinSignOut;
                                    SignOutButton signOutButton = (SignOutButton) cma1.O(i, inflate);
                                    if (signOutButton != null) {
                                        i = jah0.shimmerLayout;
                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                        if (shimmerFrameLayout != null) {
                                            i = jah0.shimmerLayoutForRetryButton;
                                            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) cma1.O(i, inflate);
                                            if (shimmerFrameLayout2 != null) {
                                                i = jah0.textsContainer;
                                                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                                if (frameLayout != null) {
                                                    i = jah0.timer;
                                                    TextView textView4 = (TextView) cma1.O(i, inflate);
                                                    if (textView4 != null) {
                                                        i = jah0.titleTextView;
                                                        TextView textView5 = (TextView) cma1.O(i, inflate);
                                                        if (textView5 != null) {
                                                            i = jah0.toolbar;
                                                            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                            if (toolbarView != null) {
                                                                i = jah0.toolbar_bottom;
                                                                if (((Guideline) cma1.O(i, inflate)) != null) {
                                                                    i = jah0.ybLogo;
                                                                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                                                                    if (imageView != null) {
                                                                        i = jah0.ybsdk_change_account_link;
                                                                        TextView textView6 = (TextView) cma1.O(i, inflate);
                                                                        if (textView6 != null) {
                                                                            return new p661((ConstraintLayout) inflate, errorView, smsCodeEditText, ybButtonView, textView, textView2, textView3, numberKeyboardView, signOutButton, shimmerFrameLayout, shimmerFrameLayout2, frameLayout, textView4, textView5, toolbarView, imageView, textView6);
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
