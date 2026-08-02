package xsna;

import java.nio.ByteBuffer;

/* compiled from: MemoryChunk.kt */
/* loaded from: classes.dex */
public interface s220 {
    ByteBuffer D();

    byte F(int i);

    int a(int i, int i2, int i3, byte[] bArr);

    void b(s220 s220Var, int i);

    int c(int i, int i2, int i3, byte[] bArr);

    void close();

    long getNativePtr() throws UnsupportedOperationException;

    int getSize();

    boolean isClosed();

    long m();
}
