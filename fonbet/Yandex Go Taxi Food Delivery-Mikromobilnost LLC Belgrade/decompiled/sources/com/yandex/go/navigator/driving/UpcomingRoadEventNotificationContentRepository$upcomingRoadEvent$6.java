package com.yandex.go.navigator.driving;

import com.yandex.go.navigator.incidents.IncidentType;
import defpackage.i650;
import defpackage.m5b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/navigator/driving/DrivingModeNotification;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/navigator/driving/DrivingModeNotification;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6", f = "UpcomingRoadEventNotificationContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6(p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6 upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6 = new UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6(this.this$0, continuation);
        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6.L$0 = obj;
        return upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6 upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6 = (UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6) create((DrivingModeNotification) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$6.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DrivingModeNotification drivingModeNotification = (DrivingModeNotification) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Object payload = drivingModeNotification.getPayload();
        IncidentType incidentType = payload instanceof IncidentType ? (IncidentType) payload : null;
        if (incidentType != null) {
            i650 i650Var = this.this$0.d.a;
            String type = m5b1.g(incidentType).getType();
            i650Var.getClass();
            HashMap hashMap = new HashMap();
            if (type != null) {
                hashMap.put("event_type", type);
            }
            i650Var.a.a("navigation.on_map_interactions.road_events.event_icon.show", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
