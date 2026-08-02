package com.yandex.go;

import defpackage.k7z;
import defpackage.ny61;
import defpackage.o9z;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1 locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LocationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1) {
            locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1 = (LocationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1) continuation;
            int i2 = locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o9z l = this.b.l((k7z) obj);
                    locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.L$0 = null;
                    locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.L$1 = null;
                    locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.L$2 = null;
                    locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.L$3 = null;
                    locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1 = new LocationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$requestOutputLocationsAndPushToFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
