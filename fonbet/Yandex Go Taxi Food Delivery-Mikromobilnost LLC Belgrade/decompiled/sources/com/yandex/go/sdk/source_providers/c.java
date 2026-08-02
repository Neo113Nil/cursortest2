package com.yandex.go.sdk.source_providers;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;

    public c(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1 lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1) {
            lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1 = (LbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(bVar, lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1 = new LbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsGsmLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
