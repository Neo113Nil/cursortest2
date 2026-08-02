package xsna;

import java.io.Closeable;

/* compiled from: CloseableImage.java */
/* loaded from: classes12.dex */
public interface svf extends Closeable, mjw, kuu {
    mjw B();

    cpe0 R3();

    boolean c4();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    boolean isClosed();

    int u();
}
