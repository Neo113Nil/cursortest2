package com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search;

import com.yandex.go.slot.dto.SlotItemBodyDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrs0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timerString", "Lcss0;", "<anonymous>", "(Ljava/lang/String;)Lcss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.RideCardCompanionBufferSearchItemDataSource$getBodyFlow$1", f = "RideCardCompanionBufferSearchItemDataSource.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionBufferSearchItemDataSource$getBodyFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<SlotItemBodyDto> $body;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionBufferSearchItemDataSource$getBodyFlow$1(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$body = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCompanionBufferSearchItemDataSource$getBodyFlow$1 rideCardCompanionBufferSearchItemDataSource$getBodyFlow$1 = new RideCardCompanionBufferSearchItemDataSource$getBodyFlow$1(this.this$0, this.$body, continuation);
        rideCardCompanionBufferSearchItemDataSource$getBodyFlow$1.L$0 = obj;
        return rideCardCompanionBufferSearchItemDataSource$getBodyFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompanionBufferSearchItemDataSource$getBodyFlow$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        irs0 irs0Var = this.this$0.a;
        ArrayList b = qrs0.b("$TIMER$", str, this.$body);
        this.L$0 = null;
        this.label = 1;
        Object k = ((com.yandex.go.slot.mapper.a) irs0Var).k(b, null, this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
