package com.yandex.go.taxi.order.details.v2.state.elements.status;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqs0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltss0;", "<anonymous>", "(Ltse;)Ltss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.status.RideCardStatusItemDataSource$stateFlow$2$trail$1", f = "RideCardStatusItemDataSource.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardStatusItemDataSource$stateFlow$2$trail$1 extends SuspendLambda implements wls {
    final /* synthetic */ SlotItemDto $slotItemDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardStatusItemDataSource$stateFlow$2$trail$1(a aVar, SlotItemDto slotItemDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$slotItemDto = slotItemDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardStatusItemDataSource$stateFlow$2$trail$1(this.this$0, this.$slotItemDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardStatusItemDataSource$stateFlow$2$trail$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        irs0 irs0Var = aVar.a;
        List list = this.$slotItemDto.e;
        sqs0 sqs0Var = aVar.b;
        this.label = 1;
        Object b = irs0.b(irs0Var, list, sqs0Var, false, this, 12);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
