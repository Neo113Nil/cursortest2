package com.yandex.plus.core.data.pay;

import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import defpackage.cvw;
import defpackage.kv5;
import defpackage.ny61;
import defpackage.old0;
import defpackage.xac;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.v;

/* loaded from: classes2.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(old0 old0Var, kv5 kv5Var, ContinuationImpl continuationImpl) {
        PlusSelectPaymentMethodControllerKt$awaitTerminalState$1 plusSelectPaymentMethodControllerKt$awaitTerminalState$1;
        int i;
        if (continuationImpl instanceof PlusSelectPaymentMethodControllerKt$awaitTerminalState$1) {
            plusSelectPaymentMethodControllerKt$awaitTerminalState$1 = (PlusSelectPaymentMethodControllerKt$awaitTerminalState$1) continuationImpl;
            int i2 = plusSelectPaymentMethodControllerKt$awaitTerminalState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSelectPaymentMethodControllerKt$awaitTerminalState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSelectPaymentMethodControllerKt$awaitTerminalState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSelectPaymentMethodControllerKt$awaitTerminalState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xac xacVar = new xac(new v(old0Var.getState(), new PlusSelectPaymentMethodControllerKt$awaitTerminalState$3(2, null)), 1);
                    PlusSelectPaymentMethodControllerKt$awaitTerminalState$4 plusSelectPaymentMethodControllerKt$awaitTerminalState$4 = new PlusSelectPaymentMethodControllerKt$awaitTerminalState$4(2, kv5Var, cvw.class, "suspendConversion0", "awaitTerminalState$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    plusSelectPaymentMethodControllerKt$awaitTerminalState$1.L$0 = old0Var;
                    plusSelectPaymentMethodControllerKt$awaitTerminalState$1.L$1 = null;
                    plusSelectPaymentMethodControllerKt$awaitTerminalState$1.label = 1;
                    if (kotlinx.coroutines.flow.e.k(xacVar, plusSelectPaymentMethodControllerKt$awaitTerminalState$4, plusSelectPaymentMethodControllerKt$awaitTerminalState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    old0Var = (old0) plusSelectPaymentMethodControllerKt$awaitTerminalState$1.L$0;
                    kotlin.b.b(obj);
                }
                return (PlusSelectPaymentMethodState.Terminal) old0Var.getState().a.getValue();
            }
        }
        plusSelectPaymentMethodControllerKt$awaitTerminalState$1 = new PlusSelectPaymentMethodControllerKt$awaitTerminalState$1(continuationImpl);
        Object obj2 = plusSelectPaymentMethodControllerKt$awaitTerminalState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSelectPaymentMethodControllerKt$awaitTerminalState$1.label;
        if (i != 0) {
        }
        return (PlusSelectPaymentMethodState.Terminal) old0Var.getState().a.getValue();
    }
}
