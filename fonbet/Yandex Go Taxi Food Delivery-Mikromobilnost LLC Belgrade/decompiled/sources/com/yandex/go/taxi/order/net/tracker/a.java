package com.yandex.go.taxi.order.net.tracker;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.x;
import com.yandex.go.taxi.order.y;
import defpackage.bpt0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yay0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yay0 b;

    public a(vpr vprVar, yay0 yay0Var) {
        this.a = vprVar;
        this.b = yay0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiTrackProducerProxy$startTracking$$inlined$map$1$2$1 taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof TaxiTrackProducerProxy$startTracking$$inlined$map$1$2$1) {
            taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1 = (TaxiTrackProducerProxy$startTracking$$inlined$map$1$2$1) continuation;
            int i2 = taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    y yVar = this.b.b;
                    String str = ((TaxiOrder) obj).a;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$0 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$1 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$2 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$4 = vprVar;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$5 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$6 = null;
                    taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.label = 1;
                    bpt0 i3 = yVar.i(str);
                    obj2 = i3 != null ? i3 : kotlinx.coroutines.flow.e.y(new x(yVar.s, str), taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$0 = null;
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$1 = null;
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$2 = null;
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$3 = null;
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$4 = null;
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$5 = null;
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$6 = null;
                taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.label = 2;
            }
        }
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1 = new TaxiTrackProducerProxy$startTracking$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$0 = null;
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$1 = null;
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$2 = null;
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$3 = null;
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$4 = null;
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$5 = null;
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.L$6 = null;
        taxiTrackProducerProxy$startTracking$$inlined$map$1$2$1.label = 2;
    }
}
