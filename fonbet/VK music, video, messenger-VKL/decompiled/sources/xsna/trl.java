package xsna;

import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DefaultZstdRecyclingBufferPool.kt */
/* loaded from: classes17.dex */
public final class trl implements m3w0 {
    public static final bpn0 d = new bpn0(new pr6(9));
    public final int a;
    public final ReentrantLock b = new ReentrantLock();
    public final sk3<ByteBuffer> c;

    /* compiled from: DefaultZstdRecyclingBufferPool.kt */
    public static final class a {
    }

    public trl(int i) {
        this.a = i;
        this.c = new sk3<>(i);
    }

    @Override // xsna.m3w0
    public final ByteBuffer get(int i) {
        bpn0 bpn0Var = d;
        if (i > ((Number) bpn0Var.getValue()).intValue()) {
            StringBuilder b = ji.b(i, "Unsupported buffer size: ", ". Supported buffer sizes: ");
            b.append(((Number) bpn0Var.getValue()).intValue());
            b.append(" or smaller.");
            throw new IllegalStateException(b.toString());
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ByteBuffer l = this.c.l();
            if (l == null) {
                l = ByteBuffer.allocate(((Number) bpn0Var.getValue()).intValue());
            }
            return l;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.m3w0
    public final void release(ByteBuffer byteBuffer) {
        sk3<ByteBuffer> sk3Var = this.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            byteBuffer.clear();
            if (sk3Var.size() < this.a) {
                sk3Var.addLast(byteBuffer);
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
