package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.a;
import androidx.media3.common.util.GlUtil;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.ok.gpu.SharedEglContext;
import xsna.crl;
import xsna.j3x;
import xsna.jms0;
import xsna.kms0;
import xsna.m6g;
import xsna.s0u;

/* compiled from: DefaultVideoFrameProcessor.java */
/* loaded from: classes12.dex */
public final class crl implements kms0 {
    public static final /* synthetic */ int x = 0;
    public final Context b;
    public final k0u c;
    public final boolean d;
    public final EGLDisplay e;
    public final j3x f;
    public final jms0 g;
    public final kms0.c h;
    public final Executor i;
    public final boolean j;
    public final zgr k;
    public final wwi m;
    public c n;

    @Nullable
    public c o;
    public boolean p;
    public final m6g s;
    public final g7l t;
    public volatile hfs u;
    public volatile boolean v;
    public volatile boolean w;
    public final ArrayList q = new ArrayList();
    public final Object r = new Object();
    public final ArrayList l = new ArrayList();

    /* compiled from: DefaultVideoFrameProcessor.java */
    public static final class b implements kms0.b {
        public final boolean a;

        @Nullable
        public final k0u b;

        @Nullable
        public final ExecutorService c;

        @Nullable
        public final s0u.a d;
        public final int e;
        public final boolean f;
        public final boolean g;

        /* compiled from: DefaultVideoFrameProcessor.java */
        public static final class a {

            @Nullable
            public ExecutorService a;
            public k0u b;
            public s0u.a c;
            public int d;
            public boolean e = true;
            public boolean f = true;
            public boolean g = true;

            public final b a() {
                return new b(!this.e, this.b, this.a, this.c, this.d, this.f, this.g);
            }
        }

        public b(boolean z, k0u k0uVar, ExecutorService executorService, s0u.a aVar, int i, boolean z2, boolean z3) {
            this.a = z;
            this.b = k0uVar;
            this.c = executorService;
            this.d = aVar;
            this.e = i;
            this.f = z2;
            this.g = z3;
        }

        public final a b() {
            a aVar = new a();
            aVar.a = this.c;
            aVar.b = this.b;
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.e = !this.a;
            aVar.f = this.f;
            aVar.g = this.g;
            return aVar;
        }

        @Override // xsna.kms0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final crl a(final Context context, final g7l g7lVar, final m6g m6gVar, final boolean z, final Executor executor, final kms0.c cVar) throws VideoFrameProcessingException {
            ExecutorService executorService;
            ExecutorService executorService2 = this.c;
            if (executorService2 == null) {
                String str = y2r0.a;
                executorService = Executors.newSingleThreadExecutor(new p2r0("Effect:DefaultVideoFrameProcessor:GlThread"));
            } else {
                executorService = executorService2;
            }
            final jms0 jms0Var = new jms0(executorService, executorService2 == null, new h7(cVar, 17));
            k0u k0uVar = this.b;
            final boolean z2 = k0uVar == null || executorService2 == null;
            if (k0uVar == null) {
                k0uVar = new kfl();
            }
            final k0u k0uVar2 = k0uVar;
            try {
                return (crl) executorService.submit(new Callable() { // from class: xsna.drl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Pair create;
                        k0u k0uVar3 = k0uVar2;
                        crl.b bVar = crl.b.this;
                        s0u.a aVar = bVar.d;
                        int i = bVar.e;
                        boolean z3 = bVar.a;
                        boolean z4 = bVar.f;
                        boolean z5 = bVar.g;
                        int i2 = crl.x;
                        EGLDisplay p = GlUtil.p();
                        m6g m6gVar2 = m6gVar;
                        boolean h = m6g.h(m6gVar2);
                        int[] iArr = h ? GlUtil.b : GlUtil.a;
                        try {
                            EGLContext d = k0uVar3.d(p, 3, iArr);
                            create = Pair.create(d, k0uVar3.c(d, p));
                        } catch (GlUtil.GlException unused) {
                            EGLContext d2 = k0uVar3.d(p, 2, iArr);
                            create = Pair.create(d2, k0uVar3.c(d2, p));
                        }
                        Pair pair = create;
                        m6g.a a2 = m6gVar2.a();
                        a2.c = 1;
                        a2.d = null;
                        m6g m6gVar3 = new m6g(a2.a, a2.b, a2.c, a2.e, a2.f, a2.d);
                        if (!h) {
                            m6gVar3 = m6gVar2;
                        }
                        kms0.c cVar2 = cVar;
                        tp1 tp1Var = new tp1(cVar2, 10);
                        Context context2 = context;
                        jms0 jms0Var2 = jms0Var;
                        Executor executor2 = executor;
                        j3x j3xVar = new j3x(context2, m6gVar3, k0uVar3, jms0Var2, executor2, tp1Var, z3, z4, z5);
                        EGLContext eGLContext = (EGLContext) pair.first;
                        EGLSurface eGLSurface = (EGLSurface) pair.second;
                        boolean z6 = z;
                        return new crl(context2, k0uVar3, z2, p, j3xVar, jms0Var2, cVar2, executor2, new zgr(context2, p, eGLContext, eGLSurface, m6gVar2, jms0Var2, executor2, cVar2, aVar, i, z6), z6, m6gVar2, g7lVar, null);
                    }
                }).get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new VideoFrameProcessingException(e);
            } catch (ExecutionException e2) {
                throw new VideoFrameProcessingException(e2);
            }
        }
    }

    /* compiled from: DefaultVideoFrameProcessor.java */
    public static final class c {
        public final int a;
        public final androidx.media3.common.a b;
        public final List<p8p> c;
        public final long d;

        public c(int i, long j, androidx.media3.common.a aVar, List list) {
            this.a = i;
            this.b = aVar;
            this.c = list;
            this.d = j;
        }
    }

    static {
        nr10.a("media3.effect");
    }

    public crl(Context context, k0u k0uVar, boolean z, EGLDisplay eGLDisplay, j3x j3xVar, jms0 jms0Var, kms0.c cVar, Executor executor, zgr zgrVar, boolean z2, m6g m6gVar, g7l g7lVar, @Nullable r1g0 r1g0Var) {
        this.b = context;
        this.c = k0uVar;
        this.d = z;
        this.e = eGLDisplay;
        this.f = j3xVar;
        this.g = jms0Var;
        this.h = cVar;
        this.i = executor;
        this.j = z2;
        this.s = m6gVar;
        this.t = g7lVar;
        this.k = zgrVar;
        wwi wwiVar = new wwi();
        this.m = wwiVar;
        wwiVar.f();
        a aVar = new a(executor, cVar, jms0Var, r1g0Var);
        zgrVar.h.h();
        zgrVar.w = aVar;
    }

    @Override // xsna.kms0
    public final void a(@Nullable final njn0 njn0Var) {
        final zgr zgrVar = this.k;
        zgrVar.getClass();
        try {
            zgrVar.h.c(new jms0.b() { // from class: xsna.rgr
                @Override // xsna.jms0.b
                public final void run() {
                    zgr zgrVar2 = zgr.this;
                    if (zgrVar2.o != null) {
                        return;
                    }
                    njn0 njn0Var2 = zgrVar2.z;
                    njn0 njn0Var3 = njn0Var;
                    if (Objects.equals(njn0Var2, njn0Var3)) {
                        return;
                    }
                    njn0 njn0Var4 = zgrVar2.z;
                    boolean z = true;
                    if (njn0Var4 != null && (njn0Var3 == null || !njn0Var4.a.equals(njn0Var3.a))) {
                        Executor executor = zgrVar2.i;
                        EGLDisplay eGLDisplay = zgrVar2.d;
                        if (zgrVar2.B != null) {
                            try {
                                try {
                                    try {
                                        mml mmlVar = zgrVar2.s;
                                        if (mmlVar != null) {
                                            mmlVar.release();
                                            zgrVar2.s = null;
                                        }
                                        GlUtil.n(eGLDisplay, zgrVar2.e, zgrVar2.f, 1, 1);
                                        GlUtil.m(eGLDisplay, zgrVar2.B);
                                    } catch (GlUtil.GlException e) {
                                        executor.execute(new aw(3, zgrVar2, e));
                                    }
                                } catch (VideoFrameProcessingException e2) {
                                    executor.execute(new aaq(1, zgrVar2, e2));
                                }
                                zgrVar2.B = null;
                            } catch (Throwable th) {
                                zgrVar2.B = null;
                                throw th;
                            }
                        }
                    }
                    njn0 njn0Var5 = zgrVar2.z;
                    if (njn0Var5 != null && njn0Var3 != null && njn0Var5.b == njn0Var3.b && njn0Var5.c == njn0Var3.c && njn0Var5.d == njn0Var3.d) {
                        z = false;
                    }
                    zgrVar2.y = z;
                    zgrVar2.z = njn0Var3;
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zgrVar.i.execute(new sgr(0, zgrVar, e));
        }
    }

    @Override // xsna.kms0
    public final Surface b() {
        SparseArray<j3x.b> sparseArray = this.f.g;
        fxc0.z(y2r0.l(sparseArray, 1));
        return sparseArray.get(1).a.f();
    }

    @Override // xsna.kms0
    public final void c() {
        throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
    }

    @Override // xsna.kms0
    public final boolean d(Bitmap bitmap, k5j k5jVar) {
        boolean hasGainmap;
        fxc0.z(!this.v);
        boolean z = false;
        if (!this.m.e() || this.w) {
            return false;
        }
        if (m6g.h(this.s)) {
            if (Build.VERSION.SDK_INT >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    z = true;
                }
            }
            fxc0.q(z, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        hfs hfsVar = this.u;
        hfsVar.getClass();
        goo0 goo0Var = this.f.j;
        goo0Var.getClass();
        goo0Var.h(bitmap, hfsVar, k5jVar);
        return true;
    }

    @Override // xsna.kms0
    public final void e(final long j) {
        fxc0.A(!this.j, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        this.g.g(new jms0.b() { // from class: xsna.zql
            @Override // xsna.jms0.b
            public final void run() {
                crl crlVar = crl.this;
                zgr zgrVar = crlVar.k;
                k0u k0uVar = crlVar.c;
                ConcurrentLinkedQueue concurrentLinkedQueue = zgrVar.k;
                zgrVar.h.h();
                if (zgrVar.o != null) {
                    return;
                }
                fxc0.z(!zgrVar.p);
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                bwo0 bwo0Var = (bwo0) concurrentLinkedQueue.remove();
                zgrVar.i(k0uVar, bwo0Var.a, bwo0Var.b, j);
                if (concurrentLinkedQueue.isEmpty() && zgrVar.t) {
                    crl.a aVar = zgrVar.w;
                    aVar.getClass();
                    aVar.b();
                    zgrVar.t = false;
                }
            }
        });
    }

    @Override // xsna.kms0
    public final boolean f() {
        fxc0.z(!this.v);
        fxc0.t(this.u, "registerInputStream must be called before registering input frames");
        if (!this.m.e() || this.w) {
            return false;
        }
        goo0 goo0Var = this.f.j;
        goo0Var.getClass();
        goo0Var.j(this.u);
        return true;
    }

    @Override // xsna.kms0
    public final void flush() {
        if (this.f.j != null) {
            this.v = false;
            try {
                goo0 goo0Var = this.f.j;
                goo0Var.getClass();
                goo0Var.c();
                this.g.a();
                goo0Var.l();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                jms0.b bVar = new jms0.b() { // from class: xsna.vql
                    @Override // xsna.jms0.b
                    public final void run() {
                        countDownLatch.countDown();
                    }
                };
                synchronized (goo0Var.b) {
                    goo0Var.c = bVar;
                }
                jms0 jms0Var = this.g;
                final zgr zgrVar = this.k;
                Objects.requireNonNull(zgrVar);
                jms0Var.f(new jms0.b() { // from class: xsna.wql
                    @Override // xsna.jms0.b
                    public final void run() {
                        zgr.this.flush();
                    }
                }, true);
                countDownLatch.await();
                synchronized (goo0Var.b) {
                    goo0Var.c = null;
                }
                jms0 jms0Var2 = this.g;
                final zgr zgrVar2 = this.k;
                Objects.requireNonNull(zgrVar2);
                jms0Var2.c(new jms0.b() { // from class: xsna.xql
                    @Override // xsna.jms0.b
                    public final void run() {
                        zgr zgrVar3 = zgr.this;
                        if (zgrVar3.o != null) {
                            ioo0 ioo0Var = zgrVar3.l;
                            ArrayDeque arrayDeque = ioo0Var.a;
                            ArrayDeque arrayDeque2 = ioo0Var.b;
                            arrayDeque.addAll(arrayDeque2);
                            arrayDeque2.clear();
                            c300 c300Var = zgrVar3.m;
                            c300Var.a = 0;
                            c300Var.b = -1;
                            c300Var.c = 0;
                            c300 c300Var2 = zgrVar3.n;
                            c300Var2.a = 0;
                            c300Var2.b = -1;
                            c300Var2.c = 0;
                        }
                    }
                });
                this.g.c(new jms0.b() { // from class: xsna.yql
                    @Override // xsna.jms0.b
                    public final void run() {
                        crl.this.k();
                    }
                });
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.i.execute(new w63(5, this, e));
            }
        }
    }

    @Override // xsna.kms0
    public final int g() {
        goo0 goo0Var = this.f.j;
        if (goo0Var == null) {
            return 0;
        }
        goo0Var.getClass();
        return goo0Var.g();
    }

    @Override // xsna.kms0
    public final void h() {
        a7l.a();
        fxc0.z(!this.v);
        this.v = true;
        if (this.w) {
            return;
        }
        goo0 goo0Var = this.f.j;
        goo0Var.getClass();
        goo0Var.p();
    }

    @Override // xsna.kms0
    public final void i(int i, long j, androidx.media3.common.a aVar, List list) {
        androidx.media3.common.a aVar2;
        if (this.w) {
            return;
        }
        int i2 = 2;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
        }
        float f = aVar.A;
        if (f > 1.0f) {
            a.C0043a a2 = aVar.a();
            a2.t = (int) (aVar.u * f);
            a2.z = 1.0f;
            aVar2 = new androidx.media3.common.a(a2);
        } else if (f < 1.0f) {
            a.C0043a a3 = aVar.a();
            a3.u = (int) (aVar.v / f);
            a3.z = 1.0f;
            aVar2 = new androidx.media3.common.a(a3);
        } else {
            aVar2 = aVar;
        }
        this.u = new hfs(aVar2, j);
        try {
            this.m.a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.i.execute(new at6(i2, this, e));
        }
        synchronized (this.r) {
            try {
                c cVar = new c(i, j, aVar, list);
                if (this.p) {
                    this.o = cVar;
                    this.m.d();
                    goo0 goo0Var = this.f.j;
                    goo0Var.getClass();
                    goo0Var.p();
                } else {
                    this.p = true;
                    this.m.d();
                    this.g.f(new uql(0, this, cVar), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(c cVar, boolean z) throws VideoFrameProcessingException {
        String glGetString;
        mml mmlVar;
        mml mmlVar2;
        j3x.a aVar;
        boolean z2;
        m6g m6gVar = cVar.b.D;
        m6gVar.getClass();
        m6g m6gVar2 = this.s;
        if (m6g.h(m6gVar)) {
            fxc0.p(m6gVar.a == 6);
        }
        if (m6g.h(m6gVar) || m6g.h(m6gVar2)) {
            try {
                EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, new int[1], 0);
                GlUtil.d();
                if (r4[0] != 3) {
                    throw new VideoFrameProcessingException("OpenGL ES 3.0 context support is required for HDR input or output.");
                }
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.a(C.TIME_UNSET, e);
            }
        }
        fxc0.p(m6gVar.f());
        fxc0.p(m6gVar.c != 1);
        boolean f = m6gVar2.f();
        int i = m6gVar2.a;
        int i2 = m6gVar2.c;
        fxc0.p(f);
        fxc0.p(i2 != 1);
        if (m6g.h(m6gVar) != m6g.h(m6gVar2)) {
            fxc0.p((m6gVar.a == 6 && i != 6 && m6g.h(m6gVar) && (i2 == 10 || i2 == 3)) || (m6gVar.equals(m6g.i) && i == 6 && m6g.h(m6gVar2)));
        }
        if (z || !this.q.equals(cVar.c)) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                ((o0u) this.l.get(i3)).release();
            }
            this.l.clear();
            ImmutableList.a aVar2 = new ImmutableList.a();
            aVar2.e(cVar.c);
            g7l g7lVar = this.t;
            if (g7lVar != g7l.j7) {
                aVar2.c(new f7l(g7lVar, this.s));
            }
            ArrayList arrayList = this.l;
            Context context = this.b;
            com.google.common.collect.g g = aVar2.g();
            m6g m6gVar3 = this.s;
            zgr zgrVar = this.k;
            ImmutableList.a aVar3 = new ImmutableList.a();
            ImmutableList.a aVar4 = new ImmutableList.a();
            ImmutableList.a aVar5 = new ImmutableList.a();
            for (int i4 = 0; i4 < g.e; i4++) {
                p8p p8pVar = (p8p) g.get(i4);
                fxc0.q(p8pVar instanceof c0u, "DefaultVideoFrameProcessor only supports GlEffects");
                c0u c0uVar = (c0u) p8pVar;
                if (c0uVar instanceof j0u) {
                    aVar4.c((j0u) c0uVar);
                } else if (c0uVar instanceof pjg0) {
                    aVar5.c((pjg0) c0uVar);
                } else {
                    boolean h = m6g.h(m6gVar3);
                    com.google.common.collect.g g2 = aVar4.g();
                    com.google.common.collect.g g3 = aVar5.g();
                    if (!g2.isEmpty() || !g3.isEmpty()) {
                        aVar3.c(mml.j(context, g2, g3, h));
                        aVar4 = new ImmutableList.a();
                        aVar5 = new ImmutableList.a();
                    }
                    aVar3.c(c0uVar.a(context, h));
                }
            }
            com.google.common.collect.g g4 = aVar4.g();
            com.google.common.collect.g g5 = aVar5.g();
            zgrVar.h.h();
            ArrayList arrayList2 = zgrVar.b;
            arrayList2.clear();
            arrayList2.addAll(g4);
            ArrayList arrayList3 = zgrVar.c;
            arrayList3.clear();
            arrayList3.addAll(g5);
            zgrVar.x = true;
            arrayList.addAll(aVar3.g());
            ImmutableList.a aVar6 = new ImmutableList.a();
            this.f.i = (o0u) lwx.b(this.l.iterator(), this.k);
            aVar6.e(this.l);
            k0u k0uVar = this.c;
            com.google.common.collect.g g6 = aVar6.g();
            zgr zgrVar2 = this.k;
            jms0 jms0Var = this.g;
            kms0.c cVar2 = this.h;
            Executor executor = this.i;
            ArrayList arrayList4 = new ArrayList(g6);
            arrayList4.add(zgrVar2);
            int i5 = 0;
            while (i5 < arrayList4.size() - 1) {
                o0u o0uVar = (o0u) arrayList4.get(i5);
                i5++;
                o0u o0uVar2 = (o0u) arrayList4.get(i5);
                nra nraVar = new nra(k0uVar, o0uVar, o0uVar2, jms0Var);
                o0uVar.d(nraVar);
                o0uVar.a(executor, new tp1(cVar2, 10));
                o0uVar2.b(nraVar);
            }
            this.q.clear();
            this.q.addAll(cVar.c);
        }
        j3x j3xVar = this.f;
        int i6 = cVar.a;
        hfs hfsVar = new hfs(cVar.b, cVar.d);
        j3xVar.i.getClass();
        SparseArray<j3x.b> sparseArray = j3xVar.g;
        fxc0.x(i6, "Input type not registered: %s", y2r0.l(sparseArray, i6));
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            j3x.a aVar7 = sparseArray.get(sparseArray.keyAt(i7)).c;
            if (aVar7 != null) {
                aVar7.b = false;
            }
        }
        j3x.b bVar = sparseArray.get(i6);
        m6g m6gVar4 = hfsVar.a.D;
        m6gVar4.getClass();
        int i8 = m6gVar4.c;
        m6g m6gVar5 = j3xVar.b;
        Context context2 = j3xVar.a;
        if (i6 != 1) {
            if (i6 == 2 || i6 == 3) {
                com.google.common.collect.g gVar = mml.w;
                fxc0.z(i8 != 2 || i6 == 2);
                boolean h2 = m6g.h(m6gVar4);
                boolean z3 = i6 == 2 && m6gVar5.a == 6;
                androidx.media3.common.util.b l = mml.l(context2, (h2 || z3) ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", z3 ? "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl" : h2 ? "shaders/fragment_shader_transformation_hdr_internal_es3.glsl" : "shaders/fragment_shader_transformation_sdr_internal_es2.glsl");
                if (!z3) {
                    fxc0.p(h2 || i8 == 2 || i8 == 3);
                    l.f("uInputColorTransfer", i8);
                }
                if (h2) {
                    l.f("uApplyHdrToSdrToneMapping", m6gVar5.a != 6 ? 1 : 0);
                }
                com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
                if (i6 == 2) {
                    gVar2 = ImmutableList.p(new lml());
                }
                mmlVar = mml.m(l, m6gVar4, m6gVar5, gVar2);
                Executor executor2 = j3xVar.f;
                tp1 tp1Var = j3xVar.e;
                mmlVar.e = executor2;
                mmlVar.d = tp1Var;
                goo0 goo0Var = bVar.a;
                mmlVar2 = bVar.b;
                if (mmlVar2 != null) {
                    mmlVar2.release();
                }
                bVar.b = mmlVar;
                goo0Var.o(mmlVar);
                mmlVar.b(goo0Var);
                k0u k0uVar2 = j3xVar.c;
                mml mmlVar3 = bVar.b;
                mmlVar3.getClass();
                j3x.a aVar8 = new j3x.a(k0uVar2, mmlVar3, j3xVar.i, j3xVar.d);
                bVar.c = aVar8;
                mml mmlVar4 = bVar.b;
                mmlVar4.getClass();
                mmlVar4.c = aVar8;
                aVar = bVar.c;
                if (aVar != null) {
                    z2 = true;
                } else {
                    z2 = true;
                    aVar.b = true;
                }
                o0u o0uVar3 = j3xVar.i;
                aVar.getClass();
                o0uVar3.b(aVar);
                goo0 goo0Var2 = bVar.a;
                j3xVar.j = goo0Var2;
                goo0Var2.m(hfsVar, i6 != 4 ? z2 : false);
                this.m.f();
                synchronized (this.r) {
                }
                this.i.execute(new nf0(this, cVar));
                c cVar3 = this.n;
                if (cVar3 == null || cVar.b.y != cVar3.b.y) {
                    this.i.execute(new e50(2, this, cVar));
                }
                this.n = cVar;
                return;
            }
            if (i6 != 4) {
                throw new VideoFrameProcessingException(lhg.a(i6, "Unsupported input type "));
            }
        }
        boolean z4 = j3xVar.h;
        com.google.common.collect.g gVar3 = mml.w;
        boolean h3 = m6g.h(m6gVar4);
        androidx.media3.common.util.b l2 = mml.l(context2, h3 ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", h3 ? "shaders/fragment_shader_transformation_external_yuv_es3.glsl" : "shaders/fragment_shader_transformation_sdr_external_es2.glsl");
        if (h3) {
            if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                try {
                    EGLDisplay p = GlUtil.p();
                    EGLContext i9 = GlUtil.i(EGL14.EGL_NO_CONTEXT, p, 2, GlUtil.a);
                    GlUtil.j(i9, p);
                    glGetString = GLES20.glGetString(7939);
                    GlUtil.l(i9, p);
                } catch (GlUtil.GlException unused) {
                }
            } else {
                glGetString = GLES20.glGetString(7939);
            }
            if (glGetString != null && glGetString.contains("GL_EXT_YUV_target")) {
                l2.e("uYuvToRgbColorTransform", m6gVar4.b == 1 ? mml.x : mml.y);
                l2.f("uInputColorTransfer", i8);
                l2.f("uApplyHdrToSdrToneMapping", m6gVar5.a != 6 ? 1 : 0);
            }
            throw new VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
        }
        l2.f = z4;
        mmlVar = mml.m(l2, m6gVar4, m6gVar5, com.google.common.collect.g.f);
        Executor executor22 = j3xVar.f;
        tp1 tp1Var2 = j3xVar.e;
        mmlVar.e = executor22;
        mmlVar.d = tp1Var2;
        goo0 goo0Var3 = bVar.a;
        mmlVar2 = bVar.b;
        if (mmlVar2 != null) {
        }
        bVar.b = mmlVar;
        goo0Var3.o(mmlVar);
        mmlVar.b(goo0Var3);
        k0u k0uVar22 = j3xVar.c;
        mml mmlVar32 = bVar.b;
        mmlVar32.getClass();
        j3x.a aVar82 = new j3x.a(k0uVar22, mmlVar32, j3xVar.i, j3xVar.d);
        bVar.c = aVar82;
        mml mmlVar42 = bVar.b;
        mmlVar42.getClass();
        mmlVar42.c = aVar82;
        aVar = bVar.c;
        if (aVar != null) {
        }
        o0u o0uVar32 = j3xVar.i;
        aVar.getClass();
        o0uVar32.b(aVar);
        goo0 goo0Var22 = bVar.a;
        j3xVar.j = goo0Var22;
        goo0Var22.m(hfsVar, i6 != 4 ? z2 : false);
        this.m.f();
        synchronized (this.r) {
        }
    }

    public final void k() throws VideoFrameProcessingException {
        c cVar;
        this.g.h();
        synchronized (this.r) {
            try {
                cVar = this.o;
                if (cVar != null) {
                    this.o = null;
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            j(cVar, false);
        }
    }

    @Override // xsna.kms0
    public final void release() {
        this.w = true;
        try {
            this.g.e(new jms0.b() { // from class: xsna.arl
                @Override // xsna.jms0.b
                public final void run() {
                    crl crlVar = crl.this;
                    EGLDisplay eGLDisplay = crlVar.e;
                    k0u k0uVar = crlVar.c;
                    boolean z = crlVar.d;
                    ArrayList arrayList = crlVar.l;
                    try {
                        try {
                            crlVar.f.a();
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((o0u) arrayList.get(i)).release();
                            }
                            crlVar.k.release();
                        } catch (Throwable th) {
                            if (z) {
                                try {
                                    k0uVar.e(eGLDisplay);
                                } catch (GlUtil.GlException e) {
                                    ahn.o("DefaultFrameProcessor", "Error releasing GL objects", e);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        ahn.o("DefaultFrameProcessor", "Error releasing shader program", e2);
                    }
                    if (z) {
                        try {
                            k0uVar.e(eGLDisplay);
                        } catch (GlUtil.GlException e3) {
                            ahn.o("DefaultFrameProcessor", "Error releasing GL objects", e3);
                        }
                    }
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    /* compiled from: DefaultVideoFrameProcessor.java */
    public class a {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ kms0.c b;
        public final /* synthetic */ jms0 c;

        public a(Executor executor, kms0.c cVar, jms0 jms0Var, r1g0 r1g0Var) {
            this.a = executor;
            this.b = cVar;
            this.c = jms0Var;
        }

        public final void b() {
            if (crl.this.v) {
                this.a.execute(new n44(this.b, 2));
                a7l.a();
            } else {
                jms0 jms0Var = this.c;
                final crl crlVar = crl.this;
                jms0Var.f(new jms0.b() { // from class: xsna.brl
                    @Override // xsna.jms0.b
                    public final void run() {
                        int i = crl.x;
                        crl.this.k();
                    }
                }, true);
            }
        }

        public final void a(long j) {
        }
    }
}
