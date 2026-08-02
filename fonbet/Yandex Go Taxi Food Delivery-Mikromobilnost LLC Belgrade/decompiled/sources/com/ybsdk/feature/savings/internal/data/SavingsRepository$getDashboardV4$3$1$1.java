package com.ybsdk.feature.savings.internal.data;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.savings.internal.mapper.c;
import com.ybsdk.feature.savings.internal.network.dto.v4.SavingsDashboardV4Response;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsDashboardV4Response;", TarifficatorScenarioActivity.RESULT_KEY, "Llam0;", "<anonymous>", "(Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsDashboardV4Response;)Llam0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$getDashboardV4$3$1$1", f = "SavingsRepository.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$getDashboardV4$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$getDashboardV4$3$1$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsRepository$getDashboardV4$3$1$1 savingsRepository$getDashboardV4$3$1$1 = new SavingsRepository$getDashboardV4$3$1$1(this.this$0, continuation);
        savingsRepository$getDashboardV4$3$1$1.L$0 = obj;
        return savingsRepository$getDashboardV4$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsRepository$getDashboardV4$3$1$1) create((SavingsDashboardV4Response) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SavingsDashboardV4Response savingsDashboardV4Response = (SavingsDashboardV4Response) this.L$0;
        c cVar = this.this$0.e;
        this.label = 1;
        Object a = cVar.a(savingsDashboardV4Response, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
