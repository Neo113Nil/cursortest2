package com.ybsdk.feature.dashboard.internal.data;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3Response;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Response;", TarifficatorScenarioActivity.RESULT_KEY, "Lkotlin/Result;", "Lez8;", "<anonymous>", "(Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Response;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardV3Repository$getSingleDashboardV3External$3$1", f = "DashboardV3Repository.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3Repository$getSingleDashboardV3External$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DashboardV3Repository$getSingleDashboardV3External$3$1 dashboardV3Repository$getSingleDashboardV3External$3$1 = new DashboardV3Repository$getSingleDashboardV3External$3$1(2, continuation);
        dashboardV3Repository$getSingleDashboardV3External$3$1.L$0 = obj;
        return dashboardV3Repository$getSingleDashboardV3External$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardV3Repository$getSingleDashboardV3External$3$1) create((DashboardV3Response) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            DashboardV3Response dashboardV3Response = (DashboardV3Response) this.L$0;
            this.label = 1;
            j = com.ybsdk.feature.dashboard.internal.data.mapper.a.j(dashboardV3Response, this);
            if (j == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            j = ((Result) obj).getValue();
        }
        return new Result(j);
    }
}
