package com.yandex.go.universal_qr_scanner.domain.camera.permission;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ d b;

    public c(r0 r0Var, d dVar) {
        this.a = r0Var;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UniversalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1 universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof UniversalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1) {
            universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1 = (UniversalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.L$0 = null;
                    universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.L$1 = null;
                    universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.L$2 = null;
                    universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1 = new UniversalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerCameraPermissionUiStateInteractor$cameraPermissionUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
