package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.epx;

/* loaded from: classes8.dex */
public final class C0 implements Oa {
    public final Context a;
    public final Na b;
    public final C4834ff c;
    public final Yl d;
    public final C5197tg e;
    public final Lf f;
    public final C5199ti g;
    public final Gi h;
    public final P7 i;
    public final C4866gl j;
    public volatile C5244vc k;
    public final C5000m0 l;
    public boolean m;

    public C0(Context context, Na na) {
        this.a = context;
        this.b = na;
        C4834ff b = C5030n4.l().b(context);
        this.c = b;
        ArrayList a = Dd.a();
        C5030n4 l = C5030n4.l();
        l.m().a(new W3(context));
        D0.a(context).a(a);
        Lf a2 = D0.a(context, D0.a(na.b(), this));
        this.f = a2;
        P7 j = l.j();
        this.i = j;
        Gi a3 = D0.a(a2, context, na.getDefaultExecutor());
        this.h = a3;
        j.a(a3);
        Yl a4 = D0.a(context, a3, b, na.b());
        this.d = a4;
        a3.a(a4);
        this.e = D0.a(a3, b, na.b());
        this.g = D0.a(context, a2, a3, na.b(), a4);
        this.j = l.o();
        this.l = new C5000m0(b);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final InterfaceC4779db c(ReporterConfig reporterConfig) {
        return this.g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final C4932ja d() {
        return this.d.e();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String e() {
        return this.d.d();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Map<String, String> g() {
        return this.d.b();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final AdvIdentifiersResult h() {
        return this.d.a();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final C5244vc i() {
        return this.k;
    }

    public final Ua j() {
        return this.k.a;
    }

    public final C5199ti k() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void setDataSendingEnabled(boolean z) {
        j().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C5000m0 c5000m0 = this.l;
        C5257w0 c5257w0 = c5000m0.b;
        c5257w0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c5257w0.a.b() && epx.f(c5257w0.b.a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f = c5000m0.a.f();
        if (f != null) {
            if (f.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new B0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a = a(orCreateMainPublicLogger, appMetricaConfig, new A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a || this.m) {
            z = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z = true;
        }
        if (a || z) {
            this.c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.m = true;
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.M6
    public final void a(int i, Bundle bundle) {
        this.d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(ReporterConfig reporterConfig) {
        this.g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.d.a(startupParamsCallback, list, AbstractC5166sb.c(this.f.a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Ic ic, boolean z) {
        if (this.k == null) {
            a(publicLogger, appMetricaConfig, z);
            this.e.a();
            C5193tc a = ic.a();
            K7 k7 = new K7(a);
            C5244vc c5244vc = new C5244vc(a, k7);
            this.b.c().a(k7);
            this.k = c5244vc;
            C5312y5 c5312y5 = this.j.b;
            synchronized (c5312y5) {
                try {
                    c5312y5.a = a;
                    Iterator it = c5312y5.b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4988le) it.next()).consume(a);
                    }
                    c5312y5.b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        ic.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.b.d().a(this.a, appMetricaConfig, this);
            this.b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.j.a();
        } else {
            C4866gl c4866gl = this.j;
            synchronized (c4866gl) {
                if (c4866gl.g) {
                    c4866gl.a.unregisterListener(c4866gl.c, ActivityEvent.RESUMED);
                    c4866gl.a.unregisterListener(c4866gl.d, ActivityEvent.PAUSED);
                    c4866gl.g = false;
                }
            }
        }
        this.f.d(appMetricaConfig);
        Yl yl = this.d;
        yl.e = publicLogger;
        yl.b(appMetricaConfig.customHosts);
        Yl yl2 = this.d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        yl2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.d.a(str);
        if (str != null) {
            this.d.b("api");
        }
        this.h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z));
        this.d.i();
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(boolean z) {
        j().a(z);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(boolean z, boolean z2) {
        j().a(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.InterfaceC4830fb
    public final InterfaceC4804eb a() {
        return this.g;
    }
}
