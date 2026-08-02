package com.yandex.messaging.internal;

import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oab;
import defpackage.s020;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetMessageTypeUseCase$run$$inlined$flatMapLatest$1", f = "GetMessageTypeUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetMessageTypeUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ServerMessageRef $serverMessageRef$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMessageTypeUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, ServerMessageRef serverMessageRef) {
        super(3, continuation);
        this.$serverMessageRef$inlined = serverMessageRef;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetMessageTypeUseCase$run$$inlined$flatMapLatest$1 getMessageTypeUseCase$run$$inlined$flatMapLatest$1 = new GetMessageTypeUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.$serverMessageRef$inlined);
        getMessageTypeUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getMessageTypeUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getMessageTypeUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.i(new GetMessageTypeUseCaseKt$messageFlow$$inlined$disposableFlowWrapper$1(null, (oab) ((m8g) ((s020) this.L$1)).h.get(), this.$serverMessageRef$inlined)), new GetMessageTypeUseCase$run$lambda$1$$inlined$flatMapLatest$1(3, null));
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
