package xsna;

import android.os.HandlerThread;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: AudioBufferingHandlerThread.kt */
/* loaded from: classes3.dex */
public final class ml4 extends HandlerThread {
    public final f100 b;
    public final d0s c;
    public final bx80 d;
    public final cn8 e;
    public final ReentrantLock f;
    public final Condition g;
    public final rf7 h;
    public final rf7 i;
    public nl4 j;
    public final int k;
    public is4 l;
    public int m;
    public volatile boolean n;

    public ml4(f100 f100Var, int i, d0s d0sVar, bx80 bx80Var, cn8 cn8Var) {
        super("AudioBufferingHandlerThread", -16);
        this.b = f100Var;
        this.c = d0sVar;
        this.d = bx80Var;
        this.e = cn8Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f = reentrantLock;
        this.g = reentrantLock.newCondition();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        this.h = new rf7(new kl4(i4, this, ml4.class, "isAlive", "isAlive()Z", i2, i3));
        this.i = new rf7(new ll4(i4, this, ml4.class, "isAlive", "isAlive()Z", i2, i3));
        this.k = (int) (i * 0.1f);
    }

    public final void a() {
        if (isInterrupted()) {
            quit();
            return;
        }
        if (this.n) {
            return;
        }
        ByteBuffer byteBuffer = null;
        try {
            is4 is4Var = this.l;
            if (is4Var == null) {
                is4Var = null;
            }
            byteBuffer = is4Var.a(this.m, this.k);
        } catch (Throwable th) {
            this.d.b(th);
            quit();
        }
        if (byteBuffer == null) {
            return;
        }
        byteBuffer.position(0);
        d0s d0sVar = this.c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) d0sVar.a;
        ReentrantLock reentrantLock = (ReentrantLock) d0sVar.b;
        reentrantLock.lock();
        try {
            boolean isEmpty = concurrentLinkedQueue.isEmpty();
            concurrentLinkedQueue.add(byteBuffer);
            if (isEmpty) {
                ((Condition) d0sVar.c).signal();
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            this.m += this.k;
            nl4 c = c();
            if (c != null) {
                c.removeMessages(1);
                c.sendMessage(c.obtainMessage(1));
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        while (this.j == null) {
            try {
                this.g.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        s3q0 s3q0Var = s3q0.a;
        reentrantLock.unlock();
    }

    public final nl4 c() {
        b();
        if (this.n || !isAlive()) {
            return null;
        }
        return this.j;
    }

    public final void d() {
        Looper myLooper = Looper.myLooper();
        nl4 nl4Var = this.j;
        if (!epx.f(myLooper, nl4Var != null ? nl4Var.getLooper() : null)) {
            nl4 c = c();
            if (c != null) {
                c.removeMessages(1);
                c.sendMessage(c.obtainMessage(1));
                return;
            }
            return;
        }
        if (isInterrupted()) {
            quit();
            return;
        }
        if (((ConcurrentLinkedQueue) this.c.a).size() <= 50) {
            is4 is4Var = this.l;
            is4 is4Var2 = is4Var != null ? is4Var : null;
            if (!is4Var2.c || is4Var2.l.d > 0) {
                a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public final void e(rf7 rf7Var, izs<? super nl4, s3q0> izsVar, gzs<s3q0> gzsVar) {
        Looper myLooper = Looper.myLooper();
        nl4 nl4Var = this.j;
        try {
            if (epx.f(myLooper, nl4Var != null ? nl4Var.getLooper() : null)) {
                try {
                    gzsVar.invoke();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (Throwable th) {
                    this.d.b(th);
                    return;
                }
            }
            try {
                ReentrantLock reentrantLock = rf7Var.b;
                reentrantLock.lock();
                try {
                    rf7Var.c = false;
                    nl4 c = c();
                    if (c != null) {
                        izsVar.invoke(c);
                    }
                    while (!rf7Var.c && ((Boolean) rf7Var.a.invoke()).booleanValue()) {
                        rf7Var.d.await();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            } catch (Throwable th3) {
                this.d.b(th3);
            }
        } finally {
            rf7Var.a();
        }
    }

    public final void f() {
        if (this.l == null) {
            return;
        }
        try {
            this.n = true;
            is4 is4Var = this.l;
            if (is4Var == null) {
                is4Var = null;
            }
            f100 f100Var = is4Var.d;
            if (f100Var != null) {
                f100Var.v("AudioPlaybackTrackHandler", "release audio track handler");
            }
            dz4 dz4Var = is4Var.k;
            if (dz4Var != null) {
                dz4Var.e(false, null);
            }
            is4Var.k = null;
            f100 f100Var2 = this.b;
            if (f100Var2 != null) {
                f100Var2.i("AudioBufferingHandlerThread", "successfully released");
            }
        } catch (Throwable th) {
            f100 f100Var3 = this.b;
            if (f100Var3 != null) {
                f100Var3.w("AudioBufferingHandlerThread", mnh0.A(th));
            }
        }
    }

    public final void g() {
        ((ConcurrentLinkedQueue) this.c.a).clear();
        try {
            is4 is4Var = this.l;
            if (is4Var == null) {
                is4Var = null;
            }
            bqk bqkVar = is4Var.l;
            bqkVar.d = 0;
            bqkVar.e = 0;
            bqkVar.f = 0;
            ByteBuffer byteBuffer = bqkVar.c;
            byteBuffer.rewind();
            byteBuffer.limit(byteBuffer.capacity());
            is4Var.c = false;
            is4Var.e.d = false;
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable th) {
            this.d.b(th);
            quit();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        throw r1;
     */
    @Override // android.os.HandlerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f.lock();
        try {
            this.l = (is4) this.e.invoke();
            f100 f100Var = this.b;
            if (f100Var != null) {
                f100Var.i("AudioBufferingHandlerThread", "initialized");
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            this.j = new nl4(getLooper(), new WeakReference(this));
            this.g.signalAll();
            s3q0 s3q0Var2 = s3q0.a;
        }
        this.j = new nl4(getLooper(), new WeakReference(this));
        this.g.signalAll();
        s3q0 s3q0Var22 = s3q0.a;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            super.run();
        } finally {
            f();
        }
    }
}
