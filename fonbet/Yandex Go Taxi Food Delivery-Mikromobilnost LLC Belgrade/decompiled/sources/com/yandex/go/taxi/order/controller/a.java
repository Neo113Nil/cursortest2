package com.yandex.go.taxi.order.controller;

import android.app.Application;
import androidx.lifecycle.p;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.delegates.c;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.network.b;
import com.yandex.go.taxi.order.t;
import com.yandex.go.taxi.order.y;
import com.yandex.go.zone.model.Zone;
import defpackage.a3y0;
import defpackage.as21;
import defpackage.as6;
import defpackage.b20;
import defpackage.cda0;
import defpackage.ci70;
import defpackage.cjm0;
import defpackage.cne0;
import defpackage.ef9;
import defpackage.epq0;
import defpackage.fvt;
import defpackage.ga9;
import defpackage.h3y;
import defpackage.hvq;
import defpackage.ijj0;
import defpackage.jgv;
import defpackage.jl40;
import defpackage.jl70;
import defpackage.kq70;
import defpackage.lx4;
import defpackage.ma1;
import defpackage.n721;
import defpackage.na1;
import defpackage.o2y0;
import defpackage.pav;
import defpackage.pq70;
import defpackage.pzt0;
import defpackage.qrj0;
import defpackage.qw7;
import defpackage.ri1;
import defpackage.rrj0;
import defpackage.sk7;
import defpackage.sl50;
import defpackage.sls;
import defpackage.t41;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.u99;
import defpackage.uw40;
import defpackage.wnt;
import defpackage.ycr;
import defpackage.yh70;
import defpackage.yoe;
import defpackage.ysg;
import defpackage.zl50;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class a {
    public final ci70 A;
    public final ijj0 B;
    public final h3y C;
    public final h3y D;
    public final sl50 E;
    public final qrj0 F;
    public Zone H;
    public String I;
    public Map J;
    public pzt0 L;
    public pzt0 M;
    public boolean N;
    public final p a;
    public final tt2 b;
    public final o2y0 c;
    public final Application d;
    public final b e;
    public final ga9 f;
    public final h g;
    public final ysg h;
    public final y i;
    public final com.yandex.go.zone.interactors.b j;
    public final fvt k;
    public final ci70 l;
    public final t41 m;
    public final OrderCancelProcessingObserver n;
    public final qw7 o;
    public final pav p;
    public final jgv q;
    public final ru.yandex.taxi.translations.interactor.a r;
    public final wnt s;
    public final hvq t;
    public final uw40 u;
    public final g v;
    public final ri1 w;
    public final cda0 x;
    public final b20 y;
    public final b20 z;
    public final a3y0 G = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderControllerRequests");
    public final ArrayList K = new ArrayList();

    public a(p pVar, tt2 tt2Var, o2y0 o2y0Var, Application application, b bVar, ga9 ga9Var, h hVar, ysg ysgVar, y yVar, com.yandex.go.zone.interactors.b bVar2, fvt fvtVar, ci70 ci70Var, t41 t41Var, OrderCancelProcessingObserver orderCancelProcessingObserver, qw7 qw7Var, pav pavVar, jgv jgvVar, ChangeOrderApi changeOrderApi, ru.yandex.taxi.translations.interactor.a aVar, wnt wntVar, hvq hvqVar, uw40 uw40Var, g gVar, ri1 ri1Var, cda0 cda0Var, b20 b20Var, b20 b20Var2, ci70 ci70Var2, ijj0 ijj0Var, h3y h3yVar, h3y h3yVar2, sl50 sl50Var, qrj0 qrj0Var) {
        this.a = pVar;
        this.b = tt2Var;
        this.c = o2y0Var;
        this.d = application;
        this.e = bVar;
        this.f = ga9Var;
        this.g = hVar;
        this.h = ysgVar;
        this.i = yVar;
        this.j = bVar2;
        this.k = fvtVar;
        this.l = ci70Var;
        this.m = t41Var;
        this.n = orderCancelProcessingObserver;
        this.o = qw7Var;
        this.p = pavVar;
        this.q = jgvVar;
        this.r = aVar;
        this.s = wntVar;
        this.t = hvqVar;
        this.u = uw40Var;
        this.v = gVar;
        this.w = ri1Var;
        this.x = cda0Var;
        this.y = b20Var;
        this.z = b20Var2;
        this.A = ci70Var2;
        this.B = ijj0Var;
        this.C = h3yVar;
        this.D = h3yVar2;
        this.E = sl50Var;
        this.F = qrj0Var;
        this.H = o2y0Var.b().M();
        b20Var.e = new c(changeOrderApi);
        b20Var2.e = new com.yandex.go.taxi.order.delegates.b(changeOrderApi);
    }

    public final void a(String str, String str2) {
        TaxiOrder b = this.c.b();
        String str3 = b.a;
        Preorder preorder = b.b;
        sk7 a = this.f.a(str3);
        Calendar calendar = (Calendar) a.w;
        String str4 = (String) a.c;
        String str5 = (String) a.b;
        Address u = b.u();
        boolean l = jl40.l(u != null ? u.J1() : null, str);
        ysg ysgVar = this.h;
        if (!l) {
            Address u2 = b.u();
            if (u2 != null) {
                u2.v0(str);
            }
            ysgVar.g(b);
            this.y.a(new ef9(str5, str4, calendar, str), str3);
        }
        if (jl40.l(preorder.d(), str2)) {
            return;
        }
        preorder.z = str2;
        preorder.A = null;
        ysgVar.g(b);
        this.z.a(new u99(str5, str4, calendar, str2), str3);
    }

    public final void b(epq0 epq0Var) {
        this.N = true;
        c(new kq70(this, 0), new zl50(15, this, epq0Var));
    }

    public final void c(sls slsVar, tls tlsVar) {
        Zone zone = this.H;
        if (zone != null) {
            tlsVar.invoke(zone);
            return;
        }
        yoe yoeVar = new yoe(slsVar, tlsVar);
        zzs v = this.c.b().v();
        if (v != null) {
            this.K.add(tje.N(this.a, null, null, new OrderControllerRequests$requestZoneWithOrderData$zoneJob$1(this, v, yoeVar, null), 3));
        } else {
            this.G.i("requestZoneWithOrderData", new IllegalStateException("srcPoint is null"), new jl70(19));
            yoeVar.invoke(null);
        }
    }

    public final boolean d() {
        return !this.N && this.e.d();
    }

    public final void e(Runnable runnable) {
        Object value;
        TaxiOrder taxiOrder;
        ((com.yandex.go.payments.paymentlist.data.c) this.x).p();
        o2y0 o2y0Var = this.c;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            taxiOrder.L(new ChangeOrderState$Pending(null, ChangeOrderState$Source.CANCEL));
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        r0 r0Var2 = this.n.a;
        t tVar = new t(o2y0Var, OrderCancelProcessingObserver.ProcessingState.COMPLETE);
        r0Var2.getClass();
        r0Var2.m(null, tVar);
        c(new kq70(this, 1), new zl50(16, this, runnable));
    }

    public final void f() {
        pzt0 pzt0Var;
        Map map = this.J;
        p pVar = this.a;
        if (map == null && ((pzt0Var = this.M) == null || !pzt0Var.isActive())) {
            this.M = tje.N(pVar, null, null, new OrderControllerRequests$fetchCancelKeySet$1(this, null), 3);
        }
        String a = this.q.a(this.c.b().b().a());
        if (a == null || a.length() == 0 || a.equals(this.I)) {
            return;
        }
        this.K.add(tje.N(pVar, null, null, new OrderControllerRequests$preloadDriverPhotoIfNeeded$preloadDriverPhotoImageJob$1(this, a, null), 3));
        this.I = a;
    }

    public final void g(cjm0 cjm0Var) {
        TaxiOrder b = this.c.b();
        String str = (String) cjm0Var.b;
        epq0 epq0Var = (epq0) cjm0Var.c;
        ((cne0) this.g.b).u("launch_actual", false);
        ((rrj0) this.F).a();
        ci70 ci70Var = this.l;
        yh70 yh70Var = ci70Var.f;
        yh70Var.getClass();
        yh70Var.a.a("order", new HashMap(), 1, new HashMap());
        if (b.r() == PaymentMethod$Type.CARD) {
            as21 as21Var = ci70Var.d;
            if (!as21Var.a("FIELD_MADE_FIRST_CARD_ORDER", false)) {
                ycr ycrVar = ci70Var.p;
                ycrVar.getClass();
                ycrVar.a.a("firstCardOrderEvent", new HashMap(), 1, new HashMap());
                lx4 lx4Var = ci70Var.a;
                ((na1) ((ma1) ci70Var.e.get())).getClass();
                ((j) lx4Var).v(as6.g());
                as21Var.e("FIELD_MADE_FIRST_CARD_ORDER", true);
            }
        }
        this.e.g(b, str, new pq70(this, epq0Var, this.v.e(), cjm0Var, b));
    }

    public final void h(epq0 epq0Var) {
        TaxiOrder b = this.c.b();
        if (b.r() != PaymentMethod$Type.GOOGLE_PAY || !b.K()) {
            b(epq0Var);
            return;
        }
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        try {
            this.L = tje.N(this.a, null, null, new OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1(((e) this.k).l(), null, this, epq0Var, epq0Var), 3);
        } catch (Exception e) {
            a3y0.d(this.G, "requestGooglePayCardIdAndSendOrder", e, null, 4);
            epq0Var.Uc();
        }
    }

    public final void i(String str) {
        this.i.m(0L, this.c.b().a);
    }

    public final void j(String str) {
        this.i.n(0L, this.c.b().a, str);
    }

    public final void k(n721 n721Var) {
        tls orderControllerRequests$updateOrderZone$zoneFetchFunction$1;
        l(this.H);
        o2y0 o2y0Var = this.c;
        if (o2y0Var.b().M() != null) {
            n721Var.onSuccess();
            return;
        }
        Address u = o2y0Var.b().u();
        String zoneName = u != null ? u.getZoneName() : null;
        if (zoneName == null || zoneName.length() == 0) {
            zzs v = o2y0Var.b().v();
            if (v == null) {
                n721Var.a();
                return;
            }
            orderControllerRequests$updateOrderZone$zoneFetchFunction$1 = new OrderControllerRequests$updateOrderZone$zoneFetchFunction$1(this, zoneName, v, null);
        } else {
            orderControllerRequests$updateOrderZone$zoneFetchFunction$1 = new OrderControllerRequests$updateOrderZone$zoneFetchFunction$2(this, zoneName, null);
        }
        this.K.add(tje.N(this.a, null, null, new OrderControllerRequests$updateOrderZone$1(this, orderControllerRequests$updateOrderZone$zoneFetchFunction$1, n721Var, null), 3));
    }

    public final void l(Zone zone) {
        o2y0 o2y0Var = this.c;
        ZoneAddress zoneAddress = o2y0Var.b().t().a;
        if (zoneAddress == null || zone == null || jl40.l(zoneAddress.b, zone)) {
            return;
        }
        o2y0Var.b().Q(o2y0Var.b().t().l(new ZoneAddress(zoneAddress.a, zone)));
    }
}
