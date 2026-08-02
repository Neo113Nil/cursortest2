package com.yandex.go.platform.js_api;

import defpackage.ci41;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class c {
    public final ci41 a;
    public final n0 b = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);

    public c(ci41 ci41Var) {
        this.a = ci41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        JsAppLifecycle$waitUntilWebViewReady$1 jsAppLifecycle$waitUntilWebViewReady$1;
        int i;
        if (continuationImpl instanceof JsAppLifecycle$waitUntilWebViewReady$1) {
            jsAppLifecycle$waitUntilWebViewReady$1 = (JsAppLifecycle$waitUntilWebViewReady$1) continuationImpl;
            int i2 = jsAppLifecycle$waitUntilWebViewReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsAppLifecycle$waitUntilWebViewReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsAppLifecycle$waitUntilWebViewReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsAppLifecycle$waitUntilWebViewReady$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    JsAppLifecycle$waitUntilWebViewReady$2 jsAppLifecycle$waitUntilWebViewReady$2 = new JsAppLifecycle$waitUntilWebViewReady$2(2, null);
                    jsAppLifecycle$waitUntilWebViewReady$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(this.b, jsAppLifecycle$waitUntilWebViewReady$2, jsAppLifecycle$waitUntilWebViewReady$1) == coroutineSingletons) {
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
        jsAppLifecycle$waitUntilWebViewReady$1 = new JsAppLifecycle$waitUntilWebViewReady$1(this, continuationImpl);
        Object obj2 = jsAppLifecycle$waitUntilWebViewReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsAppLifecycle$waitUntilWebViewReady$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
