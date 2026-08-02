package defpackage;

import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bt70 implements ft70 {
    public final String a;
    public final OrderType b;

    public bt70(String str, OrderType orderType) {
        this.a = str;
        this.b = orderType;
    }

    public final String a() {
        return this.a;
    }

    public final OrderType b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt70)) {
            return false;
        }
        bt70 bt70Var = (bt70) obj;
        return jl40.l(this.a, bt70Var.a) && this.b == bt70Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Linked(orderId=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
