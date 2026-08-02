package com.yandex.go.places.organization.card.impl.ui.card.flex.v1;

import com.adjust.sdk.Constants;
import com.yandex.go.places.common.flex.actions.web.a;
import com.yandex.go.places.organization.card.api.domain.entities.OrganizationGalleryItemState;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c;
import defpackage.af80;
import defpackage.ah00;
import defpackage.aq;
import defpackage.c9c0;
import defpackage.cq;
import defpackage.dac0;
import defpackage.dq;
import defpackage.eq;
import defpackage.ex0;
import defpackage.f470;
import defpackage.fq;
import defpackage.fr;
import defpackage.gq;
import defpackage.hf80;
import defpackage.hq;
import defpackage.i3h;
import defpackage.i3y;
import defpackage.iq;
import defpackage.jp;
import defpackage.jsj;
import defpackage.k0b0;
import defpackage.kp;
import defpackage.kq;
import defpackage.kw;
import defpackage.lc0;
import defpackage.lf80;
import defpackage.lg80;
import defpackage.m9c0;
import defpackage.mi80;
import defpackage.mse;
import defpackage.ne80;
import defpackage.oe80;
import defpackage.oep0;
import defpackage.pe80;
import defpackage.q3v;
import defpackage.qi80;
import defpackage.ri80;
import defpackage.rp;
import defpackage.si80;
import defpackage.sls;
import defpackage.so;
import defpackage.sp;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tq;
import defpackage.tt2;
import defpackage.uq;
import defpackage.ve80;
import defpackage.w511;
import defpackage.wbc0;
import defpackage.xq;
import defpackage.y55;
import defpackage.y7c0;
import defpackage.ye80;
import defpackage.yp;
import defpackage.yq;
import defpackage.yvf0;
import defpackage.z93;
import defpackage.ze80;
import defpackage.zq;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class c extends y55 implements oe80 {
    public final ze80 G;
    public final y7c0 H;
    public final jsj I;
    public final af80 J;
    public final tt2 K;
    public final com.yandex.go.places.impl.domain.interactors.a L;
    public final dac0 M;
    public final com.yandex.go.places.organization.card.impl.domain.interactors.flex.a N;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_taxi.a O;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_delivery.a P;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_navigator.a Q;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.goal_tracking_link.a R;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_organization.a S;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a T;
    public final yvf0 U;
    public final i3h V;
    public final pe80 W;
    public final com.yandex.go.places.analytics.organization.card.a Z;
    public final m9c0 a0;
    public final oep0 b0;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.a c0;
    public final wbc0 d0;
    public boolean e0;
    public List f0;
    public String g0;
    public final i3y h0;
    public final f470 i0;
    public final b j0;
    public final b k0;
    public final b l0;
    public final i3y m0;
    public final i3y n0;
    public final i3y o0;
    public final i3y p0;

    public c(ve80 ve80Var, y7c0 y7c0Var, jsj jsjVar, af80 af80Var, tt2 tt2Var, com.yandex.go.places.impl.domain.interactors.a aVar, dac0 dac0Var, com.yandex.go.places.organization.card.impl.domain.interactors.flex.a aVar2, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_taxi.a aVar3, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_delivery.a aVar4, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_navigator.a aVar5, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.goal_tracking_link.a aVar6, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_organization.a aVar7, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a aVar8, yvf0 yvf0Var, i3h i3hVar, pe80 pe80Var, com.yandex.go.places.analytics.organization.card.a aVar9, m9c0 m9c0Var, oep0 oep0Var, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.a aVar10, wbc0 wbc0Var, boolean z, boolean z2, lf80 lf80Var, q3v q3vVar, k0b0 k0b0Var, ah00 ah00Var) {
        super(q3vVar, k0b0Var, ah00Var, z2, z);
        this.G = ve80Var;
        this.H = y7c0Var;
        this.I = jsjVar;
        this.J = af80Var;
        this.K = tt2Var;
        this.L = aVar;
        this.M = dac0Var;
        this.N = aVar2;
        this.O = aVar3;
        this.P = aVar4;
        this.Q = aVar5;
        this.R = aVar6;
        this.S = aVar7;
        this.T = aVar8;
        this.U = yvf0Var;
        this.V = i3hVar;
        this.W = pe80Var;
        this.Z = aVar9;
        this.a0 = m9c0Var;
        this.b0 = oep0Var;
        this.c0 = aVar10;
        this.d0 = wbc0Var;
        final int i = 1;
        this.e0 = true;
        this.f0 = EmptyList.a;
        this.g0 = "";
        final int i2 = 0;
        sls slsVar = new sls(this) { // from class: df80
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        y7c0 y7c0Var2 = cVar.H;
                        return new o8c0(y7c0Var2.getPath(), y7c0Var2.a());
                    case 1:
                        return new a(cVar.b0, cVar.U, new ef80(0, cVar));
                    case 2:
                        return new hf80(11, (List) cVar.F.getValue());
                    default:
                        return new if80(11, (List) cVar.E.getValue());
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h0 = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        this.i0 = new f470(i, this);
        final int i3 = 2;
        this.j0 = new b(this, 2);
        this.k0 = new b(this, 0);
        this.l0 = new b(this, 1);
        this.m0 = kotlin.a.a(new sls(this) { // from class: df80
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i;
                c cVar = this.b;
                switch (i32) {
                    case 0:
                        y7c0 y7c0Var2 = cVar.H;
                        return new o8c0(y7c0Var2.getPath(), y7c0Var2.a());
                    case 1:
                        return new a(cVar.b0, cVar.U, new ef80(0, cVar));
                    case 2:
                        return new hf80(11, (List) cVar.F.getValue());
                    default:
                        return new if80(11, (List) cVar.E.getValue());
                }
            }
        });
        this.n0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: df80
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                c cVar = this.b;
                switch (i32) {
                    case 0:
                        y7c0 y7c0Var2 = cVar.H;
                        return new o8c0(y7c0Var2.getPath(), y7c0Var2.a());
                    case 1:
                        return new a(cVar.b0, cVar.U, new ef80(0, cVar));
                    case 2:
                        return new hf80(11, (List) cVar.F.getValue());
                    default:
                        return new if80(11, (List) cVar.E.getValue());
                }
            }
        });
        final int i4 = 3;
        this.o0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: df80
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i4;
                c cVar = this.b;
                switch (i32) {
                    case 0:
                        y7c0 y7c0Var2 = cVar.H;
                        return new o8c0(y7c0Var2.getPath(), y7c0Var2.a());
                    case 1:
                        return new a(cVar.b0, cVar.U, new ef80(0, cVar));
                    case 2:
                        return new hf80(11, (List) cVar.F.getValue());
                    default:
                        return new if80(11, (List) cVar.E.getValue());
                }
            }
        });
        this.p0 = kotlin.a.b(lazyThreadSafetyMode, new ex0(this, z, lf80Var, 14));
    }

    public static final void Mg(c cVar) {
        ((ye80) cVar.Dg()).render((hf80) cVar.n0.getValue());
        ne80 ne80Var = (ne80) cVar.J.a.getValue();
        if (ne80Var != null) {
            cVar.Z.n(ne80Var.a, ne80Var.b);
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((c9c0) this.p0.getValue()).i();
    }

    @Override // defpackage.ad5
    public final mse Ig() {
        return new z93(this);
    }

    @Override // defpackage.oe80
    public final void Nb() {
        ne80 ne80Var = (ne80) this.J.a.getValue();
        if (ne80Var != null) {
            this.Z.o(ne80Var.a, ne80Var.b);
        }
    }

    public final void Ng(mi80 mi80Var) {
        kw kwVar;
        Pair pair;
        fr a = mi80Var.a();
        if (mi80Var.b() != OrganizationGalleryItemState.CONTENT || a == null) {
            return;
        }
        boolean z = a instanceof eq;
        if (z) {
            tje.N(Jg(), null, null, new OrganizationCardFlexPresenter$onGalleryItemClicked$1(this, mi80Var, null), 3);
        } else {
            this.L.a(a, null);
        }
        ne80 ne80Var = (ne80) this.J.a.getValue();
        if (ne80Var != null) {
            ti80 ti80Var = ne80Var.a;
            lg80 lg80Var = ne80Var.b;
            com.yandex.go.places.analytics.organization.card.a aVar = this.Z;
            aVar.x.getClass();
            if (a instanceof yp) {
                kwVar = new kw("list", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof xq) {
                kwVar = new kw("share_native", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof kq) {
                kwVar = new kw("organization_card", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof jp) {
                kwVar = new kw(Constants.DEEPLINK, ((jp) a).a, (String) null, (String) null, 28);
            } else if (a instanceof hq) {
                kwVar = new kw("web_view", (String) null, ((hq) a).a, (String) null, 22);
            } else if (a instanceof gq) {
                kwVar = new kw("web_custom_tabs", (String) null, ((gq) a).a, (String) null, 22);
            } else if (a instanceof fq) {
                kwVar = new kw("open_taxi", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof cq) {
                kwVar = new kw("open_delivery_order_form", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof dq) {
                kwVar = new kw("open_navigator", (String) null, (String) null, (String) null, 30);
            } else if (z) {
                kwVar = new kw("open_photo_viewer", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof iq) {
                iq iqVar = (iq) a;
                kwVar = new kw("web_view_auth", (String) null, iqVar.a, iqVar.c, 6);
            } else if (a instanceof kp) {
                kwVar = new kw("delete_user_review", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof rp) {
                kwVar = new kw("dismiss_modal", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof tq) {
                kwVar = new kw("apply_filters", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof uq) {
                kwVar = new kw("reset_filters", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof aq) {
                kwVar = new kw("open_more_actions", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof zq) {
                kwVar = new kw("show_tracking_link", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof sp) {
                kwVar = new kw("goal_tracking_link", (String) null, (String) null, (String) null, 30);
            } else if (a instanceof so) {
                kwVar = new kw("call_link_background", (String) null, (String) null, (String) null, 30);
            } else {
                if (!(a instanceof yq)) {
                    w511.b();
                    return;
                }
                kwVar = new kw("show_favorites_notification", (String) null, (String) null, (String) null, 30);
            }
            if (ti80Var instanceof qi80) {
                pair = new Pair(null, ((qi80) ti80Var).a);
            } else if (ti80Var instanceof ri80) {
                pair = new Pair(((ri80) ti80Var).a, null);
            } else if (!(ti80Var instanceof si80)) {
                w511.b();
                return;
            } else {
                si80 si80Var = (si80) ti80Var;
                pair = new Pair(si80Var.a, si80Var.b);
            }
            aVar.k(new lc0((String) pair.getFirst(), (String) pair.getSecond(), lg80Var, kwVar, 16), "Discovery.OrganisationCard.Tapped");
        }
    }
}
