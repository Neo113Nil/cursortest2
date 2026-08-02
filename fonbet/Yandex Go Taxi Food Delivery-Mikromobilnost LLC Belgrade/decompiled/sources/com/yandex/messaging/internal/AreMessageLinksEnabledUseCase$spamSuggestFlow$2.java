package com.yandex.messaging.internal;

import com.yandex.messaging.ChatRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.AreMessageLinksEnabledUseCase$spamSuggestFlow$2", f = "AreMessageLinksEnabledUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AreMessageLinksEnabledUseCase$spamSuggestFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreMessageLinksEnabledUseCase$spamSuggestFlow$2(b bVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AreMessageLinksEnabledUseCase$spamSuggestFlow$2 areMessageLinksEnabledUseCase$spamSuggestFlow$2 = new AreMessageLinksEnabledUseCase$spamSuggestFlow$2(this.this$0, this.$chatRequest, continuation);
        areMessageLinksEnabledUseCase$spamSuggestFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return areMessageLinksEnabledUseCase$spamSuggestFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        AreMessageLinksEnabledUseCase$spamSuggestFlow$2 areMessageLinksEnabledUseCase$spamSuggestFlow$2 = (AreMessageLinksEnabledUseCase$spamSuggestFlow$2) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        areMessageLinksEnabledUseCase$spamSuggestFlow$2.invokeSuspend(zy11Var);
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
        this.this$0.d.put(this.$chatRequest, Boolean.valueOf(this.Z$0));
        return zy11.a;
    }
}
