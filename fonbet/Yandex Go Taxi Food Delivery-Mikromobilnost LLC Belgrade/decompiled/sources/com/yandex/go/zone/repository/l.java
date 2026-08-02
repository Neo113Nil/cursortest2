package com.yandex.go.zone.repository;

import defpackage.g8e;
import defpackage.lx4;
import defpackage.ms2;
import defpackage.ny61;
import defpackage.t61;
import defpackage.tls;
import defpackage.zf;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class l {
    public final ms2 a;
    public final lx4 b;
    public final t61 c;
    public final zf d;

    public l(ms2 ms2Var, lx4 lx4Var, t61 t61Var, zf zfVar) {
        this.a = ms2Var;
        this.b = lx4Var;
        this.c = t61Var;
        this.d = zfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, tls tlsVar, ContinuationImpl continuationImpl) {
        ZoneInfoAnalytics$eventsLoggerWrap$1 zoneInfoAnalytics$eventsLoggerWrap$1;
        int i;
        try {
            if (continuationImpl instanceof ZoneInfoAnalytics$eventsLoggerWrap$1) {
                zoneInfoAnalytics$eventsLoggerWrap$1 = (ZoneInfoAnalytics$eventsLoggerWrap$1) continuationImpl;
                int i2 = zoneInfoAnalytics$eventsLoggerWrap$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zoneInfoAnalytics$eventsLoggerWrap$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = zoneInfoAnalytics$eventsLoggerWrap$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zoneInfoAnalytics$eventsLoggerWrap$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        zoneInfoAnalytics$eventsLoggerWrap$1.L$0 = str;
                        zoneInfoAnalytics$eventsLoggerWrap$1.L$1 = null;
                        zoneInfoAnalytics$eventsLoggerWrap$1.label = 1;
                        obj = tlsVar.invoke(zoneInfoAnalytics$eventsLoggerWrap$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) zoneInfoAnalytics$eventsLoggerWrap$1.L$0;
                        kotlin.b.b(obj);
                    }
                    b(true, str, null);
                    return obj;
                }
            }
            if (i != 0) {
            }
            b(true, str, null);
            return obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            b(false, str, th);
            throw th;
        }
        zoneInfoAnalytics$eventsLoggerWrap$1 = new ZoneInfoAnalytics$eventsLoggerWrap$1(this, continuationImpl);
        Object obj3 = zoneInfoAnalytics$eventsLoggerWrap$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneInfoAnalytics$eventsLoggerWrap$1.label;
    }

    public final void b(boolean z, String str, Throwable th) {
        String p = g8e.p(str, Extension.DOT_CHAR, z ? "success" : "error");
        ru.yandex.taxi.analytics.j jVar = (ru.yandex.taxi.analytics.j) this.b;
        ru.yandex.taxi.analytics.i d = jVar.d(p);
        d.j((r2 & 1) == 0);
        if (th != null) {
            d.d(Constants.KEY_EXCEPTION, String.valueOf(th));
        }
        d.m();
        ru.yandex.taxi.analytics.i d2 = jVar.d(p);
        d2.j((r2 & 1) == 0);
        if (th != null) {
            d2.d(Constants.KEY_EXCEPTION, String.valueOf(th));
        }
        d2.n();
    }
}
