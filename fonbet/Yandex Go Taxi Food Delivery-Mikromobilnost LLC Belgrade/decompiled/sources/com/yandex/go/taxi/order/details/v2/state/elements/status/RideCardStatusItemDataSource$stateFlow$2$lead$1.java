package com.yandex.go.taxi.order.details.v2.state.elements.status;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.irs0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgss0;", "<anonymous>", "(Ltse;)Lgss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.status.RideCardStatusItemDataSource$stateFlow$2$lead$1", f = "RideCardStatusItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardStatusItemDataSource$stateFlow$2$lead$1 extends SuspendLambda implements wls {
    final /* synthetic */ SlotItemDto $slotItemDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardStatusItemDataSource$stateFlow$2$lead$1(a aVar, SlotItemDto slotItemDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$slotItemDto = slotItemDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardStatusItemDataSource$stateFlow$2$lead$1(this.this$0, this.$slotItemDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardStatusItemDataSource$stateFlow$2$lead$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return irs0.a(this.this$0.a, this.$slotItemDto.c, null, 6);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
