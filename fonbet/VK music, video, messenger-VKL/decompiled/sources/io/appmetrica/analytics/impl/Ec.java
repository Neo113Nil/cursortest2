package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes8.dex */
public final class Ec {
    public final Context a;
    public final Gi b;
    public final Md c;
    public final Y9 d;
    public final P8 e;
    public final Ph f;
    public final C5106q2 g;
    public final D6 h;
    public final C5103q i;
    public final Ue j;
    public final C4740bo k;
    public final Og l;
    public final H6 m;
    public final C4768d0 n;

    public Ec(Context context, Lf lf, Gi gi, Yl yl) {
        this.a = context;
        this.b = gi;
        this.c = new Md(lf);
        Y9 y9 = new Y9(context);
        this.d = y9;
        P8 p8 = new P8(new Bl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.e = p8;
        this.f = new Ph(lf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), p8);
        this.g = new C5106q2();
        this.h = C5030n4.l().n();
        this.i = new C5103q();
        this.j = new Ue(y9);
        this.k = new C4740bo();
        this.l = new Og();
        this.m = new H6();
        this.n = new C4768d0();
    }

    public final C4768d0 a() {
        return this.n;
    }

    public final Context b() {
        return this.a;
    }

    public final H6 c() {
        return this.m;
    }

    public final Y9 d() {
        return this.d;
    }

    public final Ue e() {
        return this.j;
    }

    public final D6 f() {
        return this.h;
    }

    public final Og g() {
        return this.l;
    }

    public final Ph h() {
        return this.f;
    }

    public final Gi i() {
        return this.b;
    }

    public final C4740bo j() {
        return this.k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f.b.applyFromConfig(appMetricaConfig);
        Ph ph = this.f;
        String str = appMetricaConfig.userProfileID;
        synchronized (ph) {
            ph.f = str;
        }
        Ph ph2 = this.f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        ph2.d = new Ef(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
