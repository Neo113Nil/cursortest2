package defpackage;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.promotions.notification.a;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.NotificationItemComponent;

/* loaded from: classes14.dex */
public final class n980 implements sj60 {
    public final /* synthetic */ a a;

    public n980(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.sj60
    public final void a(NotificationItemComponent notificationItemComponent) {
    }

    @Override // defpackage.sj60
    public final void b(NotificationItemComponent notificationItemComponent, boolean z) {
        Object value;
        if (z) {
            o2y0 u = ((com.yandex.go.taxi.order.provider.a) this.a.D).u();
            String str = (u == null || !u.e()) ? null : u.b().a;
            if (str != null) {
                j0g j0gVar = this.a.G;
                String id = notificationItemComponent.getId();
                TaxiOrder i = ((e0) ((p2y0) j0gVar.b)).i(str);
                if (i != null) {
                    synchronized (i) {
                        TaxiOrderLocalData taxiOrderLocalData = i.l;
                        i.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, v4r0.i(taxiOrderLocalData.P, id), null, null, null, null, null, null, false, null, false, null, null, null, -1, 16776703);
                    }
                    ((ysg) j0gVar.a).g(i);
                }
            }
            nw70 nw70Var = this.a.L;
            String id2 = notificationItemComponent.getId();
            exx0 exx0Var = (exx0) nw70Var.b;
            exx0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("id", id2);
            exx0Var.a.a("TaxiOnTheWay.PromoblockNotification.Dismissed", hashMap, 1, new HashMap());
        }
        r0 r0Var = this.a.M;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.a.j0((List) value, notificationItemComponent.getId())));
    }

    @Override // defpackage.sj60
    public final void c(NotificationItemComponent notificationItemComponent) {
        TaxiOrder b;
        String id = notificationItemComponent.getId();
        a aVar = this.a;
        o2y0 u = ((com.yandex.go.taxi.order.provider.a) aVar.D).u();
        if (u == null || (b = u.b()) == null) {
            return;
        }
        aVar.H.a(b.a, id);
        exx0 exx0Var = (exx0) aVar.L.b;
        exx0Var.getClass();
        HashMap hashMap = new HashMap();
        if (id != null) {
            hashMap.put("id", id);
        }
        exx0Var.a.a("TaxiOnTheWay.PromoblockNotification.Shown", hashMap, 1, new HashMap());
    }
}
