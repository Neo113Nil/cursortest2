package com.ybsdk.feature.dashboard.internal.ui.dashboard;

import com.ybsdk.feature.dashboard.api.model.ProductId;
import defpackage.mvg;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardViewModel$reloadCardState$1", f = "DashboardViewModel.kt", l = {313}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardViewModel$reloadCardState$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ ProductId $productId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$reloadCardState$1(b bVar, ProductId productId, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$productId = productId;
        this.$agreementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardViewModel$reloadCardState$1(this.this$0, this.$productId, this.$agreementId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardViewModel$reloadCardState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.dashboard.internal.domain.interactors.a aVar = this.this$0.L;
            ProductId productId = this.$productId;
            String str = this.$agreementId;
            this.label = 1;
            nbv nbvVar = com.ybsdk.feature.dashboard.internal.domain.interactors.a.f;
            if (aVar.b(productId, str, false, this) == coroutineSingletons) {
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
