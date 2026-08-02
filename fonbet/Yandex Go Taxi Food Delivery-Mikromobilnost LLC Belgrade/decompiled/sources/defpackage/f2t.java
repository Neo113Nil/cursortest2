package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class f2t implements e2t {
    public final j2t a;
    public final r0 b;
    public final r0 c;
    public final s8x d;
    public final LinkedHashMap e;
    public final r0 f;
    public final gci0 g;
    public final mth h;

    public f2t(j2t j2tVar) {
        this.a = j2tVar;
        r0 c = bvf0.c(null);
        this.b = c;
        this.c = bvf0.c(null);
        this.d = a.a();
        this.e = new LinkedHashMap();
        r0 c2 = bvf0.c(b2t.a);
        this.f = c2;
        this.g = e.d(c2);
        this.h = new mth(c, 6);
    }

    public final g2t a() {
        return (g2t) this.b.getValue();
    }

    public final void b(g2t g2tVar) {
        z7l0 z7l0Var = g2tVar.b.d;
        if (z7l0Var == RoutePointType.POINT_A) {
            this.a.b(g2tVar);
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(g2tVar);
            }
            r0 r0Var = this.b;
            r0Var.getClass();
            r0Var.m(null, g2tVar);
            r0 r0Var2 = this.f;
            r0Var2.getClass();
            r0Var2.m(null, a2t.a);
            return;
        }
        if (z7l0Var == RoutePointType.POINT_B) {
            r0 r0Var3 = this.c;
            r0Var3.getClass();
            r0Var3.m(null, g2tVar);
            return;
        }
        if (z7l0Var == RoutePointType.POINT_MID || z7l0Var == RoutePointType.SERVICE_EATS || z7l0Var == RoutePointType.SERVICE_CHARGERS || z7l0Var == RoutePointType.SERVICE_SCOOTERS || z7l0Var == RoutePointType.DISCOVERY_ORGANIZATION || z7l0Var == RoutePointType.SERVICE_NAVIGATOR_A || z7l0Var == RoutePointType.SERVICE_NAVIGATOR_B || z7l0Var == RoutePointType.FAVORITE || z7l0Var == RoutePointType.CITY_SUGGEST || z7l0Var == RoutePointType.SUGGEST_MENU_POINT_A || z7l0Var == RoutePointType.SUGGEST_MENU_POINT_B || z7l0Var == RoutePointType.TRANSPORT_A || z7l0Var == RoutePointType.TRANSPORT_B || z7l0Var == RoutePointType.DELIVERY_NDD_SOURCE || z7l0Var == RoutePointType.DELIVERY_NDD_DESTINATION || z7l0Var == RoutePointType.SUPERAPP_DISCOVERY_MAP || (z7l0Var instanceof tkf)) {
            return;
        }
        w511.b();
    }
}
