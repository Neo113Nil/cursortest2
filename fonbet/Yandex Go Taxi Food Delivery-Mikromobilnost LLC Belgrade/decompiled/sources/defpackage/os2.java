package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes9.dex */
public final class os2 implements ms2 {
    public final fva0 a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    public os2(fva0 fva0Var) {
        this.a = fva0Var;
    }

    public final long b(Milestone milestone, tls tlsVar) {
        int i = ns2.a[milestone.ordinal()];
        AtomicInteger atomicInteger = this.b;
        fva0 fva0Var = this.a;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
                return fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Loading, tlsVar);
            case 8:
                long a = fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Loading, tlsVar);
                if (this.e.compareAndSet(false, true)) {
                    atomicInteger.getAndIncrement();
                    c();
                }
                return a;
            case 11:
                long a2 = fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Loading, tlsVar);
                if (this.c.compareAndSet(false, true)) {
                    atomicInteger.getAndIncrement();
                    c();
                }
                return a2;
            case 12:
                long a3 = fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Loading, tlsVar);
                if (this.d.compareAndSet(false, true)) {
                    atomicInteger.getAndIncrement();
                    c();
                }
                return a3;
            case 13:
            case 14:
                return fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Inflate, tlsVar);
            case 15:
                if (this.h.compareAndSet(false, true)) {
                    return fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Time, tlsVar);
                }
                return 0L;
            case 16:
                if (this.i.compareAndSet(false, true)) {
                    return fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Time, tlsVar);
                }
                return 0L;
            case 17:
                return fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Time, tlsVar);
            case 18:
                if (this.g.compareAndSet(false, true)) {
                    return fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Time, tlsVar);
                }
                return 0L;
            case 19:
                if (this.f.compareAndSet(false, true)) {
                    return fva0Var.a(milestone.getEventName(), PerformanceAnalytics$Type.Time, tlsVar);
                }
                return 0L;
            default:
                w511.b();
                return 0L;
        }
    }

    public final void c() {
        if (this.b.get() == 3) {
            PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
            fva0 fva0Var = this.a;
            fva0.b(fva0Var, "Main.MainScreen.ApplicationActivityProductsZoneInfoSuggest", performanceAnalytics$Type, null, 4);
            fva0.b(fva0Var, "Main.MainScreen.ActivityProductsZoneInfoSuggest", performanceAnalytics$Type, null, 4);
        }
    }

    public final void d(Milestone milestone, long j) {
        int i = ns2.a[milestone.ordinal()];
        fva0 fva0Var = this.a;
        switch (i) {
            case 1:
                fva0Var.e(milestone.getEventName(), PerformanceAnalytics$Type.Loading, j);
                d(Milestone.ShortcutsLoaded, j);
                d(Milestone.FirstContentfulPaint, j);
                d(Milestone.LargestContentfulPaint, j);
                d(Milestone.LargestContentfulPaintCached, j);
                d(Milestone.FullContentfulPaint, j);
                d(Milestone.FullContentfulPaintCached, j);
                break;
            case 2:
                String eventName = milestone.getEventName();
                PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
                fva0Var.e(eventName, performanceAnalytics$Type, j);
                fva0Var.e("Main.MainScreen.ApplicationActivityProductsZoneInfoSuggest", performanceAnalytics$Type, j);
                break;
            case 3:
                fva0Var.e(milestone.getEventName(), PerformanceAnalytics$Type.Loading, j);
                break;
            case 4:
                String eventName2 = milestone.getEventName();
                PerformanceAnalytics$Type performanceAnalytics$Type2 = PerformanceAnalytics$Type.Loading;
                fva0Var.e(eventName2, performanceAnalytics$Type2, j);
                fva0Var.e("Main.MainScreen.ActivityProductsZoneInfoSuggest", performanceAnalytics$Type2, j);
                d(Milestone.MainScreenDataNav, j);
                d(Milestone.MainScreenDataTaxi, j);
                d(Milestone.SplashScreen, j);
                d(Milestone.Pin, j);
                d(Milestone.MainScreen, j);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                fva0Var.e(milestone.getEventName(), PerformanceAnalytics$Type.Loading, j);
                break;
            case 13:
            case 14:
                fva0Var.e(milestone.getEventName(), PerformanceAnalytics$Type.Inflate, j);
                break;
            case 15:
                if (!this.h.get()) {
                    fva0Var.e(milestone.getEventName(), PerformanceAnalytics$Type.Time, j);
                    break;
                }
                break;
            case 16:
                if (!this.i.get()) {
                    fva0Var.e(milestone.getEventName(), PerformanceAnalytics$Type.Time, j);
                    break;
                }
                break;
            case 17:
            case 18:
            case 19:
                fva0Var.e(milestone.getEventName(), PerformanceAnalytics$Type.Time, j);
                break;
            default:
                w511.b();
                break;
        }
    }
}
