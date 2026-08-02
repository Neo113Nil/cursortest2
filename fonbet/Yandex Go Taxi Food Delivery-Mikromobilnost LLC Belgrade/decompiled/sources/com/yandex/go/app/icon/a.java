package com.yandex.go.app.icon;

import com.yandex.go.app.icon.api.AppIcon;
import com.yandex.go.app.icon.experiments.AppDynamicIconExperiment;
import defpackage.gu2;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AppIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1 appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1;
        int i;
        AppIcon appIcon;
        if (continuation instanceof AppIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1) {
            appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1 = (AppIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1) continuation;
            int i2 = appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    AppDynamicIconExperiment appDynamicIconExperiment = (AppDynamicIconExperiment) obj;
                    AppDynamicIconExperiment.DynamicAppIcon dynamicAppIcon = appDynamicIconExperiment.c;
                    if (dynamicAppIcon != null) {
                        if (!appDynamicIconExperiment.b) {
                            dynamicAppIcon = null;
                        }
                        if (dynamicAppIcon != null) {
                            if (gu2.a[dynamicAppIcon.ordinal()] != 1) {
                                w511.b();
                                return null;
                            }
                            appIcon = AppIcon.DEFAULT;
                        }
                    }
                    appIcon = AppIcon.DEFAULT;
                    appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$0 = null;
                    appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$1 = null;
                    appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$2 = null;
                    appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$3 = null;
                    appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(appIcon, appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1) == coroutineSingletons) {
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
        appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1 = new AppIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1(this, continuation);
        Object obj22 = appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appIconLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
