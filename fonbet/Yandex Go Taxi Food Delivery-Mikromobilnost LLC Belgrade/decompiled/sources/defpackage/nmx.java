package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.provider.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.logistics.order.g;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes9.dex */
public final class nmx {
    public final h3y a;
    public final n20 b;
    public final ol9 c;
    public final g d;

    public nmx(h3y h3yVar, n20 n20Var, ol9 ol9Var, g gVar) {
        this.a = h3yVar;
        this.b = n20Var;
        this.c = ol9Var;
        this.d = gVar;
    }

    public final List a() {
        ArrayList b = b();
        if (b == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(tcc.n(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            jmx jmxVar = (jmx) it.next();
            arrayList.add(jmxVar.getService() + ":" + jmxVar.a());
        }
        return arrayList;
    }

    public final ArrayList b() {
        if (!((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).e()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List list = ((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).a().a;
        if (!list.isEmpty()) {
            o2y0 u = ((a) this.b).u();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TaxiOrder b = ((o2y0) it.next()).b();
                String c = b.h.getC();
                boolean l = jl40.l(b.a, (((String) this.d.b.get()) != null || u == null) ? null : u.b().a);
                String str = b.a;
                if (l) {
                    arrayList.add(new uvx0(b.v(), b.m(), b64.j(str, (c == null || c.length() == 0) ? "" : ":".concat(c)), ServiceType.TAXI.getAlias(), b.h.getB().getAnalyticsName(), b.x()));
                } else {
                    arrayList.add(new noc(b64.j(str, (c == null || c.length() == 0) ? "" : ":".concat(c)), ServiceType.TAXI.getAlias()));
                }
            }
        }
        List<ren> list2 = ((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).a().c;
        if (!list2.isEmpty()) {
            for (ren renVar : list2) {
                arrayList.add(new noc(renVar.g(), gwk0.s(renVar.m())));
            }
        }
        Iterator it2 = ((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).a().d.iterator();
        while (it2.hasNext()) {
            arrayList.add(new noc(((fnt) it2.next()).f(), ServiceType.DRIVE.getAlias()));
        }
        for (zuo0 zuo0Var : ((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).a().f) {
            arrayList.add(new noc(zuo0Var.getSessionId(), ServiceType.SCOOTERS.getAlias(), zuo0Var.getNumber().b().k(), zuo0Var.j()));
        }
        List<taa> list3 = ((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).a().g;
        String str2 = (String) this.c.a.getValue();
        String str3 = str2 != null ? str2 : "";
        for (taa taaVar : list3) {
            arrayList.add(new l2a(taaVar.a(), ServiceType.CHARGERS.getAlias(), Boolean.valueOf(jl40.l(taaVar.a(), str3))));
        }
        Iterator it3 = ((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).a().b.iterator();
        while (it3.hasNext()) {
            tly a = ((sly) it3.next()).a();
            if (a != null) {
                arrayList.add(new noc(a.e().a, ServiceType.LINKED.getAlias()));
            }
        }
        List<vhz> list4 = ((com.yandex.go.superapp.order.multi.old.provider.g) this.a.get()).a().e;
        if (!list4.isEmpty()) {
            String str4 = (String) this.d.b.get();
            for (vhz vhzVar : list4) {
                String i = vhzVar.i();
                khz b2 = vhzVar.b();
                if (!jl40.l(i, str4) || b2 == null) {
                    arrayList.add(new noc(i, ServiceType.LOGISTICS.getAlias()));
                } else {
                    arrayList.add(new shz(i, ServiceType.LOGISTICS.getAlias(), b2.a()));
                }
            }
        }
        return arrayList;
    }
}
