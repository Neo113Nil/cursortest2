package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class os70 {
    public final ps70 a;
    public final clk0 b;
    public final h3y c;
    public final jc00 d;

    public os70(ps70 ps70Var, clk0 clk0Var, h3y h3yVar, jc00 jc00Var) {
        this.a = ps70Var;
        this.b = clk0Var;
        this.c = h3yVar;
        this.d = jc00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r4.l.getA() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        if (r3 != ru.yandex.taxi.multiorder.multi.ServiceType.TAXI) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        return new defpackage.ks70();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
    
        if (r3 == ru.yandex.taxi.multiorder.multi.ServiceType.LINKED) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e9, code lost:
    
        if (r3 == ru.yandex.taxi.multiorder.multi.ServiceType.SCOOTERS) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ff, code lost:
    
        if (r3 == ru.yandex.taxi.multiorder.multi.ServiceType.DRIVE) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ns70 a(List list) {
        js70 js70Var = js70.a;
        wl40 a = ((g) this.c.get()).a();
        xs70 xs70Var = (xs70) a.R(list);
        ServiceType serviceType = null;
        if (xs70Var != null) {
            if (xs70Var instanceof ws70) {
                serviceType = ServiceType.TAXI;
            } else if (xs70Var instanceof rs70) {
                serviceType = ServiceType.DRIVE;
            } else if (xs70Var instanceof ts70) {
                serviceType = ServiceType.LINKED;
            } else if (xs70Var instanceof us70) {
                serviceType = ServiceType.LOGISTICS;
            } else if (xs70Var instanceof vs70) {
                serviceType = ServiceType.SCOOTERS;
            } else if (!(xs70Var instanceof ss70)) {
                w511.b();
                return null;
            }
        }
        if (a.a.size() == 1) {
            TaxiOrder b = ((o2y0) a.P(a.a)).b();
            if (b.l.getY()) {
            }
        }
        if (a.j() == 1 && list.size() == 1) {
            clk0 clk0Var = this.b;
            boolean d = clk0Var.d();
            List list2 = a.a;
            if (!d ? !(list2.isEmpty() || !b(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) : !(list2.isEmpty() || !clk0Var.g())) {
            }
            List list3 = a.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (obj instanceof nly) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (b("linked")) {
                }
            }
            if (!a.f.isEmpty()) {
                if (b("scooters")) {
                }
            }
            if (!a.d.isEmpty()) {
                if (b(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                }
            }
        }
        if (list.size() == 1 && xs70Var != null && xs70Var.b()) {
            return new ls70(xs70Var);
        }
        return js70Var;
    }

    public final boolean b(String str) {
        ic00 ic00Var = ((kc00) this.d).a;
        ic00Var.getClass();
        return (ic00Var instanceof hc00) || ((qs70) this.a).a().e.contains(str);
    }
}
