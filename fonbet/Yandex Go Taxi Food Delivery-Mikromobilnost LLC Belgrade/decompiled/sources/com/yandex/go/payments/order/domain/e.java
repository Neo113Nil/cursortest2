package com.yandex.go.payments.order.domain;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.domain.k;
import com.yandex.go.payments.experiments.g;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.aii;
import defpackage.ama;
import defpackage.azz;
import defpackage.cca0;
import defpackage.cda0;
import defpackage.dy90;
import defpackage.f9y0;
import defpackage.fl10;
import defpackage.h0a0;
import defpackage.h55;
import defpackage.hga0;
import defpackage.ht10;
import defpackage.ida0;
import defpackage.kov;
import defpackage.l90;
import defpackage.lov;
import defpackage.lv90;
import defpackage.lz70;
import defpackage.m950;
import defpackage.mo21;
import defpackage.mov;
import defpackage.msd0;
import defpackage.nov;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.qaa0;
import defpackage.raa0;
import defpackage.sc20;
import defpackage.t32;
import defpackage.tje;
import defpackage.tse;
import defpackage.u32;
import defpackage.uba0;
import defpackage.uh60;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.vez0;
import defpackage.vj4;
import defpackage.wma0;
import defpackage.xhq0;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zz7;
import defpackage.zzs;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class e extends h55 {
    public final tse D;
    public final com.yandex.go.taxi.order.repositories.c E;
    public final k F;
    public final i G;
    public final lov H;
    public final yvf0 I;
    public final a J;
    public final vj4 K;
    public final f9y0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final nov O;
    public final xhq0 P;
    public final com.yandex.go.payments.common.a Q;
    public final g R;
    public final com.yandex.go.payments.superapp.payment.b S;
    public final po21 T;
    public final raa0 U;
    public final hga0 V;
    public pzt0 W;
    public dy90 Z;

    public e(tse tseVar, com.yandex.go.taxi.order.repositories.c cVar, k kVar, i iVar, lov lovVar, yvf0 yvf0Var, a aVar, vj4 vj4Var, f9y0 f9y0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, nov novVar, xhq0 xhq0Var, com.yandex.go.payments.common.a aVar2, g gVar, com.yandex.go.payments.superapp.payment.b bVar, po21 po21Var, raa0 raa0Var, hga0 hga0Var) {
        super(null);
        this.D = tseVar;
        this.E = cVar;
        this.F = kVar;
        this.G = iVar;
        this.H = lovVar;
        this.I = yvf0Var;
        this.J = aVar;
        this.K = vj4Var;
        this.L = f9y0Var;
        this.M = yvf0Var2;
        this.N = yvf0Var3;
        this.O = novVar;
        this.P = xhq0Var;
        this.Q = aVar2;
        this.R = gVar;
        this.S = bVar;
        this.T = po21Var;
        this.U = raa0Var;
        this.V = hga0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(e eVar, o2y0 o2y0Var, lv90 lv90Var, ContinuationImpl continuationImpl) {
        OrderPaymentsListRouter$launchLpmPaymentMethods$1 orderPaymentsListRouter$launchLpmPaymentMethods$1;
        int i;
        m950 a;
        kov a2;
        lv90 lv90Var2;
        e eVar2;
        PaymentsScreen paymentsScreen;
        String str;
        o2y0 o2y0Var2 = o2y0Var;
        eVar.getClass();
        if (continuationImpl instanceof OrderPaymentsListRouter$launchLpmPaymentMethods$1) {
            orderPaymentsListRouter$launchLpmPaymentMethods$1 = (OrderPaymentsListRouter$launchLpmPaymentMethods$1) continuationImpl;
            int i2 = orderPaymentsListRouter$launchLpmPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentsListRouter$launchLpmPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentsListRouter$launchLpmPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentsListRouter$launchLpmPaymentMethods$1.label;
                int i3 = 23;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.payments.superapp.payment.b bVar = eVar.S;
                    u32.a.getClass();
                    dy90 a3 = bVar.a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, t32.b, new l90(), new uba0(eVar.J, (uk10) null, new fl10(eVar), eVar.L.a(o2y0Var2.d()), new ht10(o2y0Var2, eVar.Q, false, i3), 34));
                    eVar.Z = a3;
                    a = a3.a.a();
                    a2 = eVar.H.a(new uh60(23, o2y0Var2), new b(eVar, o2y0Var2));
                    PaymentsScreen paymentsScreen2 = PaymentsScreen.ORDER;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$0 = o2y0Var2;
                    lv90Var2 = lv90Var;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$1 = lv90Var2;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$2 = null;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$3 = null;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$4 = a2;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$5 = eVar;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$6 = a;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$7 = paymentsScreen2;
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.L$8 = "no_feature";
                    orderPaymentsListRouter$launchLpmPaymentMethods$1.label = 1;
                    Object R = eVar.R(o2y0Var2, orderPaymentsListRouter$launchLpmPaymentMethods$1);
                    if (R == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar2 = eVar;
                    paymentsScreen = paymentsScreen2;
                    obj = R;
                    str = "no_feature";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) orderPaymentsListRouter$launchLpmPaymentMethods$1.L$8;
                    PaymentsScreen paymentsScreen3 = (PaymentsScreen) orderPaymentsListRouter$launchLpmPaymentMethods$1.L$7;
                    a = (m950) orderPaymentsListRouter$launchLpmPaymentMethods$1.L$6;
                    eVar2 = (e) orderPaymentsListRouter$launchLpmPaymentMethods$1.L$5;
                    a2 = (kov) orderPaymentsListRouter$launchLpmPaymentMethods$1.L$4;
                    lv90Var2 = (lv90) orderPaymentsListRouter$launchLpmPaymentMethods$1.L$1;
                    o2y0 o2y0Var3 = (o2y0) orderPaymentsListRouter$launchLpmPaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                    str = str2;
                    o2y0Var2 = o2y0Var3;
                    paymentsScreen = paymentsScreen3;
                }
                h0a0 h0a0Var = (h0a0) obj;
                if (lv90Var2 == null) {
                    lv90Var2 = o2y0Var2.b().q();
                }
                eVar2.A(a, new azz(paymentsScreen, str, h0a0Var, vez0.c0(lv90Var2, null), false, false, null, true, false, null, null, null, new lz70(2, a2), Collections.singleton(PaymentMethod$Type.CASH), new sc20(i3, eVar), null, null, null, 466048), new ama(5, eVar));
                return zy11.a;
            }
        }
        orderPaymentsListRouter$launchLpmPaymentMethods$1 = new OrderPaymentsListRouter$launchLpmPaymentMethods$1(eVar, continuationImpl);
        Object obj2 = orderPaymentsListRouter$launchLpmPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentsListRouter$launchLpmPaymentMethods$1.label;
        int i32 = 23;
        if (i != 0) {
        }
        h0a0 h0a0Var2 = (h0a0) obj2;
        if (lv90Var2 == null) {
        }
        eVar2.A(a, new azz(paymentsScreen, str, h0a0Var2, vez0.c0(lv90Var2, null), false, false, null, true, false, null, null, null, new lz70(2, a2), Collections.singleton(PaymentMethod$Type.CASH), new sc20(i32, eVar), null, null, null, 466048), new ama(5, eVar));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(e eVar, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        OrderPaymentsListRouter$launchPmPaymentMethods$1 orderPaymentsListRouter$launchPmPaymentMethods$1;
        int i;
        m950 m950Var;
        e eVar2;
        eVar.getClass();
        if (continuationImpl instanceof OrderPaymentsListRouter$launchPmPaymentMethods$1) {
            orderPaymentsListRouter$launchPmPaymentMethods$1 = (OrderPaymentsListRouter$launchPmPaymentMethods$1) continuationImpl;
            int i2 = orderPaymentsListRouter$launchPmPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentsListRouter$launchPmPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentsListRouter$launchPmPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentsListRouter$launchPmPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m950 m950Var2 = (m950) eVar.I.get();
                    orderPaymentsListRouter$launchPmPaymentMethods$1.L$0 = null;
                    orderPaymentsListRouter$launchPmPaymentMethods$1.L$1 = eVar;
                    orderPaymentsListRouter$launchPmPaymentMethods$1.L$2 = m950Var2;
                    orderPaymentsListRouter$launchPmPaymentMethods$1.label = 1;
                    Object S = eVar.S(o2y0Var, orderPaymentsListRouter$launchPmPaymentMethods$1);
                    if (S == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = S;
                    m950Var = m950Var2;
                    eVar2 = eVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m950Var = (m950) orderPaymentsListRouter$launchPmPaymentMethods$1.L$2;
                    eVar2 = (e) orderPaymentsListRouter$launchPmPaymentMethods$1.L$1;
                    kotlin.b.b(obj);
                }
                eVar2.A(m950Var, obj, new aii(eVar, 2));
                return zy11.a;
            }
        }
        orderPaymentsListRouter$launchPmPaymentMethods$1 = new OrderPaymentsListRouter$launchPmPaymentMethods$1(eVar, continuationImpl);
        Object obj2 = orderPaymentsListRouter$launchPmPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentsListRouter$launchPmPaymentMethods$1.label;
        if (i != 0) {
        }
        eVar2.A(m950Var, obj2, new aii(eVar, 2));
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dy90 dy90Var = this.Z;
        if (dy90Var != null) {
            dy90Var.dispose();
        }
        this.Z = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        o2y0 o2y0Var = (o2y0) obj;
        lv90 lv90Var = (lv90) this.V.a.getAndSet(null);
        tje.N(o(), null, null, new OrderPaymentsListRouter$onLaunch$1(this, o2y0Var, lv90Var, null), 3);
        this.W = tje.N(this.D, null, null, new OrderPaymentsListRouter$onLaunch$2(this, o2y0Var, null), 3);
        if (lv90Var == null) {
            lv90Var = o2y0Var.b().q();
        }
        this.P.a.l(lv90Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        OrderPaymentsListRouter$createPaymentGeoContext$1 orderPaymentsListRouter$createPaymentGeoContext$1;
        int i;
        if (continuationImpl instanceof OrderPaymentsListRouter$createPaymentGeoContext$1) {
            orderPaymentsListRouter$createPaymentGeoContext$1 = (OrderPaymentsListRouter$createPaymentGeoContext$1) continuationImpl;
            int i2 = orderPaymentsListRouter$createPaymentGeoContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentsListRouter$createPaymentGeoContext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentsListRouter$createPaymentGeoContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentsListRouter$createPaymentGeoContext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TaxiOrder b = o2y0Var.b();
                    zzs v = b.v();
                    if (v != null) {
                        return new h0a0(v, b.w());
                    }
                    qaa0 a = this.U.a();
                    if (a != null) {
                        return new h0a0(a.b, a.c);
                    }
                    orderPaymentsListRouter$createPaymentGeoContext$1.L$0 = null;
                    orderPaymentsListRouter$createPaymentGeoContext$1.L$1 = null;
                    orderPaymentsListRouter$createPaymentGeoContext$1.L$2 = null;
                    orderPaymentsListRouter$createPaymentGeoContext$1.L$3 = null;
                    orderPaymentsListRouter$createPaymentGeoContext$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.T).f(orderPaymentsListRouter$createPaymentGeoContext$1);
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
                return new h0a0(((mo21) obj).a(), null);
            }
        }
        orderPaymentsListRouter$createPaymentGeoContext$1 = new OrderPaymentsListRouter$createPaymentGeoContext$1(this, continuationImpl);
        Object obj2 = orderPaymentsListRouter$createPaymentGeoContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentsListRouter$createPaymentGeoContext$1.label;
        if (i != 0) {
        }
        return new h0a0(((mo21) obj2).a(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        OrderPaymentsListRouter$createPaymentMethodsPayload$1 orderPaymentsListRouter$createPaymentMethodsPayload$1;
        int i;
        String str;
        o2y0 o2y0Var2;
        if (continuationImpl instanceof OrderPaymentsListRouter$createPaymentMethodsPayload$1) {
            orderPaymentsListRouter$createPaymentMethodsPayload$1 = (OrderPaymentsListRouter$createPaymentMethodsPayload$1) continuationImpl;
            int i2 = orderPaymentsListRouter$createPaymentMethodsPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentsListRouter$createPaymentMethodsPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentsListRouter$createPaymentMethodsPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentsListRouter$createPaymentMethodsPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String d = o2y0Var.d();
                    PaymentsScreen paymentsScreen = PaymentsScreen.ORDER;
                    orderPaymentsListRouter$createPaymentMethodsPayload$1.L$0 = o2y0Var;
                    orderPaymentsListRouter$createPaymentMethodsPayload$1.L$1 = d;
                    orderPaymentsListRouter$createPaymentMethodsPayload$1.label = 1;
                    Object a = ((com.yandex.go.payments.badges.a) this.K).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, d, paymentsScreen, orderPaymentsListRouter$createPaymentMethodsPayload$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = d;
                    obj = a;
                    o2y0Var2 = o2y0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) orderPaymentsListRouter$createPaymentMethodsPayload$1.L$1;
                    o2y0Var2 = (o2y0) orderPaymentsListRouter$createPaymentMethodsPayload$1.L$0;
                    kotlin.b.b(obj);
                }
                vba0 vba0Var = new vba0(PaymentsScreen.ORDER, new cca0(null, 21, false, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj, null, 72);
                kov a2 = this.H.a(new uh60(23, o2y0Var2), new b(this, o2y0Var2));
                com.yandex.go.payments.paymentlist.domain.subtitles.replacement.b a3 = this.L.a(str);
                uba0 uba0Var = new uba0(this.J, (uk10) null, new fl10(this), a3, new ht10(o2y0Var2, this.Q, false, 23), 34);
                m0 a4 = this.F.a(o2y0Var2.b());
                zz7 zz7Var = this.O.a;
                return new ida0(vba0Var, a2, a4, new mov(o2y0Var2, (cda0) zz7Var.a.get(), (msd0) zz7Var.b.get()), uba0Var);
            }
        }
        orderPaymentsListRouter$createPaymentMethodsPayload$1 = new OrderPaymentsListRouter$createPaymentMethodsPayload$1(this, continuationImpl);
        Object obj2 = orderPaymentsListRouter$createPaymentMethodsPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentsListRouter$createPaymentMethodsPayload$1.label;
        if (i != 0) {
        }
        vba0 vba0Var2 = new vba0(PaymentsScreen.ORDER, new cca0(null, 21, false, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj2, null, 72);
        kov a22 = this.H.a(new uh60(23, o2y0Var2), new b(this, o2y0Var2));
        com.yandex.go.payments.paymentlist.domain.subtitles.replacement.b a32 = this.L.a(str);
        uba0 uba0Var2 = new uba0(this.J, (uk10) null, new fl10(this), a32, new ht10(o2y0Var2, this.Q, false, 23), 34);
        m0 a42 = this.F.a(o2y0Var2.b());
        zz7 zz7Var2 = this.O.a;
        return new ida0(vba0Var2, a22, a42, new mov(o2y0Var2, (cda0) zz7Var2.a.get(), (msd0) zz7Var2.b.get()), uba0Var2);
    }
}
