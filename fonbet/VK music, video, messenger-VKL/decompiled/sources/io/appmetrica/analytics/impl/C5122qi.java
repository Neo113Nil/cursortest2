package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5122qi implements InterfaceC4779db {
    public final C5332z0 a;
    public final Kh b;
    public final IHandlerExecutor c;
    public final Context d;
    public final ReporterConfig e;
    public final Ai f;
    public final Ze g;

    public C5122qi(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C5332z0());
    }

    public static InterfaceC4779db a(C5332z0 c5332z0, Context context, ReporterConfig reporterConfig) {
        c5332z0.getClass();
        return C5307y0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5044ni(this));
    }

    public final void d(@NonNull String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4786di(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Vh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5018mi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new Zh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.b.j.a(map);
        this.f.getClass();
        this.c.execute(new RunnableC4940ji(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.b.i.a(eCommerceEvent);
        this.f.getClass();
        this.c.execute(new RunnableC4734bi(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        this.b.b.a(str);
        this.f.getClass();
        if (th == null) {
            th = new Z1();
            th.fillInStackTrace();
        }
        this.c.execute(new Rh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC5070oi(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.b.g.a(revenue);
        this.f.getClass();
        this.c.execute(new Yh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        this.b.e.a(th);
        this.f.getClass();
        this.c.execute(new Th(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.b.f.a(userProfile);
        this.f.getClass();
        this.c.execute(new Xh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Uh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4992li(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4760ci(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4863gi(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Wh(this, str));
    }

    public C5122qi(Context context, String str, C5332z0 c5332z0) {
        this(context, new Kh(), c5332z0, new Ai(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4779db, io.appmetrica.analytics.impl.InterfaceC4856gb
    public final void a(@NonNull C4714ao c4714ao) {
        this.b.d.a(c4714ao);
        this.f.getClass();
        this.c.execute(new RunnableC4914ii(this, c4714ao));
    }

    public C5122qi(Context context, Kh kh, C5332z0 c5332z0, Ai ai, ReporterConfig reporterConfig) {
        this(context, kh, c5332z0, ai, reporterConfig, new Ze(new C4708ai(c5332z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new RunnableC4889hi(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC5096pi(this, str, str2));
    }

    public C5122qi(Context context, Kh kh, C5332z0 c5332z0, Ai ai, ReporterConfig reporterConfig, Ze ze) {
        this.c = C5030n4.l().g().a();
        this.d = context;
        this.b = kh;
        this.a = c5332z0;
        this.f = ai;
        this.e = reporterConfig;
        this.g = ze;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        this.b.c.a(str);
        this.f.getClass();
        this.c.execute(new Sh(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4779db, io.appmetrica.analytics.impl.InterfaceC4845g0
    public final void a(@NonNull V v) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4966ki(this, v));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new Qh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4811ei(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4837fi(this, moduleEvent));
    }
}
