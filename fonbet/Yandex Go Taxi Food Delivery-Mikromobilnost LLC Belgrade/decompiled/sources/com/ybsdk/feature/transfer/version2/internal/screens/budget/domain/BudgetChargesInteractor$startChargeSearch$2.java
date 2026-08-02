package com.ybsdk.feature.transfer.version2.internal.screens.budget.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lup6;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.BudgetChargesInteractor$startChargeSearch$2", f = "BudgetChargesInteractor.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BudgetChargesInteractor$startChargeSearch$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $qrString;
    final /* synthetic */ String $uin;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BudgetChargesInteractor$startChargeSearch$2(b bVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uin = str;
        this.$qrString = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BudgetChargesInteractor$startChargeSearch$2 budgetChargesInteractor$startChargeSearch$2 = new BudgetChargesInteractor$startChargeSearch$2(this.this$0, this.$uin, this.$qrString, continuation);
        budgetChargesInteractor$startChargeSearch$2.L$0 = obj;
        return budgetChargesInteractor$startChargeSearch$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BudgetChargesInteractor$startChargeSearch$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.transfer.version2.internal.screens.budget.data.a aVar = this.this$0.a;
            String str2 = this.$uin;
            String str3 = this.$qrString;
            this.label = 1;
            e = aVar.e(str2, str3, str, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
