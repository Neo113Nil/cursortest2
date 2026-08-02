package xsna;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import xsna.q04;

/* compiled from: ReusableBufferedOutputStream.java */
/* loaded from: classes12.dex */
public final class pfg0 extends BufferedOutputStream {
    public boolean b;

    public pfg0(q04.a aVar) {
        super(aVar);
    }

    public final void b(OutputStream outputStream) {
        fxc0.z(this.b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        String str = y2r0.a;
        throw th;
    }
}
