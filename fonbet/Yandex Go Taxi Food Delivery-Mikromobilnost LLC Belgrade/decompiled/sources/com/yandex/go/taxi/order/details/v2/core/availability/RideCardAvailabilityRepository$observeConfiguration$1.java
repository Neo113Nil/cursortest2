package com.yandex.go.taxi.order.details.v2.core.availability;

import com.yandex.go.taxi.order.experiments.OnlyV2RideCardExperiment;
import defpackage.dms;
import defpackage.hck0;
import defpackage.kck0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.availability.RideCardAvailabilityRepository$observeConfiguration$1", f = "RideCardAvailabilityRepository.kt", l = {280}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAvailabilityRepository$observeConfiguration$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "touchExploration", "defaults", "a11y", "Lcom/yandex/go/taxi/order/experiments/OnlyV2RideCardExperiment;", "onlyV2Experiment", "Lhck0;", "<anonymous>", "(ZZZLcom/yandex/go/taxi/order/experiments/OnlyV2RideCardExperiment;)Lhck0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.core.availability.RideCardAvailabilityRepository$observeConfiguration$1$3", f = "RideCardAvailabilityRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.core.availability.RideCardAvailabilityRepository$observeConfiguration$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements dms {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        /* synthetic */ boolean Z$2;
        int label;

        @Override // defpackage.dms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            boolean booleanValue3 = ((Boolean) obj3).booleanValue();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(5, (Continuation) obj5);
            anonymousClass3.Z$0 = booleanValue;
            anonymousClass3.Z$1 = booleanValue2;
            anonymousClass3.Z$2 = booleanValue3;
            anonymousClass3.L$0 = (OnlyV2RideCardExperiment) obj4;
            return anonymousClass3.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            boolean z3 = this.Z$2;
            OnlyV2RideCardExperiment onlyV2RideCardExperiment = (OnlyV2RideCardExperiment) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new hck0(z, z2, z3, onlyV2RideCardExperiment);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAvailabilityRepository$observeConfiguration$1(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardAvailabilityRepository$observeConfiguration$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAvailabilityRepository$observeConfiguration$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(com.yandex.go.taxi.order.util.a.a(this.this$0.a.a), new h(ru.yandex.taxi.experiments.d.b((t1b0) this.this$0.b.get())), new j(ru.yandex.taxi.experiments.d.b((t1b0) this.this$0.c.get())), ru.yandex.taxi.experiments.d.b((t1b0) this.this$0.d.get()), new AnonymousClass3(5, null)));
            kck0 kck0Var = new kck0(this.this$0, 0);
            this.label = 1;
            if (t.collect(kck0Var, this) == coroutineSingletons) {
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
