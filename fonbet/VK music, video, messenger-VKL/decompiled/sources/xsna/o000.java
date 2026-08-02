package xsna;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: LogRecordProcessor.java */
/* loaded from: classes8.dex */
public interface o000 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default v7i forceFlush() {
        return v7i.e;
    }

    void onEmit(wmj wmjVar, o7f0 o7f0Var);

    default v7i shutdown() {
        return forceFlush();
    }
}
