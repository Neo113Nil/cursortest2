package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Snackbar.kt */
/* loaded from: classes11.dex */
public final class t8k0 {
    public static final float c;
    public static final float e;
    public static final float a = 30;
    public static final float b = 16;
    public static final float d = 6;
    public static final float f = 48;
    public static final float g = 68;

    static {
        float f2 = 8;
        c = f2;
        e = f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (xsna.epx.f(r4.x(), java.lang.Integer.valueOf(r7)) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(jai jaiVar, wzs wzsVar, androidx.compose.runtime.a aVar, int i) {
        Throwable th;
        androidx.compose.runtime.a M = aVar.M(1302703572);
        int i2 = (M.y(jaiVar) ? 4 : 2) | i | (M.y(wzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1302703572, i2, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:310)");
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(aVar2, b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new l8k0();
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, cp10Var, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (M.L()) {
                th = null;
            } else {
                th = null;
            }
            kr.a(m, M, m, bVar);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, 1, vua0.u(aVar2, "text"));
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, false);
            int m2 = n34.m(M);
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, F);
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c3, dVar);
            jaiVar.invoke(M, Integer.valueOf(i2 & 14));
            M.G();
            q630 u = vua0.u(aVar2, "action");
            cp10 d3 = ja8.d(ty6Var, false);
            int m3 = n34.m(M);
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, u);
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D3, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                kr.a(m3, M, m3, bVar);
            }
            k9q0.w(M, c4, dVar);
            wzsVar.invoke(M, Integer.valueOf((i2 >> 3) & 14));
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o1k(jaiVar, wzsVar, i, 5);
        }
    }

    public static final void b(final q630 q630Var, final wzs wzsVar, final r5j0 r5j0Var, final long j, final long j2, final float f2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        float f3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-662779944);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(wzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(r5j0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.p(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.p(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            f3 = f2;
            i2 |= M.n(f3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            f3 = f2;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(jaiVar) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-662779944, i2, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
            }
            int i3 = i2 >> 6;
            aVar2 = M;
            yjn0.a(q630Var, r5j0Var, j, j2, f3, kai.c(-1429068516, new x4a(7, wzsVar, jaiVar), M), aVar2, (i2 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i2 >> 3) & 458752), 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.j8k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t8k0.b(q630.this, wzsVar, r5j0Var, j, j2, f2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final k7k0 k7k0Var, q630 q630Var, r5j0 r5j0Var, long j, long j2, long j3, float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final r5j0 r5j0Var2;
        final long j4;
        final long j5;
        final long j6;
        final float f3;
        int i3;
        int i4;
        final long i5;
        int i6;
        q630 q630Var3;
        float f4;
        r5j0 r5j0Var3;
        long j7;
        long j8;
        final k7k0 k7k0Var2;
        jai jaiVar;
        androidx.compose.runtime.a M = aVar.M(258660814);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(k7k0Var) : M.y(k7k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | Tensorflow.FRAME_WIDTH;
        if ((i & 3072) == 0) {
            i7 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i7 |= 8192;
        }
        if ((196608 & i) == 0) {
            i7 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i7 |= 524288;
        }
        int i8 = i7 | 12582912;
        if (M.t(i8 & 1, (4793491 & i8) != 4793490)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1586253541, 6, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:109)");
                }
                o6j0 o6j0Var = (o6j0) M.r(q6j0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                uog0 uog0Var = o6j0Var.a;
                long h = gcd0.h(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
                }
                iyk0 iyk0Var = l9g.a;
                k9g k9gVar = (k9g) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long c2 = k9gVar.c();
                i3 = 12582912;
                if (androidx.compose.runtime.b.d()) {
                    i4 = -4193281;
                    androidx.compose.runtime.b.f(-810329402, 6, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
                } else {
                    i4 = -4193281;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
                }
                k9g k9gVar2 = (k9g) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i5 = k9gVar2.d() ? f870.i(l5g.c(14, k9gVar2.c(), 0.6f), k9gVar2.b()) : ((l5g) ((zak0) k9gVar2.b).getValue()).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i6 = i8 & i4;
                q630Var3 = q630.a.a;
                f4 = 6;
                r5j0Var3 = uog0Var;
                j7 = c2;
                j8 = h;
            } else {
                M.h();
                i6 = i8 & (-4193281);
                q630Var3 = q630Var;
                r5j0Var3 = r5j0Var;
                j8 = j;
                j7 = j2;
                i5 = j3;
                f4 = f2;
                i3 = 12582912;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(258660814, i6, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
            }
            final String a2 = k7k0Var.a();
            if (a2 != null) {
                M.K(593497188);
                k7k0Var2 = k7k0Var;
                jaiVar = kai.c(1843479216, new wzs() { // from class: xsna.h8k0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1843479216, intValue, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:170)");
                            }
                            float f5 = pp8.a;
                            long j9 = l5g.j;
                            int i9 = 6;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
                            }
                            k9g k9gVar3 = (k9g) aVar3.r(l9g.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long c3 = l5g.c(14, k9gVar3.a(), fsk.r(6, aVar3));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(182742216, 3072, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:456)");
                            }
                            ybl yblVar = new ybl(j9, i5, j9, c3);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            k7k0 k7k0Var3 = k7k0Var2;
                            boolean y = aVar3.y(k7k0Var3);
                            Object x = aVar3.x();
                            if (y || x == a.C0011a.a) {
                                x = new x750(k7k0Var3, 26);
                                aVar3.R(x);
                            }
                            gzs gzsVar = (gzs) x;
                            jai c4 = kai.c(-929149933, new ini(a2, i9), aVar3);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1586253541, 6, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:109)");
                            }
                            o6j0 o6j0Var2 = (o6j0) aVar3.r(q6j0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            uog0 uog0Var2 = o6j0Var2.a;
                            u890 u890Var = pp8.c;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(724562088, 805306368, -1, "androidx.compose.material.TextButton (Button.kt:238)");
                            }
                            mq8.a(gzsVar, q630.a.a, null, uog0Var2, yblVar, u890Var, c4, aVar3, 805306368);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M);
                M.j();
            } else {
                k7k0Var2 = k7k0Var;
                M.K(593796152);
                M.j();
                jaiVar = null;
            }
            aVar2 = M;
            b(s200.D(q630Var3, 12), jaiVar, r5j0Var3, j8, j7, f4, kai.c(-261845785, new hq5(k7k0Var2, 18), M), aVar2, (i6 & 896) | i3 | ((i6 >> 3) & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
            r5j0Var2 = r5j0Var3;
            j4 = j8;
            j5 = j7;
            f3 = f4;
            j6 = i5;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            r5j0Var2 = r5j0Var;
            j4 = j;
            j5 = j2;
            j6 = j3;
            f3 = f2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.i8k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t8k0.c(k7k0.this, q630Var2, r5j0Var2, j4, j5, j6, f3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(343813818);
        int i2 = (M.y(jaiVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(343813818, i2, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = p8k0.a;
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
            int m = n34.m(M);
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, cp10Var, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630 E = s200.E(aVar2, b, d);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int m2 = n34.m(M);
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, E);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c3, dVar);
            jaiVar.invoke(M, Integer.valueOf(i2 & 14));
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.v(jaiVar, i, 14);
        }
    }
}
