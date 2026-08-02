package com.yandex.go.taxi.order.state.search;

import defpackage.auu0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.j73;
import defpackage.k8u;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public static final k8u d = new k8u(auu0.a, SearchState.Companion.serializer(), 1);
    public final wnt a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public final cne0 c;

    public b(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.c = dne0Var.a("SearchInfoPersistStorage");
    }

    public final Map a() {
        Object failure;
        try {
            String l = this.c.l("statesList", null);
            failure = l != null ? (Map) ((xnt) this.a).c(l, d) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Map map = (Map) (failure instanceof Result.Failure ? null : failure);
        return map == null ? kotlin.collections.b.f() : map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x0077, LOOP:0: B:12:0x0067->B:14:0x006d, LOOP_END, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:12:0x0067, B:14:0x006d, B:16:0x0079), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String[] strArr, ContinuationImpl continuationImpl) {
        SearchInfoStateLocalDataSource$removeOutdatedOrders$1 searchInfoStateLocalDataSource$removeOutdatedOrders$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Iterator it;
        try {
            if (continuationImpl instanceof SearchInfoStateLocalDataSource$removeOutdatedOrders$1) {
                searchInfoStateLocalDataSource$removeOutdatedOrders$1 = (SearchInfoStateLocalDataSource$removeOutdatedOrders$1) continuationImpl;
                int i2 = searchInfoStateLocalDataSource$removeOutdatedOrders$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    searchInfoStateLocalDataSource$removeOutdatedOrders$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = searchInfoStateLocalDataSource$removeOutdatedOrders$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = searchInfoStateLocalDataSource$removeOutdatedOrders$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        searchInfoStateLocalDataSource$removeOutdatedOrders$1.L$0 = strArr;
                        aVar = this.b;
                        searchInfoStateLocalDataSource$removeOutdatedOrders$1.L$1 = aVar;
                        searchInfoStateLocalDataSource$removeOutdatedOrders$1.label = 1;
                        if (aVar.a(searchInfoStateLocalDataSource$removeOutdatedOrders$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) searchInfoStateLocalDataSource$removeOutdatedOrders$1.L$1;
                        String[] strArr2 = (String[]) searchInfoStateLocalDataSource$removeOutdatedOrders$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        strArr = strArr2;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a());
                    it = v4r0.g(linkedHashMap.keySet(), j73.f0(strArr)).iterator();
                    while (it.hasNext()) {
                        linkedHashMap.remove((String) it.next());
                    }
                    cne0 cne0Var = this.c;
                    cne0Var.r("statesList", ((xnt) this.a).e(linkedHashMap, d));
                    cne0Var.b();
                    aVar.d(null);
                    return zy11.a;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a());
            it = v4r0.g(linkedHashMap2.keySet(), j73.f0(strArr)).iterator();
            while (it.hasNext()) {
            }
            cne0 cne0Var2 = this.c;
            cne0Var2.r("statesList", ((xnt) this.a).e(linkedHashMap2, d));
            cne0Var2.b();
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        searchInfoStateLocalDataSource$removeOutdatedOrders$1 = new SearchInfoStateLocalDataSource$removeOutdatedOrders$1(this, continuationImpl);
        Object obj2 = searchInfoStateLocalDataSource$removeOutdatedOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateLocalDataSource$removeOutdatedOrders$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(SearchState searchState, ContinuationImpl continuationImpl) {
        SearchInfoStateLocalDataSource$update$1 searchInfoStateLocalDataSource$update$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof SearchInfoStateLocalDataSource$update$1) {
                searchInfoStateLocalDataSource$update$1 = (SearchInfoStateLocalDataSource$update$1) continuationImpl;
                int i2 = searchInfoStateLocalDataSource$update$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    searchInfoStateLocalDataSource$update$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = searchInfoStateLocalDataSource$update$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = searchInfoStateLocalDataSource$update$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        searchInfoStateLocalDataSource$update$1.L$0 = searchState;
                        aVar = this.b;
                        searchInfoStateLocalDataSource$update$1.L$1 = aVar;
                        searchInfoStateLocalDataSource$update$1.label = 1;
                        if (aVar.a(searchInfoStateLocalDataSource$update$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) searchInfoStateLocalDataSource$update$1.L$1;
                        SearchState searchState2 = (SearchState) searchInfoStateLocalDataSource$update$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        searchState = searchState2;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a());
                    linkedHashMap.put(searchState.a, searchState);
                    cne0 cne0Var = this.c;
                    cne0Var.r("statesList", ((xnt) this.a).e(linkedHashMap, d));
                    cne0Var.b();
                    aVar.d(null);
                    return zy11.a;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a());
            linkedHashMap2.put(searchState.a, searchState);
            cne0 cne0Var2 = this.c;
            cne0Var2.r("statesList", ((xnt) this.a).e(linkedHashMap2, d));
            cne0Var2.b();
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        searchInfoStateLocalDataSource$update$1 = new SearchInfoStateLocalDataSource$update$1(this, continuationImpl);
        Object obj2 = searchInfoStateLocalDataSource$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateLocalDataSource$update$1.label;
        if (i != 0) {
        }
    }
}
