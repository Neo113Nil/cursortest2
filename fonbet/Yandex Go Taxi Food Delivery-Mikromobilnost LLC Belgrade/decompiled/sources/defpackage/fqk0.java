package defpackage;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.paymentmethods.a;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final class fqk0 {
    public final b20 a;
    public final n20 b;
    public final a c;
    public final ysg d;
    public final p2y0 e;

    public fqk0(b20 b20Var, n20 n20Var, a aVar, ysg ysgVar, p2y0 p2y0Var) {
        this.a = b20Var;
        this.b = n20Var;
        this.c = aVar;
        this.d = ysgVar;
        this.e = p2y0Var;
        b20Var.e = new eqk0(this);
    }

    public final void a(yc9 yc9Var) {
        TaxiOrder i = ((e0) this.e).i(yc9Var.b);
        if (i != null) {
            PaymentMethod$Type paymentMethod$Type = yc9Var.d;
            String str = yc9Var.e;
            synchronized (i) {
                TaxiOrderPendingChanges taxiOrderPendingChanges = i.i;
                lv90.Companion.getClass();
                i.i = taxiOrderPendingChanges.k(kv90.a(paymentMethod$Type, str, null));
            }
            this.a.a(yc9Var, yc9Var.b);
        }
    }
}
