package defpackage;

import com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutScreenOpenReason;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.modal.e;

/* loaded from: classes6.dex */
public final class pk30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pgd b;

    public /* synthetic */ pk30(pgd pgdVar, int i) {
        this.a = i;
        this.b = pgdVar;
    }

    public final void a() {
        int i = this.a;
        int i2 = 9;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                ((d) pgdVar).r(new qu(i2));
                break;
            default:
                ((e) pgdVar).r(new qu(i2));
                break;
        }
    }

    public final void b(final fd30 fd30Var) {
        int i = this.a;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                ((d) pgdVar).r(new tls() { // from class: ok30
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        fd30 fd30Var2 = fd30Var;
                        switch (i3) {
                            case 0:
                                rz00 rz00Var = (rz00) obj;
                                Object obj2 = fd30Var2.g;
                                rz00Var.getClass();
                                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                                if (map != null) {
                                    ru.yandex.taxi.masstransit.d dVar = rz00Var.a;
                                    e310 e310Var = rz00Var.b;
                                    CheckoutScreenOpenReason checkoutScreenOpenReason = CheckoutScreenOpenReason.BleVehiclesScreen;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                                    for (Map.Entry entry : map.entrySet()) {
                                        linkedHashMap.put(entry.getKey(), (String) entry.getValue());
                                    }
                                    dVar.b0(e310Var, new dmb(new lkb(map), new zib(checkoutScreenOpenReason, null, null, linkedHashMap, 6)), new xq30(rz00Var.c, false), null, k1j0.a);
                                    break;
                                }
                                break;
                            default:
                                sz00 sz00Var = (sz00) obj;
                                String str = fd30Var2.d;
                                Object obj3 = fd30Var2.g;
                                sz00Var.getClass();
                                sz00Var.a.X(sz00Var.b, str, null, null, obj3, pj40.c, TransportPaymentAnalytics$CheckoutScreenOpenReason.VehicleItem, new xq30(sz00Var.c, false), null);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
            default:
                final int i3 = 1;
                ((e) pgdVar).r(new tls() { // from class: ok30
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i32 = i3;
                        zy11 zy11Var = zy11.a;
                        fd30 fd30Var2 = fd30Var;
                        switch (i32) {
                            case 0:
                                rz00 rz00Var = (rz00) obj;
                                Object obj2 = fd30Var2.g;
                                rz00Var.getClass();
                                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                                if (map != null) {
                                    ru.yandex.taxi.masstransit.d dVar = rz00Var.a;
                                    e310 e310Var = rz00Var.b;
                                    CheckoutScreenOpenReason checkoutScreenOpenReason = CheckoutScreenOpenReason.BleVehiclesScreen;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                                    for (Map.Entry entry : map.entrySet()) {
                                        linkedHashMap.put(entry.getKey(), (String) entry.getValue());
                                    }
                                    dVar.b0(e310Var, new dmb(new lkb(map), new zib(checkoutScreenOpenReason, null, null, linkedHashMap, 6)), new xq30(rz00Var.c, false), null, k1j0.a);
                                    break;
                                }
                                break;
                            default:
                                sz00 sz00Var = (sz00) obj;
                                String str = fd30Var2.d;
                                Object obj3 = fd30Var2.g;
                                sz00Var.getClass();
                                sz00Var.a.X(sz00Var.b, str, null, null, obj3, pj40.c, TransportPaymentAnalytics$CheckoutScreenOpenReason.VehicleItem, new xq30(sz00Var.c, false), null);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
        }
    }

    public final void c(sls slsVar) {
        int i = this.a;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                d dVar = (d) pgdVar;
                dVar.z((m950) ((epf) ((pm5) dVar.H.B).b).get(), new i26(0, slsVar));
                break;
            default:
                e eVar = (e) pgdVar;
                eVar.z((m950) ((epf) ((pm5) eVar.H.m).b).get(), new i26(0, slsVar));
                break;
        }
    }

    public final void d() {
        int i = this.a;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                ((d) pgdVar).r(new pi30(4));
                break;
            default:
                ((e) pgdVar).r(new pi30(6));
                break;
        }
    }
}
