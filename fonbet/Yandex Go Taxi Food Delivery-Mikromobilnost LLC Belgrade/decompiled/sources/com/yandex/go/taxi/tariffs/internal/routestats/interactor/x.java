package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class x implements tpr {
    public final /* synthetic */ t a;
    public final /* synthetic */ a0 b;

    public x(t tVar, a0 a0Var) {
        this.a = tVar;
        this.b = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1 routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1;
        int i;
        if (continuation instanceof RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1) {
            routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1 = (RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1) continuation;
            int i2 = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w wVar = new w(vprVar, this.b);
                    routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.L$0 = null;
                    routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.L$1 = null;
                    routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.L$2 = null;
                    routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.label = 1;
                    if (this.a.collect(wVar, routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1) == coroutineSingletons) {
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
        routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1 = new RouteStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1(this, continuation);
        Object obj2 = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStatsDataInteractor$rsRoute$$inlined$mapNotNull$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
