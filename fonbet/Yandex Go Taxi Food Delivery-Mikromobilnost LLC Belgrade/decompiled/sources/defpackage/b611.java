package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$CheckoutButtonType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$CheckoutTariffButtonType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$InitiatedPaymentMethod;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsEntryPointSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsErrorButtonName;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsTapButtonName;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleButtonTypeV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleCalendarButtonTypeV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleErrorReason;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleTransportFilterButtonType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class b611 {
    public final pho a;

    public b611(pho phoVar) {
        this.a = phoVar;
    }

    public static void k(b611 b611Var, TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource, String str, String str2, String str3, TransportRouteAnalytics$ScheduleErrorReason transportRouteAnalytics$ScheduleErrorReason, String str4, ArrayList arrayList) {
        HashMap o = smw0.o(b611Var);
        if (str4 != null) {
            o.put("request_id", str4);
        }
        o.put("source", transportRouteAnalytics$ScheduleEntryPointSource.getEventValue());
        o.put("selected_date", str);
        o.put("start_stop_id", str2);
        o.put("final_stop_id", str3);
        if (arrayList != null) {
            o.put("selected_filters_id", arrayList);
        }
        o.put("error_name", transportRouteAnalytics$ScheduleErrorReason.getEventValue());
        b611Var.a.a("TransportRoute.ScheduleError.Shown", o, 4, new HashMap());
    }

    public static void m(b611 b611Var, TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV2, String str, String str2, String str3, String str4, List list, String str5, int i) {
        if ((i & 512) != 0) {
            str5 = null;
        }
        HashMap o = smw0.o(b611Var);
        if (str4 != null) {
            o.put("request_id", str4);
        }
        o.put("source", transportRouteAnalytics$ScheduleEntryPointSource.getEventValue());
        o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        o.put("button_name", transportRouteAnalytics$ScheduleButtonTypeV2.getEventValue());
        o.put("selected_date", str);
        o.put("start_stop_id", str2);
        o.put("final_stop_id", str3);
        if (list != null) {
            o.put("selected_filters_id", list);
        }
        if (str5 != null) {
            o.put("price", str5);
        }
        b611Var.a.a("TransportRoute.Schedule.Tapped", o, 4, new HashMap());
    }

    public final void a(TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str, String str2, TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType, String str3, TransportRouteAnalytics$TripType transportRouteAnalytics$TripType, int i, TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType, String str4, String str5, String str6, Integer num, TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod, Boolean bool) {
        HashMap hashMap = new HashMap();
        if (str6 != null) {
            hashMap.put("request_id", str6);
        }
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        hashMap.put("sum_ticket_price", str);
        hashMap.put("selected_date", str2);
        hashMap.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
        hashMap.put("tariff_id", str3);
        hashMap.put("trip_type", transportRouteAnalytics$TripType.getEventValue());
        hashMap.put("adult_ticket_cnt", Integer.valueOf(i));
        if (num != null) {
            hashMap.put("children_ticket_cnt", num);
        }
        hashMap.put("button_name", transportRouteAnalytics$CheckoutButtonType.getEventValue());
        if (transportRouteAnalytics$InitiatedPaymentMethod != null) {
            hashMap.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod.getEventValue());
        }
        if (bool != null) {
            hashMap.put("payment_method_available", bool);
        }
        this.a.a("TransportRoute.Checkout.Tapped", hashMap, 4, x4e.q(hashMap, "start_stop_id", str4, "final_stop_id", str5));
    }

    public final void b(TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str, String str2, TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType, String str3, TransportRouteAnalytics$TripType transportRouteAnalytics$TripType, int i, TransportRouteAnalytics$CheckoutTariffButtonType transportRouteAnalytics$CheckoutTariffButtonType, String str4, String str5, String str6, Integer num, String str7) {
        HashMap hashMap = new HashMap();
        if (str6 != null) {
            hashMap.put("request_id", str6);
        }
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        hashMap.put("tariff_price", str);
        hashMap.put("selected_date", str2);
        hashMap.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
        hashMap.put("tariff_id", str3);
        hashMap.put("trip_type", transportRouteAnalytics$TripType.getEventValue());
        hashMap.put("adult_ticket_cnt", Integer.valueOf(i));
        if (num != null) {
            hashMap.put("children_ticket_cnt", num);
        }
        hashMap.put("button_name", transportRouteAnalytics$CheckoutTariffButtonType.getEventValue());
        hashMap.put("start_stop_id", str4);
        hashMap.put("final_stop_id", str5);
        if (str7 != null) {
            hashMap.put("tariff_type", str7);
        }
        this.a.a("TransportRoute.CheckoutTariff.Tapped", hashMap, 4, new HashMap());
    }

    public final void c(TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
        hashMap.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
        this.a.a("TransportRoute.DetailCard.BackButton.Tapped", hashMap, 2, new HashMap());
    }

    public final void d(TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
        hashMap.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
        this.a.a("TransportRoute.DetailCard.ClosedByPull", hashMap, 2, new HashMap());
    }

    public final void e(TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
        hashMap.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
        this.a.a("TransportRoute.DetailCard.ClosedBySystemBackButton", hashMap, 2, new HashMap());
    }

    public final void f(boolean z, TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin, TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType, ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        hashMap.put("has_schedule_tickets_flg", Boolean.valueOf(z));
        hashMap.put("origin", transportRouteAnalytics$DetailCardOrigin.getEventValue());
        hashMap.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
        hashMap.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
        hashMap.put("masstransit_type", arrayList);
        this.a.a("TransportRoute.DetailCard.Shown", hashMap, 2, new HashMap());
    }

    public final void g(TransportRouteAnalytics$RouteOptionsErrorButtonName transportRouteAnalytics$RouteOptionsErrorButtonName, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("request_id", str);
        }
        if (str2 != null) {
            hashMap.put("start_stop_id", str2);
        }
        if (str3 != null) {
            hashMap.put("final_stop_id", str3);
        }
        hashMap.put("button_name", transportRouteAnalytics$RouteOptionsErrorButtonName.getEventValue());
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        this.a.a("TransportRoute.RouteOptionsError.Tapped", hashMap, 3, new HashMap());
    }

    public final void h(TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str, String str2, String str3, Boolean bool) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("request_id", str);
        }
        if (str2 != null) {
            hashMap.put("start_stop_id", str2);
        }
        if (str3 != null) {
            hashMap.put("final_stop_id", str3);
        }
        hashMap.put("is_route_empty", bool);
        hashMap.put("source", transportRouteAnalytics$RouteOptionsEntryPointSource.getEventValue());
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        this.a.a("TransportRoute.RouteOptions.FirstLoaded", hashMap, 2, new HashMap());
    }

    public final void i(TransportRouteAnalytics$RouteOptionsTapButtonName transportRouteAnalytics$RouteOptionsTapButtonName, TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str, String str2, String str3, Boolean bool) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("request_id", str);
        }
        hashMap.put("button_name", transportRouteAnalytics$RouteOptionsTapButtonName.getEventValue());
        if (str2 != null) {
            hashMap.put("start_stop_id", str2);
        }
        if (str3 != null) {
            hashMap.put("final_stop_id", str3);
        }
        hashMap.put("is_route_empty", bool);
        hashMap.put("source", transportRouteAnalytics$RouteOptionsEntryPointSource.getEventValue());
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        this.a.a("TransportRoute.RouteOptions.Tapped", hashMap, 3, new HashMap());
    }

    public final void j(TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 transportRouteAnalytics$ScheduleCalendarButtonTypeV2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        HashMap hashMap = new HashMap();
        if (str5 != null) {
            hashMap.put("request_id", str5);
        }
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        hashMap.put("button_name", transportRouteAnalytics$ScheduleCalendarButtonTypeV2.getEventValue());
        if (str6 != null) {
            hashMap.put("date_tab", str6);
        }
        hashMap.put("selected_date", str);
        hashMap.put("preselected_date", str2);
        hashMap.put("start_stop_id", str3);
        hashMap.put("final_stop_id", str4);
        if (list != null) {
            hashMap.put("selected_filters", list);
        }
        this.a.a("TransportRoute.ScheduleCalendar.Tapped", hashMap, 4, new HashMap());
    }

    public final void l(TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str, String str2, String str3, String str4, TransportRouteAnalytics$ScheduleTransportFilterButtonType transportRouteAnalytics$ScheduleTransportFilterButtonType, String str5, String str6, String str7) {
        HashMap hashMap = new HashMap();
        if (str5 != null) {
            hashMap.put("request_id", str5);
        }
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        hashMap.put("selected_date", str);
        hashMap.put("start_stop_id", str2);
        hashMap.put("final_stop_id", str3);
        if (str6 != null) {
            hashMap.put("preselected_filter_id", str6);
        }
        if (str7 != null) {
            hashMap.put("selected_filter_id", str7);
        }
        hashMap.put("filter_type_id", str4);
        hashMap.put("button_name", transportRouteAnalytics$ScheduleTransportFilterButtonType.getEventValue());
        this.a.a("TransportRoute.ScheduleFilterModal.Tapped", hashMap, 3, new HashMap());
    }
}
