package com.yandex.go.taxi.order.details.v2.analytics.perf;

import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import defpackage.g050;
import defpackage.h0n;
import defpackage.ie60;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nlk0;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalyticsTracer$submitListEnded$1$1", f = "RideCardPerfAnalyticsTracer.kt", l = {441, 210}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPerfAnalyticsTracer$submitListEnded$1$1 extends SuspendLambda implements wls {
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
    public RideCardPerfAnalyticsTracer$submitListEnded$1$1(a aVar, RideCardState$ProcessingStep rideCardState$ProcessingStep, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$processingStep = rideCardState$ProcessingStep;
        this.$timestamp = j;
        this.$itemSize = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardPerfAnalyticsTracer$submitListEnded$1$1(this.this$0, this.$processingStep, this.$timestamp, this.$itemSize, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardPerfAnalyticsTracer$submitListEnded$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v6, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        long j;
        int i;
        RideCardState$ProcessingStep rideCardState$ProcessingStep;
        ?? r1;
        Object value;
        nlk0 a;
        kotlinx.coroutines.sync.a aVar3;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i2 == 0) {
                b.b(obj);
                aVar = this.this$0;
                aVar2 = aVar.e;
                RideCardState$ProcessingStep rideCardState$ProcessingStep2 = this.$processingStep;
                j = this.$timestamp;
                i = this.$itemSize;
                this.L$0 = aVar2;
                this.L$1 = aVar;
                this.L$2 = rideCardState$ProcessingStep2;
                this.J$0 = j;
                this.I$0 = i;
                this.label = 1;
                if (aVar2.a(this) != coroutineSingletons) {
                    rideCardState$ProcessingStep = rideCardState$ProcessingStep2;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r1 = (g050) this.L$0;
                try {
                    b.b(obj);
                    aVar3 = r1;
                    aVar2 = aVar3;
                    aVar2.d(null);
                    return zy11Var;
                } catch (Throwable th) {
                    th = th;
                    r1.d(null);
                    throw th;
                }
            }
            int i3 = this.I$0;
            long j2 = this.J$0;
            rideCardState$ProcessingStep = (RideCardState$ProcessingStep) this.L$2;
            aVar = (a) this.L$1;
            ?? r10 = (g050) this.L$0;
            b.b(obj);
            i = i3;
            aVar2 = r10;
            j = j2;
            r0 r0Var = aVar.d;
            nlk0 nlk0Var = (nlk0) r0Var.getValue();
            if (nlk0Var.e == 0) {
                aVar.b.c(nlk0Var.a, nlk0Var.b, RideCardPerfAnalytics$FailureReason.ATTACH_TIMESTAMP);
                a.a(aVar);
                aVar2.d(null);
                return zy11Var;
            }
            if (rideCardState$ProcessingStep == RideCardState$ProcessingStep.PROCESSING) {
                if (nlk0Var.i != null) {
                    aVar2.d(null);
                    return zy11Var;
                }
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, nlk0.a((nlk0) value2, null, null, 0L, 0L, 0L, 0L, null, null, new h0n(j, i), null, null, null, 16127)));
            } else if (rideCardState$ProcessingStep == RideCardState$ProcessingStep.READY) {
                if (nlk0Var.l != null) {
                    aVar2.d(null);
                    return zy11Var;
                }
                do {
                    value = r0Var.getValue();
                    a = nlk0.a((nlk0) value, null, null, 0L, 0L, 0L, 0L, null, null, null, null, null, new h0n(j, i), 14335);
                } while (!r0Var.k(value, a));
                this.L$0 = aVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                aVar.a.getClass();
                sjh sjhVar = uyj.a;
                Object k0 = tje.k0(mdh.b.plus(ie60.a), new RideCardPerfAnalyticsTracer$sendReport$2(a, aVar, null), this);
                if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    k0 = zy11Var;
                }
                if (k0 != coroutineSingletons) {
                    aVar3 = aVar2;
                    aVar2 = aVar3;
                }
                return coroutineSingletons;
            }
            aVar2.d(null);
            return zy11Var;
        } catch (Throwable th2) {
            th = th2;
            r1 = aVar2;
            r1.d(null);
            throw th;
        }
    }
}
