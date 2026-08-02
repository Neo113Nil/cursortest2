package com.yandex.go.payments.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class p implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ u b;

    public p(tpr[] tprVarArr, u uVar) {
        this.a = tprVarArr;
        this.b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1 mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1) {
            mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1 = (MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1) continuation;
            int i2 = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 29);
                    MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3 mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3 = new MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3(this.b, null);
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.L$0 = null;
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.L$1 = null;
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.L$2 = null;
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, v10Var, mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3, mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1 = new MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
