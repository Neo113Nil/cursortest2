package com.yandex.go.intercity.flex.dashboard.router.payment.method.intercity;

import com.yandex.go.intercity.flex.api.dashboard.analytics.IntercityDashboardFlexAnalytics$PaymentOpenReason;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.delayed.ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.cca0;
import defpackage.cz51;
import defpackage.dpw;
import defpackage.epw;
import defpackage.f2g;
import defpackage.f33;
import defpackage.f9y0;
import defpackage.ffa0;
import defpackage.h2t;
import defpackage.ida0;
import defpackage.idw;
import defpackage.jdw;
import defpackage.kdw;
import defpackage.kpi0;
import defpackage.nsd0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tje;
import defpackage.u8w;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.vj4;
import defpackage.w511;
import defpackage.w9a0;
import defpackage.wiq0;
import defpackage.wma0;
import defpackage.x4e;
import java.util.HashMap;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public final class a extends dpw {
    public final f33 D;
    public final ffa0 E;
    public final com.yandex.go.payments.delayed.a F;
    public final kpi0 G;
    public final wiq0 H;
    public final idw I;
    public final f2g J;
    public final vj4 K;
    public final f9y0 L;

    public a(f33 f33Var, ffa0 ffa0Var, com.yandex.go.payments.delayed.a aVar, kpi0 kpi0Var, wiq0 wiq0Var, idw idwVar, f2g f2gVar, vj4 vj4Var, f9y0 f9y0Var) {
        this.D = f33Var;
        this.E = ffa0Var;
        this.F = aVar;
        this.G = kpi0Var;
        this.H = wiq0Var;
        this.I = idwVar;
        this.J = f2gVar;
        this.K = vj4Var;
        this.L = f9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, String str, ContinuationImpl continuationImpl) {
        IntercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1 intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1;
        int i;
        String str2 = str;
        aVar.getClass();
        if (continuationImpl instanceof IntercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1) {
            intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1 = (IntercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1) continuationImpl;
            int i2 = intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label;
                if (i != 0) {
                    b.b(obj);
                    vj4 vj4Var = aVar.K;
                    PaymentsScreen paymentsScreen = PaymentsScreen.INTERCITY_DASHBOARD;
                    intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.L$0 = str2;
                    intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label = 1;
                    obj = ((com.yandex.go.payments.badges.a) vj4Var).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, str2, paymentsScreen, intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.L$0;
                    b.b(obj);
                }
                vba0 vba0Var = new vba0(PaymentsScreen.INTERCITY_DASHBOARD, new cca0(null, 21, true, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj, null, 72);
                ffa0 ffa0Var = aVar.E;
                com.yandex.go.payments.delayed.a aVar2 = aVar.F;
                return new ida0(vba0Var, ffa0Var, e.X(aVar2.c.b(), new ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$$inlined$flatMapLatest$1(null, aVar2, aVar.D)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, aVar.L.a(str2), (w9a0) null, 55));
            }
        }
        intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1 = new IntercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1(aVar, continuationImpl);
        Object obj2 = intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercitySelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label;
        if (i != 0) {
        }
        vba0 vba0Var2 = new vba0(PaymentsScreen.INTERCITY_DASHBOARD, new cca0(null, 21, true, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj2, null, 72);
        ffa0 ffa0Var2 = aVar.E;
        com.yandex.go.payments.delayed.a aVar22 = aVar.F;
        return new ida0(vba0Var2, ffa0Var2, e.X(aVar22.c.b(), new ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$$inlined$flatMapLatest$1(null, aVar22, aVar.D)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, aVar.L.a(str2), (w9a0) null, 55));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        String str;
        epw epwVar = (epw) obj;
        pex0 m = ((k) this.H).m();
        String str2 = m != null ? m.b : null;
        IntercityDashboardFlexAnalytics$PaymentOpenReason intercityDashboardFlexAnalytics$PaymentOpenReason = epwVar.a;
        h2t h2tVar = ((kdw) this.I).a;
        int i = jdw.a[intercityDashboardFlexAnalytics$PaymentOpenReason.ordinal()];
        if (i == 1) {
            str = "user_tap";
        } else if (i == 2) {
            str = "flex_action";
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            str = "unavailable_method";
        }
        u8w u8wVar = (u8w) h2tVar.a;
        HashMap p = x4e.p(CRLReasonCodeExtension.REASON, str);
        if (str2 != null) {
            p.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        }
        u8wVar.a.a("Intercity.Checkout.PaymentMenu.Shown", p, 1, new HashMap());
        tje.N(o(), null, null, new IntercitySelectPaymentMethodRouterImpl$onLaunch$1(this, str2, null), 3);
    }
}
