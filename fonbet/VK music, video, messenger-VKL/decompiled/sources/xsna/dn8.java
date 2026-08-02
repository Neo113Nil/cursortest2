package xsna;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import xsna.dt5;

/* compiled from: BufferingAudioPlaybackTrackHandler.kt */
/* loaded from: classes3.dex */
public final class dn8 {
    public final int a;
    public final int b;
    public final by4 c;
    public final f100 d;
    public final d0s e;
    public final ml4 f;
    public boolean g;
    public a h;
    public ByteBuffer i;
    public ByteBuffer j;
    public final dt5.a k;

    /* compiled from: BufferingAudioPlaybackTrackHandler.kt */
    public static final class a {
        public final ByteBuffer a;
        public final int b;
        public final int c;

        public a(ByteBuffer byteBuffer, int i, int i2) {
            this.a = byteBuffer;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            ByteBuffer byteBuffer = this.a;
            return Integer.hashCode(this.c) + shy.a(this.b, (byteBuffer == null ? 0 : byteBuffer.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LastSampleRequest(byteBuffer=");
            sb.append(this.a);
            sb.append(", startSample=");
            sb.append(this.b);
            sb.append(", count=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public dn8(csp cspVar, ncl nclVar, el4 el4Var, d80 d80Var, int i, int i2, by4 by4Var) {
        this.a = i;
        this.b = i2;
        this.c = by4Var;
        f100 f100Var = cspVar.d;
        this.d = f100Var;
        d0s d0sVar = new d0s();
        this.e = d0sVar;
        ml4 ml4Var = new ml4(cspVar.d, i, d0sVar, by4Var.c, new cn8(this, cspVar, nclVar, el4Var, d80Var, 0));
        ml4Var.start();
        this.f = ml4Var;
        this.j = ByteBuffer.allocate(0);
        this.k = new dt5.a();
        ml4Var.b();
        ml4Var.d();
        if (f100Var != null) {
            f100Var.i("BufferingPlaybackTrackHandler", "initialized");
        }
    }

    public static int f(d0s d0sVar) {
        Integer num = 0;
        Iterator it = ((ConcurrentLinkedQueue) d0sVar.a).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            num = Integer.valueOf(((ByteBuffer) next).remaining() + num.intValue());
        }
        return num.intValue();
    }

    public final boolean a() {
        is4 is4Var;
        ml4 ml4Var = this.f;
        return (!ml4Var.isAlive() || ((is4Var = ml4Var.l) != null && is4Var.c && is4Var.l.d <= 0)) && f(this.e) <= 0;
    }

    public final ByteBuffer b(ByteBuffer byteBuffer) {
        dt5.a aVar = this.k;
        aVar.getClass();
        aVar.f = SystemClock.elapsedRealtime();
        if (a()) {
            return null;
        }
        this.f.d();
        while (byteBuffer.hasRemaining() && !a()) {
            if (Thread.interrupted()) {
                throw new InterruptedException("BufferingPlaybackTrackHandler render thread interrupted");
            }
            d0s d0sVar = this.e;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) d0sVar.a;
            Condition condition = (Condition) d0sVar.c;
            ReentrantLock reentrantLock = (ReentrantLock) d0sVar.b;
            reentrantLock.lock();
            while (concurrentLinkedQueue.isEmpty()) {
                try {
                    condition.await();
                } finally {
                    reentrantLock.unlock();
                }
            }
            Object element = concurrentLinkedQueue.element();
            reentrantLock.unlock();
            ByteBuffer byteBuffer2 = (ByteBuffer) element;
            if (!byteBuffer2.hasRemaining()) {
                reentrantLock.lock();
                while (concurrentLinkedQueue.isEmpty()) {
                    try {
                        condition.await();
                    } finally {
                    }
                }
                concurrentLinkedQueue.remove();
                reentrantLock.unlock();
                reentrantLock.lock();
                while (concurrentLinkedQueue.isEmpty()) {
                    try {
                        condition.await();
                    } finally {
                    }
                }
                Object element2 = concurrentLinkedQueue.element();
                reentrantLock.unlock();
                byteBuffer2 = (ByteBuffer) element2;
            }
            int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
            int limit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer2.position() + min);
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(limit);
        }
        aVar.a();
        byteBuffer.position(0);
        this.i = byteBuffer.duplicate();
        return byteBuffer;
    }

    public final ByteBuffer c(int i, int i2) {
        ByteBuffer h;
        by4 by4Var = this.c;
        m130 m130Var = by4Var.a;
        x3i0 x3i0Var = by4Var.b;
        if (this.g) {
            return null;
        }
        a aVar = this.h;
        if (aVar != null && aVar.b == i) {
            f100 f100Var = this.d;
            if (f100Var != null) {
                f100Var.i("BufferingPlaybackTrackHandler", "return same audio buffer for sample: " + i);
            }
            ByteBuffer byteBuffer = aVar.a;
            if (byteBuffer != null) {
                byteBuffer.position(0);
            }
            return byteBuffer;
        }
        if (x3i0Var != null) {
            x3i0Var.b = SystemClock.elapsedRealtime();
        }
        int i3 = aVar != null ? aVar.b + aVar.c : 0;
        try {
            if (i3 == i) {
                dt5.a aVar2 = (dt5.a) m130Var.invoke();
                if (aVar2 != null) {
                    aVar2.f = SystemClock.elapsedRealtime();
                }
                h = d(i2);
                dt5.a aVar3 = (dt5.a) m130Var.invoke();
                if (aVar3 != null) {
                    aVar3.a();
                }
            } else {
                h = i3 > i ? h(i, i2) : g(i, i2);
            }
            this.h = new a(h != null ? h.duplicate() : null, i, i2);
            if (x3i0Var != null) {
                x3i0Var.d = SystemClock.elapsedRealtime() - x3i0Var.b;
            }
            return h;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final ByteBuffer d(int i) {
        int i2 = i * 2 * this.b;
        ByteBuffer byteBuffer = this.j;
        if (byteBuffer.capacity() < i2) {
            byteBuffer = ByteBuffer.allocate((int) (i2 * 1.5d));
        }
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        this.j = byteBuffer;
        return b(byteBuffer);
    }

    public final ByteBuffer e(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        ml4 ml4Var = this.f;
        ml4Var.e(ml4Var.h, new hl4(i, 0), new il4(ml4Var, i));
        this.i = null;
        return d(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        return d(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ByteBuffer g(int i, int i2) {
        a aVar = this.h;
        int i3 = (i - (aVar != null ? aVar.b + aVar.c : 0)) * 2 * this.b;
        d0s d0sVar = this.e;
        if (i3 >= f(d0sVar)) {
            return e(i, i2);
        }
        while (true) {
            if (i3 <= 0) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException("BufferingPlaybackTrackHandler render thread interrupted");
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) d0sVar.a;
            Condition condition = (Condition) d0sVar.c;
            ReentrantLock reentrantLock = (ReentrantLock) d0sVar.b;
            reentrantLock.lock();
            while (concurrentLinkedQueue.isEmpty()) {
                try {
                    condition.await();
                } finally {
                    reentrantLock.unlock();
                }
            }
            Object element = concurrentLinkedQueue.element();
            reentrantLock.unlock();
            ByteBuffer byteBuffer = (ByteBuffer) element;
            if (!byteBuffer.hasRemaining()) {
                reentrantLock.lock();
                while (concurrentLinkedQueue.isEmpty()) {
                    try {
                        condition.await();
                    } finally {
                    }
                }
                concurrentLinkedQueue.remove();
                reentrantLock.unlock();
                reentrantLock.lock();
                while (concurrentLinkedQueue.isEmpty()) {
                    try {
                        condition.await();
                    } finally {
                    }
                }
                Object element2 = concurrentLinkedQueue.element();
                reentrantLock.unlock();
                byteBuffer = (ByteBuffer) element2;
            }
            if (byteBuffer.remaining() >= i3) {
                wr.c(i3, byteBuffer);
                break;
            }
            int remaining = byteBuffer.remaining();
            byteBuffer.position(byteBuffer.limit());
            i3 -= remaining;
        }
    }

    public final ByteBuffer h(int i, int i2) {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null) {
            return e(i, i2);
        }
        int remaining = byteBuffer.remaining() / 2;
        int i3 = this.b;
        int i4 = remaining / i3;
        a aVar = this.h;
        if (aVar == null) {
            return e(i, i2);
        }
        int i5 = i - ((aVar.b + aVar.c) - i4);
        if (i5 < 0) {
            return e(i, i2);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2 * 2 * i3);
        byteBuffer.position(byteBuffer.position() + (i5 * 2 * i3));
        int min = Math.min(allocate.remaining(), byteBuffer.remaining());
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + min);
        allocate.put(byteBuffer);
        byteBuffer.limit(limit);
        return allocate.hasRemaining() ? b(allocate) : allocate;
    }

    public final void i() {
        if (this.g) {
            return;
        }
        this.g = true;
        ml4 ml4Var = this.f;
        ml4Var.interrupt();
        ml4Var.quit();
        f100 f100Var = this.d;
        if (f100Var != null) {
            StringBuilder sb = new StringBuilder("released, audio request processing time: ");
            dt5.a aVar = this.k;
            sb.append(aVar.b);
            sb.append("<=");
            sb.append(aVar.b().longValue());
            sb.append("<=");
            sb.append(aVar.c);
            f100Var.i("BufferingPlaybackTrackHandler", sb.toString());
        }
    }
}
