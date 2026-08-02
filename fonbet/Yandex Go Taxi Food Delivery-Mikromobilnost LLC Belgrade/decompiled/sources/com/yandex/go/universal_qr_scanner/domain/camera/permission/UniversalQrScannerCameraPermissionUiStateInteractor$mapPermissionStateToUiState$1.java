package com.yandex.go.universal_qr_scanner.domain.camera.permission;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.universal_qr_scanner.domain.camera.permission.UniversalQrScannerCameraPermissionUiStateInteractor", f = "UniversalQrScannerCameraPermissionUiStateInteractor.kt", l = {26}, m = "mapPermissionStateToUiState", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerCameraPermissionUiStateInteractor$mapPermissionStateToUiState$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(this.this$0, null, this);
    }
}
