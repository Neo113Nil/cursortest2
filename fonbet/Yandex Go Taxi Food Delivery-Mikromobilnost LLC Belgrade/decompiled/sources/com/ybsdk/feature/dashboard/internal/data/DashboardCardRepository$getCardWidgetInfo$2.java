package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.feature.dashboard.internal.data.dto.GetCardWidgetInfoRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/Card;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardWidgetInfoResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardCardRepository$getCardWidgetInfo$2", f = "DashboardCardRepository.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardCardRepository$getCardWidgetInfo$2 extends SuspendLambda implements tls {
    final /* synthetic */ GetCardWidgetInfoRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardCardRepository$getCardWidgetInfo$2(a aVar, GetCardWidgetInfoRequest getCardWidgetInfoRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = getCardWidgetInfoRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DashboardCardRepository$getCardWidgetInfo$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DashboardCardRepository$getCardWidgetInfo$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            DashboardApi dashboardApi = this.this$0.a;
            GetCardWidgetInfoRequest getCardWidgetInfoRequest = this.$request;
            this.label = 1;
            d = dashboardApi.d(getCardWidgetInfoRequest, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        return new Result(d);
    }
}
