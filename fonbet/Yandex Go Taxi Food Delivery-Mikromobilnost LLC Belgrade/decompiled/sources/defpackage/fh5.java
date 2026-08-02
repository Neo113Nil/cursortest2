package defpackage;

import com.yandex.pay.payment.PaymentData;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class fh5 implements dh5 {
    public final PaymentData a;

    public fh5(PaymentData paymentData) {
        this.a = paymentData;
    }

    @Override // defpackage.dh5
    public final Map a() {
        return gw00.e(new Pair("payment_url", Collections.singletonList(this.a.getPaymentUrl())));
    }
}
