package com.yandex.go.payments.paymentlist.domain;

import com.adjust.sdk.Constants;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$ChangeType;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$LoyaltyToggleAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.a000;
import defpackage.a4m;
import defpackage.a60;
import defpackage.a6a0;
import defpackage.a7t0;
import defpackage.ad5;
import defpackage.ahs;
import defpackage.ak80;
import defpackage.b6a0;
import defpackage.bg0;
import defpackage.bhs;
import defpackage.bjm0;
import defpackage.bk0;
import defpackage.bt51;
import defpackage.bw90;
import defpackage.c111;
import defpackage.c21;
import defpackage.c6a0;
import defpackage.cap;
import defpackage.cfm0;
import defpackage.chs;
import defpackage.ck0;
import defpackage.cxq0;
import defpackage.d111;
import defpackage.d49;
import defpackage.df0;
import defpackage.dfm0;
import defpackage.dhs;
import defpackage.drd;
import defpackage.ehs;
import defpackage.el8;
import defpackage.ep51;
import defpackage.evz;
import defpackage.f731;
import defpackage.ffa0;
import defpackage.fhs;
import defpackage.fl8;
import defpackage.fvt;
import defpackage.g111;
import defpackage.g6a0;
import defpackage.g8a0;
import defpackage.g9a0;
import defpackage.gca0;
import defpackage.h211;
import defpackage.h270;
import defpackage.h3y;
import defpackage.h8b0;
import defpackage.hba0;
import defpackage.hm10;
import defpackage.hxx;
import defpackage.iba0;
import defpackage.ivt;
import defpackage.j000;
import defpackage.jc4;
import defpackage.jca0;
import defpackage.jl40;
import defpackage.jo51;
import defpackage.jst;
import defpackage.jve;
import defpackage.k75;
import defpackage.kd0;
import defpackage.kld0;
import defpackage.l2z;
import defpackage.lba0;
import defpackage.lea0;
import defpackage.lx4;
import defpackage.m4a0;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mca0;
import defpackage.mcp;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.mm10;
import defpackage.mp8;
import defpackage.na0;
import defpackage.nfh;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.oo2;
import defpackage.p1c;
import defpackage.pba0;
import defpackage.pja0;
import defpackage.pmn;
import defpackage.ptv;
import defpackage.qc20;
import defpackage.qfo;
import defpackage.qgx;
import defpackage.r5a0;
import defpackage.rsn;
import defpackage.s5a0;
import defpackage.sba0;
import defpackage.sha0;
import defpackage.snr0;
import defpackage.swz;
import defpackage.sy60;
import defpackage.t19;
import defpackage.t5a0;
import defpackage.t9a0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse0;
import defpackage.tsj0;
import defpackage.tt2;
import defpackage.u0k;
import defpackage.u19;
import defpackage.u5a0;
import defpackage.um50;
import defpackage.v32;
import defpackage.v5a0;
import defpackage.v770;
import defpackage.v7x;
import defpackage.vba0;
import defpackage.vbn;
import defpackage.vha0;
import defpackage.vi0;
import defpackage.w511;
import defpackage.w5a0;
import defpackage.wrz;
import defpackage.wxc;
import defpackage.x5a0;
import defpackage.xe91;
import defpackage.xea0;
import defpackage.xxc;
import defpackage.y50;
import defpackage.y5a0;
import defpackage.yba0;
import defpackage.yhi;
import defpackage.yo90;
import defpackage.yy51;
import defpackage.z5a0;
import defpackage.zba0;
import defpackage.zf8;
import defpackage.zgs;
import defpackage.zy11;
import defpackage.zz90;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes8.dex */
public final class k extends ad5 implements hba0 {
    public static final /* synthetic */ int a0 = 0;
    public final PaymentsScreen A;
    public final zba0 B;
    public final tpr C;
    public final com.yandex.go.payments.shared.a D;
    public final v32 E;
    public final oo2 F;
    public final qc20 G;
    public final ffa0 H;
    public final g8a0 I;
    public final g9a0 J;
    public final nfh K;
    public final tt2 L;
    public final lba0 M;
    public final pmn N;
    public final h3y O;
    public final pba0 P;
    public final jc4 Q;
    public final com.yandex.go.loyalty.impl.common.data.c R;
    public final fvt S;
    public final kld0 T;
    public final h270 U;
    public final h270 V;
    public final h270 W;
    public volatile boolean Z;
    public final vba0 x;
    public final com.yandex.go.payments.paymentlist.navigation.e y;
    public final cxq0 z;

    public k(vba0 vba0Var, com.yandex.go.payments.paymentlist.navigation.e eVar, cxq0 cxq0Var, PaymentsScreen paymentsScreen, zba0 zba0Var, tpr tprVar, com.yandex.go.payments.shared.a aVar, v32 v32Var, oo2 oo2Var, qc20 qc20Var, ffa0 ffa0Var, g8a0 g8a0Var, g9a0 g9a0Var, nfh nfhVar, tt2 tt2Var, lba0 lba0Var, pmn pmnVar, h3y h3yVar, pba0 pba0Var, jc4 jc4Var, com.yandex.go.loyalty.impl.common.data.c cVar, fvt fvtVar, kld0 kld0Var) {
        super(jca0.class);
        this.x = vba0Var;
        this.y = eVar;
        this.z = cxq0Var;
        this.A = paymentsScreen;
        this.B = zba0Var;
        this.C = tprVar;
        this.D = aVar;
        this.E = v32Var;
        this.F = oo2Var;
        this.G = qc20Var;
        this.H = ffa0Var;
        this.I = g8a0Var;
        this.J = g9a0Var;
        this.K = nfhVar;
        this.L = tt2Var;
        this.M = lba0Var;
        this.N = pmnVar;
        this.O = h3yVar;
        this.P = pba0Var;
        this.Q = jc4Var;
        this.R = cVar;
        this.S = fvtVar;
        this.T = kld0Var;
        this.U = new h270();
        this.V = new h270();
        this.W = new h270();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(k kVar, rsn rsnVar, ContinuationImpl continuationImpl) {
        PaymentMethodsListPresenter$handleNewState$1 paymentMethodsListPresenter$handleNewState$1;
        int i;
        Iterator it;
        kVar.getClass();
        if (continuationImpl instanceof PaymentMethodsListPresenter$handleNewState$1) {
            paymentMethodsListPresenter$handleNewState$1 = (PaymentMethodsListPresenter$handleNewState$1) continuationImpl;
            int i2 = paymentMethodsListPresenter$handleNewState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsListPresenter$handleNewState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsListPresenter$handleNewState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsListPresenter$handleNewState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = ((gca0) rsnVar.b).a.a.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) paymentMethodsListPresenter$handleNewState$1.L$3;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    g6a0 g6a0Var = (g6a0) it.next();
                    if (g6a0Var instanceof hm10) {
                        com.yandex.go.payments.paymentlist.details.d dVar = (com.yandex.go.payments.paymentlist.details.d) kVar.O.get();
                        String c = ((hm10) g6a0Var).c();
                        paymentMethodsListPresenter$handleNewState$1.L$0 = null;
                        paymentMethodsListPresenter$handleNewState$1.L$1 = null;
                        paymentMethodsListPresenter$handleNewState$1.L$2 = null;
                        paymentMethodsListPresenter$handleNewState$1.L$3 = it;
                        paymentMethodsListPresenter$handleNewState$1.L$4 = null;
                        paymentMethodsListPresenter$handleNewState$1.L$5 = null;
                        paymentMethodsListPresenter$handleNewState$1.label = 1;
                        if (dVar.d(c, paymentMethodsListPresenter$handleNewState$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11.a;
            }
        }
        paymentMethodsListPresenter$handleNewState$1 = new PaymentMethodsListPresenter$handleNewState$1(kVar, continuationImpl);
        Object obj2 = paymentMethodsListPresenter$handleNewState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsListPresenter$handleNewState$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    @Override // defpackage.hba0
    public final void Bc(evz evzVar) {
        String name = evzVar != null ? evzVar.getName() : null;
        if (name == null) {
            name = "";
        }
        String a = evzVar != null ? evzVar.a() : null;
        String str = a != null ? a : "";
        String openReason = this.x.a.getOpenReason();
        g9a0 g9a0Var = this.J;
        g9a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("loyalty_program", name);
        hashMap.put("loyalty_balance", str);
        g9a0Var.a.a("PaymentMethods.LoyaltyProgram.Tapped", hashMap, 1, tse0.r("source", hashMap, openReason));
        com.yandex.go.payments.paymentlist.navigation.e eVar = this.y;
        com.yandex.go.payments.paymentlist.navigation.f fVar = eVar.b;
        fVar.A((m950) fVar.U.get(), new swz(eVar.a.a.getOpenReason()), sy60.Q2);
    }

    @Override // defpackage.hba0
    public final void Hc(evz evzVar) {
        this.V.a(new yo90(3, this, evzVar));
    }

    public final void Lg(sba0 sba0Var) {
        Bg(sba0Var);
        this.E.d = this.x.a.getOpenReason();
        com.yandex.go.payments.paymentlist.domain.converter.i iVar = this.M.a;
        iVar.getClass();
        sba0Var.x(new gca0(m4a0.h, iVar.k(), "", true));
        this.B.g();
        tje.N(Jg(), null, null, new PaymentMethodsListPresenter$attachView$1(this, sba0Var, null), 3);
        tje.N(Jg(), null, null, new PaymentMethodsListPresenter$attachView$2(this, sba0Var, null), 3);
        tje.N(Jg(), null, null, new PaymentMethodsListPresenter$attachView$3(this, sba0Var, null), 3);
    }

    @Override // defpackage.hba0
    public final void M1(String str, String str2) {
        String openReason = this.x.a.getOpenReason();
        ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) ((lx4) this.G.a)).d("PaymentMethods.PromoBanner.Tapped");
        d.d("banner_id", str);
        d.d(Constants.DEEPLINK, str2);
        d.d("open_reason", openReason);
        d.m();
        ((a60) ((y50) this.y.b.d0.get())).c(str2, v770.B);
    }

    public final void Mg(lea0 lea0Var) {
        this.y.f(new ehs(lea0Var, this.x.a.getOpenReason()));
    }

    @Override // defpackage.hba0
    public final void N3(c111 c111Var) {
        ((g111) this.y.b.c0.get()).a(c111Var);
    }

    public final void Ng(z5a0 z5a0Var) {
        u0k u0kVar = z5a0Var.a;
        zz90 a = (u0kVar != null && ((u0kVar instanceof fl8) || (u0kVar instanceof bjm0))) ? this.x.c.a(((f731) u0kVar).getId()) : null;
        lea0 lea0Var = z5a0Var.a;
        if (!(lea0Var instanceof fl8) || a == null) {
            Pg(z5a0Var, a);
            return;
        }
        fl8 fl8Var = (fl8) lea0Var;
        ptv d = a.d();
        m6a0 d2 = this.B.d();
        if (!jl40.l(d2 != null ? d2.b : null, fl8Var.a) || d2.a != PaymentMethod$Type.CARD || d == null || !d.a()) {
            Pg(z5a0Var, a);
            return;
        }
        ((vha0) this.y.b.I.get()).a(d, a.a());
        qfo a2 = a.a();
        oo2 oo2Var = this.F;
        if (a2 == null) {
            oo2Var.getClass();
            return;
        }
        sha0 sha0Var = (sha0) oo2Var.a;
        ru.yandex.taxi.analytics.i d3 = ((ru.yandex.taxi.analytics.j) sha0Var.a).d("Summary.Payment.Card.Discount");
        d3.d("tag", a2.getC());
        d3.d("summary_state", ((a7t0) sha0Var.b).a().b);
        d3.i();
        d3.m();
    }

    public final void Og(a4m a4mVar) {
        String str;
        PaymentMethod$Type paymentMethod$Type;
        String code;
        zba0 zba0Var = this.B;
        m6a0 d = zba0Var.d();
        g9a0.d(this.J, xe91.h(this.A), (d == null || (paymentMethod$Type = d.a) == null || (code = paymentMethod$Type.getCode()) == null) ? "" : code, (d == null || (str = d.b) == null) ? "" : str, Boolean.valueOf(zba0Var.i()), Boolean.valueOf(zba0Var.i()));
        cxq0 cxq0Var = this.z;
        cxq0Var.getClass();
        this.H.a(new iba0(cxq0Var), a4mVar, new ak80(15, this));
    }

    public final void Pg(z5a0 z5a0Var, zz90 zz90Var) {
        qfo a;
        oo2 oo2Var = this.F;
        lea0 lea0Var = z5a0Var.a;
        PaymentsScreen paymentsScreen = this.x.a;
        oo2Var.getClass();
        Object obj = null;
        if (paymentsScreen != PaymentsScreen.MENU && paymentsScreen != PaymentsScreen.PLUS) {
            if (lea0Var instanceof fl8) {
                mp8 mp8Var = CardType.Companion;
                String str = ((fl8) lea0Var).d;
                mp8Var.getClass();
                g9a0.f((g9a0) oo2Var.w, xe91.h(paymentsScreen), PaymentMethod$Type.CARD.getCode(), mp8.a(str).getAnalyticsName(), (zz90Var == null || (a = zz90Var.a()) == null) ? null : a.getC(), 16);
            } else if (lea0Var instanceof yy51) {
                wrz wrzVar = (wrz) oo2Var.c;
                String openReason = paymentsScreen.getOpenReason();
                ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) wrzVar.a).d("PaymentMethod.YandexCard");
                d.d("open_reason", openReason);
                d.m();
            } else {
                if (!(lea0Var instanceof ivt) && !(lea0Var instanceof jo51) && !(lea0Var instanceof bjm0) && !(lea0Var instanceof u19) && !(lea0Var instanceof t19) && !(lea0Var instanceof p1c) && !(lea0Var instanceof wxc) && !(lea0Var instanceof jve) && !(lea0Var instanceof yhi) && !(lea0Var instanceof vbn) && !(lea0Var instanceof mcp) && !(lea0Var instanceof qgx) && !(lea0Var instanceof v7x) && !(lea0Var instanceof a000) && !(lea0Var instanceof um50) && !(lea0Var instanceof h8b0) && !(lea0Var instanceof cfm0) && !(lea0Var instanceof snr0) && !(lea0Var instanceof d111) && !(lea0Var instanceof h211) && !(lea0Var instanceof ep51)) {
                    w511.b();
                    return;
                }
                g9a0.f((g9a0) oo2Var.w, xe91.h(paymentsScreen), lea0Var.c().getCode(), null, null, 28);
            }
            drd drdVar = (drd) oo2Var.b;
            if (!(lea0Var instanceof h8b0) && !drdVar.d(lea0Var.c()) && drdVar.b.b()) {
                xxc g = drdVar.g();
                g9a0 g9a0Var = (g9a0) oo2Var.w;
                String str2 = g != null ? g.c : null;
                String str3 = str2 == null ? "" : str2;
                PaymentMethodsAnalytics$LoyaltyToggleAction paymentMethodsAnalytics$LoyaltyToggleAction = PaymentMethodsAnalytics$LoyaltyToggleAction.Off;
                String str4 = g != null ? g.b : null;
                g9a0Var.h(str3, paymentMethodsAnalytics$LoyaltyToggleAction, str4 == null ? "" : str4, PaymentMethodsAnalytics$ChangeType.Auto, paymentsScreen.getOpenReason());
            }
        }
        ffa0 ffa0Var = this.H;
        lea0 lea0Var2 = z5a0Var.a;
        cxq0 cxq0Var = this.z;
        cxq0Var.getClass();
        ffa0Var.c(lea0Var2, new iba0(cxq0Var), new t9a0(1, this));
        this.Z = true;
        lea0 lea0Var3 = z5a0Var.a;
        PaymentsScreen paymentsScreen2 = this.x.a;
        if (lea0Var3 instanceof wxc) {
            Iterator it = this.R.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((evz) next).getId(), ((wxc) lea0Var3).a)) {
                    obj = next;
                    break;
                }
            }
            evz evzVar = (evz) obj;
            if (evzVar == null) {
                return;
            }
            oo2 oo2Var2 = this.F;
            ((g9a0) oo2Var2.w).h(evzVar.getName(), ((drd) oo2Var2.b).b.b() ? PaymentMethodsAnalytics$LoyaltyToggleAction.On : PaymentMethodsAnalytics$LoyaltyToggleAction.Off, evzVar.a(), PaymentMethodsAnalytics$ChangeType.User, paymentsScreen2.getOpenReason());
        }
    }

    @Override // defpackage.hba0
    public final void Q2(c6a0 c6a0Var) {
        if (jl40.l(c6a0Var, t5a0.a)) {
            return;
        }
        boolean z = c6a0Var instanceof w5a0;
        c21 c21Var = sy60.Q2;
        com.yandex.go.payments.paymentlist.navigation.e eVar = this.y;
        if (z) {
            w5a0 w5a0Var = (w5a0) c6a0Var;
            lea0 b = w5a0Var.b();
            bw90 a = w5a0Var.a();
            com.yandex.go.payments.paymentlist.navigation.f fVar = eVar.b;
            if (eVar.a.b.e) {
                if (b instanceof fl8) {
                    fVar.A((m950) fVar.Q.get(), new zf8((fl8) b, a), new com.yandex.go.payments.paymentlist.navigation.c(fVar, eVar));
                    return;
                }
                if ((b instanceof u19) || (b instanceof t19) || (b instanceof p1c) || (b instanceof wxc) || (b instanceof jve) || (b instanceof yhi) || (b instanceof vbn) || (b instanceof mcp) || (b instanceof ivt) || (b instanceof v7x) || (b instanceof qgx) || (b instanceof a000) || (b instanceof um50) || (b instanceof h8b0) || (b instanceof cfm0) || (b instanceof bjm0) || (b instanceof snr0) || (b instanceof d111) || (b instanceof h211) || (b instanceof jo51) || (b instanceof ep51) || (b instanceof yy51)) {
                    return;
                }
                w511.b();
                return;
            }
            if (b instanceof fl8) {
                el8 el8Var = ((fl8) b).k;
                if (el8Var == null || el8Var.b()) {
                    eVar.d(b);
                    return;
                } else {
                    fVar.E((m950) fVar.T.get(), new cap(0), c21Var, hxx.a);
                    return;
                }
            }
            if (b instanceof bjm0) {
                eVar.d(b);
                return;
            }
            if ((b instanceof u19) || (b instanceof t19) || (b instanceof p1c) || (b instanceof wxc) || (b instanceof jve) || (b instanceof yhi) || (b instanceof vbn) || (b instanceof mcp) || (b instanceof ivt) || (b instanceof v7x) || (b instanceof qgx) || (b instanceof a000) || (b instanceof um50) || (b instanceof h8b0) || (b instanceof cfm0) || (b instanceof snr0) || (b instanceof d111) || (b instanceof h211) || (b instanceof jo51) || (b instanceof ep51) || (b instanceof yy51)) {
                return;
            }
            w511.b();
            return;
        }
        boolean z2 = c6a0Var instanceof r5a0;
        oo2 oo2Var = this.F;
        vba0 vba0Var = this.x;
        if (z2) {
            vi0 vi0Var = ((r5a0) c6a0Var).a;
            eVar.c(vi0Var);
            PaymentsScreen paymentsScreen = vba0Var.a;
            if (vi0Var instanceof na0) {
                g9a0.b((g9a0) oo2Var.w, xe91.h(paymentsScreen), PaymentMethod$Type.CARD.getCode());
                return;
            }
            oo2Var.getClass();
            if (vi0Var instanceof mj0) {
                if (paymentsScreen == PaymentsScreen.PLUS) {
                    return;
                }
                dfm0 dfm0Var = (dfm0) oo2Var.x;
                PaymentMethodsAnalytics$PaymentMethodsScreen i = xe91.i(paymentsScreen.getOpenReason());
                dfm0Var.d = i;
                g9a0.b(dfm0Var.b, i, PaymentMethod$Type.SBP_TOKEN.getCode());
                return;
            }
            if ((vi0Var instanceof mf0) || (vi0Var instanceof mk0) || (vi0Var instanceof bg0) || (vi0Var instanceof kd0) || (vi0Var instanceof df0) || (vi0Var instanceof of0) || (vi0Var instanceof nj0) || (vi0Var instanceof bk0) || (vi0Var instanceof nk0) || (vi0Var instanceof ogz0) || (vi0Var instanceof ck0)) {
                return;
            }
            w511.b();
            return;
        }
        if (c6a0Var instanceof z5a0) {
            Ng((z5a0) c6a0Var);
            return;
        }
        if (c6a0Var instanceof b6a0) {
            eVar.e(((b6a0) c6a0Var).a());
            return;
        }
        if (jl40.l(c6a0Var, v5a0.a)) {
            eVar.getClass();
            j000 j000Var = new j000(MultiTransportChooseStationCardAnalytics$OpenReasonV2.PaymentOptions);
            com.yandex.go.payments.paymentlist.navigation.f fVar2 = eVar.b;
            fVar2.A((m950) fVar2.L.get(), j000Var, c21Var);
            return;
        }
        int i2 = 1;
        if (jl40.l(c6a0Var, x5a0.a)) {
            com.yandex.go.payments.paymentlist.navigation.f fVar3 = eVar.b;
            fVar3.z((m950) fVar3.S.get(), new mm10(fVar3, i2));
            return;
        }
        if (jl40.l(c6a0Var, u5a0.a)) {
            ((d49) eVar.b.M.get()).b(xe91.f(eVar.a.a));
            PaymentsScreen paymentsScreen2 = vba0Var.a;
            g9a0 g9a0Var = (g9a0) oo2Var.w;
            PaymentMethodsAnalytics$PaymentMethodsScreen h = xe91.h(paymentsScreen2);
            g9a0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(MetaDataField.SCREEN_FIELD, h.getEventValue());
            g9a0Var.a.a("PaymentMethods.Plus.Subscribe", hashMap, 1, new HashMap());
            return;
        }
        if (!(c6a0Var instanceof s5a0)) {
            if (c6a0Var instanceof a6a0) {
                tsj0 a2 = ((a6a0) c6a0Var).a();
                l2z l2zVar = new l2z(10, this, c6a0Var);
                com.yandex.go.payments.paymentlist.navigation.f fVar4 = eVar.b;
                fVar4.A((m950) fVar4.n0.get(), new pja0(a2), new yba0(l2zVar));
                return;
            }
            if (!(c6a0Var instanceof y5a0)) {
                w511.b();
                return;
            }
            y5a0 y5a0Var = (y5a0) c6a0Var;
            PaymentMethod$Type c = y5a0Var.b().c();
            String id = y5a0Var.b().getId();
            if (id == null) {
                id = "";
            }
            xea0 xea0Var = new xea0(id, c);
            String a3 = y5a0Var.a();
            PaymentMethodsListPresenter$onNameEditAction$1 paymentMethodsListPresenter$onNameEditAction$1 = new PaymentMethodsListPresenter$onNameEditAction$1(this.B);
            com.yandex.go.payments.paymentlist.navigation.f fVar5 = eVar.b;
            fVar5.A((m950) fVar5.N.get(), new mca0(a3, xea0Var), new k75(3, paymentMethodsListPresenter$onNameEditAction$1));
            return;
        }
        lea0 a4 = ((s5a0) c6a0Var).a();
        if (a4 instanceof fl8) {
            eVar.f(new ahs((fl8) a4, vba0Var.a.getOpenReason(), vba0Var.b.d));
            return;
        }
        if (a4 instanceof bjm0) {
            eVar.f(new dhs((bjm0) a4, vba0Var.a.getOpenReason()));
            return;
        }
        if (a4 instanceof ep51) {
            eVar.f(new fhs((ep51) a4, vba0Var.a.getOpenReason()));
            return;
        }
        if (a4 instanceof a000) {
            eVar.f(new bhs((a000) a4, vba0Var.a.getOpenReason()));
            return;
        }
        if (a4 instanceof um50) {
            eVar.f(new chs((um50) a4, vba0Var.a.getOpenReason()));
            return;
        }
        if (a4 instanceof p1c) {
            Mg(a4);
            return;
        }
        if (a4 instanceof vbn) {
            Mg(a4);
            return;
        }
        if (a4 instanceof mcp) {
            Mg(a4);
            return;
        }
        if (!(a4 instanceof d111) && !(a4 instanceof wxc) && !(a4 instanceof u19) && !(a4 instanceof t19) && !(a4 instanceof jve) && !(a4 instanceof yhi) && !(a4 instanceof ivt) && !(a4 instanceof v7x) && !(a4 instanceof qgx) && !(a4 instanceof h8b0) && !(a4 instanceof cfm0) && !(a4 instanceof snr0) && !(a4 instanceof h211) && !(a4 instanceof jo51) && !(a4 instanceof yy51)) {
            w511.b();
            return;
        }
        jst.e.q("Unexpected payment method: " + a4.getClass());
    }

    @Override // defpackage.hba0
    public final void a7(wxc wxcVar, evz evzVar) {
        String name = evzVar.getName();
        jc4 jc4Var = this.Q;
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("loyalty_program", name);
        jc4Var.a.a("EditPaymentMethods.LoyaltyLogOut.Tapped", hashMap, 1, new HashMap());
        this.y.f(new zgs(wxcVar, evzVar, this.x.a.getOpenReason()));
    }

    @Override // defpackage.hba0
    public final void a8(String str) {
        this.W.a(new yo90(2, this, str));
    }

    @Override // defpackage.hba0
    public final void b9(String str) {
        ((a60) ((y50) this.y.b.d0.get())).c(str, v770.B);
    }

    @Override // defpackage.hba0
    public final void p6(String str) {
        tje.N(Jg(), null, null, new PaymentMethodsListPresenter$onBannerCloseAction$1(this, str, null), 3);
    }

    @Override // defpackage.r9a0
    public final void s5(bt51 bt51Var) {
        this.y.b(bt51Var);
    }
}
