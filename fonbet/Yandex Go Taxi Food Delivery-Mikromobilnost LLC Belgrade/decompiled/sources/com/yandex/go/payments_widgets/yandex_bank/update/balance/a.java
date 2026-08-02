package com.yandex.go.payments_widgets.yandex_bank.update.balance;

import defpackage.ny61;
import defpackage.qqd0;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1 updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1) {
            updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1 = (UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                rsn rsnVar = (rsn) obj;
                qqd0 qqd0Var = (qqd0) rsnVar.a;
                zy11 zy11Var2 = (qqd0Var == null || qqd0Var.b || !((qqd0) rsnVar.b).b) ? null : zy11Var;
                if (zy11Var2 != null) {
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                    updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label = 1;
                    if (this.a.emit(zy11Var2, updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1 = new UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label;
        zy11 zy11Var3 = zy11.a;
        if (i == 0) {
        }
    }
}
