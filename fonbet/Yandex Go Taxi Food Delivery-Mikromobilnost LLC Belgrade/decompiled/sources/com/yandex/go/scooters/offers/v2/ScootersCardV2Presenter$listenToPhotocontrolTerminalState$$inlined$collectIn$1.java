package com.yandex.go.scooters.offers.v2;

import defpackage.mvg;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.r4n0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$collectIn$1", f = "ScootersCardV2Presenter.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$collectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectIn;
    int label;
    final /* synthetic */ n6n0 receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$collectIn$1(tpr tprVar, Continuation continuation, n6n0 n6n0Var) {
        super(2, continuation);
        this.$this_collectIn = tprVar;
        this.receiver$inlined = n6n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$collectIn$1(this.$this_collectIn, continuation, this.receiver$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$collectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectIn;
            r4n0 r4n0Var = new r4n0(4, this.receiver$inlined);
            this.label = 1;
            if (tprVar.collect(r4n0Var, this) == coroutineSingletons) {
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
