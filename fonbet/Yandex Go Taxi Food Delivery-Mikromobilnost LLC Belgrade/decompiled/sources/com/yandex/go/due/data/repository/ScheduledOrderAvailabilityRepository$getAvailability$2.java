package com.yandex.go.due.data.repository;

import com.yandex.go.due.data.api.ScheduledOrderAvailabilityApi;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityResponse;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityResponse;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.due.data.repository.ScheduledOrderAvailabilityRepository$getAvailability$2", f = "ScheduledOrderAvailabilityRepository.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ScheduledOrderAvailabilityRepository$getAvailability$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScheduledOrderAvailabilityRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledOrderAvailabilityRepository$getAvailability$2(a aVar, ScheduledOrderAvailabilityRequest scheduledOrderAvailabilityRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = scheduledOrderAvailabilityRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduledOrderAvailabilityRepository$getAvailability$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduledOrderAvailabilityRepository$getAvailability$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        cmt<ScheduledOrderAvailabilityResponse> a = ((ScheduledOrderAvailabilityApi) this.this$0.j.getValue()).a(this.$request);
        this.label = 1;
        Object a2 = ru.yandex.taxi.network.api.a.a(a, null, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
