package defpackage;

import com.yandex.go.coroutines.b;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.RouteEtaResponse;
import com.yandex.go.shortcuts.impl.route.GetRouteEtaInteractor$fetchRouteEta$$inlined$safeCollectIn$1;
import com.yandex.go.shortcuts.impl.route.GetRouteEtaInteractor$fetchRouteEta$$inlined$start$1;
import com.yandex.go.shortcuts.impl.route.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class j3l0 implements y430 {
    public final a a;
    public final i3l0 b = i3l0.c;

    public j3l0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.y430
    public final tpr a() {
        return this.a.f;
    }

    @Override // defpackage.y430
    public final Object b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059 A[SYNTHETIC] */
    @Override // defpackage.y430
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(d4s0 d4s0Var) {
        yct yctVar;
        zzs zzsVar = d4s0Var.e;
        List<e6v> list = d4s0Var.d;
        a aVar = this.a;
        pzt0 pzt0Var = aVar.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ArrayList arrayList = new ArrayList();
        for (e6v e6vVar : list) {
            ycc.r(e6vVar instanceof qux0 ? Collections.singletonList(e6vVar) : e6vVar instanceof lsy ? Collections.singletonList(e6vVar) : e6vVar instanceof n3q0 ? adc.D(((n3q0) e6vVar).c, qux0.class) : EmptyList.a, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ga5 ga5Var = (ga5) it.next();
            q1 q1Var = ga5Var.getBase().k;
            if (q1Var instanceof Action$TaxiExpectedDestination) {
                Action$TaxiExpectedDestination action$TaxiExpectedDestination = (Action$TaxiExpectedDestination) q1Var;
                if (action$TaxiExpectedDestination.d == Action$TaxiExpectedDestination.Prefetch.ROUTE_ETA) {
                    yctVar = new yct(action$TaxiExpectedDestination.a, ga5Var.getBase().j);
                    if (yctVar == null) {
                        arrayList2.add(yctVar);
                    }
                }
            }
            yctVar = null;
            if (yctVar == null) {
            }
        }
        if (!arrayList2.isEmpty()) {
            aVar.e = tje.N(aVar.c, null, null, new GetRouteEtaInteractor$fetchRouteEta$$inlined$safeCollectIn$1(b.d(aVar.b.b, new GetRouteEtaInteractor$fetchRouteEta$$inlined$start$1(zzsVar, null)), null, aVar, arrayList2), 3);
            return;
        }
        r0 r0Var = aVar.d;
        i3l0 i3l0Var = new i3l0(d1z.a, 2);
        r0Var.getClass();
        r0Var.m(null, i3l0Var);
    }

    @Override // defpackage.y430
    public final List d(Object obj, List list) {
        Iterator it;
        String str;
        String str2;
        if (!(obj instanceof i3l0)) {
            return list;
        }
        List<RouteEtaResponse.Route> list2 = ((i3l0) obj).b;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (RouteEtaResponse.Route route : list2) {
            Pair pair = new Pair(route.a, route.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (Iterator it2 = list3.iterator(); it2.hasNext(); it2 = it) {
            e6v e6vVar = (e6v) it2.next();
            if (e6vVar instanceof lsy) {
                lsy lsyVar = (lsy) e6vVar;
                RouteEtaResponse.Route.Eta eta = (RouteEtaResponse.Route.Eta) linkedHashMap.get(lsyVar.b.j);
                e6vVar = (eta == null || (str2 = eta.c) == null) ? lsyVar : lsy.v(lsyVar, null, str2, false, false, null, 479);
                it = it2;
            } else if (e6vVar instanceof qux0) {
                qux0 qux0Var = (qux0) e6vVar;
                ea5 ea5Var = qux0Var.b;
                RouteEtaResponse.Route.Eta eta2 = (RouteEtaResponse.Route.Eta) linkedHashMap.get(ea5Var.j);
                if (eta2 == null || (str = eta2.c) == null) {
                    it = it2;
                    e6vVar = qux0Var;
                } else {
                    it = it2;
                    e6vVar = qux0.v(qux0Var, null, new ea5(ea5Var.a, ea5Var.b, ea5Var.c, ea5Var.d, ea5Var.e, ea5Var.f, ea5Var.g, new da5(str), ea5Var.i, ea5Var.j, ea5Var.k, ea5Var.l, ea5Var.m, ea5Var.n, ea5Var.o, ea5Var.p), null, null, false, null, HProv.PP_DELETE_KEYSET);
                }
            } else {
                it = it2;
                if (e6vVar instanceof n3q0) {
                    n3q0 n3q0Var = (n3q0) e6vVar;
                    e6vVar = new n3q0(n3q0Var.a, n3q0Var.b, d(obj, n3q0Var.c));
                }
            }
            arrayList.add(e6vVar);
        }
        return arrayList;
    }
}
