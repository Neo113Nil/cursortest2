package com.yandex.go.taxi.order.details.v2.analytics.perf;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.h0n;
import defpackage.mlk0;
import defpackage.mvg;
import defpackage.nlk0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalyticsTracer$sendReport$2", f = "RideCardPerfAnalyticsTracer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPerfAnalyticsTracer$sendReport$2 extends SuspendLambda implements wls {
    final /* synthetic */ nlk0 $reportableState;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPerfAnalyticsTracer$sendReport$2(nlk0 nlk0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$reportableState = nlk0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardPerfAnalyticsTracer$sendReport$2(this.$reportableState, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardPerfAnalyticsTracer$sendReport$2 rideCardPerfAnalyticsTracer$sendReport$2 = (RideCardPerfAnalyticsTracer$sendReport$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardPerfAnalyticsTracer$sendReport$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        nlk0 nlk0Var = this.$reportableState;
        RideCardPresentationType rideCardPresentationType = nlk0Var.b;
        String str = nlk0Var.a;
        zy11 zy11Var = zy11.a;
        if (rideCardPresentationType == null) {
            this.this$0.b.c(str, null, RideCardPerfAnalytics$FailureReason.PRESENTATION);
            a.a(this.this$0);
            return zy11Var;
        }
        long j = nlk0Var.c;
        if (j == 0) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.COMPONENT_CREATION_TIMESTAMP);
            a.a(this.this$0);
            return zy11Var;
        }
        long j2 = nlk0Var.d;
        if (j2 == 0) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.COMPONENT_CREATION_TIME);
            a.a(this.this$0);
            return zy11Var;
        }
        long j3 = nlk0Var.e;
        if (j3 == 0) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.ATTACH_TIMESTAMP);
            a.a(this.this$0);
            return zy11Var;
        }
        long j4 = nlk0Var.f;
        if (j4 == 0) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.START_STATE_PROCESSING_TIMESTAMP);
            a.a(this.this$0);
            return zy11Var;
        }
        h0n h0nVar = nlk0Var.g;
        if (h0nVar == null) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.STATE_PROCESSING_RECORD);
            a.a(this.this$0);
            return zy11Var;
        }
        long j5 = h0nVar.b;
        h0n h0nVar2 = nlk0Var.h;
        if (h0nVar2 == null) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.FIRST_SUBMIT_RECORD_START);
            a.a(this.this$0);
            return zy11Var;
        }
        h0n h0nVar3 = nlk0Var.i;
        if (h0nVar3 == null) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.FIRST_SUBMIT_RECORD_END);
            a.a(this.this$0);
            return zy11Var;
        }
        int i = h0nVar3.a;
        h0n h0nVar4 = nlk0Var.j;
        if (h0nVar4 == null) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.STATE_READY_RECORD);
            a.a(this.this$0);
            return zy11Var;
        }
        h0n h0nVar5 = nlk0Var.k;
        if (h0nVar5 == null) {
            this.this$0.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.LAST_SUBMIT_RECORD_START);
            a.a(this.this$0);
            return zy11Var;
        }
        h0n h0nVar6 = nlk0Var.l;
        a aVar = this.this$0;
        if (h0nVar6 == null) {
            aVar.b.c(str, rideCardPresentationType, RideCardPerfAnalytics$FailureReason.LAST_SUBMIT_RECORD_END);
            a.a(this.this$0);
            return zy11Var;
        }
        int i2 = h0nVar6.a;
        mlk0 mlk0Var = aVar.b;
        mlk0Var.getClass();
        mlk0Var.b(j2, mlk0.a(rideCardPresentationType, "Creating"));
        mlk0Var.b(j4 - j3, mlk0.a(rideCardPresentationType, "SSP"));
        mlk0Var.b(j5 - j3, mlk0.a(rideCardPresentationType, "SE.Processing"));
        String a = mlk0.a(rideCardPresentationType, "Render.Short." + i);
        long j6 = h0nVar3.b;
        mlk0Var.b(j6 - j, a);
        mlk0Var.b(j6 - h0nVar2.b, mlk0.a(rideCardPresentationType, "Render.Submit.Processing." + i));
        mlk0Var.b(h0nVar4.b - j5, mlk0.a(rideCardPresentationType, "SE.Ready." + h0nVar4.a));
        String a2 = mlk0.a(rideCardPresentationType, "Render.Submit.Ready." + i2);
        long j7 = h0nVar6.b;
        mlk0Var.b(j7 - h0nVar5.b, a2);
        mlk0Var.b(j7 - j, mlk0.a(rideCardPresentationType, "Render.Long." + i2));
        r0 r0Var = this.this$0.d;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, nlk0.a((nlk0) value, null, null, 0L, 0L, 0L, 0L, null, null, null, null, null, null, 8191)));
        return zy11Var;
    }
}
