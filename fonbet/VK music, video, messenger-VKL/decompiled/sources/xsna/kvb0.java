package xsna;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* compiled from: PooledByteBufferInputStream.java */
/* loaded from: classes12.dex */
public final class kvb0 extends InputStream {
    public final PooledByteBuffer b;
    public int c;
    public int d;

    public kvb0(PooledByteBuffer pooledByteBuffer) {
        sex0.a(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.b = pooledByteBuffer;
        this.c = 0;
        this.d = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.size() - this.c;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.d = this.c;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i = this.c;
        this.c = i + 1;
        return this.b.F(i) & 255;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.c = this.d;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        sex0.a(Boolean.valueOf(j >= 0));
        int min = Math.min((int) j, available());
        this.c += min;
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int min = Math.min(available, i2);
            this.b.a(this.c, i, min, bArr);
            this.c += min;
            return min;
        }
        StringBuilder sb = new StringBuilder("length=");
        cgn.a(bArr.length, i, "; regionStart=", "; regionLength=", sb);
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
}
