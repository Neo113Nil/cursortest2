package com.yandex.go.config;

import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import defpackage.e7z;
import defpackage.f7z;
import defpackage.h7z;
import defpackage.ny61;
import defpackage.rcz;
import defpackage.vpr;
import defpackage.wnp0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public a(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1 locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        Object failure;
        if (continuation instanceof LocationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1) {
            locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1 = (LocationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LocationSdkAndroidGoExperiment locationSdkAndroidGoExperiment = (LocationSdkAndroidGoExperiment) obj;
                    rcz rczVar = this.b.b;
                    boolean z = locationSdkAndroidGoExperiment.b;
                    Object obj3 = e7z.a;
                    if (z) {
                        try {
                            failure = h7z.a(locationSdkAndroidGoExperiment);
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        ru.yandex.taxi.locationsdk.core.utils.a.d(failure, rczVar, "SdkConfigMapping", new Pair[0]);
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        wnp0 wnp0Var = (wnp0) failure;
                        if (wnp0Var != null) {
                            obj3 = new f7z(locationSdkAndroidGoExperiment.c, locationSdkAndroidGoExperiment.d, wnp0Var);
                        }
                    }
                    locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1 = new LocationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationConfigProvider$initialize$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
