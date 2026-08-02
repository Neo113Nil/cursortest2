package xsna;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: BufferMemoryChunk.java */
/* loaded from: classes12.dex */
public final class hm8 implements s220, Closeable {
    public ByteBuffer b;
    public final int c;
    public final long d = System.identityHashCode(this);

    public hm8(int i) {
        this.b = ByteBuffer.allocateDirect(i);
        this.c = i;
    }

    @Override // xsna.s220
    public final synchronized ByteBuffer D() {
        return this.b;
    }

    @Override // xsna.s220
    public final synchronized byte F(int i) {
        boolean z = true;
        sex0.f(!isClosed());
        sex0.a(Boolean.valueOf(i >= 0));
        if (i >= this.c) {
            z = false;
        }
        sex0.a(Boolean.valueOf(z));
        this.b.getClass();
        return this.b.get(i);
    }

    @Override // xsna.s220
    public final synchronized int a(int i, int i2, int i3, byte[] bArr) {
        int i4;
        sex0.f(!isClosed());
        this.b.getClass();
        i4 = d02.i(i, i3, this.c);
        d02.m(i, bArr.length, i2, i4, this.c);
        this.b.position(i);
        this.b.get(bArr, i2, i4);
        return i4;
    }

    @Override // xsna.s220
    public final void b(s220 s220Var, int i) {
        s220Var.getClass();
        long m = s220Var.m();
        long j = this.d;
        if (m == j) {
            Long.toHexString(j);
            Long.toHexString(s220Var.m());
            sex0.a(Boolean.FALSE);
        }
        if (s220Var.m() < this.d) {
            synchronized (s220Var) {
                synchronized (this) {
                    h(s220Var, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (s220Var) {
                    h(s220Var, i);
                }
            }
        }
    }

    @Override // xsna.s220
    public final synchronized int c(int i, int i2, int i3, byte[] bArr) {
        int i4;
        sex0.f(!isClosed());
        this.b.getClass();
        i4 = d02.i(i, i3, this.c);
        d02.m(i, bArr.length, i2, i4, this.c);
        this.b.position(i);
        this.b.put(bArr, i2, i4);
        return i4;
    }

    @Override // xsna.s220, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b = null;
    }

    @Override // xsna.s220
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // xsna.s220
    public final int getSize() {
        return this.c;
    }

    public final void h(s220 s220Var, int i) {
        if (!(s220Var instanceof hm8)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        sex0.f(!isClosed());
        hm8 hm8Var = (hm8) s220Var;
        sex0.f(!hm8Var.isClosed());
        this.b.getClass();
        d02.m(0, hm8Var.c, 0, i, this.c);
        this.b.position(0);
        ByteBuffer D = hm8Var.D();
        D.getClass();
        D.position(0);
        byte[] bArr = new byte[i];
        this.b.get(bArr, 0, i);
        D.put(bArr, 0, i);
    }

    @Override // xsna.s220
    public final synchronized boolean isClosed() {
        return this.b == null;
    }

    @Override // xsna.s220
    public final long m() {
        return this.d;
    }
}
