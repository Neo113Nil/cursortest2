package com.yandex.messaging.internal.search;

import defpackage.a80;
import defpackage.j5b;
import defpackage.ljt;
import defpackage.mjt;
import defpackage.mvg;
import defpackage.njt;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.yjt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.search.GlobalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1", f = "GlobalSearchUseCase.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GlobalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ njt $searchFilter$inlined;
    final /* synthetic */ yjt $searchTrace$inlined;
    final /* synthetic */ mjt $this_requestSearch$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1(Continuation continuation, mjt mjtVar, njt njtVar, yjt yjtVar) {
        super(2, continuation);
        this.$this_requestSearch$inlined = mjtVar;
        this.$searchFilter$inlined = njtVar;
        this.$searchTrace$inlined = yjtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlobalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1 globalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1 = new GlobalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1(continuation, this.$this_requestSearch$inlined, this.$searchFilter$inlined, this.$searchTrace$inlined);
        globalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return globalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GlobalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            mjt mjtVar = this.$this_requestSearch$inlined;
            j5b j5bVar = new j5b(y6f0Var);
            njt njtVar = this.$searchFilter$inlined;
            yjt yjtVar = this.$searchTrace$inlined;
            mjtVar.getClass();
            a80 a80Var = new a80(20, new ljt(mjtVar, j5bVar, njtVar, yjtVar));
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, a80Var, this) == coroutineSingletons) {
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
