package xsna;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;
import xsna.d9i;

/* compiled from: SemConvLogRecordProcessorInstrumentation.java */
/* loaded from: classes8.dex */
public final class ufi0 implements p000 {
    public final Object a = new Object();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Supplier<cj20> c;
    public final jk3 d;
    public final jk3 e;
    public yi20 f;
    public volatile e300 g;

    public ufi0(d9i d9iVar, Supplier<cj20> supplier) {
        this.c = supplier;
        xfx xfxVar = rfi0.a;
        String str = ((d9i.a) d9iVar).a;
        xfx xfxVar2 = rfi0.b;
        this.d = q94.k(xfxVar, str, xfxVar2, d9iVar.a());
        this.e = jk3.b(xfxVar, ((d9i.a) d9iVar).a, xfxVar2, d9iVar.a(), rfi0.c, "queue_full");
    }

    @Override // xsna.p000
    public final void a() {
        e().add(1, this.e);
    }

    @Override // xsna.p000
    public final void b(int i, String str) {
        jk3 jk3Var = this.d;
        if (str == null) {
            e().add(i, jk3Var);
            return;
        }
        lk3 builder = jk3Var.toBuilder();
        builder.f(rfi0.c, str);
        e().add(i, builder.e());
    }

    @Override // xsna.p000
    public final void c(final long j, final kb kbVar) {
        if (this.b.compareAndSet(false, true)) {
            d().upDownCounterBuilder("otel.sdk.processor.log.queue.capacity").setUnit("{log_record}").setDescription("The maximum number of log records the queue of a given instance of an SDK Log Record processor can hold. ").buildWithCallback(new Consumer() { // from class: xsna.sfi0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((qq70) obj).record(j, ufi0.this.d);
                }
            });
            d().upDownCounterBuilder("otel.sdk.processor.log.queue.size").setUnit("{log_record}").setDescription("The number of log records in the queue of a given instance of an SDK log processor.").buildWithCallback(new Consumer() { // from class: xsna.tfi0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((qq70) obj).record(((Queue) kbVar.c).size(), ufi0.this.d);
                }
            });
        }
    }

    public final yi20 d() {
        if (this.f == null) {
            this.f = this.c.get().get("io.opentelemetry.sdk.logs");
        }
        return this.f;
    }

    public final e300 e() {
        e300 e300Var;
        e300 e300Var2 = this.g;
        if (e300Var2 != null) {
            return e300Var2;
        }
        synchronized (this.a) {
            try {
                e300Var = this.g;
                if (e300Var == null) {
                    e300Var = d().counterBuilder("otel.sdk.processor.log.processed").setUnit("{log_record}").setDescription("The number of log records for which the processing has finished, either successful or failed.").build();
                    this.g = e300Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e300Var;
    }
}
