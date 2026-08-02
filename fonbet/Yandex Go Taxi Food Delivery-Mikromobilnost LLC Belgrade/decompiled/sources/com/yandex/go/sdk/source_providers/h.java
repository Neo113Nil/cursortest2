package com.yandex.go.sdk.source_providers;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class h implements tpr {
    public final /* synthetic */ tpr a;

    public h(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1 lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1) {
            lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1 = (LbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar);
                    lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(gVar, lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1 = new LbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsWifiLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
