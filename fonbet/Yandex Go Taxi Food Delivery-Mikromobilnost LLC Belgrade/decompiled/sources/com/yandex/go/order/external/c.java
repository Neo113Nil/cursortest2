package com.yandex.go.order.external;

import defpackage.gw00;
import defpackage.ny61;
import defpackage.ren;
import defpackage.vpr;
import defpackage.w2p;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ExternalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1 externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ExternalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1) {
            externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1 = (ExternalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1) continuation;
            int i2 = externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Map map = (Map) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Set<ren> set = (Set) entry.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (ren renVar : set) {
                            linkedHashSet.add(new w2p(renVar.g(), renVar.l(), renVar.e(), renVar.k(), renVar.c()));
                        }
                        linkedHashMap.put(key, linkedHashSet);
                    }
                    externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.L$0 = null;
                    externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.L$1 = null;
                    externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.L$2 = null;
                    externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.L$3 = null;
                    externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap, externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1 = new ExternalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1(this, continuation);
        Object obj22 = externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceOrderIdsHolderImpl$observeOrdersIdsWithGeoPosition$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
