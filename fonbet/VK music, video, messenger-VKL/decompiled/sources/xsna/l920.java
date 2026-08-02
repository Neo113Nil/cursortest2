package xsna;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: MessageDeflater.kt */
/* loaded from: classes8.dex */
public final class l920 implements Closeable {
    public final boolean b;
    public final vl8 c;
    public final Deflater d;
    public final nsl e;

    public l920(boolean z) {
        this.b = z;
        vl8 vl8Var = new vl8();
        this.c = vl8Var;
        Deflater deflater = new Deflater(-1, true);
        this.d = deflater;
        this.e = new nsl(new d8f0(vl8Var), deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }
}
