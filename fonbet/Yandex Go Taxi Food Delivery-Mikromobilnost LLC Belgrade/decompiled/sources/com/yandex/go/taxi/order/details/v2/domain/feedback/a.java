package com.yandex.go.taxi.order.details.v2.domain.feedback;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.taxi.order.feedback.domain.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.alk0;
import defpackage.diz0;
import defpackage.dm21;
import defpackage.ii8;
import defpackage.ine0;
import defpackage.jsq;
import defpackage.o2y0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.ufz0;
import defpackage.vfz0;
import defpackage.ysg;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a {
    public final o2y0 a;
    public final tse b;
    public final alk0 c;
    public final ufz0 d;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a e;
    public final ine0 f;
    public final dm21 g;
    public final ysg h;

    public a(o2y0 o2y0Var, tse tseVar, alk0 alk0Var, ufz0 ufz0Var, com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a aVar, ine0 ine0Var, dm21 dm21Var, ysg ysgVar) {
        this.a = o2y0Var;
        this.b = tseVar;
        this.c = alk0Var;
        this.d = ufz0Var;
        this.e = aVar;
        this.f = ine0Var;
        this.g = dm21Var;
        this.h = ysgVar;
    }

    public final void a() {
        com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a aVar = this.e;
        String str = this.a.b().a;
        FeedbackParam a = aVar.d.a(str, this.a.b().l.getW());
        aVar.e.put(str, a);
        aVar.b.a(a);
        aVar.g.a();
    }

    public final void b() {
        if (this.a.b().h.getB() == DriveState.COMPLETE) {
            return;
        }
        e();
    }

    public final void c() {
        Object value;
        TaxiOrder taxiOrder;
        o2y0 o2y0Var = this.a;
        if (diz0.e(o2y0Var.b().y())) {
            r0 r0Var = o2y0Var.a;
            do {
                value = r0Var.getValue();
                taxiOrder = (TaxiOrder) value;
                taxiOrder.S(null);
            } while (!r0Var.k(value, taxiOrder));
            o2y0Var.f();
            ((b) this.g).d(o2y0Var.b().a, jsq.a(o2y0Var.b()));
            this.h.g(o2y0Var.b());
            b();
        }
    }

    public final void d() {
        int s = this.f.a.s();
        if (diz0.e(this.a.b().y()) || !this.a.b().l.W.g.c || s <= 0) {
            return;
        }
        g(new ii8(s, 6));
        b();
    }

    public final void e() {
        tje.N(this.b, null, null, new FeedbackInteractor$sendFeedback$1(this, null), 3);
    }

    public final void f() {
        TaxiOrder b = this.a.b();
        ufz0 ufz0Var = this.d;
        if (ufz0Var.a(b)) {
            this.c.a(new FeedbackInteractor$showTipsSuggestIfNeeded$1(1, this, a.class, "onPreferredTipsChangedByTipsSuggest", "onPreferredTipsChangedByTipsSuggest(I)V", 0));
            vfz0 vfz0Var = ufz0Var.a;
            vfz0Var.a.setValue(vfz0Var, vfz0.b[0], 0);
        }
    }

    public final void g(tls tlsVar) {
        Object value;
        TaxiOrder taxiOrder;
        o2y0 o2y0Var = this.a;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            tlsVar.invoke(taxiOrder);
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        ((b) this.g).d(o2y0Var.b().a, jsq.a(o2y0Var.b()));
        this.h.g(o2y0Var.b());
    }
}
