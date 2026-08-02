package com.yandex.go.universal_qr_scanner.domain;

import com.yandex.go.universal_qr_scanner.domain.camera.permission.c;
import com.yandex.go.universal_qr_scanner.domain.camera.permission.d;
import defpackage.a121;
import defpackage.a201;
import defpackage.f121;
import defpackage.mdh;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class b {
    public final tt2 a;
    public final f121 b;
    public final a201 c;
    public final com.yandex.go.universal_qr_scanner.domain.screen.title.a d;
    public final d e;

    public b(tt2 tt2Var, f121 f121Var, a201 a201Var, com.yandex.go.universal_qr_scanner.domain.screen.title.a aVar, d dVar) {
        this.a = tt2Var;
        this.b = f121Var;
        this.c = a201Var;
        this.d = aVar;
        this.e = dVar;
    }

    public final tpr a() {
        rol0 a = this.d.a();
        r0 r0Var = this.b.b;
        a201 a201Var = this.c;
        com.yandex.go.universal_qr_scanner.domain.qr.frame.b bVar = new com.yandex.go.universal_qr_scanner.domain.qr.frame.b(((a121) a201Var.c).a, a201Var);
        d dVar = this.e;
        tpr t = e.t(e.m(a, r0Var, bVar, new c(dVar.b.a, dVar), new UniversalQrScannerUiStateInteractor$uiStateFlow$1(5, this, b.class, "toUiState", "toUiState(Ljava/lang/String;Lcom/yandex/go/universal_qr_scanner/domain/torch/UniversalQrScannerTorchState;Landroid/graphics/Rect;Lcom/yandex/go/universal_qr_scanner/presentation/UniversalQrScannerCameraPermissionUiState;)Lcom/yandex/go/universal_qr_scanner/presentation/UniversalQrScannerUiState;", 4)));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return e.F(t, mdh.b);
    }
}
