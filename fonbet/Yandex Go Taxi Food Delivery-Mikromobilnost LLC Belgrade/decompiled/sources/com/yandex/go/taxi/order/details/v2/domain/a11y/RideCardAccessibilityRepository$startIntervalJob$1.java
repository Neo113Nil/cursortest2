package com.yandex.go.taxi.order.details.v2.domain.a11y;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.bvf0;
import defpackage.k8k0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.q8k0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardAccessibilityRepository$startIntervalJob$1", f = "RideCardAccessibilityRepository.kt", l = {177, 179}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccessibilityRepository$startIntervalJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $announceImmediately;
    final /* synthetic */ k8k0 $interval;
    final /* synthetic */ RideCardPresentationType $presentation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAccessibilityRepository$startIntervalJob$1(boolean z, e eVar, k8k0 k8k0Var, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.$announceImmediately = z;
        this.this$0 = eVar;
        this.$interval = k8k0Var;
        this.$presentation = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAccessibilityRepository$startIntervalJob$1 rideCardAccessibilityRepository$startIntervalJob$1 = new RideCardAccessibilityRepository$startIntervalJob$1(this.$announceImmediately, this.this$0, this.$interval, this.$presentation, continuation);
        rideCardAccessibilityRepository$startIntervalJob$1.L$0 = obj;
        return rideCardAccessibilityRepository$startIntervalJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAccessibilityRepository$startIntervalJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r8) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:6:0x006e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (bvf0.D(tseVar)) {
                q8k0 q8k0Var = this.this$0.a;
                k8k0 k8k0Var = this.$interval;
                pz40 pz40Var = (pz40) q8k0Var.a.get(this.$presentation);
                if (pz40Var != null) {
                    do {
                        r0Var2 = (r0) pz40Var;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, kotlin.collections.a.o0((List) value2, k8k0Var)));
                }
                while (bvf0.D(tseVar)) {
                }
            }
            return zy11.a;
        }
        kotlin.b.b(obj);
        while (bvf0.D(tseVar)) {
            if (this.$announceImmediately) {
                q8k0 q8k0Var2 = this.this$0.a;
                k8k0 k8k0Var2 = this.$interval;
                pz40 pz40Var2 = (pz40) q8k0Var2.a.get(this.$presentation);
                if (pz40Var2 != null) {
                    do {
                        r0Var = (r0) pz40Var2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, kotlin.collections.a.o0((List) value, k8k0Var2)));
                }
                long j = this.$interval.c;
                this.L$0 = tseVar;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                }
            } else {
                long j2 = this.$interval.c;
                this.L$0 = tseVar;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        return zy11.a;
    }
}
