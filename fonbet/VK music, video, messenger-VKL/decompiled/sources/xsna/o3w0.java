package xsna;

import com.github.luben.zstd.ZstdOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* compiled from: VkZstdFactory.kt */
/* loaded from: classes17.dex */
public final class o3w0 extends FilterOutputStream {
    public final ZstdOutputStream b;

    public o3w0(ByteArrayOutputStream byteArrayOutputStream, pvn pvnVar) {
        super(byteArrayOutputStream);
        this.b = new ZstdOutputStream(byteArrayOutputStream, pvnVar);
    }

    public final void b(byte[] bArr, int i, int i2) throws IOException {
        this.b.write(bArr, i, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final void finalize() throws Throwable {
        this.b.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.b.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.b.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.b.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            b(bArr, i, i2);
        } finally {
        }
    }
}
