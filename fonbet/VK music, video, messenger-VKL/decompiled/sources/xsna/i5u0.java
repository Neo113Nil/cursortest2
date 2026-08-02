package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointDistance;

/* compiled from: VisibleDeliveryPointItem.kt */
/* loaded from: classes18.dex */
public final class i5u0 {
    public final Object a;
    public final DeliveryPointDistance b;

    public i5u0(DeliveryPoint deliveryPoint, DeliveryPointDistance deliveryPointDistance) {
        this.a = deliveryPoint;
        this.b = deliveryPointDistance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5u0)) {
            return false;
        }
        i5u0 i5u0Var = (i5u0) obj;
        return epx.f(this.a, i5u0Var.a) && epx.f(this.b, i5u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (qow.a(this.a) * 31);
    }

    public final String toString() {
        return "VisibleDeliveryPointItem(point=" + ((Object) qow.b(this.a)) + ", distance=" + this.b + ')';
    }
}
