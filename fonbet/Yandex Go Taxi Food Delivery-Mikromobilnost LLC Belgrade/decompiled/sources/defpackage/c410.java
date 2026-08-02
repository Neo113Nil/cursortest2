package defpackage;

import com.yandex.go.masstransit.sdk.ble.api.qrscan.analytics.QrScanButtonAction;
import java.util.HashMap;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$QRScanButtonActionType;

/* loaded from: classes6.dex */
public final class c410 implements deg0 {
    public final n310 a;

    public c410(n310 n310Var) {
        this.a = n310Var;
    }

    @Override // defpackage.deg0
    public final void a(boolean z) {
        n310 n310Var = this.a;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        n310Var.a.a("MasstransitPayment.QRScan.Shown", hashMap, 1, x4e.r(z, hashMap, "has_camera_access"));
    }

    @Override // defpackage.deg0
    public final void b(QrScanButtonAction qrScanButtonAction) {
        MasstransitPaymentAnalytics$QRScanButtonActionType masstransitPaymentAnalytics$QRScanButtonActionType;
        int i = b410.a[qrScanButtonAction.ordinal()];
        if (i == 1) {
            masstransitPaymentAnalytics$QRScanButtonActionType = MasstransitPaymentAnalytics$QRScanButtonActionType.Close;
        } else if (i == 2) {
            masstransitPaymentAnalytics$QRScanButtonActionType = MasstransitPaymentAnalytics$QRScanButtonActionType.OpenSettings;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            masstransitPaymentAnalytics$QRScanButtonActionType = MasstransitPaymentAnalytics$QRScanButtonActionType.Other;
        }
        n310 n310Var = this.a;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button", masstransitPaymentAnalytics$QRScanButtonActionType.getEventValue());
        n310Var.a.a("MasstransitPayment.QRScan.Tapped", hashMap, 1, new HashMap());
    }

    @Override // defpackage.deg0
    public final void c() {
        n310 n310Var = this.a;
        n310Var.getClass();
        n310Var.a.a("MasstransitPayment.QRScan.InvalidQrShown", new HashMap(), 1, new HashMap());
    }
}
