package com.yandex.go.flex.common.router.payment.method.morphlex;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.delayed.ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.cca0;
import defpackage.cz51;
import defpackage.f33;
import defpackage.f9y0;
import defpackage.ffa0;
import defpackage.ida0;
import defpackage.kpi0;
import defpackage.m830;
import defpackage.ndq0;
import defpackage.nsd0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tje;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.vj4;
import defpackage.w9a0;
import defpackage.wiq0;
import defpackage.wma0;
import defpackage.yvf0;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public final class a extends ndq0 {
    public final f33 D;
    public final ffa0 E;
    public final com.yandex.go.payments.delayed.a F;
    public final kpi0 G;
    public final wiq0 H;
    public final yvf0 I;
    public final vj4 J;
    public final f9y0 K;

    public a(f33 f33Var, ffa0 ffa0Var, com.yandex.go.payments.delayed.a aVar, kpi0 kpi0Var, wiq0 wiq0Var, yvf0 yvf0Var, vj4 vj4Var, f9y0 f9y0Var) {
        this.D = f33Var;
        this.E = ffa0Var;
        this.F = aVar;
        this.G = kpi0Var;
        this.H = wiq0Var;
        this.I = yvf0Var;
        this.J = vj4Var;
        this.K = f9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, String str, ContinuationImpl continuationImpl) {
        MorphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1 morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1;
        int i;
        String str2 = str;
        aVar.getClass();
        if (continuationImpl instanceof MorphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1) {
            morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1 = (MorphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1) continuationImpl;
            int i2 = morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label;
                if (i != 0) {
                    b.b(obj);
                    vj4 vj4Var = aVar.J;
                    PaymentsScreen paymentsScreen = PaymentsScreen.INTERCITY_DASHBOARD;
                    morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.L$0 = str2;
                    morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label = 1;
                    obj = ((com.yandex.go.payments.badges.a) vj4Var).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, str2, paymentsScreen, morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.L$0;
                    b.b(obj);
                }
                vba0 vba0Var = new vba0(PaymentsScreen.INTERCITY_DASHBOARD, new cca0(null, 21, true, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj, null, 72);
                ffa0 ffa0Var = aVar.E;
                com.yandex.go.payments.delayed.a aVar2 = aVar.F;
                return new ida0(vba0Var, ffa0Var, e.X(aVar2.c.b(), new ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$$inlined$flatMapLatest$1(null, aVar2, aVar.D)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, aVar.K.a(str2), (w9a0) null, 55));
            }
        }
        morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1 = new MorphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1(aVar, continuationImpl);
        Object obj2 = morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexSelectPaymentMethodRouterImpl$createPaymentsListPayload$1.label;
        if (i != 0) {
        }
        vba0 vba0Var2 = new vba0(PaymentsScreen.INTERCITY_DASHBOARD, new cca0(null, 21, true, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj2, null, 72);
        ffa0 ffa0Var2 = aVar.E;
        com.yandex.go.payments.delayed.a aVar22 = aVar.F;
        return new ida0(vba0Var2, ffa0Var2, e.X(aVar22.c.b(), new ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$$inlined$flatMapLatest$1(null, aVar22, aVar.D)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, aVar.K.a(str2), (w9a0) null, 55));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.E.b();
        kpi0 kpi0Var = this.G;
        m830 m830Var = new m830(kpi0Var.a(), kpi0Var.c.a.e());
        pex0 m = ((k) this.H).m();
        tje.N(o(), null, null, new MorphlexSelectPaymentMethodRouterImpl$onLaunch$1(this, m != null ? m.b : null, m830Var, null), 3);
    }
}
