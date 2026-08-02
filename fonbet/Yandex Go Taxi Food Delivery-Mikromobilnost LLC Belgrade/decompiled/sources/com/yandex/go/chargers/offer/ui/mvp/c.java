package com.yandex.go.chargers.offer.ui.mvp;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardButtonNameV6;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardToggleType;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersSubscriptionToggleState;
import com.yandex.go.chargers.dvizh_subscription.api.ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint;
import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import com.yandex.go.scooters.api.domain.model.ScootersPassesListService;
import defpackage.a7a;
import defpackage.a8a;
import defpackage.ad5;
import defpackage.aza;
import defpackage.b7a;
import defpackage.bvf0;
import defpackage.c21;
import defpackage.d7a;
import defpackage.e7a;
import defpackage.em9;
import defpackage.ew9;
import defpackage.eza;
import defpackage.f7a;
import defpackage.g6a;
import defpackage.h9a;
import defpackage.hwa;
import defpackage.hxx;
import defpackage.io9;
import defpackage.jj9;
import defpackage.jl40;
import defpackage.m950;
import defpackage.maa;
import defpackage.n9a;
import defpackage.o9a;
import defpackage.oaa;
import defpackage.oma;
import defpackage.paa;
import defpackage.pxm0;
import defpackage.qu;
import defpackage.qvn0;
import defpackage.r;
import defpackage.r7a;
import defpackage.ro9;
import defpackage.rx9;
import defpackage.s8a;
import defpackage.saa;
import defpackage.so9;
import defpackage.sy60;
import defpackage.t6a;
import defpackage.tje;
import defpackage.tsa;
import defpackage.u6a;
import defpackage.uj9;
import defpackage.uma;
import defpackage.v6a;
import defpackage.vn9;
import defpackage.w6a;
import defpackage.x6a;
import defpackage.y6a;
import defpackage.z6a;
import defpackage.zla;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c extends ad5 {
    public final com.yandex.go.chargers.offer.domain.c A;
    public final vn9 B;
    public final o9a C;
    public final saa D;
    public final String E;
    public final ChargersOfferOpenReason F;
    public final tsa G;
    public final io9 H;
    public final r0 I;
    public final em9 x;
    public final g6a y;
    public final com.yandex.go.chargers.offer.domain.b z;

    public c(em9 em9Var, g6a g6aVar, com.yandex.go.chargers.offer.domain.b bVar, com.yandex.go.chargers.offer.domain.c cVar, vn9 vn9Var, o9a o9aVar, saa saaVar, String str, ChargersOfferOpenReason chargersOfferOpenReason, tsa tsaVar, io9 io9Var) {
        super(s8a.class);
        this.x = em9Var;
        this.y = g6aVar;
        this.z = bVar;
        this.A = cVar;
        this.B = vn9Var;
        this.C = o9aVar;
        this.D = saaVar;
        this.E = str;
        this.F = chargersOfferOpenReason;
        this.G = tsaVar;
        this.H = io9Var;
        this.I = bvf0.c(maa.a);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.z.g.a();
        super.Cg();
    }

    public final void Kg(uj9 uj9Var, ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV6) {
        a8a a8aVar;
        n9a n9aVar;
        Object obj;
        if (uj9Var instanceof u6a) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.CreateOrder, null, null, null, null, null, 62);
            tje.N(Jg(), null, null, new ChargersOfferPresenter$createOrder$1(this, ((u6a) uj9Var).a, null), 3);
            return;
        }
        boolean z = uj9Var instanceof e7a;
        c21 c21Var = sy60.Q2;
        io9 io9Var = this.H;
        if (z) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.ShowLegalTerms, null, null, null, null, null, 62);
            String str = ((e7a) uj9Var).a;
            h9a h9aVar = (h9a) io9Var.a;
            h9aVar.A((m950) h9aVar.K.get(), new eza(new aza(str)), c21Var);
            return;
        }
        final int i = 1;
        if (uj9Var instanceof d7a) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.SelectPaymentMethod, null, null, null, null, null, 62);
            h9a h9aVar2 = (h9a) io9Var.a;
            h9aVar2.A((m950) h9aVar2.U.get(), new zla(true, 5), new jj9(2));
            return;
        }
        if (uj9Var instanceof v6a) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.Login, null, null, null, null, null, 62);
            ((h9a) io9Var.a).r(new ew9(21));
            return;
        }
        if (uj9Var instanceof t6a) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.Back, null, null, null, null, null, 62);
            this.x.n(ChargersAnalytics$ChargersOfferCardCloseReason.Back);
            ((h9a) io9Var.a).r(new qu(9));
            return;
        }
        if (uj9Var instanceof z6a) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.PromoBar, null, ((z6a) uj9Var).a, null, null, null, 58);
            final h9a h9aVar3 = (h9a) io9Var.a;
            final int i2 = 0;
            h9aVar3.E((m950) h9aVar3.H.get(), new qvn0(new pxm0("chargers", "offer"), ScootersPassesListService.CHARGERS), new sy60() { // from class: com.yandex.go.chargers.offer.navigation.a
                @Override // defpackage.sy60
                public final void a() {
                    int i3 = i2;
                    h9a h9aVar4 = h9aVar3;
                    switch (i3) {
                        case 0:
                            tje.N(h9aVar4.o(), null, null, new ChargersOfferRouter$showScootersSuperPasses$1$1(h9aVar4, null), 3);
                            break;
                        default:
                            tje.N(h9aVar4.o(), null, null, new ChargersOfferRouter$showDvizhSubscription$1$1(h9aVar4, null), 3);
                            break;
                    }
                }
            }, hxx.a);
            return;
        }
        boolean z2 = uj9Var instanceof f7a;
        o9a o9aVar = this.C;
        if (z2) {
            ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV62 = ChargersAnalytics$ChargersOfferCardButtonNameV6.SubscriptionToggle;
            f7a f7aVar = (f7a) uj9Var;
            String str2 = f7aVar.a;
            boolean z3 = f7aVar.b;
            ChargersAnalytics$ChargersSubscriptionToggleState chargersAnalytics$ChargersSubscriptionToggleState = z3 ? ChargersAnalytics$ChargersSubscriptionToggleState.On : ChargersAnalytics$ChargersSubscriptionToggleState.Off;
            Iterator<E> it = ChargersAnalytics$ChargersOfferCardToggleType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((ChargersAnalytics$ChargersOfferCardToggleType) obj).getEventValue(), str2)) {
                        break;
                    }
                }
            }
            em9.p(this.x, chargersAnalytics$ChargersOfferCardButtonNameV62, chargersAnalytics$ChargersSubscriptionToggleState, null, null, null, (ChargersAnalytics$ChargersOfferCardToggleType) obj, 28);
            o9aVar.a.l(new n9a(str2, z3));
            tje.N(Jg(), null, null, new ChargersOfferPresenter$handleAction$1(this, null), 3);
            return;
        }
        int i3 = 6;
        if (uj9Var instanceof a7a) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.CreateOrder, null, null, null, null, null, 62);
            a7a a7aVar = (a7a) uj9Var;
            ((h9a) io9Var.a).r(new r(a7aVar.a, a7aVar.b, i3));
            return;
        }
        if (uj9Var instanceof b7a) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.CreateOrder, null, null, null, null, null, 62);
            b7a b7aVar = (b7a) uj9Var;
            ((h9a) io9Var.a).r(new r7a(i, b7aVar.a, b7aVar.c, b7aVar.b));
            return;
        }
        if (uj9Var instanceof ro9) {
            if (chargersAnalytics$ChargersOfferCardButtonNameV6 != null) {
                em9.p(this.x, chargersAnalytics$ChargersOfferCardButtonNameV6, null, null, null, null, null, 62);
            }
            hwa hwaVar = ((ro9) uj9Var).a;
            h9a h9aVar4 = (h9a) io9Var.a;
            h9aVar4.A(h9aVar4.O.a(h9aVar4.G), hwaVar, c21Var);
            return;
        }
        if (uj9Var instanceof y6a) {
            paa paaVar = (paa) this.I.getValue();
            if ((paaVar instanceof oaa) && (a8aVar = ((oaa) paaVar).d.k) != null && (n9aVar = a8aVar.h) != null && n9aVar.b) {
                o9aVar.a.l(n9aVar);
            }
            final h9a h9aVar5 = (h9a) io9Var.a;
            h9aVar5.A((m950) h9aVar5.V.get(), new rx9(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint.OFFER, null, 6), new sy60() { // from class: com.yandex.go.chargers.offer.navigation.a
                @Override // defpackage.sy60
                public final void a() {
                    int i32 = i;
                    h9a h9aVar42 = h9aVar5;
                    switch (i32) {
                        case 0:
                            tje.N(h9aVar42.o(), null, null, new ChargersOfferRouter$showScootersSuperPasses$1$1(h9aVar42, null), 3);
                            break;
                        default:
                            tje.N(h9aVar42.o(), null, null, new ChargersOfferRouter$showDvizhSubscription$1$1(h9aVar42, null), 3);
                            break;
                    }
                }
            });
            return;
        }
        if (uj9Var instanceof so9) {
            if (chargersAnalytics$ChargersOfferCardButtonNameV6 != null) {
                em9.p(this.x, chargersAnalytics$ChargersOfferCardButtonNameV6, null, null, null, null, null, 62);
            }
            oma omaVar = ((so9) uj9Var).a;
            h9a h9aVar6 = (h9a) io9Var.a;
            h9aVar6.A(h9aVar6.L.a(h9aVar6.G), new uma(omaVar.c, omaVar.d, omaVar.b), c21Var);
            return;
        }
        boolean z4 = uj9Var instanceof x6a;
        tsa tsaVar = this.G;
        if (z4) {
            em9.p(this.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.DiscountsAndPromocodes, null, null, null, null, null, 62);
            io9Var.q(((x6a) uj9Var).a, tsaVar, null);
        } else if (uj9Var instanceof w6a) {
            w6a w6aVar = (w6a) uj9Var;
            io9Var.q(w6aVar.a, tsaVar, w6aVar.b);
        }
    }
}
