package com.yandex.go.navigator.gas_stations.repositories;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.ows;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ows b;

    public e(gci0 gci0Var, ows owsVar) {
        this.a = gci0Var;
        this.b = owsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1 gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1) {
            gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1 = (GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1) continuation;
            int i2 = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.L$0 = null;
                    gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.L$1 = null;
                    gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.L$2 = null;
                    gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(dVar, gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1 = new GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
