package com.ybsdk.feature.dashboard.internal.domain.interactors;

import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lx5t;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.domain.interactors.DashboardInteractor$requestData$2$dashboard$1", f = "DashboardInteractor.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardInteractor$requestData$2$dashboard$1 extends SuspendLambda implements wls {
    final /* synthetic */ DashboardScreenParams $screenParams;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardInteractor$requestData$2$dashboard$1(b bVar, DashboardScreenParams dashboardScreenParams, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$screenParams = dashboardScreenParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardInteractor$requestData$2$dashboard$1(this.this$0, this.$screenParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardInteractor$requestData$2$dashboard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.dashboard.internal.data.b bVar = this.this$0.c;
            ProductId productId = this.$screenParams.getProductId();
            String productType = this.$screenParams.getProductType();
            String agreementId = this.$screenParams.getAgreementId();
            this.label = 1;
            a = bVar.a(productId, productType, agreementId, null, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
