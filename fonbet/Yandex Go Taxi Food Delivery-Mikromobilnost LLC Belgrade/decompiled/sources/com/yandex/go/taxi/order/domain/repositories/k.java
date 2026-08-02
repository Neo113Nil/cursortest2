package com.yandex.go.taxi.order.domain.repositories;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ List b;

    public k(tpr[] tprVarArr, List list) {
        this.a = tprVarArr;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SearchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1 searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1;
        int i;
        if (continuation instanceof SearchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1) {
            searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1 = (SearchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1) continuation;
            int i2 = searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 21);
                    SearchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$3 searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$3 = new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$3(this.b, null);
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.L$0 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.L$1 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.L$2 = null;
                    searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, ab00Var, searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$3, searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1 = new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1(this, continuation);
        Object obj2 = searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchInfoStateRepositoryImpl$registerSearchStateUpdates$lambda$0$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
