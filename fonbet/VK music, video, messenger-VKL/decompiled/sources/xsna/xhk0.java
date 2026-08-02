package xsna;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: SpanExporter.java */
/* loaded from: classes8.dex */
public interface xhk0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    v7i export(Collection<whk0> collection);

    v7i shutdown();
}
