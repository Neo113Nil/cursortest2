package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;
import xsna.bw4;
import xsna.gh1;
import xsna.wd2;

/* renamed from: io.appmetrica.analytics.impl.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5208u1 {
    public final C5332z0 a;
    public final Ro b;
    public final C5325yi c;
    public final P7 d;
    public final C5150rl e;
    public final M2 f;
    public final C5127qn g;
    public final C4866gl h;

    public C5208u1(C5332z0 c5332z0, M2 m2, C5150rl c5150rl, Ro ro, C5127qn c5127qn, C5325yi c5325yi, P7 p7, C4866gl c4866gl) {
        this.a = c5332z0;
        this.b = ro;
        this.c = c5325yi;
        this.d = p7;
        this.f = m2;
        this.g = c5127qn;
        this.e = c5150rl;
        this.h = c4866gl;
    }

    public static IHandlerExecutor c() {
        return C5030n4.l().c.a();
    }

    public final void a(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        M2 m2 = this.f;
        m2.f.a(context);
        m2.b.a(appMetricaConfig);
        C5127qn c5127qn = this.g;
        Context applicationContext = context.getApplicationContext();
        c5127qn.e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c5127qn.d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c5127qn.a.getClass();
        C5307y0 a = C5307y0.a(applicationContext);
        a.d.a(appMetricaConfig, a);
        IHandlerExecutor c = c();
        ((L9) c).b.post(new bw4(this, context, appMetricaConfig, 2));
        this.a.getClass();
        C5332z0.b();
    }

    @Nullable
    public final String b() {
        this.a.getClass();
        C5307y0 c5307y0 = C5307y0.e;
        if (c5307y0 == null) {
            return null;
        }
        return c5307y0.f().e();
    }

    public final C5244vc d() {
        this.a.getClass();
        return C5307y0.e.f().i();
    }

    public final void e() {
        d().a.a(this.h.a());
    }

    public final void f() {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new W0(this));
    }

    public final void c(@Nullable Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4872h1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C5332z0 c5332z0 = this.a;
        Context applicationContext = context.getApplicationContext();
        c5332z0.getClass();
        C5307y0 a = C5307y0.a(applicationContext);
        a.f().b(this.d.a(appMetricaConfig));
        Context context2 = a.a;
        ((L9) C5030n4.l().c.a()).execute(new RunnableC5283x1(context2));
    }

    public final void e(@Nullable String str) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new U0(this, str));
    }

    public final void d(@NonNull String str) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.j.a(str);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new P0(this, str));
    }

    public C5208u1() {
        this(C5030n4.l().d(), new Ro());
    }

    public final void c(@NonNull String str, @Nullable String str2) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.s.a(str);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5079p1(this, str, str2));
    }

    public C5208u1(C5332z0 c5332z0, Ro ro) {
        this(c5332z0, new M2(c5332z0), new C5150rl(c5332z0), ro, new C5127qn(c5332z0, ro), C5325yi.a(), C5030n4.l().j(), C5030n4.l().o());
    }

    public final void d(@NonNull String str, @Nullable String str2) {
        M2 m2 = this.f;
        m2.a.a(null);
        if (m2.o.a(str).a) {
            this.g.getClass();
            IHandlerExecutor c = c();
            ((L9) c).b.post(new RunnableC4794e1(this, str, str2));
        }
    }

    public final void b(@NonNull String str) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.s.a(str);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5053o1(this, str));
    }

    public final void c(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new R0(this, z));
    }

    public final void a(@Nullable Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5027n1(this, activity));
    }

    public final void b(@NonNull Activity activity) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.c.a(activity);
        this.g.getClass();
        Intent a = C5127qn.a(activity);
        IHandlerExecutor c = c();
        ((L9) c).b.post(new M0(this, a));
    }

    public final void c(@NonNull String str) {
        if (this.e.a((Void) null).a && this.f.n.a(str).a) {
            this.g.getClass();
            IHandlerExecutor c = c();
            ((L9) c).b.post(new RunnableC4820f1(this, str));
        }
    }

    public final void a(@NonNull Application application) {
        this.f.e.a(application);
        this.g.c.a(application);
        IHandlerExecutor c = c();
        ((L9) c).b.post(new wd2(this, 14));
    }

    public final void b(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new T0(this, z));
    }

    public final void b(@NonNull String str, @Nullable String str2) {
        this.f.l.a(str);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4743c1(this, str, str2));
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.s.a(str);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5105q1(this, str, listFromMap));
    }

    public final void b(@NonNull Object... objArr) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new gh1(objArr, 12));
    }

    public final void a(@NonNull String str, @Nullable Throwable th) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.t.a(str);
        this.g.getClass();
        if (th == null) {
            th = new Z1();
            th.fillInStackTrace();
        }
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5130r1(this, str, th));
    }

    public final void b(@NonNull Context context) {
        this.f.f.a(context);
        this.g.e.a(context);
        this.a.getClass();
        C5307y0.a(context);
    }

    public final void a(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.u.a(str);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5156s1(this, str, str2, th));
    }

    public final void a(@NonNull Throwable th) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.v.a(th);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5182t1(this, th));
    }

    public final void a(@NonNull String str) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.i.a(str);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new N0(this, str));
    }

    public final void a(@NonNull Intent intent) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.d.a(intent);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new O0(this, intent));
    }

    public final void a(@Nullable Location location) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new Q0(this, location));
    }

    public final void a(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new S0(this, z));
    }

    public final void a(@NonNull UserProfile userProfile) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.w.a(userProfile);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new V0(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.x.a(revenue);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new X0(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.y.a(adRevenue);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new Y0(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.z.a(eCommerceEvent);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new Z0(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.g.a(deferredDeeplinkParametersListener);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4691a1(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.g.a(deferredDeeplinkListener);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4717b1(this, deferredDeeplinkListener));
    }

    @NonNull
    public final InterfaceC4779db a(@NonNull Context context, @NonNull String str) {
        M2 m2 = this.f;
        m2.f.a(context);
        m2.k.a(str);
        C5127qn c5127qn = this.g;
        c5127qn.e.a(context.getApplicationContext());
        return this.c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        M2 m2 = this.f;
        m2.f.a(context);
        m2.h.a(reporterConfig);
        C5127qn c5127qn = this.g;
        c5127qn.e.a(context.getApplicationContext());
        C5325yi c5325yi = this.c;
        Context applicationContext = context.getApplicationContext();
        if (((C5122qi) c5325yi.a.get(reporterConfig.apiKey)) == null) {
            synchronized (c5325yi.a) {
                try {
                    if (((C5122qi) c5325yi.a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a = C5030n4.l().c.a();
                        c5325yi.b.getClass();
                        if (C5307y0.e == null) {
                            ((L9) a).b.post(new RunnableC5275wi(c5325yi, applicationContext));
                        }
                        C5122qi c5122qi = new C5122qi(applicationContext.getApplicationContext(), str, new C5332z0());
                        c5325yi.a.put(str, c5122qi);
                        c5122qi.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(@NonNull WebView webView) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.m.a(webView);
        Ro ro = this.g.b;
        ro.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Oo oo = new Oo();
                synchronized (ro) {
                    try {
                        PublicLogger publicLogger = ro.b;
                        if (publicLogger == null) {
                            ro.a.add(oo);
                        } else {
                            oo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                ro.a(new Po());
            }
        } catch (Throwable th) {
            ro.a(new Qo(th));
        }
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4769d1(this));
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f.f.a(context);
        C5127qn c5127qn = this.g;
        Context applicationContext = context.getApplicationContext();
        c5127qn.e.a(applicationContext);
        c5127qn.f.a(applicationContext);
        return C5030n4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, @Nullable String str2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4846g1(this, str, str2));
    }

    public final void a() {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4898i1(this));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        M2 m2 = this.f;
        m2.f.a(context);
        m2.p.a(startupParamsCallback);
        C5127qn c5127qn = this.g;
        c5127qn.e.a(context.getApplicationContext());
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4923j1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.q.a(anrListener);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4949k1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        M2 m2 = this.f;
        m2.a.a(null);
        m2.r.a(externalAttribution);
        this.g.getClass();
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC4975l1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b = C5030n4.l().m().b();
        if (b != null) {
            b.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f.A.a(map);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c = c();
        ((L9) c).b.post(new RunnableC5001m1(this, listFromMap));
    }

    public static Ua a(C5208u1 c5208u1) {
        return c5208u1.d().a;
    }
}
