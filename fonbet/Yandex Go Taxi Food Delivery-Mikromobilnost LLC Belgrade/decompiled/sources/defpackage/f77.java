package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class f77 extends InputStream {
    public final /* synthetic */ int a = 1;
    public int b = 1073741824;
    public final Object c;

    public f77(InputStream inputStream) {
        this.c = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return ((ByteBuffer) this.c).remaining();
            default:
                return this.b;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 1:
                ((InputStream) this.c).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    this.b = ((ByteBuffer) this.c).position();
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.c;
        switch (i3) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, min);
                return min;
            default:
                int read = ((InputStream) obj).read(bArr, i, i2);
                if (read == -1) {
                    this.b = 0;
                }
                return read;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    int i = this.b;
                    if (i == -1) {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                    ((ByteBuffer) this.c).position(i);
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long min = Math.min(j, byteBuffer.remaining());
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            default:
                return ((InputStream) obj).skip(j);
        }
    }

    public f77(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.a) {
            case 1:
                int read = ((InputStream) this.c).read(bArr);
                if (read == -1) {
                    this.b = 0;
                }
                return read;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
            default:
                int read = ((InputStream) obj).read();
                if (read == -1) {
                    this.b = 0;
                }
                return read;
        }
    }
}
