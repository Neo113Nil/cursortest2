package defpackage;

import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;

/* loaded from: classes14.dex */
public final class gs70 {
    public static OrderDetailsDriverExperiment a(TaxiOrder taxiOrder) {
        OrderStatusInfo V = taxiOrder.V();
        OrderDetailsDriverExperiment.Companion.getClass();
        OrderDetailsDriverExperiment orderDetailsDriverExperiment = OrderDetailsDriverExperiment.h;
        qn11 b = V.b(OrderDetailsDriverExperiment.class);
        if (b == null) {
            b = orderDetailsDriverExperiment;
        }
        OrderDetailsDriverExperiment orderDetailsDriverExperiment2 = (OrderDetailsDriverExperiment) b;
        return orderDetailsDriverExperiment2.b ? orderDetailsDriverExperiment2 : orderDetailsDriverExperiment;
    }
}
