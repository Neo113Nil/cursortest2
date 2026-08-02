package com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.splash.data;

import android.os.SystemClock;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.pay.payment.PaymentData;
import defpackage.ar10;
import defpackage.bvf0;
import defpackage.g8e;
import defpackage.hk3;
import defpackage.mqt0;
import defpackage.ny61;
import defpackage.qk3;
import defpackage.t2u0;
import defpackage.wzd;
import defpackage.z22;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a implements mqt0 {
    public final z22 a;
    public final hk3 b;
    public final com.yandex.fintechsdk.data.config.impl.internal.a c;
    public final ar10 d;
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.a e;
    public final PaymentData f;
    public final Region g;

    public a(z22 z22Var, hk3 hk3Var, com.yandex.fintechsdk.data.config.impl.internal.a aVar, ar10 ar10Var, com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar2, PaymentData paymentData, Region region) {
        this.a = z22Var;
        this.b = hk3Var;
        this.c = aVar;
        this.d = ar10Var;
        this.e = aVar2;
        this.f = paymentData;
        this.g = region;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (b(r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.mqt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SplashDataPreloaderImpl$preloadData$1 splashDataPreloaderImpl$preloadData$1;
        int i;
        if (continuationImpl instanceof SplashDataPreloaderImpl$preloadData$1) {
            splashDataPreloaderImpl$preloadData$1 = (SplashDataPreloaderImpl$preloadData$1) continuationImpl;
            int i2 = splashDataPreloaderImpl$preloadData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashDataPreloaderImpl$preloadData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashDataPreloaderImpl$preloadData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashDataPreloaderImpl$preloadData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a).a(t2u0.c);
                        return zy11.a;
                    }
                    if (i == 2) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                Region region = Region.RU;
                Region region2 = this.g;
                if (region2 != region) {
                    String o = g8e.o("foreign_merchant_", region2.getKey());
                    r0 r0Var = this.d.a.a;
                    r0Var.getClass();
                    r0Var.m(null, o);
                    splashDataPreloaderImpl$preloadData$1.label = 1;
                } else {
                    SplashDataPreloaderImpl$preloadData$2 splashDataPreloaderImpl$preloadData$2 = new SplashDataPreloaderImpl$preloadData$2(this, null);
                    splashDataPreloaderImpl$preloadData$1.label = 2;
                    obj = bvf0.n(splashDataPreloaderImpl$preloadData$2, splashDataPreloaderImpl$preloadData$1);
                }
                return obj2;
            }
        }
        splashDataPreloaderImpl$preloadData$1 = new SplashDataPreloaderImpl$preloadData$1(this, continuationImpl);
        Object obj3 = splashDataPreloaderImpl$preloadData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashDataPreloaderImpl$preloadData$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SplashDataPreloaderImpl$loadConfig$1 splashDataPreloaderImpl$loadConfig$1;
        int i;
        Object a;
        long j;
        if (continuationImpl instanceof SplashDataPreloaderImpl$loadConfig$1) {
            splashDataPreloaderImpl$loadConfig$1 = (SplashDataPreloaderImpl$loadConfig$1) continuationImpl;
            int i2 = splashDataPreloaderImpl$loadConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashDataPreloaderImpl$loadConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashDataPreloaderImpl$loadConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashDataPreloaderImpl$loadConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (this.b.c.a.getValue() instanceof qk3) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        splashDataPreloaderImpl$loadConfig$1.J$0 = elapsedRealtime;
                        splashDataPreloaderImpl$loadConfig$1.label = 1;
                        a = this.c.a(splashDataPreloaderImpl$loadConfig$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j = elapsedRealtime;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = splashDataPreloaderImpl$loadConfig$1.J$0;
                b.b(obj);
                a = ((Result) obj).getValue();
                Pair pair = new Pair(new Result(a), new Long(SystemClock.elapsedRealtime() - j));
                ((Result) pair.getFirst()).getClass();
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a).a(new wzd(((Number) pair.getSecond()).longValue()));
                return zy11.a;
            }
        }
        splashDataPreloaderImpl$loadConfig$1 = new SplashDataPreloaderImpl$loadConfig$1(this, continuationImpl);
        Object obj2 = splashDataPreloaderImpl$loadConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashDataPreloaderImpl$loadConfig$1.label;
        if (i != 0) {
        }
        Pair pair2 = new Pair(new Result(a), new Long(SystemClock.elapsedRealtime() - j));
        ((Result) pair2.getFirst()).getClass();
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a).a(new wzd(((Number) pair2.getSecond()).longValue()));
        return zy11.a;
    }
}
