package xsna;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: LogRecordExporter.java */
/* loaded from: classes8.dex */
public interface n000 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    v7i export(Collection<m000> collection);

    v7i shutdown();
}
