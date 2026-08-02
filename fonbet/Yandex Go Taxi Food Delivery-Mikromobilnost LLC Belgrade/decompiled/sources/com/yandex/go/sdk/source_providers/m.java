package com.yandex.go.sdk.source_providers;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class m implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ n b;

    public m(tpr tprVar, n nVar) {
        this.a = tprVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1 mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1) {
            mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1 = (MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b);
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1 = new MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
