package com.yandex.messaging.internal;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import defpackage.cft;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.fjs;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.syc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xn21;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1", f = "GetUserAverageResponseTimeUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ChatRequest $params$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ cft this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, ChatRequest chatRequest, cft cftVar) {
        super(3, continuation);
        this.$params$inlined = chatRequest;
        this.this$0 = cftVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1 getUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1 = new GetUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.$params$inlined, this.this$0);
        getUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        String addressee;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            cl21 cl21Var = (cl21) this.L$1;
            ChatRequest chatRequest = this.$params$inlined;
            if (chatRequest instanceof ExistingChatRequest) {
                addressee = this.this$0.c.b(((ExistingChatRequest) chatRequest).id());
                if (addressee == null) {
                    g92Var = new g92(2, null);
                    this.label = 1;
                    if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                xn21.a((fjs) ((d9g) cl21Var).A0.get(), addressee);
                g92Var = kotlinx.coroutines.flow.e.t(new syc(this.this$0.e.a(this.$params$inlined), 23));
                this.label = 1;
                if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                }
            } else if (chatRequest instanceof PrivateChatRequest) {
                addressee = ((PrivateChatRequest) chatRequest).addressee();
                xn21.a((fjs) ((d9g) cl21Var).A0.get(), addressee);
                g92Var = kotlinx.coroutines.flow.e.t(new syc(this.this$0.e.a(this.$params$inlined), 23));
                this.label = 1;
                if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                }
            } else {
                g92Var = new g92(2, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                }
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
