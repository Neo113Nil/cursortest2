package com.yandex.go.navigator.gas_stations.overview;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class g implements tpr {
    public final /* synthetic */ com.yandex.go.navigator.gas_stations.repositories.e a;

    public g(com.yandex.go.navigator.gas_stations.repositories.e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1 gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1;
        int i;
        if (continuation instanceof GasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1) {
            gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1 = (GasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1) continuation;
            int i2 = gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar);
                    gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.L$0 = null;
                    gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.L$1 = null;
                    gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.L$2 = null;
                    gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1) == coroutineSingletons) {
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
        gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1 = new GasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1(this, continuation);
        Object obj2 = gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewPresenter$renderModalExpansion$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
