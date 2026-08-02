package com.yandex.go.overdraft.domain;

import defpackage.ez80;
import defpackage.jfa0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;

    public p(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1 overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1) {
            overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1 = (OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1) continuation;
            int i2 = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ez80 ez80Var = (ez80) obj;
                    boolean z = ez80Var.b.a;
                    jfa0 jfa0Var = ez80Var.a;
                    if (!z) {
                        jfa0Var = jfa0.a(jfa0Var, null, null, 3);
                    }
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.L$0 = null;
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.L$1 = null;
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.L$2 = null;
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.L$3 = null;
                    overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(jfa0Var, overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1 = new OverdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentOptionsInteractor$overdraftPaymentOptionsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
