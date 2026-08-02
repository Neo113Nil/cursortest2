package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;

/* loaded from: classes9.dex */
public final class i280 {
    public static boolean a(TaxiOrder taxiOrder) {
        OrderStatusInfo V = taxiOrder.V();
        qn11 qn11Var = g280.f;
        qn11 b = V.b(g280.class);
        if (b != null) {
            qn11Var = b;
        }
        g280 g280Var = (g280) qn11Var;
        if (!g280Var.b) {
            return false;
        }
        int i = h280.a[taxiOrder.h.getB().ordinal()];
        if (i == 1) {
            return g280Var.d.getA();
        }
        if (i == 2) {
            return g280Var.e.getA();
        }
        if (i != 3) {
            return false;
        }
        return g280Var.c.getA();
    }
}
