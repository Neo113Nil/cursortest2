package defpackage;

import com.yandex.go.taxi.order.chat.domain.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.orderperformer.RealtimeInfo;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class i780 implements j580 {
    public final n041 a;
    public final a b;

    public i780(n041 n041Var, a aVar) {
        this.a = n041Var;
        this.b = aVar;
    }

    @Override // defpackage.j580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        zzs v;
        if (z) {
            n041 n041Var = this.a;
            n041Var.getClass();
            if (DriveState.WAITING == taxiOrder.h.b) {
                OrderStatusInfo V = taxiOrder.V();
                RealtimeInfo realtimeInfo = V.h;
                zzs a = realtimeInfo != null ? realtimeInfo.getA() : null;
                if (a == null) {
                    a = V.g.getH();
                }
                if (a != null && (v = taxiOrder.v()) != null) {
                    String str = taxiOrder.a;
                    if (!jl40.l(str, n041Var.b.l("sent_order_id", null))) {
                        n041Var.a.a(b.i(new Pair("lat", Double.valueOf(a.a)), new Pair("lon", Double.valueOf(a.b))), Double.valueOf(srb1.d(a, v)), taxiOrder.a, b.i(new Pair("lat", Double.valueOf(v.a)), new Pair("lon", Double.valueOf(v.b))));
                        n041Var.b.r("sent_order_id", str);
                    }
                }
            }
        }
        if (taxiOrder.h.b == DriveState.COMPLETE) {
            a aVar = this.b;
            String str2 = taxiOrder.a;
            String str3 = taxiOrder.V().q0;
            aVar.getClass();
            aVar.b(new bzx0(aVar, str2, str3, 0));
        }
    }
}
