package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import xsna.bi5;
import xsna.c3d;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5307y0 implements InterfaceC4830fb {
    public static volatile C5307y0 e = null;
    public static volatile boolean f = false;
    public static volatile boolean g;
    public final Context a;
    public final C5129r0 b;
    public final FutureTask c;
    public final Na d;

    public C5307y0(@NonNull Context context) {
        this.a = context;
        C5129r0 c = C5030n4.l().c();
        this.b = c;
        this.d = c.a(context, C5030n4.l().g());
        this.c = new FutureTask(new c3d(this, 2));
    }

    @NonNull
    public static C5307y0 a(@NonNull Context context) {
        C5307y0 c5307y0;
        C5307y0 c5307y02 = e;
        if (c5307y02 != null) {
            return c5307y02;
        }
        synchronized (C5307y0.class) {
            try {
                c5307y0 = e;
                if (c5307y0 == null) {
                    c5307y0 = new C5307y0(context);
                    c5307y0.j();
                    C5030n4.l().c.a().execute(new RunnableC5282x0(c5307y0));
                    e = c5307y0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5307y0;
    }

    public static void b(boolean z) {
        c().a(z, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z;
        synchronized (C5307y0.class) {
            z = f;
        }
        return z;
    }

    public static boolean l() {
        return g;
    }

    public static synchronized boolean m() {
        boolean z;
        synchronized (C5307y0.class) {
            C5307y0 c5307y0 = e;
            if (c5307y0 != null && c5307y0.c.isDone()) {
                z = c5307y0.f().i() != null;
            }
        }
        return z;
    }

    public static synchronized void n() {
        synchronized (C5307y0.class) {
            e = null;
            f = false;
            g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C5307y0.class) {
            f = true;
        }
    }

    public static void r() {
        g = true;
    }

    @Nullable
    public static C5307y0 s() {
        return e;
    }

    public static void setDataSendingEnabled(boolean z) {
        c().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(@Nullable String str) {
        c().setUserProfileID(str);
    }

    public final void c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.d.a(appMetricaConfig, this);
    }

    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C5030n4.l().c.a().execute(new RunnableC5283x1(this.a));
    }

    @Nullable
    public final String e() {
        return f().e();
    }

    public final Oa f() {
        try {
            return (Oa) this.c.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Nullable
    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    @Nullable
    public final C5244vc i() {
        return f().i();
    }

    public final void j() {
        C4772d4 c4772d4 = C5030n4.l().c;
        bi5 bi5Var = new bi5(this, 17);
        c4772d4.a.getClass();
        new InterruptionSafeThread(bi5Var, "IAA-INIT_CORE-" + Kd.a.incrementAndGet()).start();
    }

    public final void o() {
        C5030n4.l().r.a(this.a);
        new C4875h4(this.a).a(this.a);
        C5030n4.l().a(this.a).a();
        this.c.run();
    }

    public final Oa p() {
        Oa oa;
        C5129r0 c5129r0 = this.b;
        Context context = this.a;
        Na na = this.d;
        synchronized (c5129r0) {
            try {
                if (c5129r0.d == null) {
                    if (c5129r0.a(context)) {
                        c5129r0.d = new E0();
                    } else {
                        c5129r0.d = new C0(context, na);
                    }
                }
                oa = c5129r0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oa;
    }

    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C5030n4.l().c.a().execute(new RunnableC5283x1(this.a));
    }

    @NonNull
    public final InterfaceC4779db c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Tc c() {
        if (m()) {
            return e.f();
        }
        return C5030n4.l().b;
    }

    @NonNull
    public final C4932ja d() {
        return f().d();
    }

    @NonNull
    public final C5108q4 b() {
        return this.d.a();
    }

    public static void a(@Nullable Location location) {
        c().a(location);
    }

    public static void a(boolean z) {
        c().a(z);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public static void a(@NonNull String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(@Nullable C5307y0 c5307y0) {
        synchronized (C5307y0.class) {
            e = c5307y0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4830fb
    @NonNull
    public final InterfaceC4804eb a() {
        return f().a();
    }
}
