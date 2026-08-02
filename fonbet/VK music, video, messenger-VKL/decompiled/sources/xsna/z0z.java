package xsna;

import io.opentelemetry.api.common.AttributeType;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* compiled from: LegacyLogRecordProcessorInstrumentation.java */
/* loaded from: classes8.dex */
public final class z0z implements p000 {
    public static final xfx h = xfx.a(AttributeType.STRING, "processorType");
    public static final xfx i = xfx.a(AttributeType.BOOLEAN, "dropped");
    public static final String j = yu6.class.getSimpleName();
    public final Object a = new Object();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Supplier<cj20> c;
    public final jk3 d;
    public final jk3 e;
    public yi20 f;
    public volatile e300 g;

    public z0z(Supplier<cj20> supplier) {
        this.c = supplier;
        Boolean bool = Boolean.FALSE;
        xfx xfxVar = h;
        String str = j;
        xfx xfxVar2 = i;
        this.d = q94.k(xfxVar, str, xfxVar2, bool);
        this.e = q94.k(xfxVar, str, xfxVar2, Boolean.TRUE);
    }

    @Override // xsna.p000
    public final void a() {
        d().add(1, this.e);
    }

    @Override // xsna.p000
    public final void b(int i2, String str) {
        if (str != null) {
            d().add(i2, this.d);
        }
    }

    @Override // xsna.p000
    public final void c(long j2, kb kbVar) {
        if (this.b.compareAndSet(false, true)) {
            if (this.f == null) {
                this.f = this.c.get().get("io.opentelemetry.sdk.logs");
            }
            this.f.gaugeBuilder("queueSize").ofLongs().setDescription("The number of items queued").setUnit("1").buildWithCallback(new y0z(kbVar, 0));
        }
    }

    public final e300 d() {
        e300 e300Var;
        e300 e300Var2 = this.g;
        if (e300Var2 != null) {
            return e300Var2;
        }
        synchronized (this.a) {
            try {
                e300Var = this.g;
                if (e300Var == null) {
                    if (this.f == null) {
                        this.f = this.c.get().get("io.opentelemetry.sdk.logs");
                    }
                    e300Var = this.f.counterBuilder("processedLogs").setUnit("1").setDescription("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").build();
                    this.g = e300Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e300Var;
    }
}
