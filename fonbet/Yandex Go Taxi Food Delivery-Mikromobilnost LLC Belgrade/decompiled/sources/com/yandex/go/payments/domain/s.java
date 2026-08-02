package com.yandex.go.payments.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;

    public s(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1 mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1) {
            mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1 = (MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1) continuation;
            int i2 = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((List) obj).size() > 1);
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.L$0 = null;
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.L$1 = null;
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.L$2 = null;
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.L$3 = null;
                    mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(valueOf, mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1 = new MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
