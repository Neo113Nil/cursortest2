package com.yandex.messaging.internal.authorized.chat.refresher;

import com.yandex.messaging.internal.entities.ReducedMessage;
import defpackage.l020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rmi0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.ReducedMessageConsumer$consumeMessage$2", f = "ReducedMessageConsumer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ReducedMessageConsumer$consumeMessage$2 extends SuspendLambda implements wls {
    final /* synthetic */ ReducedMessage $message;
    int label;
    final /* synthetic */ rmi0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducedMessageConsumer$consumeMessage$2(rmi0 rmi0Var, ReducedMessage reducedMessage, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rmi0Var;
        this.$message = reducedMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReducedMessageConsumer$consumeMessage$2(this.this$0, this.$message, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ReducedMessageConsumer$consumeMessage$2 reducedMessageConsumer$consumeMessage$2 = (ReducedMessageConsumer$consumeMessage$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        reducedMessageConsumer$consumeMessage$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        l020 C = this.this$0.b.C();
        rmi0 rmi0Var = this.this$0;
        ReducedMessage reducedMessage = this.$message;
        try {
            C.A0(rmi0Var.a.a.a, reducedMessage.b, reducedMessage);
            C.s();
            C.close();
            return zy11.a;
        } finally {
        }
    }
}
