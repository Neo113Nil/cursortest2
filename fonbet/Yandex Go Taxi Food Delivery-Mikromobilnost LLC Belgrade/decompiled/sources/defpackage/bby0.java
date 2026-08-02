package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class bby0 implements j580 {
    public final h3y a;

    static {
        uay0 uay0Var = vay0.b;
    }

    public bby0(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.j580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        RouteInfo routeInfo = taxiOrder.V().r;
        ((vay0) this.a.get()).a(taxiOrder.a).w4(routeInfo != null ? (long) routeInfo.b : 0L);
        if (z) {
            String str = taxiOrder.a;
            DriveState driveState = taxiOrder.h.b;
            h3y h3yVar = this.a;
            int i = aby0.a[driveState.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                ((vay0) h3yVar.get()).a(str).ng(driveState);
            } else {
                ((vay0) h3yVar.get()).a(str).reset();
            }
        }
    }
}
