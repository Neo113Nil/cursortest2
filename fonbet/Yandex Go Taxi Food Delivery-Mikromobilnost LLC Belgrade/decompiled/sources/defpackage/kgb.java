package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;

/* loaded from: classes8.dex */
public final class kgb {
    public final x780 a;

    public kgb(x780 x780Var) {
        this.a = x780Var;
    }

    public final boolean a(TaxiOrder taxiOrder) {
        switch (jgb.a[taxiOrder.h.getB().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
                this.a.getClass();
                return x780.a(taxiOrder);
            default:
                w511.b();
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return false;
        }
    }
}
