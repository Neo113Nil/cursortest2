package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class k990 {
    public static boolean a(TaxiOrder taxiOrder, DriveState driveState) {
        return !(taxiOrder.l.D && driveState == DriveState.WAITING) && alb1.g(taxiOrder.h.b, taxiOrder.V().k, taxiOrder.V().u);
    }
}
