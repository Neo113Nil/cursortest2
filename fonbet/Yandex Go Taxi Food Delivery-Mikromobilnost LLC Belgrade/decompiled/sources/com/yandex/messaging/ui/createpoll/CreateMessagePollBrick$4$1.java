package com.yandex.messaging.ui.createpoll;

import android.app.Activity;
import android.content.Intent;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t7f;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.createpoll.CreateMessagePollBrick$4$1", f = "CreatePollBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CreateMessagePollBrick$4$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateMessagePollBrick$4$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateMessagePollBrick$4$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CreateMessagePollBrick$4$1 createMessagePollBrick$4$1 = (CreateMessagePollBrick$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        createMessagePollBrick$4$1.invokeSuspend(zy11Var);
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
        t7f t7fVar = this.this$0.w;
        PollMessageDraft c = t7fVar.c();
        Intent intent = new Intent();
        intent.putExtra("param_draft", c);
        Activity activity = t7fVar.a;
        activity.setResult(-1, intent);
        activity.finish();
        return zy11.a;
    }
}
