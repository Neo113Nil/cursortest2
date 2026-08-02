package xsna;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import xsna.dds0;
import xsna.e840;
import xsna.jms0;
import xsna.qql;

/* compiled from: DefaultVideoCompositor.java */
/* loaded from: classes12.dex */
public final class qql implements s0u {
    public final e840.b a;
    public final a840 b;
    public final k0u c;
    public final a d;
    public final jms0 e;
    public boolean g;
    public m6g l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;
    public final SparseArray<c> f = new SparseArray<>();
    public final ioo0 h = new ioo0(false, 1);
    public final c300 i = new c300(1);
    public final c300 j = new c300(1);
    public dds0 k = dds0.a;

    /* compiled from: DefaultVideoCompositor.java */
    public static final class a {
        public final Context a;
        public final t290 b = new t290();
        public androidx.media3.common.util.b c;

        public a(Context context) {
            this.a = context;
        }

        public final void a(com.google.common.collect.g gVar, r0u r0uVar) throws GlUtil.GlException, VideoFrameProcessingException {
            a aVar = this;
            com.google.common.collect.g gVar2 = gVar;
            if (aVar.c == null) {
                try {
                    androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(aVar.a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                    aVar.c = bVar;
                    bVar.c(new float[]{-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f});
                    aVar.c.e("uTexTransformationMatrix", GlUtil.g());
                } catch (IOException e) {
                    throw new VideoFrameProcessingException(e);
                }
            }
            int i = r0uVar.b;
            int i2 = r0uVar.d;
            int i3 = r0uVar.c;
            GlUtil.o(i, i3, i2);
            jxj0 jxj0Var = new jxj0(i3, i2);
            t290 t290Var = aVar.b;
            t290Var.j = jxj0Var;
            GlUtil.f();
            androidx.media3.common.util.b bVar2 = aVar.c;
            bVar2.getClass();
            GLES20.glUseProgram(bVar2.a);
            GlUtil.d();
            int i4 = 3042;
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            GlUtil.d();
            int i5 = gVar2.e - 1;
            while (i5 >= 0) {
                b bVar3 = (b) gVar2.get(i5);
                androidx.media3.common.util.b bVar4 = aVar.c;
                bVar4.getClass();
                r0u r0uVar2 = bVar3.b.a;
                bVar4.g(r0uVar2.a, 0, "uTexSampler");
                jxj0 jxj0Var2 = new jxj0(r0uVar2.c, r0uVar2.d);
                float[] fArr = t290Var.b;
                Matrix.setIdentityM(fArr, 0);
                float[] fArr2 = t290Var.a;
                Matrix.setIdentityM(fArr2, 0);
                float[] fArr3 = t290Var.e;
                Matrix.setIdentityM(fArr3, 0);
                float[] fArr4 = t290Var.c;
                Matrix.setIdentityM(fArr4, 0);
                float[] fArr5 = t290Var.d;
                Matrix.setIdentityM(fArr5, 0);
                Matrix.setIdentityM(t290Var.f, 0);
                float[] fArr6 = t290Var.g;
                Matrix.setIdentityM(fArr6, 0);
                float[] fArr7 = t290Var.h;
                Matrix.setIdentityM(fArr7, 0);
                float[] fArr8 = t290Var.i;
                Matrix.setIdentityM(fArr8, 0);
                int i6 = i4;
                Pair<Float, Float> pair = b390.a;
                Matrix.translateM(fArr2, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                t290Var.j.getClass();
                float f = jxj0Var2.a;
                jxj0 jxj0Var3 = t290Var.j;
                float f2 = jxj0Var2.b;
                Matrix.scaleM(fArr, 0, f / jxj0Var3.a, f2 / jxj0Var3.b, 1.0f);
                Pair<Float, Float> pair2 = b390.c;
                Matrix.scaleM(fArr4, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
                Matrix.invertM(fArr5, 0, fArr4, 0);
                Pair<Float, Float> pair3 = b390.b;
                Matrix.translateM(fArr3, 0, ((Float) pair3.first).floatValue() * (-1.0f), ((Float) pair3.second).floatValue() * (-1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Matrix.rotateM(t290Var.f, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                Matrix.scaleM(fArr6, 0, f2 / f, 1.0f, 1.0f);
                Matrix.invertM(fArr7, 0, fArr6, 0);
                float[] fArr9 = t290Var.i;
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, t290Var.a, 0);
                float[] fArr10 = t290Var.i;
                Matrix.multiplyMM(fArr10, 0, fArr10, 0, t290Var.b, 0);
                float[] fArr11 = t290Var.i;
                Matrix.multiplyMM(fArr11, 0, fArr11, 0, t290Var.c, 0);
                float[] fArr12 = t290Var.i;
                Matrix.multiplyMM(fArr12, 0, fArr12, 0, t290Var.e, 0);
                float[] fArr13 = t290Var.i;
                Matrix.multiplyMM(fArr13, 0, fArr13, 0, t290Var.d, 0);
                float[] fArr14 = t290Var.i;
                Matrix.multiplyMM(fArr14, 0, fArr14, 0, t290Var.g, 0);
                float[] fArr15 = t290Var.i;
                Matrix.multiplyMM(fArr15, 0, fArr15, 0, t290Var.f, 0);
                float[] fArr16 = t290Var.i;
                Matrix.multiplyMM(fArr16, 0, fArr16, 0, t290Var.h, 0);
                float[] fArr17 = t290Var.i;
                Matrix.multiplyMM(fArr17, 0, fArr17, 0, t290Var.c, 0);
                bVar4.e("uTransformationMatrix", fArr8);
                bVar4.d("uAlphaScale", 1.0f);
                bVar4.b();
                GLES20.glDrawArrays(5, 0, 4);
                GlUtil.d();
                i5--;
                aVar = this;
                gVar2 = gVar;
                i4 = i6;
            }
            GLES20.glDisable(i4);
            GlUtil.d();
        }
    }

    /* compiled from: DefaultVideoCompositor.java */
    public static final class b {
        public final s0u a;
        public final bwo0 b;

        public b(s0u s0uVar, bwo0 bwo0Var, cds0 cds0Var) {
            this.a = s0uVar;
            this.b = bwo0Var;
        }
    }

    /* compiled from: DefaultVideoCompositor.java */
    public static final class c {
        public final ArrayDeque a = new ArrayDeque();
        public boolean b;
    }

    public qql(Context context, e840.f fVar, ScheduledExecutorService scheduledExecutorService, e840.b bVar, a840 a840Var) {
        this.a = bVar;
        this.b = a840Var;
        this.c = fVar;
        this.d = new a(context);
        jms0 jms0Var = new jms0(scheduledExecutorService, false, new vx6(bVar, 10));
        this.e = jms0Var;
        jms0Var.f(new jms0.b() { // from class: xsna.pql
            @Override // xsna.jms0.b
            public final void run() {
                qql qqlVar = qql.this;
                qqlVar.getClass();
                EGLDisplay p = GlUtil.p();
                qqlVar.m = p;
                k0u k0uVar = qqlVar.c;
                qqlVar.n = k0uVar.c(k0uVar.d(p, 2, GlUtil.a), qqlVar.m);
            }
        }, true);
    }

    public final synchronized com.google.common.collect.g a() {
        if (this.h.d() == 0) {
            ImmutableList.b bVar = ImmutableList.c;
            return com.google.common.collect.g.f;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.valueAt(i).a.isEmpty()) {
                ImmutableList.b bVar2 = ImmutableList.c;
                return com.google.common.collect.g.f;
            }
        }
        ImmutableList.a aVar = new ImmutableList.a();
        b bVar3 = (b) this.f.get(this.o).a.element();
        aVar.c(bVar3);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.keyAt(i2) != this.o) {
                c valueAt = this.f.valueAt(i2);
                if (valueAt.a.size() == 1 && !valueAt.b) {
                    ImmutableList.b bVar4 = ImmutableList.c;
                    return com.google.common.collect.g.f;
                }
                Iterator it = valueAt.a.iterator();
                long j = Long.MAX_VALUE;
                b bVar5 = null;
                while (it.hasNext()) {
                    b bVar6 = (b) it.next();
                    long j2 = bVar6.b.b;
                    long abs = Math.abs(j2 - bVar3.b.b);
                    if (abs < j) {
                        bVar5 = bVar6;
                        j = abs;
                    }
                    if (j2 > bVar3.b.b || (!it.hasNext() && valueAt.b)) {
                        bVar5.getClass();
                        aVar.c(bVar5);
                        break;
                    }
                }
            }
        }
        com.google.common.collect.g g = aVar.g();
        if (g.e == this.f.size()) {
            return g;
        }
        return com.google.common.collect.g.f;
    }

    public final synchronized void b() throws VideoFrameProcessingException, GlUtil.GlException {
        try {
            com.google.common.collect.g a2 = a();
            if (a2.isEmpty()) {
                return;
            }
            b bVar = (b) a2.get(this.o);
            ImmutableList.a aVar = new ImmutableList.a();
            for (int i = 0; i < a2.e; i++) {
                r0u r0uVar = ((b) a2.get(i)).b.a;
                aVar.c(new jxj0(r0uVar.c, r0uVar.d));
            }
            dds0 dds0Var = this.k;
            com.google.common.collect.g g = aVar.g();
            ((dds0.a) dds0Var).getClass();
            jxj0 jxj0Var = (jxj0) g.get(0);
            this.h.c(this.c, jxj0Var.a, jxj0Var.b);
            r0u f = this.h.f();
            long j = bVar.b.b;
            this.i.a(j);
            this.d.a(a2, f);
            this.j.a(GlUtil.k());
            this.b.a(this, f, j);
            c cVar = this.f.get(this.o);
            e(cVar, 1);
            c();
            if (this.g && cVar.a.isEmpty()) {
                this.a.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.keyAt(i) != this.o) {
                d(this.f.valueAt(i));
            }
        }
    }

    public final synchronized void d(c cVar) {
        int w;
        c cVar2 = this.f.get(this.o);
        if (cVar2.a.isEmpty() && cVar2.b) {
            e(cVar, cVar.a.size());
            return;
        }
        b bVar = (b) cVar2.a.peek();
        final long j = bVar != null ? bVar.b.b : C.TIME_UNSET;
        ArrayDeque arrayDeque = cVar.a;
        jxc0 jxc0Var = new jxc0() { // from class: xsna.lql
            @Override // xsna.jxc0
            public final boolean apply(Object obj) {
                return ((qql.b) obj).b.b <= j;
            }
        };
        arrayDeque.getClass();
        Iterable iwxVar = new iwx(arrayDeque, jxc0Var);
        if (iwxVar instanceof Collection) {
            w = ((Collection) iwxVar).size();
        } else {
            Iterator<Object> it = iwxVar.iterator();
            long j2 = 0;
            while (true) {
                ve veVar = (ve) it;
                if (!veVar.hasNext()) {
                    break;
                }
                veVar.next();
                j2++;
            }
            w = ipx.w(j2);
        }
        e(cVar, Math.max(w - 1, 0));
    }

    public final synchronized void e(c cVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            b bVar = (b) cVar.a.remove();
            bVar.a.g(bVar.b.b);
        }
    }

    @Override // xsna.s0u
    public final void g(final long j) {
        this.e.f(new jms0.b() { // from class: xsna.mql
            @Override // xsna.jms0.b
            public final void run() {
                qql qqlVar = qql.this;
                long j2 = j;
                synchronized (qqlVar) {
                    while (qqlVar.h.d() < qqlVar.h.c && qqlVar.i.b() <= j2) {
                        try {
                            ioo0 ioo0Var = qqlVar.h;
                            ArrayDeque arrayDeque = ioo0Var.b;
                            fxc0.z(!arrayDeque.isEmpty());
                            ioo0Var.a.add((r0u) arrayDeque.remove());
                            qqlVar.i.c();
                            GLES30.glDeleteSync(qqlVar.j.c());
                            GlUtil.d();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    qqlVar.b();
                }
            }
        }, true);
    }
}
