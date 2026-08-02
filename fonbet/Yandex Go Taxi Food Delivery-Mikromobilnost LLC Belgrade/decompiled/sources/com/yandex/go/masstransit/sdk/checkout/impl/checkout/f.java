package com.yandex.go.masstransit.sdk.checkout.impl.checkout;

import defpackage.ny61;
import defpackage.tnb;
import defpackage.unb;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CheckoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1 checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof CheckoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1) {
            checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1 = (CheckoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    tnb tnbVar = ((unb) obj).f;
                    if (tnbVar != null) {
                        checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(tnbVar, checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1 = new CheckoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
