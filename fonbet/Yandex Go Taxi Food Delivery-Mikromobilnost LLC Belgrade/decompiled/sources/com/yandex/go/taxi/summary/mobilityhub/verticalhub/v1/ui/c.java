package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.tariffs.interactor.r;
import defpackage.a3v;
import defpackage.ad5;
import defpackage.ag31;
import defpackage.b8r;
import defpackage.c1x0;
import defpackage.c4r0;
import defpackage.c611;
import defpackage.ck31;
import defpackage.cyu;
import defpackage.e331;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.gyu;
import defpackage.gzu;
import defpackage.hpi0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kzu;
import defpackage.lc31;
import defpackage.lo1;
import defpackage.lv21;
import defpackage.mi31;
import defpackage.o7r0;
import defpackage.ob31;
import defpackage.oyr;
import defpackage.qc31;
import defpackage.qzu;
import defpackage.rc31;
import defpackage.tje;
import defpackage.uc31;
import defpackage.v0v;
import defpackage.w511;
import defpackage.x0v;
import defpackage.xby;
import defpackage.xyu;
import defpackage.za31;
import defpackage.zuj0;
import defpackage.zyu;
import java.util.Iterator;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class c extends ad5 {
    public final zuj0 A;
    public final ck31 B;
    public final a3v C;
    public final o7r0 D;
    public final cyu E;
    public final b8r F;
    public final com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.c G;
    public final uc31 H;
    public final hpi0 I;
    public final ag31 J;
    public final k K;
    public final c4r0 L;
    public final v0v M;
    public final r N;
    public rc31 O;
    public boolean P;
    public final c1x0 x;
    public final String y;
    public final HubOpenReason z;

    public c(c1x0 c1x0Var, String str, HubOpenReason hubOpenReason, zuj0 zuj0Var, ck31 ck31Var, a3v a3vVar, o7r0 o7r0Var, cyu cyuVar, b8r b8rVar, com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.c cVar, uc31 uc31Var, hpi0 hpi0Var, ag31 ag31Var, k kVar, c4r0 c4r0Var, v0v v0vVar, r rVar) {
        super(lc31.class);
        this.x = c1x0Var;
        this.y = str;
        this.z = hubOpenReason;
        this.A = zuj0Var;
        this.B = ck31Var;
        this.C = a3vVar;
        this.D = o7r0Var;
        this.E = cyuVar;
        this.F = b8rVar;
        this.G = cVar;
        this.H = uc31Var;
        this.I = hpi0Var;
        this.J = ag31Var;
        this.K = kVar;
        this.L = c4r0Var;
        this.M = v0vVar;
        this.N = rVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.C.a0(this);
    }

    public final void Kg(qzu qzuVar) {
        boolean z = qzuVar instanceof xyu;
        c1x0 c1x0Var = this.x;
        if (z) {
            c611 c611Var = ((xyu) qzuVar).a;
            ((qc31) c1x0Var.a).r(new e331(6, c611Var.b, c611Var.c));
        } else if (qzuVar instanceof kzu) {
            Lg(((kzu) qzuVar).a);
        } else if (qzuVar instanceof zyu) {
            Lg(((zyu) qzuVar).a);
        } else if (qzuVar instanceof gzu) {
            ((qc31) c1x0Var.a).r(new lo1(((gzu) qzuVar).a, ((ModalState) this.H.b.a.getValue()) == ModalState.Expanded, 16));
        } else if (qzuVar != null) {
            w511.b();
            return;
        }
        Og();
    }

    public final void Lg(String str) {
        mi31 d = b8r.d(this.F, str, null, 6);
        if (d == null) {
            xby.l(jst.e, "VerticalHub.HandleAction.Error", null, null, oyr.p("Cannot find tariff ", str, " for redirect"), 6);
            return;
        }
        this.L.a(new gnx0(new fnx0(d, SelectionOrigin.ACTION), true));
        ((qc31) this.x.a).r(new lv21(d.b, 2));
    }

    public final void Mg() {
        gyu gyuVar;
        x0v x0vVar;
        rc31 rc31Var = this.O;
        if (rc31Var == null || (gyuVar = rc31Var.d) == null || (x0vVar = gyuVar.a) == null) {
            return;
        }
        tje.N(Jg(), null, null, new VerticalHubV1Presenter$hideOnboarding$1$1(this, x0vVar, null), 3);
    }

    public final void Ng(ob31 ob31Var) {
        Object obj;
        boolean z = ob31Var.c;
        String str = ob31Var.a;
        if (z) {
            return;
        }
        String str2 = this.y;
        if (jl40.l(str, str2)) {
            return;
        }
        Iterator it = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.B).j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((za31) obj).a.a, str2)) {
                    break;
                }
            }
        }
        za31 za31Var = (za31) obj;
        String str3 = ob31Var.a;
        String str4 = ob31Var.b;
        String str5 = za31Var != null ? za31Var.a.d : null;
        if (str5 == null) {
            str5 = "";
        }
        this.J.a(str3, str4, this.y, str5, VerticalSelectorAnalytics$SelectionChangeReason.Tap);
        ((qc31) this.x.a).r(new lv21(str, 2));
    }

    public final void Og() {
        if (this.P) {
            return;
        }
        this.P = true;
        Mg();
    }
}
