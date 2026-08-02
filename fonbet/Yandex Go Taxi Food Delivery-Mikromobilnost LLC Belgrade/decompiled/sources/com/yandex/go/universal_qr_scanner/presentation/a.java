package com.yandex.go.universal_qr_scanner.presentation;

import androidx.camera.core.f;
import com.yandex.go.universal_qr_scanner.domain.camera.permission.UniversalQrScannerCameraPermissionState;
import defpackage.er7;
import defpackage.jey;
import defpackage.pz11;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes14.dex */
public final class a extends jey {
    public final /* synthetic */ UniversalQrScannerModalView a;

    public a(UniversalQrScannerModalView universalQrScannerModalView) {
        this.a = universalQrScannerModalView;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        d dVar;
        er7 er7Var;
        UniversalQrScannerModalView universalQrScannerModalView = this.a;
        dVar = universalQrScannerModalView.presenter;
        com.yandex.go.universal_qr_scanner.domain.camera.permission.a aVar = dVar.G;
        if (!((com.yandex.go.permission.b) aVar.a).a(3)) {
            pz11 pz11Var = aVar.b;
            pz11Var.a.l(UniversalQrScannerCameraPermissionState.FORBIDDEN);
        }
        tje.N(dVar.Jg(), null, null, new UniversalQrScannerPresenter$onStart$1(dVar, null), 3);
        er7Var = universalQrScannerModalView.cameraLifecycleOwner;
        er7Var.b();
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        d dVar;
        er7 er7Var;
        UniversalQrScannerModalView universalQrScannerModalView = this.a;
        dVar = universalQrScannerModalView.presenter;
        com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d dVar2 = dVar.A;
        ((f) dVar2.d.e.getValue()).H();
        pzt0 pzt0Var = dVar2.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar2.f = null;
        er7Var = universalQrScannerModalView.cameraLifecycleOwner;
        er7Var.c();
    }
}
