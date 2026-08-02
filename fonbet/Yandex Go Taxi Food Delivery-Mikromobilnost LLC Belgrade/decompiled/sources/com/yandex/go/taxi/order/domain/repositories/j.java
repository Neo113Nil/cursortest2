package com.yandex.go.taxi.order.domain.repositories;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ n b;

    public j(kotlinx.coroutines.flow.internal.g gVar, n nVar) {
        this.a = gVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1 searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1;
        int i;
        if (continuation instanceof SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1) {
            searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1 = (SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1) continuation;
            int i2 = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar, this.b);
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.L$0 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.L$1 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.L$2 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.label = 1;
                    if (this.a.collect(iVar, searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1 = new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1(this, continuation);
        Object obj2 = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$registerSearchStateUpdates$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
