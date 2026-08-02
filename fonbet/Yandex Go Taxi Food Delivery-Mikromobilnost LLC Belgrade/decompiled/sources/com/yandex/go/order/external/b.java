package com.yandex.go.order.external;

import com.yandex.go.order.external.tracking.h;
import defpackage.i3p;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.py11;
import defpackage.ren;
import defpackage.tje;
import defpackage.v5c;
import defpackage.y5c;
import defpackage.zk6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes8.dex */
public final class b {
    public final a a;
    public final jtq0 b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    public b(a aVar, jtq0 jtq0Var) {
        this.a = aVar;
        this.b = jtq0Var;
        tje.N(aVar.c, null, null, new ClosedOrderRepository$filter$1(aVar, new zk6(jtq0Var.c().getTime() - 604800000, 2), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(List list, ContinuationImpl continuationImpl) {
        EatsKitOrderDelegate$filterActiveOrders$1 eatsKitOrderDelegate$filterActiveOrders$1;
        int i;
        if (continuationImpl instanceof EatsKitOrderDelegate$filterActiveOrders$1) {
            eatsKitOrderDelegate$filterActiveOrders$1 = (EatsKitOrderDelegate$filterActiveOrders$1) continuationImpl;
            int i2 = eatsKitOrderDelegate$filterActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsKitOrderDelegate$filterActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsKitOrderDelegate$filterActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsKitOrderDelegate$filterActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list == null) {
                        return EmptyList.a;
                    }
                    eatsKitOrderDelegate$filterActiveOrders$1.L$0 = list;
                    eatsKitOrderDelegate$filterActiveOrders$1.label = 1;
                    a aVar = this.a;
                    obj = tje.k0(aVar.b, new ClosedOrderRepository$getClosedOrders$2(aVar, null), eatsKitOrderDelegate$filterActiveOrders$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) eatsKitOrderDelegate$filterActiveOrders$1.L$0;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    ren renVar = (ren) obj2;
                    if (!map.containsKey(new v5c(renVar.m().getValue().toLowerCase(Locale.US), renVar.g()))) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        eatsKitOrderDelegate$filterActiveOrders$1 = new EatsKitOrderDelegate$filterActiveOrders$1(this, continuationImpl);
        Object obj3 = eatsKitOrderDelegate$filterActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsKitOrderDelegate$filterActiveOrders$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj3;
        ArrayList arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        return arrayList2;
    }

    public final void b(y5c y5cVar) {
        long time = this.b.c().getTime();
        String lowerCase = y5cVar.b().toLowerCase(Locale.US);
        String a = y5cVar.a();
        a aVar = this.a;
        aVar.getClass();
        v5c v5cVar = new v5c(lowerCase, a);
        ike ikeVar = aVar.c;
        ClosedOrderRepository$addClosedOrder$1 closedOrderRepository$addClosedOrder$1 = new ClosedOrderRepository$addClosedOrder$1(aVar, v5cVar, time, null);
        Object obj = null;
        tje.N(ikeVar, null, null, closedOrderRepository$addClosedOrder$1, 3);
        Iterator<E> it = EatsService.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((EatsService) next).toString(), lowerCase)) {
                obj = next;
                break;
            }
        }
        EatsService eatsService = (EatsService) obj;
        if (eatsService == null) {
            jst.e.q("Service '" + lowerCase + "' not found in EatsService");
            return;
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            i3p i3pVar = (i3p) it2.next();
            String a2 = y5cVar.a();
            h hVar = i3pVar.a;
            int size = hVar.r.size();
            List list = hVar.r;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ren renVar = (ren) obj2;
                if (!jl40.l(renVar.m(), eatsService) || !jl40.l(renVar.g(), a2)) {
                    arrayList.add(obj2);
                }
            }
            hVar.r = arrayList;
            boolean z = size != arrayList.size();
            hVar.b(hVar.r, z, z);
            hVar.b.b(a2, py11.a(eatsService));
        }
    }
}
