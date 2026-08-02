package com.yandex.go.taxi.order.net.xiva;

import defpackage.dw41;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ dw41 b;

    public c(kotlinx.coroutines.flow.internal.g gVar, dw41 dw41Var) {
        this.a = gVar;
        this.b = dw41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1 taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1) {
            taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1 = (TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1 = new TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiRouteWebSocketTrackingInteractor$setupSubscription$3$2$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
