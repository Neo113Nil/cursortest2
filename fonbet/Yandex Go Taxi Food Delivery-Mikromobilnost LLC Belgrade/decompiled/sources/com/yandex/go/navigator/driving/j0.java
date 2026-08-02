package com.yandex.go.navigator.driving;

import com.yandex.mapkit.directions.driving.Event;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class j0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;

    public j0(vpr vprVar, p0 p0Var) {
        this.a = vprVar;
        this.b = p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1 upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        if (continuation instanceof UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1) {
            upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1 = (UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1) continuation;
            int i2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String eventId = ((Event) obj).getEventId();
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$0 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$1 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$2 = obj;
                    vpr vprVar2 = this.a;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$3 = vprVar2;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$4 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$5 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.label = 1;
                    obj2 = p0.b(this.b, eventId, upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$3;
                obj = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$2;
                kotlin.b.b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$0 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$1 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$2 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$3 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$4 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.L$5 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1 = new UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1(this, continuation);
        obj2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filterNot$1$2$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return zy11.a;
    }
}
