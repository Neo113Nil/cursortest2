package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wka0;
import defpackage.yka0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;

    public i(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CheckoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1 checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1;
        int i;
        if (continuation instanceof CheckoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1) {
            checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1 = (CheckoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
            int i2 = checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!(((yka0) obj) instanceof wka0)) {
                        checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.L$0 = null;
                        checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.L$1 = null;
                        checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.L$2 = null;
                        checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.L$3 = null;
                        checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.label = 1;
                        if (this.a.emit(obj, checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1 = new CheckoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
        Object obj22 = checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutDataInteractor$reloadPaymentWidget$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
