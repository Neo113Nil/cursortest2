package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: DeliveryPointExt.kt */
/* loaded from: classes18.dex */
public final class iwl {
    public static final Coordinates a(DeliveryPoint deliveryPoint) {
        DeliveryPoint.Address address = deliveryPoint.g;
        return new Coordinates(address.c, address.d);
    }

    public static final DeliveryPointId b(DeliveryPoint deliveryPoint) {
        return new DeliveryPointId(deliveryPoint.b, deliveryPoint.c, deliveryPoint.d);
    }
}
