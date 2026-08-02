package com.yandex.go.navigator.driving;

import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.geometry.Point;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/yandex/mapkit/directions/driving/Event;", "", "position", "Lcom/yandex/mapkit/geometry/Point;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.driving.UpcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1", f = "UpcomingRoadEventNotificationContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UpcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1 upcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1 = new UpcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1(3, (Continuation) obj3);
        upcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1.L$0 = (Point) obj;
        upcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1.L$1 = (Event) obj2;
        return upcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Point point = (Point) this.L$0;
        Event event = (Event) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return event != null ? new Pair(event, new Float(ru.yandex.taxi.map.utils.a.i(point.getLatitude(), point.getLongitude(), event.getLocation().getLatitude(), event.getLocation().getLongitude()))) : new Pair(null, new Float(0.0f));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
