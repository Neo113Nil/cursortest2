package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;

    public f(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CheckoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1 checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof CheckoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1) {
            checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1 = (CheckoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1) continuation;
            int i2 = checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.L$0 = null;
                    checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.L$1 = null;
                    checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.L$2 = null;
                    checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(eVar, checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1 = new CheckoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutDataInteractor$attach$3$invokeSuspend$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
