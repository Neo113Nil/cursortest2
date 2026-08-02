package com.yandex.go.taxi.order.net.xiva;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.dw41;
import defpackage.hst;
import defpackage.jst;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ dw41 b;

    public b(vpr vprVar, dw41 dw41Var) {
        this.a = vprVar;
        this.b = dw41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1 taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1) {
            taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1 = (TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    WebSocketTrackingExperiment a = dw41.a((TaxiOrder) obj);
                    boolean z = a.b;
                    boolean z2 = a.d;
                    hst hstVar = jst.e;
                    Boolean valueOf = Boolean.valueOf(z && z2);
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1 = new TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
