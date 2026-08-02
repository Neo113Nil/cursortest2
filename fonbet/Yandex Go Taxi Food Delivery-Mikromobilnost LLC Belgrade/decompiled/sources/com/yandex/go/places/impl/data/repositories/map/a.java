package com.yandex.go.places.impl.data.repositories.map;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final tse a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public Map c = b.f();

    public a(tse tseVar) {
        this.a = tseVar;
    }

    public final void a() {
        tje.N(this.a, null, null, new PlacesMapSocialPinsCacheRepositoryImpl$clear$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsCacheRepositoryImpl$getAndRemove$1 placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PlacesMapSocialPinsCacheRepositoryImpl$getAndRemove$1) {
                placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1 = (PlacesMapSocialPinsCacheRepositoryImpl$getAndRemove$1) continuationImpl;
                int i2 = placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.b;
                        placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.L$0 = aVar;
                        placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.label = 1;
                        if (aVar.a(placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.L$0;
                        kotlin.b.b(obj);
                    }
                    Map map = this.c;
                    this.c = b.f();
                    return map;
                }
            }
            Map map2 = this.c;
            this.c = b.f();
            return map2;
        } finally {
            g050Var.d(null);
        }
        placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1 = new PlacesMapSocialPinsCacheRepositoryImpl$getAndRemove$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsCacheRepositoryImpl$getAndRemove$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsCacheRepositoryImpl$save$1 placesMapSocialPinsCacheRepositoryImpl$save$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof PlacesMapSocialPinsCacheRepositoryImpl$save$1) {
                placesMapSocialPinsCacheRepositoryImpl$save$1 = (PlacesMapSocialPinsCacheRepositoryImpl$save$1) continuationImpl;
                int i2 = placesMapSocialPinsCacheRepositoryImpl$save$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapSocialPinsCacheRepositoryImpl$save$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapSocialPinsCacheRepositoryImpl$save$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapSocialPinsCacheRepositoryImpl$save$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        placesMapSocialPinsCacheRepositoryImpl$save$1.L$0 = linkedHashMap;
                        aVar = this.b;
                        placesMapSocialPinsCacheRepositoryImpl$save$1.L$1 = aVar;
                        placesMapSocialPinsCacheRepositoryImpl$save$1.label = 1;
                        if (aVar.a(placesMapSocialPinsCacheRepositoryImpl$save$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) placesMapSocialPinsCacheRepositoryImpl$save$1.L$1;
                        ?? r0 = (Map) placesMapSocialPinsCacheRepositoryImpl$save$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        linkedHashMap = r0;
                    }
                    this.c = b.t(linkedHashMap);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.c = b.t(linkedHashMap);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        placesMapSocialPinsCacheRepositoryImpl$save$1 = new PlacesMapSocialPinsCacheRepositoryImpl$save$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsCacheRepositoryImpl$save$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsCacheRepositoryImpl$save$1.label;
        if (i != 0) {
        }
    }
}
