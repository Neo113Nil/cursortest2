package com.yandex.go.splash.domain;

import defpackage.b400;
import defpackage.bb1;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import java.util.LinkedList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.go.lifecycle.a a;
    public final b400 b;
    public final c c;
    public boolean d;
    public final LinkedList e = new LinkedList();

    public a(tse tseVar, com.yandex.go.lifecycle.a aVar, b400 b400Var, c cVar) {
        this.a = aVar;
        this.b = b400Var;
        this.c = cVar;
        tje.N(tseVar, null, null, new SplashStateActionsHolder$1(this, null), 3);
        tje.N(tseVar, null, null, new SplashStateActionsHolder$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        SplashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1 splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1;
        int i;
        LinkedList linkedList = aVar.e;
        if (continuationImpl instanceof SplashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1) {
            splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1 = (SplashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1) continuationImpl;
            int i2 = splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar.d = true;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                while (!linkedList.isEmpty()) {
                    ((Runnable) linkedList.remove()).run();
                    splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1.label = 1;
                    if (bb1.l0(splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1 = new SplashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1(aVar, continuationImpl);
        Object obj2 = splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashStateActionsHolder$runAndClearOnSplashHiddenTaskQueue$1.label;
        if (i != 0) {
        }
        while (!linkedList.isEmpty()) {
        }
        return zy11.a;
    }
}
