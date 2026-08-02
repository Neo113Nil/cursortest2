package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.er9;
import xsna.q630;

/* compiled from: InternalPullToRefresh.kt */
/* loaded from: classes17.dex */
public final class blx {
    public static final dtp0<Float> a = jq2.d(300, 0, luo.d, 2);
    public static final float b = (float) 2.5d;
    public static final float c = (float) 5.5d;
    public static final float d = 16;
    public static final float e = 40;
    public static final float f = 10;
    public static final float g = 5;

    public static final void a(final gzs<Float> gzsVar, final long j, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1264206840);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.p(j) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1264206840, i2, -1, "com.vk.core.compose.component.internal.CircularArrowProgressIndicator (InternalPullToRefresh.kt:523)");
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
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bbk0.b(new bde(1, gzsVar));
                M.R(x2);
            }
            boolean z = true;
            final mtk0 b2 = hg2.b(((Number) ((mtk0) x2).getValue()).floatValue(), a, null, null, M, 48, 28);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new c2u(gzsVar, 4);
                M.R(x3);
            }
            q630 q = txj0.q(egi0.b(q630.a.a, true, (izs) x3), d);
            boolean J = (i3 == 4) | M.J(b2);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean y = J | z | M.y(path);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                izs izsVar = new izs() { // from class: xsna.zkx
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        long j2;
                        long j3 = j;
                        Path path2 = path;
                        oio oioVar = (oio) obj2;
                        float floatValue = ((Number) gzs.this.invoke()).floatValue();
                        float max = (Math.max(Math.min(1.0f, floatValue) - 0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 5) / 3;
                        float f2 = swe0.f(Math.abs(floatValue) - 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f);
                        float pow = (((0.4f * max) - 0.25f) + (f2 - (((float) Math.pow(f2, 2)) / 4))) * 0.5f;
                        float f3 = 360;
                        float f4 = pow * f3;
                        float f5 = ((0.8f * max) + pow) * f3;
                        im3 im3Var = new im3(pow, f4, f5, Math.min(1.0f, max));
                        float floatValue2 = ((Number) b2.getValue()).floatValue();
                        long n1 = oioVar.n1();
                        er9.b a0 = oioVar.a0();
                        long d2 = a0.d();
                        a0.a().e();
                        try {
                            a0.a.h(pow, n1);
                            float I0 = oioVar.I0(blx.c);
                            float f6 = blx.b;
                            float I02 = (oioVar.I0(f6) / 2.0f) + I0;
                            long j4 = egi.j(oioVar.d());
                            int i4 = (int) (j4 >> 32);
                            int i5 = (int) (j4 & 4294967295L);
                            zhf0 zhf0Var = new zhf0(Float.intBitsToFloat(i4) - I02, Float.intBitsToFloat(i5) - I02, Float.intBitsToFloat(i4) + I02, Float.intBitsToFloat(i5) + I02);
                            try {
                                oio.X0(oioVar, j3, f4, f5 - f4, zhf0Var.e(), zhf0Var.d(), floatValue2, new frm0(oioVar.I0(f6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 26), Tensorflow.FRAME_HEIGHT);
                                blx.d(oioVar, path2, zhf0Var, j3, floatValue2, im3Var, f6);
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
                    }
                };
                M.R(izsVar);
                x4 = izsVar;
            }
            xa4.i(0, M, (izs) x4, q);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, j, gzsVar) { // from class: xsna.alx
                public final /* synthetic */ gzs b;
                public final /* synthetic */ long c;

                {
                    this.b = gzsVar;
                    this.c = j;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    blx.a(this.b, this.c, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final kge0 kge0Var, final boolean z, final q630 q630Var, long j, long j2, float f2, androidx.compose.runtime.a aVar, final int i) {
        final long j3;
        final long j4;
        final float f3;
        long j5;
        int i2;
        final long j6;
        int i3;
        float f4;
        androidx.compose.runtime.a M = aVar.M(-832538933);
        int i4 = i | (M.J(kge0Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 205824;
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                uog0 uog0Var = rev0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1183331045, 6, -1, "com.vk.core.compose.component.internal.VkPullToRefreshDefaults.<get-containerColor> (InternalPullToRefresh.kt:392)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j5 = ylu0Var.getBackground().g;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    i2 = -64513;
                    androidx.compose.runtime.b.f(-401687717, 6, -1, "com.vk.core.compose.component.internal.VkPullToRefreshDefaults.<get-indicatorColor> (InternalPullToRefresh.kt:395)");
                } else {
                    i2 = -64513;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j6 = ylu0Var2.getIcon().a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = i4 & i2;
                f4 = rev0.b;
            } else {
                M.h();
                i3 = i4 & (-64513);
                j5 = j;
                j6 = j2;
                f4 = f2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-832538933, i3, -1, "com.vk.core.compose.component.internal.Indicator (InternalPullToRefresh.kt:488)");
            }
            final uog0 uog0Var2 = rev0.a;
            final float f5 = rev0.c;
            final float f6 = f4;
            q630 m = hr80.m(rdu.a(bu00.f(txj0.q(q630Var, e), new zos(5)), new izs() { // from class: xsna.ykx
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    tdu tduVar = (tdu) obj;
                    kge0 kge0Var2 = kge0.this;
                    float a2 = kge0Var2.a();
                    float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    boolean z2 = a2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || z;
                    tduVar.n((kge0Var2.a() * tduVar.r0(f6)) - Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)));
                    if (z2) {
                        f7 = tduVar.I0(f5);
                    }
                    tduVar.i(f7);
                    tduVar.X(uog0Var2);
                    tduVar.f(true);
                    return s3q0.a;
                }
            }), j5, uog0Var2);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            long j7 = j6;
            ijk.a(Boolean.valueOf(z), null, jq2.d(100, 0, null, 6), null, kai.c(571036646, new yzs() { // from class: xsna.ukx
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.l(booleanValue) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(571036646, intValue, -1, "com.vk.core.compose.component.internal.Indicator.<anonymous>.<anonymous> (InternalPullToRefresh.kt:502)");
                        }
                        long j8 = j6;
                        if (booleanValue) {
                            aVar3.K(-612688093);
                            w2e0.a(blx.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 390, j8, 0L, aVar3, txj0.q(q630.a.a, blx.d));
                            aVar3.j();
                        } else {
                            aVar3.K(-612468179);
                            kge0 kge0Var2 = kge0Var;
                            boolean J = aVar3.J(kge0Var2);
                            Object x = aVar3.x();
                            if (J || x == a.C0011a.a) {
                                x = new atm(kge0Var2, 14);
                                aVar3.R(x);
                            }
                            blx.a((gzs) x, j8, aVar3, 0);
                            aVar3.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 3) & 14) | 24960, 10);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f3 = f6;
            j3 = j5;
            j4 = j7;
        } else {
            M.h();
            j3 = j;
            j4 = j2;
            f3 = f2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, q630Var, j3, j4, f3, i) { // from class: xsna.xkx
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    blx.b(kge0.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final gzs gzsVar, final q630 q630Var, final kge0 kge0Var, final dt1 dt1Var, yzs yzsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        yzs yzsVar2;
        androidx.compose.runtime.a M = aVar.M(-1880196949);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(kge0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(dt1Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                yzsVar2 = kai.c(-2038125167, new yzs() { // from class: xsna.vkx
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        qa8 qa8Var = (qa8) obj;
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= aVar2.J(qa8Var) ? 4 : 2;
                        }
                        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-2038125167, intValue, -1, "com.vk.core.compose.component.internal.PullToRefreshBox.<anonymous> (InternalPullToRefresh.kt:106)");
                            }
                            dt1.a.getClass();
                            blx.b(kge0.this, z, qa8Var.b(q630.a.a, dt1.a.c), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M);
            } else {
                M.h();
                yzsVar2 = yzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1880196949, i3, -1, "com.vk.core.compose.component.internal.PullToRefreshBox (InternalPullToRefresh.kt:113)");
            }
            q630 g2 = q630Var.g(new bge0(z, gzsVar, kge0Var, rev0.b));
            cp10 d2 = ja8.d(dt1Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, g2);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            Integer valueOf = Integer.valueOf(((i3 >> 15) & 112) | 6);
            ra8 ra8Var = ra8.a;
            jaiVar.invoke(ra8Var, M, valueOf);
            yzsVar2.invoke(ra8Var, M, Integer.valueOf(((i3 >> 12) & 112) | 6));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            yzsVar2 = yzsVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final yzs yzsVar3 = yzsVar2;
            s.d = new wzs() { // from class: xsna.wkx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    blx.c(z, gzsVar, q630Var, kge0Var, dt1Var, yzsVar3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(oio oioVar, Path path, zhf0 zhf0Var, long j, float f2, im3 im3Var, float f3) {
        path.reset();
        path.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f4 = f;
        float I0 = oioVar.I0(f4);
        float f5 = im3Var.b;
        path.c((I0 * f5) / 2, oioVar.I0(g) * f5);
        path.c(oioVar.I0(f4) * f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float intBitsToFloat = (Float.intBitsToFloat((int) (zhf0Var.c() >> 32)) + (Math.min(zhf0Var.c - zhf0Var.a, zhf0Var.d - zhf0Var.b) / 2.0f)) - ((oioVar.I0(f4) * f5) / 2.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (zhf0Var.c() & 4294967295L)) - oioVar.I0(f3);
        path.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        float I02 = im3Var.a - oioVar.I0(f3);
        long n1 = oioVar.n1();
        er9.b a0 = oioVar.a0();
        long d2 = a0.d();
        a0.a().e();
        try {
            a0.a.h(I02, n1);
            oio.C0(oioVar, path, j, f2, new frm0(oioVar.I0(f3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 48);
        } finally {
            nq.b(a0, d2);
        }
    }

    public static final kge0 e(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(153177968, 0, -1, "com.vk.core.compose.component.internal.rememberPullToRefreshState (InternalPullToRefresh.kt:437)");
        }
        Object[] objArr = new Object[0];
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new bu0(15);
            aVar.R(x);
        }
        kge0 kge0Var = (kge0) crx0.D(objArr, kge0.b, (gzs) x, aVar, 384);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return kge0Var;
    }
}
