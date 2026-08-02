package com.yandex.go.taxi.order.domain.repositories;

import com.google.ar.core.ImageMetadata;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$DisplayBanners;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$DisplaySettings;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.models.api.response.r7;
import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.search.polling.model.DriverPosition;
import com.yandex.go.taxi.order.search.polling.model.ETA;
import com.yandex.go.taxi.order.state.search.SearchAccessibilityValues;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.model.Zone;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dbl0;
import defpackage.fim;
import defpackage.g050;
import defpackage.g92;
import defpackage.ga30;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.hst;
import defpackage.iup0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jst;
import defpackage.l8x;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pex0;
import defpackage.qvp0;
import defpackage.rtp0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.wiq0;
import defpackage.xwp0;
import defpackage.yal0;
import defpackage.ybo;
import defpackage.ye60;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class n implements iup0 {
    public final hit a;
    public final tt2 b;
    public final qvp0 c;
    public final n20 d;
    public final com.yandex.go.taxi.order.state.search.b e;
    public final xwp0 f;
    public final rtp0 g;
    public final ga30 h;
    public final f i;
    public final wiq0 j;
    public final fim k;
    public final Set l;
    public final a3y0 m = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "SearchInfoStateRepository");
    public final kotlinx.coroutines.sync.a n = gtq0.a();
    public final r0 o = bvf0.c(kotlin.collections.b.f());
    public final ConcurrentHashMap p = new ConcurrentHashMap();
    public final ConcurrentHashMap q = new ConcurrentHashMap();
    public final ConcurrentHashMap r = new ConcurrentHashMap();

    public n(hit hitVar, tt2 tt2Var, qvp0 qvp0Var, n20 n20Var, com.yandex.go.taxi.order.state.search.b bVar, xwp0 xwp0Var, rtp0 rtp0Var, ga30 ga30Var, f fVar, wiq0 wiq0Var, fim fimVar, Set set) {
        this.a = hitVar;
        this.b = tt2Var;
        this.c = qvp0Var;
        this.d = n20Var;
        this.e = bVar;
        this.f = xwp0Var;
        this.g = rtp0Var;
        this.h = ga30Var;
        this.i = fVar;
        this.j = wiq0Var;
        this.k = fimVar;
        this.l = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        if (r10.a(r1) != r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n nVar, List list, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$cleanupOutdatedOrders$1 searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1;
        int i;
        List list2;
        g050 g050Var;
        r0 r0Var = nVar.o;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$cleanupOutdatedOrders$1) {
            searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1 = (SearchInfoStateRepositoryImpl$cleanupOutdatedOrders$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((o2y0) it.next()).b().a);
                    }
                    com.yandex.go.taxi.order.state.search.b bVar = nVar.e;
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$0 = null;
                    searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$1 = arrayList;
                    searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label = 1;
                    if (bVar.b(strArr2, searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1) != coroutineSingletons) {
                        list2 = arrayList;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    g050Var = (g050) searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$2;
                    list2 = (List) searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$1;
                    kotlin.b.b(obj);
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
                        for (String str : v4r0.g(linkedHashMap.keySet(), kotlin.collections.a.N0(list2))) {
                            l8x l8xVar = (l8x) nVar.q.remove(str);
                            if (l8xVar != null) {
                                l8xVar.a(null);
                            }
                            linkedHashMap.remove(str);
                        }
                        r0Var.getClass();
                        r0Var.m(null, linkedHashMap);
                        g050Var.d(null);
                        f fVar = nVar.i;
                        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$0 = null;
                        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$1 = null;
                        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$2 = null;
                        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label = 3;
                        Object a = fVar.a(searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    } catch (Throwable th) {
                        g050Var.d(null);
                        throw th;
                    }
                }
                List list4 = (List) searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$1;
                kotlin.b.b(obj);
                list2 = list4;
                g050Var = nVar.n;
                searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$0 = null;
                searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$1 = list2;
                searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$2 = g050Var;
                searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label = 2;
            }
        }
        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1 = new SearchInfoStateRepositoryImpl$cleanupOutdatedOrders$1(nVar, continuationImpl);
        Object obj2 = searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label;
        if (i != 0) {
        }
        g050Var = nVar.n;
        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$0 = null;
        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$1 = list2;
        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.L$2 = g050Var;
        searchInfoStateRepositoryImpl$cleanupOutdatedOrders$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n nVar, o2y0 o2y0Var, Set set, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$collectStatusInfo$1 searchInfoStateRepositoryImpl$collectStatusInfo$1;
        int i;
        Object obj;
        ConcurrentHashMap concurrentHashMap = nVar.q;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$collectStatusInfo$1) {
            searchInfoStateRepositoryImpl$collectStatusInfo$1 = (SearchInfoStateRepositoryImpl$collectStatusInfo$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$collectStatusInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$collectStatusInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = searchInfoStateRepositoryImpl$collectStatusInfo$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$collectStatusInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    searchInfoStateRepositoryImpl$collectStatusInfo$1.L$0 = o2y0Var;
                    searchInfoStateRepositoryImpl$collectStatusInfo$1.L$1 = set;
                    searchInfoStateRepositoryImpl$collectStatusInfo$1.label = 1;
                    if (nVar.f(o2y0Var, searchInfoStateRepositoryImpl$collectStatusInfo$1) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) searchInfoStateRepositoryImpl$collectStatusInfo$1.L$1;
                    o2y0Var = (o2y0) searchInfoStateRepositoryImpl$collectStatusInfo$1.L$0;
                    kotlin.b.b(obj2);
                }
                o2y0 o2y0Var2 = o2y0Var;
                Set set2 = set;
                String str = o2y0Var2.b().a;
                obj = concurrentHashMap.get(str);
                zy11 zy11Var = zy11.a;
                if (obj == null) {
                    return zy11Var;
                }
                hbp0 hbp0Var = nVar.a.a;
                nVar.b.getClass();
                sjh sjhVar = uyj.a;
                concurrentHashMap.put(str, tje.N(hbp0Var, mdh.b, null, new SearchInfoStateRepositoryImpl$collectStatusInfo$2(o2y0Var2, nVar, str, set2, null), 2));
                return zy11Var;
            }
        }
        searchInfoStateRepositoryImpl$collectStatusInfo$1 = new SearchInfoStateRepositoryImpl$collectStatusInfo$1(nVar, continuationImpl);
        Object obj22 = searchInfoStateRepositoryImpl$collectStatusInfo$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$collectStatusInfo$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var22 = o2y0Var;
        Set set22 = set;
        String str2 = o2y0Var22.b().a;
        obj = concurrentHashMap.get(str2);
        zy11 zy11Var2 = zy11.a;
        if (obj == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(n nVar, String str, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$preloadCachedState$1 searchInfoStateRepositoryImpl$preloadCachedState$1;
        int i;
        SearchState searchState;
        g050 g050Var;
        r0 r0Var = nVar.o;
        try {
            if (continuationImpl instanceof SearchInfoStateRepositoryImpl$preloadCachedState$1) {
                searchInfoStateRepositoryImpl$preloadCachedState$1 = (SearchInfoStateRepositoryImpl$preloadCachedState$1) continuationImpl;
                int i2 = searchInfoStateRepositoryImpl$preloadCachedState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    searchInfoStateRepositoryImpl$preloadCachedState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = searchInfoStateRepositoryImpl$preloadCachedState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = searchInfoStateRepositoryImpl$preloadCachedState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        searchState = (SearchState) nVar.e.a().get(str);
                        if (searchState != null) {
                            g050Var = nVar.n;
                            searchInfoStateRepositoryImpl$preloadCachedState$1.L$0 = str;
                            searchInfoStateRepositoryImpl$preloadCachedState$1.L$1 = searchState;
                            searchInfoStateRepositoryImpl$preloadCachedState$1.L$2 = g050Var;
                            searchInfoStateRepositoryImpl$preloadCachedState$1.label = 1;
                            if (g050Var.a(searchInfoStateRepositoryImpl$preloadCachedState$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) searchInfoStateRepositoryImpl$preloadCachedState$1.L$2;
                    SearchState searchState2 = (SearchState) searchInfoStateRepositoryImpl$preloadCachedState$1.L$1;
                    String str2 = (String) searchInfoStateRepositoryImpl$preloadCachedState$1.L$0;
                    kotlin.b.b(obj);
                    searchState = searchState2;
                    str = str2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
                    linkedHashMap.put(str, searchState);
                    r0Var.getClass();
                    r0Var.m(null, linkedHashMap);
                    return zy11.a;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) r0Var.getValue());
            linkedHashMap2.put(str, searchState);
            r0Var.getClass();
            r0Var.m(null, linkedHashMap2);
            return zy11.a;
        } finally {
            g050Var.d(null);
        }
        searchInfoStateRepositoryImpl$preloadCachedState$1 = new SearchInfoStateRepositoryImpl$preloadCachedState$1(nVar, continuationImpl);
        Object obj2 = searchInfoStateRepositoryImpl$preloadCachedState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$preloadCachedState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r8.e.b(new java.lang.String[]{r9}, r1) == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:18:0x0073, B:20:0x0088, B:21:0x008e), top: B:17:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(n nVar, String str, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$stopUpdatesForOrder$1 searchInfoStateRepositoryImpl$stopUpdatesForOrder$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        String str2;
        g050 g050Var;
        l8x l8xVar;
        r0 r0Var = nVar.o;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$stopUpdatesForOrder$1) {
            searchInfoStateRepositoryImpl$stopUpdatesForOrder$1 = (SearchInfoStateRepositoryImpl$stopUpdatesForOrder$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$0 = str;
                    searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        g050Var = (g050) searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$1;
                        str2 = (String) searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$0;
                        kotlin.b.b(obj);
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
                            l8xVar = (l8x) nVar.q.remove(str2);
                            if (l8xVar != null) {
                                l8xVar.a(null);
                            }
                            linkedHashMap.remove(str2);
                            r0Var.getClass();
                            r0Var.m(null, linkedHashMap);
                            g050Var.d(null);
                            f fVar = nVar.i;
                            searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$0 = null;
                            searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$1 = null;
                            searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label = 3;
                            Object a = fVar.a(searchInfoStateRepositoryImpl$stopUpdatesForOrder$1);
                            return a != coroutineSingletons ? coroutineSingletons : a;
                        } catch (Throwable th) {
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    str = (String) searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar = nVar.n;
                searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$0 = str;
                searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$1 = aVar;
                searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label = 2;
                if (aVar.a(searchInfoStateRepositoryImpl$stopUpdatesForOrder$1) != coroutineSingletons) {
                    str2 = str;
                    g050Var = aVar;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) r0Var.getValue());
                    l8xVar = (l8x) nVar.q.remove(str2);
                    if (l8xVar != null) {
                    }
                    linkedHashMap2.remove(str2);
                    r0Var.getClass();
                    r0Var.m(null, linkedHashMap2);
                    g050Var.d(null);
                    f fVar2 = nVar.i;
                    searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$0 = null;
                    searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$1 = null;
                    searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label = 3;
                    Object a2 = fVar2.a(searchInfoStateRepositoryImpl$stopUpdatesForOrder$1);
                    if (a2 != coroutineSingletons) {
                    }
                }
            }
        }
        searchInfoStateRepositoryImpl$stopUpdatesForOrder$1 = new SearchInfoStateRepositoryImpl$stopUpdatesForOrder$1(nVar, continuationImpl);
        Object obj2 = searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label;
        if (i != 0) {
        }
        aVar = nVar.n;
        searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$0 = str;
        searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.L$1 = aVar;
        searchInfoStateRepositoryImpl$stopUpdatesForOrder$1.label = 2;
        if (aVar.a(searchInfoStateRepositoryImpl$stopUpdatesForOrder$1) != coroutineSingletons) {
        }
    }

    public static boolean j(TaxiOrder taxiOrder, Boolean bool, r7 r7Var) {
        return bool != null ? bool.booleanValue() : (r7Var != null) || jl40.l(taxiOrder.V(), OrderStatusInfo.y0);
    }

    public final kotlinx.coroutines.flow.internal.g e() {
        return kotlinx.coroutines.flow.e.X(new jqr(this.h.a(), new SearchInfoStateRepositoryImpl$activeOrderFlow$1(this, null), 3), new SearchInfoStateRepositoryImpl$activeSearchState$$inlined$flatMapLatest$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$awaitOrderInitializing$1 searchInfoStateRepositoryImpl$awaitOrderInitializing$1;
        int i;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$awaitOrderInitializing$1) {
            searchInfoStateRepositoryImpl$awaitOrderInitializing$1 = (SearchInfoStateRepositoryImpl$awaitOrderInitializing$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$awaitOrderInitializing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$awaitOrderInitializing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$awaitOrderInitializing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$awaitOrderInitializing$1.label;
                if (i != 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0Var = (o2y0) searchInfoStateRepositoryImpl$awaitOrderInitializing$1.L$0;
                }
                kotlin.b.b(obj);
                while (jl40.l(o2y0Var.b().a, "preorder")) {
                    searchInfoStateRepositoryImpl$awaitOrderInitializing$1.L$0 = o2y0Var;
                    searchInfoStateRepositoryImpl$awaitOrderInitializing$1.label = 1;
                    if (kotlinx.coroutines.a.i(100L, searchInfoStateRepositoryImpl$awaitOrderInitializing$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        searchInfoStateRepositoryImpl$awaitOrderInitializing$1 = new SearchInfoStateRepositoryImpl$awaitOrderInitializing$1(this, continuationImpl);
        Object obj2 = searchInfoStateRepositoryImpl$awaitOrderInitializing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$awaitOrderInitializing$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj2);
        while (jl40.l(o2y0Var.b().a, "preorder")) {
        }
        return zy11.a;
    }

    public final Object g(SuspendLambda suspendLambda) {
        Object collect = kotlinx.coroutines.flow.e.t(new jqr(new j(kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.order.provider.a) this.d).a(), new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$flatMapLatest$1(3, null)), this), new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$4(this, null), 3)).collect(new i0(ye60.a, new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$5(this, null)), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? collect : zy11Var;
    }

    public final kotlinx.coroutines.flow.internal.g h(o2y0 o2y0Var) {
        return kotlinx.coroutines.flow.e.X(new jqr(new g92(2, o2y0Var), new SearchInfoStateRepositoryImpl$searchState$2(this, null), 3), new SearchInfoStateRepositoryImpl$searchState$$inlined$flatMapLatest$1(this, null));
    }

    public final ServiceLevel.SearchingPulsarDTO.SearchingPulsar i(String str, boolean z, SearchOverlayType searchOverlayType) {
        SearchOverlayType searchOverlayType2;
        ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar;
        yal0 yal0Var;
        SearchState searchState;
        ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar2;
        if (z || searchOverlayType == (searchOverlayType2 = SearchOverlayType.NONE)) {
            return ServiceLevel.SearchingPulsarDTO.SearchingPulsar.NONE;
        }
        rtp0 rtp0Var = this.g;
        LinkedHashMap linkedHashMap = rtp0Var.d;
        if (linkedHashMap.get(str) == null && (searchState = (SearchState) rtp0Var.c.a().get(str)) != null) {
            if (searchState.d == searchOverlayType2) {
                searchState = null;
            }
            if (searchState != null && (searchingPulsar2 = searchState.c) != null) {
                linkedHashMap.put(str, searchingPulsar2);
            }
        }
        ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar3 = (ServiceLevel.SearchingPulsarDTO.SearchingPulsar) linkedHashMap.get(str);
        if (searchingPulsar3 != null) {
            return searchingPulsar3;
        }
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) rtp0Var.a).m();
        int i = m != null ? m.n : 0;
        dbl0 b = rtp0Var.b.b();
        ServiceLevel h = (b == null || (yal0Var = b.a) == null) ? null : yal0Var.h(i);
        ServiceLevel.SearchingPulsarDTO searchingPulsarDTO = h != null ? h.T : null;
        if (searchingPulsarDTO == null || (searchingPulsar = searchingPulsarDTO.a) == null) {
            searchingPulsar = ServiceLevel.SearchingPulsarDTO.SearchingPulsar.WIDE_CIRCLE;
        }
        linkedHashMap.put(str, searchingPulsar);
        return searchingPulsar;
    }

    public final SearchState k(String str) {
        return (SearchState) ((Map) this.o.getValue()).get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(TaxiOrder taxiOrder, SearchInfoResponse$DisplayBanners searchInfoResponse$DisplayBanners, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$updateLongSearchState$1 searchInfoStateRepositoryImpl$updateLongSearchState$1;
        int i;
        String str;
        SearchInfoResponse$DisplaySettings.MapToggle mapToggle;
        SearchInfoResponse$DisplaySettings.MapToggle mapToggle2;
        Zone zone;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$updateLongSearchState$1) {
            searchInfoStateRepositoryImpl$updateLongSearchState$1 = (SearchInfoStateRepositoryImpl$updateLongSearchState$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$updateLongSearchState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$updateLongSearchState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$updateLongSearchState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$updateLongSearchState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = taxiOrder.a;
                    ZoneAddress zoneAddress = taxiOrder.t().a;
                    String str3 = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : zone.a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    SearchState searchState = (SearchState) ((Map) this.o.getValue()).get(str2);
                    if (searchState == null) {
                        SearchState.Companion.getClass();
                        searchState = SearchState.A;
                    }
                    SearchState searchState2 = searchState;
                    OrderStatusInfo V = taxiOrder.V();
                    searchInfoResponse$DisplayBanners.getClass();
                    SearchOverlayType a = this.c.a(taxiOrder, V, SearchOverlayType.DISPLAY_BANNERS);
                    ServiceLevel.SearchingPulsarDTO.SearchingPulsar i3 = i(str2, false, a);
                    SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = searchInfoResponse$DisplayBanners.c;
                    boolean j = j(taxiOrder, searchInfoResponse$DisplaySettings != null ? searchInfoResponse$DisplaySettings.b : null, searchInfoResponse$DisplayBanners);
                    String str5 = (searchInfoResponse$DisplaySettings == null || (mapToggle2 = searchInfoResponse$DisplaySettings.c) == null) ? null : mapToggle2.a;
                    String str6 = (searchInfoResponse$DisplaySettings == null || (mapToggle = searchInfoResponse$DisplaySettings.c) == null) ? null : mapToggle.b;
                    String str7 = searchInfoResponse$DisplayBanners.a;
                    SearchInfoResponse$DisplayBanners.Banner banner = searchInfoResponse$DisplayBanners.b;
                    SearchState a2 = SearchState.a(searchState2, str2, str4, i3, a, null, true, null, true, null, null, false, null, j, true, 0, null, true, null, null, true, str7, banner.a, banner.b, str5, str6, 446288);
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$0 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$1 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$2 = str2;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$3 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$4 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$5 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$6 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$7 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$8 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$9 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$10 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.L$11 = null;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.Z$0 = j;
                    searchInfoStateRepositoryImpl$updateLongSearchState$1.label = 1;
                    if (p(a2, searchInfoStateRepositoryImpl$updateLongSearchState$1) == obj2) {
                        return obj2;
                    }
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) searchInfoStateRepositoryImpl$updateLongSearchState$1.L$2;
                    kotlin.b.b(obj);
                }
                cne0 cne0Var = this.i.b;
                cne0Var.t("Acceptance", v4r0.i(cne0Var.n("Acceptance"), str));
                return zy11.a;
            }
        }
        searchInfoStateRepositoryImpl$updateLongSearchState$1 = new SearchInfoStateRepositoryImpl$updateLongSearchState$1(this, continuationImpl);
        Object obj3 = searchInfoStateRepositoryImpl$updateLongSearchState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$updateLongSearchState$1.label;
        if (i != 0) {
        }
        cne0 cne0Var2 = this.i.b;
        cne0Var2.t("Acceptance", v4r0.i(cne0Var2.n("Acceptance"), str));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(TaxiOrder taxiOrder, SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch, SearchOverlayType searchOverlayType, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$updateSearchState$1 searchInfoStateRepositoryImpl$updateSearchState$1;
        int i;
        SearchOverlayType searchOverlayType2;
        SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState;
        String str;
        boolean z;
        String str2;
        DriverCandidate driverCandidate;
        SearchAccessibilityValues searchAccessibilityValues;
        SearchState a;
        String str3;
        String str4;
        SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings;
        Boolean bool;
        SearchInfoResponse$TaxiSearch.AccessibilityInfo accessibilityInfo;
        SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings2;
        SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse;
        String str5;
        DriverCandidate driverCandidate2;
        DriverPosition driverPosition;
        Boolean bool2;
        Zone zone;
        String str6;
        xwp0 xwp0Var;
        String str7;
        String str8;
        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch2 = searchInfoResponse$TaxiSearch;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$updateSearchState$1) {
            searchInfoStateRepositoryImpl$updateSearchState$1 = (SearchInfoStateRepositoryImpl$updateSearchState$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$updateSearchState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$updateSearchState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$updateSearchState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$updateSearchState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str9 = taxiOrder.a;
                    ZoneAddress zoneAddress = taxiOrder.t().a;
                    String str10 = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : zone.a;
                    String str11 = "";
                    String str12 = str10 == null ? "" : str10;
                    SearchState searchState = (SearchState) ((Map) this.o.getValue()).get(str9);
                    if (searchState == null) {
                        SearchState.Companion.getClass();
                        searchState = SearchState.A;
                    }
                    SearchState searchState2 = searchState;
                    if (searchOverlayType == null) {
                        searchOverlayType2 = searchInfoResponse$TaxiSearch2 != null ? searchInfoResponse$TaxiSearch2.i : null;
                        if (searchOverlayType2 == null) {
                            searchOverlayType2 = SearchOverlayType.NONE;
                        }
                    } else {
                        searchOverlayType2 = searchOverlayType;
                    }
                    SearchOverlayType a2 = this.c.a(taxiOrder, taxiOrder.V(), searchOverlayType2);
                    if (searchInfoResponse$TaxiSearch2 == null || (candidateSearchState = searchInfoResponse$TaxiSearch2.a) == null) {
                        candidateSearchState = SearchInfoResponse$TaxiSearch.CandidateSearchState.SEARCH;
                    }
                    SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState2 = candidateSearchState;
                    boolean booleanValue = (searchInfoResponse$TaxiSearch2 == null || (bool2 = searchInfoResponse$TaxiSearch2.d) == null) ? false : bool2.booleanValue();
                    Integer num = searchInfoResponse$TaxiSearch2 != null ? searchInfoResponse$TaxiSearch2.e : null;
                    OrderStatusInfo V = taxiOrder.V();
                    V.getClass();
                    boolean f = V.f(SimpleBooleanExperiment.ETA_SHOULD_USE_FLOOR);
                    pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.j).m();
                    ybo yboVar = m != null ? m.h : null;
                    Integer valueOf = yboVar != null ? Integer.valueOf(yboVar.a * 60) : null;
                    ETA eta = num != null ? new ETA(num.intValue(), f) : ((yboVar != null && yboVar.c) || valueOf == null || valueOf.intValue() == 0) ? null : new ETA(valueOf.intValue(), f);
                    boolean z2 = searchInfoResponse$TaxiSearch2 != null;
                    boolean z3 = booleanValue;
                    ServiceLevel.SearchingPulsarDTO.SearchingPulsar i3 = i(str9, z3, a2);
                    if (searchInfoResponse$TaxiSearch2 == null || (str = searchInfoResponse$TaxiSearch2.c) == null) {
                        str = searchState2.i;
                    }
                    String str13 = str;
                    if (searchInfoResponse$TaxiSearch2 == null || (performerInfoResponse = searchInfoResponse$TaxiSearch2.f) == null) {
                        z = z3;
                        str2 = "";
                        driverCandidate = null;
                    } else {
                        fim fimVar = this.k;
                        fimVar.getClass();
                        String str14 = performerInfoResponse.a;
                        if (str14 == null) {
                            z = z3;
                            str2 = "";
                            driverCandidate2 = null;
                        } else {
                            z = z3;
                            String str15 = performerInfoResponse.g;
                            if (str15 == null || (str5 = ((m7x0) fimVar.a).a(str15)) == null) {
                                str5 = performerInfoResponse.h;
                            }
                            String str16 = str5;
                            String str17 = performerInfoResponse.b;
                            String str18 = str17 == null ? "" : str17;
                            List list = performerInfoResponse.c;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                SearchInfoResponse$TaxiSearch.PerformerInfoResponse.DriverPositionResponse driverPositionResponse = (SearchInfoResponse$TaxiSearch.PerformerInfoResponse.DriverPositionResponse) it.next();
                                String str19 = str11;
                                Double d = driverPositionResponse.c;
                                if (d != null) {
                                    double doubleValue = d.doubleValue();
                                    Double d2 = driverPositionResponse.b;
                                    if (d2 != null) {
                                        double doubleValue2 = d2.doubleValue();
                                        Double d3 = driverPositionResponse.a;
                                        if (d3 != null) {
                                            double doubleValue3 = d3.doubleValue();
                                            Double d4 = driverPositionResponse.d;
                                            double doubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
                                            String str20 = driverPositionResponse.e;
                                            if (str20 != null) {
                                                driverPosition = new DriverPosition(doubleValue, doubleValue2, doubleValue3, doubleValue4, str20);
                                                if (driverPosition == null) {
                                                    arrayList.add(driverPosition);
                                                }
                                                it = it2;
                                                str11 = str19;
                                            }
                                        }
                                    }
                                }
                                driverPosition = null;
                                if (driverPosition == null) {
                                }
                                it = it2;
                                str11 = str19;
                            }
                            str2 = str11;
                            driverCandidate2 = new DriverCandidate(str14, str18, performerInfoResponse.d, performerInfoResponse.e, performerInfoResponse.f, str16, arrayList);
                        }
                        driverCandidate = driverCandidate2;
                    }
                    ConcurrentHashMap concurrentHashMap = this.p;
                    Set set = (Set) concurrentHashMap.get(str9);
                    Set M0 = set != null ? kotlin.collections.a.M0(set) : new LinkedHashSet();
                    if (driverCandidate != null) {
                        M0.add(driverCandidate.a);
                        concurrentHashMap.put(str9, M0);
                    }
                    Set set2 = (Set) concurrentHashMap.get(str9);
                    int size = set2 != null ? set2.size() : 0;
                    boolean z4 = !z;
                    Boolean bool3 = (searchInfoResponse$TaxiSearch2 == null || (searchInfoResponse$DisplaySettings2 = searchInfoResponse$TaxiSearch2.h) == null) ? null : searchInfoResponse$DisplaySettings2.b;
                    boolean j = j(taxiOrder, bool3, searchInfoResponse$TaxiSearch2);
                    boolean z5 = (j && bool3 != null && bool3.booleanValue()) ? false : true;
                    Integer num2 = searchInfoResponse$TaxiSearch2 != null ? searchInfoResponse$TaxiSearch2.b : null;
                    if (searchInfoResponse$TaxiSearch2 == null || (accessibilityInfo = searchInfoResponse$TaxiSearch2.g) == null) {
                        searchAccessibilityValues = null;
                    } else {
                        String str21 = accessibilityInfo.a;
                        searchAccessibilityValues = new SearchAccessibilityValues(str21 == null ? str2 : str21);
                    }
                    boolean booleanValue2 = (searchInfoResponse$TaxiSearch2 == null || (searchInfoResponse$DisplaySettings = searchInfoResponse$TaxiSearch2.h) == null || (bool = searchInfoResponse$DisplaySettings.a) == null) ? false : bool.booleanValue();
                    boolean z6 = z;
                    a = SearchState.a(searchState2, str9, str12, i3, a2, candidateSearchState2, z4, eta, z2, str13, num2, z6, driverCandidate, j, z5, size, searchAccessibilityValues, booleanValue2, null, null, false, null, null, null, null, null, ImageMetadata.HOT_PIXEL_MODE);
                    str3 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$0 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$1 = searchInfoResponse$TaxiSearch2;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$2 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$3 = str9;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$4 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$5 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$6 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$7 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$8 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$9 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$10 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$11 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$12 = driverCandidate;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$13 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$14 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$15 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$16 = null;
                    searchInfoStateRepositoryImpl$updateSearchState$1.L$17 = a;
                    searchInfoStateRepositoryImpl$updateSearchState$1.I$0 = z6 ? 1 : 0;
                    searchInfoStateRepositoryImpl$updateSearchState$1.I$1 = z2 ? 1 : 0;
                    searchInfoStateRepositoryImpl$updateSearchState$1.I$2 = size;
                    searchInfoStateRepositoryImpl$updateSearchState$1.I$3 = z4 ? 1 : 0;
                    searchInfoStateRepositoryImpl$updateSearchState$1.Z$0 = j;
                    searchInfoStateRepositoryImpl$updateSearchState$1.I$4 = z5 ? 1 : 0;
                    searchInfoStateRepositoryImpl$updateSearchState$1.I$5 = booleanValue2 ? 1 : 0;
                    searchInfoStateRepositoryImpl$updateSearchState$1.label = 1;
                    if (p(a, searchInfoStateRepositoryImpl$updateSearchState$1) == obj2) {
                        return obj2;
                    }
                    str4 = str9;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = (SearchState) searchInfoStateRepositoryImpl$updateSearchState$1.L$17;
                    DriverCandidate driverCandidate3 = (DriverCandidate) searchInfoStateRepositoryImpl$updateSearchState$1.L$12;
                    str4 = (String) searchInfoStateRepositoryImpl$updateSearchState$1.L$3;
                    SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch3 = (SearchInfoResponse$TaxiSearch) searchInfoStateRepositoryImpl$updateSearchState$1.L$1;
                    kotlin.b.b(obj);
                    driverCandidate = driverCandidate3;
                    searchInfoResponse$TaxiSearch2 = searchInfoResponse$TaxiSearch3;
                    str3 = null;
                }
                str6 = driverCandidate == null ? driverCandidate.a : str3;
                ConcurrentHashMap concurrentHashMap2 = this.r;
                if (str6 != null) {
                    concurrentHashMap2.remove(str4);
                } else {
                    concurrentHashMap2.put(str4, str6);
                }
                if (searchInfoResponse$TaxiSearch2 != null) {
                    cne0 cne0Var = this.i.b;
                    cne0Var.t("Acceptance", v4r0.i(cne0Var.n("Acceptance"), str4));
                }
                xwp0Var = this.f;
                xwp0Var.getClass();
                Pair pair = new Pair(a.e.name().toLowerCase(Locale.ROOT), a.i);
                str7 = (String) pair.getFirst();
                str8 = (String) pair.getSecond();
                if (str8 != null && str8.length() != 0) {
                    xwp0Var.a.put(a.a, new OrderStatusParam.SearchStateInfoRequest(str7, str8));
                }
                return zy11.a;
            }
        }
        searchInfoStateRepositoryImpl$updateSearchState$1 = new SearchInfoStateRepositoryImpl$updateSearchState$1(this, continuationImpl);
        Object obj3 = searchInfoStateRepositoryImpl$updateSearchState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$updateSearchState$1.label;
        if (i != 0) {
        }
        if (driverCandidate == null) {
        }
        ConcurrentHashMap concurrentHashMap22 = this.r;
        if (str6 != null) {
        }
        if (searchInfoResponse$TaxiSearch2 != null) {
        }
        xwp0Var = this.f;
        xwp0Var.getClass();
        Pair pair2 = new Pair(a.e.name().toLowerCase(Locale.ROOT), a.i);
        str7 = (String) pair2.getFirst();
        str8 = (String) pair2.getSecond();
        if (str8 != null) {
            xwp0Var.a.put(a.a, new OrderStatusParam.SearchStateInfoRequest(str7, str8));
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(TaxiOrder taxiOrder, SearchInfoResponse$CompanionsSearch searchInfoResponse$CompanionsSearch, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$updateSearchStateByCompanions$1 searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1;
        int i;
        String str;
        Zone zone;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$updateSearchStateByCompanions$1) {
            searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1 = (SearchInfoStateRepositoryImpl$updateSearchStateByCompanions$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = taxiOrder.a;
                    ZoneAddress zoneAddress = taxiOrder.t().a;
                    String str3 = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : zone.a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    SearchState searchState = (SearchState) ((Map) this.o.getValue()).get(str2);
                    if (searchState == null) {
                        SearchState.Companion.getClass();
                        searchState = SearchState.A;
                    }
                    SearchState searchState2 = searchState;
                    OrderStatusInfo V = taxiOrder.V();
                    searchInfoResponse$CompanionsSearch.getClass();
                    SearchOverlayType a = this.c.a(taxiOrder, V, SearchOverlayType.SEARCH_COMPANIONS);
                    ServiceLevel.SearchingPulsarDTO.SearchingPulsar i3 = i(str2, false, a);
                    SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = searchInfoResponse$CompanionsSearch.d;
                    boolean j = j(taxiOrder, searchInfoResponse$DisplaySettings != null ? searchInfoResponse$DisplaySettings.b : null, searchInfoResponse$CompanionsSearch);
                    SearchState a2 = SearchState.a(searchState2, str2, str4, i3, a, null, false, null, false, null, null, false, null, j, true, 0, null, true, new Long(searchInfoResponse$CompanionsSearch.b), new Double(searchInfoResponse$CompanionsSearch.c), false, null, null, null, null, null, 33083216);
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$0 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$1 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$2 = str2;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$3 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$4 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$5 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$6 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$7 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$8 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.Z$0 = j;
                    searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.label = 1;
                    if (p(a2, searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1) == obj2) {
                        return obj2;
                    }
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.L$2;
                    kotlin.b.b(obj);
                }
                cne0 cne0Var = this.i.b;
                cne0Var.t("Acceptance", v4r0.i(cne0Var.n("Acceptance"), str));
                return zy11.a;
            }
        }
        searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1 = new SearchInfoStateRepositoryImpl$updateSearchStateByCompanions$1(this, continuationImpl);
        Object obj3 = searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$updateSearchStateByCompanions$1.label;
        if (i != 0) {
        }
        cne0 cne0Var2 = this.i.b;
        cne0Var2.t("Acceptance", v4r0.i(cne0Var2.n("Acceptance"), str));
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0118, code lost:
    
        if (kotlinx.coroutines.a.i(300, r4) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
    
        if (m(r1, r11, r3, r4) == r5) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(TaxiOrder taxiOrder, SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$updateSearchStateByTaxi$1 searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1;
        int i;
        SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse;
        TaxiOrder taxiOrder2 = taxiOrder;
        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch2 = searchInfoResponse$TaxiSearch;
        if (continuationImpl instanceof SearchInfoStateRepositoryImpl$updateSearchStateByTaxi$1) {
            searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1 = (SearchInfoStateRepositoryImpl$updateSearchStateByTaxi$1) continuationImpl;
            int i2 = searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = (String) this.r.get(taxiOrder2.a);
                    if (str == null) {
                        str = "";
                    }
                    String str2 = (searchInfoResponse$TaxiSearch2 == null || (performerInfoResponse = searchInfoResponse$TaxiSearch2.f) == null) ? null : performerInfoResponse.a;
                    String str3 = str2 != null ? str2 : "";
                    if (str.length() > 0 && str3.length() > 0 && !str.equals(str3)) {
                        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch3 = searchInfoResponse$TaxiSearch2 != null ? new SearchInfoResponse$TaxiSearch(SearchInfoResponse$TaxiSearch.CandidateSearchState.SEARCH, searchInfoResponse$TaxiSearch2.b, searchInfoResponse$TaxiSearch2.c, searchInfoResponse$TaxiSearch2.d, searchInfoResponse$TaxiSearch2.e, null, searchInfoResponse$TaxiSearch2.g, searchInfoResponse$TaxiSearch2.h, searchInfoResponse$TaxiSearch2.i) : null;
                        SearchOverlayType searchOverlayType = searchInfoResponse$TaxiSearch2 != null ? searchInfoResponse$TaxiSearch2.i : null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$0 = taxiOrder2;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$1 = searchInfoResponse$TaxiSearch2;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$2 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$3 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$4 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label = 1;
                    }
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$0 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$1 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$2 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$3 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$4 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label = 3;
                    Object m = m(taxiOrder2, searchInfoResponse$TaxiSearch2, null, searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1);
                    if (m != obj2) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch4 = (SearchInfoResponse$TaxiSearch) searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$1;
                        TaxiOrder taxiOrder3 = (TaxiOrder) searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$0;
                        kotlin.b.b(obj);
                        searchInfoResponse$TaxiSearch2 = searchInfoResponse$TaxiSearch4;
                        taxiOrder2 = taxiOrder3;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$0 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$1 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$2 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$3 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$4 = null;
                        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label = 3;
                        Object m2 = m(taxiOrder2, searchInfoResponse$TaxiSearch2, null, searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1);
                        return m2 != obj2 ? obj2 : m2;
                    }
                    SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch5 = (SearchInfoResponse$TaxiSearch) searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$1;
                    TaxiOrder taxiOrder4 = (TaxiOrder) searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$0;
                    kotlin.b.b(obj);
                    searchInfoResponse$TaxiSearch2 = searchInfoResponse$TaxiSearch5;
                    taxiOrder2 = taxiOrder4;
                    this.m.getClass();
                    a3y0.h(new String[]{"updateSearchStateByTaxi"});
                    hst hstVar = jst.e;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$0 = taxiOrder2;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$1 = searchInfoResponse$TaxiSearch2;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$2 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$3 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.L$4 = null;
                    searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label = 2;
                }
            }
        }
        searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1 = new SearchInfoStateRepositoryImpl$updateSearchStateByTaxi$1(this, continuationImpl);
        Object obj3 = searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$updateSearchStateByTaxi$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r9.a(r1) == r2) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(SearchState searchState, ContinuationImpl continuationImpl) {
        SearchInfoStateRepositoryImpl$updateState$1 searchInfoStateRepositoryImpl$updateState$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        r0 r0Var = this.o;
        try {
            if (continuationImpl instanceof SearchInfoStateRepositoryImpl$updateState$1) {
                searchInfoStateRepositoryImpl$updateState$1 = (SearchInfoStateRepositoryImpl$updateState$1) continuationImpl;
                int i2 = searchInfoStateRepositoryImpl$updateState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    searchInfoStateRepositoryImpl$updateState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = searchInfoStateRepositoryImpl$updateState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = searchInfoStateRepositoryImpl$updateState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        this.m.getClass();
                        a3y0.h(new String[]{"updateState"});
                        hst hstVar = jst.e;
                        searchInfoStateRepositoryImpl$updateState$1.L$0 = searchState;
                        aVar = this.n;
                        searchInfoStateRepositoryImpl$updateState$1.L$1 = aVar;
                        searchInfoStateRepositoryImpl$updateState$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ?? r8 = (g050) searchInfoStateRepositoryImpl$updateState$1.L$1;
                        SearchState searchState2 = (SearchState) searchInfoStateRepositoryImpl$updateState$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r8;
                        searchState = searchState2;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
                    linkedHashMap.put(searchState.a, searchState);
                    r0Var.getClass();
                    r0Var.m(null, linkedHashMap);
                    aVar.d(null);
                    searchInfoStateRepositoryImpl$updateState$1.L$0 = null;
                    searchInfoStateRepositoryImpl$updateState$1.L$1 = null;
                    searchInfoStateRepositoryImpl$updateState$1.label = 2;
                    Object c = this.e.c(searchState, searchInfoStateRepositoryImpl$updateState$1);
                    return c != coroutineSingletons ? coroutineSingletons : c;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) r0Var.getValue());
            linkedHashMap2.put(searchState.a, searchState);
            r0Var.getClass();
            r0Var.m(null, linkedHashMap2);
            aVar.d(null);
            searchInfoStateRepositoryImpl$updateState$1.L$0 = null;
            searchInfoStateRepositoryImpl$updateState$1.L$1 = null;
            searchInfoStateRepositoryImpl$updateState$1.label = 2;
            Object c2 = this.e.c(searchState, searchInfoStateRepositoryImpl$updateState$1);
            if (c2 != coroutineSingletons) {
            }
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        searchInfoStateRepositoryImpl$updateState$1 = new SearchInfoStateRepositoryImpl$updateState$1(this, continuationImpl);
        Object obj2 = searchInfoStateRepositoryImpl$updateState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$updateState$1.label;
        if (i != 0) {
        }
    }
}
