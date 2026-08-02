package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.cgk0;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.hbp0;
import defpackage.jkk0;
import defpackage.l8x;
import defpackage.o2y0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.yxf0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.details.v2.state.a b;
    public final jkk0 c;
    public final cgk0 d;
    public final yxf0 e;
    public final pwy0 f;
    public final hbp0 h;
    public boolean k;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "ItemComposer");
    public final r0 i = bvf0.c(kotlin.collections.b.f());
    public final kotlinx.coroutines.sync.a j = gtq0.a();

    public c(o2y0 o2y0Var, com.yandex.go.taxi.order.details.v2.state.a aVar, jkk0 jkk0Var, cgk0 cgk0Var, yxf0 yxf0Var, pwy0 pwy0Var, tt2 tt2Var) {
        this.a = o2y0Var;
        this.b = aVar;
        this.c = jkk0Var;
        this.d = cgk0Var;
        this.e = yxf0Var;
        this.f = pwy0Var;
        this.h = new hbp0(new RideCardItemComposer$scope$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "RideCardItemComposer", null, 4);
    }

    public static final void a(c cVar, Set set) {
        Object value;
        LinkedHashMap linkedHashMap;
        Set<String> set2;
        Object value2;
        LinkedHashMap linkedHashMap2;
        Object value3;
        LinkedHashMap linkedHashMap3;
        Object value4;
        LinkedHashMap linkedHashMap4;
        l8x l8xVar;
        if (set.isEmpty()) {
            return;
        }
        jkk0 jkk0Var = cVar.c;
        r0 r0Var = jkk0Var.a;
        do {
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            set2 = set;
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                linkedHashMap.remove((String) it.next());
            }
        } while (!r0Var.k(value, linkedHashMap));
        r0 r0Var2 = jkk0Var.c;
        do {
            value2 = r0Var2.getValue();
            linkedHashMap2 = new LinkedHashMap((Map) value2);
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                linkedHashMap2.remove((String) it2.next());
            }
        } while (!r0Var2.k(value2, linkedHashMap2));
        r0 r0Var3 = jkk0Var.g;
        do {
            value3 = r0Var3.getValue();
            linkedHashMap3 = new LinkedHashMap((Map) value3);
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                linkedHashMap3.remove((String) it3.next());
            }
        } while (!r0Var3.k(value3, linkedHashMap3));
        r0 r0Var4 = cVar.i;
        do {
            value4 = r0Var4.getValue();
            linkedHashMap4 = new LinkedHashMap((Map) value4);
            for (String str : set2) {
                Pair pair = (Pair) linkedHashMap4.remove(str);
                if (pair != null && (l8xVar = (l8x) pair.f()) != null) {
                    l8xVar.a(null);
                }
                a3y0.a(cVar.g, new String[]{"cleanOutdatedItems", g8e.o("item: ", str)}, null, 6);
            }
        } while (!r0Var4.k(value4, linkedHashMap4));
    }

    public static final void b(c cVar, String str, a7 a7Var, pzt0 pzt0Var) {
        Object value;
        r0 r0Var = cVar.i;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.b.n((Map) value, gw00.e(new Pair(str, new Pair(a7Var, pzt0Var))))));
    }

    public final rol0 c(RideCardPresentationType rideCardPresentationType) {
        jkk0 jkk0Var = this.c;
        gci0 gci0Var = jkk0Var.f;
        gci0 gci0Var2 = jkk0Var.b;
        return new rol0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new tpr[]{gci0Var, gci0Var2}, null, new RideCardItemComposer$getItemStates$1(this, rideCardPresentationType, null)));
    }

    public final void d(RideCardPresentationType rideCardPresentationType) {
        hbp0 hbp0Var = this.h;
        hbp0Var.f();
        hbp0.e(hbp0Var, null, null, new RideCardItemComposer$observeRideCardResponse$1(this, rideCardPresentationType, null), 3);
        hbp0.e(hbp0Var, null, null, new RideCardItemComposer$processItemPoolToCacheRecords$1(this, rideCardPresentationType, null), 3);
        hbp0.e(hbp0Var, null, null, new RideCardItemComposer$observeCacheRecords$1(this, null), 3);
        hbp0.e(hbp0Var, null, null, new RideCardItemComposer$observeDividersMapping$1(this, null), 3);
    }
}
