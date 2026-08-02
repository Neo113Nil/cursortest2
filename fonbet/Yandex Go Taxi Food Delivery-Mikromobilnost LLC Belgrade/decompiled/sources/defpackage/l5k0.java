package defpackage;

import com.yandex.go.rida.bids.router.g;
import com.yandex.go.taxi.order.models.api.TaxiOrder;

/* loaded from: classes13.dex */
public final class l5k0 implements epq0 {
    public final /* synthetic */ g a;
    public final /* synthetic */ o2y0 b;
    public final /* synthetic */ c29 c;

    public l5k0(c29 c29Var, o2y0 o2y0Var, g gVar) {
        this.a = gVar;
        this.b = o2y0Var;
        this.c = c29Var;
    }

    @Override // defpackage.epq0
    public final void H2(cjm0 cjm0Var) {
        g gVar = this.a;
        String h = ((avj0) gVar.E).h(kyh0.no_connection_title);
        zuj0 zuj0Var = gVar.E;
        mej mejVar = new mej(h, ((avj0) zuj0Var).h(kyh0.no_connection_check_prompt), ((avj0) zuj0Var).h(kyh0.common_cancel), ((avj0) zuj0Var).h(kyh0.no_connection_try_again));
        c29 c29Var = this.c;
        g.T(gVar, mejVar, new k5k0(c29Var, this.b, gVar), new agc0(28, c29Var, this));
    }

    @Override // defpackage.epq0
    public final void Je(String str, String str2) {
        g gVar = this.a;
        k5k0 k5k0Var = new k5k0(gVar, this.b, this.c, 1);
        if (str2 == null) {
            str2 = ((avj0) gVar.E).h(kyh0.dialog_title_pls_update_app);
        }
        g.T(gVar, new mej(str2, null, null, ((avj0) gVar.E).h(kyh0.common_ok)), k5k0Var, k5k0Var);
    }

    @Override // defpackage.epq0
    public final void P9(TaxiOrder taxiOrder) {
        g gVar = this.a;
        gVar.H.c(taxiOrder);
        yea0 yea0Var = gVar.R;
        yea0Var.getClass();
        lv90 lv90Var = taxiOrder.W().w;
        boolean z = taxiOrder.W().a0;
        if (lv90Var != null && z) {
            yea0Var.a.b(lv90Var);
        }
        yea0Var.b.h();
    }

    @Override // defpackage.epq0
    public final void Pa() {
        TaxiOrder b = this.b.b();
        synchronized (b) {
            b.l = b.l.G();
        }
        b.O(false);
        this.a.D.g(b);
    }

    @Override // defpackage.epq0
    public final void Uc() {
        o2y0 o2y0Var = this.b;
        g gVar = this.a;
        k5k0 k5k0Var = new k5k0(o2y0Var, gVar, this.c, 3);
        g.T(gVar, new mej(((avj0) gVar.E).h(kyh0.google_pay_payment_temporary_unavailable), null, null, ((avj0) gVar.E).h(kyh0.common_ok)), k5k0Var, k5k0Var);
    }

    @Override // defpackage.epq0
    public final void W1() {
        o2y0 o2y0Var = this.b;
        g gVar = this.a;
        k5k0 k5k0Var = new k5k0(o2y0Var, gVar, this.c, 0);
        g.T(gVar, new mej(((avj0) gVar.E).h(kyh0.common_unknown_error), null, null, ((avj0) gVar.E).h(kyh0.common_ok)), k5k0Var, k5k0Var);
    }

    @Override // defpackage.epq0
    public final void c2() {
        g.S(this.c, this.b, this.a);
    }

    @Override // defpackage.epq0
    public final void m8() {
        W1();
    }

    @Override // defpackage.epq0
    public final void pb() {
        g gVar = this.a;
        k5k0 k5k0Var = new k5k0(gVar, this.b, this.c, 2);
        g.T(gVar, new mej(((avj0) gVar.E).h(kyh0.order_too_often_message), null, null, ((avj0) gVar.E).h(kyh0.common_ok)), k5k0Var, k5k0Var);
    }

    @Override // defpackage.epq0
    public final void r9() {
        g.S(this.c, this.b, this.a);
    }
}
