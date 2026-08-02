package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;

/* loaded from: classes6.dex */
public final class eb40 {
    public final ga40 a;
    public final r0 b;
    public final gci0 c;

    public eb40(ga40 ga40Var) {
        this.a = ga40Var;
        r0 c = bvf0.c(fb40.d);
        this.b = c;
        this.c = e.d(c);
    }

    public static void c(eb40 eb40Var, db40 db40Var) {
        eb40Var.b(db40Var, false, ((fb40) eb40Var.b.getValue()).c);
    }

    public final db40 a() {
        return ((fb40) this.b.getValue()).a;
    }

    public final void b(db40 db40Var, boolean z, String str) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new fb40(db40Var, z, str)));
        if (db40Var == null) {
            return;
        }
        ga40 ga40Var = this.a;
        fa40 fa40Var = ga40Var.a;
        String str2 = db40Var.b;
        if (str2 == null) {
            str2 = fa40Var.d;
        }
        ga40Var.a = fa40.a(fa40Var, null, null, null, str2, db40Var.a ? TransportRouteAnalytics$TripType.RoundTrip : TransportRouteAnalytics$TripType.OneWay, db40Var.c, Integer.valueOf(db40Var.d), null, null, null, null, null, null, null, 16263);
    }
}
