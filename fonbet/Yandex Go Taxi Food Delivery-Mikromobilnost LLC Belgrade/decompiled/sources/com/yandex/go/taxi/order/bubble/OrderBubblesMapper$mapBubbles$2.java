package com.yandex.go.taxi.order.bubble;

import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Ltl6;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.OrderBubblesMapper$mapBubbles$2", f = "OrderBubblesMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderBubblesMapper$mapBubbles$2 extends SuspendLambda implements wls {
    final /* synthetic */ float $currentZoom;
    final /* synthetic */ DriveState $driveState;
    final /* synthetic */ Map<String, String> $keySet;
    final /* synthetic */ List<RouteInfo.Position> $positions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesMapper$mapBubbles$2(List list, b bVar, Map map, DriveState driveState, float f, Continuation continuation) {
        super(2, continuation);
        this.$positions = list;
        this.this$0 = bVar;
        this.$keySet = map;
        this.$driveState = driveState;
        this.$currentZoom = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderBubblesMapper$mapBubbles$2 orderBubblesMapper$mapBubbles$2 = new OrderBubblesMapper$mapBubbles$2(this.$positions, this.this$0, this.$keySet, this.$driveState, this.$currentZoom, continuation);
        orderBubblesMapper$mapBubbles$2.L$0 = obj;
        return orderBubblesMapper$mapBubbles$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderBubblesMapper$mapBubbles$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<RouteInfo.Position> list = this.$positions;
            b bVar = this.this$0;
            Map<String, String> map = this.$keySet;
            DriveState driveState = this.$driveState;
            float f = this.$currentZoom;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new OrderBubblesMapper$mapBubbles$2$1$1(bVar, (RouteInfo.Position) it.next(), map, driveState, f, null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return kotlin.collections.a.M((Iterable) obj);
    }
}
