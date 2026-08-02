package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import xsna.hq;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5193tc extends U2 implements Ua {
    public static final Long s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));
    public final On p;
    public final Ec q;
    public final C5219uc r;

    public C5193tc(Ec ec) {
        super(ec.b(), ec.i(), ec.h(), ec.d(), ec.f(), ec.j(), ec.g(), ec.c(), ec.a(), ec.e());
        this.p = new On(new C4962ke("Referral url"));
        this.q = ec;
        this.r = new C5219uc(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C4974l0 c4974l0) {
        if (c4974l0.b) {
            clearAppEnvironment();
        }
        List<String> list = c4974l0.a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.b.b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Md md = this.q.c;
            Context context = this.a;
            md.d = new H0(this.b.b.getApiKey(), md.a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, md.a.a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), md.a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = md.b;
                I0 i0 = md.c;
                H0 h0 = md.d;
                H0 h02 = h0 != null ? h0 : null;
                i0.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h02)));
            }
        }
        C5219uc c5219uc = this.r;
        synchronized (c5219uc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c5219uc.a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c5219uc.b.a(c5219uc.a);
                } else {
                    c5219uc.b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void b(@Nullable Activity activity) {
        if (this.q.i.a(activity, EnumC5077p.PAUSED)) {
            this.c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C5106q2 c5106q2 = this.q.g;
            synchronized (c5106q2) {
                for (C5080p2 c5080p2 : c5106q2.a) {
                    if (!c5080p2.d) {
                        c5080p2.d = true;
                        c5080p2.b.executeDelayed(c5080p2.e, c5080p2.c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void c() {
        C5219uc c5219uc = this.r;
        synchronized (c5219uc) {
            c5219uc.b.a(c5219uc.a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final List<String> f() {
        return this.b.a.b();
    }

    @Override // io.appmetrica.analytics.impl.U2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.U2
    public final void k() {
        super.k();
        C5030n4.l().m().c();
    }

    public final void l() {
        Gi gi = this.h;
        gi.c.a(this.b.a);
        C5106q2 c5106q2 = this.q.g;
        C5167sc c5167sc = new C5167sc(this);
        long longValue = s.longValue();
        synchronized (c5106q2) {
            c5106q2.a(c5167sc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void c(@NonNull String str) {
        this.p.a(str);
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        HashMap a = hq.a("type", "referral", "link", str);
        a.put("auto", Boolean.FALSE);
        String b = AbstractC5166sb.b(a);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(b, "", 8208, 0, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        this.c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(@NonNull String str, boolean z) {
        this.c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        HashMap a = hq.a("type", "open", "link", str);
        a.put("auto", Boolean.valueOf(z));
        String b = AbstractC5166sb.b(a);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(b, "", 8208, 0, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(@NonNull EnumC5025n enumC5025n) {
        if (enumC5025n == EnumC5025n.b) {
            this.c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.c.warning("Could not enable activity auto tracking. " + enumC5025n.a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(@Nullable Activity activity) {
        if (this.q.i.a(activity, EnumC5077p.RESUMED)) {
            this.c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C5106q2 c5106q2 = this.q.g;
            synchronized (c5106q2) {
                for (C5080p2 c5080p2 : c5106q2.a) {
                    if (c5080p2.d) {
                        c5080p2.d = false;
                        c5080p2.b.remove(c5080p2.e);
                        C5193tc c5193tc = c5080p2.a.a;
                        c5193tc.h.c.b(c5193tc.b.a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ua, io.appmetrica.analytics.impl.Tc
    public final void a(@Nullable Location location) {
        this.b.b.setManualLocation(location);
        this.c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ua, io.appmetrica.analytics.impl.Tc
    public final void a(boolean z) {
        this.b.b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.Ua, io.appmetrica.analytics.impl.Tc
    public final void a(boolean z, boolean z2) {
        this.c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z));
        this.b.b.setAdvIdentifiersTracking(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(@NonNull Ro ro) {
        PublicLogger publicLogger = this.c;
        synchronized (ro) {
            ro.b = publicLogger;
        }
        Iterator it = ro.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        ro.a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(@NonNull AnrListener anrListener) {
        this.r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(@NonNull ExternalAttribution externalAttribution) {
        this.c.info("External attribution received: %s", externalAttribution);
        Gi gi = this.h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(bytes, "", 42, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.U2, io.appmetrica.analytics.impl.Ua, io.appmetrica.analytics.impl.Tc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Md md = this.q.c;
        String d = this.b.d();
        H0 h0 = md.d;
        if (h0 != null) {
            H0 h02 = new H0(h0.a, h0.b, h0.c, h0.d, h0.e, d);
            md.d = h02;
            NativeCrashClientModule nativeCrashClientModule = md.b;
            md.c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h02));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ua, io.appmetrica.analytics.impl.Tc
    public final void a(@NonNull String str) {
        this.c.info("Add auto collected data subscriber: %s", str);
        this.b.b.addAutoCollectedDataSubscriber(str);
    }
}
