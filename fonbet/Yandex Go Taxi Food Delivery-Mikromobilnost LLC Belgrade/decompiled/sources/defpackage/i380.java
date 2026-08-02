package defpackage;

import com.yandex.go.taxi.order.promotions.analytics.OrderPickupPointAnalytics$OrderStatus;
import java.util.HashMap;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes14.dex */
public final class i380 {
    public final g8k0 a;
    public String b;
    public OrderPickupPointAnalytics$OrderStatus c;

    public i380(g8k0 g8k0Var) {
        this.a = g8k0Var;
    }

    public final void a(String str, OrderPickupPointAnalytics$OrderStatus orderPickupPointAnalytics$OrderStatus) {
        if (jl40.l(str, this.b) && orderPickupPointAnalytics$OrderStatus == this.c) {
            return;
        }
        String value = orderPickupPointAnalytics$OrderStatus.getValue();
        f8k0 f8k0Var = this.a.a;
        f8k0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put(ACSPConstants.STATUS, value);
        f8k0Var.a.a("Ride.PickupPointPin.Notification.Shown", hashMap, 1, new HashMap());
        this.b = str;
        this.c = orderPickupPointAnalytics$OrderStatus;
    }
}
