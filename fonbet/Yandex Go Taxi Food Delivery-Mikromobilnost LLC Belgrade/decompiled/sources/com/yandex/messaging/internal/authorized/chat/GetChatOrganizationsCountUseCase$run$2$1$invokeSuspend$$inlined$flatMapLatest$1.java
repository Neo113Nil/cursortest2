package com.yandex.messaging.internal.authorized.chat;

import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.rol0;
import defpackage.s020;
import defpackage.vpr;
import defpackage.w4t;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1", f = "GetChatOrganizationsCountUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ w4t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, w4t w4tVar) {
        super(3, continuation);
        this.this$0 = w4tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1 getChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1 = new GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        getChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return getChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            s020 s020Var = (s020) this.L$1;
            w4t w4tVar = this.this$0;
            o1b0 o1b0Var = ((m8g) s020Var).a;
            w4tVar.getClass();
            rol0 rol0Var = new rol0(new GetChatOrganizationsCountUseCase$chatOrganizationsFlow$1(w4tVar, o1b0Var, null));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(rol0Var, vprVar, this) == coroutineSingletons) {
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
