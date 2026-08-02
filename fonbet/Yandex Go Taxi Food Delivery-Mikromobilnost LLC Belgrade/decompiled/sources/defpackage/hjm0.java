package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public final class hjm0 implements ljm0 {
    public final PaymentKitError a;
    public final int b;
    public final int c;

    public hjm0(PaymentKitError paymentKitError, int i, int i2) {
        this.a = paymentKitError;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ hjm0(PaymentKitError paymentKitError) {
        this(paymentKitError, ryh0.paymentsdk_sbp_something_went_wrong, ryh0.paymentsdk_sbp_something_went_wrong_description);
    }
}
