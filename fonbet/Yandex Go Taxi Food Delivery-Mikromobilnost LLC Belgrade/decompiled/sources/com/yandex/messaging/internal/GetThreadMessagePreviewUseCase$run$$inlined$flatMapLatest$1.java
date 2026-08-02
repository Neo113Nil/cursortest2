package com.yandex.messaging.internal;

import defpackage.g9t;
import defpackage.i3b;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.set;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1", f = "GetThreadMessagePreviewUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ExistingChat $parentChatRequest$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ set this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, set setVar, ExistingChat existingChat) {
        super(3, continuation);
        this.this$0 = setVar;
        this.$parentChatRequest$inlined = existingChat;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1 getThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1 = new GetThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$parentChatRequest$inlined);
        getThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            i3b a = ((j3b) this.L$1).a();
            tpr X = a != null ? kotlinx.coroutines.flow.e.X(this.this$0.d.a(new g9t(this.$parentChatRequest$inlined, a.b)), new GetThreadMessagePreviewUseCase$run$lambda$4$lambda$3$$inlined$flatMapLatest$1(null, this.this$0, this.$parentChatRequest$inlined)) : pvn.a;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(X, vprVar, this) == coroutineSingletons) {
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
