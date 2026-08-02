package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cv70 {
    public final TaxiOrder a;
    public final bv70 b;

    public cv70(TaxiOrder taxiOrder, bv70 bv70Var) {
        this.a = taxiOrder;
        this.b = bv70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv70)) {
            return false;
        }
        cv70 cv70Var = (cv70) obj;
        return jl40.l(this.a, cv70Var.a) && this.b.equals(cv70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderWithSnapshot(order=" + this.a + ", snapshot=" + this.b + Extension.C_BRAKE;
    }
}
