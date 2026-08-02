package com.yandex.go.chargers.offer.ui.compose.ui;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardButtonNameV6;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardToggleType;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersSubscriptionToggleState;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.dvizh_subscription.api.ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint;
import com.yandex.go.scooters.api.domain.model.ScootersPassesListService;
import defpackage.a7a;
import defpackage.aaa;
import defpackage.aza;
import defpackage.b5a;
import defpackage.b64;
import defpackage.b7a;
import defpackage.baa;
import defpackage.c21;
import defpackage.c29;
import defpackage.caa;
import defpackage.d7a;
import defpackage.daa;
import defpackage.dn9;
import defpackage.dxa;
import defpackage.eaa;
import defpackage.em9;
import defpackage.ew9;
import defpackage.eza;
import defpackage.faa;
import defpackage.gaa;
import defpackage.gp9;
import defpackage.haa;
import defpackage.hm9;
import defpackage.hp9;
import defpackage.hwa;
import defpackage.hxx;
import defpackage.i8a;
import defpackage.iaa;
import defpackage.im9;
import defpackage.ip9;
import defpackage.ir9;
import defpackage.j1a;
import defpackage.jaa;
import defpackage.jj9;
import defpackage.jl40;
import defpackage.jm9;
import defpackage.k9a;
import defpackage.km9;
import defpackage.m950;
import defpackage.n9a;
import defpackage.ny61;
import defpackage.o9a;
import defpackage.oma;
import defpackage.pxm0;
import defpackage.qo9;
import defpackage.qu;
import defpackage.qvn0;
import defpackage.r;
import defpackage.r7a;
import defpackage.ro9;
import defpackage.rx9;
import defpackage.so9;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tsa;
import defpackage.u6a;
import defpackage.u7a;
import defpackage.u9a;
import defpackage.uj9;
import defpackage.uma;
import defpackage.v6a;
import defpackage.v9a;
import defpackage.vwa;
import defpackage.w511;
import defpackage.w6a;
import defpackage.w9a;
import defpackage.x9a;
import defpackage.y6a;
import defpackage.y9a;
import defpackage.z6a;
import defpackage.z9a;
import defpackage.zla;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b {
    public final em9 a;
    public final com.yandex.go.chargers.offer.domain.c b;
    public final com.yandex.go.chargers.offer.domain.b c;
    public final o9a d;
    public final k9a e;
    public final i8a f;
    public final tsa g;
    public final c29 h;

    public b(em9 em9Var, com.yandex.go.chargers.offer.domain.c cVar, com.yandex.go.chargers.offer.domain.b bVar, o9a o9aVar, k9a k9aVar, i8a i8aVar, tsa tsaVar, c29 c29Var) {
        this.a = em9Var;
        this.b = cVar;
        this.c = bVar;
        this.d = o9aVar;
        this.e = k9aVar;
        this.f = i8aVar;
        this.g = tsaVar;
        this.h = c29Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ChargersOfferUiActionInteractor$createOrder$1 chargersOfferUiActionInteractor$createOrder$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ChargersOfferUiActionInteractor$createOrder$1) {
            chargersOfferUiActionInteractor$createOrder$1 = (ChargersOfferUiActionInteractor$createOrder$1) continuationImpl;
            int i2 = chargersOfferUiActionInteractor$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferUiActionInteractor$createOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOfferUiActionInteractor$createOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferUiActionInteractor$createOrder$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersOfferUiActionInteractor$createOrder$1.L$0 = null;
                    chargersOfferUiActionInteractor$createOrder$1.label = 1;
                    obj = this.b.a(str, chargersOfferUiActionInteractor$createOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ip9 ip9Var = (ip9) obj;
                z = ip9Var instanceof gp9;
                c29 c29Var = this.h;
                em9 em9Var = this.a;
                if (!z) {
                    em9Var.n(ChargersAnalytics$ChargersOfferCardCloseReason.Error);
                    ((u7a) c29Var.b).r(new j1a(((gp9) ip9Var).a, i3));
                } else {
                    if (!(ip9Var instanceof hp9)) {
                        w511.b();
                        return null;
                    }
                    em9Var.n(ChargersAnalytics$ChargersOfferCardCloseReason.CreateOrder);
                    ((u7a) c29Var.b).r(new b5a(((hp9) ip9Var).a, i3));
                }
                return zy11.a;
            }
        }
        chargersOfferUiActionInteractor$createOrder$1 = new ChargersOfferUiActionInteractor$createOrder$1(this, continuationImpl);
        Object obj2 = chargersOfferUiActionInteractor$createOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferUiActionInteractor$createOrder$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        ip9 ip9Var2 = (ip9) obj2;
        z = ip9Var2 instanceof gp9;
        c29 c29Var2 = this.h;
        em9 em9Var2 = this.a;
        if (!z) {
        }
        return zy11.a;
    }

    public final Object b(jaa jaaVar, SuspendLambda suspendLambda) {
        Object obj;
        boolean l = jl40.l(jaaVar, u9a.a);
        em9 em9Var = this.a;
        c29 c29Var = this.h;
        if (l) {
            em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.Back, null, null, null, null, null, 62);
            em9Var.n(ChargersAnalytics$ChargersOfferCardCloseReason.Back);
            ((u7a) c29Var.b).r(new qu(9));
        } else if (jl40.l(jaaVar, iaa.a)) {
            em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.Back, null, null, null, null, null, 62);
            em9Var.n(ChargersAnalytics$ChargersOfferCardCloseReason.Back);
        } else {
            final int i = 1;
            if (jaaVar instanceof aaa) {
                em9Var.n(ChargersAnalytics$ChargersOfferCardCloseReason.Error);
                ((u7a) c29Var.b).r(new j1a(((aaa) jaaVar).a, i));
            } else {
                boolean z = jaaVar instanceof w9a;
                c21 c21Var = sy60.Q2;
                if (z) {
                    ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV6 = ChargersAnalytics$ChargersOfferCardButtonNameV6.Badge;
                    qo9 qo9Var = ((w9a) jaaVar).a;
                    em9.p(this.a, chargersAnalytics$ChargersOfferCardButtonNameV6, null, null, qo9Var.a, null, null, 54);
                    uj9 uj9Var = qo9Var.e;
                    if (uj9Var instanceof so9) {
                        oma omaVar = ((so9) uj9Var).a;
                        u7a u7aVar = (u7a) c29Var.b;
                        u7aVar.A(u7aVar.L.a(u7aVar.G), new uma(omaVar.c, omaVar.d, omaVar.b), c21Var);
                    } else if (uj9Var instanceof ro9) {
                        hwa hwaVar = ((ro9) uj9Var).a;
                        u7a u7aVar2 = (u7a) c29Var.b;
                        u7aVar2.A(u7aVar2.N.a(u7aVar2.G), hwaVar, c21Var);
                    }
                } else {
                    boolean z2 = jaaVar instanceof x9a;
                    tsa tsaVar = this.g;
                    if (z2) {
                        uj9 uj9Var2 = ((x9a) jaaVar).a;
                        if (uj9Var2 instanceof w6a) {
                            w6a w6aVar = (w6a) uj9Var2;
                            c29Var.d(w6aVar.a, tsaVar, w6aVar.b);
                        }
                    } else if (jaaVar instanceof gaa) {
                        vwa vwaVar = ((gaa) jaaVar).a;
                        u7a u7aVar3 = (u7a) c29Var.b;
                        u7aVar3.A((m950) u7aVar3.S.get(), vwaVar, c21Var);
                    } else if (jaaVar instanceof haa) {
                        uj9 uj9Var3 = ((haa) jaaVar).a;
                        if (uj9Var3 instanceof dxa) {
                            em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.SurgeIcon, null, null, null, null, null, 62);
                            hwa hwaVar2 = ((dxa) uj9Var3).a;
                            u7a u7aVar4 = (u7a) c29Var.b;
                            u7aVar4.A(u7aVar4.N.a(u7aVar4.G), hwaVar2, c21Var);
                        }
                    } else {
                        Object obj2 = null;
                        if (jaaVar instanceof v9a) {
                            v9a v9aVar = (v9a) jaaVar;
                            km9 km9Var = v9aVar.a;
                            String str = v9aVar.b;
                            if (km9Var instanceof hm9) {
                                u7a u7aVar5 = (u7a) c29Var.b;
                                u7aVar5.A((m950) u7aVar5.P.get(), new dn9((hm9) km9Var), c21Var);
                            } else if (km9Var instanceof jm9) {
                                ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV62 = ChargersAnalytics$ChargersOfferCardButtonNameV6.PromoNotch;
                                jm9 jm9Var = (jm9) km9Var;
                                String str2 = jm9Var.b;
                                HashMap w = b64.w(em9Var);
                                w.put("button_name", chargersAnalytics$ChargersOfferCardButtonNameV62.getEventValue());
                                if (str2 != null) {
                                    w.put("discount_id", str2);
                                }
                                em9Var.a.a("Chargers.OfferCard.Tapped", w, 6, new HashMap());
                                Iterator<E> it = ChargersDiscountTypeDto.b().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (jl40.l(((ChargersDiscountTypeDto) obj).name(), jm9Var.a)) {
                                        break;
                                    }
                                }
                                ChargersDiscountTypeDto chargersDiscountTypeDto = (ChargersDiscountTypeDto) obj;
                                if (chargersDiscountTypeDto != null) {
                                    c29Var.d(str, tsaVar, new ir9(chargersDiscountTypeDto, str2, null));
                                }
                            } else if (!jl40.l(km9Var, im9.a)) {
                                w511.b();
                                return null;
                            }
                        } else {
                            if (jaaVar instanceof y9a) {
                                return c((y9a) jaaVar, suspendLambda);
                            }
                            if (jaaVar instanceof z9a) {
                                em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.DiscountsAndPromocodes, null, null, null, null, null, 62);
                                c29Var.d(((z9a) jaaVar).a, tsaVar, null);
                            } else if (jaaVar instanceof baa) {
                                em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.ShowLegalTerms, null, null, null, null, null, 62);
                                String str3 = ((baa) jaaVar).a;
                                u7a u7aVar6 = (u7a) c29Var.b;
                                u7aVar6.A((m950) u7aVar6.J.get(), new eza(new aza(str3)), c21Var);
                            } else if (jl40.l(jaaVar, caa.a)) {
                                d();
                            } else {
                                boolean z3 = jaaVar instanceof daa;
                                o9a o9aVar = this.d;
                                if (z3) {
                                    daa daaVar = (daa) jaaVar;
                                    uj9 uj9Var4 = daaVar.a;
                                    n9a n9aVar = daaVar.b;
                                    if (uj9Var4 instanceof z6a) {
                                        em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.PromoBar, null, ((z6a) uj9Var4).a, null, null, null, 58);
                                        final u7a u7aVar7 = (u7a) c29Var.b;
                                        final int i2 = 0;
                                        u7aVar7.E((m950) u7aVar7.H.get(), new qvn0(new pxm0("chargers", "offer"), ScootersPassesListService.CHARGERS), new sy60() { // from class: com.yandex.go.chargers.offer.ui.compose.d
                                            @Override // defpackage.sy60
                                            public final void a() {
                                                int i3 = i2;
                                                u7a u7aVar8 = u7aVar7;
                                                switch (i3) {
                                                    case 0:
                                                        tje.N(u7aVar8.o(), null, null, new ChargersOfferComposeRouter$showScootersSuperPasses$1$1(u7aVar8, null), 3);
                                                        break;
                                                    default:
                                                        tje.N(u7aVar8.o(), null, null, new ChargersOfferComposeRouter$showDvizhSubscription$1$1(u7aVar8, null), 3);
                                                        break;
                                                }
                                            }
                                        }, hxx.a);
                                    } else if (uj9Var4 instanceof y6a) {
                                        if (n9aVar != null) {
                                            if (!n9aVar.b) {
                                                n9aVar = null;
                                            }
                                            if (n9aVar != null) {
                                                o9aVar.a.l(n9aVar);
                                            }
                                        }
                                        final u7a u7aVar8 = (u7a) c29Var.b;
                                        u7aVar8.A((m950) u7aVar8.U.get(), new rx9(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint.OFFER, null, 6), new sy60() { // from class: com.yandex.go.chargers.offer.ui.compose.d
                                            @Override // defpackage.sy60
                                            public final void a() {
                                                int i3 = i;
                                                u7a u7aVar82 = u7aVar8;
                                                switch (i3) {
                                                    case 0:
                                                        tje.N(u7aVar82.o(), null, null, new ChargersOfferComposeRouter$showScootersSuperPasses$1$1(u7aVar82, null), 3);
                                                        break;
                                                    default:
                                                        tje.N(u7aVar82.o(), null, null, new ChargersOfferComposeRouter$showDvizhSubscription$1$1(u7aVar82, null), 3);
                                                        break;
                                                }
                                            }
                                        });
                                    } else if (uj9Var4 instanceof d7a) {
                                        d();
                                    }
                                } else if (jaaVar instanceof eaa) {
                                    ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV63 = ChargersAnalytics$ChargersOfferCardButtonNameV6.SubscriptionToggle;
                                    eaa eaaVar = (eaa) jaaVar;
                                    String str4 = eaaVar.a;
                                    boolean z4 = eaaVar.b;
                                    ChargersAnalytics$ChargersSubscriptionToggleState chargersAnalytics$ChargersSubscriptionToggleState = z4 ? ChargersAnalytics$ChargersSubscriptionToggleState.On : ChargersAnalytics$ChargersSubscriptionToggleState.Off;
                                    Iterator<E> it2 = ChargersAnalytics$ChargersOfferCardToggleType.a().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next = it2.next();
                                        if (jl40.l(((ChargersAnalytics$ChargersOfferCardToggleType) next).getEventValue(), str4)) {
                                            obj2 = next;
                                            break;
                                        }
                                    }
                                    em9.p(this.a, chargersAnalytics$ChargersOfferCardButtonNameV63, chargersAnalytics$ChargersSubscriptionToggleState, null, null, null, (ChargersAnalytics$ChargersOfferCardToggleType) obj2, 28);
                                    o9aVar.a.l(new n9a(str4, z4));
                                    if (eaaVar.c) {
                                        return this.c.m.a(suspendLambda);
                                    }
                                } else {
                                    if (!(jaaVar instanceof faa)) {
                                        w511.b();
                                        return null;
                                    }
                                    this.e.a.l(((faa) jaaVar).a);
                                }
                            }
                        }
                    }
                }
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y9a y9aVar, ContinuationImpl continuationImpl) {
        ChargersOfferUiActionInteractor$handleButtonAction$1 chargersOfferUiActionInteractor$handleButtonAction$1;
        int i;
        if (continuationImpl instanceof ChargersOfferUiActionInteractor$handleButtonAction$1) {
            chargersOfferUiActionInteractor$handleButtonAction$1 = (ChargersOfferUiActionInteractor$handleButtonAction$1) continuationImpl;
            int i2 = chargersOfferUiActionInteractor$handleButtonAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferUiActionInteractor$handleButtonAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOfferUiActionInteractor$handleButtonAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferUiActionInteractor$handleButtonAction$1.label;
                i8a i8aVar = this.f;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = i8aVar.a;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    uj9 uj9Var = y9aVar.a;
                    if (uj9Var instanceof u6a) {
                        em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.CreateOrder, null, null, null, null, null, 62);
                        String str = ((u6a) uj9Var).a;
                        chargersOfferUiActionInteractor$handleButtonAction$1.L$0 = null;
                        chargersOfferUiActionInteractor$handleButtonAction$1.L$1 = null;
                        chargersOfferUiActionInteractor$handleButtonAction$1.label = 1;
                        if (a(str, chargersOfferUiActionInteractor$handleButtonAction$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        boolean z = uj9Var instanceof a7a;
                        c29 c29Var = this.h;
                        if (z) {
                            em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.CreateOrder, null, null, null, null, null, 62);
                            a7a a7aVar = (a7a) uj9Var;
                            ((u7a) c29Var.b).r(new r(a7aVar.a, a7aVar.b, 5));
                        } else if (uj9Var instanceof b7a) {
                            em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.CreateOrder, null, null, null, null, null, 62);
                            b7a b7aVar = (b7a) uj9Var;
                            String str2 = b7aVar.a;
                            kotlinx.serialization.json.b bVar = b7aVar.b;
                            ((u7a) c29Var.b).r(new r7a(0, str2, b7aVar.c, bVar));
                        } else if (uj9Var instanceof d7a) {
                            d();
                        } else if (uj9Var instanceof v6a) {
                            em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.Login, null, null, null, null, null, 62);
                            ((u7a) c29Var.b).r(new ew9(20));
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                r0 r0Var2 = i8aVar.a;
                Boolean bool2 = Boolean.FALSE;
                r0Var2.getClass();
                r0Var2.m(null, bool2);
                return zy11.a;
            }
        }
        chargersOfferUiActionInteractor$handleButtonAction$1 = new ChargersOfferUiActionInteractor$handleButtonAction$1(this, continuationImpl);
        Object obj3 = chargersOfferUiActionInteractor$handleButtonAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferUiActionInteractor$handleButtonAction$1.label;
        i8a i8aVar2 = this.f;
        if (i != 0) {
        }
        r0 r0Var22 = i8aVar2.a;
        Boolean bool22 = Boolean.FALSE;
        r0Var22.getClass();
        r0Var22.m(null, bool22);
        return zy11.a;
    }

    public final void d() {
        em9.p(this.a, ChargersAnalytics$ChargersOfferCardButtonNameV6.SelectPaymentMethod, null, null, null, null, null, 62);
        u7a u7aVar = (u7a) this.h.b;
        u7aVar.A((m950) u7aVar.T.get(), new zla(true, 5), new jj9(1));
    }
}
