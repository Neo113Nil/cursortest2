package com.yandex.go.universal_qr_scanner.domain.torch;

import com.yandex.go.universal_qr_scanner.domain.camera.permission.UniversalQrScannerCameraPermissionState;
import defpackage.d121;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        UniversalQrScannerTorchState universalQrScannerTorchState;
        b bVar = this.a;
        bVar.getClass();
        int i = d121.a[((UniversalQrScannerCameraPermissionState) obj).ordinal()];
        if (i == 1 || i == 2) {
            universalQrScannerTorchState = UniversalQrScannerTorchState.DISABLED;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            universalQrScannerTorchState = UniversalQrScannerTorchState.NOT_AVAILABLE;
        }
        Object b = bVar.c.b(new UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2(bVar, universalQrScannerTorchState, false, null), continuation);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
