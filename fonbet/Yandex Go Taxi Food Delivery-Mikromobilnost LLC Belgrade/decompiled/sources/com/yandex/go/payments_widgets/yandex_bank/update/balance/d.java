package com.yandex.go.payments_widgets.yandex_bank.update.balance;

import defpackage.cc20;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes8.dex */
public final class d implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ cc20 b;

    public d(g gVar, cc20 cc20Var) {
        this.a = gVar;
        this.b = cc20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1 updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1) {
            updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1 = (UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(cVar, updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1 = new UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
