package com.yandex.messaging.internal.chat.domain;

import defpackage.g92;
import defpackage.h3t0;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.chat.domain.GetChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1", f = "GetChatLinkUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ Ref$ObjectRef $snapshot$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(3, continuation);
        this.$snapshot$inlined = ref$ObjectRef;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1 getChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1 = new GetChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1((Continuation) obj3, this.$snapshot$inlined);
        getChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return getChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            m8g m8gVar = (m8g) ((s020) this.L$1);
            tpr g92Var = m8gVar.b().a() ? new g92(2, null) : m8gVar.e().a((h3t0) this.$snapshot$inlined.element);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
