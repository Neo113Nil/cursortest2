package defpackage;

import com.yandex.go.navigator.domain.t;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.runtime.Error;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class d850 extends jes0 {
    public final /* synthetic */ t a;

    public d850(t tVar) {
        this.a = tVar;
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onMatchRouteResolvingRequested() {
    }

    @Override // defpackage.jes0, com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onRoutesBuilt() {
        boolean z;
        Object obj;
        t tVar = this.a;
        uyd uydVar = tVar.g;
        Navigation navigation = tVar.w;
        if (navigation == null) {
            return;
        }
        List<DrivingRoute> routes = navigation.getRoutes();
        List list = tVar.I;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((DrivingRoute) it.next()).removeConditionsListener(uydVar);
            }
        }
        tVar.I = routes;
        if (routes != null) {
            Iterator<T> it2 = routes.iterator();
            while (it2.hasNext()) {
                ((DrivingRoute) it2.next()).addConditionsListener(uydVar);
            }
        }
        r0 r0Var = tVar.C;
        List<DrivingRoute> list2 = routes;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList.add(((DrivingRoute) it3.next()).getRouteId());
        }
        r0Var.getClass();
        r0Var.m(null, arrayList);
        tVar.l.a((DrivingRoute) a.R(routes));
        r0 r0Var2 = tVar.D;
        boolean isEmpty = routes.isEmpty();
        ya50 ya50Var = tVar.c;
        if (isEmpty) {
            i650 i650Var = ya50Var.a;
            i650Var.a.a("navigation.request_route.empty_result", n.u(i650Var), 1, new HashMap());
            obj = j950.a;
        } else {
            List<DrivingRoute> routes2 = navigation.getRoutes();
            if (!(routes2 instanceof Collection) || !routes2.isEmpty()) {
                Iterator<T> it4 = routes2.iterator();
                while (it4.hasNext()) {
                    if (hua1.e((DrivingRoute) it4.next())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            i650 i650Var2 = ya50Var.a;
            Boolean valueOf = Boolean.valueOf(z);
            i650Var2.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("is_green_route_in_routes", valueOf);
            i650Var2.a.a("navigation.request_route.success", hashMap, 1, new HashMap());
            obj = h950.a;
        }
        tVar.x.b();
        tVar.y = 0;
        if (tVar.s.a() != null && ((com.yandex.go.navigator.domain.a) ((xvf0) ((cb50) tVar.h.get()).c().b).get()).i) {
            tVar.e(false);
        }
        r0Var2.getClass();
        r0Var2.m(null, obj);
    }

    @Override // defpackage.jes0, com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onRoutesRequestError(Error error) {
        t tVar = this.a;
        tVar.x.b();
        tVar.y = 0;
        ya50 ya50Var = tVar.c;
        String obj = error.toString();
        i650 i650Var = ya50Var.a;
        HashMap u = n.u(i650Var);
        if (obj != null) {
            u.put("error", obj);
        }
        i650Var.a.a("navigation.request_route.failure", u, 1, new HashMap());
        r0 r0Var = tVar.D;
        r0Var.getClass();
        r0Var.m(null, k950.a);
    }

    @Override // defpackage.jes0, com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onRoutesRequested(List list) {
        r0 r0Var = this.a.D;
        r0Var.getClass();
        r0Var.m(null, i950.a);
    }
}
