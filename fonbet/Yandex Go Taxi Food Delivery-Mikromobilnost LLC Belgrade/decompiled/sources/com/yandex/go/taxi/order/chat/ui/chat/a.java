package com.yandex.go.taxi.order.chat.ui.chat;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.a980;
import defpackage.ad5;
import defpackage.ezx0;
import defpackage.fzx0;
import defpackage.g6;
import defpackage.hg7;
import defpackage.oep0;
import defpackage.p2y0;
import defpackage.pg7;
import defpackage.pj;
import defpackage.pzt0;
import defpackage.s7h;
import defpackage.ss21;
import defpackage.tje;
import defpackage.yh70;
import defpackage.ysg;
import defpackage.zuj0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final fzx0 A;
    public final ss21 B;
    public final pj C;
    public final yh70 D;
    public final ysg E;
    public final a980 F;
    public final pg7 G;
    public final hg7 H;
    public final g6 I;
    public final oep0 J;
    public final s7h K;
    public final p2y0 L;
    public com.yandex.go.taxi.order.chat.call_feedback.navigation.a M;
    public final a3y0 N;
    public pzt0 O;
    public pzt0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final TaxiOrder x;
    public final com.yandex.go.taxi.order.chat.domain.a y;
    public final zuj0 z;

    public a(TaxiOrder taxiOrder, com.yandex.go.taxi.order.chat.domain.a aVar, zuj0 zuj0Var, fzx0 fzx0Var, ss21 ss21Var, pj pjVar, yh70 yh70Var, ysg ysgVar, a980 a980Var, pg7 pg7Var, hg7 hg7Var, g6 g6Var, oep0 oep0Var, s7h s7hVar, p2y0 p2y0Var) {
        super(ezx0.class);
        this.x = taxiOrder;
        this.y = aVar;
        this.z = zuj0Var;
        this.A = fzx0Var;
        this.B = ss21Var;
        this.C = pjVar;
        this.D = yh70Var;
        this.E = ysgVar;
        this.F = a980Var;
        this.G = pg7Var;
        this.H = hg7Var;
        this.I = g6Var;
        this.J = oep0Var;
        this.K = s7hVar;
        this.L = p2y0Var;
        this.N = new a3y0(TaxiOrderLogGroup.ORDER_CHAT.getTag(), "TaxiOrderChatPresenter");
        this.R = taxiOrder.l.k;
        this.S = taxiOrder.l.l;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((ezx0) Dg()).hideCallButton();
        super.Cg();
        this.y.c(this.x.a).u = true;
        com.yandex.go.taxi.order.chat.call_feedback.navigation.a aVar = this.M;
        if (aVar != null) {
            aVar.i();
        }
        this.M = null;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        this.y.c(this.x.a).u = true;
        pzt0 pzt0Var = this.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.P;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        com.yandex.go.taxi.order.chat.domain.a aVar = this.y;
        TaxiOrder taxiOrder = this.x;
        aVar.c(taxiOrder.a).u = false;
        com.yandex.go.taxi.order.chat.data.b c = aVar.c(taxiOrder.a);
        this.O = tje.N(Jg(), null, null, new TaxiOrderChatPresenter$onResume$$inlined$safeCollectIn$1(e.f(c.c(c.n), 0, BufferOverflow.DROP_OLDEST, 1), null, this), 3);
        this.P = tje.N(Jg(), null, null, new TaxiOrderChatPresenter$onResume$3(this, null), 3);
        Kg(taxiOrder);
    }

    public final void Kg(TaxiOrder taxiOrder) {
        if (Eg()) {
            ezx0 ezx0Var = (ezx0) Dg();
            if (taxiOrder.G() || !taxiOrder.V().R) {
                ezx0Var.dismiss();
            } else if (taxiOrder.h.b != DriveState.WAITING || taxiOrder.H()) {
                ezx0Var.hideComing();
            } else {
                ezx0Var.showComing();
            }
        }
    }
}
