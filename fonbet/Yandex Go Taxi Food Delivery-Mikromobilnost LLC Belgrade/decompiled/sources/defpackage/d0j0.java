package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes6.dex */
public final class d0j0 implements v1g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;

    public d0j0(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        String str;
        String str2 = (String) map.get("type");
        String str3 = (String) map.get("id");
        String str4 = (String) map.get("notification_group");
        if (!"autoreorder".equals(str2)) {
            return false;
        }
        wnt wntVar = this.a;
        String str5 = (String) map.get("extra");
        KSerializer serializer = i5p.Companion.serializer();
        Object obj = null;
        if (str5 != null && str5.length() != 0) {
            try {
                obj = ((xnt) wntVar).c(str5, serializer);
            } catch (SerializationException e) {
                jst.e.k(e, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str5}, 1)));
            }
        }
        i5p i5pVar = (i5p) obj;
        if (i5pVar != null) {
            String str6 = i5pVar.b;
            if (str6 == null) {
                str6 = "";
            }
            str = str6;
        } else {
            str = "";
        }
        if (str.length() == 0) {
            return false;
        }
        TaxiOrder a = ((ysg) this.b.get()).a(str);
        if (a == null) {
            ((c) this.d.get()).c("GCM.handleOrderData.OrderNotFound");
            a = ((ysg) this.b.get()).a(str);
        }
        TaxiOrder taxiOrder = a;
        String str7 = (String) map.get(FcmNotificationService.KEY_TITLE);
        String str8 = (String) map.get(FcmNotificationService.KEY_BODY);
        if (taxiOrder != null && (taxiOrder.h.b == DriveState.SEARCH || taxiOrder.h.b == DriveState.DRIVING)) {
            synchronized (taxiOrder) {
                taxiOrder.l = taxiOrder.l.K(str4);
            }
            y180 y180Var = (y180) this.c.get();
            String p = taxiOrder.p();
            String str9 = str7 == null ? "" : str7;
            String str10 = str8 == null ? "" : str8;
            q280 q280Var = y180Var.a;
            if (q280Var.c.b()) {
                OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.TAXI_REORDER;
                q280Var.j(new n280(orderNotification$OrderNotificationType.getId() + str.hashCode(), str, p, str9, str10, true, orderNotification$OrderNotificationType, 0L, false, 896), str3);
            }
        }
        return true;
    }
}
