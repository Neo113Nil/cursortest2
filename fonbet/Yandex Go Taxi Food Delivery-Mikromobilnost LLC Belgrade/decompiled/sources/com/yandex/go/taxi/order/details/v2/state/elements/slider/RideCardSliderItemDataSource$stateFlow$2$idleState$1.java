package com.yandex.go.taxi.order.details.v2.state.elements.slider;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Slider;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Link0;", "<anonymous>", "(Ltse;)Link0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.slider.RideCardSliderItemDataSource$stateFlow$2$idleState$1", f = "RideCardSliderItemDataSource.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardSliderItemDataSource$stateFlow$2$idleState$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$Slider $item;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardSliderItemDataSource$stateFlow$2$idleState$1(a aVar, RideCardItemDto$Slider rideCardItemDto$Slider, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = rideCardItemDto$Slider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardSliderItemDataSource$stateFlow$2$idleState$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardSliderItemDataSource$stateFlow$2$idleState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
        List list = this.$item.c.a;
        this.label = 1;
        aVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((RideCardItemDto$Slider.StateInfo.State) obj2).a == RideCardItemDto$Slider.StateInfo.StateType.ACTIVE) {
                break;
            }
        }
        RideCardItemDto$Slider.StateInfo.State state = (RideCardItemDto$Slider.StateInfo.State) obj2;
        Object a = state != null ? aVar.a(state, this) : null;
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
