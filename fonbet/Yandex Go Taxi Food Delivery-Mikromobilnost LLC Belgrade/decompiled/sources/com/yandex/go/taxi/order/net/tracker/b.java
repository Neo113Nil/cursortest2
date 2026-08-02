package com.yandex.go.taxi.order.net.tracker;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yay0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ yay0 b;

    public b(tpr tprVar, yay0 yay0Var) {
        this.a = tprVar;
        this.b = yay0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiTrackProducerProxy$startTracking$$inlined$map$1$1 taxiTrackProducerProxy$startTracking$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiTrackProducerProxy$startTracking$$inlined$map$1$1) {
            taxiTrackProducerProxy$startTracking$$inlined$map$1$1 = (TaxiTrackProducerProxy$startTracking$$inlined$map$1$1) continuation;
            int i2 = taxiTrackProducerProxy$startTracking$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiTrackProducerProxy$startTracking$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiTrackProducerProxy$startTracking$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiTrackProducerProxy$startTracking$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$1.L$0 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$1.L$1 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$1.L$2 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, taxiTrackProducerProxy$startTracking$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiTrackProducerProxy$startTracking$$inlined$map$1$1 = new TaxiTrackProducerProxy$startTracking$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiTrackProducerProxy$startTracking$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiTrackProducerProxy$startTracking$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
