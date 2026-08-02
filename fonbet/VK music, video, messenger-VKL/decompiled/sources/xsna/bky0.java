package xsna;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SendBuffer.java */
/* loaded from: classes8.dex */
public final class bky0 {
    public final ReentrantLock e;
    public final Condition f;
    public volatile Thread g;
    public final ByteBuffer b = ByteBuffer.allocate(0);
    public final ConcurrentLinkedDeque a = new ConcurrentLinkedDeque();
    public final int c = 51200;
    public final AtomicInteger d = new AtomicInteger();

    public bky0() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        this.f = reentrantLock.newCondition();
    }
}
