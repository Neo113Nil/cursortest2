package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.er9;
import xsna.q630;

/* compiled from: PullRefreshIndicator.kt */
/* loaded from: classes11.dex */
public final class vfe0 {
    public static final float a = 40;
    public static final uog0 b = vog0.a;
    public static final float c = (float) 7.5d;
    public static final float d = (float) 2.5d;
    public static final float e = 10;
    public static final float f = 5;
    public static final float g = 6;
    public static final dtp0<Float> h = jq2.d(300, 0, luo.d, 2);

    public static final void a(final zfe0 zfe0Var, final long j, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-486016981);
        int i2 = i | (M.y(zfe0Var) ? 4 : 2) | (M.p(j) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-486016981, i2, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:124)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (x == c0012a) {
                androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
                a2.l(1);
                M.R(a2);
                obj = a2;
            }
            final Path path = (Path) obj;
            boolean J = M.J(zfe0Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = bbk0.b(new gd70(zfe0Var, 21));
                M.R(x2);
            }
            final mtk0 b2 = hg2.b(((Number) ((mtk0) x2).getValue()).floatValue(), h, null, null, M, 48, 28);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new kpr(20);
                M.R(x3);
            }
            q630Var2 = q630Var;
            q630 b3 = egi0.b(q630Var2, false, (izs) x3);
            boolean y = M.y(zfe0Var) | M.J(b2) | ((i2 & 112) == 32) | M.y(path);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                izs izsVar = new izs() { // from class: xsna.tfe0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        long j2;
                        long j3 = j;
                        Path path2 = path;
                        oio oioVar = (oio) obj2;
                        zfe0 zfe0Var2 = zfe0.this;
                        float a3 = zfe0Var2.a() / zfe0Var2.b();
                        float min = Math.min(1.0f, a3) - 0.4f;
                        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float max = (Math.max(min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 5) / 3;
                        float abs = Math.abs(a3) - 1.0f;
                        if (abs >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f2 = abs;
                        }
                        if (f2 > 2.0f) {
                            f2 = 2.0f;
                        }
                        float pow = (((0.4f * max) - 0.25f) + (f2 - (((float) Math.pow(f2, 2)) / 4))) * 0.5f;
                        float f3 = 360;
                        float f4 = pow * f3;
                        float f5 = ((0.8f * max) + pow) * f3;
                        jm3 jm3Var = new jm3(pow, f4, f5, Math.min(1.0f, max));
                        float floatValue = ((Number) b2.getValue()).floatValue();
                        long n1 = oioVar.n1();
                        er9.b a0 = oioVar.a0();
                        long d2 = a0.d();
                        a0.a().e();
                        try {
                            a0.a.h(pow, n1);
                            float I0 = oioVar.I0(vfe0.c);
                            float f6 = vfe0.d;
                            float I02 = (oioVar.I0(f6) / 2.0f) + I0;
                            try {
                                zhf0 zhf0Var = new zhf0(Float.intBitsToFloat((int) (egi.j(oioVar.d()) >> 32)) - I02, Float.intBitsToFloat((int) (egi.j(oioVar.d()) & 4294967295L)) - I02, Float.intBitsToFloat((int) (egi.j(oioVar.d()) >> 32)) + I02, Float.intBitsToFloat((int) (egi.j(oioVar.d()) & 4294967295L)) + I02);
                                try {
                                    oio.X0(oioVar, j3, f4, f5 - f4, zhf0Var.e(), zhf0Var.d(), floatValue, new frm0(oioVar.I0(f6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 0, null, 26), Tensorflow.FRAME_HEIGHT);
                                    vfe0.c(oioVar, path2, zhf0Var, j3, floatValue, jm3Var);
                                    nq.b(a0, d2);
                                    return s3q0.a;
                                } catch (Throwable th) {
                                    th = th;
                                    j2 = d2;
                                    nq.b(a0, j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = d2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j2 = d2;
                        }
                    }
                };
                M.R(izsVar);
                x4 = izsVar;
            }
            xa4.i(0, M, (izs) x4, b3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(j, q630Var3, i) { // from class: xsna.ufe0
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(385);
                    vfe0.a(zfe0.this, this.c, this.d, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Throwable, xsna.huo] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static final void b(final boolean z, final zfe0 zfe0Var, final q630 q630Var, long j, long j2, androidx.compose.runtime.a aVar, final int i) {
        final long j3;
        final long j4;
        long c2;
        long a2;
        int i2;
        long j5;
        ?? r15;
        long j6;
        androidx.compose.runtime.a M = aVar.M(308716636);
        int i3 = i | (M.l(z) ? 4 : 2) | (M.y(zfe0Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 205824;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
                }
                k9g k9gVar = (k9g) M.r(l9g.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c2 = k9gVar.c();
                a2 = l9g.a(0, c2, M);
                i2 = i3 & (-64513);
            } else {
                M.h();
                i2 = i3 & (-64513);
                c2 = j;
                a2 = j2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(308716636, i2, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
            }
            int i4 = i2 & 14;
            boolean J = M.J(zfe0Var) | (i4 == 4);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = bbk0.b(new fmh(z, zfe0Var));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            gbp gbpVar = (gbp) M.r(hbp.a);
            l5g l5gVar = null;
            if (gbpVar == null) {
                M.K(1453038224);
                M.j();
                j5 = a2;
                r15 = 0;
                j6 = c2;
            } else {
                M.K(323966865);
                j5 = a2;
                r15 = 0;
                long j7 = c2;
                j6 = j7;
                l5gVar = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(gbpVar.a(j7, g, M, 48), M);
            }
            long j8 = l5gVar != null ? l5gVar.a : j6;
            q630 a3 = rdu.a(bu00.f(txj0.q(q630Var, a), new uuz(21)), new aj50(zfe0Var, 14));
            float f2 = ((Boolean) mtk0Var.getValue()).booleanValue() ? g : 0;
            uog0 uog0Var = b;
            q630 m = hr80.m(a5j0.b(a3, f2, uog0Var, true, 0L, 0L, 24), j8, uog0Var);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c3 = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw r15;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c3, cri.a.d);
            final long j9 = j5;
            ijk.a(Boolean.valueOf(z), null, jq2.d(100, 0, r15, 6), null, kai.c(1853731063, new yzs() { // from class: xsna.rfe0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.l(booleanValue) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1853731063, intValue, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
                        }
                        q630.a aVar5 = q630.a.a;
                        q630 d3 = txj0.d(aVar5, 1.0f);
                        dt1.a.getClass();
                        cp10 d4 = ja8.d(dt1.a.f, false);
                        int m3 = n34.m(aVar4);
                        sy90 D2 = aVar4.D();
                        q630 c4 = qri.c(aVar4, d3);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar6);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, d4, cri.a.f);
                        k9q0.w(aVar4, D2, cri.a.e);
                        cri.a.b bVar2 = cri.a.g;
                        if (aVar4.L() || !epx.f(aVar4.x(), Integer.valueOf(m3))) {
                            kr.a(m3, aVar4, m3, bVar2);
                        }
                        k9q0.w(aVar4, c4, cri.a.d);
                        float f3 = vfe0.c;
                        float f4 = vfe0.d;
                        float f5 = (f3 + f4) * 2;
                        long j10 = j9;
                        if (booleanValue) {
                            aVar4.K(-1916589279);
                            aVar3 = aVar4;
                            x2e0.b(txj0.q(aVar5, f5), j10, f4, 0L, 0, aVar3, 390, 24);
                            aVar3.j();
                        } else {
                            aVar3 = aVar4;
                            aVar3.K(-1916362142);
                            vfe0.a(zfe0Var, j10, txj0.q(aVar5, f5), aVar4, 384);
                            aVar3.j();
                        }
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, i4 | 24960, 10);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j4 = j9;
            j3 = j6;
        } else {
            M.h();
            j3 = j;
            j4 = j2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, zfe0Var, q630Var, j3, j4, i) { // from class: xsna.sfe0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ zfe0 c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(65);
                    vfe0.b(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(oio oioVar, Path path, zhf0 zhf0Var, long j, float f2, jm3 jm3Var) {
        path.reset();
        path.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f3 = e;
        float I0 = oioVar.I0(f3);
        float f4 = jm3Var.b;
        path.c(I0 * f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.c((oioVar.I0(f3) * f4) / 2, oioVar.I0(f) * f4);
        float intBitsToFloat = (Float.intBitsToFloat((int) (zhf0Var.c() >> 32)) + (Math.min(zhf0Var.c - zhf0Var.a, zhf0Var.d - zhf0Var.b) / 2.0f)) - ((oioVar.I0(f3) * f4) / 2.0f);
        float I02 = (oioVar.I0(d) / 2.0f) + Float.intBitsToFloat((int) (zhf0Var.c() & 4294967295L));
        path.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L));
        path.close();
        float f5 = jm3Var.a;
        long n1 = oioVar.n1();
        er9.b a0 = oioVar.a0();
        long d2 = a0.d();
        a0.a().e();
        try {
            a0.a.h(f5, n1);
            oio.C0(oioVar, path, j, f2, null, 56);
        } finally {
            nq.b(a0, d2);
        }
    }
}
