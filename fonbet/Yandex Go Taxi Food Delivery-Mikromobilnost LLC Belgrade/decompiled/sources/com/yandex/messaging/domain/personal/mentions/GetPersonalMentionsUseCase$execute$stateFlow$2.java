package com.yandex.messaging.domain.personal.mentions;

import com.yandex.messaging.ChatRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lzy11;", "<anonymous>", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.personal.mentions.GetPersonalMentionsUseCase$execute$stateFlow$2", f = "GetPersonalMentionsUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetPersonalMentionsUseCase$execute$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPersonalMentionsUseCase$execute$stateFlow$2(a aVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetPersonalMentionsUseCase$execute$stateFlow$2 getPersonalMentionsUseCase$execute$stateFlow$2 = new GetPersonalMentionsUseCase$execute$stateFlow$2(this.this$0, this.$chatRequest, continuation);
        getPersonalMentionsUseCase$execute$stateFlow$2.L$0 = obj;
        return getPersonalMentionsUseCase$execute$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetPersonalMentionsUseCase$execute$stateFlow$2 getPersonalMentionsUseCase$execute$stateFlow$2 = (GetPersonalMentionsUseCase$execute$stateFlow$2) create((Set) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        getPersonalMentionsUseCase$execute$stateFlow$2.invokeSuspend(zy11Var);
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
        this.this$0.c.put(this.$chatRequest, (Set) this.L$0);
        return zy11.a;
    }
}
