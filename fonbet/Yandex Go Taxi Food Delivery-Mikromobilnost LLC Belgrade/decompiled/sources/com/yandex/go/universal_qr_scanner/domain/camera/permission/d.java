package com.yandex.go.universal_qr_scanner.domain.camera.permission;

import com.yandex.go.universal_qr_scanner.experiments.config.e;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.pz11;
import defpackage.sz11;
import defpackage.tz11;
import defpackage.uz11;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class d {
    public final h3y a;
    public final pz11 b;

    public d(h3y h3yVar, pz11 pz11Var) {
        this.a = h3yVar;
        this.b = pz11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, UniversalQrScannerCameraPermissionState universalQrScannerCameraPermissionState, ContinuationImpl continuationImpl) {
        UniversalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1 universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof UniversalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1) {
            universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1 = (UniversalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1) continuationImpl;
            int i2 = universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = tz11.a[universalQrScannerCameraPermissionState.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            w511.b();
                        }
                        return null;
                    }
                    e eVar = (e) dVar.a.get();
                    universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.L$0 = null;
                    universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.label = 1;
                    obj = eVar.a(universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1);
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
                uz11 uz11Var = (uz11) obj;
                return new sz11(uz11Var.a, uz11Var.b, uz11Var.c);
            }
        }
        universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1 = new UniversalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1(dVar, continuationImpl);
        Object obj2 = universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1.label;
        if (i != 0) {
        }
        uz11 uz11Var2 = (uz11) obj2;
        return new sz11(uz11Var2.a, uz11Var2.b, uz11Var2.c);
    }
}
