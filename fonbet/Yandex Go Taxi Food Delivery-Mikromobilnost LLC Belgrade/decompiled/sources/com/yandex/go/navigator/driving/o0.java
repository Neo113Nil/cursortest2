package com.yandex.go.navigator.driving;

import defpackage.blm;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class o0 implements tpr {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ blm c;
    public final /* synthetic */ blm w;

    public o0(k0 k0Var, p0 p0Var, blm blmVar, blm blmVar2) {
        this.a = k0Var;
        this.b = p0Var;
        this.c = blmVar;
        this.w = blmVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1 upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1;
        int i;
        if (continuation instanceof UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1) {
            upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1 = (UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1) continuation;
            int i2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n0 n0Var = new n0(vprVar, this.b, this.c, this.w);
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.L$0 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.L$1 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.L$2 = null;
                    upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.label = 1;
                    if (this.a.collect(n0Var, upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1 = new UpcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1(this, continuation);
        Object obj2 = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$upcomingRoadEvent$$inlined$mapNotNull$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
