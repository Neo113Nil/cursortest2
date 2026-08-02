package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.scooters.presentation.detailed_order.ScootersDetailedOrderAnalytics$CloseReason;

/* loaded from: classes6.dex */
public final class pfn0 {
    public final x770 a;
    public String b;

    public pfn0(x770 x770Var) {
        this.a = x770Var;
    }

    public final void a(ScootersDetailedOrderAnalytics$CloseReason scootersDetailedOrderAnalytics$CloseReason) {
        String reasonName = scootersDetailedOrderAnalytics$CloseReason.getReasonName();
        String str = this.b;
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", reasonName);
        if (str != null) {
            hashMap.put("order_id", str);
        }
        x770Var.a.a("ScootersRideDetails.Closed", hashMap, 1, new HashMap());
    }
}
