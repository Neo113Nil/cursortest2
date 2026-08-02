package defpackage;

import android.content.Intent;
import com.yandex.go.route.analytics.e;
import com.yandex.go.taxi.order.analytics.OrderAnalytics$ComplementaryPaymentMethod;
import com.yandex.go.taxi.order.analytics.OrderAnalytics$SummaryExpandingState;
import com.yandex.go.taxi.order.controller.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.network.b;
import com.yandex.go.taxi.order.network.exception.NotAllowedParallelRequestsException;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.if60;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import ru.yandex.taxi.exception.TokenRetrievalException;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.api.models.GoApiOtherException;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.provider.OrdersProviderImpl$CreateOrderWithoutAuthorizedUserException;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes14.dex */
public final class pq70 implements y580 {
    public final /* synthetic */ a a;
    public final /* synthetic */ epq0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cjm0 d;
    public final /* synthetic */ TaxiOrder e;

    public pq70(a aVar, epq0 epq0Var, boolean z, cjm0 cjm0Var, TaxiOrder taxiOrder) {
        this.a = aVar;
        this.b = epq0Var;
        this.c = z;
        this.d = cjm0Var;
        this.e = taxiOrder;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TaxiOrder taxiOrder) {
        OrderAnalytics$SummaryExpandingState orderAnalytics$SummaryExpandingState;
        OrderAnalytics$ComplementaryPaymentMethod orderAnalytics$ComplementaryPaymentMethod;
        OrderAnalytics$ComplementaryPaymentMethod orderAnalytics$ComplementaryPaymentMethod2;
        PaymentMethod$Type a;
        this.a.c.g(taxiOrder);
        this.a.h.g(taxiOrder);
        this.b.P9(taxiOrder);
        this.a.i("onOrderResponse");
        androidx.localbroadcastmanager.content.a.a(this.a.d).c(new Intent("ru.yandex.taxi.OrderSent"));
        t41 t41Var = this.a.m;
        boolean z = this.c;
        String str = taxiOrder.a;
        e eVar = (e) t41Var;
        synchronized (eVar) {
            eVar.c(eVar.l, eVar.m, z, str);
            eVar.l = null;
            eVar.m = null;
            eVar.i.clear();
            eVar.k = null;
            eVar.j = null;
            eVar.p = false;
            eVar.q = false;
        }
        ci70 ci70Var = this.a.l;
        boolean z2 = this.c;
        String str2 = taxiOrder.a;
        boolean z3 = taxiOrder.h.getB() == DriveState.SCHEDULED || taxiOrder.h.getB() == DriveState.SCHEDULING;
        boolean z4 = taxiOrder.m() != null;
        String x = taxiOrder.x();
        int i = bi70.b[ci70Var.E.ordinal()];
        if (i == 1) {
            orderAnalytics$SummaryExpandingState = OrderAnalytics$SummaryExpandingState.Collapsed;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            orderAnalytics$SummaryExpandingState = OrderAnalytics$SummaryExpandingState.Expanded;
        }
        String str3 = taxiOrder.b.V;
        PaymentMethod$Type a2 = taxiOrder.r().a();
        if (a2 == null) {
            a3y0 a3y0Var = ci70Var.F;
            List g = scc.g("OrderAnalytics", "orderReceived");
            a3y0Var.getClass();
            String[] strArr = (String[]) g.toArray(new String[0]);
            String l = a3y0Var.l((String[]) Arrays.copyOf(strArr, strArr.length));
            hst hstVar = jst.e;
            String str4 = a3y0Var.a;
            ist m = hstVar.m(l);
            ke00 a3 = m.b.a();
            if (a3 != null && a3.b(15)) {
                a3.a(15, str4, null, "Can't log Order.Received because preorderHolder.paymentMethod() is null", m.a);
            }
        } else {
            String code = a2.getCode();
            int s = ((fga0) ci70Var.g).s();
            int size = ((List) taxiOrder.t().e.getValue()).size();
            Preorder preorder = taxiOrder.b;
            String str5 = preorder.b;
            lv90 e = preorder.e();
            if (e != null && (a = e.a().a()) != null) {
                int i2 = bi70.c[a.ordinal()];
                if (i2 == 1) {
                    orderAnalytics$ComplementaryPaymentMethod = OrderAnalytics$ComplementaryPaymentMethod.PersonalWallet;
                } else if (i2 == 2) {
                    orderAnalytics$ComplementaryPaymentMethod = OrderAnalytics$ComplementaryPaymentMethod.BirbonusWallet;
                }
                yh70 yh70Var = ci70Var.f;
                yh70Var.getClass();
                HashMap hashMap = new HashMap();
                orderAnalytics$ComplementaryPaymentMethod2 = orderAnalytics$ComplementaryPaymentMethod;
                hashMap.put("order_id", str2);
                oo31.q(z3, hashMap, "is_preorder", z4, "is_decide_later");
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, x);
                if (str5 != null) {
                    hashMap.put("offer_id", str5);
                }
                hashMap.put("summary_expanding_state", orderAnalytics$SummaryExpandingState.getEventValue());
                hashMap.put("vertical_id", str3);
                hashMap.put("payment_method", code);
                if (orderAnalytics$ComplementaryPaymentMethod2 != null) {
                    hashMap.put("complementary_payment_method", orderAnalytics$ComplementaryPaymentMethod2.getEventValue());
                }
                b64.B(s, hashMap, "tips_percentage", size, "intermediate_points");
                yh70Var.a.a("Order.Received", hashMap, 1, x4e.r(z2, hashMap, "is_multiorder"));
            }
            orderAnalytics$ComplementaryPaymentMethod = null;
            yh70 yh70Var2 = ci70Var.f;
            yh70Var2.getClass();
            HashMap hashMap2 = new HashMap();
            orderAnalytics$ComplementaryPaymentMethod2 = orderAnalytics$ComplementaryPaymentMethod;
            hashMap2.put("order_id", str2);
            oo31.q(z3, hashMap2, "is_preorder", z4, "is_decide_later");
            hashMap2.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, x);
            if (str5 != null) {
            }
            hashMap2.put("summary_expanding_state", orderAnalytics$SummaryExpandingState.getEventValue());
            hashMap2.put("vertical_id", str3);
            hashMap2.put("payment_method", code);
            if (orderAnalytics$ComplementaryPaymentMethod2 != null) {
            }
            b64.B(s, hashMap2, "tips_percentage", size, "intermediate_points");
            yh70Var2.a.a("Order.Received", hashMap2, 1, x4e.r(z2, hashMap2, "is_multiorder"));
        }
        ri1 ri1Var = this.a.w;
        String str6 = taxiOrder.a;
        HashSet hashSet = ri1Var.b;
        if (ri1Var.a != null && hashSet.isEmpty()) {
            hashSet.clear();
            hashSet.add(str6);
        }
        this.a.E.a.set(true);
    }

    public final void b(Throwable th) {
        TaxiOrder taxiOrder = this.e;
        cjm0 cjm0Var = this.d;
        final epq0 epq0Var = this.b;
        final a aVar = this.a;
        uw40 uw40Var = aVar.u;
        b bVar = aVar.e;
        a3y0 a3y0Var = aVar.G;
        final int i = 0;
        ((g) aVar.D.get()).g(null, false);
        try {
            a3y0Var.g(new String[]{"onError"}, th, null);
            if (!(th instanceof GoApiOtherException)) {
                throw th;
            }
            throw ((GoApiOtherException) th).getOriginal();
        } catch (NotAllowedParallelRequestsException e) {
            String l = a3y0Var.l(new String[]{"onError", "Order: only one order"});
            hst hstVar = jst.e;
            String str = a3y0Var.a;
            hstVar.getClass();
            ist m = hstVar.m(l);
            ke00 a = m.b.a();
            if (a != null && a.b(15)) {
                a.a(15, str, e, "Only one order at time allowed", m.a);
            }
            uw40Var.c();
        } catch (IOException e2) {
            epq0Var.H2(cjm0Var);
            String l2 = a3y0Var.l(new String[]{"onError", "Order: server error"});
            hst hstVar2 = jst.e;
            String str2 = a3y0Var.a;
            ist m2 = hstVar2.m(l2);
            ke00 a2 = m2.b.a();
            if (a2 == null || !a2.b(15)) {
                return;
            }
            a2.a(15, str2, e2, "IOException", m2.a);
        } catch (GoApiHttpException e3) {
            if (s8o.E(e3)) {
                epq0Var.H2(cjm0Var);
                String l3 = a3y0Var.l(new String[]{"onError", "Order: server error"});
                hst hstVar3 = jst.e;
                String str3 = a3y0Var.a;
                ist m3 = hstVar3.m(l3);
                ke00 a3 = m3.b.a();
                if (a3 == null || !a3.b(15)) {
                    return;
                }
                a3.a(15, str3, e3, "Server error", m3.a);
                return;
            }
            epq0Var.Pa();
            uw40Var.c();
            int code = e3.getCode();
            if (code == 406) {
                ff60 ff60Var = if60.Companion;
                wnt wntVar = aVar.s;
                ff60Var.getClass();
                if60 a4 = ff60.a(wntVar, e3);
                if (a4 == null) {
                    epq0Var.W1();
                } else {
                    if60.a aVar2 = a4.a;
                    epq0Var.Je(aVar2 != null ? aVar2.a : null, aVar2 != null ? aVar2.b : null);
                }
            } else if (code != 429) {
                switch (code) {
                    case 401:
                        epq0Var.r9();
                        break;
                    case 402:
                        epq0Var.m8();
                        break;
                    case 403:
                        epq0Var.c2();
                        break;
                    default:
                        epq0Var.W1();
                        break;
                }
            } else {
                final int i2 = 1;
                bVar.b(taxiOrder, new Consumer(this) { // from class: nq70
                    public final /* synthetic */ pq70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i2;
                        pq70 pq70Var = this.b;
                        TaxiOrder taxiOrder2 = (TaxiOrder) obj;
                        switch (i3) {
                            case 0:
                                pq70Var.a(taxiOrder2);
                                break;
                            default:
                                pq70Var.a(taxiOrder2);
                                break;
                        }
                    }
                }, new Consumer() { // from class: oq70
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i2;
                        epq0 epq0Var2 = epq0Var;
                        a aVar3 = aVar;
                        switch (i3) {
                            case 0:
                                Throwable th2 = (Throwable) obj;
                                a3y0 a3y0Var2 = aVar3.G;
                                String l4 = a3y0Var2.l(new String[]{"onError", "Order: unknown error"});
                                hst hstVar4 = jst.e;
                                String str4 = a3y0Var2.a;
                                ist m4 = hstVar4.m(l4);
                                ke00 a5 = m4.b.a();
                                if (a5 != null && a5.b(15)) {
                                    a5.a(15, str4, th2, "Unexpected exception launch fallback failed", m4.a);
                                }
                                aVar3.u.c();
                                epq0Var2.m8();
                                break;
                            default:
                                aVar3.G.b("handleHttpException", (Throwable) obj, new jl70(21));
                                epq0Var2.pb();
                                break;
                        }
                    }
                });
            }
            String l4 = a3y0Var.l(new String[]{"onError", "Order: server error"});
            hst hstVar4 = jst.e;
            String str4 = a3y0Var.a;
            ist m4 = hstVar4.m(l4);
            ke00 a5 = m4.b.a();
            if (a5 == null || !a5.b(15)) {
                return;
            }
            a5.a(15, str4, e3, "Http error", m4.a);
        } catch (OrdersProviderImpl$CreateOrderWithoutAuthorizedUserException e4) {
            String l5 = a3y0Var.l(new String[]{"onError", "Order: without auth"});
            hst hstVar5 = jst.e;
            String str5 = a3y0Var.a;
            ist m5 = hstVar5.m(l5);
            ke00 a6 = m5.b.a();
            if (a6 != null && a6.b(15)) {
                a6.a(15, str5, e4, "CreateOrderWithoutAuthorizedUserException", m5.a);
            }
            epq0Var.r9();
        } catch (Throwable th2) {
            if (!(th2 instanceof TokenRetrievalException) || !(th2.getCause() instanceof IOException)) {
                String l6 = a3y0Var.l(new String[]{"onError", "Order: unknown error"});
                hst hstVar6 = jst.e;
                String str6 = a3y0Var.a;
                ist m6 = hstVar6.m(l6);
                ke00 a7 = m6.b.a();
                if (a7 != null && a7.b(15)) {
                    a7.a(15, str6, th2, "Unexpected exception", m6.a);
                }
                bVar.b(taxiOrder, new Consumer(this) { // from class: nq70
                    public final /* synthetic */ pq70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i;
                        pq70 pq70Var = this.b;
                        TaxiOrder taxiOrder2 = (TaxiOrder) obj;
                        switch (i3) {
                            case 0:
                                pq70Var.a(taxiOrder2);
                                break;
                            default:
                                pq70Var.a(taxiOrder2);
                                break;
                        }
                    }
                }, new Consumer() { // from class: oq70
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i;
                        epq0 epq0Var2 = epq0Var;
                        a aVar3 = aVar;
                        switch (i3) {
                            case 0:
                                Throwable th22 = (Throwable) obj;
                                a3y0 a3y0Var2 = aVar3.G;
                                String l42 = a3y0Var2.l(new String[]{"onError", "Order: unknown error"});
                                hst hstVar42 = jst.e;
                                String str42 = a3y0Var2.a;
                                ist m42 = hstVar42.m(l42);
                                ke00 a52 = m42.b.a();
                                if (a52 != null && a52.b(15)) {
                                    a52.a(15, str42, th22, "Unexpected exception launch fallback failed", m42.a);
                                }
                                aVar3.u.c();
                                epq0Var2.m8();
                                break;
                            default:
                                aVar3.G.b("handleHttpException", (Throwable) obj, new jl70(21));
                                epq0Var2.pb();
                                break;
                        }
                    }
                });
                return;
            }
            epq0Var.H2(cjm0Var);
            String l7 = a3y0Var.l(new String[]{"onError", "Order: server error"});
            hst hstVar7 = jst.e;
            String str7 = a3y0Var.a;
            ist m7 = hstVar7.m(l7);
            ke00 a8 = m7.b.a();
            if (a8 == null || !a8.b(15)) {
                return;
            }
            a8.a(15, str7, th2, "Token retrieval exception", m7.a);
        }
    }
}
