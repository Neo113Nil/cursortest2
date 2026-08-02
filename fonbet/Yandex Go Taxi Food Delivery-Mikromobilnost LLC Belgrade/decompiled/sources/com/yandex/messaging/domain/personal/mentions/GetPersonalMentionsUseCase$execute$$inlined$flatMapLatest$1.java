package com.yandex.messaging.domain.personal.mentions;

import android.os.Looper;
import defpackage.bvf0;
import defpackage.m5b0;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.z83;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.personal.mentions.GetPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1", f = "GetPersonalMentionsUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1 getPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1 = new GetPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1(3, (Continuation) obj3);
        getPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1.L$1 = obj2;
        return getPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            m5b0 m5b0Var = (m5b0) ((m8g) ((s020) this.L$1)).O.get();
            m5b0Var.getClass();
            z83.b(null, Looper.myLooper(), m5b0Var.c);
            r0 r0Var = m5b0Var.d;
            if (r0Var != null) {
                tprVar = e.d(r0Var);
            } else {
                r0 c = bvf0.c(m5b0Var.b());
                m5b0Var.d = c;
                tprVar = c;
            }
            this.label = 1;
            if (e.u(tprVar, vprVar, this) == coroutineSingletons) {
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
