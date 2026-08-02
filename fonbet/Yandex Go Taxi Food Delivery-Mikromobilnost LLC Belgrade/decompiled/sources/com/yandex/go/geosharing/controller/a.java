package com.yandex.go.geosharing.controller;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GeoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1 geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1;
        int i;
        DriveState driveState;
        if (continuation instanceof GeoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1) {
            geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1 = (GeoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1) continuation;
            int i2 = geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e eVar = this.b;
                    if (eVar.d() && ((driveState = eVar.r) == DriveState.SEARCH || driveState == DriveState.DRIVING || driveState == DriveState.WAITING)) {
                        geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.L$0 = null;
                        geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.L$1 = null;
                        geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.L$2 = null;
                        geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.L$3 = null;
                        geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1 = new GeoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingControllerImpl$subscribeForLocationUpdates$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
