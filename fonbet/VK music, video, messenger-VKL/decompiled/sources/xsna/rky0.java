package xsna;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.by;
import one.video.calls.sdk_private.cE;

/* compiled from: StreamOutputStreamImpl.java */
/* loaded from: classes8.dex */
public class rky0 extends lvb0 implements wjy0 {
    public final zjy0 c;
    public final Object d;
    public final bky0 e;
    public final int f;
    public final g6b g;
    public long h;
    public boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile long l;
    public long m;
    public final vjy0 n;
    public volatile boolean o;

    /* compiled from: StreamOutputStreamImpl.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cE.values().length];
            a = iArr;
            try {
                iArr[cE.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cE.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (((r9.a & 3) == 0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r2 = r10.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (((r9.a & 3) == 1) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (((r9.a & 3) == 1) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r2 = r10.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (((r9.a & 3) == 0) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rky0(zjy0 zjy0Var, vjy0 vjy0Var, sp spVar) {
        super(1);
        long j;
        this.d = new Object();
        this.c = zjy0Var;
        this.n = vjy0Var;
        bky0 bky0Var = new bky0();
        this.e = bky0Var;
        this.f = bky0Var.c;
        g6b g6bVar = new g6b();
        g6bVar.b = new ConcurrentLinkedQueue();
        this.g = g6bVar;
        int i = zjy0Var.a;
        synchronized (vjy0Var) {
            try {
                if (!vjy0Var.h.containsKey(Integer.valueOf(i))) {
                    HashMap hashMap = vjy0Var.h;
                    Integer valueOf = Integer.valueOf(i);
                    if (!zjy0Var.d()) {
                        bI bIVar = vjy0Var.a;
                        bI bIVar2 = bI.a;
                        if (bIVar == bIVar2) {
                        }
                        bI bIVar3 = bI.b;
                        if (bIVar == bIVar3) {
                        }
                        if (bIVar == bIVar2) {
                        }
                        if (bIVar == bIVar3) {
                        }
                        throw new by();
                    }
                    j = vjy0Var.e;
                    hashMap.put(valueOf, Long.valueOf(j));
                    vjy0Var.i.put(Integer.valueOf(i), 0L);
                }
                if (i > vjy0Var.k) {
                    vjy0Var.k = i;
                }
            } finally {
            }
        }
        vjy0Var.j.put(Integer.valueOf(zjy0Var.a), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ihy0 q(rky0 rky0Var) {
        cE cEVar;
        int i;
        vjy0 vjy0Var = rky0Var.n;
        zjy0 zjy0Var = rky0Var.c;
        int i2 = zjy0Var.a;
        if (vjy0Var.h.containsKey(Integer.valueOf(i2))) {
            if (((Long) vjy0Var.i.get(Integer.valueOf(i2))).equals(vjy0Var.h.get(Integer.valueOf(i2)))) {
                cEVar = cE.b;
            } else if (vjy0Var.f == vjy0Var.g) {
                cEVar = cE.a;
            }
            i = a.a[cEVar.ordinal()];
            if (i == 1) {
                if (i != 2) {
                    return null;
                }
                long j = vjy0Var.f;
                acy0 acy0Var = new acy0();
                acy0Var.b = j;
                return acy0Var;
            }
            int i3 = zjy0Var.a;
            long j2 = rky0Var.h;
            phy0 phy0Var = new phy0();
            phy0Var.b = i3;
            phy0Var.c = j2;
            return phy0Var;
        }
        cEVar = cE.c;
        i = a.a[cEVar.ordinal()];
        if (i == 1) {
        }
    }

    public static void r(rky0 rky0Var, ihy0 ihy0Var) {
        if (rky0Var.k) {
            return;
        }
        ((ConcurrentLinkedQueue) rky0Var.g.b).add((one.video.calls.sdk_private.w) ihy0Var);
        rky0Var.c.c.g(new gjq(rky0Var, 1), 20, rky0Var.s(), new oky0(rky0Var), true);
    }

    @Override // xsna.wjy0
    public final void c() {
        zjy0 zjy0Var = this.c;
        Objects.toString(zjy0Var);
        zjy0Var.c.g(new gjq(this, 1), 20, s(), new oky0(this), false);
    }

    @Override // xsna.lvb0, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.i || this.o || this.k) {
            return;
        }
        bky0 bky0Var = this.e;
        bky0Var.a.add(bky0Var.b);
        this.i = true;
        synchronized (this.d) {
            try {
                if (!this.j) {
                    this.j = true;
                    this.c.c.g(new gjq(this, 1), 20, s(), new oky0(this), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        v();
    }

    @Override // xsna.lvb0
    public final void h(long j) {
        if (this.i || this.k) {
            return;
        }
        this.k = true;
        this.l = j;
        bky0 bky0Var = this.e;
        bky0Var.a.clear();
        bky0Var.d.set(0);
        this.c.c.g(new Function() { // from class: xsna.nky0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                rky0 rky0Var = rky0.this;
                ((Integer) obj).intValue();
                int i = rky0Var.c.a;
                long j2 = rky0Var.l;
                long j3 = rky0Var.h;
                one.video.calls.sdk_private.v vVar = new one.video.calls.sdk_private.v();
                vVar.b = i;
                vVar.c = j2;
                vVar.d = j3;
                return vVar;
            }
        }, alk.e(j) + alk.e(r1.a) + 1 + 8, aF.d, new kwa0(this, 1), true);
        Thread thread = this.e.g;
        if (thread != null) {
            thread.interrupt();
        }
        this.c.f();
    }

    @Override // xsna.lvb0
    public final void m() {
        this.i = false;
        this.h = 0L;
        bky0 bky0Var = this.e;
        bky0Var.a.clear();
        bky0Var.d.set(0);
        this.j = false;
    }

    @Override // xsna.lvb0
    public final void n() {
        this.n.j.remove(Integer.valueOf(this.c.a));
        vjy0 vjy0Var = this.n;
        zjy0 zjy0Var = this.c;
        vjy0Var.getClass();
        int i = zjy0Var.a;
        synchronized (vjy0Var) {
            vjy0Var.i.remove(Integer.valueOf(i));
            vjy0Var.h.remove(Integer.valueOf(i));
        }
    }

    @Override // xsna.lvb0
    public final void o() {
        this.o = true;
        Thread thread = this.e.g;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public aF s() {
        return aF.d;
    }

    public void t() {
        n();
        this.c.f();
    }

    public final void v() throws IOException {
        if (this.i || this.k) {
            throw new IOException("output stream ".concat(this.i ? "already closed" : "is reset"));
        }
        if (this.o) {
            throw new IOException("output aborted because connection is closed");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        v();
        try {
            int i3 = this.f;
            if (i2 > i3) {
                int i4 = i3 / 2;
                int i5 = i2 / i4;
                for (int i6 = 0; i6 < i5; i6++) {
                    write(bArr, (i6 * i4) + i, i4);
                }
                int i7 = i2 % i4;
                if (i7 > 0) {
                    write(bArr, (i5 * i4) + i, i7);
                    return;
                }
                return;
            }
            bky0 bky0Var = this.e;
            if (i2 > bky0Var.c - bky0Var.d.get()) {
                bky0Var.e.lock();
                bky0Var.g = Thread.currentThread();
                while (bky0Var.c - bky0Var.d.get() < i2) {
                    try {
                        if (!Thread.currentThread().isInterrupted()) {
                            bky0Var.f.await();
                        } else {
                            throw new InterruptedException();
                        }
                    } finally {
                        bky0Var.g = null;
                        bky0Var.e.unlock();
                    }
                }
                bky0Var.g = null;
                bky0Var.e.unlock();
            }
            bky0Var.a.add(ByteBuffer.wrap(Arrays.copyOfRange(bArr, i, i + i2)));
            bky0Var.d.getAndAdd(i2);
            synchronized (this.d) {
                try {
                    if (!this.j) {
                        this.j = true;
                        this.c.c.g(new gjq(this, 1), 20, s(), new oky0(this), true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
            throw new InterruptedIOException("write failed because stream was ".concat(!this.i ? this.k ? "reset" : "aborted" : "closed"));
        }
    }
}
