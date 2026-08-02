package defpackage;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.masstransit.sdk.ble.api.analytics.RouteOptionsButtonAction;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$RouteOptionsButtonActionType;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class ek30 {
    public final d411 a;
    public final wu30 b;
    public final cw30 c;
    public boolean d;

    public ek30(d411 d411Var, wu30 wu30Var, cw30 cw30Var) {
        this.a = d411Var;
        this.b = wu30Var;
        this.c = cw30Var;
    }

    public static ArrayList b(List list) {
        ArrayList<fd30> arrayList;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof fd30) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (fd30 fd30Var : arrayList) {
            String str = fd30Var.d;
            int i = dk30.b[fd30Var.e.ordinal()];
            if (i == 1) {
                transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Bus;
            } else if (i == 2) {
                transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Trolley;
            } else if (i == 3) {
                transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Tram;
            } else if (i == 4) {
                transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Water;
            } else {
                if (i != 5) {
                    w511.b();
                    return null;
                }
                transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Electrobus;
            }
            arrayList2.add(new c411(str, transportPaymentAnalytics$VehicleType));
        }
        return arrayList2;
    }

    public final void a(RouteOptionsButtonAction routeOptionsButtonAction, boolean z, boolean z2, String str, List list, String str2, String str3) {
        TransportPaymentAnalytics$RouteOptionsButtonActionType transportPaymentAnalytics$RouteOptionsButtonActionType;
        int i = dk30.a[routeOptionsButtonAction.ordinal()];
        if (i == 1) {
            transportPaymentAnalytics$RouteOptionsButtonActionType = TransportPaymentAnalytics$RouteOptionsButtonActionType.Back;
        } else if (i == 2) {
            transportPaymentAnalytics$RouteOptionsButtonActionType = TransportPaymentAnalytics$RouteOptionsButtonActionType.GoToSettings;
        } else if (i == 3) {
            transportPaymentAnalytics$RouteOptionsButtonActionType = TransportPaymentAnalytics$RouteOptionsButtonActionType.QrPay;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            transportPaymentAnalytics$RouteOptionsButtonActionType = TransportPaymentAnalytics$RouteOptionsButtonActionType.Transport;
        }
        ArrayList b = b(list);
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z2);
        if (str3.length() == 0) {
            str3 = c();
        }
        d411 d411Var = this.a;
        d411Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("request_id", str);
        }
        hashMap.put("button_name", transportPaymentAnalytics$RouteOptionsButtonActionType.getEventValue());
        if (b != null) {
            ArrayList arrayList = new ArrayList(tcc.n(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((c411) it.next()).c);
            }
            hashMap.put("vehicle_list", arrayList);
        }
        if (str2 != null) {
            hashMap.put("transport_id", str2);
        }
        hashMap.put("has_bluetooth_access", valueOf);
        hashMap.put("has_camera_access", valueOf2);
        hashMap.put("zone_name", str3);
        d411Var.a.a("TransportPayment.RouteOptions.Tapped", hashMap, 3, new HashMap());
    }

    public final String c() {
        Zone zone;
        String str;
        ZoneAddress n = this.b.n();
        return (n == null || (zone = n.b) == null || (str = zone.a) == null) ? "" : str;
    }
}
