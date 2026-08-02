package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final class poa0 implements zo31 {
    public final ConstraintLayout a;
    public final PaymentButtonView b;
    public final View c;
    public final View d;
    public final ConstraintLayout e;
    public final ConstraintLayout f;
    public final FrameLayout g;
    public final ImageView h;
    public final TextView i;

    public poa0(ConstraintLayout constraintLayout, PaymentButtonView paymentButtonView, View view, View view2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.a = constraintLayout;
        this.b = paymentButtonView;
        this.c = view;
        this.d = view2;
        this.e = constraintLayout2;
        this.f = constraintLayout3;
        this.g = frameLayout;
        this.h = imageView;
        this.i = textView;
    }

    public static poa0 o(LayoutInflater layoutInflater) {
        View O;
        View O2;
        View inflate = layoutInflater.inflate(rlh0.paymentsdk_activity_bind, (ViewGroup) null, false);
        int i = j9h0.bind_button;
        PaymentButtonView paymentButtonView = (PaymentButtonView) cma1.O(i, inflate);
        if (paymentButtonView != null && (O = cma1.O((i = j9h0.blur_view), inflate)) != null) {
            i = j9h0.challenge_fragment;
            if (((FrameLayout) cma1.O(i, inflate)) != null && (O2 = cma1.O((i = j9h0.close_area), inflate)) != null) {
                i = j9h0.container_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                if (constraintLayout != null) {
                    i = j9h0.content_layout;
                    if (((LinearLayout) cma1.O(i, inflate)) != null) {
                        i = j9h0.exit_fragment_container;
                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                            i = j9h0.fragment_container;
                            if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                i = j9h0.sheet_container;
                                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                if (frameLayout != null) {
                                    i = j9h0.slide_view;
                                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                                    if (imageView != null) {
                                        i = j9h0.textViewDebug;
                                        TextView textView = (TextView) cma1.O(i, inflate);
                                        if (textView != null) {
                                            return new poa0(constraintLayout2, paymentButtonView, O, O2, constraintLayout, constraintLayout2, frameLayout, imageView, textView);
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
