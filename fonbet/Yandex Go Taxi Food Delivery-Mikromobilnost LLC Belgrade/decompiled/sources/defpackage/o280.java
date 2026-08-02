package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.zone.dto.objects.Notification;
import java.util.Map;
import kotlin.time.DurationUnit;

/* loaded from: classes14.dex */
public final class o280 {
    public final c a;

    public o280(c cVar) {
        this.a = cVar;
    }

    public static a6e0 a(TaxiOrder taxiOrder) {
        xh60 b = taxiOrder.V().P.b("max_waiting_time");
        if (b == null) {
            return null;
        }
        Notification notification = (Notification) b.b;
        String str = taxiOrder.a;
        String x = taxiOrder.x();
        Notification.Type type = notification.a;
        Map map = notification.d;
        String str2 = (String) map.get("title");
        String str3 = (String) map.get("body");
        int i = notification.b;
        o430 o430Var = e3n.b;
        return new a6e0(str, x, type, str2, str3, i, (int) e3n.o(kp50.U((int) taxiOrder.V().N, DurationUnit.SECONDS), DurationUnit.MINUTES));
    }
}
