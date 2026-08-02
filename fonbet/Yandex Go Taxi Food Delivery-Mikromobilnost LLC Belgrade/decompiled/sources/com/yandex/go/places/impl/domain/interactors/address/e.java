package com.yandex.go.places.impl.domain.interactors.address;

import defpackage.dt20;
import defpackage.eja1;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.i9c0;
import defpackage.j5x;
import defpackage.jx81;
import defpackage.lac0;
import defpackage.ny61;
import defpackage.r5x;
import defpackage.s6x;
import defpackage.sb2;
import defpackage.scc;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes13.dex */
public final class e implements vpr {
    public final /* synthetic */ dt20 a;

    public e(dt20 dt20Var) {
        this.a = dt20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01d4, code lost:
    
        if (r0.a(r1, r2) == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01d6, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0159, code lost:
    
        if (r1.a(r5, r2) != r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        if (r1.a(r13, r2) == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d A[LOOP:1: B:28:0x0127->B:30:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesAddressInteractor$updateAddress$$inlined$safeCollect$2$1 placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1;
        int i;
        zzs zzsVar;
        if (continuation instanceof PlacesAddressInteractor$updateAddress$$inlined$safeCollect$2$1) {
            placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1 = (PlacesAddressInteractor$updateAddress$$inlined$safeCollect$2$1) continuation;
            int i2 = placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label;
                dt20 dt20Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzsVar = (zzs) obj;
                    dt20Var.w = new Double(zzsVar.a);
                    dt20Var.x = new Double(zzsVar.b);
                    i9c0 i9c0Var = (i9c0) dt20Var.c;
                    r5x q = eja1.q(scc.g("discovery_state", "address_state", "lat"));
                    j5x M = jx81.M(String.valueOf(zzsVar.a));
                    Map z = g8e.z("send-to-backend", "*");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(z.size()));
                    for (Map.Entry entry : z.entrySet()) {
                        linkedHashMap.put(entry.getKey(), sb2.P(entry.getValue()));
                    }
                    lac0 lac0Var = new lac0(q, M, new s6x(linkedHashMap));
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$0 = null;
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$1 = null;
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$2 = zzsVar;
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label = 1;
                } else if (i == 1) {
                    zzsVar = (zzs) placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$2;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    kotlin.b.b(obj2);
                    i9c0 i9c0Var2 = (i9c0) dt20Var.c;
                    r5x q2 = eja1.q(scc.g("discovery_state", "address_state", CacheStatus.SERIAL_UPDATED));
                    j5x M2 = jx81.M(Boolean.TRUE);
                    Map i3 = kotlin.collections.b.i(new Pair("sync-with-divkit", "*"), new Pair("send-to-backend", "*"));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(i3.size()));
                    for (Map.Entry entry2 : i3.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), sb2.P(entry2.getValue()));
                    }
                    lac0 lac0Var2 = new lac0(q2, M2, new s6x(linkedHashMap2));
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$0 = null;
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$1 = null;
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$2 = null;
                    placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label = 3;
                }
                i9c0 i9c0Var3 = (i9c0) dt20Var.c;
                r5x q3 = eja1.q(scc.g("discovery_state", "address_state", "lon"));
                j5x M3 = jx81.M(String.valueOf(zzsVar.b));
                Map z2 = g8e.z("send-to-backend", "*");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(z2.size()));
                for (Map.Entry entry3 : z2.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), sb2.P(entry3.getValue()));
                }
                lac0 lac0Var3 = new lac0(q3, M3, new s6x(linkedHashMap3));
                placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$0 = null;
                placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$1 = null;
                placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$2 = null;
                placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label = 2;
            }
        }
        placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1 = new PlacesAddressInteractor$updateAddress$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label;
        dt20 dt20Var2 = this.a;
        if (i != 0) {
        }
        i9c0 i9c0Var32 = (i9c0) dt20Var2.c;
        r5x q32 = eja1.q(scc.g("discovery_state", "address_state", "lon"));
        j5x M32 = jx81.M(String.valueOf(zzsVar.b));
        Map z22 = g8e.z("send-to-backend", "*");
        LinkedHashMap linkedHashMap32 = new LinkedHashMap(gw00.d(z22.size()));
        while (r7.hasNext()) {
        }
        lac0 lac0Var32 = new lac0(q32, M32, new s6x(linkedHashMap32));
        placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$0 = null;
        placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$1 = null;
        placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.L$2 = null;
        placesAddressInteractor$updateAddress$$inlined$safeCollect$2$1.label = 2;
    }
}
