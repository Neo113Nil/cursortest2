package xsna;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.by;

/* compiled from: StreamManager.java */
/* loaded from: classes8.dex */
public final class mky0 {
    public static final gky0 C = new gky0();
    public long A;
    public long B;
    public final bE b;
    public final ExecutorService c;
    public volatile vjy0 d;
    public final bI e;
    public final sp f;
    public volatile jdy0 g;
    public volatile int h;
    public volatile int i;
    public volatile Long k;
    public volatile Long l;
    public volatile boolean o;
    public volatile boolean p;
    public volatile long q;
    public long r;
    public long s;
    public final AtomicInteger v;
    public final AtomicInteger w;
    public volatile int x;
    public volatile int y;
    public long z;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Semaphore m = new Semaphore(0);
    public final Semaphore n = new Semaphore(0);
    public volatile Consumer<sdy0> j = C;
    public final ReentrantLock t = new ReentrantLock();
    public final ReentrantLock u = new ReentrantLock();

    /* compiled from: StreamManager.java */
    public interface a {
        zjy0 apply(int i);
    }

    public mky0(bE bEVar, bI bIVar, sp spVar, thy0 thy0Var, ExecutorService executorService) {
        this.b = bEVar;
        this.e = bIVar;
        this.f = spVar;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.v = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.w = atomicInteger2;
        bI bIVar2 = bI.a;
        atomicInteger.set(bIVar == bIVar2 ? 0 : 1);
        atomicInteger2.set(bIVar == bIVar2 ? 2 : 3);
        this.x = bIVar != bIVar2 ? 2 : 3;
        this.y = bIVar == bIVar2 ? 1 : 0;
        this.c = executorService;
        e(thy0Var);
    }

    public static int a(int i, bI bIVar, boolean z) {
        if (i < 0) {
            return 0;
        }
        bI bIVar2 = bI.a;
        int i2 = (bIVar == bIVar2 && z) ? 0 : Integer.MIN_VALUE;
        bI bIVar3 = bI.b;
        if (bIVar == bIVar3 && z) {
            i2 = 1;
        }
        if (bIVar == bIVar2 && !z) {
            i2 = 2;
        }
        if (bIVar == bIVar3 && !z) {
            i2 = 3;
        }
        int i3 = (i << 2) + i2;
        if (i3 > 0) {
            return i3;
        }
        return Integer.MAX_VALUE;
    }

    public final zjy0 b(boolean z, long j, TimeUnit timeUnit, a aVar) throws TimeoutException {
        try {
            if (!(z ? this.m : this.n).tryAcquire(j, timeUnit)) {
                throw new TimeoutException();
            }
            int andAdd = z ? this.v.getAndAdd(4) : this.w.getAndAdd(4);
            zjy0 apply = aVar.apply(andAdd);
            this.a.put(Integer.valueOf(andAdd), apply);
            return apply;
        } catch (InterruptedException unused) {
            throw new TimeoutException("operation interrupted");
        }
    }

    public final void c(int i, int i2, Runnable runnable) throws bJ {
        if (i >= i2) {
            for (int i3 = i2; i3 <= i; i3 += 4) {
                zjy0 zjy0Var = new zjy0(i3, this.e, this.b, this, this.d, this.f);
                this.a.put(Integer.valueOf(i3), zjy0Var);
                this.c.submit(new ls2(12, this, zjy0Var));
            }
            runnable.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r4 >= r8.y) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r4 >= r8.x) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(one.video.calls.sdk_private.w wVar) throws bJ {
        final int i = wVar.c;
        zjy0 zjy0Var = (zjy0) this.a.get(Integer.valueOf(i));
        if (zjy0Var == null) {
            int i2 = wVar.c;
            if (j(i2)) {
                int i3 = i2 % 4;
                if (i3 > 1) {
                }
                if (i3 < 2) {
                }
            }
            if (zjy0Var == null) {
                this.z = zjy0Var.a(wVar) + this.z;
                return;
            }
            if (j(i)) {
                int i4 = i % 4;
                if ((i4 <= 1 || i >= this.h) && (i4 >= 2 || i >= this.i)) {
                    throw new bJ(ap$a.STREAM_LIMIT_ERROR);
                }
                if (i4 > 1) {
                    c(i, this.x, new Runnable() { // from class: xsna.kky0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mky0.this.x = i + 4;
                        }
                    });
                } else {
                    c(i, this.y, new Runnable() { // from class: xsna.lky0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mky0.this.y = i + 4;
                        }
                    });
                }
                zjy0 zjy0Var2 = (zjy0) this.a.get(Integer.valueOf(i));
                if (zjy0Var2 != null) {
                    this.z = zjy0Var2.a(wVar) + this.z;
                    return;
                }
                return;
            }
            return;
        }
        long a2 = zjy0Var != null ? zjy0Var.f.a() : 0L;
        if (wVar.f() > a2) {
            if (this.z + (wVar.f() - a2) > this.q) {
                throw new bJ(ap$a.FLOW_CONTROL_ERROR);
            }
        }
        if (zjy0Var == null) {
        }
    }

    public final void e(jdy0 jdy0Var) {
        this.g = jdy0Var;
        int b = jdy0Var.b();
        bI bIVar = this.e;
        bIVar.getClass();
        bI bIVar2 = bI.a;
        this.h = a(b, bIVar == bIVar2 ? bI.b : bIVar2, false);
        int d = jdy0Var.d();
        bI bIVar3 = this.e;
        bIVar3.getClass();
        this.i = a(d, bIVar3 == bIVar2 ? bI.b : bIVar2, true);
        int min = (int) Long.min(2147483647L, jdy0Var.c());
        bI bIVar4 = this.e;
        bIVar4.getClass();
        this.A = a(min, bIVar4 == bIVar2 ? bI.b : bIVar2, false);
        int min2 = (int) Long.min(2147483647L, jdy0Var.e());
        bI bIVar5 = this.e;
        bIVar5.getClass();
        if (bIVar5 == bIVar2) {
            bIVar2 = bI.b;
        }
        this.B = a(min2, bIVar2, true);
        this.q = jdy0Var.f();
        this.r = this.q;
        this.s = this.q / 10;
    }

    public final void f() {
        this.a.values().stream().forEach(new hky0());
    }

    public final void g(int i) {
        this.a.remove(Integer.valueOf(i));
        if (j(i)) {
            try {
                this.t.lock();
                if (!(i % 4 > 1) || this.h + 4 >= this.A) {
                    if ((i % 4 < 2) && this.i + 4 < this.B) {
                        this.i += 4;
                        if (!this.p) {
                            this.b.r().b(new Function() { // from class: xsna.jky0
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return mky0.this.i(((Integer) obj).intValue());
                                }
                            }, 9, aF.d, new iky0(this));
                            this.p = true;
                        }
                    }
                } else {
                    this.h += 4;
                    if (!this.o) {
                        this.b.r().b(new wi7(this, 1), 9, aF.d, new iky0(this));
                        this.o = true;
                    }
                }
                this.t.unlock();
            } catch (Throwable th) {
                this.t.unlock();
                throw th;
            }
        }
    }

    public final ecy0 h(int i) {
        if (i < 9) {
            throw new by();
        }
        try {
            this.t.lock();
            this.o = false;
            this.t.unlock();
            return new ecy0(this.h / 4, false);
        } catch (Throwable th) {
            this.t.unlock();
            throw th;
        }
    }

    public final ecy0 i(int i) {
        if (i < 9) {
            throw new by();
        }
        try {
            this.t.lock();
            this.p = false;
            this.t.unlock();
            return new ecy0(this.i / 4, true);
        } catch (Throwable th) {
            this.t.unlock();
            throw th;
        }
    }

    public final boolean j(int i) {
        return i % 2 == (this.e == bI.a ? 1 : 0);
    }
}
