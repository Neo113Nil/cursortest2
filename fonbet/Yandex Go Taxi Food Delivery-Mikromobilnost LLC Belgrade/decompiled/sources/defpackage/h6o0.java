package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.scooters.presentation.detailed_order.ScootersOrderLifecycleAnalytics$OrderCloseReason;

/* loaded from: classes6.dex */
public final class h6o0 {
    public final ma1 a;
    public final lx4 b;
    public final u8w c;

    public h6o0(ma1 ma1Var, lx4 lx4Var, u8w u8wVar) {
        this.a = ma1Var;
        this.b = lx4Var;
        this.c = u8wVar;
    }

    public final void a(ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason, r7p0 r7p0Var, String str) {
        String reason = scootersOrderLifecycleAnalytics$OrderCloseReason.getReason();
        String str2 = r7p0Var.a;
        u8w u8wVar = this.c;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", reason);
        hashMap.put("scooter_number", str2);
        u8wVar.a.a("ScootersOrder.Completed", hashMap, 1, tse0.r("order_id", hashMap, str));
    }
}
