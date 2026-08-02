package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$StopOptionsButtonActionType;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class d411 {
    public final pho a;

    public d411(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, boolean z, String str3, TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason, TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType, Double d, Integer num, String str4, String str5) {
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        if (transportPaymentAnalytics$CheckoutScreenOpenReason != null) {
            hashMap.put("source", transportPaymentAnalytics$CheckoutScreenOpenReason.getEventValue());
        }
        if (transportPaymentAnalytics$VehicleType != null) {
            hashMap.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
        }
        if (d != null) {
            hashMap.put("sum_ticket_price", d);
        }
        hashMap.put("ticket_counter", num);
        if (str4 != null) {
            hashMap.put("destination_stop_id", str4);
        }
        hashMap.put("transport_id", str);
        if (str5 != null) {
            hashMap.put("zone_name", str5);
        }
        hashMap.put("payment_method", str2);
        hashMap.put("payment_method_available", Boolean.valueOf(z));
        this.a.a("TransportPayment.PaymentSuccess.Shown", hashMap, 2, new HashMap());
    }

    public final void b(TransportPaymentAnalytics$StopOptionsButtonActionType transportPaymentAnalytics$StopOptionsButtonActionType, String str, TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("request_id", str);
        }
        hashMap.put("button_name", transportPaymentAnalytics$StopOptionsButtonActionType.getEventValue());
        if (transportPaymentAnalytics$VehicleType != null) {
            hashMap.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
        }
        if (str2 != null) {
            hashMap.put("vehicle_id", str2);
        }
        if (str3 != null) {
            hashMap.put("destination_stop_id", str3);
        }
        this.a.a("TransportPayment.StopOptions.Tapped", hashMap, 3, tse0.r("zone_name", hashMap, str4));
    }
}
