package com.yandex.go.navigator.driving;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class h0 implements vpr {
    public final /* synthetic */ vpr a;

    public h0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1 upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1) {
            upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1 = (UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1) continuation;
            int i2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Number) ((Pair) obj).getSecond()).floatValue() < 500.0f) {
                        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.L$0 = null;
                        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.L$1 = null;
                        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.L$2 = null;
                        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.L$3 = null;
                        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1 = new UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
