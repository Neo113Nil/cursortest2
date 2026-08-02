package com.yandex.mob.domain;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.AvailabilityReportUseCase$schedulePeriodicChecks$2", f = "AvailabilityReportUseCase.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class AvailabilityReportUseCase$schedulePeriodicChecks$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailabilityReportUseCase$schedulePeriodicChecks$2(d dVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AvailabilityReportUseCase$schedulePeriodicChecks$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AvailabilityReportUseCase$schedulePeriodicChecks$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName = MobAvailabilityCheckStrategyName.AllInList;
            MobTrigger mobTrigger = MobTrigger.Periodic;
            this.label = 1;
            if (d.a(dVar, mobAvailabilityCheckStrategyName, mobTrigger, false, false, this) == coroutineSingletons) {
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
