package xsna;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: SpanProcessor.java */
/* loaded from: classes8.dex */
public interface fik0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default v7i forceFlush() {
        return v7i.e;
    }

    boolean isEndRequired();

    boolean isStartRequired();

    void onEnd(u7f0 u7f0Var);

    void onStart(wmj wmjVar, q7f0 q7f0Var);

    default v7i shutdown() {
        return forceFlush();
    }
}
