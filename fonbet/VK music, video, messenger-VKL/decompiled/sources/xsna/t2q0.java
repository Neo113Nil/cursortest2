package xsna;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: UncloseableOutputStream.kt */
/* loaded from: classes12.dex */
public final class t2q0 extends OutputStream {
    public final FileOutputStream b;

    public t2q0(FileOutputStream fileOutputStream) {
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.b.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.b.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.b.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
