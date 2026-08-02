package com.ybsdk.screens.upgrade.domain.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.domain.interactors.UpgradeInteractorImpl$special$$inlined$transform$1", f = "UpgradeInteractorImpl.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UpgradeInteractorImpl$special$$inlined$transform$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeInteractorImpl$special$$inlined$transform$1(tpr tprVar, Continuation continuation, c cVar) {
        super(2, continuation);
        this.$this_transform = tprVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeInteractorImpl$special$$inlined$transform$1 upgradeInteractorImpl$special$$inlined$transform$1 = new UpgradeInteractorImpl$special$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        upgradeInteractorImpl$special$$inlined$transform$1.L$0 = obj;
        return upgradeInteractorImpl$special$$inlined$transform$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeInteractorImpl$special$$inlined$transform$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            tpr tprVar = this.$this_transform;
            b bVar = new b(vprVar, this.this$0);
            this.label = 1;
            if (tprVar.collect(bVar, this) == coroutineSingletons) {
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
