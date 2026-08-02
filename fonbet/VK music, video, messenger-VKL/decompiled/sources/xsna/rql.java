package xsna;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Size;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorRange;
import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorSpace;
import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorTransfer;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.effect.VideoTransformEffect;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.dkt0;
import xsna.dt5;
import xsna.n6g;

/* compiled from: DefaultVideoDecoderFrameHandler.kt */
/* loaded from: classes3.dex */
public class rql implements gyi {
    public final csp a;
    public final gzs<Size> b;
    public final pms0 c;
    public volatile f7s0 f;
    public ckn0 h;
    public m0u i;
    public m0u j;
    public final sjp0 k;
    public float l;
    public float m;
    public n6g n;
    public final n6g o;
    public final rvu p;
    public long d = -1;
    public final dt5.a e = new dt5.a();
    public final nzf0 g = new nzf0(new n1d(this, 13));

    public rql(csp cspVar, gzs<Size> gzsVar, pms0 pms0Var) {
        this.a = cspVar;
        this.b = gzsVar;
        this.c = pms0Var;
        Size invoke = gzsVar.invoke();
        this.k = new sjp0(invoke.getWidth(), invoke.getHeight());
        bpn0 bpn0Var = n6g.c;
        this.n = n6g.a.a();
        this.o = n6g.a.a();
        this.p = new rvu(cspVar.d);
    }

    @Override // xsna.gyi
    public final void a(int i, long j, kes0 kes0Var) {
        h();
        j(kes0Var.a.b, j);
    }

    @Override // xsna.gyi
    public final void b(f7s0 f7s0Var) {
        this.f = f7s0Var;
    }

    @Override // xsna.gyi
    public final void c(ocs ocsVar) {
        float f;
        int i;
        Integer num = ocsVar.a;
        sjp0 sjp0Var = this.k;
        if (num != null) {
            sjp0Var.c(num.intValue());
        }
        VideoEffect videoEffect = ocsVar.b;
        if (videoEffect != null) {
            VideoTransformEffect videoTransformEffect = videoEffect.b;
            sjp0Var.b(videoTransformEffect);
            Float valueOf = videoTransformEffect != null ? Float.valueOf(videoTransformEffect.e) : null;
            if (valueOf == null) {
                this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                float floatValue = valueOf.floatValue() / sjp0Var.c;
                if ((sjp0Var.e + 90) % 180 == 0) {
                    f = sjp0Var.b;
                    i = sjp0Var.a;
                } else {
                    f = sjp0Var.a;
                    i = sjp0Var.b;
                }
                float f2 = f / i;
                this.l = floatValue;
                this.m = floatValue * f2;
            }
            nzf0 nzf0Var = this.g;
            mzf0 a = mzf0.a(nzf0Var.b, ocsVar, 0, 0, 0, 0, 30);
            if (a.equals(nzf0Var.b)) {
                return;
            }
            nzf0Var.b = a;
            nzf0Var.c = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r13 = r12.a.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r13 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r13.e("DefaultVideoDecoderFrameHandler", "video frame dropped, 200000/5");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r12.e.a();
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (r13.d.compareAndSet(true, false) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        r13 = r13.a.b;
        r13.updateTexImage();
        j(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    @Override // xsna.gyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(kes0 kes0Var, long j) {
        boolean z;
        boolean z2;
        dt5.a aVar = this.e;
        aVar.getClass();
        aVar.f = SystemClock.elapsedRealtime();
        int i = 200000;
        while (true) {
            if (kes0Var.d.get()) {
                z = true;
                break;
            }
            i--;
            if (i <= 0) {
                f100 f100Var = kes0Var.b;
                if (f100Var != null) {
                    f100Var.v("VideoDecoderOutputSurface", "start awaiting for frame, 200000/5");
                }
                synchronized (kes0Var.c) {
                    try {
                        try {
                            kes0Var.c.wait(5L);
                            z2 = false;
                        } catch (InterruptedException e) {
                            f100 f100Var2 = kes0Var.b;
                            if (f100Var2 != null) {
                                f100Var2.e("VideoDecoderOutputSurface", "waiting for frame was interrupted, " + X3.b.c + "/5", e);
                            }
                            z2 = true;
                        } catch (Throwable th) {
                            throw new IllegalStateException("Failed to await frame, " + X3.b.c + "/5", th);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                z = kes0Var.d.get();
            }
        }
    }

    @Override // xsna.gyi
    public final void e(l8l l8lVar) {
        Object obj;
        Object obj2;
        Object obj3;
        this.k.d(l8lVar.a, l8lVar.b);
        nzf0 nzf0Var = this.g;
        mzf0 a = mzf0.a(nzf0Var.b, null, l8lVar.a, l8lVar.b, 0, 0, 25);
        if (!a.equals(nzf0Var.b)) {
            nzf0Var.b = a;
            nzf0Var.c = true;
        }
        bpn0 bpn0Var = n6g.c;
        MediaFormat mediaFormat = l8lVar.c;
        n6g n6gVar = null;
        if (mediaFormat != null) {
            gr10 gr10Var = new gr10(mediaFormat);
            Iterator<E> it = ColorSpace.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int i = ((ColorSpace) obj).i();
                Integer f = gr10Var.f();
                if (f != null && i == f.intValue()) {
                    break;
                }
            }
            ColorSpace colorSpace = (ColorSpace) obj;
            Iterator<E> it2 = ColorRange.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                int i2 = ((ColorRange) obj2).i();
                Integer e = gr10Var.e();
                if (e != null && i2 == e.intValue()) {
                    break;
                }
            }
            ColorRange colorRange = (ColorRange) obj2;
            Iterator<E> it3 = ColorTransfer.h().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                int i3 = ((ColorTransfer) obj3).i();
                Integer g = gr10Var.g();
                if (g != null && i3 == g.intValue()) {
                    break;
                }
            }
            ColorTransfer colorTransfer = (ColorTransfer) obj3;
            if (colorSpace != null && colorRange != null && colorTransfer != null) {
                n6gVar = new n6g(colorSpace, colorTransfer);
            }
        }
        if (n6gVar == null) {
            bpn0 bpn0Var2 = n6g.c;
            n6gVar = n6g.a.a();
        }
        this.n = n6gVar;
    }

    public final m0u f(boolean z) {
        csp cspVar = this.a;
        if (z) {
            if (this.i == null) {
                this.i = new m0u(cspVar.d, true);
            }
            m0u m0uVar = this.i;
            if (m0uVar == null) {
                return null;
            }
            return m0uVar;
        }
        if (this.j == null) {
            this.j = new m0u(cspVar.d, false);
        }
        m0u m0uVar2 = this.j;
        if (m0uVar2 == null) {
            return null;
        }
        return m0uVar2;
    }

    public final Pair<Integer, Boolean> g(n6g n6gVar, int i) {
        Pair pair;
        rvu rvuVar = this.p;
        rvuVar.getClass();
        if (o6g.a(n6gVar)) {
            n6g n6gVar2 = this.o;
            if (!o6g.a(n6gVar2) && n6gVar.a == ColorSpace.COLOR_SPACE_BT2020 && n6gVar2.a == ColorSpace.COLOR_SPACE_BT709 && o6g.a(n6gVar) && n6gVar2.b == ColorTransfer.COLOR_TRANSFER_SDR) {
                sjp0 sjp0Var = this.k;
                int i2 = sjp0Var.a;
                int i3 = sjp0Var.b;
                IntBuffer allocate = IntBuffer.allocate(1);
                GLES20.glGetIntegerv(36006, allocate);
                int i4 = allocate.get(0);
                if (((u0u) rvuVar.d) == null) {
                    rvuVar.d = new u0u((f100) rvuVar.b);
                }
                u0u u0uVar = (u0u) rvuVar.d;
                (u0uVar == null ? null : u0uVar).r = n6gVar;
                if (u0uVar == null) {
                    u0uVar = null;
                }
                u0uVar.s = n6gVar2;
                g0u g0uVar = (g0u) rvuVar.c;
                if (g0uVar == null || g0uVar.a != i2 || g0uVar.b != i3) {
                    if (g0uVar != null) {
                        g0uVar.a();
                    }
                    g0uVar = new g0u();
                    g0uVar.b(i2, i3);
                    rvuVar.c = g0uVar;
                }
                GLES20.glBindFramebuffer(36160, g0uVar.c);
                int i5 = g0uVar.a;
                int i6 = g0uVar.b;
                GLES20.glBlendFunc(770, 771);
                GLES20.glEnable(3042);
                GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                GLES20.glClear(16640);
                GLES20.glViewport(0, 0, i5, i6);
                u0u u0uVar2 = (u0u) rvuVar.d;
                (u0uVar2 == null ? null : u0uVar2).c = i;
                (u0uVar2 != null ? u0uVar2 : null).d();
                s3q0 s3q0Var = s3q0.a;
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glBindFramebuffer(36160, i4);
                pair = new Pair(Integer.valueOf(g0uVar.e), Boolean.TRUE);
                int intValue = ((Number) pair.d()).intValue();
                Boolean bool = (Boolean) pair.g();
                bool.getClass();
                return new Pair<>(Integer.valueOf(intValue), bool);
            }
        }
        pair = new Pair(Integer.valueOf(i), Boolean.FALSE);
        int intValue2 = ((Number) pair.d()).intValue();
        Boolean bool2 = (Boolean) pair.g();
        bool2.getClass();
        return new Pair<>(Integer.valueOf(intValue2), bool2);
    }

    public void i() {
        f100 f100Var = this.a.d;
        if (f100Var != null) {
            f100Var.v("DefaultVideoDecoderFrameHandler", "release default video decoder frame handler");
        }
        try {
            m0u m0uVar = this.i;
            if (m0uVar != null) {
                m0uVar.c();
            }
            m0u m0uVar2 = this.j;
            if (m0uVar2 != null) {
                m0uVar2.c();
            }
            u0u u0uVar = (u0u) this.p.d;
            if (u0uVar != null) {
                u0uVar.c();
            }
            pms0 pms0Var = this.c;
            if (pms0Var != null) {
                pms0Var.a();
            }
            this.f = null;
        } catch (Throwable th) {
            f100 f100Var2 = this.a.d;
            if (f100Var2 != null) {
                f100Var2.w("DefaultVideoDecoderFrameHandler", mnh0.A(th));
            }
        }
        dt5.a aVar = this.e;
        f100 f100Var3 = this.a.d;
        if (aVar.a <= 0 || f100Var3 == null) {
            return;
        }
        f100Var3.v("DefaultVideoDecoderFrameHandler", "await delay: " + Long.valueOf(aVar.b) + (char) 8804 + aVar.b() + (char) 8804 + Long.valueOf(aVar.c) + " ms");
    }

    public void j(ckn0 ckn0Var, long j) {
        this.h = ckn0Var;
        float[] fArr = new float[16];
        ckn0Var.getTransformMatrix(fArr);
        l(fArr, TimeUnit.MICROSECONDS.toNanos(j), ckn0Var.a, true, this.n);
    }

    public final void k() {
        ckn0 ckn0Var = this.h;
        if (ckn0Var != null) {
            j(ckn0Var, TimeUnit.NANOSECONDS.toMicros(this.d));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r6.d(r15, r8, r2.c, r2.d, r12, r13) == true) goto L38;
     */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(float[] fArr, long j, int i, boolean z, n6g n6gVar) {
        Size invoke = this.b.invoke();
        sjp0 sjp0Var = this.k;
        int width = invoke.getWidth();
        int height = invoke.getHeight();
        if (sjp0Var.c != width || sjp0Var.d != height) {
            sjp0Var.c = width;
            sjp0Var.d = height;
            sjp0Var.a();
        }
        nzf0 nzf0Var = this.g;
        mzf0 a = mzf0.a(nzf0Var.b, null, 0, 0, invoke.getWidth(), invoke.getHeight(), 7);
        if (!a.equals(nzf0Var.b)) {
            nzf0Var.b = a;
            nzf0Var.c = true;
        }
        f7s0 f7s0Var = this.f;
        if (f7s0Var != null) {
            long micros = TimeUnit.NANOSECONDS.toMicros(j);
            dkt0 dkt0Var = f7s0Var.b;
            for (dkt0.c cVar : dkt0Var.g) {
                if ((micros >= cVar.b && micros < cVar.c) || cVar.equals(j5g.k0(dkt0Var.g))) {
                    dkt0Var.a.c(cVar.a);
                    break;
                }
            }
        }
        Pair<Integer, Boolean> g = g(n6gVar, i);
        int intValue = g.d().intValue();
        boolean z2 = g.g().booleanValue() ? false : z;
        long nanos = j / TimeUnit.MILLISECONDS.toNanos(1L);
        nzf0 nzf0Var2 = this.g;
        if (nzf0Var2.c) {
            nzf0Var2.a.invoke(nzf0Var2.b);
            nzf0Var2.c = false;
        }
        pms0 pms0Var = this.c;
        if (pms0Var != null) {
            sjp0 sjp0Var2 = this.k;
        }
        m0u f = f(z2);
        sjp0 sjp0Var3 = this.k;
        int i2 = sjp0Var3.c;
        int i3 = sjp0Var3.d;
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(3042);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glClear(16640);
        GLES20.glViewport(0, 0, i2, i3);
        f.p = this.l;
        f.q = this.m;
        f.c = intValue;
        f.e = fArr;
        float[] fArr2 = this.k.h;
        f.d = Arrays.copyOf(fArr2, fArr2.length);
        f.d();
        this.d = j;
    }

    public void h() {
    }
}
