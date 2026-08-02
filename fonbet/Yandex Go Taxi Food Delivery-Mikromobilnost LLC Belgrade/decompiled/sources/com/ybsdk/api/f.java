package com.ybsdk.api;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SkeletonsEvents$SkeletonsLoadedStatus;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.divkit.api.data.LocalSkeleton;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import com.ybsdk.feature.divkit.api.data.SkeletonAliases;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.skeletons.LocalSkeletonDto;
import com.ybsdk.network.dto.skeletons.SkeletonItem;
import com.ybsdk.network.dto.skeletons.SkeletonsResponse;
import defpackage.a6w;
import defpackage.em3;
import defpackage.kgx;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.xls0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class f {
    public final AppAnalyticsReporter a;
    public final xls0 b;
    public final Api c;
    public final nbp0 d;
    public final com.ybsdk.rconfig.b e;

    public f(AppAnalyticsReporter appAnalyticsReporter, xls0 xls0Var, Api api, nbp0 nbp0Var, com.ybsdk.rconfig.b bVar) {
        this.a = appAnalyticsReporter;
        this.b = xls0Var;
        this.c = api;
        this.d = nbp0Var;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, List list, ContinuationImpl continuationImpl) {
        SkeletonsManagerImpl$deleteNeededSkeletons$1 skeletonsManagerImpl$deleteNeededSkeletons$1;
        int i;
        Iterator it;
        Collection collection;
        fVar.getClass();
        if (continuationImpl instanceof SkeletonsManagerImpl$deleteNeededSkeletons$1) {
            skeletonsManagerImpl$deleteNeededSkeletons$1 = (SkeletonsManagerImpl$deleteNeededSkeletons$1) continuationImpl;
            int i2 = skeletonsManagerImpl$deleteNeededSkeletons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonsManagerImpl$deleteNeededSkeletons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = skeletonsManagerImpl$deleteNeededSkeletons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonsManagerImpl$deleteNeededSkeletons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) skeletonsManagerImpl$deleteNeededSkeletons$1.L$2;
                    it = (Iterator) skeletonsManagerImpl$deleteNeededSkeletons$1.L$1;
                    Collection collection2 = (Collection) skeletonsManagerImpl$deleteNeededSkeletons$1.L$0;
                    kotlin.b.b(obj);
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    collection.add(bool);
                    collection = collection2;
                    if (it.hasNext()) {
                        String m439unboximpl = ((RawSkeletonId) it.next()).m439unboximpl();
                        xls0 xls0Var = fVar.b;
                        skeletonsManagerImpl$deleteNeededSkeletons$1.L$0 = collection;
                        skeletonsManagerImpl$deleteNeededSkeletons$1.L$1 = it;
                        skeletonsManagerImpl$deleteNeededSkeletons$1.L$2 = collection;
                        skeletonsManagerImpl$deleteNeededSkeletons$1.label = 1;
                        obj = ((com.ybsdk.feature.divkit.api.data.a) xls0Var).d(m439unboximpl, skeletonsManagerImpl$deleteNeededSkeletons$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        collection.add(bool2);
                        collection = collection2;
                        if (it.hasNext()) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        skeletonsManagerImpl$deleteNeededSkeletons$1 = new SkeletonsManagerImpl$deleteNeededSkeletons$1(fVar, continuationImpl);
        Object obj2 = skeletonsManagerImpl$deleteNeededSkeletons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonsManagerImpl$deleteNeededSkeletons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011b, code lost:
    
        if (r12 == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        if (r12 == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ce -> B:36:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f fVar, List list, String str, ContinuationImpl continuationImpl) {
        SkeletonsManagerImpl$getSkeletonsResponseFromApi$1 skeletonsManagerImpl$getSkeletonsResponseFromApi$1;
        int i;
        Iterator it;
        String str2;
        Collection collection;
        Object c;
        Object failure;
        boolean z;
        Throwable a;
        AppAnalyticsReporter appAnalyticsReporter = fVar.a;
        if (continuationImpl instanceof SkeletonsManagerImpl$getSkeletonsResponseFromApi$1) {
            skeletonsManagerImpl$getSkeletonsResponseFromApi$1 = (SkeletonsManagerImpl$getSkeletonsResponseFromApi$1) continuationImpl;
            int i2 = skeletonsManagerImpl$getSkeletonsResponseFromApi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonsManagerImpl$getSkeletonsResponseFromApi$1.label = i2 - Integer.MIN_VALUE;
                Object obj = skeletonsManagerImpl$getSkeletonsResponseFromApi$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonsManagerImpl$getSkeletonsResponseFromApi$1.label;
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    em3 em3Var = appAnalyticsReporter.i0;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(RawSkeletonId.m431boximpl(((LocalSkeleton) it2.next()).m430getSkeletonId6QunHn0()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    linkedHashMap.put("local_skeletons", arrayList);
                    em3Var.a.a("skeletons.load.initiated", linkedHashMap);
                    ArrayList arrayList2 = new ArrayList();
                    it = list2.iterator();
                    str2 = str;
                    collection = arrayList2;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    LocalSkeleton localSkeleton = (LocalSkeleton) skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$3;
                    it = (Iterator) skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$2;
                    collection = (Collection) skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$1;
                    String str3 = (String) skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$0;
                    kotlin.b.b(obj);
                    LocalSkeletonDto localSkeletonDto = ((Boolean) obj).booleanValue() ? null : new LocalSkeletonDto(localSkeleton.m430getSkeletonId6QunHn0(), localSkeleton.getHash(), defaultConstructorMarker);
                    if (localSkeletonDto != null) {
                        collection.add(localSkeletonDto);
                    }
                    str2 = str3;
                    if (it.hasNext()) {
                        LocalSkeleton localSkeleton2 = (LocalSkeleton) it.next();
                        String m430getSkeletonId6QunHn0 = localSkeleton2.m430getSkeletonId6QunHn0();
                        skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$0 = str2;
                        skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$1 = collection;
                        skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$2 = it;
                        skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$3 = localSkeleton2;
                        skeletonsManagerImpl$getSkeletonsResponseFromApi$1.label = 1;
                        Object i3 = ((com.ybsdk.feature.divkit.api.data.a) fVar.b).i(m430getSkeletonId6QunHn0, skeletonsManagerImpl$getSkeletonsResponseFromApi$1);
                        if (i3 != coroutineSingletons) {
                            str3 = str2;
                            localSkeleton = localSkeleton2;
                            obj = i3;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            if (localSkeletonDto != null) {
                            }
                            str2 = str3;
                            if (it.hasNext()) {
                                SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1 skeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1 = new SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1(fVar, (List) collection, str2, null);
                                skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$0 = null;
                                skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$1 = null;
                                skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$2 = null;
                                skeletonsManagerImpl$getSkeletonsResponseFromApi$1.L$3 = null;
                                skeletonsManagerImpl$getSkeletonsResponseFromApi$1.label = 2;
                                c = com.ybsdk.core.utils.ext.c.c(skeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1, skeletonsManagerImpl$getSkeletonsResponseFromApi$1);
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    failure = ((Result) obj).getValue();
                    z = failure instanceof Result.Failure;
                    if (!z) {
                        SkeletonsResponse skeletonsResponse = (SkeletonsResponse) failure;
                        em3 em3Var2 = appAnalyticsReporter.i0;
                        SkeletonsEvents$SkeletonsLoadedStatus skeletonsEvents$SkeletonsLoadedStatus = SkeletonsEvents$SkeletonsLoadedStatus.OK;
                        List<SkeletonItem> skeletons = skeletonsResponse.getSkeletons();
                        ArrayList arrayList3 = new ArrayList(tcc.n(skeletons, 10));
                        Iterator<T> it3 = skeletons.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(RawSkeletonId.m431boximpl(((SkeletonItem) it3.next()).m473getSkeletonId6QunHn0()));
                        }
                        em3Var2.s(skeletonsEvents$SkeletonsLoadedStatus, arrayList3, skeletonsResponse.getSkeletonsToDelete(), null);
                    }
                    a = Result.a(failure);
                    if (a != null) {
                        appAnalyticsReporter.i0.s(SkeletonsEvents$SkeletonsLoadedStatus.ERROR, null, null, a.getMessage());
                    }
                    if (z) {
                        return failure;
                    }
                    return null;
                }
                kotlin.b.b(obj);
                c = ((Result) obj).getValue();
                Throwable a2 = Result.a(c);
                if (a2 == null) {
                    SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1 skeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1 = new SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1(2, null);
                    skeletonsManagerImpl$getSkeletonsResponseFromApi$1.label = 3;
                    failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, skeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1, skeletonsManagerImpl$getSkeletonsResponseFromApi$1);
                } else {
                    failure = new Result.Failure(a2);
                }
                z = failure instanceof Result.Failure;
                if (!z) {
                }
                a = Result.a(failure);
                if (a != null) {
                }
                if (z) {
                }
            }
        }
        skeletonsManagerImpl$getSkeletonsResponseFromApi$1 = new SkeletonsManagerImpl$getSkeletonsResponseFromApi$1(fVar, continuationImpl);
        Object obj2 = skeletonsManagerImpl$getSkeletonsResponseFromApi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonsManagerImpl$getSkeletonsResponseFromApi$1.label;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f fVar, ContinuationImpl continuationImpl) {
        SkeletonsManagerImpl$loadLocalAliases$1 skeletonsManagerImpl$loadLocalAliases$1;
        int i;
        zy11 zy11Var;
        SkeletonAliases skeletonAliases;
        Object obj;
        fVar.getClass();
        if (continuationImpl instanceof SkeletonsManagerImpl$loadLocalAliases$1) {
            skeletonsManagerImpl$loadLocalAliases$1 = (SkeletonsManagerImpl$loadLocalAliases$1) continuationImpl;
            int i2 = skeletonsManagerImpl$loadLocalAliases$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonsManagerImpl$loadLocalAliases$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = skeletonsManagerImpl$loadLocalAliases$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonsManagerImpl$loadLocalAliases$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    xls0 xls0Var = fVar.b;
                    skeletonsManagerImpl$loadLocalAliases$1.L$0 = fVar;
                    skeletonsManagerImpl$loadLocalAliases$1.label = 1;
                    obj2 = ((com.ybsdk.feature.divkit.api.data.a) xls0Var).e(skeletonsManagerImpl$loadLocalAliases$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = (f) skeletonsManagerImpl$loadLocalAliases$1.L$0;
                    kotlin.b.b(obj2);
                }
                skeletonAliases = (SkeletonAliases) obj2;
                skeletonsManagerImpl$loadLocalAliases$1.L$0 = null;
                skeletonsManagerImpl$loadLocalAliases$1.label = 2;
                fVar.getClass();
                if (skeletonAliases != null || (obj = ((com.ybsdk.feature.divkit.api.data.a) fVar.b).b(skeletonAliases, skeletonsManagerImpl$loadLocalAliases$1)) != coroutineSingletons) {
                    obj = zy11Var;
                }
                return obj != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        skeletonsManagerImpl$loadLocalAliases$1 = new SkeletonsManagerImpl$loadLocalAliases$1(fVar, continuationImpl);
        Object obj22 = skeletonsManagerImpl$loadLocalAliases$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonsManagerImpl$loadLocalAliases$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        skeletonAliases = (SkeletonAliases) obj22;
        skeletonsManagerImpl$loadLocalAliases$1.L$0 = null;
        skeletonsManagerImpl$loadLocalAliases$1.label = 2;
        fVar.getClass();
        if (skeletonAliases != null) {
        }
        obj = zy11Var;
        if (obj != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(f fVar, List list, ContinuationImpl continuationImpl) {
        SkeletonsManagerImpl$updateSkeletonsStorage$1 skeletonsManagerImpl$updateSkeletonsStorage$1;
        int i;
        Iterator it;
        fVar.getClass();
        if (continuationImpl instanceof SkeletonsManagerImpl$updateSkeletonsStorage$1) {
            skeletonsManagerImpl$updateSkeletonsStorage$1 = (SkeletonsManagerImpl$updateSkeletonsStorage$1) continuationImpl;
            int i2 = skeletonsManagerImpl$updateSkeletonsStorage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonsManagerImpl$updateSkeletonsStorage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = skeletonsManagerImpl$updateSkeletonsStorage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonsManagerImpl$updateSkeletonsStorage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) skeletonsManagerImpl$updateSkeletonsStorage$1.L$0;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    SkeletonItem skeletonItem = (SkeletonItem) it.next();
                    xls0 xls0Var = fVar.b;
                    String m473getSkeletonId6QunHn0 = skeletonItem.m473getSkeletonId6QunHn0();
                    DivDataDto divkitData = skeletonItem.getDivkitData();
                    skeletonsManagerImpl$updateSkeletonsStorage$1.L$0 = it;
                    skeletonsManagerImpl$updateSkeletonsStorage$1.label = 1;
                    if (((com.ybsdk.feature.divkit.api.data.a) xls0Var).n(m473getSkeletonId6QunHn0, divkitData, skeletonsManagerImpl$updateSkeletonsStorage$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        skeletonsManagerImpl$updateSkeletonsStorage$1 = new SkeletonsManagerImpl$updateSkeletonsStorage$1(fVar, continuationImpl);
        Object obj2 = skeletonsManagerImpl$updateSkeletonsStorage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonsManagerImpl$updateSkeletonsStorage$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if ((r0 - r8.a().longValue()) < r3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        com.ybsdk.rconfig.b bVar = this.e;
        Long skeletonsCacheTtlMs = bVar.r().getSkeletonsCacheTtlMs();
        long longValue = skeletonsCacheTtlMs != null ? skeletonsCacheTtlMs.longValue() : 0L;
        boolean isEnabled = bVar.r().isEnabled();
        nbp0 nbp0Var = this.d;
        if (isEnabled) {
            com.ybsdk.feature.divkit.api.data.a aVar = (com.ybsdk.feature.divkit.api.data.a) this.b;
            Long f = aVar.f();
            if (f != null && j == f.longValue()) {
                a6w a6wVar = aVar.i;
                kgx kgxVar = com.ybsdk.feature.divkit.api.data.a.j[0];
            }
            aVar.m(Long.valueOf(j));
            a6w a6wVar2 = aVar.i;
            kgx kgxVar2 = com.ybsdk.feature.divkit.api.data.a.j[0];
            a6wVar2.c(Long.valueOf(currentTimeMillis));
            tje.N(nbp0Var.b, null, null, new SkeletonsManagerImpl$updateOrDownloadSkeletons$2(this, null), 3);
            return;
        }
        tje.N(nbp0Var.b, null, null, new SkeletonsManagerImpl$updateOrDownloadSkeletons$1(this, null), 3);
    }
}
