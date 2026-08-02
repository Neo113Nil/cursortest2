package com.yandex.go.payments_widgets.yandex_bank.update.balance;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;

    public b(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1 updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1) {
            updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1 = (UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1 = new UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
