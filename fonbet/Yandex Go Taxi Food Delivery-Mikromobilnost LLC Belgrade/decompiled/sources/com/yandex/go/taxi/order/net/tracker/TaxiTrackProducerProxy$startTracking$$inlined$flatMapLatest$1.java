package com.yandex.go.taxi.order.net.tracker;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oby0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.way0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.net.tracker.TaxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1", f = "TaxiTrackProducerProxy.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ oby0 $movementConfig$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1(Continuation continuation, oby0 oby0Var) {
        super(3, continuation);
        this.$movementConfig$inlined = oby0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1 taxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1 = new TaxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1((Continuation) obj3, this.$movementConfig$inlined);
        taxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        taxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1.L$1 = obj2;
        return taxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr N3 = ((way0) obj2).N3(this.$movementConfig$inlined);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(N3, vprVar, this) == coroutineSingletons) {
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
