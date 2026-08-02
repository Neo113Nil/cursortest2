package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.o2d0;
import xsna.q630;
import xsna.u700;

/* compiled from: FeedFooter.kt */
/* loaded from: classes18.dex */
public final class xzq {
    /* JADX WARN: Removed duplicated region for block: B:141:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gzs gzsVar, final q630 q630Var, boolean z, final float f, float f2, float f3, final float f4, final float f5, boolean z2, sg50 sg50Var, final String str, String str2, final String str3, jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.a aVar2;
        final float f6;
        final float f7;
        final boolean z3;
        final boolean z4;
        final sg50 sg50Var2;
        final String str4;
        androidx.compose.runtime.f s;
        sg50 sg50Var3;
        Object a;
        LayoutNode.a aVar3;
        cri.a.e eVar;
        int i10;
        sg50 sg50Var4;
        cri.a.c cVar;
        cri.a.C2678a c2678a;
        cri.a.d dVar;
        Throwable th;
        int i11;
        q630 q630Var2;
        final jai jaiVar2 = jaiVar;
        androidx.compose.runtime.a M = aVar.M(-491070081);
        if ((i & 6) == 0) {
            i4 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.J(q630Var) ? 32 : 16;
        }
        int i12 = i4 | 384;
        if ((i & 3072) == 0) {
            i12 |= M.n(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i12 |= M.n(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i12 |= M.n(f3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i12 |= M.n(f4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i12 |= M.n(f5) ? 8388608 : 4194304;
        }
        int i13 = i3 & 256;
        if (i13 != 0) {
            i12 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i12 |= M.l(z2) ? 67108864 : 33554432;
        }
        int i14 = i3 & 512;
        if (i14 != 0) {
            i12 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i5 = i14;
            i12 |= M.J(sg50Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            if ((i2 & 6) != 0) {
                i6 = i2 | (M.J(str) ? 4 : 2);
            } else {
                i6 = i2;
            }
            i7 = i3 & 2048;
            if (i7 == 0) {
                i6 |= 48;
            } else if ((i2 & 48) == 0) {
                i8 = i7;
                i6 |= M.J(str2) ? 32 : 16;
                if ((i2 & 384) == 0) {
                    i6 |= M.J(str3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    i6 |= M.y(jaiVar2) ? 2048 : 1024;
                }
                i9 = i6;
                if (M.t(i12 & 1, (i12 & 306783379) == 306783378 || (i9 & 1171) != 1170)) {
                    boolean z5 = i13 != 0 ? true : z2;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (i5 != 0) {
                        Object x = M.x();
                        if (x == c0012a) {
                            x = ir.h(M);
                        }
                        sg50Var3 = (sg50) x;
                    } else {
                        sg50Var3 = sg50Var;
                    }
                    String str5 = i8 != 0 ? null : str2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-491070081, i12, i9, "com.vk.feed.design.compose.newsfeed.footer.FooterButton (FeedFooter.kt:428)");
                    }
                    mlg0 a2 = z5 ? qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true) : null;
                    uog0 b = vog0.b(f5);
                    boolean z6 = ((i9 & 112) == 32) | ((i9 & 14) == 4) | ((i9 & 896) == 256);
                    Object x2 = M.x();
                    if (z6 || x2 == c0012a) {
                        a = com.vk.core.compose.component.semantics.b.a(null, new n43(str, str5, str3, 2), 3);
                        M.R(a);
                    } else {
                        a = x2;
                    }
                    SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) a;
                    q630 b2 = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, q630Var);
                    if (z5) {
                        b2 = b2.g(new q2d0(sg50Var3));
                    }
                    q630 b3 = com.vk.core.compose.component.semantics.b.b(b2, semanticsConfiguration);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, b3);
                    cri.h7.getClass();
                    String str6 = str5;
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar2 = cri.a.f;
                    k9q0.w(M, d, cVar2);
                    cri.a.e eVar2 = cri.a.e;
                    k9q0.w(M, D, eVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(M, c2678a2);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(M, c, dVar2);
                    q630.a aVar5 = q630.a.a;
                    if (z5) {
                        M.K(-1596050130);
                        q630 a3 = cuw.a(rte0.d(ra8.a.a(aVar5), b), sg50Var3, a2);
                        if (gzsVar != null) {
                            sg50Var4 = sg50Var3;
                            aVar3 = aVar4;
                            eVar = eVar2;
                            aVar2 = M;
                            c2678a = c2678a2;
                            dVar = dVar2;
                            cVar = cVar2;
                            i10 = i9;
                            z3 = true;
                            th = null;
                            i11 = 0;
                            q630Var2 = ojc.b(aVar5, sg50Var4, null, true, new plg0(0), gzsVar, 8);
                        } else {
                            aVar3 = aVar4;
                            eVar = eVar2;
                            i10 = i9;
                            sg50Var4 = sg50Var3;
                            aVar2 = M;
                            cVar = cVar2;
                            c2678a = c2678a2;
                            dVar = dVar2;
                            z3 = true;
                            i11 = 0;
                            th = null;
                            q630Var2 = aVar5;
                        }
                        ja8.a(a3.g(q630Var2), aVar2, i11);
                    } else {
                        aVar3 = aVar4;
                        eVar = eVar2;
                        i10 = i9;
                        sg50Var4 = sg50Var3;
                        aVar2 = M;
                        cVar = cVar2;
                        c2678a = c2678a2;
                        dVar = dVar2;
                        z3 = true;
                        th = null;
                        aVar2.K(-1613641731);
                    }
                    aVar2.j();
                    f6 = f2;
                    f7 = f3;
                    q630 G = s200.G(aVar5, f6, f4, f7, f4);
                    int i15 = (i10 & 7168) | 384;
                    androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar2, 48);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, G);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw th;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a4, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    jaiVar2 = jaiVar;
                    jaiVar2.invoke(tpg0.a, aVar2, Integer.valueOf(((i15 >> 6) & 112) | 6));
                    aVar2.G();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    sg50Var2 = sg50Var4;
                    str4 = str6;
                    z4 = z5;
                } else {
                    aVar2 = M;
                    f6 = f2;
                    f7 = f3;
                    aVar2.h();
                    z3 = z;
                    z4 = z2;
                    sg50Var2 = sg50Var;
                    str4 = str2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.bzq
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            int I2 = ne7.I(i2);
                            xzq.a(gzs.this, q630Var, z3, f, f6, f7, f4, f5, z4, sg50Var2, str, str4, str3, jaiVar2, (androidx.compose.runtime.a) obj, I, I2, i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i8 = i7;
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i9 = i6;
            if (M.t(i12 & 1, (i12 & 306783379) == 306783378 || (i9 & 1171) != 1170)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        i5 = i14;
        if ((i2 & 6) != 0) {
        }
        i7 = i3 & 2048;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i9 = i6;
        if (M.t(i12 & 1, (i12 & 306783379) == 306783378 || (i9 & 1171) != 1170)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final q630 q630Var, long j, long j2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final long j3;
        final long j4;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        t700 t700Var;
        androidx.compose.runtime.a M = aVar.M(1207143685);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1207143685, i3, -1, "com.vk.feed.design.compose.newsfeed.footer.ReactionLottieOverlay (FeedFooter.kt:762)");
            }
            t700 c = guf0.c(new u700.f(str), M, 0);
            s600 k = emi.k((i700) c.getValue(), true, true, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, M, 1573296, 952);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            final long j5 = 700;
            mtk0 b = hg2.b(((Boolean) wh50Var.getValue()).booleanValue() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f, jq2.d((int) 700, 0, null, 6), "reactionOverlayAlpha", null, M, 3072, 20);
            i700 i700Var = (i700) c.getValue();
            boolean J = M.J(c) | M.J(wh50Var) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object x2 = M.x();
            final long j6 = 500;
            if (J || x2 == obj) {
                t700Var = c;
                x2 = new pzq(500L, 700L, t700Var, wh50Var, null);
                M.R(x2);
            } else {
                t700Var = c;
            }
            bap.f(str, i700Var, (wzs) x2, M, i4);
            if (((i700) t700Var.getValue()) == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new wzs() { // from class: xsna.fzq
                        @Override // xsna.wzs
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            xzq.b(str, q630Var, j6, j5, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            boolean J2 = M.J(b);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                x3 = new t1e(b, 19);
                M.R(x3);
            }
            q630 a = rdu.a(q630Var, (izs) x3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, a);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            i700 i700Var2 = (i700) t700Var.getValue();
            boolean J3 = M.J(k);
            Object x4 = M.x();
            if (J3 || x4 == obj) {
                x4 = new wqf(k, 18);
                M.R(x4);
            }
            z600.a(i700Var2, (gzs) x4, null, false, false, false, false, null, false, null, null, null, false, false, null, null, false, M, 0, 0, 131068);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j3 = 500;
            j4 = 700;
        } else {
            M.h();
            j3 = j;
            j4 = j2;
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs() { // from class: xsna.gzq
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    xzq.b(str, q630Var, j3, j4, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void c(final String str, final izs izsVar, q630 q630Var, long j, frv0 frv0Var, final String str2, final String str3, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final long j2;
        final frv0 frv0Var2;
        long j3;
        frv0 frv0Var3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1660106620);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 9600 | (M.J(str2) ? 131072 : 65536) | (M.J(str3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            M.V();
            int i4 = i & 1;
            q630.a aVar3 = q630.a.a;
            if (i4 == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j3 = ylu0Var.getText().p;
                M.K(1929604260);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var4 = wuv0Var.i0;
                M.j();
                frv0Var3 = frv0Var4;
                i2 = i3 & (-64513);
                q630Var2 = aVar3;
            } else {
                M.h();
                j3 = j;
                frv0Var3 = frv0Var;
                i2 = i3 & (-64513);
                q630Var2 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1660106620, i2, -1, "com.vk.feed.design.compose.newsfeed.footer.VkFooterLabel (FeedFooter.kt:494)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, 1, s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2));
            boolean z = (i2 & 112) == 32;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new izq(izsVar, wh50Var);
                M.R(x3);
            }
            q630 b2 = ojc.b(b, sg50Var, null, false, null, (gzs) x3, 28);
            boolean z2 = ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576);
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = com.vk.core.compose.component.semantics.b.a(null, new jzq(str2, str3), 3);
                M.R(x4);
            }
            q630 b3 = com.vk.core.compose.component.semantics.b.b(b2, (SemanticsConfiguration) x4);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new kzq(0, wh50Var);
                M.R(x5);
            }
            aVar2 = M;
            long j4 = j3;
            yqv0.c(str, egi.o(H, (izs) x5), j4, null, null, 0, 3, null, 2, false, 0, 1, null, frv0Var3, aVar2, (i2 & 14) | 100663344, 48, 5816);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j4;
            frv0Var2 = frv0Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            j2 = j;
            frv0Var2 = frv0Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, izsVar, q630Var2, j2, frv0Var2, str2, str3, i) { // from class: xsna.lzq
                public final /* synthetic */ String b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ frv0 f;
                public final /* synthetic */ String g;
                public final /* synthetic */ String h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    xzq.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final gzs gzsVar, final q630 q630Var, final lg90 lg90Var, final l5g l5gVar, float f, final String str, long j, frv0 frv0Var, float f2, boolean z, final String str2, final String str3, final String str4, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str5;
        androidx.compose.runtime.a aVar2;
        final float f3;
        final long j2;
        final frv0 frv0Var2;
        final float f4;
        final boolean z2;
        long j3;
        int i3;
        final float f5;
        final float f6;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(1366693921);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(l5gVar) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            str5 = str;
            i4 |= M.J(str5) ? 131072 : 65536;
        } else {
            str5 = str;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        int i5 = i4 | 905969664;
        int i6 = (M.J(str2) ? 4 : 2) | (M.J(str3) ? 32 : 16) | (M.J(str4) ? 256 : 128);
        if (M.t(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                float f7 = 24;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j4 = ylu0Var.getText().m;
                M.K(-867122418);
                if (androidx.compose.runtime.b.d()) {
                    j3 = j4;
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                } else {
                    j3 = j4;
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var3 = wuv0Var.h0;
                M.j();
                frv0Var2 = frv0Var3;
                i3 = i5 & (-33030145);
                f5 = 4;
                f6 = f7;
                z3 = true;
                j2 = j3;
            } else {
                M.h();
                i3 = i5 & (-33030145);
                f6 = f;
                j2 = j;
                frv0Var2 = frv0Var;
                f5 = f2;
                z3 = z;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1366693921, i3, i6, "com.vk.feed.design.compose.newsfeed.footer.VkIconFooterButton (FeedFooter.kt:548)");
            }
            int i7 = i3;
            float f8 = 4;
            final String str6 = str5;
            aVar2 = M;
            a(gzsVar, q630Var, false, 32, 6, f8, f8, 16, z3, null, str2, null, str3, kai.c(369663285, new yzs() { // from class: xsna.zyq
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v10, types: [xsna.q630] */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j5;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(369663285, intValue, -1, "com.vk.feed.design.compose.newsfeed.footer.VkIconFooterButton.<anonymous> (FeedFooter.kt:561)");
                        }
                        q630.a aVar4 = q630.a.a;
                        lg90 lg90Var2 = lg90.this;
                        if (lg90Var2 != null) {
                            aVar3.K(342811678);
                            q630 q = txj0.q(aVar4, f6);
                            l5g l5gVar2 = l5gVar;
                            if (l5gVar2 == null) {
                                aVar3.K(-1235861248);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j5 = ylu0Var2.getText().m;
                                aVar3.j();
                            } else {
                                aVar3.K(-1235862240);
                                aVar3.j();
                                j5 = l5gVar2.a;
                            }
                            pzu0.b(lg90Var2, null, q, j5, aVar3, 56, 0);
                        } else {
                            aVar3.K(321648877);
                        }
                        aVar3.j();
                        String str7 = str6;
                        if (str7 != null) {
                            aVar3.K(343080169);
                            if (lg90Var2 != null) {
                                aVar3.K(-1235858220);
                                mq.d(aVar4, f5, aVar3, 0);
                            } else {
                                aVar3.K(321648877);
                                aVar3.j();
                            }
                            String str8 = str4;
                            q630.a aVar5 = aVar4;
                            if (str8 != null) {
                                aVar5 = ahn.E(aVar4, str8);
                            }
                            yqv0.c(str7, aVar5, j2, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var2, aVar3, 100663296, 48, 5880);
                            aVar3 = aVar3;
                        } else {
                            aVar3.K(321648877);
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, (i7 & 14) | 14355456 | (i7 & 112) | (234881024 & (i7 >> 3)), (i6 & 14) | 3072 | ((i6 << 3) & 896), 2564);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f4 = f5;
            z2 = z3;
            f3 = f6;
        } else {
            aVar2 = M;
            aVar2.h();
            f3 = f;
            j2 = j;
            frv0Var2 = frv0Var;
            f4 = f2;
            z2 = z;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hzq
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    xzq.d(gzs.this, q630Var, lg90Var, l5gVar, f3, str, j2, frv0Var2, f4, z2, str2, str3, str4, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(q630 q630Var, float f, float f2, yyq yyqVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final float f3;
        androidx.compose.runtime.a aVar2;
        final float f4;
        float f5;
        final yyq yyqVar2 = yyqVar;
        androidx.compose.runtime.a M = aVar.M(-271127290);
        int i2 = i | 438 | (M.J(yyqVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            float f6 = 24;
            float f7 = 32;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-271127290, i2, -1, "com.vk.feed.design.compose.newsfeed.footer.VkLikeIconSlot (FeedFooter.kt:646)");
            }
            q630.a aVar3 = q630.a.a;
            if (yyqVar2 != null) {
                M.K(1680658421);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new rzq(f6, f7);
                    M.R(x);
                }
                cp10 cp10Var = (cp10) x;
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, aVar3);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, cp10Var, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                q630 q = txj0.q(aVar3, f6);
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.f;
                cp10 d = ja8.d(ty6Var, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, q);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                jaiVar.invoke(M, 6);
                M.G();
                q630 q2 = txj0.q(aVar3, f7);
                cp10 d2 = ja8.d(ty6Var, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c3 = qri.c(M, q2);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cVar);
                k9q0.w(M, D3, eVar);
                ur.d(hashCode3, M, bVar, M, c2678a);
                k9q0.w(M, c3, dVar);
                yyqVar2 = yyqVar;
                yyqVar2.a(null, M, (i2 >> 6) & 112);
                M.G();
                M.G();
                M.j();
                f5 = f6;
            } else {
                M.K(1681597132);
                f5 = f6;
                q630 q3 = txj0.q(aVar3, f5);
                dt1.a.getClass();
                cp10 d3 = ja8.d(dt1.a.f, false);
                int hashCode4 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c4 = qri.c(M, q3);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d3, cri.a.f);
                k9q0.w(M, D4, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode4), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c4, cri.a.d);
                jaiVar.invoke(M, 6);
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f3 = f5;
            aVar2 = M;
            f4 = f7;
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
            f3 = f;
            aVar2 = M;
            f4 = f2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(f3, f4, yyqVar2, jaiVar, i) { // from class: xsna.ezq
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ yyq e;
                public final /* synthetic */ jai f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(24577);
                    xzq.e(q630.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final lg90 lg90Var, final String str, final gzs gzsVar, final wzs wzsVar, final q630 q630Var, final long j, final float f, final long j2, final String str2, final String str3, final String str4, final String str5, final yyq yyqVar, final boolean z, final Integer num, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        p6z p6zVar;
        androidx.compose.runtime.a M = aVar.M(-1711843525);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(wzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= M.p(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= M.n(f) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.p(j2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= M.J(str2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= M.J(str3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i4 = (M.J(str4) ? 4 : 2) | (M.J(str5) ? 32 : 16) | (M.J(yyqVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.J(num) ? 16384 : 8192);
        if (M.t(i2 & 1, ((i2 & 306783379) == 306783378 && (i4 & 9363) == 9362) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1711843525, i2, i4, "com.vk.feed.design.compose.newsfeed.footer.VkLikesFooterButton (FeedFooter.kt:697)");
            }
            if (androidx.compose.runtime.b.d()) {
                i3 = i2;
                androidx.compose.runtime.b.f(681457413, 0, -1, "com.vk.feed.design.compose.newsfeed.footer.rememberLikeScaleAnimator (LikeScaleAnimator.kt:62)");
            } else {
                i3 = i2;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new p6z(0);
                M.R(x);
            }
            p6z p6zVar2 = (p6z) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ir.h(M);
            }
            final sg50 sg50Var = (sg50) x2;
            Boolean valueOf = Boolean.valueOf(z);
            int i5 = i4 & 896;
            boolean J = ((i4 & 7168) == 2048) | (i5 == 256) | ((i4 & 57344) == 16384) | M.J(p6zVar2);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                p6zVar = p6zVar2;
                x3 = new szq(z, yyqVar, num, p6zVar, null);
                M.R(x3);
            } else {
                p6zVar = p6zVar2;
            }
            bap.e(num, valueOf, yyqVar, (wzs) x3, M, ((i4 >> 12) & 14) | ((i4 >> 6) & 112) | i5);
            final p6z p6zVar3 = p6zVar;
            int i6 = i3 >> 6;
            g(gzsVar, wzsVar, sg50Var, null, kai.c(1355967987, new wzs() { // from class: xsna.mzq
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1355967987, intValue, -1, "com.vk.feed.design.compose.newsfeed.footer.VkLikesFooterButton.<anonymous> (FeedFooter.kt:711)");
                        }
                        float f2 = 4;
                        final yyq yyqVar2 = yyqVar;
                        final String str6 = str;
                        final String str7 = str5;
                        final long j3 = j2;
                        final lg90 lg90Var2 = lg90Var;
                        final float f3 = f;
                        final p6z p6zVar4 = p6zVar3;
                        final long j4 = j;
                        xzq.a(null, q630.this, false, 32, 6, f2, f2, 16, false, sg50Var, str2, str3, str4, kai.c(-358490105, new yzs() { // from class: xsna.czq
                            @Override // xsna.yzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-358490105, intValue2, -1, "com.vk.feed.design.compose.newsfeed.footer.VkLikesFooterButton.<anonymous>.<anonymous> (FeedFooter.kt:725)");
                                    }
                                    final lg90 lg90Var3 = lg90Var2;
                                    final float f4 = f3;
                                    final p6z p6zVar5 = p6zVar4;
                                    final long j5 = j4;
                                    xzq.e(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yyq.this, kai.c(2043669459, new wzs() { // from class: xsna.dzq
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj6, Object obj7) {
                                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj6;
                                            int intValue3 = ((Integer) obj7).intValue();
                                            if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(2043669459, intValue3, -1, "com.vk.feed.design.compose.newsfeed.footer.VkLikesFooterButton.<anonymous>.<anonymous>.<anonymous> (FeedFooter.kt:727)");
                                                }
                                                pzu0.b(lg90.this, null, bu00.f(s200.D(txj0.q(q630.a.a, 24), f4), new ayo(p6zVar5, 13)), j5, aVar4, 56, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar4.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar3), aVar3, 24576);
                                    String str8 = str6;
                                    if (str8 != null) {
                                        aVar3.K(1805574508);
                                        q630 q630Var2 = q630.a.a;
                                        f9t.e(txj0.v(q630Var2, 4), aVar3, 6);
                                        String str9 = str7;
                                        if (str9 != null) {
                                            q630Var2 = ahn.E(q630Var2, str9);
                                        }
                                        aVar3.K(-911574380);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                        }
                                        wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        frv0 frv0Var = wuv0Var.h0;
                                        aVar3.j();
                                        yqv0.c(str8, q630Var2, j3, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar3, 100663296, 48, 5880);
                                        aVar3 = aVar3;
                                    } else {
                                        aVar3.K(1778269243);
                                    }
                                    aVar3.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 819661830, 3072, 260);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i6 & 14) | 24960 | (i6 & 112));
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nzq
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    xzq.f(lg90.this, str, gzsVar, wzsVar, q630Var, j, f, j2, str2, str3, str4, str5, yyqVar, z, num, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(final gzs gzsVar, final wzs wzsVar, final sg50 sg50Var, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-99358185);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(wzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(sg50Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-99358185, i3, -1, "com.vk.feed.design.compose.newsfeed.footer.VkReactionsTouchArea (FeedFooter.kt:590)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            final yvj yvjVar = (yvj) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new wzq();
                M.R(x3);
            }
            final wzq wzqVar = (wzq) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new l2i(wh50Var, 8);
                M.R(x4);
            }
            q630.a aVar2 = q630.a.a;
            q630 o = egi.o(aVar2, (izs) x4);
            boolean y = M.y(wzqVar) | M.y(yvjVar) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object x5 = M.x();
            if (y || x5 == c0012a) {
                q630Var3 = o;
                x5 = new izs() { // from class: xsna.ozq
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        boolean z;
                        MotionEvent motionEvent = (MotionEvent) obj;
                        Rect rect = (Rect) wh50Var.getValue();
                        if (rect == null) {
                            z = false;
                        } else {
                            int actionMasked = motionEvent.getActionMasked();
                            wzq wzqVar2 = wzq.this;
                            yvj yvjVar2 = yvjVar;
                            sg50 sg50Var2 = sg50Var;
                            if (actionMasked == 0) {
                                float x6 = motionEvent.getX();
                                float y2 = motionEvent.getY();
                                o2d0.b bVar = new o2d0.b((Float.floatToRawIntBits(y2) & 4294967295L) | (Float.floatToRawIntBits(x6) << 32));
                                wzqVar2.a = bVar;
                                myc0.h(yvjVar2, null, null, new tzq(null, sg50Var2, bVar), 3);
                            } else if (actionMasked == 1) {
                                o2d0.b bVar2 = wzqVar2.a;
                                if (bVar2 != null) {
                                    myc0.h(yvjVar2, null, null, new uzq(null, sg50Var2, bVar2), 3);
                                }
                                wzqVar2.a = null;
                            } else if (actionMasked == 3) {
                                o2d0.b bVar3 = wzqVar2.a;
                                if (bVar3 != null) {
                                    myc0.h(yvjVar2, null, null, new vzq(null, sg50Var2, bVar3), 3);
                                }
                                wzqVar2.a = null;
                            }
                            if (!((Boolean) wzsVar.invoke(motionEvent, rect)).booleanValue() && motionEvent.getActionMasked() == 1) {
                                gzsVar.invoke();
                            }
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                };
                M.R(x5);
            } else {
                q630Var3 = o;
            }
            q630 R = x19.R(q630Var3, (izs) x5);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, R);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f((i3 >> 12) & 14, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new azq(gzsVar, wzsVar, sg50Var, q630Var2, jaiVar, i);
        }
    }

    public static final RectF h(tny tnyVar) {
        if (tnyVar == null) {
            return new RectF();
        }
        long U = tnyVar.U(0L);
        int i = (int) (U >> 32);
        int i2 = (int) (U & 4294967295L);
        return new RectF(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + ((int) (tnyVar.a() >> 32)), Float.intBitsToFloat(i2) + ((int) (tnyVar.a() & 4294967295L)));
    }
}
