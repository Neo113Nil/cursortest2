package com.yandex.go.scooters.misc.vehicle_actual_photo.data;

import com.yandex.go.scooters.misc.vehicle_actual_photo.data.model.ScootersVehicleActualPhotoV1Params;
import com.yandex.go.scooters.misc.vehicle_actual_photo.data.model.ScootersVehicleActualPhotoV1Response;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.r7p0;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.scooters.data.a a;
    public final ScootersVehicleActualPhotoApi b;

    public a(ru.yandex.taxi.scooters.data.a aVar, ScootersVehicleActualPhotoApi scootersVehicleActualPhotoApi) {
        this.a = aVar;
        this.b = scootersVehicleActualPhotoApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r9 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r7p0 r7p0Var, ContinuationImpl continuationImpl) {
        ScootersVehicleActualPhotoRepository$getVehicleActualPhoto$1 scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1;
        int i;
        ScootersVehicleActualPhotoApi scootersVehicleActualPhotoApi;
        if (continuationImpl instanceof ScootersVehicleActualPhotoRepository$getVehicleActualPhoto$1) {
            scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1 = (ScootersVehicleActualPhotoRepository$getVehicleActualPhoto$1) continuationImpl;
            int i2 = scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$0 = r7p0Var;
                    ScootersVehicleActualPhotoApi scootersVehicleActualPhotoApi2 = this.b;
                    scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$1 = scootersVehicleActualPhotoApi2;
                    scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.label = 1;
                    Object a = this.a.a(false, scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersVehicleActualPhotoApi = scootersVehicleActualPhotoApi2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return ((ScootersVehicleActualPhotoV1Response) obj).a;
                }
                scootersVehicleActualPhotoApi = (ScootersVehicleActualPhotoApi) scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$1;
                r7p0Var = (r7p0) scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$0;
                b.b(obj);
                cmt<ScootersVehicleActualPhotoV1Response> a2 = scootersVehicleActualPhotoApi.a((Map) obj, new ScootersVehicleActualPhotoV1Params(r7p0Var.b.k(), r7p0Var.a));
                scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$0 = null;
                scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$1 = null;
                scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(a2, null, scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1);
            }
        }
        scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1 = new ScootersVehicleActualPhotoRepository$getVehicleActualPhoto$1(this, continuationImpl);
        Object obj2 = scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.label;
        if (i != 0) {
        }
        cmt<ScootersVehicleActualPhotoV1Response> a22 = scootersVehicleActualPhotoApi.a((Map) obj2, new ScootersVehicleActualPhotoV1Params(r7p0Var.b.k(), r7p0Var.a));
        scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$0 = null;
        scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.L$1 = null;
        scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.a(a22, null, scootersVehicleActualPhotoRepository$getVehicleActualPhoto$1);
    }
}
