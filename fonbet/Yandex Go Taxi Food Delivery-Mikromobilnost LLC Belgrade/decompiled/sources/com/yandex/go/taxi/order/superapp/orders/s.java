package com.yandex.go.taxi.order.superapp.orders;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class s implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.k a;

    public s(kotlinx.coroutines.flow.k kVar) {
        this.a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1 taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1) {
            taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1 = (TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1) continuation;
            int i2 = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = new r(vprVar);
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.L$0 = null;
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.L$1 = null;
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.L$2 = null;
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(rVar, taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1 = new TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
