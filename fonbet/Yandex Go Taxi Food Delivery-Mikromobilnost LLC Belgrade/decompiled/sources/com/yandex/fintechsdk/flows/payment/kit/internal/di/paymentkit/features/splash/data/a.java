package com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.splash.data;

import android.os.SystemClock;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import defpackage.dqt0;
import defpackage.ilp;
import defpackage.jlp;
import defpackage.klp;
import defpackage.mqt0;
import defpackage.ny61;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.vzd;
import defpackage.w870;
import defpackage.z22;
import defpackage.z96;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes12.dex */
public final class a implements mqt0 {
    public final z22 a;
    public final com.yandex.fintechsdk.data.config.impl.internal.a b;
    public final w870 c;
    public final dqt0 d;

    public a(z22 z22Var, com.yandex.fintechsdk.data.config.impl.internal.a aVar, w870 w870Var, dqt0 dqt0Var) {
        this.a = z22Var;
        this.b = aVar;
        this.c = w870Var;
        this.d = dqt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
    
        if (r0 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.mqt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SplashDataPreloaderImpl$preloadData$1 splashDataPreloaderImpl$preloadData$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long elapsedRealtime;
        com.yandex.fintechsdk.data.config.impl.internal.a aVar;
        Object b;
        long j;
        boolean z;
        Throwable a;
        Object failure;
        Object b2;
        if (continuationImpl instanceof SplashDataPreloaderImpl$preloadData$1) {
            splashDataPreloaderImpl$preloadData$1 = (SplashDataPreloaderImpl$preloadData$1) continuationImpl;
            int i2 = splashDataPreloaderImpl$preloadData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashDataPreloaderImpl$preloadData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashDataPreloaderImpl$preloadData$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashDataPreloaderImpl$preloadData$1.label;
                z22 z22Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new jlp());
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    aVar = this.b;
                    splashDataPreloaderImpl$preloadData$1.L$0 = aVar;
                    splashDataPreloaderImpl$preloadData$1.J$0 = elapsedRealtime;
                    splashDataPreloaderImpl$preloadData$1.label = 1;
                    obj = this.d.a(splashDataPreloaderImpl$preloadData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = splashDataPreloaderImpl$preloadData$1.J$0;
                        b.b(obj);
                        b = ((Result) obj).getValue();
                        Pair pair = new Pair(new Result(b), new Long(SystemClock.elapsedRealtime() - j));
                        Object value = ((Result) pair.getFirst()).getValue();
                        long longValue = ((Number) pair.getSecond()).longValue();
                        z = value instanceof Result.Failure;
                        if (!z) {
                            PaymentKitConfig paymentKitConfig = (PaymentKitConfig) value;
                            Pair pair2 = new Pair(ACSPConstants.STATUS, paymentKitConfig.getStatus());
                            Pair pair3 = new Pair("exp_boxes", paymentKitConfig.getExpBoxes());
                            Map<String, String> flags = paymentKitConfig.getFlags();
                            ArrayList arrayList = new ArrayList(flags.size());
                            for (Map.Entry<String, String> entry : flags.entrySet()) {
                                arrayList.add(((Object) entry.getKey()) + " - " + ((Object) entry.getValue()));
                            }
                            com.yandex.fintechsdk.core.analytics.impl.internal.a aVar2 = (com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var;
                            aVar2.a(new klp(2, "get_feature_flags_success", null, kotlin.collections.b.i(pair2, pair3, new Pair("feature_flags", kotlin.collections.a.X(arrayList, null, null, null, null, 63)))));
                            aVar2.a(new vzd(longValue));
                            String str = paymentKitConfig.getFlags().get("finsdkEnableTelemetry");
                            if (str == null) {
                                failure = Boolean.FALSE;
                            } else {
                                try {
                                    rbx rbxVar = sbx.d;
                                    rbxVar.getClass();
                                    b2 = rbxVar.b(z96.a, str);
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                if (b2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                                failure = (Boolean) b2;
                                Object obj2 = Boolean.FALSE;
                                if (failure instanceof Result.Failure) {
                                    failure = obj2;
                                }
                            }
                            if (((Boolean) failure).booleanValue()) {
                                this.c.b();
                            }
                        }
                        a = Result.a(value);
                        if (a != null) {
                            com.yandex.fintechsdk.core.analytics.impl.internal.a aVar3 = (com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var;
                            aVar3.a(new ilp(a));
                            aVar3.a(new vzd(longValue));
                        }
                        if (!z) {
                            return value;
                        }
                        return zy11.a;
                    }
                    elapsedRealtime = splashDataPreloaderImpl$preloadData$1.J$0;
                    aVar = (com.yandex.fintechsdk.data.config.impl.internal.a) splashDataPreloaderImpl$preloadData$1.L$0;
                    b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                splashDataPreloaderImpl$preloadData$1.L$0 = null;
                splashDataPreloaderImpl$preloadData$1.J$0 = elapsedRealtime;
                splashDataPreloaderImpl$preloadData$1.label = 2;
                b = aVar.b(booleanValue, splashDataPreloaderImpl$preloadData$1);
                if (b != coroutineSingletons) {
                    j = elapsedRealtime;
                    Pair pair4 = new Pair(new Result(b), new Long(SystemClock.elapsedRealtime() - j));
                    Object value2 = ((Result) pair4.getFirst()).getValue();
                    long longValue2 = ((Number) pair4.getSecond()).longValue();
                    z = value2 instanceof Result.Failure;
                    if (!z) {
                    }
                    a = Result.a(value2);
                    if (a != null) {
                    }
                    if (!z) {
                    }
                }
                return coroutineSingletons;
            }
        }
        splashDataPreloaderImpl$preloadData$1 = new SplashDataPreloaderImpl$preloadData$1(this, continuationImpl);
        Object obj3 = splashDataPreloaderImpl$preloadData$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashDataPreloaderImpl$preloadData$1.label;
        z22 z22Var2 = this.a;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        splashDataPreloaderImpl$preloadData$1.L$0 = null;
        splashDataPreloaderImpl$preloadData$1.J$0 = elapsedRealtime;
        splashDataPreloaderImpl$preloadData$1.label = 2;
        b = aVar.b(booleanValue2, splashDataPreloaderImpl$preloadData$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
