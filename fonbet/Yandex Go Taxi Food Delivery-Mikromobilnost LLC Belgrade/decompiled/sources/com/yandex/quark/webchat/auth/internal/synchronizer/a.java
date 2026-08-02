package com.yandex.quark.webchat.auth.internal.synchronizer;

import defpackage.ab41;
import defpackage.dzs0;
import defpackage.e3n;
import defpackage.ezs0;
import defpackage.fe41;
import defpackage.kp50;
import defpackage.ne1;
import defpackage.ny61;
import defpackage.o430;
import defpackage.r5z0;
import defpackage.rpb1;
import defpackage.s7s0;
import defpackage.sls;
import defpackage.zq6;
import defpackage.zwf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class a {
    public final fe41 a;
    public final ne1 b;
    public final zwf0 c;
    public final zq6 d;
    public final sls e;

    public a(fe41 fe41Var, ne1 ne1Var, com.yandex.quark.webchat.auth.internal.b bVar, zwf0 zwf0Var, zq6 zq6Var) {
        s7s0 s7s0Var = new s7s0(9);
        this.a = fe41Var;
        this.b = ne1Var;
        this.c = zwf0Var;
        this.d = zq6Var;
        this.e = s7s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a(ContinuationImpl continuationImpl) {
        SmartCookieRefreshImpl$isCookieRefreshNeeded$1 smartCookieRefreshImpl$isCookieRefreshNeeded$1;
        int i;
        if (continuationImpl instanceof SmartCookieRefreshImpl$isCookieRefreshNeeded$1) {
            smartCookieRefreshImpl$isCookieRefreshNeeded$1 = (SmartCookieRefreshImpl$isCookieRefreshNeeded$1) continuationImpl;
            int i2 = smartCookieRefreshImpl$isCookieRefreshNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smartCookieRefreshImpl$isCookieRefreshNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = smartCookieRefreshImpl$isCookieRefreshNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smartCookieRefreshImpl$isCookieRefreshNeeded$1.label;
                fe41 fe41Var = this.a;
                zq6 zq6Var = this.d;
                zwf0 zwf0Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fe41Var.getClass();
                    zwf0Var.info("SmartCookieRefresh", "Smart cookie refresh is disabled");
                    zq6Var.b(new dzs0(SmartCookieRefreshImpl$ApplyEventReason.DISABLED));
                    return Boolean.TRUE;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j = smartCookieRefreshImpl$isCookieRefreshNeeded$1.J$0;
                kotlin.b.b(obj);
                ab41 ab41Var = (ab41) obj;
                if (!(ab41Var instanceof ab41)) {
                    zwf0Var.info("SmartCookieRefresh", "Web chat is not authorized");
                    zq6Var.b(new dzs0(SmartCookieRefreshImpl$ApplyEventReason.WEB_APP_NO_COOKIES));
                    return Boolean.TRUE;
                }
                if (ab41Var.a() != null) {
                    long time = ab41Var.a().getTime() - j;
                    o430 o430Var = e3n.b;
                    fe41Var.getClass();
                    if (time < e3n.e(kp50.V(0L, DurationUnit.SECONDS))) {
                        zwf0Var.info("SmartCookieRefresh", "Cookies are about to expire");
                        zq6Var.b(new dzs0(SmartCookieRefreshImpl$ApplyEventReason.COOKIES_EXPIRING));
                        return Boolean.TRUE;
                    }
                } else {
                    long j2 = this.b.a.getLong("cookies_refresh_time", 0L);
                    Long valueOf = Long.valueOf(j2);
                    if (j2 <= 0) {
                        valueOf = null;
                    }
                    r5z0 r5z0Var = valueOf != null ? new r5z0(valueOf.longValue()) : null;
                    if (r5z0Var != null) {
                        long g = j - rpb1.g(r5z0Var);
                        o430 o430Var2 = e3n.b;
                        fe41Var.getClass();
                        if (g > e3n.e(kp50.V(0L, DurationUnit.SECONDS))) {
                            zwf0Var.info("SmartCookieRefresh", "Cookies are (probably) about to expire");
                            zq6Var.b(new dzs0(SmartCookieRefreshImpl$ApplyEventReason.COOKIES_PROBABLY_EXPIRING));
                            return Boolean.TRUE;
                        }
                    }
                }
                zwf0Var.info("SmartCookieRefresh", "Cookies are set and up to date. Skipping refresh");
                zq6Var.b(ezs0.c);
                return Boolean.FALSE;
            }
        }
        smartCookieRefreshImpl$isCookieRefreshNeeded$1 = new SmartCookieRefreshImpl$isCookieRefreshNeeded$1(this, continuationImpl);
        Object obj2 = smartCookieRefreshImpl$isCookieRefreshNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartCookieRefreshImpl$isCookieRefreshNeeded$1.label;
        fe41 fe41Var2 = this.a;
        zq6 zq6Var2 = this.d;
        zwf0 zwf0Var2 = this.c;
        if (i != 0) {
        }
    }
}
