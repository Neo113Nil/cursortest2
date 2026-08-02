package com.yandex.go.taxi.order.details.v2.domain.a11y;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.h8k0;
import defpackage.hbp0;
import defpackage.k8k0;
import defpackage.ky2;
import defpackage.l8x;
import defpackage.n8k0;
import defpackage.pzt0;
import defpackage.q8k0;
import defpackage.tt2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;

/* loaded from: classes14.dex */
public final class e {
    public final q8k0 a;
    public final ky2 b;
    public final h8k0 c;
    public final hbp0 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public final AtomicReference h;
    public final ArrayList i;
    public final n8k0 j;

    public e(q8k0 q8k0Var, tt2 tt2Var, ky2 ky2Var, h8k0 h8k0Var) {
        this.a = q8k0Var;
        this.b = ky2Var;
        this.c = h8k0Var;
        this.d = new hbp0(new RideCardAccessibilityRepository$scope$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "RideCardAccessibilityRepository", null, 4);
        RideCardPresentationType rideCardPresentationType = RideCardPresentationType.COMPACT;
        Pair pair = new Pair(rideCardPresentationType, new ConcurrentHashMap());
        RideCardPresentationType rideCardPresentationType2 = RideCardPresentationType.DETAILS;
        this.f = new ConcurrentHashMap(kotlin.collections.b.i(pair, new Pair(rideCardPresentationType2, new ConcurrentHashMap())));
        this.g = new ConcurrentHashMap(kotlin.collections.b.i(new Pair(rideCardPresentationType, new ConcurrentHashMap()), new Pair(rideCardPresentationType2, new ConcurrentHashMap())));
        this.h = new AtomicReference(null);
        this.i = new ArrayList();
        this.j = new n8k0(0, this);
    }

    public final void a(RideCardPresentationType rideCardPresentationType) {
        Collection values;
        ConcurrentHashMap concurrentHashMap = this.f;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(rideCardPresentationType);
        if (concurrentHashMap2 != null && (values = concurrentHashMap2.values()) != null) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                ((l8x) it.next()).a(null);
            }
        }
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap.get(rideCardPresentationType);
        if (concurrentHashMap3 != null) {
            concurrentHashMap3.clear();
        }
        this.d.f();
    }

    public final void b(RideCardPresentationType rideCardPresentationType) {
        e eVar;
        RideCardPresentationType rideCardPresentationType2;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g.get(rideCardPresentationType);
        if (concurrentHashMap != null) {
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                String str = (String) entry.getKey();
                k8k0 k8k0Var = (k8k0) entry.getValue();
                ConcurrentHashMap concurrentHashMap2 = this.f;
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap2.get(rideCardPresentationType);
                if (concurrentHashMap3 == null || concurrentHashMap3.containsKey(str)) {
                    eVar = this;
                    rideCardPresentationType2 = rideCardPresentationType;
                } else {
                    eVar = this;
                    rideCardPresentationType2 = rideCardPresentationType;
                    pzt0 e = hbp0.e(eVar.d, null, null, new RideCardAccessibilityRepository$startIntervalJob$1(true, eVar, k8k0Var, rideCardPresentationType2, null), 3);
                    Object obj = concurrentHashMap2.get(rideCardPresentationType2);
                    if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(rideCardPresentationType2, (obj = new ConcurrentHashMap()))) != null) {
                        obj = putIfAbsent;
                    }
                    ((Map) obj).put(str, e);
                }
                this = eVar;
                rideCardPresentationType = rideCardPresentationType2;
            }
        }
    }
}
