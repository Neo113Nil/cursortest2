package xsna;

import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: BatchLogRecordProcessorBuilder.java */
/* loaded from: classes8.dex */
public final class zu6 {
    public static final Logger h = Logger.getLogger(zu6.class.getName());
    public final n000 a;
    public long b;
    public final int c;
    public int d;
    public final long e;
    public final vjh0 f;
    public final InternalTelemetryVersion g;

    public zu6(n000 n000Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = timeUnit.toNanos(1000L);
        this.c = 2048;
        this.d = 512;
        this.e = timeUnit.toNanos(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
        this.f = new vjh0();
        this.g = InternalTelemetryVersion.LEGACY;
        Objects.requireNonNull(n000Var, "logRecordExporter");
        this.a = n000Var;
    }

    public final yu6 a() {
        int i = this.d;
        int i2 = this.c;
        if (i > i2) {
            h.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.d)});
            this.d = i2;
        }
        return new yu6(this.a, this.f, this.g, this.b, this.c, this.d, this.e);
    }

    public final void b(int i) {
        myc0.c("maxExportBatchSize must be positive.", i > 0);
        this.d = i;
    }

    public final void c(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        myc0.c("delay must be non-negative", j >= 0);
        this.b = timeUnit.toNanos(j);
    }
}
