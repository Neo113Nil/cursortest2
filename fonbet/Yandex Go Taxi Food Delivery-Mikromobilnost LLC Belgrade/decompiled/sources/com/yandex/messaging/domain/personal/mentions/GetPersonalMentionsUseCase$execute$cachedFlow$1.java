package com.yandex.messaging.domain.personal.mentions;

import com.yandex.messaging.ChatRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001b\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\u0003¢\u0006\u0002\b\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "", "Lcom/yandex/messaging/domain/personal/mentions/Mentions;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.personal.mentions.GetPersonalMentionsUseCase$execute$cachedFlow$1", f = "GetPersonalMentionsUseCase.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetPersonalMentionsUseCase$execute$cachedFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPersonalMentionsUseCase$execute$cachedFlow$1(a aVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetPersonalMentionsUseCase$execute$cachedFlow$1 getPersonalMentionsUseCase$execute$cachedFlow$1 = new GetPersonalMentionsUseCase$execute$cachedFlow$1(this.this$0, this.$chatRequest, continuation);
        getPersonalMentionsUseCase$execute$cachedFlow$1.L$0 = obj;
        return getPersonalMentionsUseCase$execute$cachedFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetPersonalMentionsUseCase$execute$cachedFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Object obj2 = this.this$0.c.get(this.$chatRequest);
            this.label = 1;
            if (vprVar.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
