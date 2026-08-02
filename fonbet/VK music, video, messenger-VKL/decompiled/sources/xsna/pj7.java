package xsna;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: BodyInputStream.kt */
/* loaded from: classes2.dex */
public final class pj7 extends InputStream {
    public final aek b;
    public volatile ByteBuffer e;
    public final ReentrantLock c = new ReentrantLock();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public volatile int f = 1;

    public pj7(aek aekVar) {
        this.b = aekVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.compareAndSet(false, true)) {
            super.close();
            ((k7g0) this.b.a).e();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            while (true) {
                try {
                    int i = 3;
                    byte b = -1;
                    if (this.f >= 3) {
                        return -1;
                    }
                    if (this.d.get()) {
                        this.f = 4;
                        return -1;
                    }
                    if (this.f == 1) {
                        this.e = this.b.b();
                        if (this.e != null) {
                            i = 2;
                        }
                        this.f = i;
                    } else if (this.f != 2) {
                        continue;
                    } else {
                        ByteBuffer byteBuffer = this.e;
                        if (byteBuffer == null) {
                            throw new IllegalStateException("Buffer can't be null with state - " + this.f + "!");
                        }
                        if (byteBuffer.hasRemaining()) {
                            b = byteBuffer.get();
                        }
                        if (b >= 0) {
                            return b;
                        }
                        this.f = 1;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        } catch (Throwable th) {
            this.b.a(th);
            throw null;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            while (true) {
                try {
                    int i3 = 3;
                    int i4 = -1;
                    if (this.f >= 3) {
                        return -1;
                    }
                    if (this.d.get()) {
                        this.f = 4;
                        return -1;
                    }
                    if (this.f == 1) {
                        this.e = this.b.b();
                        if (this.e != null) {
                            i3 = 2;
                        }
                        this.f = i3;
                    } else if (this.f != 2) {
                        continue;
                    } else {
                        ByteBuffer byteBuffer = this.e;
                        if (byteBuffer != null) {
                            int min = Math.min(i2, byteBuffer.remaining());
                            if (min > 0) {
                                byteBuffer.get(bArr, i, min);
                                i4 = min;
                            }
                            if (i4 >= 0) {
                                return i4;
                            }
                            this.f = 1;
                        } else {
                            throw new IllegalStateException("Buffer can't be null with state - " + this.f + "!");
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        } catch (Throwable th) {
            this.b.a(th);
            throw null;
        }
    }
}
