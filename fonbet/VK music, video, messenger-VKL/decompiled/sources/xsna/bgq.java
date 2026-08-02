package xsna;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.jms0;

/* compiled from: ExternalTextureManager.java */
/* loaded from: classes12.dex */
public final class bgq extends goo0 {
    public static final int[] w = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final int[] x = {1920, 1088};
    public static final long y;
    public final k0u d;
    public mml e;
    public final int f;
    public final Surface g;
    public final SurfaceTexture h;
    public final float[] i;
    public final ConcurrentLinkedQueue j;
    public final ScheduledExecutorService k;
    public final boolean l;
    public int m;
    public int n;
    public boolean o;

    @Nullable
    public hfs p;

    @Nullable
    public hfs q;
    public boolean r;

    @Nullable
    public ScheduledFuture s;

    @Nullable
    public CountDownLatch t;
    public volatile boolean u;

    @Nullable
    public volatile RuntimeException v;

    static {
        y = y2r0.P() ? 20000L : 500L;
    }

    public bgq(k0u k0uVar, final jms0 jms0Var, boolean z, boolean z2) throws VideoFrameProcessingException {
        super(jms0Var);
        this.d = k0uVar;
        this.r = z;
        this.l = z2;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.d();
            int i = iArr[0];
            GlUtil.b(36197, i, 9729);
            this.f = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.h = surfaceTexture;
            this.i = new float[16];
            this.j = new ConcurrentLinkedQueue();
            this.k = Executors.newSingleThreadScheduledExecutor(new q2r0("ExtTexMgr:Timer"));
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: xsna.vfq
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    final bgq bgqVar = bgq.this;
                    jms0Var.f(new jms0.b() { // from class: xsna.yfq
                        @Override // xsna.jms0.b
                        public final void run() {
                            bgq bgqVar2 = bgq.this;
                            a7l.a();
                            if (bgqVar2.r) {
                                ConcurrentLinkedQueue concurrentLinkedQueue = bgqVar2.j;
                                hfs hfsVar = bgqVar2.q;
                                hfsVar.getClass();
                                concurrentLinkedQueue.add(hfsVar);
                            }
                            if (bgqVar2.u) {
                                bgqVar2.h.updateTexImage();
                                bgqVar2.j.poll();
                                if (bgqVar2.t == null || !bgqVar2.j.isEmpty()) {
                                    return;
                                }
                                bgqVar2.t.countDown();
                                return;
                            }
                            if (bgqVar2.o) {
                                ScheduledFuture scheduledFuture = bgqVar2.s;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                bgqVar2.s = null;
                                bgqVar2.s = bgqVar2.k.schedule(new o93(bgqVar2, 15), bgq.y, TimeUnit.MILLISECONDS);
                            }
                            bgqVar2.n++;
                            bgqVar2.r();
                        }
                    }, false);
                }
            });
            this.g = new Surface(surfaceTexture);
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static float q(float f, int i) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 *= 2) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (t(f, i4, i) < t(f, i2, i)) {
                i2 = i4;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = x[i5];
            if (i6 >= i && t(f, i6, i) < t(f, i2, i)) {
                i2 = i6;
            }
        }
        return t(f, i2, i) > 1.0E-9f ? f : i / i2;
    }

    public static float t(float f, int i, int i2) {
        float f2 = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f3 = ((i2 - i3) / i) - f;
            if (Math.abs(f3) < f2) {
                f2 = Math.abs(f3);
            }
        }
        return f2;
    }

    @Override // xsna.o0u.b
    public final void b(r0u r0uVar) {
        this.a.f(new jms0.b() { // from class: xsna.xfq
            @Override // xsna.jms0.b
            public final void run() {
                bgq bgqVar = bgq.this;
                bgqVar.p = null;
                if (!bgqVar.o || !bgqVar.j.isEmpty()) {
                    bgqVar.r();
                    return;
                }
                bgqVar.o = false;
                mml mmlVar = bgqVar.e;
                mmlVar.getClass();
                mmlVar.f();
                a7l.a();
                ScheduledFuture scheduledFuture = bgqVar.s;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                bgqVar.s = null;
            }
        }, true);
    }

    @Override // xsna.goo0
    public final void c() {
        this.u = true;
    }

    @Override // xsna.goo0
    public final void d() throws VideoFrameProcessingException {
        this.m = 0;
        this.p = null;
        this.j.clear();
        this.q = null;
        super.d();
    }

    @Override // xsna.o0u.b
    public final void e() {
        final mml mmlVar = this.e;
        this.a.f(new jms0.b() { // from class: xsna.zfq
            @Override // xsna.jms0.b
            public final void run() {
                pfq pfqVar = mmlVar;
                bgq bgqVar = bgq.this;
                if (pfqVar != bgqVar.e) {
                    return;
                }
                bgqVar.m++;
                bgqVar.r();
            }
        }, true);
    }

    @Override // xsna.goo0
    public final Surface f() {
        return this.g;
    }

    @Override // xsna.goo0
    public final int g() {
        return this.j.size();
    }

    @Override // xsna.goo0
    public final void j(hfs hfsVar) {
        this.q = hfsVar;
        if (!this.r) {
            this.j.add(hfsVar);
        }
        this.a.f(new jms0.b() { // from class: xsna.ufq
            @Override // xsna.jms0.b
            public final void run() {
                bgq.this.u = false;
            }
        }, true);
    }

    @Override // xsna.goo0
    public final void k() {
        this.h.release();
        this.g.release();
        this.k.shutdownNow();
    }

    @Override // xsna.goo0
    public final void l() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.t = countDownLatch;
        this.a.f(new jms0.b() { // from class: xsna.wfq
            @Override // xsna.jms0.b
            public final void run() {
                bgq bgqVar = bgq.this;
                bgqVar.getClass();
                try {
                    bgqVar.s();
                } catch (RuntimeException e) {
                    bgqVar.v = e;
                    ahn.o("ExtTexMgr", "Failed to remove texture frames", e);
                    if (bgqVar.t != null) {
                        bgqVar.t.countDown();
                    }
                }
            }
        }, true);
        try {
            if (!countDownLatch.await(y, TimeUnit.MILLISECONDS)) {
                ahn.F("Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            ahn.F("Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.t = null;
        if (this.v != null) {
            throw this.v;
        }
    }

    @Override // xsna.goo0
    public final void m(hfs hfsVar, boolean z) {
        this.r = z;
        if (z) {
            this.q = hfsVar;
            androidx.media3.common.a aVar = hfsVar.a;
            this.h.setDefaultBufferSize(aVar.u, aVar.v);
        }
    }

    @Override // xsna.goo0
    public final void o(mml mmlVar) {
        this.m = 0;
        this.e = mmlVar;
    }

    @Override // xsna.goo0
    public final void p() {
        this.a.f(new jms0.b() { // from class: xsna.tfq
            @Override // xsna.jms0.b
            public final void run() {
                bgq bgqVar = bgq.this;
                if (bgqVar.r) {
                    bgqVar.u = true;
                }
                if (!bgqVar.j.isEmpty() || bgqVar.p != null) {
                    bgqVar.o = true;
                    ScheduledFuture scheduledFuture = bgqVar.s;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    bgqVar.s = null;
                    bgqVar.s = bgqVar.k.schedule(new o93(bgqVar, 15), bgq.y, TimeUnit.MILLISECONDS);
                    return;
                }
                mml mmlVar = bgqVar.e;
                mmlVar.getClass();
                mmlVar.f();
                a7l.a();
                ScheduledFuture scheduledFuture2 = bgqVar.s;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                }
                bgqVar.s = null;
            }
        }, true);
    }

    public final void r() {
        if (this.m == 0 || this.n == 0 || this.p != null) {
            return;
        }
        this.h.updateTexImage();
        this.n--;
        hfs hfsVar = (hfs) this.j.element();
        this.p = hfsVar;
        this.m--;
        this.h.getTransformMatrix(this.i);
        long timestamp = (this.h.getTimestamp() / 1000) + hfsVar.b;
        if (this.l) {
            float[] fArr = this.i;
            androidx.media3.common.a aVar = hfsVar.a;
            int i = aVar.u;
            int i2 = aVar.v;
            int i3 = fArr.length != 16 ? 1 : 0;
            int[] iArr = w;
            for (int i4 = 0; i4 < 8; i4++) {
                i3 |= Math.abs(fArr[iArr[i4]]) > 1.0E-9f ? 1 : 0;
            }
            int i5 = i3 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f ? 1 : 0);
            char c = '\r';
            char c2 = '\f';
            char c3 = 4;
            if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                r2 = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i5 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
                c2 = '\r';
                c = '\f';
                c3 = 5;
            } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                r11 = -1;
                c = 65535;
                c2 = 65535;
                c3 = 65535;
            } else {
                r11 = 1;
                r2 = i5 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? 1 : 0);
            }
            if (r2 != 0) {
                LinkedHashMap linkedHashMap = a7l.a;
                synchronized (a7l.class) {
                }
            } else {
                float f = fArr[r11];
                float f2 = fArr[c];
                if (Math.abs(f) + 1.0E-9f < 1.0f) {
                    float copySign = Math.copySign(q(Math.abs(f), i), f);
                    float b = u11.b(f, copySign, 0.5f, f2);
                    LinkedHashMap linkedHashMap2 = a7l.a;
                    synchronized (a7l.class) {
                    }
                    fArr[r11] = copySign;
                    fArr[c] = b;
                }
                float f3 = fArr[c3];
                float f4 = fArr[c2];
                if (Math.abs(f3) + 1.0E-9f < 1.0f) {
                    float copySign2 = Math.copySign(q(Math.abs(f3), i2), f3);
                    float b2 = u11.b(f3, copySign2, 0.5f, f4);
                    LinkedHashMap linkedHashMap3 = a7l.a;
                    synchronized (a7l.class) {
                    }
                    fArr[c3] = copySign2;
                    fArr[c2] = b2;
                }
            }
        }
        mml mmlVar = this.e;
        mmlVar.getClass();
        mmlVar.h.e("uTexTransformationMatrix", this.i);
        mml mmlVar2 = this.e;
        mmlVar2.getClass();
        k0u k0uVar = this.d;
        int i6 = this.f;
        androidx.media3.common.a aVar2 = hfsVar.a;
        mmlVar2.c(k0uVar, new r0u(i6, -1, aVar2.u, aVar2.v), timestamp);
        ((hfs) this.j.remove()).getClass();
        a7l.a();
    }

    public final void s() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.n;
            concurrentLinkedQueue = this.j;
            if (i <= 0) {
                break;
            }
            this.n = i - 1;
            this.h.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (this.t == null || !concurrentLinkedQueue.isEmpty()) {
            return;
        }
        this.t.countDown();
    }
}
