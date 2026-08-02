package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public abstract class m831 {
    public final String a;
    public final PaymentMethod$Type b;

    public m831(String str, PaymentMethod$Type paymentMethod$Type) {
        this.a = str;
        this.b = paymentMethod$Type;
    }

    public final PaymentMethod$Type a() {
        return this.b;
    }
}
