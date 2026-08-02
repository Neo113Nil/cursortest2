package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class dw90 implements gw90 {
    public final TaxiOrder a;

    public dw90(TaxiOrder taxiOrder) {
        this.a = taxiOrder;
    }

    @Override // defpackage.gw90
    public final bw90 a(PaymentMethod$Type paymentMethod$Type) {
        int i = cw90.a[paymentMethod$Type.ordinal()];
        TaxiOrder taxiOrder = this.a;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = taxiOrder.c().contains(paymentMethod$Type);
        } else if (taxiOrder.r() != paymentMethod$Type && !taxiOrder.c().contains(paymentMethod$Type)) {
            z = false;
        }
        return z ? xw91.C : wfz.K;
    }
}
