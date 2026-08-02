package com.yandex.go.taxi.order.multi.tracking;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;

    public e(vpr vprVar, boolean z) {
        this.a = vprVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1 taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1) {
            taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1 = (TaxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1) continuation;
            int i2 = taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(this.b && !((Boolean) obj).booleanValue());
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.L$0 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.L$1 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.L$2 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.L$3 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1 = new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderTrackingPresenter$subscribePresenceMonitoring$lambda$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
