package com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutErrorReason;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.s;
import defpackage.akb;
import defpackage.bkb;
import defpackage.fnb;
import defpackage.glb;
import defpackage.j45;
import defpackage.n310;
import defpackage.o950;
import defpackage.pmb;
import defpackage.snb;
import defpackage.tje;
import defpackage.tse;
import defpackage.tse0;
import defpackage.v310;
import defpackage.w310;
import defpackage.w511;
import defpackage.x4e;
import defpackage.zib;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$CheckoutErrorReason;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$CheckoutScreenOpenReason;

/* loaded from: classes12.dex */
public final class a {
    public final w310 a;
    public final fnb b;
    public final s c;
    public zib d;
    public final LinkedHashSet e = new LinkedHashSet();
    public String f;
    public pmb g;
    public String h;
    public j45 i;

    public a(w310 w310Var, fnb fnbVar, s sVar) {
        this.a = w310Var;
        this.b = fnbVar;
        this.c = sVar;
    }

    public final void a(tse tseVar, o950 o950Var, zib zibVar) {
        this.d = zibVar;
        this.e.clear();
        this.f = null;
        tje.N(tseVar, null, null, new CheckoutAnalyticsTranslator$attach$1(this, null), 3);
        tje.N(tseVar, null, null, new CheckoutAnalyticsTranslator$attach$2(this, null), 3);
        tje.N(tseVar, null, null, new CheckoutAnalyticsTranslator$attach$3(this, null), 3);
        tje.N(tseVar, null, null, new CheckoutAnalyticsTranslator$attach$4(this, null), 3);
        j45 j45Var = new j45(1, this);
        this.i = j45Var;
        o950Var.a(j45Var);
    }

    public final void b(snb snbVar) {
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason;
        if (snbVar == null || !this.e.add(snbVar.a())) {
            return;
        }
        boolean z = snbVar instanceof bkb;
        w310 w310Var = this.a;
        if (z) {
            bkb bkbVar = (bkb) snbVar;
            String str = bkbVar.a;
            String str2 = bkbVar.b;
            n310 n310Var = w310Var.a;
            n310Var.getClass();
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                hashMap.put("request_id", str2);
            }
            n310Var.a.a("MasstransitPayment.Checkout.FirstLoaded", hashMap, 1, tse0.r("trip_id", hashMap, str));
            return;
        }
        if (!(snbVar instanceof akb)) {
            if (!(snbVar instanceof glb)) {
                w511.b();
                return;
            }
            glb glbVar = (glb) snbVar;
            String str3 = glbVar.a;
            String str4 = glbVar.b;
            String str5 = glbVar.c;
            n310 n310Var2 = w310Var.a;
            n310Var2.getClass();
            HashMap hashMap2 = new HashMap();
            if (str5 != null) {
                hashMap2.put("request_id", str5);
            }
            n310Var2.a.a("MasstransitPayment.Checkout.PaymentSucceed", hashMap2, 1, x4e.q(hashMap2, "trip_id", str3, "order_id", str4));
            return;
        }
        akb akbVar = (akb) snbVar;
        CheckoutErrorReason checkoutErrorReason = akbVar.a;
        String str6 = akbVar.b;
        String str7 = akbVar.c;
        String str8 = akbVar.d;
        n310 n310Var3 = w310Var.a;
        switch (v310.b[checkoutErrorReason.ordinal()]) {
            case 1:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.VehicleSearchFailure;
                break;
            case 2:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.TripInitFailure;
                break;
            case 3:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.TripUpdateFailure;
                break;
            case 4:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.CheckoutFailure;
                break;
            case 5:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.CheckoutStatusFailure;
                break;
            case 6:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.OrderPaymentFailure;
                break;
            case 7:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.TripCopyFailure;
                break;
            case 8:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.PaymentMethodsFailure;
                break;
            case 9:
                masstransitPaymentAnalytics$CheckoutErrorReason = MasstransitPaymentAnalytics$CheckoutErrorReason.Other;
                break;
            default:
                w511.b();
                return;
        }
        n310Var3.getClass();
        HashMap hashMap3 = new HashMap();
        if (str6 != null) {
            hashMap3.put("request_id", str6);
        }
        if (str7 != null) {
            hashMap3.put("trip_id", str7);
        }
        if (str8 != null) {
            hashMap3.put("order_id", str8);
        }
        hashMap3.put(CRLReasonCodeExtension.REASON, masstransitPaymentAnalytics$CheckoutErrorReason.getEventValue());
        n310Var3.a.a("MasstransitPayment.Checkout.ErrorShown", hashMap3, 1, new HashMap());
    }

    public final void c() {
        MasstransitPaymentAnalytics$CheckoutScreenOpenReason masstransitPaymentAnalytics$CheckoutScreenOpenReason;
        zib zibVar = this.d;
        if (zibVar == null) {
            return;
        }
        n310 n310Var = this.a.a;
        int i = v310.a[zibVar.a.ordinal()];
        if (i == 1) {
            masstransitPaymentAnalytics$CheckoutScreenOpenReason = MasstransitPaymentAnalytics$CheckoutScreenOpenReason.QrScan;
        } else if (i == 2) {
            masstransitPaymentAnalytics$CheckoutScreenOpenReason = MasstransitPaymentAnalytics$CheckoutScreenOpenReason.BleVehiclesScreen;
        } else if (i == 3) {
            masstransitPaymentAnalytics$CheckoutScreenOpenReason = MasstransitPaymentAnalytics$CheckoutScreenOpenReason.Deeplink;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            masstransitPaymentAnalytics$CheckoutScreenOpenReason = MasstransitPaymentAnalytics$CheckoutScreenOpenReason.Other;
        }
        String str = zibVar.b;
        String str2 = zibVar.c;
        Map map = zibVar.d;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", masstransitPaymentAnalytics$CheckoutScreenOpenReason.getEventValue());
        if (str != null) {
            hashMap.put("utm_source", str);
        }
        if (str2 != null) {
            hashMap.put("utm_medium", str2);
        }
        if (map != null) {
            hashMap.put("ticketing_system_context", map);
        }
        n310Var.a.a("MasstransitPayment.Checkout.Shown", hashMap, 1, new HashMap());
    }
}
