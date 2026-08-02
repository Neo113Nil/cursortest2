package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final class gqa0 implements zo31 {
    public final PaymentButtonView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ProgressBar f;
    public final ImageView g;

    public gqa0(PaymentButtonView paymentButtonView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, ImageView imageView2) {
        this.a = paymentButtonView;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = progressBar;
        this.g = imageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
