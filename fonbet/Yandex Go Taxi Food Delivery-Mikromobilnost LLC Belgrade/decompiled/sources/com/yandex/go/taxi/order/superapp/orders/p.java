package com.yandex.go.taxi.order.superapp.orders;

import defpackage.ack0;
import defpackage.cck0;
import defpackage.ny61;
import defpackage.q6y0;
import defpackage.r1y0;
import defpackage.vpr;
import defpackage.z4y0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q6y0 b;
    public final /* synthetic */ r1y0 c;

    public p(vpr vprVar, q6y0 q6y0Var, r1y0 r1y0Var) {
        this.a = vprVar;
        this.b = q6y0Var;
        this.c = r1y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1 taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1) {
            taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1 = (TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object z4y0Var = ((cck0) obj) instanceof ack0 ? new z4y0(this.b.c) : this.c;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(z4y0Var, taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1 = new TaxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFlowTrackingSourceRepository$gateRideCardModels$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
