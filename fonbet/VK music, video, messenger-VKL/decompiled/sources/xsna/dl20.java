package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import xsna.fkh0;

/* compiled from: MetricReader.java */
/* loaded from: classes8.dex */
public interface dl20 extends nb1, x9l, Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws IOException {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // xsna.x9l
    default x71 getDefaultAggregation(InstrumentType instrumentType) {
        return v9l.a;
    }

    default MemoryMode getMemoryMode() {
        return MemoryMode.IMMUTABLE_DATA;
    }

    v7i shutdown();

    void x1(fkh0.b bVar);
}
