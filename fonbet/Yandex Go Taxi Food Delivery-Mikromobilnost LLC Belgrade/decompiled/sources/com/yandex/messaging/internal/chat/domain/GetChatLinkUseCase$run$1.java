package com.yandex.messaging.internal.chat.domain;

import com.yandex.messaging.ChatRequest;
import defpackage.h3t0;
import defpackage.hww;
import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lhww;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.chat.domain.GetChatLinkUseCase$run$1", f = "GetChatLinkUseCase.kt", l = {42, 48}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatLinkUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatLinkUseCase$run$1(c cVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatLinkUseCase$run$1 getChatLinkUseCase$run$1 = new GetChatLinkUseCase$run$1(this.this$0, this.$chatRequest, continuation);
        getChatLinkUseCase$run$1.L$0 = obj;
        return getChatLinkUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatLinkUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, g3t0] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, h3t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Ref$ObjectRef ref$ObjectRef;
        vpr vprVar2;
        tpr F;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            c cVar = this.this$0;
            if (cVar.e.a(cVar.d) != null) {
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = h3t0.a;
                j9b c = this.this$0.b.c(this.$chatRequest);
                if (c != null && !c.e().a()) {
                    hww i2 = c.f().i();
                    if (i2 != null) {
                        ref$ObjectRef.element = i2.a;
                    } else {
                        i2 = null;
                    }
                    this.L$0 = vprVar;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    if (vprVar.emit(i2, this) != coroutineSingletons) {
                        vprVar2 = vprVar;
                    }
                    return coroutineSingletons;
                }
                F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$chatRequest), new GetChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(null, ref$ObjectRef)), this.this$0.c.e);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (kotlinx.coroutines.flow.e.u(F, vprVar, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$1;
        vprVar2 = (vpr) this.L$0;
        kotlin.b.b(obj);
        vprVar = vprVar2;
        F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$chatRequest), new GetChatLinkUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(null, ref$ObjectRef)), this.this$0.c.e);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (kotlinx.coroutines.flow.e.u(F, vprVar, this) != coroutineSingletons) {
            return zy11Var;
        }
    }
}
