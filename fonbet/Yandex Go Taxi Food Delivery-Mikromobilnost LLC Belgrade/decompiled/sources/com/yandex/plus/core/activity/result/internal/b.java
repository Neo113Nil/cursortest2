package com.yandex.plus.core.activity.result.internal;

import android.app.Activity;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ActivityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1 activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ActivityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1) {
            activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1 = (ActivityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((Activity) obj2) instanceof PlusProxyActivity) {
                            break;
                        }
                    }
                    PlusProxyActivity plusProxyActivity = obj2 instanceof PlusProxyActivity ? (PlusProxyActivity) obj2 : null;
                    if (plusProxyActivity != null) {
                        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.L$0 = null;
                        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.L$1 = null;
                        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.L$2 = null;
                        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.L$3 = null;
                        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.L$4 = null;
                        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(plusProxyActivity, activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1 = new ActivityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityWithResultLauncherImpl$waitForResumedProxyActivity$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
