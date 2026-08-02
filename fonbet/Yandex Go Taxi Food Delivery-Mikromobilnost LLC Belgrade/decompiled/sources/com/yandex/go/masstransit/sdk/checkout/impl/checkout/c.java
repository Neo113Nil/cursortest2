package com.yandex.go.masstransit.sdk.checkout.impl.checkout;

import defpackage.ha2;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ ha2 a;

    public c(ha2 ha2Var) {
        this.a = ha2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CheckoutUiStateInteractor$special$$inlined$filterIsInstance$1$1 checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof CheckoutUiStateInteractor$special$$inlined$filterIsInstance$1$1) {
            checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1 = (CheckoutUiStateInteractor$special$$inlined$filterIsInstance$1$1) continuation;
            int i2 = checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.L$0 = null;
                    checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.L$1 = null;
                    checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.L$2 = null;
                    checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(bVar, checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1 = new CheckoutUiStateInteractor$special$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUiStateInteractor$special$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
