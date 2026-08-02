package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.net.xiva.WebSocketTrackingExperiment;

/* loaded from: classes8.dex */
public final class dw41 {
    public static WebSocketTrackingExperiment a(TaxiOrder taxiOrder) {
        OrderStatusInfo V = taxiOrder.V();
        WebSocketTrackingExperiment.Companion.getClass();
        V.getClass();
        qn11 b = V.b(WebSocketTrackingExperiment.class);
        if (b == null) {
            b = WebSocketTrackingExperiment.f;
        }
        return (WebSocketTrackingExperiment) b;
    }
}
