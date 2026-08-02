package com.yandex.plus.core.data.pay;

import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.core.data.pay.PlusSelectPaymentMethodControllerKt$awaitTerminalState$3", f = "PlusSelectPaymentMethodController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusSelectPaymentMethodControllerKt$awaitTerminalState$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusSelectPaymentMethodControllerKt$awaitTerminalState$3 plusSelectPaymentMethodControllerKt$awaitTerminalState$3 = new PlusSelectPaymentMethodControllerKt$awaitTerminalState$3(2, continuation);
        plusSelectPaymentMethodControllerKt$awaitTerminalState$3.L$0 = obj;
        return plusSelectPaymentMethodControllerKt$awaitTerminalState$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusSelectPaymentMethodControllerKt$awaitTerminalState$3) create((PlusSelectPaymentMethodState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlusSelectPaymentMethodState plusSelectPaymentMethodState = (PlusSelectPaymentMethodState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!(plusSelectPaymentMethodState instanceof PlusSelectPaymentMethodState.Terminal));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
