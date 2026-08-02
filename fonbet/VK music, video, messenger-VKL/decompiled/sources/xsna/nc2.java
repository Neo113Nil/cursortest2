package xsna;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.er9;
import xsna.q630;

/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes11.dex */
public final class nc2 {
    public static final void a(wv70 wv70Var, dt1 dt1Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(wv70Var) : M.y(wv70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(dt1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1090171650, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:219)");
            }
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !M.J(wv70Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new dtu(dt1Var, wv70Var);
                M.R(x);
            }
            nb2.a((dtu) x, null, new gxb0(false, SecureFlagPolicy.Inherit, false), jaiVar, M, ((i2 << 3) & 7168) | 384, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ec2(i, 0, wv70Var, dt1Var, jaiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        if (r20 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00cc, code lost:
    
        if (r20 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e0, code lost:
    
        if (((r19 == androidx.compose.ui.text.style.ResolvedTextDirection.Ltr && !r20) || (r19 == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl && r20)) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final wv70 wv70Var, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        androidx.compose.runtime.a M = aVar.M(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(wv70Var) : M.y(wv70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (533651 & i2) != 533650)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                M.h();
                i3 = i2 & (-57345);
                j3 = j;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-466280168, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
            }
            if (z) {
                float f2 = kdi0.a;
                if (resolvedTextDirection == ResolvedTextDirection.Ltr) {
                }
                if (resolvedTextDirection == ResolvedTextDirection.Rtl) {
                }
                z3 = false;
            } else {
                float f3 = kdi0.a;
            }
            sy6 sy6Var = z3 ? lc.b : lc.a;
            int i4 = i3 & 14;
            boolean l = (i4 == 4 || ((i3 & 8) != 0 && M.y(wv70Var))) | ((i3 & 112) == 32) | M.l(z3);
            Object x = M.x();
            if (l || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.gc2
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tgi0 tgi0Var = (tgi0) obj;
                        long a = wv70.this.a();
                        tgi0Var.a(kdi0.c, new jdi0(z ? Handle.SelectionStart : Handle.SelectionEnd, a, z3 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & a) != 9205357640488583168L));
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            final q630 b = egi0.b(q630Var, false, (izs) x);
            final rut0 rut0Var = (rut0) M.r(uvi.t);
            final boolean z4 = z3;
            j2 = j3;
            a(wv70Var, sy6Var, kai.c(1365123137, new wzs() { // from class: xsna.hc2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1365123137, intValue, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
                        }
                        c9e0 b2 = uvi.t.b(rut0.this);
                        final long j4 = j2;
                        final boolean z5 = z4;
                        final q630 q630Var2 = b;
                        final wv70 wv70Var2 = wv70Var;
                        rvi.a(b2, kai.c(1260045569, new wzs() { // from class: xsna.jc2
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1260045569, intValue2, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                                    }
                                    long j5 = j4;
                                    boolean z6 = z5;
                                    q630 q630Var3 = q630Var2;
                                    wv70 wv70Var3 = wv70Var2;
                                    a.C0011a.C0012a c0012a = a.C0011a.a;
                                    if (j5 != 9205357640488583168L) {
                                        aVar3.K(3458246);
                                        a.e eVar = z6 ? a.C0007a.b : a.C0007a.a;
                                        q630 o = txj0.o(q630Var3, uco.c(j5), uco.b(j5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                                        dt1.a.getClass();
                                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(eVar, dt1.a.k, aVar3, 0);
                                        int hashCode = Long.hashCode(n34.n(aVar3));
                                        sy90 D = aVar3.D();
                                        q630 c = qri.c(aVar3, o);
                                        cri.h7.getClass();
                                        LayoutNode.a aVar4 = cri.a.b;
                                        if (aVar3.N() == null) {
                                            n34.r();
                                            throw null;
                                        }
                                        aVar3.H();
                                        if (aVar3.L()) {
                                            aVar3.I(aVar4);
                                        } else {
                                            aVar3.f();
                                        }
                                        k9q0.w(aVar3, a, cri.a.f);
                                        k9q0.w(aVar3, D, cri.a.e);
                                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                        k9q0.t(aVar3, cri.a.h);
                                        k9q0.w(aVar3, c, cri.a.d);
                                        boolean y = aVar3.y(wv70Var3);
                                        Object x2 = aVar3.x();
                                        if (y || x2 == c0012a) {
                                            x2 = new yc(wv70Var3, 3);
                                            aVar3.R(x2);
                                        }
                                        nc2.c(6, aVar3, (gzs) x2, q630.a.a, z6);
                                        aVar3.G();
                                        aVar3.j();
                                    } else {
                                        aVar3.K(4389176);
                                        boolean y2 = aVar3.y(wv70Var3);
                                        Object x3 = aVar3.x();
                                        if (y2 || x3 == c0012a) {
                                            x3 = new j1(wv70Var3, 2);
                                            aVar3.R(x3);
                                        }
                                        nc2.c(0, aVar3, (gzs) x3, q630Var3, z6);
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
                        }, aVar2), aVar2, 56);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, i4 | 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final long j4 = j2;
            s.d = new wzs() { // from class: xsna.ic2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nc2.b(wv70.this, z, resolvedTextDirection, z2, j4, f, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final gzs gzsVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2111672474);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2111672474, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:123)");
            }
            f9t.e(qri.a(txj0.s(q630Var, kdi0.a, kdi0.b), a5x.a, new yzs() { // from class: xsna.lc2
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var2 = (q630) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    aVar2.K(-196777734);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-196777734, intValue, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:129)");
                    }
                    final long j = ((qlo0) aVar2.r(rlo0.a)).a;
                    boolean p = aVar2.p(j);
                    final gzs gzsVar2 = gzsVar;
                    boolean J = p | aVar2.J(gzsVar2);
                    final boolean z2 = z;
                    boolean l = J | aVar2.l(z2);
                    Object x = aVar2.x();
                    if (l || x == a.C0011a.a) {
                        x = new izs() { // from class: xsna.mc2
                            @Override // xsna.izs
                            public final Object invoke(Object obj4) {
                                ColorFilter porterDuffColorFilter;
                                kw8 kw8Var = (kw8) obj4;
                                final agw d = nc2.d(kw8Var, Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) / 2.0f);
                                int i4 = Build.VERSION.SDK_INT;
                                long j2 = j;
                                if (i4 >= 29) {
                                    se7.b();
                                    porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
                                } else {
                                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
                                }
                                final oe7 oe7Var = new oe7(j2, 5, porterDuffColorFilter);
                                final gzs gzsVar3 = gzsVar2;
                                final boolean z3 = z2;
                                return kw8Var.e(new izs() { // from class: xsna.fc2
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj5) {
                                        ggj ggjVar = (ggj) obj5;
                                        ggjVar.s1();
                                        if (!((Boolean) gzs.this.invoke()).booleanValue()) {
                                            return s3q0.a;
                                        }
                                        boolean z4 = z3;
                                        agw agwVar = d;
                                        oe7 oe7Var2 = oe7Var;
                                        if (z4) {
                                            long n1 = ggjVar.n1();
                                            er9.b a0 = ggjVar.a0();
                                            long d2 = a0.d();
                                            a0.a().e();
                                            try {
                                                a0.a.i(n1, -1.0f, 1.0f);
                                                oio.R(ggjVar, agwVar, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var2, 46);
                                            } finally {
                                                nq.b(a0, d2);
                                            }
                                        } else {
                                            oio.R(ggjVar, agwVar, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var2, 46);
                                        }
                                        return s3q0.a;
                                    }
                                });
                            }
                        };
                        aVar2.R(x);
                    }
                    q630 e = bu00.e(q630Var2, (izs) x);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                    return e;
                }
            }), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kc2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nc2.c(ne7.I(i | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final agw d(kw8 kw8Var, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        aa2 aa2Var = fdi.f;
        d52 d52Var = fdi.g;
        er9 er9Var = fdi.h;
        if (aa2Var != null) {
            Bitmap bitmap = aa2Var.a;
            if (d52Var != null) {
                if (ceil <= bitmap.getWidth()) {
                }
            }
        }
        aa2Var = q6x.n(ceil, ceil, 1);
        fdi.f = aa2Var;
        d52Var = rte0.b(aa2Var);
        fdi.g = d52Var;
        aa2 aa2Var2 = aa2Var;
        d52 d52Var2 = d52Var;
        Bitmap bitmap2 = aa2Var2.a;
        if (er9Var == null) {
            er9Var = new er9();
            fdi.h = er9Var;
        }
        er9 er9Var2 = er9Var;
        er9.a aVar = er9Var2.b;
        LayoutDirection layoutDirection = kw8Var.b.getLayoutDirection();
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        azl azlVar = aVar.a;
        LayoutDirection layoutDirection2 = aVar.b;
        yq9 yq9Var = aVar.c;
        long j = aVar.d;
        aVar.a = kw8Var;
        aVar.b = layoutDirection;
        aVar.c = d52Var2;
        aVar.d = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
        d52Var2.e();
        oio.P(er9Var2, l5g.b, 0L, er9Var2.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 58);
        oio.P(er9Var2, f870.d(4278190080L), 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
        oio.V1(er9Var2, f870.d(4278190080L), f, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
        d52Var2.a();
        aVar.a = azlVar;
        aVar.b = layoutDirection2;
        aVar.c = yq9Var;
        aVar.d = j;
        return aa2Var2;
    }
}
