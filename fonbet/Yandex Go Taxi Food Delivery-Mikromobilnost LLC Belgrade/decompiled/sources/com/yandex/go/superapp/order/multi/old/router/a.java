package com.yandex.go.superapp.order.multi.old.router;

import com.yandex.go.superapp.order.multi.old.view.g;
import com.yandex.go.superapp.tracking.data.e;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.view.l;
import defpackage.a301;
import defpackage.bjz;
import defpackage.bsi;
import defpackage.clk0;
import defpackage.d3p;
import defpackage.dv6;
import defpackage.h1p;
import defpackage.h3y;
import defpackage.hc80;
import defpackage.hxx;
import defpackage.jem;
import defpackage.m601;
import defpackage.m950;
import defpackage.mvx;
import defpackage.o2y0;
import defpackage.p3p;
import defpackage.pep0;
import defpackage.pu6;
import defpackage.q6o0;
import defpackage.q6y0;
import defpackage.qa80;
import defpackage.qg50;
import defpackage.tt;
import defpackage.v7y0;
import defpackage.w201;
import defpackage.w511;
import defpackage.x980;
import defpackage.xda;
import defpackage.y2y0;
import defpackage.y641;
import defpackage.yaf0;
import defpackage.z4y0;
import ru.yandex.taxi.altpins.order.p;
import ru.yandex.taxi.logistics.deliveries.multiorder.c;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;

/* loaded from: classes14.dex */
public final class a {
    public final x980 a;
    public final ru.yandex.taxi.checkin.a b;
    public final g c;
    public final h3y d;
    public final l e;
    public final tt f;
    public final y641 g;
    public final a301 h;
    public final h3y i;
    public final clk0 j;
    public final com.yandex.go.taxi.order.multi.feed.domain.a k;
    public final bsi l;
    public final c m;

    public a(x980 x980Var, ru.yandex.taxi.checkin.a aVar, hc80 hc80Var, g gVar, h3y h3yVar, e eVar, l lVar, tt ttVar, y641 y641Var, a301 a301Var, h3y h3yVar2, clk0 clk0Var, com.yandex.go.taxi.order.multi.feed.domain.a aVar2, bsi bsiVar, c cVar) {
        this.a = x980Var;
        this.b = aVar;
        this.c = gVar;
        this.d = h3yVar;
        this.e = lVar;
        this.f = ttVar;
        this.g = y641Var;
        this.h = a301Var;
        this.i = h3yVar2;
        this.j = clk0Var;
        this.k = aVar2;
        this.l = bsiVar;
        this.m = cVar;
    }

    public final void a(o2y0 o2y0Var) {
        ((p) this.g).c(o2y0Var, new OrderListViewHoldersRouter$onCancelWalkingRoute$1(this, o2y0Var, null));
    }

    public final void b(w201 w201Var, boolean z, m601 m601Var, String str) {
        a301 a301Var = this.h;
        boolean z2 = w201Var instanceof pu6;
        a301Var.c.getClass();
        a301Var.a(w201Var, z2 ? "orders_widget" : z ? "header" : "preview_card", m601Var, str);
        if (w201Var instanceof q6y0) {
            q6y0 q6y0Var = (q6y0) w201Var;
            o2y0 o2y0Var = q6y0Var.c;
            boolean g = this.j.d() ? this.j.g() : o2y0Var.b().l.Y;
            com.yandex.go.taxi.order.multi.feed.domain.a aVar = this.k;
            String str2 = o2y0Var.b().a;
            String d = o2y0Var.d();
            boolean z3 = o2y0Var.b().b.g0;
            clk0 clk0Var = aVar.c;
            if ((g ? TaxiOrderPresentationType.DETAILS : clk0Var.d() ? clk0Var.g() ? TaxiOrderPresentationType.DETAILS : TaxiOrderPresentationType.TRACKING : aVar.a.b(d) ? TaxiOrderPresentationType.TRACKING : TaxiOrderPresentationType.DETAILS).a() && this.e.b() == OrderScreen.ORDER_LIST) {
                this.c.f(z ? DetailsOpenReason.HEADER : DetailsOpenReason.PREVIEW_CARD, q6y0Var.a());
                return;
            } else {
                this.c.d(q6y0Var.a(), false, z ? DetailsOpenReason.HEADER : DetailsOpenReason.PREVIEW_CARD, TaxiCardNavigationAction.EMPTY);
                return;
            }
        }
        if (w201Var instanceof d3p) {
            g gVar = this.c;
            d3p d3pVar = (d3p) w201Var;
            h1p h1pVar = d3pVar.c;
            String str3 = d3pVar.a;
            gVar.getClass();
            ((pep0) gVar.d).f((m950) gVar.g.get(), new p3p(new mvx(h1pVar, str3, false)), hxx.a);
            return;
        }
        if (w201Var instanceof y2y0) {
            this.c.e.h(OrderScreen.LINKED_ORDER_DETAILS, false, new qa80(((y2y0) w201Var).a), z ? DetailsOpenReason.HEADER : DetailsOpenReason.PREVIEW_CARD, Boolean.FALSE);
            return;
        }
        if (z2) {
            g gVar2 = this.c;
            String str4 = ((pu6) w201Var).a;
            gVar2.getClass();
            gVar2.e.h(OrderScreen.BUNDLED_ORDER_DETAILS, true, null, null, new dv6(str4, yaf0.c));
            return;
        }
        if (w201Var instanceof v7y0) {
            ((p) this.g).d(((v7y0) w201Var).b);
            return;
        }
        if (w201Var instanceof bjz) {
            this.l.getClass();
            DeliveryStateBaseParams a = bsi.a((bjz) w201Var, null);
            if (a != null) {
                this.m.d(a);
                return;
            }
            return;
        }
        if ((w201Var instanceof z4y0) || (w201Var instanceof qg50) || (w201Var instanceof xda) || (w201Var instanceof jem) || (w201Var instanceof q6o0)) {
            return;
        }
        w511.b();
    }
}
