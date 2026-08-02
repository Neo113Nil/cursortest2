package com.ybsdk.feature.savings.internal.interactors.v4;

import defpackage.lam0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rt1;
import defpackage.sya1;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llam0;", "", "<anonymous>", "(Llam0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.v4.SavingsDashboardInteractorV4$pollDashboard$2", f = "SavingsDashboardInteractorV4.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardInteractorV4$pollDashboard$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardInteractorV4$pollDashboard$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsDashboardInteractorV4$pollDashboard$2 savingsDashboardInteractorV4$pollDashboard$2 = new SavingsDashboardInteractorV4$pollDashboard$2(this.this$0, continuation);
        savingsDashboardInteractorV4$pollDashboard$2.L$0 = obj;
        return savingsDashboardInteractorV4$pollDashboard$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardInteractorV4$pollDashboard$2) create((lam0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean c = sya1.c(((lam0) this.L$0).d);
        Boolean valueOf = Boolean.valueOf(c);
        rt1 rt1Var = this.this$0.c.f0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("isTerminated", Boolean.valueOf(c));
        rt1Var.a.a("savings.dashboard.polling.data_updated", linkedHashMap);
        return valueOf;
    }
}
