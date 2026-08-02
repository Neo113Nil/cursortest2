package com.yandex.go.taxi.order.superapp.orders;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ n b;

    public i(tpr[] tprVarArr, n nVar) {
        this.a = tprVarArr;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1 taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1;
        int i;
        if (continuation instanceof TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1) {
            taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1 = (TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1) continuation;
            int i2 = taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 11);
                    TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3 taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3 = new TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3(null, this.b);
                    taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.L$0 = null;
                    taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.L$1 = null;
                    taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.L$2 = null;
                    taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, akt0Var, taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3, taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1 = new TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1(this, continuation);
        Object obj2 = taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
