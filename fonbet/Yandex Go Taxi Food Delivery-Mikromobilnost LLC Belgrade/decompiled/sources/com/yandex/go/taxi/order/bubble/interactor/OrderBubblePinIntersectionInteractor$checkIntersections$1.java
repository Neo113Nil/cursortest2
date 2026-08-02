package com.yandex.go.taxi.order.bubble.interactor;

import com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$State;
import com.yandex.go.taxi.order.bubble.g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ro00;
import defpackage.tls;
import defpackage.vxu0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.intersection.Participant;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.interactor.OrderBubblePinIntersectionInteractor$checkIntersections$1", f = "OrderBubblePinIntersectionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderBubblePinIntersectionInteractor$checkIntersections$1 extends SuspendLambda implements tls {
    final /* synthetic */ Map<vxu0, g> $bubbles;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblePinIntersectionInteractor$checkIntersections$1(b bVar, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$bubbles = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderBubblePinIntersectionInteractor$checkIntersections$1(this.this$0, this.$bubbles, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        OrderBubblePinIntersectionInteractor$checkIntersections$1 orderBubblePinIntersectionInteractor$checkIntersections$1 = (OrderBubblePinIntersectionInteractor$checkIntersections$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        orderBubblePinIntersectionInteractor$checkIntersections$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        r2 = r0.E;
        r3 = com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$State.COLLAPSED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r2 != r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        r0.E = r3;
        r0.g();
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        Map<vxu0, g> map = this.$bubbles;
        bVar.getClass();
        for (Map.Entry<vxu0, g> entry : map.entrySet()) {
            vxu0 key = entry.getKey();
            g value = entry.getValue();
            Iterator it = ((ru.yandex.taxi.map_common.map.intersection.a) bVar.a).g(key.d, Participant.ORDER_STYLED_BUBBLES_COLLECTION).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                Participant participant = ((ro00) obj2).b;
                if (participant == Participant.SOURCE_POINT_PIN || participant == Participant.DESTINATION_POINT_PIN || participant == Participant.CHECK_IN_POINT_PIN || participant == Participant.CAR_ICON) {
                    break;
                }
            }
            StyledOrderBubbleViewHolder$State styledOrderBubbleViewHolder$State = value.E;
            StyledOrderBubbleViewHolder$State styledOrderBubbleViewHolder$State2 = StyledOrderBubbleViewHolder$State.EXPANDED;
            if (styledOrderBubbleViewHolder$State != styledOrderBubbleViewHolder$State2 && value.f().o) {
                value.E = styledOrderBubbleViewHolder$State2;
                value.g();
            }
        }
        return zy11.a;
    }
}
