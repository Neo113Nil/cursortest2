package com.yandex.go.payments.delivery.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.delivery.domain.DeliveryPaymentsListInteractor$paymentOptionsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.payments.delivery.domain.d;
import defpackage.cca0;
import defpackage.cz51;
import defpackage.ea91;
import defpackage.ere0;
import defpackage.f9y0;
import defpackage.h55;
import defpackage.ida0;
import defpackage.ja4;
import defpackage.m950;
import defpackage.mii;
import defpackage.n65;
import defpackage.nii;
import defpackage.nsd0;
import defpackage.ny61;
import defpackage.oii;
import defpackage.sui;
import defpackage.tje;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.vj4;
import defpackage.w511;
import defpackage.w9a0;
import defpackage.wma0;
import defpackage.yvf0;
import defpackage.zhi;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class a extends h55 implements m950 {
    public final yvf0 D;
    public final ere0 E;
    public final d F;
    public final mii G;
    public final vj4 H;
    public final f9y0 I;

    public a(yvf0 yvf0Var, ere0 ere0Var, d dVar, mii miiVar, vj4 vj4Var, f9y0 f9y0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = ere0Var;
        this.F = dVar;
        this.G = miiVar;
        this.H = vj4Var;
        this.I = f9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, zhi zhiVar, ContinuationImpl continuationImpl) {
        DeliveryPaymentListRouterImpl$createPaymentMethodsPayload$1 deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1;
        int i;
        mii miiVar;
        mii miiVar2;
        zhi zhiVar2 = zhiVar;
        aVar.getClass();
        if (continuationImpl instanceof DeliveryPaymentListRouterImpl$createPaymentMethodsPayload$1) {
            deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1 = (DeliveryPaymentListRouterImpl$createPaymentMethodsPayload$1) continuationImpl;
            int i2 = deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.label;
                if (i != 0) {
                    b.b(obj);
                    ea91 ea91Var = zhiVar2.d;
                    if (ea91Var.equals(oii.b)) {
                        miiVar = new sui();
                    } else {
                        if (!ea91Var.equals(nii.b)) {
                            w511.b();
                            return null;
                        }
                        miiVar = aVar.G;
                    }
                    vj4 vj4Var = aVar.H;
                    PaymentsScreen paymentsScreen = zhiVar2.a;
                    deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.L$0 = zhiVar2;
                    deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.L$1 = miiVar;
                    deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.label = 1;
                    Object a = ((com.yandex.go.payments.badges.a) vj4Var).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, null, paymentsScreen, deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    miiVar2 = miiVar;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mii miiVar3 = (mii) deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.L$1;
                    zhi zhiVar3 = (zhi) deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.L$0;
                    b.b(obj);
                    miiVar2 = miiVar3;
                    zhiVar2 = zhiVar3;
                }
                vba0 vba0Var = new vba0(zhiVar2.a, new cca0(null, 21, zhiVar2.c, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj, null, 72);
                ere0 ere0Var = aVar.E;
                d dVar = aVar.F;
                return new ida0(vba0Var, ere0Var, e.X(dVar.a.b(), new DeliveryPaymentsListInteractor$paymentOptionsFlow$$inlined$flatMapLatest$1(null, dVar, new ja4(zhiVar2.b), (n65) dVar.d.a.get(), miiVar2)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, aVar.I.a(null), (w9a0) null, 55));
            }
        }
        deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1 = new DeliveryPaymentListRouterImpl$createPaymentMethodsPayload$1(aVar, continuationImpl);
        Object obj2 = deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPaymentListRouterImpl$createPaymentMethodsPayload$1.label;
        if (i != 0) {
        }
        vba0 vba0Var2 = new vba0(zhiVar2.a, new cca0(null, 21, zhiVar2.c, true), new wma0(EmptyList.a), null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, (uj4) obj2, null, 72);
        ere0 ere0Var2 = aVar.E;
        d dVar2 = aVar.F;
        return new ida0(vba0Var2, ere0Var2, e.X(dVar2.a.b(), new DeliveryPaymentsListInteractor$paymentOptionsFlow$$inlined$flatMapLatest$1(null, dVar2, new ja4(zhiVar2.b), (n65) dVar2.d.a.get(), miiVar2)), null, new uba0((cz51) null, (uk10) null, (nsd0) null, aVar.I.a(null), (w9a0) null, 55));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new DeliveryPaymentListRouterImpl$onLaunch$1(this, (zhi) obj, null), 3);
    }
}
