package com.ybsdk.feature.transfer.version2.internal.screens.budget.data;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.requisites.BudgetInvoiceRequisitesResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesResponse;", TarifficatorScenarioActivity.RESULT_KEY, "Lv7l;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesResponse;)Lv7l;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.budget.data.BudgetChargesRepository$getRequisites$2$1$1", f = "BudgetChargesRepository.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BudgetChargesRepository$getRequisites$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BudgetChargesRepository$getRequisites$2$1$1 budgetChargesRepository$getRequisites$2$1$1 = new BudgetChargesRepository$getRequisites$2$1$1(2, continuation);
        budgetChargesRepository$getRequisites$2$1$1.L$0 = obj;
        return budgetChargesRepository$getRequisites$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BudgetChargesRepository$getRequisites$2$1$1) create((BudgetInvoiceRequisitesResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        DivScreenDto divkitScreen = ((BudgetInvoiceRequisitesResponse) this.L$0).getDivkitScreen();
        this.label = 1;
        Object a = com.ybsdk.feature.divkit.api.dto.a.a(divkitScreen, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
