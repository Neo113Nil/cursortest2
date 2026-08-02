package xsna;

import android.os.Bundle;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import com.vk.push.common.utils.StringExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class k1z0 {
    public final bay0 a;
    public final xwy0 b;
    public final AnalyticsSender c;
    public final yvj d;
    public final s9y0 e;
    public final Logger f;

    public k1z0(bay0 bay0Var, xwy0 xwy0Var, AnalyticsSender analyticsSender, hpj hpjVar, s9y0 s9y0Var, Logger logger) {
        this.a = bay0Var;
        this.b = xwy0Var;
        this.c = analyticsSender;
        this.d = hpjVar;
        this.e = s9y0Var;
        this.f = logger.createLogger(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k1z0 k1z0Var, Bundle bundle, String str, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.s.i iVar;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        k1z0 k1z0Var2;
        NotificationAnalyticsPayload notificationAnalyticsPayload;
        String str2;
        k1z0Var.getClass();
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.s.i) {
            iVar = (ru.rustore.sdk.pushclient.s.i) continuationImpl;
            int i2 = iVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f = i2 - Integer.MIN_VALUE;
                obj = iVar.d;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iVar.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iVar.a = k1z0Var;
                    iVar.b = str;
                    iVar.f = 1;
                    bdn bdnVar = bdn.a;
                    obj = myc0.k(ie00.a, new ru.rustore.sdk.pushclient.g.a(bundle, null), iVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        notificationAnalyticsPayload = iVar.c;
                        str2 = iVar.b;
                        k1z0Var2 = iVar.a;
                        kotlin.a.a(obj);
                        String str3 = (String) obj;
                        k1z0Var2.c.send((notificationAnalyticsPayload != null || str3 == null) ? new y9y0(null, null, str2) : epx.f(notificationAnalyticsPayload.getPushTokenPart(), StringExtensionsKt.takeSafe(str3, 10)) ? new y9y0(str3, notificationAnalyticsPayload.getMessageId(), str2) : new y9y0(null, null, str2));
                        return s3q0.a;
                    }
                    str = iVar.b;
                    k1z0Var = iVar.a;
                    kotlin.a.a(obj);
                }
                NotificationAnalyticsPayload notificationAnalyticsPayload2 = (NotificationAnalyticsPayload) obj;
                s9y0 s9y0Var = k1z0Var.e;
                iVar.a = k1z0Var;
                iVar.b = str;
                iVar.c = notificationAnalyticsPayload2;
                iVar.f = 2;
                obj = s9y0Var.a(iVar);
                if (obj != coroutineSingletons) {
                    String str4 = str;
                    k1z0Var2 = k1z0Var;
                    notificationAnalyticsPayload = notificationAnalyticsPayload2;
                    str2 = str4;
                    String str32 = (String) obj;
                    k1z0Var2.c.send((notificationAnalyticsPayload != null || str32 == null) ? new y9y0(null, null, str2) : epx.f(notificationAnalyticsPayload.getPushTokenPart(), StringExtensionsKt.takeSafe(str32, 10)) ? new y9y0(str32, notificationAnalyticsPayload.getMessageId(), str2) : new y9y0(null, null, str2));
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        iVar = new ru.rustore.sdk.pushclient.s.i(k1z0Var, continuationImpl);
        obj = iVar.d;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iVar.f;
        if (i != 0) {
        }
        NotificationAnalyticsPayload notificationAnalyticsPayload22 = (NotificationAnalyticsPayload) obj;
        s9y0 s9y0Var2 = k1z0Var.e;
        iVar.a = k1z0Var;
        iVar.b = str;
        iVar.c = notificationAnalyticsPayload22;
        iVar.f = 2;
        obj = s9y0Var2.a(iVar);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
