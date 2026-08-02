package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;

/* loaded from: classes14.dex */
public final class h780 {
    public final String a;
    public final ysg b;
    public volatile TaxiOrder c;

    public h780(String str, ysg ysgVar) {
        this.a = str;
        this.b = ysgVar;
    }

    public final TaxiOrder a() {
        TaxiOrder taxiOrder = this.c;
        return taxiOrder == null ? this.b.a(this.a) : taxiOrder;
    }
}
