package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.feature.dashboard.internal.domain.entities.DashboardCardInfoEntity;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/ybsdk/feature/dashboard/internal/domain/entities/DashboardCardInfoEntity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardCardRepository$startPolling$2", f = "DashboardCardRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardCardRepository$startPolling$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DashboardCardRepository$startPolling$2 dashboardCardRepository$startPolling$2 = new DashboardCardRepository$startPolling$2(2, continuation);
        dashboardCardRepository$startPolling$2.L$0 = obj;
        return dashboardCardRepository$startPolling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardCardRepository$startPolling$2) create((DashboardCardInfoEntity) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DashboardCardInfoEntity dashboardCardInfoEntity = (DashboardCardInfoEntity) this.L$0;
        boolean z = true;
        if (dashboardCardInfoEntity != null && (dashboardCardInfoEntity.a <= 0 || jl40.l(dashboardCardInfoEntity.e, "REISSUE"))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
