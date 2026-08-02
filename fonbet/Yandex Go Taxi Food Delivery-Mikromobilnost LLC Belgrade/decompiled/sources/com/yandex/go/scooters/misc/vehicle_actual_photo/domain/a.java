package com.yandex.go.scooters.misc.vehicle_actual_photo.domain;

import com.yandex.go.scooters.misc.vehicle_actual_photo.data.model.ScootersVehicleActualPhotoV1Response;
import defpackage.ny61;
import defpackage.r7p0;
import defpackage.x6p0;
import defpackage.y6p0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements y6p0 {
    public final com.yandex.go.scooters.misc.vehicle_actual_photo.data.mapper.a a;
    public final com.yandex.go.scooters.misc.vehicle_actual_photo.data.a b;

    public a(com.yandex.go.scooters.misc.vehicle_actual_photo.data.mapper.a aVar, com.yandex.go.scooters.misc.vehicle_actual_photo.data.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(2:19|20))(3:27|28|(2:30|25))|21|(1:23)|26))|34|6|7|(0)(0)|21|(0)|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: all -> 0x0067, CancellationException -> 0x0068, TryCatch #2 {CancellationException -> 0x0068, all -> 0x0067, blocks: (B:12:0x002f, B:13:0x0064, B:20:0x003d, B:21:0x0051, B:23:0x0055, B:28:0x0044), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r7p0 r7p0Var, ContinuationImpl continuationImpl) {
        ScootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1 scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1;
        int i;
        ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder photoFromLastOrder;
        if (continuationImpl instanceof ScootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1) {
            scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1 = (ScootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1) continuationImpl;
            int i2 = scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.go.scooters.misc.vehicle_actual_photo.data.a aVar = this.b;
                    scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.L$0 = null;
                    scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.label = 1;
                    obj = aVar.a(r7p0Var, scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return (x6p0) obj;
                    }
                    b.b(obj);
                }
                photoFromLastOrder = (ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder) obj;
                if (photoFromLastOrder != null) {
                    com.yandex.go.scooters.misc.vehicle_actual_photo.data.mapper.a aVar2 = this.a;
                    scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.L$0 = null;
                    scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.L$1 = null;
                    scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.label = 2;
                    obj = aVar2.a(photoFromLastOrder, scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1);
                }
                return null;
            }
        }
        scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1 = new ScootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1(this, continuationImpl);
        Object obj2 = scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVehicleActualPhotoInteractorImpl$getVehicleActualPhoto$1.label;
        if (i != 0) {
        }
        photoFromLastOrder = (ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder) obj2;
        if (photoFromLastOrder != null) {
        }
        return null;
    }
}
