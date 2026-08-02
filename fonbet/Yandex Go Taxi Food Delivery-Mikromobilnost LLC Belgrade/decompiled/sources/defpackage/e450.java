package defpackage;

import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;

/* loaded from: classes2.dex */
public final class e450 extends jrb1 {
    public final Merchant a;
    public final PaymentToken b;
    public final PaymentMethod c;

    public e450(Merchant merchant, PaymentToken paymentToken, PaymentMethod paymentMethod) {
        this.a = merchant;
        this.b = paymentToken;
        this.c = paymentMethod;
    }
}
