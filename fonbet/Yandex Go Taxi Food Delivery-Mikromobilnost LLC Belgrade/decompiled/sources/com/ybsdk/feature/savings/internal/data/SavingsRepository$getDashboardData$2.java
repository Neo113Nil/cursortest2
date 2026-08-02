package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.feature.savings.internal.network.dto.SavingsListRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/feature/savings/internal/network/dto/DashboardDataResponseV3;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$getDashboardData$2", f = "SavingsRepository.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$getDashboardData$2 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, String> $additionalData;
    final /* synthetic */ Map<String, String> $headers;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$getDashboardData$2(b bVar, Map map, Map map2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$headers = map;
        this.$additionalData = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsRepository$getDashboardData$2(this.this$0, this.$headers, this.$additionalData, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsRepository$getDashboardData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SavingsApi savingsApi = this.this$0.a;
            Map<String, String> map = this.$headers;
            SavingsListRequest savingsListRequest = new SavingsListRequest(this.$additionalData);
            this.label = 1;
            k = savingsApi.k(map, savingsListRequest, this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            k = ((Result) obj).getValue();
        }
        return new Result(k);
    }
}
