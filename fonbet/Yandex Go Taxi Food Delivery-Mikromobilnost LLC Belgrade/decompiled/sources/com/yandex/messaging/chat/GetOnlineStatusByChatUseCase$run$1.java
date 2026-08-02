package com.yandex.messaging.chat;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Le370;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.GetOnlineStatusByChatUseCase$run$1", f = "GetOnlineStatusByChatUseCase.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetOnlineStatusByChatUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ o1b0 $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOnlineStatusByChatUseCase$run$1(o1b0 o1b0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$params = o1b0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetOnlineStatusByChatUseCase$run$1 getOnlineStatusByChatUseCase$run$1 = new GetOnlineStatusByChatUseCase$run$1(this.$params, this.this$0, continuation);
        getOnlineStatusByChatUseCase$run$1.L$0 = obj;
        return getOnlineStatusByChatUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetOnlineStatusByChatUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            o1b0 o1b0Var = this.$params;
            if (!o1b0Var.e && (a = this.this$0.b.a(o1b0Var)) != null) {
                tpr a2 = this.this$0.c.a(a);
                this.label = 1;
                if (e.u(a2, vprVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
