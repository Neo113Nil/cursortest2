package com.yandex.go.payments_widgets.yandex_bank.update.balance;

import com.yandex.go.yb.data.p;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class f implements tpr {
    public final /* synthetic */ p a;

    public f(p pVar) {
        this.a = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpdateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1 updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof UpdateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1) {
            updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1 = (UpdateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1) continuation;
            int i2 = updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.L$0 = null;
                    updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.L$1 = null;
                    updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.L$2 = null;
                    updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(eVar, updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1 = new UpdateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYandexCardBalanceInteractorImpl$creditLimitUpgradeFlow$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
