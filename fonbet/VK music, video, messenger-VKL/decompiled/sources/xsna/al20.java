package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: MetricExporter.java */
/* loaded from: classes8.dex */
public interface al20 extends nb1, x9l, Closeable {
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    v7i export(Collection<yk20> collection);

    default x71 getDefaultAggregation(InstrumentType instrumentType) {
        return v9l.a;
    }

    default MemoryMode getMemoryMode() {
        return MemoryMode.IMMUTABLE_DATA;
    }

    v7i shutdown();
}
