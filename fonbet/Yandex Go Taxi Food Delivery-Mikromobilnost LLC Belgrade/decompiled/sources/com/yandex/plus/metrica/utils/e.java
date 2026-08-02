package com.yandex.plus.metrica.utils;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import defpackage.b3u0;
import defpackage.d5z0;
import defpackage.ex0;
import defpackage.h4j0;
import defpackage.h5z0;
import defpackage.hl21;
import defpackage.i3y;
import defpackage.la20;
import defpackage.ma20;
import defpackage.oa20;
import defpackage.pcj;
import defpackage.rgo;
import defpackage.rl5;
import defpackage.sl5;
import defpackage.sls;
import defpackage.syq0;
import defpackage.tls;
import defpackage.tyq0;
import defpackage.uhl0;
import defpackage.w8o;
import defpackage.wa20;
import defpackage.weu;
import defpackage.zhl0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class e implements h4j0, sl5, hl21, tyq0 {
    public final Context a;
    public final oa20 b;
    public final String c;
    public final String d;
    public final String e;
    public final Environment f;
    public final i3y g;
    public final i3y h;
    public final i3y i;

    public e(Context context, oa20 oa20Var, String str, String str2, String str3, String str4, Environment environment, sls slsVar, sls slsVar2) {
        this.a = context;
        this.b = oa20Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = environment;
        this.g = kotlin.a.a(new c(str4, 1, this));
        this.h = kotlin.a.a(slsVar);
        this.i = kotlin.a.a(slsVar2);
    }

    @Override // defpackage.sl5
    public final rl5 a() {
        return (rl5) k(new Metrica8ObjectProviders$getBenchmarkTracker$1(0, this, e.class, "getComponentHistograms", "getComponentHistograms()Ljava/lang/Object;", 0), Metrica8ObjectProviders$getBenchmarkTracker$2.b);
    }

    @Override // defpackage.h4j0
    public final pcj b() {
        return (pcj) k(new Metrica8ObjectProviders$getDiagnosticReporter$1(0, this, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0), Metrica8ObjectProviders$getDiagnosticReporter$2.b);
    }

    @Override // defpackage.h4j0
    public final w8o c() {
        la20 la20Var = (la20) k(new Metrica8ObjectProviders$getErrorReporter$1(0, this, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0), Metrica8ObjectProviders$getErrorReporter$2.b);
        return la20Var != null ? la20Var : (w8o) k(new Metrica8ObjectProviders$getErrorReporter$3(this), Metrica8ObjectProviders$getErrorReporter$4.b);
    }

    @Override // defpackage.h4j0
    public final uhl0 d() {
        return (uhl0) k(new Metrica8ObjectProviders$getRtmErrorReporter$1(0, this, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0), Metrica8ObjectProviders$getRtmErrorReporter$2.b);
    }

    @Override // defpackage.h4j0
    public final b3u0 e() {
        return (b3u0) k(new Metrica8ObjectProviders$getStatboxReporter$1(0, this, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0), Metrica8ObjectProviders$getStatboxReporter$2.b);
    }

    @Override // defpackage.h4j0
    public final zhl0 f() {
        return (zhl0) k(new Metrica8ObjectProviders$getRtmEventReporter$1(this), Metrica8ObjectProviders$getRtmEventReporter$2.b);
    }

    public final Object g() {
        final boolean booleanValue = ((Boolean) this.h.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.i.getValue()).booleanValue();
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("Metrica8Facade");
        d5z0Var.a("Get AppMetrica reporter", new Object[0]);
        final oa20 oa20Var = this.b;
        final Context context = this.a;
        final String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        Environment environment = this.f;
        Object e = oa20Var.e(context, str, str2, str3, environment, booleanValue, booleanValue2);
        if (e != null) {
            return e;
        }
        d5z0Var.t("Metrica8Facade");
        d5z0Var.a("Can't get AppMetrica internal reporter, fallback to public reporter", new Object[0]);
        Object c = oa20Var.c(new sls() { // from class: com.yandex.plus.metrica.utils.a
            @Override // defpackage.sls
            public final Object invoke() {
                oa20 oa20Var2 = oa20.this;
                ReentrantLock reentrantLock = oa20Var2.d;
                ConcurrentHashMap concurrentHashMap = oa20Var2.e;
                BaseMetricaFacade$getReporter$1$reporter$1$1 baseMetricaFacade$getReporter$1$reporter$1$1 = new BaseMetricaFacade$getReporter$1$reporter$1$1(oa20Var2);
                Context context2 = context;
                String str4 = str;
                return oa20Var2.d(str4, reentrantLock, concurrentHashMap, baseMetricaFacade$getReporter$1$reporter$1$1, new ex0(oa20Var2, context2, str4, booleanValue, 4), "IReporter");
            }
        }, "IReporter");
        oa20Var.a(environment, new BaseMetricaFacade$getReporter$1$1(oa20Var), c);
        return c;
    }

    @Override // defpackage.h4j0
    public final rgo getEventReporter() {
        ma20 ma20Var = (ma20) k(new Metrica8ObjectProviders$getEventReporter$1(0, this, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0), Metrica8ObjectProviders$getEventReporter$2.b);
        return ma20Var != null ? ma20Var : (rgo) k(new Metrica8ObjectProviders$getEventReporter$3(this), Metrica8ObjectProviders$getEventReporter$4.b);
    }

    public final Object h() {
        return this.b.e(this.a, this.c, this.d, this.e, this.f, ((Boolean) this.h.getValue()).booleanValue(), ((Boolean) this.i.getValue()).booleanValue());
    }

    public final syq0 i() {
        return (syq0) k(new Metrica8ObjectProviders$getSessionController$1(0, this, e.class, "getReporter", "getReporter()Ljava/lang/Object;", 0), Metrica8ObjectProviders$getSessionController$2.b);
    }

    public final wa20 j() {
        return (wa20) k(new Metrica8ObjectProviders$getUserConsumer$1(0, this, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0), new weu(11, this));
    }

    public final Object k(sls slsVar, tls tlsVar) {
        Object failure;
        try {
            Object invoke = slsVar.invoke();
            failure = invoke != null ? tlsVar.invoke(invoke) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return failure;
        }
        if ((a instanceof IncompatibleMetricaVersionException) && this.f == Environment.TESTING) {
            throw a;
        }
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("Metrica8ObjectProviders");
        d5z0Var.e(a);
        return null;
    }
}
