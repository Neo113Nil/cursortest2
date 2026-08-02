package xsna;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: AshmemMemoryChunk.java */
@TargetApi(27)
/* loaded from: classes12.dex */
public final class rt3 implements s220, Closeable {
    public SharedMemory b;
    public ByteBuffer c;
    public final long d;

    public rt3(int i) {
        sex0.a(Boolean.valueOf(i > 0));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.b = create;
            this.c = create.mapReadWrite();
            this.d = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    @Override // xsna.s220
    public final ByteBuffer D() {
        return this.c;
    }

    @Override // xsna.s220
    public final synchronized byte F(int i) {
        boolean z = true;
        sex0.f(!isClosed());
        sex0.a(Boolean.valueOf(i >= 0));
        if (i >= getSize()) {
            z = false;
        }
        sex0.a(Boolean.valueOf(z));
        this.c.getClass();
        return this.c.get(i);
    }

    @Override // xsna.s220
    public final synchronized int a(int i, int i2, int i3, byte[] bArr) {
        int i4;
        this.c.getClass();
        i4 = d02.i(i, i3, getSize());
        d02.m(i, bArr.length, i2, i4, getSize());
        this.c.position(i);
        this.c.get(bArr, i2, i4);
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
        this.c.getClass();
        i4 = d02.i(i, i3, getSize());
        d02.m(i, bArr.length, i2, i4, getSize());
        this.c.position(i);
        this.c.put(bArr, i2, i4);
        return i4;
    }

    @Override // xsna.s220, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.b;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.c;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.c = null;
                this.b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.s220
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // xsna.s220
    public final int getSize() {
        this.b.getClass();
        return this.b.getSize();
    }

    public final void h(s220 s220Var, int i) {
        if (!(s220Var instanceof rt3)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        sex0.f(!isClosed());
        rt3 rt3Var = (rt3) s220Var;
        sex0.f(!rt3Var.isClosed());
        this.c.getClass();
        rt3Var.c.getClass();
        d02.m(0, rt3Var.getSize(), 0, i, getSize());
        this.c.position(0);
        rt3Var.c.position(0);
        byte[] bArr = new byte[i];
        this.c.get(bArr, 0, i);
        rt3Var.c.put(bArr, 0, i);
    }

    @Override // xsna.s220
    public final synchronized boolean isClosed() {
        boolean z;
        if (this.c != null) {
            z = this.b == null;
        }
        return z;
    }

    @Override // xsna.s220
    public final long m() {
        return this.d;
    }
}
