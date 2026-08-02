package com.yandex.go.taxi.order.details.v2.analytics.perf;

import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import defpackage.g050;
import defpackage.h0n;
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
@mvg(c = "com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalyticsTracer$submitListStarted$1$1", f = "RideCardPerfAnalyticsTracer.kt", l = {441}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPerfAnalyticsTracer$submitListStarted$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $itemSize;
    final /* synthetic */ RideCardState$ProcessingStep $processingStep;
    final /* synthetic */ long $timestamp;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPerfAnalyticsTracer$submitListStarted$1$1(a aVar, RideCardState$ProcessingStep rideCardState$ProcessingStep, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$processingStep = rideCardState$ProcessingStep;
        this.$timestamp = j;
        this.$itemSize = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardPerfAnalyticsTracer$submitListStarted$1$1(this.this$0, this.$processingStep, this.$timestamp, this.$itemSize, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardPerfAnalyticsTracer$submitListStarted$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        RideCardState$ProcessingStep rideCardState$ProcessingStep;
        long j;
        int i;
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            aVar = this.this$0;
            aVar2 = aVar.e;
            rideCardState$ProcessingStep = this.$processingStep;
            j = this.$timestamp;
            int i3 = this.$itemSize;
            this.L$0 = aVar2;
            this.L$1 = aVar;
            this.L$2 = rideCardState$ProcessingStep;
            this.J$0 = j;
            this.I$0 = i3;
            this.label = 1;
            if (aVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            long j2 = this.J$0;
            rideCardState$ProcessingStep = (RideCardState$ProcessingStep) this.L$2;
            aVar = (a) this.L$1;
            ?? r0 = (g050) this.L$0;
            b.b(obj);
            j = j2;
            aVar2 = r0;
        }
        try {
            r0 r0Var = aVar.d;
            nlk0 nlk0Var = (nlk0) r0Var.getValue();
            long j3 = nlk0Var.e;
            zy11 zy11Var = zy11.a;
            if (j3 == 0) {
                aVar.b.c(nlk0Var.a, nlk0Var.b, RideCardPerfAnalytics$FailureReason.ATTACH_TIMESTAMP);
                a.a(aVar);
                return zy11Var;
            }
            if (rideCardState$ProcessingStep == RideCardState$ProcessingStep.PROCESSING) {
                if (nlk0Var.h != null) {
                    return zy11Var;
                }
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, nlk0.a((nlk0) value2, null, null, 0L, 0L, 0L, 0L, null, new h0n(j, i), null, null, null, null, 16255)));
            } else if (rideCardState$ProcessingStep == RideCardState$ProcessingStep.READY) {
                if (nlk0Var.k != null) {
                    return zy11Var;
                }
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, nlk0.a((nlk0) value, null, null, 0L, 0L, 0L, 0L, null, null, null, null, new h0n(j, i), null, 15359)));
            }
            return zy11Var;
        } finally {
            aVar2.d(null);
        }
    }
}
