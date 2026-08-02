package com.ybsdk.feature.transfer.version2.internal.screens.budget.domain;

import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.entities.BudgetGetStatusEntity$Status;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qp6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqp6;", "", "<anonymous>", "(Lqp6;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.BudgetChargesInteractor$getStatusChargeSearch$2", f = "BudgetChargesInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BudgetChargesInteractor$getStatusChargeSearch$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BudgetChargesInteractor$getStatusChargeSearch$2 budgetChargesInteractor$getStatusChargeSearch$2 = new BudgetChargesInteractor$getStatusChargeSearch$2(2, continuation);
        budgetChargesInteractor$getStatusChargeSearch$2.L$0 = obj;
        return budgetChargesInteractor$getStatusChargeSearch$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BudgetChargesInteractor$getStatusChargeSearch$2) create((qp6) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(((qp6) this.L$0).a != BudgetGetStatusEntity$Status.IN_PROGRESS);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
