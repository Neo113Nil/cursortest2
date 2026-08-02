package com.ybsdk.feature.transfer.version2.internal.screens.budget.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.StartChargeSearchResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.up6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchResponse;", "it", "Lup6;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchResponse;)Lup6;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.budget.data.BudgetChargesRepository$startSearch$3$1", f = "BudgetChargesRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BudgetChargesRepository$startSearch$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BudgetChargesRepository$startSearch$3$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BudgetChargesRepository$startSearch$3$1 budgetChargesRepository$startSearch$3$1 = new BudgetChargesRepository$startSearch$3$1(this.this$0, continuation);
        budgetChargesRepository$startSearch$3$1.L$0 = obj;
        return budgetChargesRepository$startSearch$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BudgetChargesRepository$startSearch$3$1) create((StartChargeSearchResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        StartChargeSearchResponse startChargeSearchResponse = (StartChargeSearchResponse) this.L$0;
        this.this$0.getClass();
        return new up6(startChargeSearchResponse.getRequestId(), a.g(startChargeSearchResponse.getProcessingInfo()), a.g(startChargeSearchResponse.getTimeoutInfo()));
    }
}
