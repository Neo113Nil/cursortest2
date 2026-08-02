package defpackage;

import com.yandex.go.taxi.order.map.route.a;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes14.dex */
public final class j8l0 extends uhs0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String w;
    public final /* synthetic */ boolean x;

    public j8l0(long j, a aVar, boolean z, String str, boolean z2) {
        this.a = j;
        this.b = aVar;
        this.c = z;
        this.w = str;
        this.x = z2;
    }

    @Override // defpackage.nlm
    public final void a() {
    }

    @Override // defpackage.uhs0
    public final void b(DrivingRoute drivingRoute) {
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        long currentTimeMillis2 = System.currentTimeMillis();
        a aVar = this.b;
        aVar.v = currentTimeMillis2;
        nol0 nol0Var = new nol0(drivingRoute);
        o2y0 o2y0Var = aVar.e;
        aVar.s = new o8g0(nol0Var, o2y0Var.c());
        if (this.c) {
            String str = this.w;
            if (str != null) {
                OrderStatusInfo V = o2y0Var.b().V();
                V.getClass();
                String id = SimplePersistentBooleanExperiment.TAXIROUTE_ENABLE_ROUTE_CACHE.getId();
                zn11 a = V.getA();
                if (a != null ? a.a(id) : false) {
                    aVar.h.a.put(o2y0Var.b().a, new k3l0(str, nol0Var));
                }
            }
            drivingRoute.addConditionsListener(aVar.z);
        } else {
            aVar.a();
        }
        if (aVar.q == null || !this.x) {
            return;
        }
        kgl0 kgl0Var = aVar.f;
        int i = (int) currentTimeMillis;
        kgl0Var.getClass();
        HashMap hashMap = new HashMap();
        kgl0Var.a.a("Routes.TaxiRoute.Rebuilt", hashMap, 1, x4e.n(i, hashMap, "rebuild_time_ms"));
    }

    @Override // defpackage.nlm
    public final void d(IOException iOException) {
        a aVar = this.b;
        l201 l201Var = aVar.x;
        i201 i201Var = i201.a;
        if (!jl40.l(l201Var, i201Var)) {
            boolean equals = l201Var.equals(i201Var);
            List list = EmptyList.a;
            if (!equals) {
                if (l201Var instanceof j201) {
                    List list2 = ((j201) l201Var).b;
                    if (list2 != null) {
                        list = list2;
                    }
                } else {
                    if (!(l201Var instanceof k201)) {
                        w511.b();
                        return;
                    }
                    list = ((k201) l201Var).b;
                }
            }
            Polyline l = (!list.isEmpty() && list.size() >= 2) ? k.l(list) : null;
            if (l != null) {
                mol0 mol0Var = new mol0(l);
                aVar.s = new o8g0(mol0Var, aVar.e.c());
                ((plm) aVar.b).a(mol0Var);
            }
        }
        a3y0 a3y0Var = aVar.j;
        String l2 = a3y0Var.l(new String[]{"routerCallback", "onError"});
        hst hstVar = jst.e;
        String str = a3y0Var.a;
        ist m = hstVar.m(l2);
        ke00 a = m.b.a();
        if (a == null || !a.b(15)) {
            return;
        }
        a.a(15, str, iOException, "Error retrieving driving route for RouteProgressTracker", m.a);
    }
}
