package com.yandex.go.chargers.order.completion.pre_finish.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u1a;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.domain.ChargersFinishUiStateInteractor$takeUntilNext$1$job$1", f = "ChargersFinishUiStateInteractor.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishUiStateInteractor$takeUntilNext$1$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;
    final /* synthetic */ tpr $this_takeUntilNext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFinishUiStateInteractor$takeUntilNext$1$job$1(tpr tprVar, y6f0 y6f0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_takeUntilNext = tprVar;
        this.$$this$channelFlow = y6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFinishUiStateInteractor$takeUntilNext$1$job$1(this.$this_takeUntilNext, this.$$this$channelFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFinishUiStateInteractor$takeUntilNext$1$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_takeUntilNext;
            u1a u1aVar = new u1a(this.$$this$channelFlow, 0);
            this.label = 1;
            if (tprVar.collect(u1aVar, this) == coroutineSingletons) {
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
