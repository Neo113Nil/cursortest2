package xsna;

import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryLogExporter;
import xsna.ask;
import xsna.d9i;
import xsna.p000;

/* compiled from: BatchLogRecordProcessor.java */
/* loaded from: classes8.dex */
public final class yu6 implements o000 {
    public static final d9i.a d = new d9i.a("batching_log_processor");
    public static final String e = yu6.class.getSimpleName().concat("_WorkerThread");
    public final a b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: BatchLogRecordProcessor.java */
    public static final class a implements Runnable {
        public static final Logger o = Logger.getLogger(a.class.getName());
        public final p000 b;
        public final n000 c;
        public final long d;
        public final int e;
        public final long f;
        public long g;
        public final ArrayBlockingQueue h;
        public final AtomicInteger i;
        public final ArrayBlockingQueue j;
        public final AtomicReference<v7i> k;
        public volatile boolean l;
        public final ArrayList<m000> m;
        public final long n;

        public a() {
            throw null;
        }

        public a(n000 n000Var, Supplier supplier, InternalTelemetryVersion internalTelemetryVersion, long j, int i, long j2, ArrayBlockingQueue arrayBlockingQueue, long j3) {
            this.i = new AtomicInteger(Integer.MAX_VALUE);
            this.k = new AtomicReference<>();
            this.l = true;
            this.c = n000Var;
            this.d = j;
            this.e = i;
            this.f = j2;
            this.h = arrayBlockingQueue;
            this.j = new ArrayBlockingQueue(1);
            this.b = p000.a.a[internalTelemetryVersion.ordinal()] != 1 ? new ufi0(yu6.d, supplier) : new z0z(supplier);
            this.n = j3;
            this.m = new ArrayList<>(i);
        }

        public final void a() {
            Throwable th;
            Throwable th2;
            Logger logger = o;
            p000 p000Var = this.b;
            ArrayList<m000> arrayList = this.m;
            if (arrayList.isEmpty()) {
                return;
            }
            String str = null;
            try {
                try {
                    v7i export = this.c.export(Collections.unmodifiableList(arrayList));
                    export.c(this.f, TimeUnit.NANOSECONDS);
                    if (!export.b()) {
                        logger.log(Level.FINE, "Exporter failed");
                        synchronized (export.d) {
                            th = export.b;
                        }
                        if (th != null) {
                            synchronized (export.d) {
                                th2 = export.b;
                            }
                            str = th2.getClass().getName();
                        } else {
                            str = "export_failed";
                        }
                    }
                    p000Var.b(arrayList.size(), str);
                } catch (RuntimeException e) {
                    logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e);
                    p000Var.b(arrayList.size(), e.getClass().getName());
                }
                arrayList.clear();
            } catch (Throwable th3) {
                p000Var.b(arrayList.size(), null);
                arrayList.clear();
                throw th3;
            }
        }

        public final v7i b() {
            AtomicReference<v7i> atomicReference;
            v7i v7iVar = new v7i();
            while (true) {
                atomicReference = this.k;
                if (atomicReference.compareAndSet(null, v7iVar)) {
                    this.j.offer(Boolean.TRUE);
                    break;
                }
                if (atomicReference.get() != null) {
                    break;
                }
            }
            v7i v7iVar2 = atomicReference.get();
            return v7iVar2 == null ? v7i.e : v7iVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.g = System.nanoTime() + this.d;
            while (this.l) {
                if (this.k.get() != null) {
                    AtomicReference<v7i> atomicReference = this.k;
                    ArrayList<m000> arrayList = this.m;
                    ArrayBlockingQueue arrayBlockingQueue = this.h;
                    int size = arrayBlockingQueue.size();
                    while (size > 0) {
                        arrayList.add(((o7f0) arrayBlockingQueue.poll()).c());
                        size--;
                        if (arrayList.size() >= this.e) {
                            a();
                        }
                    }
                    a();
                    v7i v7iVar = atomicReference.get();
                    if (v7iVar != null) {
                        v7iVar.e();
                        atomicReference.set(null);
                    }
                }
                while (!this.h.isEmpty() && this.m.size() < this.e) {
                    this.m.add(((o7f0) this.h.poll()).c());
                }
                if (this.m.size() >= this.e || System.nanoTime() >= this.g) {
                    a();
                    this.g = System.nanoTime() + this.d;
                }
                if (this.h.isEmpty()) {
                    try {
                        long nanoTime = this.g - System.nanoTime();
                        if (nanoTime > 0) {
                            this.i.set(this.e - this.m.size());
                            this.j.poll(nanoTime, TimeUnit.NANOSECONDS);
                            this.i.set(Integer.MAX_VALUE);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }

    public yu6(n000 n000Var, vjh0 vjh0Var, InternalTelemetryVersion internalTelemetryVersion, long j, int i, int i2, long j2) {
        a aVar = new a(n000Var, vjh0Var, internalTelemetryVersion, j, i2, j2, new ArrayBlockingQueue(i), i);
        this.b = aVar;
        String str = e;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        AtomicInteger atomicInteger = new AtomicInteger();
        Thread newThread = defaultThreadFactory.newThread(aVar);
        newThread.setUncaughtExceptionHandler(new ask.a(newThread.getUncaughtExceptionHandler()));
        try {
            newThread.setDaemon(true);
            newThread.setName(str + "-" + atomicInteger.incrementAndGet());
            newThread.setContextClassLoader(null);
        } catch (SecurityException unused) {
        }
        newThread.start();
    }

    public static zu6 b(TracerOpenTelemetryLogExporter tracerOpenTelemetryLogExporter) {
        return new zu6(tracerOpenTelemetryLogExporter);
    }

    @Override // xsna.o000
    public final v7i forceFlush() {
        Logger logger = a.o;
        return this.b.b();
    }

    @Override // xsna.o000
    public final void onEmit(wmj wmjVar, o7f0 o7f0Var) {
        if (o7f0Var == null) {
            return;
        }
        a aVar = this.b;
        p000 p000Var = aVar.b;
        long j = aVar.n;
        ArrayBlockingQueue arrayBlockingQueue = aVar.h;
        Objects.requireNonNull(arrayBlockingQueue);
        p000Var.c(j, new kb(arrayBlockingQueue, 6));
        if (!arrayBlockingQueue.offer(o7f0Var)) {
            p000Var.a();
        } else if (arrayBlockingQueue.size() >= aVar.i.get()) {
            aVar.j.offer(Boolean.TRUE);
        }
    }

    @Override // xsna.o000
    public final v7i shutdown() {
        if (this.c.getAndSet(true)) {
            return v7i.e;
        }
        Logger logger = a.o;
        a aVar = this.b;
        aVar.getClass();
        v7i v7iVar = new v7i();
        v7i b = aVar.b();
        b.f(new wu6(aVar, b, v7iVar, 0));
        return v7iVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        a aVar = this.b;
        sb.append(aVar.c);
        sb.append(", scheduleDelayNanos=");
        sb.append(aVar.d);
        sb.append(", maxExportBatchSize=");
        sb.append(aVar.e);
        sb.append(", exporterTimeoutNanos=");
        return vu5.a('}', aVar.f, sb);
    }
}
