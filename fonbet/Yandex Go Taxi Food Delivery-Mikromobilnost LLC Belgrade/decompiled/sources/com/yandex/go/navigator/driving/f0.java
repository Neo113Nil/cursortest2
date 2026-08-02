package com.yandex.go.navigator.driving;

import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.navigation.automotive.UpcomingRoadEvent;
import defpackage.ny61;
import defpackage.pzo;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;

    public f0(vpr vprVar, p0 p0Var) {
        this.a = vprVar;
        this.b = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1 upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof UpcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1) {
            upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1 = (UpcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1) continuation;
            int i2 = upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    UpcomingRoadEvent upcomingRoadEvent = (UpcomingRoadEvent) kotlin.collections.a.R(kotlin.collections.a.x0((List) obj, new pzo(7, this.b)));
                    Event event = upcomingRoadEvent != null ? upcomingRoadEvent.getEvent() : null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.L$0 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.L$1 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.L$2 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.L$3 = null;
                    upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(event, upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1 = new UpcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
