package com.ybsdk.feature.push.impl.domain;

import android.view.ContextThemeWrapper;
import androidx.work.ExistingWorkPolicy;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsSubscribeResult;
import defpackage.evu0;
import defpackage.f2g0;
import defpackage.jl40;
import defpackage.lnm0;
import defpackage.m2g0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o370;
import defpackage.ooc;
import defpackage.rt1;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uh6;
import defpackage.uyj;
import defpackage.uza;
import defpackage.va90;
import defpackage.vt51;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xt51;
import defpackage.yo40;
import defpackage.yt51;
import defpackage.yvi0;
import defpackage.zt51;
import defpackage.zy11;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public static final String m;
    public final ContextThemeWrapper a;
    public final yo40 b;
    public final o370 c;
    public final com.ybsdk.di.modules.features.push.a d;
    public final tse e;
    public final m2g0 f;
    public final com.ybsdk.feature.push.impl.data.a g;
    public final va90 h;
    public final AppAnalyticsReporter i;
    public final vt51 j;
    public final f2g0 k;
    public final lnm0 l;

    static {
        byte[] bArr = uh6.c;
        byte[] bArr2 = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr2[i] = (byte) (bArr[i] ^ uh6.b[i % 8]);
        }
        m = new String(bArr2, uza.a);
    }

    public a(ContextThemeWrapper contextThemeWrapper, yo40 yo40Var, o370 o370Var, com.ybsdk.di.modules.features.push.a aVar, tse tseVar, m2g0 m2g0Var, com.ybsdk.feature.push.impl.data.a aVar2, va90 va90Var, AppAnalyticsReporter appAnalyticsReporter, vt51 vt51Var, f2g0 f2g0Var, lnm0 lnm0Var) {
        this.a = contextThemeWrapper;
        this.b = yo40Var;
        this.c = o370Var;
        this.d = aVar;
        this.e = tseVar;
        this.f = m2g0Var;
        this.g = aVar2;
        this.h = va90Var;
        this.i = appAnalyticsReporter;
        this.j = vt51Var;
        this.k = f2g0Var;
        this.l = lnm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        if (r14 == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x007a, code lost:
    
        if (r14 == r2) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        PushNotificationsManager$doSubscribe$1 pushNotificationsManager$doSubscribe$1;
        Object obj;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        zt51 zt51Var;
        rt1 rt1Var = aVar.i.X;
        if (continuationImpl instanceof PushNotificationsManager$doSubscribe$1) {
            pushNotificationsManager$doSubscribe$1 = (PushNotificationsManager$doSubscribe$1) continuationImpl;
            int i2 = pushNotificationsManager$doSubscribe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsManager$doSubscribe$1.label = i2 - Integer.MIN_VALUE;
                obj = pushNotificationsManager$doSubscribe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsManager$doSubscribe$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!aVar.l.a()) {
                        rt1Var.a.a("push_notifications.skip_for_conditions_not_met", null);
                        return zy11Var;
                    }
                    o370 o370Var = aVar.c;
                    pushNotificationsManager$doSubscribe$1.label = 1;
                    obj = ((com.ybsdk.common.repositiories.user.a) o370Var.a).b(pushNotificationsManager$doSubscribe$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            String str5 = (String) obj;
                            if (str5 == null) {
                                x4c.g("Subscription to pushes failed", null, "deviceId is null", null, 10);
                                str5 = null;
                            }
                            yo40 yo40Var = aVar.b;
                            pushNotificationsManager$doSubscribe$1.L$0 = str5;
                            pushNotificationsManager$doSubscribe$1.label = 3;
                            Object u = ((yvi0) yo40Var.a).u(pushNotificationsManager$doSubscribe$1);
                            if (u != coroutineSingletons) {
                                str = str5;
                                obj = u;
                                str2 = (String) obj;
                                if (str2 == null) {
                                }
                                if (str != null) {
                                }
                                return zy11Var;
                            }
                            return coroutineSingletons;
                        }
                        if (i == 3) {
                            str = (String) pushNotificationsManager$doSubscribe$1.L$0;
                            kotlin.b.b(obj);
                            str2 = (String) obj;
                            if (str2 == null) {
                                x4c.g("Subscription to pushes failed", null, "uuid is null", null, 10);
                                str2 = null;
                            }
                            if (str != null || str2 == null) {
                                return zy11Var;
                            }
                            com.ybsdk.di.modules.features.push.a aVar2 = aVar.d;
                            pushNotificationsManager$doSubscribe$1.L$0 = str;
                            pushNotificationsManager$doSubscribe$1.L$1 = str2;
                            pushNotificationsManager$doSubscribe$1.label = 4;
                            Object a = aVar2.a(pushNotificationsManager$doSubscribe$1);
                            if (a != coroutineSingletons) {
                                str3 = str2;
                                obj = a;
                                str4 = str;
                                zt51Var = (zt51) obj;
                                if (zt51Var instanceof yt51) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = (String) pushNotificationsManager$doSubscribe$1.L$1;
                        str4 = (String) pushNotificationsManager$doSubscribe$1.L$0;
                        kotlin.b.b(obj);
                        zt51Var = (zt51) obj;
                        if (zt51Var instanceof yt51) {
                            if (jl40.l(zt51Var, xt51.b)) {
                                rt1Var.t(PushNotificationsEvents$PushNotificationsSubscribeResult.ERROR, "Subscription to pushes failed: the token was not received", str4);
                                return zy11Var;
                            }
                            if (jl40.l(zt51Var, xt51.a)) {
                                rt1Var.t(PushNotificationsEvents$PushNotificationsSubscribeResult.ERROR, "Subscription to pushes failed: token provider was not initialized", str4);
                                return zy11Var;
                            }
                            w511.b();
                            return null;
                        }
                        yt51 yt51Var = (yt51) zt51Var;
                        if (evu0.J(yt51Var.b())) {
                            x4c.g("Subscription to pushes failed: subscribeInfo.token is empty!", null, null, null, 14);
                            return zy11Var;
                        }
                        androidx.work.impl.b.i(aVar.a).g("PushSubscriptionTask".concat(str3), ExistingWorkPolicy.REPLACE, Collections.singletonList(ooc.j(str3, str4, yt51Var.b(), yt51Var.a(), true)));
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    rt1Var.a.a("push_notifications.skip_for_unregistered", null);
                    return zy11Var;
                }
                va90 va90Var = aVar.h;
                pushNotificationsManager$doSubscribe$1.label = 2;
                obj = ((DeviceIdProvider) va90Var.a).d(pushNotificationsManager$doSubscribe$1);
            }
        }
        pushNotificationsManager$doSubscribe$1 = new PushNotificationsManager$doSubscribe$1(aVar, continuationImpl);
        obj = pushNotificationsManager$doSubscribe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsManager$doSubscribe$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void b() {
        sjh sjhVar = uyj.a;
        tje.N(this.e, mdh.b, null, new PushNotificationsManager$onPushTokenUpdated$1(this, null), 2);
    }

    public final void c(String str) {
        if (str == null) {
            return;
        }
        sjh sjhVar = uyj.a;
        tje.N(this.e, mdh.b, null, new PushNotificationsManager$sendPushReceived$1(this, str, null), 2);
    }

    public final void d() {
        if (this.k.b() && this.f.a.getBoolean("isPushEnabledBySettings", true)) {
            sjh sjhVar = uyj.a;
            tje.N(this.e, mdh.b, null, new PushNotificationsManager$subscribe$1(this, null), 2);
        }
    }

    public final void e() {
        if (this.k.b()) {
            sjh sjhVar = uyj.a;
            tje.N(this.e, mdh.b, null, new PushNotificationsManager$subscribeIfDeviceIdNotMatched$1(this, null), 2);
        }
    }

    public final void f() {
        if (this.k.b()) {
            tje.N(this.e, null, null, new PushNotificationsManager$unsubscribe$1(this, null), 3);
        }
    }
}
