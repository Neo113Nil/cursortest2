package com.yandex.go.superapp.tracking.domain;

import defpackage.ny61;
import defpackage.u401;
import defpackage.vpr;
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
        TrackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1 trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TrackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1) {
            trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1 = (TrackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1) continuation;
            int i2 = trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    u401 u401Var = new u401((String) obj);
                    trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.L$0 = null;
                    trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.L$1 = null;
                    trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.L$2 = null;
                    trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.L$3 = null;
                    trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(u401Var, trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1 = new TrackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardDtoInteractorImpl$getStatusTrailFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
