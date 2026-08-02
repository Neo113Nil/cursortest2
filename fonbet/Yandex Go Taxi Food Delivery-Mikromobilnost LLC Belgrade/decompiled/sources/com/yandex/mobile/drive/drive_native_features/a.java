package com.yandex.mobile.drive.drive_native_features;

import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1 driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1;
        int i;
        if (continuationImpl instanceof DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1) {
            driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1 = (DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1) continuationImpl;
            int i2 = driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = b.B;
                    DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2 driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2 = new DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2(2, null);
                    driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1.label = 1;
                    obj = e.x(r0Var, driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2, driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return obj;
            }
        }
        driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1 = new DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1(this, continuationImpl);
        Object obj2 = driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$1.label;
        if (i != 0) {
        }
        return obj2;
    }
}
