package com.yandex.go.universal_qr_scanner.presentation;

import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$UniversalQRCameraStatus;
import defpackage.i121;
import defpackage.ibw0;
import defpackage.lz11;
import defpackage.rsn;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.common.clid.ClidProvider;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class UniversalQrScannerPresenter$attachView$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        rsn rsnVar = (rsn) obj;
        d dVar = (d) this.receiver;
        dVar.getClass();
        SuperappMainAnalytics$UniversalQRCameraStatus superappMainAnalytics$UniversalQRCameraStatus = ((i121) rsnVar.b).d != null ? SuperappMainAnalytics$UniversalQRCameraStatus.Forbidden : SuperappMainAnalytics$UniversalQRCameraStatus.ReadyToScan;
        i121 i121Var = (i121) rsnVar.a;
        if (superappMainAnalytics$UniversalQRCameraStatus != (i121Var != null ? i121Var.d != null ? SuperappMainAnalytics$UniversalQRCameraStatus.Forbidden : SuperappMainAnalytics$UniversalQRCameraStatus.ReadyToScan : null)) {
            lz11 lz11Var = dVar.E;
            lz11Var.getClass();
            boolean z = superappMainAnalytics$UniversalQRCameraStatus == SuperappMainAnalytics$UniversalQRCameraStatus.ReadyToScan;
            ibw0 ibw0Var = lz11Var.a;
            ibw0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(ClidProvider.STATE, superappMainAnalytics$UniversalQRCameraStatus.getEventValue());
            hashMap.put("lumos_enabled", Boolean.valueOf(z));
            ibw0Var.a.a("SuperappMain.UniversalQR.Opened", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
