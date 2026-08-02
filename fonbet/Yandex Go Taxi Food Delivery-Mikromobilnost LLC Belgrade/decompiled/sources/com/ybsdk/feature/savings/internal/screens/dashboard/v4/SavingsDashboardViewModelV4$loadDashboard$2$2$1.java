package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import defpackage.iyd0;
import defpackage.lam0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardViewModelV4$loadDashboard$2$2$1", f = "SavingsDashboardViewModelV4.kt", l = {279}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardViewModelV4$loadDashboard$2$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ iyd0<lam0> $pollable;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardViewModelV4$loadDashboard$2$2$1(c cVar, iyd0 iyd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$pollable = iyd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsDashboardViewModelV4$loadDashboard$2$2$1(this.this$0, this.$pollable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardViewModelV4$loadDashboard$2$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            SavingsDashboardPollStatus savingsDashboardPollStatus = ((lam0) this.$pollable.a).d;
            this.label = 1;
            if (c.b0(cVar, savingsDashboardPollStatus, this) == coroutineSingletons) {
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
