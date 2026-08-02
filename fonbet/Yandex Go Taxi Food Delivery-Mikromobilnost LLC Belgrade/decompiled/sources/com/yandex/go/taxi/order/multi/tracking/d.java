package com.yandex.go.taxi.order.multi.tracking;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;

    public d(kotlinx.coroutines.flow.internal.g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1 taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1) {
            taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1 = (TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1) continuation;
            int i2 = taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.L$0 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.L$1 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.L$2 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1 = new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
