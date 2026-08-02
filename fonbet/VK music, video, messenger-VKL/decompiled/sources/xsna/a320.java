package xsna;

import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;

/* compiled from: MemoryPooledByteBuffer.java */
/* loaded from: classes12.dex */
public final class a320 implements PooledByteBuffer {
    public final int b;
    public uvf<s220> c;

    public a320(kcl kclVar, int i) {
        kclVar.getClass();
        if (!(i >= 0 && i <= ((s220) kclVar.r()).getSize())) {
            throw new IllegalArgumentException();
        }
        this.c = kclVar.clone();
        this.b = i;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized ByteBuffer D() {
        this.c.getClass();
        return this.c.r().D();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized byte F(int i) {
        m();
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i < this.b)) {
            throw new IllegalArgumentException();
        }
        this.c.getClass();
        return this.c.r().F(i);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int a(int i, int i2, int i3, byte[] bArr) {
        m();
        if (!(i + i3 <= this.b)) {
            throw new IllegalArgumentException();
        }
        this.c.getClass();
        return this.c.r().a(i, i2, i3, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        uvf.q(this.c);
        this.c = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized long getNativePtr() throws UnsupportedOperationException {
        m();
        this.c.getClass();
        return this.c.r().getNativePtr();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized boolean isClosed() {
        return !uvf.t(this.c);
    }

    public final synchronized void m() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int size() {
        m();
        return this.b;
    }
}
