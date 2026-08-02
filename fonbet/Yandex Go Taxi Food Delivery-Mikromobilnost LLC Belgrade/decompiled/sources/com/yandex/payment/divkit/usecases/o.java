package com.yandex.payment.divkit.usecases;

import defpackage.kq60;
import defpackage.mq60;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p b;
    public final /* synthetic */ kq60 c;

    public o(vpr vprVar, p pVar, kq60 kq60Var) {
        this.a = vprVar;
        this.b = pVar;
        this.c = kq60Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r7.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1 observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        int i2;
        if (continuation instanceof ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1) {
            observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1 = (ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1) continuation;
            int i3 = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$0 = null;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$1 = null;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$2 = null;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$5 = null;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$6 = null;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.I$0 = 0;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.I$1 = 0;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.label = 1;
                    Object a = p.a(this.b, (mq60) obj, this.c, observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        vprVar = vprVar2;
                        obj2 = a;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                i2 = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.I$0;
                vprVar = (vpr) observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$0 = null;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$1 = null;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$2 = null;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$3 = null;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$4 = null;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$5 = null;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$6 = null;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.I$0 = i2;
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1 = new ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$0 = null;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$1 = null;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$2 = null;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$3 = null;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$4 = null;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$5 = null;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.L$6 = null;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.I$0 = i2;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$$inlined$map$1$2$1.label = 2;
    }
}
