package com.yandex.go.delivery.sdd_slots_selector;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pws0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lnu1;", "alternatives", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "loadingState", "Lpws0;", "<anonymous>", "(Ljava/util/List;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)Lpws0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.sdd_slots_selector.DeliverySddIntervalsPresenter$slotsFlow$1", f = "DeliverySddIntervalsPresenter.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliverySddIntervalsPresenter$slotsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySddIntervalsPresenter$slotsFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliverySddIntervalsPresenter$slotsFlow$1 deliverySddIntervalsPresenter$slotsFlow$1 = new DeliverySddIntervalsPresenter$slotsFlow$1(this.this$0, (Continuation) obj3);
        deliverySddIntervalsPresenter$slotsFlow$1.L$0 = (List) obj;
        deliverySddIntervalsPresenter$slotsFlow$1.L$1 = (PriceUpdate$PriceLoadingState) obj2;
        return deliverySddIntervalsPresenter$slotsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.L$0 = null;
            this.L$1 = priceUpdate$PriceLoadingState;
            this.label = 1;
            obj = a.Kg(aVar, list, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        List list2 = (List) obj;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        return new pws0(list2, priceUpdate$PriceLoadingState != PriceUpdate$PriceLoadingState.LOADED);
    }
}
