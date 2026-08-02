package com.yandex.go.lifecycle;

import defpackage.bvf0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class a {
    public final r0 a;
    public final r0 b;

    public a() {
        Boolean bool = Boolean.FALSE;
        this.a = bvf0.c(bool);
        this.b = bvf0.c(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AppStartupCallbacksImpl$waitOnFirstFrameDrawn$1 appStartupCallbacksImpl$waitOnFirstFrameDrawn$1;
        int i;
        if (continuationImpl instanceof AppStartupCallbacksImpl$waitOnFirstFrameDrawn$1) {
            appStartupCallbacksImpl$waitOnFirstFrameDrawn$1 = (AppStartupCallbacksImpl$waitOnFirstFrameDrawn$1) continuationImpl;
            int i2 = appStartupCallbacksImpl$waitOnFirstFrameDrawn$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appStartupCallbacksImpl$waitOnFirstFrameDrawn$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appStartupCallbacksImpl$waitOnFirstFrameDrawn$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appStartupCallbacksImpl$waitOnFirstFrameDrawn$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AppStartupCallbacksImpl$waitOnFirstFrameDrawn$2 appStartupCallbacksImpl$waitOnFirstFrameDrawn$2 = new AppStartupCallbacksImpl$waitOnFirstFrameDrawn$2(2, null);
                    appStartupCallbacksImpl$waitOnFirstFrameDrawn$1.label = 1;
                    if (e.x(this.a, appStartupCallbacksImpl$waitOnFirstFrameDrawn$2, appStartupCallbacksImpl$waitOnFirstFrameDrawn$1) == coroutineSingletons) {
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
        appStartupCallbacksImpl$waitOnFirstFrameDrawn$1 = new AppStartupCallbacksImpl$waitOnFirstFrameDrawn$1(this, continuationImpl);
        Object obj2 = appStartupCallbacksImpl$waitOnFirstFrameDrawn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appStartupCallbacksImpl$waitOnFirstFrameDrawn$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AppStartupCallbacksImpl$waitOnFullyDrawn$1 appStartupCallbacksImpl$waitOnFullyDrawn$1;
        int i;
        if (continuationImpl instanceof AppStartupCallbacksImpl$waitOnFullyDrawn$1) {
            appStartupCallbacksImpl$waitOnFullyDrawn$1 = (AppStartupCallbacksImpl$waitOnFullyDrawn$1) continuationImpl;
            int i2 = appStartupCallbacksImpl$waitOnFullyDrawn$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appStartupCallbacksImpl$waitOnFullyDrawn$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appStartupCallbacksImpl$waitOnFullyDrawn$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appStartupCallbacksImpl$waitOnFullyDrawn$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AppStartupCallbacksImpl$waitOnFullyDrawn$2 appStartupCallbacksImpl$waitOnFullyDrawn$2 = new AppStartupCallbacksImpl$waitOnFullyDrawn$2(2, null);
                    appStartupCallbacksImpl$waitOnFullyDrawn$1.label = 1;
                    if (e.x(this.b, appStartupCallbacksImpl$waitOnFullyDrawn$2, appStartupCallbacksImpl$waitOnFullyDrawn$1) == coroutineSingletons) {
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
        appStartupCallbacksImpl$waitOnFullyDrawn$1 = new AppStartupCallbacksImpl$waitOnFullyDrawn$1(this, continuationImpl);
        Object obj2 = appStartupCallbacksImpl$waitOnFullyDrawn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appStartupCallbacksImpl$waitOnFullyDrawn$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
