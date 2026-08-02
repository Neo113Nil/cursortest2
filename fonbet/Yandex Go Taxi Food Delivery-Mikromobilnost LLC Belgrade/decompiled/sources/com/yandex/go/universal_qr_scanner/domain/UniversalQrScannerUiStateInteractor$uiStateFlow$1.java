package com.yandex.go.universal_qr_scanner.domain;

import android.graphics.Rect;
import com.yandex.go.universal_qr_scanner.domain.torch.UniversalQrScannerTorchState;
import defpackage.dms;
import defpackage.i121;
import defpackage.sz11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class UniversalQrScannerUiStateInteractor$uiStateFlow$1 extends AdaptedFunctionReference implements dms {
    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Rect rect = (Rect) obj3;
        ((b) this.receiver).getClass();
        return new i121((String) obj, rect, (UniversalQrScannerTorchState) obj2, (sz11) obj4);
    }
}
