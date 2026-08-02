package com.yandex.fintechsdk.flows.applink.payment.internal.di.redirecthost.features.splash;

import defpackage.mqt0;
import defpackage.ny61;
import defpackage.zu41;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a implements mqt0 {
    public final String a;
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.a b;
    public final zu41 c;

    public a(String str, com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar, zu41 zu41Var) {
        this.a = str;
        this.b = aVar;
        this.c = zu41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.mqt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RedirectHostSplashDataPreloaderImpl$preloadData$1 redirectHostSplashDataPreloaderImpl$preloadData$1;
        int i;
        Object b;
        boolean z;
        if (continuationImpl instanceof RedirectHostSplashDataPreloaderImpl$preloadData$1) {
            redirectHostSplashDataPreloaderImpl$preloadData$1 = (RedirectHostSplashDataPreloaderImpl$preloadData$1) continuationImpl;
            int i2 = redirectHostSplashDataPreloaderImpl$preloadData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                redirectHostSplashDataPreloaderImpl$preloadData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = redirectHostSplashDataPreloaderImpl$preloadData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = redirectHostSplashDataPreloaderImpl$preloadData$1.label;
                if (i != 0) {
                    b.b(obj);
                    redirectHostSplashDataPreloaderImpl$preloadData$1.label = 1;
                    b = this.b.b(this.a, redirectHostSplashDataPreloaderImpl$preloadData$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                z = b instanceof Result.Failure;
                if (!z) {
                    this.c.f = (String) b;
                }
                if (!z) {
                    return b;
                }
                return zy11.a;
            }
        }
        redirectHostSplashDataPreloaderImpl$preloadData$1 = new RedirectHostSplashDataPreloaderImpl$preloadData$1(this, continuationImpl);
        Object obj2 = redirectHostSplashDataPreloaderImpl$preloadData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = redirectHostSplashDataPreloaderImpl$preloadData$1.label;
        if (i != 0) {
        }
        z = b instanceof Result.Failure;
        if (!z) {
        }
        if (!z) {
        }
    }
}
