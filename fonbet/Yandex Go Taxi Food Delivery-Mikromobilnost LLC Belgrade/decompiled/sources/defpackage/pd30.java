package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.geopayment.checkout.k;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.b;

/* loaded from: classes6.dex */
public final class pd30 implements vpr {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ k a;
    public final /* synthetic */ String b;
    public final /* synthetic */ f4a0 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ TransportPaymentAnalytics$CheckoutScreenOpenReason x;
    public final /* synthetic */ TransportPaymentAnalytics$VehicleType y;
    public final /* synthetic */ Double z;

    public pd30(k kVar, String str, f4a0 f4a0Var, boolean z, TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason, TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType, Double d, int i, String str2, String str3) {
        this.a = kVar;
        this.b = str;
        this.c = f4a0Var;
        this.w = z;
        this.x = transportPaymentAnalytics$CheckoutScreenOpenReason;
        this.y = transportPaymentAnalytics$VehicleType;
        this.z = d;
        this.A = i;
        this.B = str2;
        this.C = str3;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        r6f r6fVar = (r6f) obj;
        k kVar = this.a;
        r0 r0Var = ((b) kVar.b).b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, r6fVar));
        if (r6fVar.f) {
            sy00 sy00Var = kVar.j;
            lx4 lx4Var = sy00Var.a;
            ((na1) sy00Var.b).getClass();
            j jVar = (j) lx4Var;
            jVar.v(as6.H());
            jVar.v(as6.F());
            d411 d411Var = kVar.i;
            String b = this.c.b.b();
            if (b == null) {
                b = "";
            }
            String str = r6fVar.g;
            Integer num = new Integer(this.A);
            String str2 = this.B;
            String str3 = this.C;
            d411Var.a(this.b, b, this.w, str, this.x, this.y, this.z, num, str2, str3);
        }
        return zy11.a;
    }
}
