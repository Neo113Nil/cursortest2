package com.yandex.go.zone.repository;

import defpackage.am2;
import defpackage.eex;
import defpackage.evu0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.md3;
import defpackage.ny61;
import defpackage.tt2;
import defpackage.ugw0;
import defpackage.vkd0;
import defpackage.zqg;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h {
    public final k a;
    public final tt2 b;
    public final jtq0 c;
    public final zqg d = new zqg(new vkd0(1));
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final ZoneFallbackContainer f;
    public final com.yandex.go.utils.storage.json.a g;

    public h(eex eexVar, k kVar, tt2 tt2Var, jtq0 jtq0Var) {
        this.a = kVar;
        this.b = tt2Var;
        this.c = jtq0Var;
        ZoneFallbackContainer zoneFallbackContainer = new ZoneFallbackContainer(null, 3);
        this.f = zoneFallbackContainer;
        this.g = eexVar.a(new am2("mlutp", "zone_fallback.json", zoneFallbackContainer), ZoneFallbackContainer.Companion.serializer());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, Map map, Integer num, ContinuationImpl continuationImpl) {
        ZoneFallbackCache$fitToMaxCount$1 zoneFallbackCache$fitToMaxCount$1;
        int i;
        int intValue;
        Object next;
        hVar.getClass();
        if (continuationImpl instanceof ZoneFallbackCache$fitToMaxCount$1) {
            zoneFallbackCache$fitToMaxCount$1 = (ZoneFallbackCache$fitToMaxCount$1) continuationImpl;
            int i2 = zoneFallbackCache$fitToMaxCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneFallbackCache$fitToMaxCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneFallbackCache$fitToMaxCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneFallbackCache$fitToMaxCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (num != null) {
                        intValue = num.intValue();
                        while (map.size() > intValue) {
                            Iterator it = map.entrySet().iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    long j = ((ZoneCacheEntry) ((Map.Entry) next).getValue()).c;
                                    do {
                                        Object next2 = it.next();
                                        long j2 = ((ZoneCacheEntry) ((Map.Entry) next2).getValue()).c;
                                        if (j > j2) {
                                            next = next2;
                                            j = j2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Map.Entry entry = (Map.Entry) next;
                            if (entry == null) {
                                break;
                            }
                            map.remove(entry.getKey());
                        }
                        return zy11.a;
                    }
                    zoneFallbackCache$fitToMaxCount$1.L$0 = map;
                    zoneFallbackCache$fitToMaxCount$1.L$1 = null;
                    zoneFallbackCache$fitToMaxCount$1.label = 1;
                    obj = hVar.a.b(zoneFallbackCache$fitToMaxCount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) zoneFallbackCache$fitToMaxCount$1.L$0;
                    kotlin.b.b(obj);
                }
                intValue = ((Number) obj).intValue();
                while (map.size() > intValue) {
                }
                return zy11.a;
            }
        }
        zoneFallbackCache$fitToMaxCount$1 = new ZoneFallbackCache$fitToMaxCount$1(hVar, continuationImpl);
        Object obj2 = zoneFallbackCache$fitToMaxCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneFallbackCache$fitToMaxCount$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
        while (map.size() > intValue) {
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        ZoneFallbackCache$removeStaleEntries$1 zoneFallbackCache$removeStaleEntries$1;
        int i;
        LinkedHashMap linkedHashMap2;
        hVar.getClass();
        if (continuationImpl instanceof ZoneFallbackCache$removeStaleEntries$1) {
            zoneFallbackCache$removeStaleEntries$1 = (ZoneFallbackCache$removeStaleEntries$1) continuationImpl;
            int i2 = zoneFallbackCache$removeStaleEntries$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneFallbackCache$removeStaleEntries$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneFallbackCache$removeStaleEntries$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneFallbackCache$removeStaleEntries$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneFallbackCache$removeStaleEntries$1.L$0 = linkedHashMap;
                    zoneFallbackCache$removeStaleEntries$1.label = 1;
                    obj = hVar.a.a(zoneFallbackCache$removeStaleEntries$1);
                    linkedHashMap2 = linkedHashMap;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r5 = (Map) zoneFallbackCache$removeStaleEntries$1.L$0;
                    kotlin.b.b(obj);
                    linkedHashMap2 = r5;
                }
                int intValue = ((Number) obj).intValue();
                linkedHashMap2.entrySet().removeIf(new md3(21, new ugw0(hVar, intValue, 1)));
                return zy11.a;
            }
        }
        zoneFallbackCache$removeStaleEntries$1 = new ZoneFallbackCache$removeStaleEntries$1(hVar, continuationImpl);
        Object obj2 = zoneFallbackCache$removeStaleEntries$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneFallbackCache$removeStaleEntries$1.label;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        linkedHashMap2.entrySet().removeIf(new md3(21, new ugw0(hVar, intValue2, 1)));
        return zy11.a;
    }

    public final boolean c(ZoneCacheEntry zoneCacheEntry, int i, int i2) {
        long j = zoneCacheEntry.b;
        Integer num = zoneCacheEntry.d;
        if (num != null) {
            i = num.intValue();
        }
        return (((long) (i + i2)) * 1000) + j <= this.c.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x00e3, B:19:0x00f5, B:26:0x0061, B:27:0x00ab, B:31:0x00b9, B:35:0x00c8, B:40:0x0097), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x00e3, B:19:0x00f5, B:26:0x0061, B:27:0x00ab, B:31:0x00b9, B:35:0x00c8, B:40:0x0097), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v11, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        ZoneFallbackCache$zoneCachedAt$1 zoneFallbackCache$zoneCachedAt$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        ?? r2;
        kotlinx.coroutines.sync.a aVar;
        String str3;
        String str4;
        kotlinx.coroutines.sync.a aVar2;
        ZoneFallbackContainer zoneFallbackContainer;
        ZoneCacheEntry zoneCacheEntry;
        h hVar;
        ZoneCacheEntry zoneCacheEntry2;
        try {
            if (continuationImpl instanceof ZoneFallbackCache$zoneCachedAt$1) {
                zoneFallbackCache$zoneCachedAt$1 = (ZoneFallbackCache$zoneCachedAt$1) continuationImpl;
                int i = zoneFallbackCache$zoneCachedAt$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zoneFallbackCache$zoneCachedAt$1.label = i - Integer.MIN_VALUE;
                    obj = zoneFallbackCache$zoneCachedAt$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = zoneFallbackCache$zoneCachedAt$1.label;
                    if (r2 != 0) {
                        kotlin.b.b(obj);
                        if (str2 == null || evu0.J(str2)) {
                            return null;
                        }
                        zoneFallbackCache$zoneCachedAt$1.L$0 = str;
                        zoneFallbackCache$zoneCachedAt$1.L$1 = str2;
                        kotlinx.coroutines.sync.a aVar3 = this.e;
                        zoneFallbackCache$zoneCachedAt$1.L$2 = aVar3;
                        zoneFallbackCache$zoneCachedAt$1.label = 1;
                        if (aVar3.a(zoneFallbackCache$zoneCachedAt$1) != coroutineSingletons) {
                            aVar = aVar3;
                        }
                        return coroutineSingletons;
                    }
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hVar = (h) zoneFallbackCache$zoneCachedAt$1.L$6;
                            zoneCacheEntry = (ZoneCacheEntry) zoneFallbackCache$zoneCachedAt$1.L$5;
                            zoneCacheEntry2 = (ZoneCacheEntry) zoneFallbackCache$zoneCachedAt$1.L$4;
                            g050 g050Var = (g050) zoneFallbackCache$zoneCachedAt$1.L$2;
                            kotlin.b.b(obj);
                            r2 = g050Var;
                            if (!hVar.c(zoneCacheEntry, ((Number) obj).intValue(), 30)) {
                                return null;
                            }
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(zoneCacheEntry2.b);
                            this.d.getClass();
                            return zqg.a(calendar);
                        }
                        ?? r22 = (g050) zoneFallbackCache$zoneCachedAt$1.L$2;
                        str4 = (String) zoneFallbackCache$zoneCachedAt$1.L$1;
                        str3 = (String) zoneFallbackCache$zoneCachedAt$1.L$0;
                        kotlin.b.b(obj);
                        aVar2 = r22;
                        zoneFallbackContainer = (ZoneFallbackContainer) obj;
                        if (jl40.l(zoneFallbackContainer.a, str3)) {
                            return null;
                        }
                        zoneCacheEntry = (ZoneCacheEntry) zoneFallbackContainer.b.get(str4);
                        if (zoneCacheEntry == null) {
                            return null;
                        }
                        zoneFallbackCache$zoneCachedAt$1.L$0 = null;
                        zoneFallbackCache$zoneCachedAt$1.L$1 = null;
                        zoneFallbackCache$zoneCachedAt$1.L$2 = aVar2;
                        zoneFallbackCache$zoneCachedAt$1.L$3 = null;
                        zoneFallbackCache$zoneCachedAt$1.L$4 = zoneCacheEntry;
                        zoneFallbackCache$zoneCachedAt$1.L$5 = zoneCacheEntry;
                        zoneFallbackCache$zoneCachedAt$1.L$6 = this;
                        zoneFallbackCache$zoneCachedAt$1.label = 3;
                        obj = this.a.a(zoneFallbackCache$zoneCachedAt$1);
                        if (obj != coroutineSingletons) {
                            hVar = this;
                            zoneCacheEntry2 = zoneCacheEntry;
                            r2 = aVar2;
                            if (!hVar.c(zoneCacheEntry, ((Number) obj).intValue(), 30)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    ?? r9 = (g050) zoneFallbackCache$zoneCachedAt$1.L$2;
                    str2 = (String) zoneFallbackCache$zoneCachedAt$1.L$1;
                    String str5 = (String) zoneFallbackCache$zoneCachedAt$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r9;
                    str = str5;
                    com.yandex.go.utils.storage.json.a aVar4 = this.g;
                    zoneFallbackCache$zoneCachedAt$1.L$0 = str;
                    zoneFallbackCache$zoneCachedAt$1.L$1 = str2;
                    zoneFallbackCache$zoneCachedAt$1.L$2 = aVar;
                    zoneFallbackCache$zoneCachedAt$1.label = 2;
                    obj = aVar4.a(zoneFallbackCache$zoneCachedAt$1);
                    if (obj != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String str6 = str2;
                    str3 = str;
                    str4 = str6;
                    aVar2 = aVar;
                    zoneFallbackContainer = (ZoneFallbackContainer) obj;
                    if (jl40.l(zoneFallbackContainer.a, str3)) {
                    }
                }
            }
            if (r2 != 0) {
            }
            com.yandex.go.utils.storage.json.a aVar42 = this.g;
            zoneFallbackCache$zoneCachedAt$1.L$0 = str;
            zoneFallbackCache$zoneCachedAt$1.L$1 = str2;
            zoneFallbackCache$zoneCachedAt$1.L$2 = aVar;
            zoneFallbackCache$zoneCachedAt$1.label = 2;
            obj = aVar42.a(zoneFallbackCache$zoneCachedAt$1);
            if (obj != coroutineSingletons) {
            }
        } finally {
            r2.d(null);
        }
        zoneFallbackCache$zoneCachedAt$1 = new ZoneFallbackCache$zoneCachedAt$1(this, continuationImpl);
        obj = zoneFallbackCache$zoneCachedAt$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = zoneFallbackCache$zoneCachedAt$1.label;
    }
}
