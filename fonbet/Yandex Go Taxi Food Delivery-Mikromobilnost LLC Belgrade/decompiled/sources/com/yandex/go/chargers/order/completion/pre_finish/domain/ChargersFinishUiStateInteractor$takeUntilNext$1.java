package com.yandex.go.chargers.order.completion.pre_finish.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ud;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.domain.ChargersFinishUiStateInteractor$takeUntilNext$1", f = "ChargersFinishUiStateInteractor.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishUiStateInteractor$takeUntilNext$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $next;
    final /* synthetic */ tpr $this_takeUntilNext;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFinishUiStateInteractor$takeUntilNext$1(tpr tprVar, tpr tprVar2, Continuation continuation) {
        super(2, continuation);
        this.$next = tprVar;
        this.$this_takeUntilNext = tprVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersFinishUiStateInteractor$takeUntilNext$1 chargersFinishUiStateInteractor$takeUntilNext$1 = new ChargersFinishUiStateInteractor$takeUntilNext$1(this.$next, this.$this_takeUntilNext, continuation);
        chargersFinishUiStateInteractor$takeUntilNext$1.L$0 = obj;
        return chargersFinishUiStateInteractor$takeUntilNext$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFinishUiStateInteractor$takeUntilNext$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, pzt0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            z.element = tje.N(y6f0Var, null, null, new ChargersFinishUiStateInteractor$takeUntilNext$1$job$1(this.$this_takeUntilNext, y6f0Var, null), 3);
            tpr tprVar = this.$next;
            ud udVar = new ud(10, z, y6f0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(udVar, this) == coroutineSingletons) {
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
