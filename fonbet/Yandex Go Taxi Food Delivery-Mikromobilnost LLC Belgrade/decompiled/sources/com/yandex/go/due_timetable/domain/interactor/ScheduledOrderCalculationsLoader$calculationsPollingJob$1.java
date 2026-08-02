package com.yandex.go.due_timetable.domain.interactor;

import defpackage.b580;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.due_timetable.domain.interactor.ScheduledOrderCalculationsLoader$calculationsPollingJob$1", f = "ScheduledOrderCalculationsLoader.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ScheduledOrderCalculationsLoader$calculationsPollingJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ rsg $daySlot;
    final /* synthetic */ b580 $earlyOption;
    final /* synthetic */ boolean $shouldForceIntercityPreorderFlow;
    final /* synthetic */ boolean $withOndemand;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledOrderCalculationsLoader$calculationsPollingJob$1(b bVar, rsg rsgVar, boolean z, b580 b580Var, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$daySlot = rsgVar;
        this.$withOndemand = z;
        this.$earlyOption = b580Var;
        this.$shouldForceIntercityPreorderFlow = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduledOrderCalculationsLoader$calculationsPollingJob$1(this.this$0, this.$daySlot, this.$withOndemand, this.$earlyOption, this.$shouldForceIntercityPreorderFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduledOrderCalculationsLoader$calculationsPollingJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0056 -> B:5:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        rsg rsgVar;
        boolean z;
        b580 b580Var;
        boolean z2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            rsg rsgVar2 = this.$daySlot;
            boolean z3 = this.$withOndemand;
            bVar = bVar2;
            rsgVar = rsgVar2;
            z = z3;
            b580Var = this.$earlyOption;
            z2 = this.$shouldForceIntercityPreorderFlow;
            if (kotlinx.coroutines.a.p(this.get_context())) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = this.Z$1;
            boolean z5 = this.Z$0;
            b580 b580Var2 = (b580) this.L$2;
            rsg rsgVar3 = (rsg) this.L$1;
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
            ScheduledOrderCalculationsLoader$calculationsPollingJob$1 scheduledOrderCalculationsLoader$calculationsPollingJob$1 = this;
            z2 = z4;
            z = z5;
            b580Var = b580Var2;
            rsgVar = rsgVar3;
            this = scheduledOrderCalculationsLoader$calculationsPollingJob$1;
            if (kotlinx.coroutines.a.p(this.get_context())) {
                this.L$0 = bVar;
                this.L$1 = rsgVar;
                this.L$2 = b580Var;
                this.Z$0 = z;
                this.Z$1 = z2;
                this.label = 1;
                scheduledOrderCalculationsLoader$calculationsPollingJob$1 = this;
                if (b.a(bVar, rsgVar, z, b580Var, z2, scheduledOrderCalculationsLoader$calculationsPollingJob$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this = scheduledOrderCalculationsLoader$calculationsPollingJob$1;
                if (kotlinx.coroutines.a.p(this.get_context())) {
                    return zy11.a;
                }
            }
        }
    }
}
