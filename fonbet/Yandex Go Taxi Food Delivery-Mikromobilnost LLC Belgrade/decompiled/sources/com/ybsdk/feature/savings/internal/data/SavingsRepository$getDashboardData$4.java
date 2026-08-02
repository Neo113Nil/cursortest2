package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.feature.savings.internal.network.SavingsApi;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/feature/savings/internal/network/dto/DashboardDataResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$getDashboardData$4", f = "SavingsRepository.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$getDashboardData$4 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, String> $headers;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$getDashboardData$4(b bVar, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$headers = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsRepository$getDashboardData$4(this.this$0, this.$headers, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsRepository$getDashboardData$4) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SavingsApi savingsApi = this.this$0.a;
            Map<String, String> map = this.$headers;
            this.label = 1;
            a = savingsApi.a(map, this);
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
