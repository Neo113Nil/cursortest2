package com.yandex.go.taxi.summary.interactor;

import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pox0;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.interactor.SummarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1", f = "SummarySourceDestinationModelInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SummarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1(p pVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = pVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1 summarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1 = new SummarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        summarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        summarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return summarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pox0 pox0Var = (pox0) obj2;
            String str = pox0Var.a;
            tpr mVar = evu0.J(str) ? pvn.a : new m(this.this$0.l.g(str), pox0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(mVar, vprVar, this) == coroutineSingletons) {
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
