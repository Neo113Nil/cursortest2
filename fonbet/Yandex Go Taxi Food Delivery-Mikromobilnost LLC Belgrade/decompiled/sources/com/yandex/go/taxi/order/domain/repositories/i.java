package com.yandex.go.taxi.order.domain.repositories;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public i(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1 searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1) {
            searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1 = (SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1) continuation;
            int i2 = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (this.b.l.contains(((o2y0) obj3).c())) {
                            arrayList.add(obj3);
                        }
                    }
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.L$0 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.L$1 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.L$2 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.L$3 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1) == coroutineSingletons) {
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
        searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1 = new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1(this, continuation);
        Object obj22 = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
