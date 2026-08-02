package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tqm0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1", f = "ScootersCurrentSessionStateAdapterRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tqm0 $scootersActiveOrdersStateUpdateInteractor$inlined;
    final /* synthetic */ h0 $scootersUnifiedPollingShouldRunInteractor$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1(Continuation continuation, p pVar, h0 h0Var, tqm0 tqm0Var) {
        super(3, continuation);
        this.this$0 = pVar;
        this.$scootersUnifiedPollingShouldRunInteractor$inlined = h0Var;
        this.$scootersActiveOrdersStateUpdateInteractor$inlined = tqm0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1 scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1 = new ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$scootersUnifiedPollingShouldRunInteractor$inlined, this.$scootersActiveOrdersStateUpdateInteractor$inlined);
        scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr X = !((Boolean) obj2).booleanValue() ? this.this$0.a : kotlinx.coroutines.flow.e.X(this.$scootersUnifiedPollingShouldRunInteractor$inlined.a(), new ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$lambda$0$$inlined$flatMapLatest$1(null, this.this$0, this.$scootersActiveOrdersStateUpdateInteractor$inlined));
            this.L$0 = null;
            this.L$1 = null;
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
