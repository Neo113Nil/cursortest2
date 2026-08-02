package com.yandex.go.payments.composite.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.composite.domain.PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.aii;
import defpackage.aq80;
import defpackage.cca0;
import defpackage.cz51;
import defpackage.drd;
import defpackage.f9y0;
import defpackage.g9a0;
import defpackage.h55;
import defpackage.ida0;
import defpackage.m950;
import defpackage.naa0;
import defpackage.nsd0;
import defpackage.ny61;
import defpackage.oaa0;
import defpackage.paa0;
import defpackage.t91;
import defpackage.tje;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.vj4;
import defpackage.w9a0;
import defpackage.wma0;
import defpackage.ycq0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final oaa0 D;
    public final paa0 E;
    public final yvf0 F;
    public final vj4 G;
    public final f9y0 H;

    public a(oaa0 oaa0Var, paa0 paa0Var, yvf0 yvf0Var, vj4 vj4Var, f9y0 f9y0Var) {
        super(null);
        this.D = oaa0Var;
        this.E = paa0Var;
        this.F = yvf0Var;
        this.G = vj4Var;
        this.H = f9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, ContinuationImpl continuationImpl) {
        PaymentMethodsForCompositeRouterImpl$openPaymentsList$1 paymentMethodsForCompositeRouterImpl$openPaymentsList$1;
        int i;
        m950 m950Var;
        a aVar2;
        aVar.getClass();
        if (continuationImpl instanceof PaymentMethodsForCompositeRouterImpl$openPaymentsList$1) {
            paymentMethodsForCompositeRouterImpl$openPaymentsList$1 = (PaymentMethodsForCompositeRouterImpl$openPaymentsList$1) continuationImpl;
            int i2 = paymentMethodsForCompositeRouterImpl$openPaymentsList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsForCompositeRouterImpl$openPaymentsList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsForCompositeRouterImpl$openPaymentsList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsForCompositeRouterImpl$openPaymentsList$1.label;
                if (i != 0) {
                    b.b(obj);
                    m950 m950Var2 = (m950) aVar.F.get();
                    paymentMethodsForCompositeRouterImpl$openPaymentsList$1.L$0 = aVar;
                    paymentMethodsForCompositeRouterImpl$openPaymentsList$1.L$1 = m950Var2;
                    paymentMethodsForCompositeRouterImpl$openPaymentsList$1.label = 1;
                    Object Q = aVar.Q(paymentMethodsForCompositeRouterImpl$openPaymentsList$1);
                    if (Q == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m950Var = m950Var2;
                    obj = Q;
                    aVar2 = aVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m950Var = (m950) paymentMethodsForCompositeRouterImpl$openPaymentsList$1.L$1;
                    aVar2 = (a) paymentMethodsForCompositeRouterImpl$openPaymentsList$1.L$0;
                    b.b(obj);
                }
                aVar2.A(m950Var, obj, new aii(aVar, 4));
                return zy11.a;
            }
        }
        paymentMethodsForCompositeRouterImpl$openPaymentsList$1 = new PaymentMethodsForCompositeRouterImpl$openPaymentsList$1(aVar, continuationImpl);
        Object obj2 = paymentMethodsForCompositeRouterImpl$openPaymentsList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsForCompositeRouterImpl$openPaymentsList$1.label;
        if (i != 0) {
        }
        aVar2.A(m950Var, obj2, new aii(aVar, 4));
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PaymentMethodsForCompositeRouterImpl$onLaunch$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(ContinuationImpl continuationImpl) {
        PaymentMethodsForCompositeRouterImpl$createPayload$1 paymentMethodsForCompositeRouterImpl$createPayload$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsForCompositeRouterImpl$createPayload$1) {
            paymentMethodsForCompositeRouterImpl$createPayload$1 = (PaymentMethodsForCompositeRouterImpl$createPayload$1) continuationImpl;
            int i2 = paymentMethodsForCompositeRouterImpl$createPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsForCompositeRouterImpl$createPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsForCompositeRouterImpl$createPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsForCompositeRouterImpl$createPayload$1.label;
                if (i != 0) {
                    b.b(obj);
                    PaymentsScreen paymentsScreen = PaymentsScreen.PLUS;
                    paymentMethodsForCompositeRouterImpl$createPayload$1.label = 1;
                    obj = ((com.yandex.go.payments.badges.a) this.G).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, null, paymentsScreen, paymentMethodsForCompositeRouterImpl$createPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                vba0 vba0Var = new vba0(PaymentsScreen.PLUS, new cca0(null, 21, false, false), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj, null, 72);
                aq80 aq80Var = new aq80(this);
                t91 t91Var = this.D.a;
                naa0 naa0Var = new naa0((drd) t91Var.a.get(), (g9a0) t91Var.b.get(), (ycq0) t91Var.c.get(), (e) t91Var.d.get(), (i) t91Var.e.get(), aq80Var);
                paa0 paa0Var = this.E;
                return new ida0(vba0Var, naa0Var, kotlinx.coroutines.flow.e.X(paa0Var.d.b(), new PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1(null, paa0Var)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, this.H.a(null), (w9a0) null, 55));
            }
        }
        paymentMethodsForCompositeRouterImpl$createPayload$1 = new PaymentMethodsForCompositeRouterImpl$createPayload$1(this, continuationImpl);
        Object obj2 = paymentMethodsForCompositeRouterImpl$createPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsForCompositeRouterImpl$createPayload$1.label;
        if (i != 0) {
        }
        vba0 vba0Var2 = new vba0(PaymentsScreen.PLUS, new cca0(null, 21, false, false), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj2, null, 72);
        aq80 aq80Var2 = new aq80(this);
        t91 t91Var2 = this.D.a;
        naa0 naa0Var2 = new naa0((drd) t91Var2.a.get(), (g9a0) t91Var2.b.get(), (ycq0) t91Var2.c.get(), (e) t91Var2.d.get(), (i) t91Var2.e.get(), aq80Var2);
        paa0 paa0Var2 = this.E;
        return new ida0(vba0Var2, naa0Var2, kotlinx.coroutines.flow.e.X(paa0Var2.d.b(), new PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1(null, paa0Var2)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, this.H.a(null), (w9a0) null, 55));
    }
}
