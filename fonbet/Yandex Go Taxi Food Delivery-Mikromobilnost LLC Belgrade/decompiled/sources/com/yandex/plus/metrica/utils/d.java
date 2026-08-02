package com.yandex.plus.metrica.utils;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.metrica.utils.BaseMetricaFacade$Status;
import com.yandex.plus.metrica.utils.d;
import defpackage.ba31;
import defpackage.cma1;
import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.ha31;
import defpackage.i3y;
import defpackage.ou;
import defpackage.sls;
import defpackage.t610;
import defpackage.tq11;
import defpackage.v610;
import defpackage.w610;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* loaded from: classes8.dex */
public abstract class d {
    public final i3y a;
    public final i3y b;
    public final i3y c;
    public final ReentrantLock d = new ReentrantLock();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ReentrantLock f = new ReentrantLock();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ReentrantLock h = new ReentrantLock();
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public d() {
        final int i = 0;
        this.a = kotlin.a.a(new sls(this) { // from class: l45
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        return dVar.b("io.appmetrica.analytics.AppMetrica") == null ? BaseMetricaFacade$Status.NOT_FOUND : dVar.f();
                    case 1:
                        return dVar.b("io.appmetrica.analytics.AppMetricaYandex") == null ? BaseMetricaFacade$Status.NOT_FOUND : dVar.f();
                    default:
                        i3y i3yVar = dVar.b;
                        BaseMetricaFacade$Status baseMetricaFacade$Status = (BaseMetricaFacade$Status) i3yVar.getValue();
                        BaseMetricaFacade$Status baseMetricaFacade$Status2 = BaseMetricaFacade$Status.COMPATIBLE;
                        return baseMetricaFacade$Status == baseMetricaFacade$Status2 ? dVar.b("com.yandex.pulse.histogram.ComponentHistograms") == null ? BaseMetricaFacade$Status.NOT_FOUND : baseMetricaFacade$Status2 : (BaseMetricaFacade$Status) i3yVar.getValue();
                }
            }
        });
        final int i2 = 1;
        this.b = kotlin.a.a(new sls(this) { // from class: l45
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return dVar.b("io.appmetrica.analytics.AppMetrica") == null ? BaseMetricaFacade$Status.NOT_FOUND : dVar.f();
                    case 1:
                        return dVar.b("io.appmetrica.analytics.AppMetricaYandex") == null ? BaseMetricaFacade$Status.NOT_FOUND : dVar.f();
                    default:
                        i3y i3yVar = dVar.b;
                        BaseMetricaFacade$Status baseMetricaFacade$Status = (BaseMetricaFacade$Status) i3yVar.getValue();
                        BaseMetricaFacade$Status baseMetricaFacade$Status2 = BaseMetricaFacade$Status.COMPATIBLE;
                        return baseMetricaFacade$Status == baseMetricaFacade$Status2 ? dVar.b("com.yandex.pulse.histogram.ComponentHistograms") == null ? BaseMetricaFacade$Status.NOT_FOUND : baseMetricaFacade$Status2 : (BaseMetricaFacade$Status) i3yVar.getValue();
                }
            }
        });
        final int i3 = 2;
        this.c = kotlin.a.a(new sls(this) { // from class: l45
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return dVar.b("io.appmetrica.analytics.AppMetrica") == null ? BaseMetricaFacade$Status.NOT_FOUND : dVar.f();
                    case 1:
                        return dVar.b("io.appmetrica.analytics.AppMetricaYandex") == null ? BaseMetricaFacade$Status.NOT_FOUND : dVar.f();
                    default:
                        i3y i3yVar = dVar.b;
                        BaseMetricaFacade$Status baseMetricaFacade$Status = (BaseMetricaFacade$Status) i3yVar.getValue();
                        BaseMetricaFacade$Status baseMetricaFacade$Status2 = BaseMetricaFacade$Status.COMPATIBLE;
                        return baseMetricaFacade$Status == baseMetricaFacade$Status2 ? dVar.b("com.yandex.pulse.histogram.ComponentHistograms") == null ? BaseMetricaFacade$Status.NOT_FOUND : baseMetricaFacade$Status2 : (BaseMetricaFacade$Status) i3yVar.getValue();
                }
            }
        });
    }

    public final void a(Environment environment, sls slsVar, Object obj) {
        if (obj == null && slsVar.invoke() == BaseMetricaFacade$Status.INCOMPATIBLE) {
            IncompatibleMetricaVersionException incompatibleMetricaVersionException = new IncompatibleMetricaVersionException("AppMetrica version " + ((Object) tq11.a(8)) + ".x not found!");
            if (environment == Environment.TESTING) {
                throw incompatibleMetricaVersionException;
            }
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("Metrica8Facade");
            d5z0Var.e(incompatibleMetricaVersionException);
        }
    }

    public final Class b(String str) {
        Object failure;
        try {
            failure = Class.forName(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("Metrica8Facade");
            d5z0Var.p(a, "Class \"" + str + "\" not found!", new Object[0]);
            failure = null;
        }
        return (Class) failure;
    }

    public final Object c(sls slsVar, String str) {
        Object failure;
        try {
            failure = slsVar.invoke();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return failure;
        }
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("Metrica8Facade");
        d5z0Var.p(a, "Instance of class \"" + str + "\" not created!", new Object[0]);
        return null;
    }

    public final Object d(String str, ReentrantLock reentrantLock, ConcurrentHashMap concurrentHashMap, sls slsVar, sls slsVar2, String str2) {
        Object obj = concurrentHashMap.get(str);
        if (obj != null) {
            return obj;
        }
        Object c = c(new ou(6, slsVar, slsVar2), str2);
        if (c == null) {
            return null;
        }
        reentrantLock.lock();
        try {
            Object obj2 = concurrentHashMap.get(str);
            if (obj2 == null) {
                concurrentHashMap.put(str, c);
            } else {
                c = obj2;
            }
            return c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object e(final Context context, final String str, final String str2, final String str3, final Environment environment, final boolean z, final boolean z2) {
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("Metrica8Facade");
        d5z0Var.a("Get AppMetrica internal reporter", new Object[0]);
        Object c = c(new sls() { // from class: com.yandex.plus.metrica.utils.b
            @Override // defpackage.sls
            public final Object invoke() {
                final d dVar = this;
                ReentrantLock reentrantLock = dVar.f;
                ConcurrentHashMap concurrentHashMap = dVar.g;
                BaseMetricaFacade$getReporterInternal$reporterInternal$1$1 baseMetricaFacade$getReporterInternal$reporterInternal$1$1 = new BaseMetricaFacade$getReporterInternal$reporterInternal$1$1(0, dVar, d.class, "getMetricaInternalStatus", "getMetricaInternalStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0);
                final Context context2 = context;
                final Environment environment2 = environment;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = str3;
                final boolean z3 = z;
                final boolean z4 = z2;
                return dVar.d(str4, reentrantLock, concurrentHashMap, baseMetricaFacade$getReporterInternal$reporterInternal$1$1, new sls(context2, environment2, dVar, str4, str5, str6, z3, z4) { // from class: m45
                    public final /* synthetic */ Context a;
                    public final /* synthetic */ String b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ String w;
                    public final /* synthetic */ Environment x;
                    public final /* synthetic */ boolean y;
                    public final /* synthetic */ boolean z;

                    {
                        this.b = str4;
                        this.c = str5;
                        this.w = str6;
                        this.y = z3;
                        this.z = z4;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        String str7 = this.c;
                        String str8 = this.w;
                        Environment environment3 = this.x;
                        d5z0 d5z0Var2 = h5z0.a;
                        d5z0Var2.t("Metrica8Facade");
                        d5z0Var2.a("Activate AppMetrica internal reporter", new Object[0]);
                        String str9 = this.b;
                        ReporterYandexConfig.Builder newBuilder = ReporterYandexConfig.newBuilder(str9);
                        if (this.z) {
                            try {
                                PulseLibraryConfig.Builder newBuilder2 = PulseLibraryConfig.newBuilder(str7, str8, "110.0.2");
                                int i = na20.a[environment3.ordinal()];
                                int i2 = 2;
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i2 = 4;
                                }
                                newBuilder.withPulseLibraryConfig(newBuilder2.withChannelId(i2).build());
                            } catch (Throwable unused) {
                            }
                        }
                        if (this.y) {
                            newBuilder.withLogs();
                        }
                        ReporterYandexConfig build = newBuilder.build();
                        Context context3 = this.a;
                        AppMetricaYandex.activateReporter(context3, build);
                        return AppMetricaYandex.getReporter(context3, str9);
                    }
                }, "IReporterYandex");
            }
        }, "IReporterYandex");
        a(environment, new BaseMetricaFacade$getReporterInternal$1(0, this, d.class, "getMetricaInternalStatus", "getMetricaInternalStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0), c);
        return c;
    }

    public final BaseMetricaFacade$Status f() {
        Object failure;
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("Metrica8Facade");
        d5z0Var.a("Check for AppMetrica compatibility", new Object[0]);
        try {
            if (g()) {
                d5z0Var.t("Metrica8Facade");
                d5z0Var.a("AppMetrica is compatible", new Object[0]);
                failure = BaseMetricaFacade$Status.COMPATIBLE;
            } else {
                d5z0Var.t("Metrica8Facade");
                d5z0Var.o("AppMetrica is not compatible!", new Object[0]);
                failure = BaseMetricaFacade$Status.INCOMPATIBLE;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            d5z0 d5z0Var2 = h5z0.a;
            d5z0Var2.t("Metrica8Facade");
            d5z0Var2.p(a, "Check for AppMetrica compatibility failed!", new Object[0]);
            failure = BaseMetricaFacade$Status.INCOMPATIBLE;
        }
        return (BaseMetricaFacade$Status) failure;
    }

    public final boolean g() {
        ba31 ba31Var;
        v610 v610Var;
        t610 a;
        Object failure;
        w610 b = ha31.a.b(AppMetrica.getLibraryVersion());
        if (b == null || (a = (v610Var = b.c).a(1)) == null) {
            ba31Var = null;
        } else {
            String str = a.a;
            t610 a2 = v610Var.a(2);
            String str2 = a2 != null ? a2.a : null;
            t610 a3 = v610Var.a(3);
            String str3 = a3 != null ? a3.a : null;
            try {
                failure = new ba31(cma1.I0(str), str2 != null ? cma1.I0(str2) : 0, str3 != null ? cma1.I0(str3) : 0);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            ba31Var = (ba31) failure;
        }
        tq11 tq11Var = ba31Var != null ? new tq11(ba31Var.a) : null;
        return tq11Var != null && tq11Var.a == 8;
    }
}
