package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.provider.a;

/* loaded from: classes14.dex */
public final class e0j0 implements i580 {
    public final pit a;
    public final a b;

    public e0j0(pit pitVar, a aVar) {
        this.a = pitVar;
        this.b = aVar;
    }

    @Override // defpackage.i580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        o2y0 n = this.b.n(taxiOrder.a);
        if (n == null) {
            return;
        }
        OrderStatusInfo V = taxiOrder.V();
        ReorderInfo reorderInfo = V.b;
        qyy0.c(new ud30(25, this, n, reorderInfo == null ? null : new pzi0(reorderInfo, V.K)));
    }
}
