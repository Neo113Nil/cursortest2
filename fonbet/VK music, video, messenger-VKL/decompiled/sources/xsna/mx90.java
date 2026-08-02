package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryMetricExporter;
import xsna.d9i;
import xsna.fkh0;

/* compiled from: PeriodicMetricReader.java */
/* loaded from: classes8.dex */
public final class mx90 implements dl20 {
    public static final Logger i = Logger.getLogger(mx90.class.getName());
    public static final gcd0 j = gcd0.d;
    public static final d9i.a k = new d9i.a("periodic_metric_reader");
    public final al20 b;
    public final long c;
    public final ScheduledExecutorService d;
    public volatile ScheduledFuture<?> h;
    public final Object f = new Object();
    public volatile v4g g = new crx0();
    public final a e = new a();

    /* compiled from: PeriodicMetricReader.java */
    public final class a implements Runnable {
        public final AtomicBoolean b = new AtomicBoolean(true);
        public el20 c = new el20(mx90.k, sil.b);

        public a() {
        }

        public final v7i a() {
            v7i v7iVar = new v7i();
            if (!this.b.compareAndSet(true, false)) {
                mx90.i.log(Level.FINE, "Exporter busy. Dropping metrics.");
                v7iVar.a(null);
                return v7iVar;
            }
            try {
                gcd0 gcd0Var = mx90.j;
                gcd0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    Collection<yk20> a = mx90.this.g.a();
                    gcd0Var.getClass();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    el20 el20Var = this.c;
                    ((p6o) el20Var.a).record(nanoTime2 / 1.0E9d, (jk3) el20Var.b);
                    if (!a.isEmpty()) {
                        v7i export = mx90.this.b.export(a);
                        export.f(new h9p(this, export, v7iVar, 3));
                        return v7iVar;
                    }
                    mx90.i.log(Level.FINE, "No metric data to export - skipping export.");
                    v7iVar.e();
                    this.b.set(true);
                    return v7iVar;
                } catch (Throwable th) {
                    mx90.j.getClass();
                    long nanoTime3 = System.nanoTime() - nanoTime;
                    el20 el20Var2 = this.c;
                    ((p6o) el20Var2.a).record(nanoTime3 / 1.0E9d, (jk3) el20Var2.b);
                    throw th;
                }
            } catch (Throwable th2) {
                this.b.set(true);
                mx90.i.log(Level.WARNING, "Exporter threw an Exception", th2);
                v7iVar.a(null);
                return v7iVar;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    public mx90(al20 al20Var, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.b = al20Var;
        this.c = j2;
        this.d = scheduledExecutorService;
    }

    public static syp b(TracerOpenTelemetryMetricExporter tracerOpenTelemetryMetricExporter) {
        syp sypVar = new syp();
        sypVar.a = TimeUnit.MINUTES.toNanos(1L);
        sypVar.b = tracerOpenTelemetryMetricExporter;
        return sypVar;
    }

    public final void c(cj20 cj20Var) {
        a aVar = this.e;
        aVar.getClass();
        aVar.c = new el20(k, cj20Var);
    }

    @Override // xsna.nb1
    public final AggregationTemporality getAggregationTemporality(InstrumentType instrumentType) {
        return this.b.getAggregationTemporality(instrumentType);
    }

    @Override // xsna.dl20, xsna.x9l
    public final x71 getDefaultAggregation(InstrumentType instrumentType) {
        return this.b.getDefaultAggregation(instrumentType);
    }

    @Override // xsna.dl20
    public final MemoryMode getMemoryMode() {
        return this.b.getMemoryMode();
    }

    @Override // xsna.dl20
    public final v7i shutdown() {
        v7i shutdown;
        yr2 yr2Var;
        v7i v7iVar = new v7i();
        ScheduledFuture<?> scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.d.shutdown();
        try {
            try {
                ScheduledExecutorService scheduledExecutorService = this.d;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                scheduledExecutorService.awaitTermination(5L, timeUnit);
                this.e.a().c(5L, timeUnit);
                shutdown = mx90.this.b.shutdown();
                yr2Var = new yr2(5, shutdown, v7iVar);
            } catch (InterruptedException unused) {
                this.d.shutdownNow();
                Thread.currentThread().interrupt();
                shutdown = mx90.this.b.shutdown();
                yr2Var = new yr2(5, shutdown, v7iVar);
            }
            shutdown.f(yr2Var);
            return v7iVar;
        } catch (Throwable th) {
            v7i shutdown2 = mx90.this.b.shutdown();
            shutdown2.f(new yr2(5, shutdown2, v7iVar));
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicMetricReader{exporter=");
        sb.append(this.b);
        sb.append(", intervalNanos=");
        return vu5.a('}', this.c, sb);
    }

    @Override // xsna.dl20
    public final void x1(fkh0.b bVar) {
        this.g = bVar;
        synchronized (this.f) {
            try {
                if (this.h != null) {
                    return;
                }
                ScheduledExecutorService scheduledExecutorService = this.d;
                a aVar = this.e;
                long j2 = this.c;
                this.h = scheduledExecutorService.scheduleAtFixedRate(aVar, j2, j2, TimeUnit.NANOSECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
