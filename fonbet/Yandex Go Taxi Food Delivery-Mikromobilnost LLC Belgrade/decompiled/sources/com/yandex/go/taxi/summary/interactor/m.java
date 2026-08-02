package com.yandex.go.taxi.summary.interactor;

import defpackage.ny61;
import defpackage.pox0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class m implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ pox0 b;

    public m(tpr tprVar, pox0 pox0Var) {
        this.a = tprVar;
        this.b = pox0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1 summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1) {
            summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1 = (SummarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1) continuation;
            int i2 = summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b);
                    summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.L$0 = null;
                    summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.L$1 = null;
                    summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.L$2 = null;
                    summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1 = new SummarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summarySourceDestinationModelInteractor$rideTimeIconFlow$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
