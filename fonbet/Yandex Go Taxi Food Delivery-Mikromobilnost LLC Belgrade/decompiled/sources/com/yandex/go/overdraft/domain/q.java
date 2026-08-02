package com.yandex.go.overdraft.domain;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class q implements tpr {
    public final /* synthetic */ mth a;

    public q(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1 overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1) {
            overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1 = (OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1) continuation;
            int i2 = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar);
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.L$0 = null;
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.L$1 = null;
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.L$2 = null;
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1 = new OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
