package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import defpackage.g4a0;
import defpackage.i3a0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;

    public q(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1 paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PaymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1) {
            paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1 = (PaymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i3a0 i3a0Var = (i3a0) obj;
                    Object obj3 = i3a0Var.b.get(SelectedPaymentMethodPayload.KEY_METHOD_ID);
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    Object obj4 = i3a0Var.b.get(SelectedPaymentMethodPayload.KEY_METHOD_TYPE);
                    String str2 = obj4 instanceof String ? (String) obj4 : null;
                    g4a0 g4a0Var = (str == null || str2 == null) ? null : new g4a0(str, str2);
                    paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g4a0Var, paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1 = new PaymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentWidgetHolder$observePaymentMethodFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
