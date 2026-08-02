package com.yandex.messaging.ui.calls.feedback;

import defpackage.d2b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld2b;", "it", "Lzy11;", "<anonymous>", "(Ld2b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.calls.feedback.CallFeedbackBrick$onBrickAttach$2", f = "CallFeedbackBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CallFeedbackBrick$onBrickAttach$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallFeedbackBrick$onBrickAttach$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CallFeedbackBrick$onBrickAttach$2 callFeedbackBrick$onBrickAttach$2 = new CallFeedbackBrick$onBrickAttach$2(this.this$0, continuation);
        callFeedbackBrick$onBrickAttach$2.L$0 = obj;
        return callFeedbackBrick$onBrickAttach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CallFeedbackBrick$onBrickAttach$2 callFeedbackBrick$onBrickAttach$2 = (CallFeedbackBrick$onBrickAttach$2) create((d2b) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        callFeedbackBrick$onBrickAttach$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.z.setImageDrawable(((d2b) this.L$0).b);
        return zy11.a;
    }
}
