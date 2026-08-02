package com.yandex.messaging.domain;

import android.os.Looper;
import defpackage.a80;
import defpackage.h4t;
import defpackage.m0b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.xi3;
import defpackage.y6f0;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.GetChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1", f = "GetChatAdminsUseCase.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ m0b $this_adminsFlow$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1(Continuation continuation, m0b m0bVar) {
        super(2, continuation);
        this.$this_adminsFlow$inlined = m0bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1 getChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1 = new GetChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1(continuation, this.$this_adminsFlow$inlined);
        getChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return getChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatAdminsUseCase$adminsFlow$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            m0b m0bVar = this.$this_adminsFlow$inlined;
            h4t h4tVar = new h4t(y6f0Var);
            z83.g(null, m0bVar.b, Looper.myLooper());
            ((x6f0) y6f0Var).d(m0bVar.c.o());
            m0bVar.a.b(h4tVar);
            m0bVar.w.c();
            a80 a80Var = new a80(10, new xi3(4, m0bVar, h4tVar));
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, a80Var, this) == coroutineSingletons) {
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
