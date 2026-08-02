package com.yandex.go.taxi.order.details.v2.analytics.perf;

import defpackage.g050;
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
@mvg(c = "com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalyticsTracer$componentCreated$1", f = "RideCardPerfAnalyticsTracer.kt", l = {441}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPerfAnalyticsTracer$componentCreated$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $creationTimestamp;
    final /* synthetic */ long $timeTaken;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPerfAnalyticsTracer$componentCreated$1(a aVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$creationTimestamp = j;
        this.$timeTaken = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardPerfAnalyticsTracer$componentCreated$1(this.this$0, this.$creationTimestamp, this.$timeTaken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardPerfAnalyticsTracer$componentCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        a aVar2;
        long j;
        long j2;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar3 = this.this$0;
            aVar = aVar3.e;
            long j3 = this.$creationTimestamp;
            long j4 = this.$timeTaken;
            this.L$0 = aVar;
            this.L$1 = aVar3;
            this.J$0 = j3;
            this.J$1 = j4;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar2 = aVar3;
            j = j4;
            j2 = j3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = this.J$1;
            long j6 = this.J$0;
            aVar2 = (a) this.L$1;
            ?? r0 = (g050) this.L$0;
            b.b(obj);
            j = j5;
            j2 = j6;
            aVar = r0;
        }
        try {
            r0 r0Var = aVar2.d;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, nlk0.a((nlk0) value, null, null, j2, j, 0L, 0L, null, null, null, null, null, null, 16371)));
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
    }
}
