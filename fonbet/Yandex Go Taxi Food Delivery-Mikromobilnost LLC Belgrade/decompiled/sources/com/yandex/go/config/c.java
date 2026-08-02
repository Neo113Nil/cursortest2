package com.yandex.go.config;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wnp0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ PropertyReference1Impl b;

    public c(vpr vprVar, PropertyReference1Impl propertyReference1Impl) {
        this.a = vprVar;
        this.b = propertyReference1Impl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocationConfigProvider$requests$$inlined$map$1$2$1 locationConfigProvider$requests$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LocationConfigProvider$requests$$inlined$map$1$2$1) {
            locationConfigProvider$requests$$inlined$map$1$2$1 = (LocationConfigProvider$requests$$inlined$map$1$2$1) continuation;
            int i2 = locationConfigProvider$requests$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationConfigProvider$requests$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationConfigProvider$requests$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationConfigProvider$requests$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LinkedHashMap linkedHashMap = ((wnp0) obj).b;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        Object obj3 = this.b.get(entry.getValue());
                        if (obj3 != null) {
                            linkedHashMap2.put(key, obj3);
                        }
                    }
                    locationConfigProvider$requests$$inlined$map$1$2$1.L$0 = null;
                    locationConfigProvider$requests$$inlined$map$1$2$1.L$1 = null;
                    locationConfigProvider$requests$$inlined$map$1$2$1.L$2 = null;
                    locationConfigProvider$requests$$inlined$map$1$2$1.L$3 = null;
                    locationConfigProvider$requests$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap2, locationConfigProvider$requests$$inlined$map$1$2$1) == coroutineSingletons) {
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
        locationConfigProvider$requests$$inlined$map$1$2$1 = new LocationConfigProvider$requests$$inlined$map$1$2$1(this, continuation);
        Object obj22 = locationConfigProvider$requests$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationConfigProvider$requests$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
