package defpackage;

import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehiclesButtonAction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$BleVehiclesButtonActionType;

/* loaded from: classes6.dex */
public final class p310 {
    public final n310 a;

    public p310(n310 n310Var) {
        this.a = n310Var;
    }

    public final void a(BleVehiclesButtonAction bleVehiclesButtonAction, LinkedHashMap linkedHashMap) {
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType masstransitPaymentAnalytics$BleVehiclesButtonActionType;
        switch (o310.c[bleVehiclesButtonAction.ordinal()]) {
            case 1:
                masstransitPaymentAnalytics$BleVehiclesButtonActionType = MasstransitPaymentAnalytics$BleVehiclesButtonActionType.Back;
                break;
            case 2:
                masstransitPaymentAnalytics$BleVehiclesButtonActionType = MasstransitPaymentAnalytics$BleVehiclesButtonActionType.Qr;
                break;
            case 3:
                masstransitPaymentAnalytics$BleVehiclesButtonActionType = MasstransitPaymentAnalytics$BleVehiclesButtonActionType.Refresh;
                break;
            case 4:
                masstransitPaymentAnalytics$BleVehiclesButtonActionType = MasstransitPaymentAnalytics$BleVehiclesButtonActionType.OpenSettings;
                break;
            case 5:
                masstransitPaymentAnalytics$BleVehiclesButtonActionType = MasstransitPaymentAnalytics$BleVehiclesButtonActionType.VehicleItem;
                break;
            case 6:
                masstransitPaymentAnalytics$BleVehiclesButtonActionType = MasstransitPaymentAnalytics$BleVehiclesButtonActionType.Other;
                break;
            default:
                w511.b();
                return;
        }
        n310 n310Var = this.a;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button", masstransitPaymentAnalytics$BleVehiclesButtonActionType.getEventValue());
        if (linkedHashMap != null) {
            hashMap.put("ticketing_system_context", linkedHashMap);
        }
        n310Var.a.a("MasstransitPayment.BleVehicles.Tapped", hashMap, 1, new HashMap());
    }
}
