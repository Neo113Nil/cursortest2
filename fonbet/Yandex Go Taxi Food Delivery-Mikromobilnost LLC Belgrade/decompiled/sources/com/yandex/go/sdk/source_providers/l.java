package com.yandex.go.sdk.source_providers;

import android.location.Location;
import defpackage.k7z;
import defpackage.ny61;
import defpackage.udq0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public l(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1 mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1) {
            mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1 = (MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    n nVar = this.b;
                    k7z S = udq0.S((Location) obj, nVar.b, nVar.c);
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(S, mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1 = new MapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapkitLocationProvider$requestLocationUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
