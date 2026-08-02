package defpackage;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.perf.b;

/* loaded from: classes9.dex */
public final class fva0 {
    public final e270 a;
    public final czf0 b;
    public final b c;
    public final jua0 d;

    public fva0(e270 e270Var, czf0 czf0Var, b bVar, jua0 jua0Var) {
        this.a = e270Var;
        this.b = czf0Var;
        this.c = bVar;
        this.d = jua0Var;
    }

    public static /* synthetic */ long b(fva0 fva0Var, String str, PerformanceAnalytics$Type performanceAnalytics$Type, tls tlsVar, int i) {
        if ((i & 2) != 0) {
            performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        }
        if ((i & 4) != 0) {
            tlsVar = new qz10(12);
        }
        return fva0Var.a(str, performanceAnalytics$Type, tlsVar);
    }

    public static OneShotPreDrawListener c(fva0 fva0Var, View view, String str, PerformanceAnalytics$Type performanceAnalytics$Type, int i) {
        if ((i & 4) != 0) {
            performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
        }
        PerformanceAnalytics$Type performanceAnalytics$Type2 = performanceAnalytics$Type;
        dia0 dia0Var = new dia0(8);
        fva0Var.getClass();
        return OneShotPreDrawListener.add(view, new l9(fva0Var, str, performanceAnalytics$Type2, dia0Var, 25));
    }

    public static /* synthetic */ void f(fva0 fva0Var, String str, PerformanceAnalytics$Type performanceAnalytics$Type, long j, int i) {
        if ((i & 2) != 0) {
            performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        }
        if ((i & 4) != 0) {
            j = SystemClock.elapsedRealtime();
        }
        fva0Var.e(str, performanceAnalytics$Type, j);
    }

    public final long a(String str, PerformanceAnalytics$Type performanceAnalytics$Type, tls tlsVar) {
        String o = g8e.o("Perf.", str);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        this.a.a(o, performanceAnalytics$Type.getAnalyticsName(), tlsVar, new veu(ref$LongRef, this, o, performanceAnalytics$Type));
        return ref$LongRef.element;
    }

    public final String d(String str, String str2) {
        int i = cva0.a[this.c.b().ordinal()];
        if (i == 1) {
            return g8e.p(str, Extension.DOT_CHAR, str2);
        }
        if (i == 2) {
            return g8e.p(str, ".Warm.", str2);
        }
        if (i == 3) {
            return g8e.p(str, ".Hot.", str2);
        }
        if (i == 4) {
            return g8e.p(str, ".Abandoned.", str2);
        }
        w511.b();
        return null;
    }

    public final void e(String str, PerformanceAnalytics$Type performanceAnalytics$Type, long j) {
        String o = g8e.o("Perf.", str);
        String analyticsName = performanceAnalytics$Type.getAnalyticsName();
        ga1 ga1Var = new ga1(this, o, performanceAnalytics$Type, j);
        e270 e270Var = this.a;
        e270Var.getClass();
        String p = g8e.p(o, Extension.DOT_CHAR, analyticsName);
        if (e270Var.e.contains(p)) {
            return;
        }
        e270Var.c.updateAndGet(new d270(j));
        e270Var.d.putIfAbsent(p, Long.valueOf(j));
        ga1Var.invoke(Long.valueOf(j));
    }
}
