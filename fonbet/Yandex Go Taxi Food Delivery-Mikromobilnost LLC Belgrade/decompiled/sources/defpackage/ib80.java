package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.PaymentChange;

/* loaded from: classes12.dex */
public final class ib80 {
    public final TaxiOrder a;
    public final PaymentChange.Reason b;

    public ib80(TaxiOrder taxiOrder, PaymentChange.Reason reason) {
        this.a = taxiOrder;
        this.b = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ib80.class.equals(obj.getClass()) || !(obj instanceof ib80)) {
            return false;
        }
        ib80 ib80Var = (ib80) obj;
        if (jl40.l(this.a, ib80Var.a)) {
            return this.b.equals(ib80Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
