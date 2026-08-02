package com.yandex.go.taxi.order.common;

import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.fs70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.common.OrderFragmentPresenterDelegate$scheduleOverlayInvalidation$1", f = "OrderFragmentPresenterDelegate.kt", l = {189, 191}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderFragmentPresenterDelegate$scheduleOverlayInvalidation$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $previousHolder;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenterDelegate$scheduleOverlayInvalidation$1(f fVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$previousHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderFragmentPresenterDelegate$scheduleOverlayInvalidation$1(this.this$0, this.$previousHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenterDelegate$scheduleOverlayInvalidation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r1.a(r8, r5, r7) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TaxiOrderPerfTweaksExperiment.DelayType delayType = ((com.yandex.go.taxi.order.perf.experiment.d) this.this$0.t).b().e;
            int i2 = delayType == null ? -1 : com.yandex.go.taxi.order.perf.experiment.c.a[delayType.ordinal()];
            TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : TaxiOrderSessionCheckpoint.LCP : TaxiOrderSessionCheckpoint.LCP_DEFAULTS : TaxiOrderSessionCheckpoint.FCP;
            com.yandex.go.taxi.order.perf.a aVar = this.this$0.u;
            fs70 fs70Var = new fs70(17);
            this.L$0 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        f fVar = this.this$0;
        fVar.C = true;
        n0 n0Var = fVar.D;
        o2y0 o2y0Var = this.$previousHolder;
        this.L$0 = null;
        this.label = 2;
    }
}
