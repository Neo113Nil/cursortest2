package com.yandex.messaging.internal.translator;

import com.yandex.messaging.ChatRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.GetChatTranslationUseCase$run$1", f = "GetChatTranslationUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatTranslationUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatTranslationUseCase$run$1(g gVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatTranslationUseCase$run$1 getChatTranslationUseCase$run$1 = new GetChatTranslationUseCase$run$1(this.this$0, this.$chatRequest, continuation);
        getChatTranslationUseCase$run$1.L$0 = obj;
        return getChatTranslationUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetChatTranslationUseCase$run$1 getChatTranslationUseCase$run$1 = (GetChatTranslationUseCase$run$1) create((String) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        getChatTranslationUseCase$run$1.invokeSuspend(zy11Var);
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
        this.this$0.i.put(this.$chatRequest.uniqueRequestId(), (String) this.L$0);
        return zy11.a;
    }
}
