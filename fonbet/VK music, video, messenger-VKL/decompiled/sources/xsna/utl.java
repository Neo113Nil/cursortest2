package xsna;

import java.io.OutputStream;
import xsna.vl8;

/* compiled from: DelegateOutputStream.kt */
/* loaded from: classes3.dex */
public final class utl extends OutputStream {
    public vl8.b b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        vl8.b bVar = this.b;
        if (bVar == null) {
            bVar = null;
        }
        bVar.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        vl8.b bVar = this.b;
        if (bVar == null) {
            bVar = null;
        }
        bVar.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
