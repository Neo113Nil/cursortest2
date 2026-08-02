package defpackage;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes9.dex */
public final class kay0 {
    public final hit a;
    public final p2y0 b;
    public final u880 c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public pzt0 e;

    public kay0(hit hitVar, p2y0 p2y0Var, u880 u880Var) {
        this.a = hitVar;
        this.b = p2y0Var;
        this.c = u880Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    public final String a() {
        String str;
        Object obj;
        RouteInfo routeInfo;
        TaxiOrder taxiOrder;
        List A = ((e0) this.b).A();
        Iterator it = A.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((TaxiOrder) obj).h.getB() == DriveState.WAITING) {
                break;
            }
        }
        TaxiOrder taxiOrder2 = (TaxiOrder) obj;
        if (taxiOrder2 == null) {
            Iterator it2 = A.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    taxiOrder = 0;
                    break;
                }
                taxiOrder = it2.next();
                if (((TaxiOrder) taxiOrder).h.getB() == DriveState.DRIVING) {
                    break;
                }
            }
            taxiOrder2 = taxiOrder;
        }
        if (taxiOrder2 != null) {
            str = (taxiOrder2.h.getB() != DriveState.DRIVING || (routeInfo = taxiOrder2.V().r) == null) ? this.c.b(taxiOrder2) : this.c.a(routeInfo);
        }
        return str == null ? "" : str;
    }
}
