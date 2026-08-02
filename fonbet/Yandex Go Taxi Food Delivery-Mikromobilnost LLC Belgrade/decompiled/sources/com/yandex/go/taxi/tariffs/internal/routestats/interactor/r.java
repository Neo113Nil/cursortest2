package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.m49;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class r implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ Zone c;

    public r(tpr[] tprVarArr, a0 a0Var, Zone zone) {
        this.a = tprVarArr;
        this.b = a0Var;
        this.c = zone;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteStatsDataInteractor$dataFlow$$inlined$combine$1$1 routeStatsDataInteractor$dataFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof RouteStatsDataInteractor$dataFlow$$inlined$combine$1$1) {
            routeStatsDataInteractor$dataFlow$$inlined$combine$1$1 = (RouteStatsDataInteractor$dataFlow$$inlined$combine$1$1) continuation;
            int i2 = routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    m49 m49Var = new m49(tprVarArr, 5);
                    RouteStatsDataInteractor$dataFlow$$inlined$combine$1$3 routeStatsDataInteractor$dataFlow$$inlined$combine$1$3 = new RouteStatsDataInteractor$dataFlow$$inlined$combine$1$3(null, this.b, this.c);
                    routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.L$0 = null;
                    routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.L$1 = null;
                    routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.L$2 = null;
                    routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, m49Var, routeStatsDataInteractor$dataFlow$$inlined$combine$1$3, routeStatsDataInteractor$dataFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        routeStatsDataInteractor$dataFlow$$inlined$combine$1$1 = new RouteStatsDataInteractor$dataFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStatsDataInteractor$dataFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
