package defpackage;

import com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$External$PreferredTrackingType;
import com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$Taxi;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService;
import com.yandex.go.superapp.order_tracking.common.experiments.f;
import com.yandex.go.superapp.order_tracking.common.experiments.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class a6w0 implements y5w0 {
    public final t1b0 a;
    public final cwq0 b = new cwq0();

    public a6w0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(SuperAppOrderTrackingExperiment.e);
    }

    public final r980 a(h1p h1pVar) {
        Object obj;
        ArrayList b = b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof r980) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (jl40.l(((r980) obj).b(), h1pVar)) {
                break;
            }
        }
        r980 r980Var = (r980) obj;
        return r980Var == null ? new r980(h1pVar) : r980Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$Taxi] */
    public final ArrayList b() {
        OrderTrackingService$External$PreferredTrackingType orderTrackingService$External$PreferredTrackingType;
        OrderTrackingService$Taxi.PreferredTrackingType preferredTrackingType;
        List<g> list = ((SuperAppOrderTrackingExperiment) this.a.c()).c;
        ArrayList arrayList = new ArrayList();
        for (g gVar : list) {
            r980 r980Var = null;
            if (gVar instanceof SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService) {
                int i = z5w0.a[((SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService) gVar).a.ordinal()];
                if (i == 1) {
                    preferredTrackingType = OrderTrackingService$Taxi.PreferredTrackingType.DETAILS;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    preferredTrackingType = OrderTrackingService$Taxi.PreferredTrackingType.FEED;
                }
                r980Var = new OrderTrackingService$Taxi(preferredTrackingType);
            } else if (gVar instanceof SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService) {
                SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService superAppOrderTrackingExperiment$OrderService$ExternalOrderService = (SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService) gVar;
                String str = superAppOrderTrackingExperiment$OrderService$ExternalOrderService.a;
                if (!evu0.J(str)) {
                    this.b.getClass();
                    h1p a = cwq0.a(str);
                    int i2 = z5w0.b[superAppOrderTrackingExperiment$OrderService$ExternalOrderService.b.ordinal()];
                    if (i2 == 1) {
                        orderTrackingService$External$PreferredTrackingType = OrderTrackingService$External$PreferredTrackingType.FEED;
                    } else if (i2 == 2) {
                        orderTrackingService$External$PreferredTrackingType = OrderTrackingService$External$PreferredTrackingType.BLANK;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        orderTrackingService$External$PreferredTrackingType = OrderTrackingService$External$PreferredTrackingType.WEB;
                    }
                    r980Var = new r980(a, orderTrackingService$External$PreferredTrackingType);
                }
            } else if (!jl40.l(gVar, f.INSTANCE)) {
                w511.b();
                return null;
            }
            if (r980Var != null) {
                arrayList.add(r980Var);
            }
        }
        return arrayList;
    }

    public final OrderTrackingService$Taxi c() {
        ArrayList b = b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof OrderTrackingService$Taxi) {
                arrayList.add(next);
            }
        }
        OrderTrackingService$Taxi orderTrackingService$Taxi = (OrderTrackingService$Taxi) a.R(arrayList);
        return orderTrackingService$Taxi == null ? new OrderTrackingService$Taxi(0) : orderTrackingService$Taxi;
    }
}
