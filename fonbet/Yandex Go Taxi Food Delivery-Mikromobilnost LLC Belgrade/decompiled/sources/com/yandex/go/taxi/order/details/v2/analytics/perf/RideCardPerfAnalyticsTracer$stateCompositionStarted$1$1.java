package com.yandex.go.taxi.order.details.v2.analytics.perf;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
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
@mvg(c = "com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalyticsTracer$stateCompositionStarted$1$1", f = "RideCardPerfAnalyticsTracer.kt", l = {441}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPerfAnalyticsTracer$stateCompositionStarted$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ RideCardPresentationType $presentationType;
    final /* synthetic */ long $timestamp;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPerfAnalyticsTracer$stateCompositionStarted$1$1(a aVar, String str, RideCardPresentationType rideCardPresentationType, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
        this.$presentationType = rideCardPresentationType;
        this.$timestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardPerfAnalyticsTracer$stateCompositionStarted$1$1(this.this$0, this.$orderId, this.$presentationType, this.$timestamp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardPerfAnalyticsTracer$stateCompositionStarted$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        String str;
        RideCardPresentationType rideCardPresentationType;
        long j;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            aVar2 = aVar.e;
            str = this.$orderId;
            rideCardPresentationType = this.$presentationType;
            long j2 = this.$timestamp;
            this.L$0 = aVar2;
            this.L$1 = aVar;
            this.L$2 = str;
            this.L$3 = rideCardPresentationType;
            this.J$0 = j2;
            this.label = 1;
            if (aVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = j2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = this.J$0;
            RideCardPresentationType rideCardPresentationType2 = (RideCardPresentationType) this.L$3;
            str = (String) this.L$2;
            aVar = (a) this.L$1;
            ?? r0 = (g050) this.L$0;
            b.b(obj);
            j = j3;
            rideCardPresentationType = rideCardPresentationType2;
            aVar2 = r0;
        }
        a aVar3 = aVar;
        String str2 = str;
        try {
            r0 r0Var = aVar3.d;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, nlk0.a((nlk0) value, str2, rideCardPresentationType, 0L, 0L, 0L, j, null, null, null, null, null, null, 16348)));
            aVar2.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar2.d(null);
            throw th;
        }
    }
}
