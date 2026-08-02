package com.yandex.go.scooters.parking.data;

import com.yandex.go.scooters.parking.data.model.ScootersParkingDescriptionExperiment;
import defpackage.dqt;
import defpackage.nbo0;
import defpackage.ny61;
import defpackage.rbo0;
import defpackage.sbo0;
import defpackage.vam0;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements sbo0 {
    public final dqt a;
    public final nbo0 b;

    public a(dqt dqtVar, nbo0 nbo0Var) {
        this.a = dqtVar;
        this.b = nbo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, ContinuationImpl continuationImpl) {
        ScootersParkingPanoramaPreviewFactoryImpl$create$1 scootersParkingPanoramaPreviewFactoryImpl$create$1;
        int i;
        ScootersParkingDescriptionExperiment scootersParkingDescriptionExperiment;
        if (continuationImpl instanceof ScootersParkingPanoramaPreviewFactoryImpl$create$1) {
            scootersParkingPanoramaPreviewFactoryImpl$create$1 = (ScootersParkingPanoramaPreviewFactoryImpl$create$1) continuationImpl;
            int i2 = scootersParkingPanoramaPreviewFactoryImpl$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersParkingPanoramaPreviewFactoryImpl$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersParkingPanoramaPreviewFactoryImpl$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersParkingPanoramaPreviewFactoryImpl$create$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersParkingPanoramaPreviewFactoryImpl$create$1.L$0 = zzsVar;
                    scootersParkingPanoramaPreviewFactoryImpl$create$1.label = 1;
                    obj = this.b.a.b(scootersParkingPanoramaPreviewFactoryImpl$create$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzsVar = (zzs) scootersParkingPanoramaPreviewFactoryImpl$create$1.L$0;
                    b.b(obj);
                }
                scootersParkingDescriptionExperiment = (ScootersParkingDescriptionExperiment) obj;
                if (scootersParkingDescriptionExperiment.b) {
                    return null;
                }
                String str = (String) scootersParkingDescriptionExperiment.c.get(scootersParkingDescriptionExperiment.d.c.d.a);
                if (str == null) {
                    str = "";
                }
                return new rbo0(str, zzsVar, new vam0(23, this, zzsVar));
            }
        }
        scootersParkingPanoramaPreviewFactoryImpl$create$1 = new ScootersParkingPanoramaPreviewFactoryImpl$create$1(this, continuationImpl);
        Object obj2 = scootersParkingPanoramaPreviewFactoryImpl$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersParkingPanoramaPreviewFactoryImpl$create$1.label;
        if (i != 0) {
        }
        scootersParkingDescriptionExperiment = (ScootersParkingDescriptionExperiment) obj2;
        if (scootersParkingDescriptionExperiment.b) {
        }
    }
}
