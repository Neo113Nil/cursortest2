package defpackage;

import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$CheckoutActionType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$InitiatedPaymentMethod;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class ea40 {
    public final b611 a;
    public final ga40 b;
    public final sy00 c;
    public final TransportRouteAnalytics$FlowOrigin d;
    public boolean e;

    public ea40(b611 b611Var, ga40 ga40Var, sy00 sy00Var, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin) {
        this.a = b611Var;
        this.b = ga40Var;
        this.c = sy00Var;
        this.d = transportRouteAnalytics$FlowOrigin;
    }

    public final void a(TransportRouteAnalytics$CheckoutActionType transportRouteAnalytics$CheckoutActionType, String str) {
        fa40 fa40Var = this.b.a;
        String str2 = fa40Var.a;
        String str3 = fa40Var.b;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = fa40Var.c;
        String str4 = fa40Var.d;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType = fa40Var.e;
        int i = fa40Var.f;
        Integer num = fa40Var.g;
        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod = fa40Var.k;
        Boolean bool = fa40Var.j;
        String str5 = fa40Var.h;
        String str6 = fa40Var.i;
        b611 b611Var = this.a;
        HashMap o = smw0.o(b611Var);
        o.put("origin", this.d.getEventValue());
        o.put("sum_ticket_price", str2);
        o.put("selected_date", str3);
        o.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
        o.put("tariff_id", str4);
        o.put("trip_type", transportRouteAnalytics$TripType.getEventValue());
        if (transportRouteAnalytics$InitiatedPaymentMethod != null) {
            o.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod.getEventValue());
        }
        if (bool != null) {
            o.put("payment_method_available", bool);
        }
        o.put("adult_ticket_cnt", Integer.valueOf(i));
        if (num != null) {
            o.put("children_ticket_cnt", num);
        }
        o.put("action_type", transportRouteAnalytics$CheckoutActionType.getEventValue());
        o.put(CRLReasonCodeExtension.REASON, str);
        b611Var.a.a("TransportRoute.CheckoutAction.Shown", o, 3, x4e.q(o, "start_stop_id", str5, "final_stop_id", str6));
    }
}
