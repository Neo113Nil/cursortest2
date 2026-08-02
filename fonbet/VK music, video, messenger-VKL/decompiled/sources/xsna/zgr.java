package xsna;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import xsna.crl;
import xsna.jms0;
import xsna.kms0;
import xsna.o0u;
import xsna.s0u;

/* compiled from: FinalShaderProgramWrapper.java */
/* loaded from: classes12.dex */
public final class zgr implements o0u, s0u {

    @Nullable
    public EGLSurface B;
    public final Context a;
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final m6g g;
    public final jms0 h;
    public final Executor i;
    public final kms0.c j;
    public final ioo0 l;
    public final c300 m;
    public final c300 n;

    @Nullable
    public final s0u.a o;
    public final boolean p;
    public int q;
    public int r;

    @Nullable
    public mml s;
    public boolean t;
    public jxj0 v;
    public crl.a w;
    public boolean x;
    public boolean y;

    @Nullable
    public njn0 z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public o0u.b u = new ygr();
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public long A = C.TIME_UNSET;

    public zgr(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, m6g m6gVar, jms0 jms0Var, Executor executor, kms0.c cVar, @Nullable s0u.a aVar, int i, boolean z) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = m6gVar;
        this.h = jms0Var;
        this.i = executor;
        this.j = cVar;
        this.o = aVar;
        this.p = z;
        this.l = new ioo0(m6g.h(m6gVar), i);
        this.m = new c300(i);
        this.n = new c300(i);
    }

    @Override // xsna.o0u
    public final void a(Executor executor, tp1 tp1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.o0u
    public final void b(o0u.b bVar) {
        this.h.h();
        this.u = bVar;
        int i = 0;
        while (true) {
            if (i >= (this.o == null ? 1 : this.l.d())) {
                return;
            }
            bVar.e();
            i++;
        }
    }

    @Override // xsna.o0u
    public final void c(k0u k0uVar, r0u r0uVar, final long j) {
        this.h.h();
        long j2 = this.A;
        Executor executor = this.i;
        if (j2 == C.TIME_UNSET) {
            executor.execute(new Runnable() { // from class: xsna.vgr
                @Override // java.lang.Runnable
                public final void run() {
                    zgr.this.j.d(j, false);
                }
            });
        }
        if (this.o != null) {
            fxc0.z(this.l.d() > 0);
            i(k0uVar, r0uVar, j, j * 1000);
            return;
        }
        if (this.p) {
            i(k0uVar, r0uVar, j, j * 1000);
        } else {
            bwo0 bwo0Var = new bwo0(r0uVar, j);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.k;
            concurrentLinkedQueue.add(bwo0Var);
            long j3 = this.A;
            if (j3 != C.TIME_UNSET) {
                if (j == j3) {
                    this.A = C.TIME_UNSET;
                    executor.execute(new wgr(this, j, 0));
                    i(k0uVar, r0uVar, j, System.nanoTime());
                    concurrentLinkedQueue.clear();
                } else {
                    this.u.b(r0uVar);
                }
            }
        }
        this.u.e();
    }

    @Override // xsna.o0u
    public final void d(o0u.c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.o0u
    public final void e(r0u r0uVar) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.o0u
    public final void f() {
        this.h.h();
        if (!this.k.isEmpty()) {
            fxc0.z(!this.p);
            this.t = true;
        } else {
            crl.a aVar = this.w;
            aVar.getClass();
            aVar.b();
            this.t = false;
        }
    }

    @Override // xsna.o0u
    public final void flush() {
        this.h.h();
        this.k.clear();
        int i = 0;
        this.t = false;
        mml mmlVar = this.s;
        if (mmlVar != null) {
            mmlVar.flush();
        }
        this.u.a();
        while (true) {
            if (i >= (this.o == null ? 1 : this.l.d())) {
                return;
            }
            this.u.e();
            i++;
        }
    }

    @Override // xsna.s0u
    public final void g(final long j) {
        this.h.f(new jms0.b() { // from class: xsna.xgr
            @Override // xsna.jms0.b
            public final void run() {
                zgr zgrVar = zgr.this;
                c300 c300Var = zgrVar.m;
                ioo0 ioo0Var = zgrVar.l;
                fxc0.z(zgrVar.o != null);
                while (ioo0Var.d() < ioo0Var.c && c300Var.b() <= j) {
                    ArrayDeque arrayDeque = ioo0Var.b;
                    fxc0.z(!arrayDeque.isEmpty());
                    ioo0Var.a.add((r0u) arrayDeque.remove());
                    c300Var.c();
                    GLES30.glDeleteSync(zgrVar.n.c());
                    GlUtil.d();
                    zgrVar.u.e();
                }
            }
        }, true);
    }

    public final boolean h(k0u k0uVar, int i, int i2) throws VideoFrameProcessingException, GlUtil.GlException {
        boolean z = (this.q == i && this.r == i2 && this.v != null) ? false : true;
        ArrayList arrayList = this.b;
        if (z) {
            this.q = i;
            this.r = i2;
            jxj0 b = wn10.b(i, i2, arrayList);
            if (!Objects.equals(this.v, b)) {
                this.v = b;
                this.i.execute(new ugr(0, this, b));
            }
        }
        this.v.getClass();
        njn0 njn0Var = this.z;
        s0u.a aVar = this.o;
        if (njn0Var == null && aVar == null) {
            fxc0.z(this.B == null);
            mml mmlVar = this.s;
            if (mmlVar != null) {
                mmlVar.release();
                this.s = null;
            }
            ahn.F("Output surface and size not set, dropping frame.");
            return false;
        }
        int i3 = njn0Var == null ? this.v.a : njn0Var.b;
        int i4 = njn0Var == null ? this.v.b : njn0Var.c;
        m6g m6gVar = this.g;
        if (njn0Var != null && this.B == null) {
            this.B = k0uVar.a(this.d, njn0Var.a, m6gVar.c, njn0Var.e);
        }
        if (aVar != null) {
            this.l.c(k0uVar, i3, i4);
        }
        mml mmlVar2 = this.s;
        if (mmlVar2 != null && (this.y || z || this.x)) {
            mmlVar2.release();
            this.s = null;
            this.y = false;
            this.x = false;
        }
        if (this.s == null) {
            njn0 njn0Var2 = this.z;
            int i5 = njn0Var2 == null ? 0 : njn0Var2.d;
            ImmutableList.a aVar2 = new ImmutableList.a();
            aVar2.e(arrayList);
            if (i5 != 0) {
                float f = i5 % 360.0f;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f += 360.0f;
                }
                aVar2.c(new i4h0(f));
            }
            aVar2.c(i2d0.h(i3, i4));
            mml k = mml.k(this.a, aVar2.g(), this.c, m6gVar, 0);
            jxj0 b2 = wn10.b(this.q, this.r, k.i);
            njn0 njn0Var3 = this.z;
            if (njn0Var3 != null) {
                fxc0.z(b2.a == njn0Var3.b);
                fxc0.z(b2.b == njn0Var3.c);
            }
            this.s = k;
            this.y = false;
        }
        return true;
    }

    public final void i(k0u k0uVar, r0u r0uVar, final long j, long j2) {
        r0u r0uVar2;
        zgr zgrVar;
        try {
        } catch (VideoFrameProcessingException e) {
            e = e;
        } catch (GlUtil.GlException e2) {
            e = e2;
        }
        if (j2 != -2) {
            try {
            } catch (VideoFrameProcessingException e3) {
                e = e3;
                zgrVar = this;
                r0uVar2 = r0uVar;
                final Exception exc = e;
                zgrVar.i.execute(new Runnable() { // from class: xsna.tgr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zgr.this.j.a(VideoFrameProcessingException.a(j, exc));
                    }
                });
                zgrVar.u.b(r0uVar2);
                return;
            } catch (GlUtil.GlException e4) {
                e = e4;
                zgrVar = this;
                r0uVar2 = r0uVar;
                final Exception exc2 = e;
                zgrVar.i.execute(new Runnable() { // from class: xsna.tgr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zgr.this.j.a(VideoFrameProcessingException.a(j, exc2));
                    }
                });
                zgrVar.u.b(r0uVar2);
                return;
            }
            if (h(k0uVar, r0uVar.c, r0uVar.d)) {
                long j3 = this.A;
                if (!(j3 != C.TIME_UNSET) || j == j3) {
                    if (this.z != null) {
                        zgrVar = this;
                        r0uVar2 = r0uVar;
                        zgrVar.j(r0uVar2, j, j2);
                    } else {
                        zgrVar = this;
                        r0uVar2 = r0uVar;
                        if (zgrVar.o != null) {
                            k(r0uVar2, j);
                        }
                    }
                    zgrVar.u.b(r0uVar2);
                    return;
                }
            }
        }
        this.u.b(r0uVar);
        if (j2 == -2) {
            crl.a aVar = this.w;
            aVar.getClass();
            aVar.a(j);
        }
    }

    public final void j(r0u r0uVar, long j, long j2) throws VideoFrameProcessingException, GlUtil.GlException {
        EGLSurface eGLSurface = this.B;
        eGLSurface.getClass();
        njn0 njn0Var = this.z;
        njn0Var.getClass();
        mml mmlVar = this.s;
        mmlVar.getClass();
        int i = njn0Var.b;
        int i2 = njn0Var.c;
        EGLDisplay eGLDisplay = this.d;
        GlUtil.n(eGLDisplay, this.e, eGLSurface, i, i2);
        GlUtil.f();
        mmlVar.h(r0uVar.a, j);
        if (j2 == -3) {
            fxc0.z(j != C.TIME_UNSET);
            j2 = 1000 * j;
        }
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j2);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        crl.a aVar = this.w;
        aVar.getClass();
        aVar.a(j);
        a7l.a();
    }

    public final void k(r0u r0uVar, long j) throws GlUtil.GlException, VideoFrameProcessingException {
        r0u f = this.l.f();
        this.m.a(j);
        GlUtil.o(f.b, f.c, f.d);
        GlUtil.f();
        mml mmlVar = this.s;
        mmlVar.getClass();
        mmlVar.h(r0uVar.a, j);
        this.n.a(GlUtil.k());
        s0u.a aVar = this.o;
        aVar.getClass();
        aVar.a(this, f, j);
    }

    @Override // xsna.o0u
    public final void release() throws VideoFrameProcessingException {
        this.h.h();
        mml mmlVar = this.s;
        if (mmlVar != null) {
            mmlVar.release();
            this.s = null;
        }
        try {
            this.l.b();
            GlUtil.m(this.d, this.B);
            GlUtil.d();
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
