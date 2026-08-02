package com.yandex.go.taxi.order.net.tracker;

import defpackage.bpt0;
import defpackage.fag;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.vpr;
import defpackage.zay0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiTrackProducerProxy$startTracking$$inlined$map$2$2$1 taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof TaxiTrackProducerProxy$startTracking$$inlined$map$2$2$1) {
            taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1 = (TaxiTrackProducerProxy$startTracking$$inlined$map$2$2$1) continuation;
            int i2 = taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zay0 zay0Var = (zay0) ((fag) ((bpt0) obj)).E.get();
                    q5z.i(zay0Var);
                    taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.L$0 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.L$1 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.L$2 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.L$3 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(zay0Var, taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1) == coroutineSingletons) {
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
        taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1 = new TaxiTrackProducerProxy$startTracking$$inlined$map$2$2$1(this, continuation);
        Object obj22 = taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiTrackProducerProxy$startTracking$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
