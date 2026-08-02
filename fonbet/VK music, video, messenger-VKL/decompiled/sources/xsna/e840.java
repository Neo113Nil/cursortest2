package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.a;
import androidx.media3.common.util.GlUtil;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import xsna.crl;
import xsna.j3x;
import xsna.jms0;
import xsna.kms0;
import xsna.qql;
import xsna.uns0;

/* compiled from: MultipleInputVideoGraph.java */
/* loaded from: classes12.dex */
public final class e840 implements uns0 {
    public final Context a;
    public final m6g b;
    public final f c;
    public final g7l d;
    public final uns0.b e;
    public final Executor f;
    public final SparseArray<kms0> g;
    public final ScheduledExecutorService h;
    public final crl.b i;
    public final ArrayDeque j;
    public final SparseArray<d> k;
    public final boolean l;
    public List<p8p> m;
    public dds0 n;

    @Nullable
    public crl o;

    @Nullable
    public qql p;
    public jxj0 q;
    public boolean r;
    public boolean s;
    public long t;
    public volatile boolean u;

    /* compiled from: MultipleInputVideoGraph.java */
    public class a implements kms0.c {
        public a() {
        }

        @Override // xsna.kms0.c
        public final void a(VideoFrameProcessingException videoFrameProcessingException) {
            e840 e840Var = e840.this;
            e840Var.f.execute(new kw6(6, e840Var, videoFrameProcessingException));
        }

        @Override // xsna.kms0.c
        public final void b(final float f) {
            e840.this.f.execute(new Runnable() { // from class: xsna.d840
                @Override // java.lang.Runnable
                public final void run() {
                    e840.this.e.b(f);
                }
            });
        }

        @Override // xsna.kms0.c
        public final void c(final int i, final int i2) {
            e840.this.f.execute(new Runnable() { // from class: xsna.b840
                @Override // java.lang.Runnable
                public final void run() {
                    e840.this.e.c(i, i2);
                }
            });
        }

        @Override // xsna.kms0.c
        public final void d(final long j, final boolean z) {
            if (j == 0) {
                e840.this.u = true;
            }
            e840 e840Var = e840.this;
            e840Var.t = j;
            e840Var.f.execute(new Runnable() { // from class: xsna.c840
                @Override // java.lang.Runnable
                public final void run() {
                    e840.this.e.d(j, z);
                }
            });
        }

        @Override // xsna.kms0.c
        public final void e() {
            e840.this.o();
        }

        @Override // xsna.kms0.c
        public final void f() {
            e840.this.f.execute(new o63(this, 9));
        }
    }

    /* compiled from: MultipleInputVideoGraph.java */
    public class b {
        public b() {
        }

        public final void a() {
            e840 e840Var = e840.this;
            e840Var.r = true;
            if (!e840Var.j.isEmpty()) {
                e840Var.o();
                return;
            }
            crl crlVar = e840Var.o;
            crlVar.getClass();
            crlVar.h();
        }
    }

    /* compiled from: MultipleInputVideoGraph.java */
    public class c implements kms0.c {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // xsna.kms0.c
        public final void a(VideoFrameProcessingException videoFrameProcessingException) {
            e840 e840Var = e840.this;
            e840Var.f.execute(new kw6(6, e840Var, videoFrameProcessingException));
        }

        @Override // xsna.kms0.c
        public final void f() {
            e840 e840Var = e840.this;
            int i = this.a;
            qql qqlVar = e840Var.p;
            qqlVar.getClass();
            synchronized (qqlVar) {
                try {
                    fxc0.z(y2r0.l(qqlVar.f, i));
                    boolean z = false;
                    fxc0.z(qqlVar.o != -1);
                    qqlVar.f.get(i).b = true;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= qqlVar.f.size()) {
                            z = true;
                            break;
                        } else if (!qqlVar.f.valueAt(i2).b) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    qqlVar.g = z;
                    if (qqlVar.f.get(qqlVar.o).a.isEmpty()) {
                        if (i == qqlVar.o) {
                            qqlVar.c();
                        }
                        if (z) {
                            qqlVar.a.a();
                            return;
                        }
                    }
                    if (i != qqlVar.o && qqlVar.f.get(i).a.size() == 1) {
                        qqlVar.e.f(new oql(qqlVar), true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: MultipleInputVideoGraph.java */
    public static final class d {
        public final s0u a;
        public final long b;

        public d(s0u s0uVar, long j) {
            this.a = s0uVar;
            this.b = j;
        }
    }

    /* compiled from: MultipleInputVideoGraph.java */
    public static final class e implements uns0.a {
        public final kms0.b a;

        public e(kms0.b bVar) {
            this.a = bVar;
        }

        @Override // xsna.uns0.a
        public final uns0 a(Context context, m6g m6gVar, g7l g7lVar, uns0.b bVar, Executor executor, long j, boolean z) {
            return new e840(context, executor, m6gVar, g7lVar, this.a, bVar, z);
        }
    }

    /* compiled from: MultipleInputVideoGraph.java */
    public static final class f implements k0u {
        public final kfl a = new kfl();
        public EGLContext b;

        @Override // xsna.k0u
        public final EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException {
            return this.a.a(eGLDisplay, obj, i, z);
        }

        @Override // xsna.k0u
        public final r0u b(int i, int i2, int i3) throws GlUtil.GlException {
            return this.a.b(i, i2, i3);
        }

        @Override // xsna.k0u
        public final EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException {
            this.a.getClass();
            return GlUtil.j(eGLContext, eGLDisplay);
        }

        @Override // xsna.k0u
        public final EGLContext d(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException {
            if (this.b == null) {
                this.b = this.a.d(eGLDisplay, i, iArr);
            }
            return this.b;
        }

        @Override // xsna.k0u
        public final void e(EGLDisplay eGLDisplay) throws GlUtil.GlException {
            EGLContext eGLContext = this.b;
            if (eGLContext != null) {
                GlUtil.l(eGLContext, eGLDisplay);
            }
        }
    }

    public e840(Context context, Executor executor, m6g m6gVar, g7l g7lVar, kms0.b bVar, uns0.b bVar2, boolean z) {
        fxc0.p(bVar instanceof crl.b);
        this.a = context;
        this.b = m6gVar;
        this.d = g7lVar;
        this.e = bVar2;
        this.f = executor;
        this.l = z;
        this.t = C.TIME_UNSET;
        this.g = new SparseArray<>();
        String str = y2r0.a;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new q2r0("Effect:MultipleInputVideoGraph:Thread"));
        this.h = newSingleThreadScheduledExecutor;
        f fVar = new f();
        this.c = fVar;
        crl.b.a b2 = ((crl.b) bVar).b();
        b2.b = fVar;
        b2.a = newSingleThreadScheduledExecutor;
        this.i = b2.a();
        this.j = new ArrayDeque();
        this.k = new SparseArray<>();
        this.q = jxj0.c;
        ImmutableList.b bVar3 = ImmutableList.c;
        this.m = com.google.common.collect.g.f;
        this.n = dds0.a;
    }

    @Override // xsna.uns0
    public final void a(@Nullable njn0 njn0Var) {
        crl crlVar = this.o;
        crlVar.getClass();
        crlVar.a(njn0Var);
    }

    @Override // xsna.uns0
    public final boolean b(int i, Bitmap bitmap, k5j k5jVar) {
        return n(i).d(bitmap, k5jVar);
    }

    @Override // xsna.uns0
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.uns0
    public final void d(dds0 dds0Var) {
        this.n = dds0Var;
        qql qqlVar = this.p;
        if (qqlVar != null) {
            qqlVar.k = dds0Var;
        }
    }

    @Override // xsna.uns0
    public final void e(long j) {
        crl crlVar = this.o;
        crlVar.getClass();
        crlVar.e(j);
    }

    @Override // xsna.uns0
    public final void f(int i) {
        n(i).h();
    }

    @Override // xsna.uns0
    public final void flush() {
        int i = 0;
        while (true) {
            SparseArray<kms0> sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(sparseArray.keyAt(i)).flush();
            i++;
        }
    }

    @Override // xsna.uns0
    public final void g(List<p8p> list) {
        this.m = list;
    }

    @Override // xsna.uns0
    public final int h(int i) {
        return n(i).g();
    }

    @Override // xsna.uns0
    public final boolean i(int i) {
        return n(i).f();
    }

    @Override // xsna.uns0
    public final void initialize() throws VideoFrameProcessingException {
        fxc0.z(this.g.size() == 0 && this.p == null && this.o == null && !this.s);
        crl a2 = this.i.a(this.a, this.d, this.b, this.l, kzm.INSTANCE, new a());
        this.o = a2;
        com.vk.movika.sdk.base.hooks.f fVar = new com.vk.movika.sdk.base.hooks.f(this, 24);
        SparseArray<j3x.b> sparseArray = a2.f.g;
        fxc0.z(y2r0.l(sparseArray, 3));
        sparseArray.get(3).a.n(fVar);
        qql qqlVar = new qql(this.a, this.c, this.h, new b(), new a840(this, 0));
        this.p = qqlVar;
        qqlVar.k = this.n;
    }

    @Override // xsna.uns0
    public final Surface j(int i) {
        return n(i).b();
    }

    @Override // xsna.uns0
    public final void k(int i, int i2, androidx.media3.common.a aVar, List<p8p> list, long j) {
        n(i).i(i2, j, aVar, list);
    }

    @Override // xsna.uns0
    public final boolean l() {
        return this.u;
    }

    @Override // xsna.uns0
    public final void m(int i) throws VideoFrameProcessingException {
        SparseArray<kms0> sparseArray = this.g;
        fxc0.z(!y2r0.l(sparseArray, i));
        qql qqlVar = this.p;
        qqlVar.getClass();
        synchronized (qqlVar) {
            fxc0.z(!y2r0.l(qqlVar.f, i));
            qqlVar.f.put(i, new qql.c());
            if (qqlVar.o == -1) {
                qqlVar.o = i;
            }
        }
        crl.b.a b2 = this.i.b();
        b2.c = new vur(this, i);
        b2.d = 2;
        sparseArray.put(i, b2.a().a(this.a, g7l.j7, this.b, true, this.f, new c(i)));
    }

    public final kms0 n(int i) {
        SparseArray<kms0> sparseArray = this.g;
        fxc0.z(y2r0.l(sparseArray, i));
        return sparseArray.get(i);
    }

    public final void o() {
        ArrayDeque arrayDeque = this.j;
        bwo0 bwo0Var = (bwo0) arrayDeque.peek();
        if (bwo0Var == null) {
            return;
        }
        r0u r0uVar = bwo0Var.a;
        crl crlVar = this.o;
        crlVar.getClass();
        int i = r0uVar.c;
        int i2 = r0uVar.d;
        jxj0 jxj0Var = this.q;
        if (i != jxj0Var.a || i2 != jxj0Var.b) {
            a.C0043a c0043a = new a.C0043a();
            c0043a.C = this.b;
            c0043a.t = i;
            c0043a.u = i2;
            crlVar.i(3, 0L, new androidx.media3.common.a(c0043a), this.m);
            this.q = new jxj0(i, i2);
        }
        int i3 = r0uVar.a;
        long j = bwo0Var.b;
        fxc0.z(!crlVar.v);
        if (!crlVar.m.e() || crlVar.w) {
            return;
        }
        goo0 goo0Var = crlVar.f.j;
        goo0Var.getClass();
        goo0Var.i(i3, j);
        arrayDeque.remove();
        if (this.r && arrayDeque.isEmpty()) {
            crlVar.h();
        }
    }

    @Override // xsna.uns0
    public final void release() {
        SparseArray<kms0> sparseArray = this.g;
        ScheduledExecutorService scheduledExecutorService = this.h;
        if (this.s) {
            return;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray.get(sparseArray.keyAt(i)).release();
        }
        final qql qqlVar = this.p;
        if (qqlVar != null) {
            synchronized (qqlVar) {
                try {
                    qqlVar.e.e(new jms0.b() { // from class: xsna.nql
                        @Override // xsna.jms0.b
                        public final void run() {
                            qql qqlVar2 = qql.this;
                            try {
                                qql.a aVar = qqlVar2.d;
                                aVar.getClass();
                                try {
                                    androidx.media3.common.util.b bVar = aVar.c;
                                    if (bVar != null) {
                                        GLES20.glDeleteProgram(bVar.a);
                                        GlUtil.d();
                                    }
                                } catch (GlUtil.GlException e2) {
                                    ahn.o("CompositorGlProgram", "Error releasing GL Program", e2);
                                }
                                qqlVar2.h.b();
                                GlUtil.m(qqlVar2.m, qqlVar2.n);
                            } catch (GlUtil.GlException e3) {
                                ahn.o("DefaultVideoCompositor", "Error releasing GL resources", e3);
                            }
                        }
                    });
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e2);
                }
            }
            this.p = null;
        }
        crl crlVar = this.o;
        if (crlVar != null) {
            crlVar.release();
            this.o = null;
        }
        scheduledExecutorService.submit(new vq3(this, 8));
        scheduledExecutorService.shutdown();
        try {
            scheduledExecutorService.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            ahn.n("MultiInputVG", "Thread interrupted while waiting for executor service termination");
        }
        this.s = true;
    }
}
