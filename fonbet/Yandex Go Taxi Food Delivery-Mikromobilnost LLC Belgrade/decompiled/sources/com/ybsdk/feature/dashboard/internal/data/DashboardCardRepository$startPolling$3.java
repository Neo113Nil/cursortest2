package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.feature.dashboard.api.model.ProductId;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/feature/dashboard/internal/domain/entities/DashboardCardInfoEntity;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardCardRepository$startPolling$3", f = "DashboardCardRepository.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardCardRepository$startPolling$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ ProductId $productId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardCardRepository$startPolling$3(a aVar, ProductId productId, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$productId = productId;
        this.$agreementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DashboardCardRepository$startPolling$3 dashboardCardRepository$startPolling$3 = new DashboardCardRepository$startPolling$3(this.this$0, this.$productId, this.$agreementId, continuation);
        dashboardCardRepository$startPolling$3.I$0 = ((tq11) obj).a;
        return dashboardCardRepository$startPolling$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        DashboardCardRepository$startPolling$3 dashboardCardRepository$startPolling$3 = new DashboardCardRepository$startPolling$3(this.this$0, this.$productId, this.$agreementId, (Continuation) obj2);
        dashboardCardRepository$startPolling$3.I$0 = i;
        return dashboardCardRepository$startPolling$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            a aVar = this.this$0;
            ProductId productId = this.$productId;
            String str = this.$agreementId;
            this.label = 1;
            b = aVar.b(productId, str, i2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
