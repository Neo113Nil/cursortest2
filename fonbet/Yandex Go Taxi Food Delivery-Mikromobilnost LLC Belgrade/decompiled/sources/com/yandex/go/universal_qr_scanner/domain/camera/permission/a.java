package com.yandex.go.universal_qr_scanner.domain.camera.permission;

import defpackage.ny61;
import defpackage.pz11;
import defpackage.v7j0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final v7j0 a;
    public final pz11 b;

    public a(v7j0 v7j0Var, pz11 pz11Var) {
        this.a = v7j0Var;
        this.b = pz11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UniversalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1 universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof UniversalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1) {
            universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1 = (UniversalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1) continuationImpl;
            int i2 = universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.a).d(3, universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1);
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
                Boolean bool = (Boolean) obj;
                booleanValue = bool.booleanValue();
                pz11 pz11Var = this.b;
                if (booleanValue) {
                    pz11Var.a.l(UniversalQrScannerCameraPermissionState.FORBIDDEN);
                } else {
                    pz11Var.a.l(UniversalQrScannerCameraPermissionState.GRANTED);
                }
                return bool;
            }
        }
        universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1 = new UniversalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1(this, continuationImpl);
        Object obj2 = universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerCameraPermissionInteractor$requestCameraPermissionIfNeed$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        booleanValue = bool2.booleanValue();
        pz11 pz11Var2 = this.b;
        if (booleanValue) {
        }
        return bool2;
    }
}
