package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.qfs;
import xsna.xfs;

/* compiled from: FramePlayerThread.kt */
/* loaded from: classes3.dex */
public final class ufs extends oo50<vfs> {
    public final qfs.a e;
    public final Handler f;
    public m0g0 g;
    public p1t h;
    public lqj0 i;
    public r1t j;
    public r1t k;
    public s1t l;
    public volatile Long m;
    public boolean n;
    public xfs.a o;
    public xfs.a p;
    public volatile long q;
    public volatile Long r;
    public np4 s;
    public rva0 t;
    public final q1t u = new q1t();
    public volatile boolean v;

    public ufs(qfs.a aVar, Handler handler) {
        this.e = aVar;
        this.f = handler;
        new Size(0, 0);
    }

    @Override // xsna.oo50
    public final void c() {
        p1t p1tVar = this.h;
        if (p1tVar != null) {
            p1tVar.a(new dof(this, 24));
        }
        p1t p1tVar2 = this.h;
        if (p1tVar2 != null) {
            p1tVar2.b();
        }
        this.h = null;
        m0g0 m0g0Var = this.g;
        if (m0g0Var != null) {
            m0g0Var.f();
        }
        this.g = null;
    }

    public final void d() {
        r1t r1tVar;
        lqj0 lqj0Var;
        s1t s1tVar;
        if (isInterrupted()) {
            quit();
        }
        if (this.o == null || (r1tVar = this.j) == null || (lqj0Var = this.i) == null || (s1tVar = this.l) == null) {
            return;
        }
        s1tVar.a(new ysq(lqj0Var, r1tVar, this, s1tVar, 1));
        if (this.n) {
            return;
        }
        l(new wqf(this, 20));
        this.n = true;
    }

    public final void e() {
        rva0 rva0Var;
        ufs ufsVar;
        xfs.a aVar;
        if (isInterrupted()) {
            quit();
        }
        r1t r1tVar = this.j;
        this.j = this.k;
        this.k = r1tVar;
        this.o = this.p;
        this.p = null;
        rva0 rva0Var2 = this.t;
        rva0 rva0Var3 = rva0Var2 != null ? rva0Var2 : null;
        if (rva0Var3 == null) {
            d();
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d();
            rva0Var3.a.b(SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        if (isInterrupted()) {
            quit();
        }
        xfs.a aVar2 = this.o;
        if (aVar2 != null) {
            int i = aVar2.b + 1;
            r1t r1tVar2 = this.k;
            if (r1tVar2 != null && (rva0Var = this.t) != null) {
                p1t p1tVar = this.h;
                if (p1tVar != null) {
                    ufsVar = this;
                    p1tVar.a(new rfs(i, 0, r1tVar2, ufsVar, rva0Var));
                } else {
                    ufsVar = this;
                }
                if (ufsVar.p == null) {
                    long f = ufsVar.q - f();
                    if (ufsVar.v) {
                        return;
                    }
                    vfs a = a();
                    a.sendMessageDelayed(a.obtainMessage(6), f);
                    return;
                }
                if (ufsVar.v || (aVar = ufsVar.p) == null) {
                    return;
                }
                vfs a2 = a();
                synchronized (a2.b) {
                    if (!a2.hasMessages(2)) {
                        a2.sendMessageDelayed(a2.obtainMessage(1), g(aVar));
                        s3q0 s3q0Var = s3q0.a;
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
        }
    }

    public final long f() {
        long j;
        Long l = this.r;
        if (l == null) {
            Long l2 = this.m;
            if (l2 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
            } else {
                l = null;
            }
            if (l == null) {
                j = 0;
                return swe0.i(j, 0L, this.q);
            }
        }
        j = l.longValue();
        return swe0.i(j, 0L, this.q);
    }

    public final long g(xfs.a aVar) {
        Long l = this.m;
        if (l != null) {
            return (l.longValue() + aVar.a) - SystemClock.elapsedRealtime();
        }
        return 0L;
    }

    public final void h() {
        if (!b()) {
            vfs a = a();
            a.removeMessages(1);
            a.removeMessages(6);
            a.sendMessage(a.obtainMessage(3));
            return;
        }
        if (isInterrupted()) {
            quit();
        }
        if (this.v) {
            return;
        }
        np4 np4Var = this.s;
        if (np4Var != null) {
            np4Var.c.pause();
        }
        this.r = Long.valueOf(f());
        this.v = true;
        l(new trf(this, 25));
    }

    public final void i(final fgs fgsVar, final long j, final boolean z) {
        if (!b()) {
            a().post(new Runnable() { // from class: xsna.tfs
                @Override // java.lang.Runnable
                public final void run() {
                    ufs.this.i(fgsVar, j, z);
                }
            });
            return;
        }
        if (isInterrupted()) {
            quit();
        }
        this.n = false;
        this.v = z;
        this.r = this.v ? Long.valueOf(j) : null;
        rva0 rva0Var = this.t;
        if (rva0Var != null) {
            rva0Var.c();
        }
        np4 np4Var = this.s;
        if (np4Var != null) {
            np4Var.c.release();
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        rva0 rva0Var2 = fgsVar.d;
        p1t p1tVar = this.h;
        if (p1tVar != null) {
            p1tVar.a(new y4(11, ref$BooleanRef, rva0Var2));
        }
        if (ref$BooleanRef.element) {
            this.q = rva0Var2.a.getDurationUs();
            qva0 qva0Var = rva0Var2.a;
            Size size = new Size(qva0Var.getWidth(), qva0Var.getHeight());
            p1t p1tVar2 = this.h;
            if (p1tVar2 != null) {
                p1tVar2.a(new cm(14, this, size));
            }
            np4 np4Var2 = new np4(rva0Var2.a.c(), rva0Var2.a.d());
            np4Var2.b(j);
            if (!z) {
                np4Var2.c.play();
            }
            this.s = np4Var2;
            l(new sje(this, size));
        }
        this.t = rva0Var2;
        if (!ref$BooleanRef.element) {
            l(new ni0(4, this, fgsVar));
            this.t = null;
            return;
        }
        if (isInterrupted()) {
            quit();
        }
        p1t p1tVar3 = this.h;
        if (p1tVar3 != null) {
            p1tVar3.a(new sfs(this, j));
        }
        e();
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        np4 np4Var;
        int i;
        rva0 rva0Var = this.t;
        if (rva0Var == null || (np4Var = this.s) == null) {
            return;
        }
        gl4 gl4Var = np4Var.g;
        int i2 = gl4Var.e - gl4Var.d;
        int i3 = np4Var.d;
        int i4 = np4Var.e - (i2 / i3);
        if (i4 > 0) {
            ByteBuffer e = rva0Var.a.e(np4Var.h, i4);
            if (e != null) {
                if (!e.hasRemaining()) {
                    e = null;
                }
                if (e != null) {
                    int remaining = e.remaining() / i3;
                    int i5 = gl4Var.a;
                    int i6 = gl4Var.e;
                    if (i6 < i5) {
                        gl4Var.b.position(i6);
                        gl4Var.b.limit(i5);
                        try {
                            int i7 = gl4Var.e;
                            ByteBuffer byteBuffer = gl4Var.b;
                            int min = Math.min(byteBuffer.remaining(), e.remaining());
                            e.get(byteBuffer.array(), byteBuffer.position(), min);
                            byteBuffer.position(byteBuffer.position() + min);
                            gl4Var.e = i7 + min;
                        } catch (BufferOverflowException e2) {
                            e2.printStackTrace();
                        }
                        if (gl4Var.e >= i5) {
                            i = 0;
                        }
                        np4Var.h += remaining;
                    } else {
                        i = i6 - i5;
                    }
                    gl4Var.c.position(i);
                    gl4Var.c.limit(i5);
                    int i8 = gl4Var.e;
                    ByteBuffer byteBuffer2 = gl4Var.c;
                    int min2 = Math.min(byteBuffer2.remaining(), e.remaining());
                    e.get(byteBuffer2.array(), byteBuffer2.position(), min2);
                    byteBuffer2.position(byteBuffer2.position() + min2);
                    gl4Var.e = min2 + i8;
                    np4Var.h += remaining;
                }
            }
            if (this.v) {
                vfs a = a();
                if (a.hasMessages(5)) {
                    return;
                }
                a.sendMessageDelayed(a.obtainMessage(5), 50L);
                return;
            }
            return;
        }
        gl4Var.a(np4Var.c);
        if (this.v) {
        }
    }

    public final void k() {
        Long l;
        if (!b()) {
            vfs a = a();
            a.sendMessage(a.obtainMessage(4));
            return;
        }
        if (isInterrupted()) {
            quit();
        }
        if (this.v) {
            this.v = false;
            np4 np4Var = this.s;
            if (np4Var != null) {
                np4Var.c.play();
            }
            j();
            Long l2 = this.r;
            if (l2 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
            } else {
                l = null;
            }
            this.m = l;
            this.r = null;
            l(new b1h(this, 17));
            xfs.a aVar = this.p;
            if (aVar != null) {
                long g = g(aVar);
                vfs a2 = a();
                a2.sendMessageDelayed(a2.obtainMessage(1), g);
            } else {
                long f = this.q - f();
                vfs a3 = a();
                a3.sendMessageDelayed(a3.obtainMessage(6), f);
            }
        }
    }

    public final void l(gzs<s3q0> gzsVar) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.f;
        if (epx.f(myLooper, handler.getLooper())) {
            gzsVar.invoke();
        } else {
            handler.post(new com.vk.movika.sdk.android.defaultplayer.container.d(1, gzsVar));
        }
    }

    public final void m(long j) {
        if (!b()) {
            vfs a = a();
            synchronized (a.b) {
                a.removeMessages(1);
                a.removeMessages(2);
                a.removeMessages(6);
                a.sendMessage(a.obtainMessage(2, Long.valueOf(j)));
            }
            this.m = this.m != null ? Long.valueOf(SystemClock.elapsedRealtime() - j) : null;
            if (this.v) {
                this.r = Long.valueOf(j);
                return;
            }
            return;
        }
        if (isInterrupted()) {
            quit();
        }
        np4 np4Var = this.s;
        if (np4Var != null) {
            np4Var.b(j);
        }
        j();
        if (isInterrupted()) {
            quit();
        }
        p1t p1tVar = this.h;
        if (p1tVar != null) {
            p1tVar.a(new sfs(this, j));
        }
        e();
    }

    public final void n(Surface surface) {
        m0g0 m0g0Var;
        p1t p1tVar;
        if (!b()) {
            a().post(new vrl(2, this, surface));
            return;
        }
        if (isInterrupted()) {
            quit();
        }
        s1t s1tVar = this.l;
        if (epx.f(s1tVar != null ? (Surface) s1tVar.a : null, surface) || (m0g0Var = this.g) == null || (p1tVar = this.h) == null) {
            return;
        }
        this.n = false;
        p1tVar.a(new hor(this, surface, m0g0Var, p1tVar));
    }
}
