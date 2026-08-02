package com.yandex.messaging.internal.search;

import defpackage.cl21;
import defpackage.d9g;
import defpackage.fi9;
import defpackage.hgu;
import defpackage.mjt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ujt;
import defpackage.vpr;
import defpackage.yjt;
import defpackage.zjt;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.search.GlobalSearchUseCase$run$$inlined$flatMapLatest$1", f = "GlobalSearchUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GlobalSearchUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ujt $params$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ zjt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, zjt zjtVar, ujt ujtVar) {
        super(3, continuation);
        this.this$0 = zjtVar;
        this.$params$inlined = ujtVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GlobalSearchUseCase$run$$inlined$flatMapLatest$1 globalSearchUseCase$run$$inlined$flatMapLatest$1 = new GlobalSearchUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$params$inlined);
        globalSearchUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        globalSearchUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return globalSearchUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            cl21 cl21Var = (cl21) this.L$1;
            zjt zjtVar = this.this$0;
            mjt mjtVar = (mjt) ((d9g) cl21Var).E0.get();
            ujt ujtVar = this.$params$inlined;
            hgu hguVar = ujtVar.a;
            yjt yjtVar = ujtVar.b;
            zjtVar.getClass();
            fi9 i2 = e.i(new GlobalSearchUseCase$requestSearch$$inlined$disposableFlowWrapper$1(null, mjtVar, hguVar, yjtVar));
            this.label = 1;
            if (e.u(i2, vprVar, this) == coroutineSingletons) {
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
