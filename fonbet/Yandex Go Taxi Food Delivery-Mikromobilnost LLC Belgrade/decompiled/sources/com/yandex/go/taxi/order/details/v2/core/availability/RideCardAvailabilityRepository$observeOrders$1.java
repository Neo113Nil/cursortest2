package com.yandex.go.taxi.order.details.v2.core.availability;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.kck0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.availability.RideCardAvailabilityRepository$observeOrders$1", f = "RideCardAvailabilityRepository.kt", l = {293}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAvailabilityRepository$observeOrders$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAvailabilityRepository$observeOrders$1(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardAvailabilityRepository$observeOrders$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAvailabilityRepository$observeOrders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(((e0) this.this$0.e).n(), new RideCardAvailabilityRepository$observeOrders$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null));
            kck0 kck0Var = new kck0(this.this$0, i2);
            this.label = 1;
            if (X.collect(kck0Var, this) == coroutineSingletons) {
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
