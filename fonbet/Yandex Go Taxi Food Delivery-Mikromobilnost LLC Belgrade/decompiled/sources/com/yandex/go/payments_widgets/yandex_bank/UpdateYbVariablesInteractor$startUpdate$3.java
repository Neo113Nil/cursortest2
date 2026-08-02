package com.yandex.go.payments_widgets.yandex_bank;

import defpackage.jl40;
import defpackage.jxk0;
import defpackage.lxk0;
import defpackage.mvg;
import defpackage.nx51;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnx51;", "ybState", "Llxk0;", "rotationState", "<anonymous>", "(Lnx51;Llxk0;)Lnx51;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.yandex_bank.UpdateYbVariablesInteractor$startUpdate$3", f = "UpdateYbVariablesInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UpdateYbVariablesInteractor$startUpdate$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpdateYbVariablesInteractor$startUpdate$3 updateYbVariablesInteractor$startUpdate$3 = new UpdateYbVariablesInteractor$startUpdate$3(3, (Continuation) obj3);
        updateYbVariablesInteractor$startUpdate$3.L$0 = (nx51) obj;
        updateYbVariablesInteractor$startUpdate$3.L$1 = (lxk0) obj2;
        return updateYbVariablesInteractor$startUpdate$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nx51 nx51Var = (nx51) this.L$0;
        lxk0 lxk0Var = (lxk0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!jl40.l(lxk0Var, jxk0.a)) {
            return nx51Var;
        }
        boolean z = nx51Var.a;
        boolean z2 = nx51Var.b;
        nx51Var.getClass();
        return new nx51(z, z2, "********", "");
    }
}
