package com.yandex.go.places.impl.data.repositories;

import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hbc0;
import defpackage.ny61;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final j a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public volatile Map c = b.f();

    public a(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r8.a(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:26:0x0078, B:28:0x0080, B:29:0x008a), top: B:25:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:26:0x0078, B:28:0x0080, B:29:0x008a), top: B:25:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, ContinuationImpl continuationImpl) {
        PinImagesRepositoryImpl$getPinImages$1 pinImagesRepositoryImpl$getPinImages$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ?? r1;
        Map map;
        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName2;
        Map map2;
        hbc0 hbc0Var;
        try {
            if (continuationImpl instanceof PinImagesRepositoryImpl$getPinImages$1) {
                pinImagesRepositoryImpl$getPinImages$1 = (PinImagesRepositoryImpl$getPinImages$1) continuationImpl;
                int i2 = pinImagesRepositoryImpl$getPinImages$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pinImagesRepositoryImpl$getPinImages$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pinImagesRepositoryImpl$getPinImages$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pinImagesRepositoryImpl$getPinImages$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Map map3 = this.c;
                        if (map3.containsKey(placesMapConfig$PlacesMapScreenName)) {
                            return map3.get(placesMapConfig$PlacesMapScreenName);
                        }
                        aVar = this.b;
                        pinImagesRepositoryImpl$getPinImages$1.L$0 = placesMapConfig$PlacesMapScreenName;
                        pinImagesRepositoryImpl$getPinImages$1.L$1 = null;
                        pinImagesRepositoryImpl$getPinImages$1.L$2 = aVar;
                        pinImagesRepositoryImpl$getPinImages$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map2 = (Map) pinImagesRepositoryImpl$getPinImages$1.L$3;
                            r1 = (g050) pinImagesRepositoryImpl$getPinImages$1.L$2;
                            placesMapConfig$PlacesMapScreenName2 = (PlacesMapConfig$PlacesMapScreenName) pinImagesRepositoryImpl$getPinImages$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                r1 = r1;
                                hbc0 hbc0Var2 = (hbc0) obj;
                                this.c = b.o(map2, new Pair(placesMapConfig$PlacesMapScreenName2, hbc0Var2));
                                hbc0Var = hbc0Var2;
                                aVar = r1;
                                aVar.d(null);
                                return hbc0Var;
                            } catch (Throwable th) {
                                th = th;
                                r1.d(null);
                                throw th;
                            }
                        }
                        ?? r7 = (g050) pinImagesRepositoryImpl$getPinImages$1.L$2;
                        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName3 = (PlacesMapConfig$PlacesMapScreenName) pinImagesRepositoryImpl$getPinImages$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        placesMapConfig$PlacesMapScreenName = placesMapConfig$PlacesMapScreenName3;
                    }
                    map = this.c;
                    if (!map.containsKey(placesMapConfig$PlacesMapScreenName)) {
                        hbc0Var = (hbc0) map.get(placesMapConfig$PlacesMapScreenName);
                        aVar.d(null);
                        return hbc0Var;
                    }
                    j jVar = this.a;
                    pinImagesRepositoryImpl$getPinImages$1.L$0 = placesMapConfig$PlacesMapScreenName;
                    pinImagesRepositoryImpl$getPinImages$1.L$1 = null;
                    pinImagesRepositoryImpl$getPinImages$1.L$2 = aVar;
                    pinImagesRepositoryImpl$getPinImages$1.L$3 = map;
                    pinImagesRepositoryImpl$getPinImages$1.label = 2;
                    Object e = jVar.e(placesMapConfig$PlacesMapScreenName, pinImagesRepositoryImpl$getPinImages$1);
                    if (e != coroutineSingletons) {
                        r1 = aVar;
                        obj = e;
                        placesMapConfig$PlacesMapScreenName2 = placesMapConfig$PlacesMapScreenName;
                        map2 = map;
                        hbc0 hbc0Var22 = (hbc0) obj;
                        this.c = b.o(map2, new Pair(placesMapConfig$PlacesMapScreenName2, hbc0Var22));
                        hbc0Var = hbc0Var22;
                        aVar = r1;
                        aVar.d(null);
                        return hbc0Var;
                    }
                    return coroutineSingletons;
                }
            }
            map = this.c;
            if (!map.containsKey(placesMapConfig$PlacesMapScreenName)) {
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = aVar;
            r1.d(null);
            throw th;
        }
        pinImagesRepositoryImpl$getPinImages$1 = new PinImagesRepositoryImpl$getPinImages$1(this, continuationImpl);
        Object obj2 = pinImagesRepositoryImpl$getPinImages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinImagesRepositoryImpl$getPinImages$1.label;
        if (i != 0) {
        }
    }
}
