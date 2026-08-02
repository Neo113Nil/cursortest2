package com.yandex.go.navigator.driving;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class t implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ w b;

    public t(jqr jqrVar, w wVar) {
        this.a = jqrVar;
        this.b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1 drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1) {
            drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1 = (DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1) continuation;
            int i2 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s sVar = new s(vprVar, this.b);
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.L$0 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.L$1 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.L$2 = null;
                    drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(sVar, drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1 = new DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
