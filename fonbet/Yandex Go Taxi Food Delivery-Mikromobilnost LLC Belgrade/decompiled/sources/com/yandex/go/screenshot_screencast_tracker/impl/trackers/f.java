package com.yandex.go.screenshot_screencast_tracker.impl.trackers;

import android.net.Uri;
import android.os.SystemClock;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScreenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1 screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof ScreenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1) {
            screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1 = (ScreenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1) continuation;
            int i2 = screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair((Uri) obj, new Long(SystemClock.elapsedRealtime()));
                    screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.L$0 = null;
                    screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.L$1 = null;
                    screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.L$2 = null;
                    screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.L$3 = null;
                    screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(pair, screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons) {
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
        screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1 = new ScreenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
        Object obj22 = screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = screenshotTracker$start$1$invokeSuspend$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
