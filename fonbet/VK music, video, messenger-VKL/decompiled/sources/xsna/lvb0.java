package xsna;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PooledByteBufferOutputStream.java */
/* loaded from: classes12.dex */
public abstract class lvb0 extends OutputStream {
    public final /* synthetic */ int b;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.b) {
            case 0:
                try {
                    super.close();
                    return;
                } catch (IOException e) {
                    s200.K(e);
                    throw new RuntimeException(e);
                }
            default:
                super.close();
                return;
        }
    }

    public abstract void h(long j);

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract a320 p();

    public abstract int size();
}
