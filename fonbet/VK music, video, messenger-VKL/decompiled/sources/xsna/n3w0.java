package xsna;

import com.github.luben.zstd.ZstdException;
import com.github.luben.zstd.ZstdInputStream;
import com.vk.compression.zstd.VkZstdException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinNothingValueException;

/* compiled from: VkZstdFactory.kt */
/* loaded from: classes17.dex */
public final class n3w0 extends FilterInputStream {
    public final ZstdInputStream b;
    public final /* synthetic */ izs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3w0(InputStream inputStream, izs izsVar, pvn pvnVar) {
        super(inputStream);
        this.c = izsVar;
        this.b = new ZstdInputStream(inputStream, pvnVar);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return this.b.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final void finalize() throws Throwable {
        this.b.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.b.read(bArr, i, i2);
        } catch (Throwable th) {
            th = th;
            if (th instanceof ZstdException) {
                th = new VkZstdException(((ZstdException) th).getErrorCode(), th.getMessage());
            }
            this.c.invoke(th);
            throw new KotlinNothingValueException();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        return this.b.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        return this.b.read();
    }
}
