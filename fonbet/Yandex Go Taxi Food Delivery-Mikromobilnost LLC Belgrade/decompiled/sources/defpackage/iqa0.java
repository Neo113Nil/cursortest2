package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final class iqa0 implements zo31 {
    public final ProgressResultView a;
    public final ImageView b;
    public final PaymentButtonView c;
    public final ImageView d;
    public final ProgressBar e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;

    public iqa0(ProgressResultView progressResultView, ImageView imageView, PaymentButtonView paymentButtonView, ImageView imageView2, ProgressBar progressBar, ImageView imageView3, TextView textView, TextView textView2) {
        this.a = progressResultView;
        this.b = imageView;
        this.c = paymentButtonView;
        this.d = imageView2;
        this.e = progressBar;
        this.f = imageView3;
        this.g = textView;
        this.h = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
