package com.yandex.go.taxi.order.details.v2.state.elements.timeline;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentAnimation;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentImage;
import com.yandex.go.taxi.order.models.api.response.n6;
import defpackage.irs0;
import defpackage.lbk0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sok0;
import defpackage.tcc;
import defpackage.tok0;
import defpackage.tvi0;
import defpackage.ug2;
import defpackage.wls;
import defpackage.xbz0;
import defpackage.xss0;
import defpackage.xuc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsok0;", "optionsData", "Ltok0;", "<anonymous>", "(Lsok0;)Ltok0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.timeline.RideCardTimelineDataSource$stateFlow$1", f = "RideCardTimelineDataSource.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTimelineDataSource$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $currentTimelineItemIndex;
    final /* synthetic */ RideCardItemDto$Timeline $timelineDto;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTimelineDataSource$stateFlow$1(RideCardItemDto$Timeline rideCardItemDto$Timeline, a aVar, Integer num, Continuation continuation) {
        super(2, continuation);
        this.$timelineDto = rideCardItemDto$Timeline;
        this.this$0 = aVar;
        this.$currentTimelineItemIndex = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTimelineDataSource$stateFlow$1 rideCardTimelineDataSource$stateFlow$1 = new RideCardTimelineDataSource$stateFlow$1(this.$timelineDto, this.this$0, this.$currentTimelineItemIndex, continuation);
        rideCardTimelineDataSource$stateFlow$1.L$0 = obj;
        return rideCardTimelineDataSource$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTimelineDataSource$stateFlow$1) create((sok0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        SlotItemDto slotItemDto;
        ArrayList arrayList2;
        String str;
        sok0 sok0Var = (sok0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        xss0 xss0Var = null;
        if (i == 0) {
            b.b(obj);
            List<RideCardItemDto$Timeline.TimelineItem> list = this.$timelineDto.f;
            a aVar = this.this$0;
            ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
            for (RideCardItemDto$Timeline.TimelineItem timelineItem : list) {
                aVar.getClass();
                n6 n6Var = timelineItem.b;
                String a = n6Var instanceof RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentImage ? ((m7x0) aVar.c).a(((RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentImage) n6Var).a) : null;
                if (n6Var instanceof RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentAnimation) {
                    ug2 ug2Var = ((RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentAnimation) n6Var).a;
                    if (ug2Var instanceof tvi0) {
                        str = ((tvi0) ug2Var).a;
                    } else if (ug2Var instanceof xuc) {
                        str = ((xuc) ug2Var).b;
                    }
                    arrayList3.add(new xbz0(timelineItem.a, a, str));
                }
                str = null;
                arrayList3.add(new xbz0(timelineItem.a, a, str));
            }
            RideCardItemDto$Timeline.TimelineInfo timelineInfo = this.$timelineDto.g;
            if (timelineInfo == null || (slotItemDto = timelineInfo.a) == null) {
                arrayList = arrayList3;
                xss0 xss0Var2 = xss0Var;
                RideCardItemDto$Timeline rideCardItemDto$Timeline = this.$timelineDto;
                return new tok0(rideCardItemDto$Timeline.a, rideCardItemDto$Timeline.b, rideCardItemDto$Timeline.d, arrayList, this.$currentTimelineItemIndex.intValue(), xss0Var2, sok0Var);
            }
            a aVar2 = this.this$0;
            irs0 irs0Var = aVar2.a;
            lbk0 lbk0Var = aVar2.b;
            this.L$0 = sok0Var;
            this.L$1 = arrayList3;
            this.L$2 = null;
            this.label = 1;
            obj = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, lbk0Var, false, false, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            arrayList2 = arrayList3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r0 = (List) this.L$1;
            b.b(obj);
            arrayList2 = r0;
        }
        xss0Var = (xss0) obj;
        arrayList = arrayList2;
        xss0 xss0Var22 = xss0Var;
        RideCardItemDto$Timeline rideCardItemDto$Timeline2 = this.$timelineDto;
        return new tok0(rideCardItemDto$Timeline2.a, rideCardItemDto$Timeline2.b, rideCardItemDto$Timeline2.d, arrayList, this.$currentTimelineItemIndex.intValue(), xss0Var22, sok0Var);
    }
}
