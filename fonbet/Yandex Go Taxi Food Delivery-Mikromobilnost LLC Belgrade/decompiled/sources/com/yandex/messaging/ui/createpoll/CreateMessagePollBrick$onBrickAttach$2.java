package com.yandex.messaging.ui.createpoll;

import defpackage.k7f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/util/ArrayList;", "Ls7f;", "Lkotlin/collections/ArrayList;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/ArrayList;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.createpoll.CreateMessagePollBrick$onBrickAttach$2", f = "CreatePollBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CreateMessagePollBrick$onBrickAttach$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateMessagePollBrick$onBrickAttach$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreateMessagePollBrick$onBrickAttach$2 createMessagePollBrick$onBrickAttach$2 = new CreateMessagePollBrick$onBrickAttach$2(this.this$0, continuation);
        createMessagePollBrick$onBrickAttach$2.L$0 = obj;
        return createMessagePollBrick$onBrickAttach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CreateMessagePollBrick$onBrickAttach$2 createMessagePollBrick$onBrickAttach$2 = (CreateMessagePollBrick$onBrickAttach$2) create((ArrayList) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        createMessagePollBrick$onBrickAttach$2.invokeSuspend(zy11Var);
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
        ArrayList arrayList = (ArrayList) this.L$0;
        k7f k7fVar = this.this$0.c;
        k7fVar.w.a(arrayList, k7fVar);
        return zy11.a;
    }
}
