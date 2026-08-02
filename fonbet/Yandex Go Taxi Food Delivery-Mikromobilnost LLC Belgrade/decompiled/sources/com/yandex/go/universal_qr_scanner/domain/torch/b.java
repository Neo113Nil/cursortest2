package com.yandex.go.universal_qr_scanner.domain.torch;

import defpackage.bvf0;
import defpackage.f121;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pz11;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final tt2 a;
    public final f121 b;
    public final com.yandex.go.universal_qr_scanner.domain.camera.a c;
    public final pz11 d;

    public b(tt2 tt2Var, f121 f121Var, com.yandex.go.universal_qr_scanner.domain.camera.a aVar, pz11 pz11Var) {
        this.a = tt2Var;
        this.b = f121Var;
        this.c = aVar;
        this.d = pz11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UniversalQrScannerTorchInteractor$observeCameraPermissionState$1 universalQrScannerTorchInteractor$observeCameraPermissionState$1;
        int i;
        if (continuationImpl instanceof UniversalQrScannerTorchInteractor$observeCameraPermissionState$1) {
            universalQrScannerTorchInteractor$observeCameraPermissionState$1 = (UniversalQrScannerTorchInteractor$observeCameraPermissionState$1) continuationImpl;
            int i2 = universalQrScannerTorchInteractor$observeCameraPermissionState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerTorchInteractor$observeCameraPermissionState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerTorchInteractor$observeCameraPermissionState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerTorchInteractor$observeCameraPermissionState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    UniversalQrScannerTorchInteractor$observeCameraPermissionState$2 universalQrScannerTorchInteractor$observeCameraPermissionState$2 = new UniversalQrScannerTorchInteractor$observeCameraPermissionState$2(this, null);
                    universalQrScannerTorchInteractor$observeCameraPermissionState$1.label = 1;
                    if (bvf0.n(universalQrScannerTorchInteractor$observeCameraPermissionState$2, universalQrScannerTorchInteractor$observeCameraPermissionState$1) == coroutineSingletons) {
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
        universalQrScannerTorchInteractor$observeCameraPermissionState$1 = new UniversalQrScannerTorchInteractor$observeCameraPermissionState$1(this, continuationImpl);
        Object obj2 = universalQrScannerTorchInteractor$observeCameraPermissionState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerTorchInteractor$observeCameraPermissionState$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final Object b(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new UniversalQrScannerTorchInteractor$switchTorchEnabled$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
