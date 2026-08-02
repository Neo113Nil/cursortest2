package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.jlw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xfw;
import defpackage.yfw;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyfw;", "dashboardModel", "Lzy11;", "<anonymous>", "(Lyfw;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3", f = "IntercityDashboardSectionShowRuleInteractorImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3 intercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3 = new IntercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3(this.this$0, continuation);
        intercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3.L$0 = obj;
        return intercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3) create((yfw) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yfw yfwVar = (yfw) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        if (yfwVar.a != null) {
            jlw b = this.this$0.d.b(yfwVar);
            j jVar = this.this$0;
            xfw xfwVar = yfwVar.a;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (j.a(jVar, b, xfwVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
