package defpackage;

import com.yandex.go.taxi.order.map.route.a;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class k8l0 extends uhs0 {
    public final /* synthetic */ a a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public k8l0(a aVar, long j, boolean z) {
        this.a = aVar;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.nlm
    public final void a() {
    }

    @Override // defpackage.uhs0
    public final void b(DrivingRoute drivingRoute) {
        nol0 nol0Var = new nol0(drivingRoute);
        a aVar = this.a;
        aVar.s = new o8g0(nol0Var, aVar.e.c());
        ((plm) aVar.b).a(nol0Var);
    }

    @Override // defpackage.nlm
    public final void d(IOException iOException) {
        a3y0 a3y0Var = this.a.j;
        String l = a3y0Var.l(new String[]{"tollRoadRouterCallback", "onError"});
        hst hstVar = jst.e;
        String str = a3y0Var.a;
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a == null || !a.b(15)) {
            return;
        }
        a.a(15, str, iOException, "Error retrieving driving route for RouteProgressTracker", m.a);
    }

    @Override // defpackage.uhs0, defpackage.nlm
    public final void e(List list) {
        DrivingRoute drivingRoute;
        boolean isEmpty = list.isEmpty();
        Object obj = null;
        a aVar = this.a;
        if (isEmpty) {
            a3y0.e(aVar.j, new String[]{"tollRoadRouterCallback", "onRoutes"}, new IOException("Empty driving routes"), null, 4);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        if (aVar.e.b().V().b0.a()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (in91.e((DrivingRoute) next)) {
                    obj = next;
                    break;
                }
            }
            drivingRoute = (DrivingRoute) obj;
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (in91.d((DrivingRoute) next2)) {
                    obj = next2;
                    break;
                }
            }
            drivingRoute = (DrivingRoute) obj;
        }
        if (drivingRoute == null) {
            drivingRoute = (DrivingRoute) list.get(0);
        }
        b(drivingRoute);
        if (aVar.q == null || !this.c) {
            return;
        }
        kgl0 kgl0Var = aVar.f;
        kgl0Var.getClass();
        HashMap hashMap = new HashMap();
        kgl0Var.a.a("Routes.TaxiRoute.Rebuilt", hashMap, 1, x4e.n((int) currentTimeMillis, hashMap, "rebuild_time_ms"));
    }
}
