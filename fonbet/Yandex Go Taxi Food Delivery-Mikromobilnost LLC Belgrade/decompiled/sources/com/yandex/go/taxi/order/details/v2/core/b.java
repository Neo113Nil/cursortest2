package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ c b;
    public final /* synthetic */ RideCardPresentationType c;

    public b(g gVar, c cVar, RideCardPresentationType rideCardPresentationType) {
        this.a = gVar;
        this.b = cVar;
        this.c = rideCardPresentationType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1 rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1) {
            rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1 = (RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1 = new RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
