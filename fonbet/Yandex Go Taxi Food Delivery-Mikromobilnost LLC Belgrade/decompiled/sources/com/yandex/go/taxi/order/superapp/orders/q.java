package com.yandex.go.taxi.order.superapp.orders;

import defpackage.ny61;
import defpackage.q6y0;
import defpackage.r1y0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ q6y0 b;
    public final /* synthetic */ r1y0 c;

    public q(tpr tprVar, q6y0 q6y0Var, r1y0 r1y0Var) {
        this.a = tprVar;
        this.b = q6y0Var;
        this.c = r1y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1 taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1) {
            taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1 = (TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1) continuation;
            int i2 = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b, this.c);
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.L$0 = null;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.L$1 = null;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.L$2 = null;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1 = new TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
