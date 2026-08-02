package com.yandex.payment.divkit.bind;

import defpackage.bw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ud;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.bind.DKBindCardFragment$observeLiveData$2", f = "DKBindCardFragment.kt", l = {415}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class DKBindCardFragment$observeLiveData$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DKBindCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKBindCardFragment$observeLiveData$2(DKBindCardFragment dKBindCardFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dKBindCardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DKBindCardFragment$observeLiveData$2 dKBindCardFragment$observeLiveData$2 = new DKBindCardFragment$observeLiveData$2(this.this$0, continuation);
        dKBindCardFragment$observeLiveData$2.L$0 = obj;
        return dKBindCardFragment$observeLiveData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKBindCardFragment$observeLiveData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = ((bw) this.this$0.getActionFlowReceiver()).a;
            ud udVar = new ud(19, tseVar, this.this$0);
            this.L$0 = null;
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, udVar, this) == coroutineSingletons) {
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
