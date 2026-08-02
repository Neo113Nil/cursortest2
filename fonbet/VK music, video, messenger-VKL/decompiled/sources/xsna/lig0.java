package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.loh0;
import xsna.q630;
import xsna.ty6;

/* compiled from: ReviewsHeader.kt */
/* loaded from: classes5.dex */
public final class lig0 {
    public static final void a(loh0.f.a aVar, q630 q630Var, q630 q630Var2, q630 q630Var3, androidx.compose.runtime.a aVar2, int i) {
        long j;
        androidx.compose.runtime.a M = aVar2.M(1178194335);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.J(q630Var2) ? 256 : 128) | (M.J(q630Var3) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1178194335, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.AddReviewInfoLine (ReviewsHeader.kt:116)");
            }
            String N = d370.N(R.string.community_reviews_add_review, 0, M);
            long j2 = wlb0.h(M).getText().g;
            if (aVar.b != null) {
                M.K(1115148356);
                j = wlb0.h(M).q().i;
                M.j();
            } else {
                j = vcl0.a(M, 1115216587, M).n;
                M.j();
            }
            f(N, j2, j, q630Var, q630Var2, q630Var3, aVar.b, M, 523264 & (i2 << 6), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j3m(aVar, q630Var, q630Var2, q630Var3, i);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(581952819);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(581952819, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.NoReviewsInfoLine (ReviewsHeader.kt:135)");
            }
            String N = d370.N(R.string.community_reviews_empty_reviews, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var;
            f(N, j, ylu0Var2.getIcon().n, q630Var2, null, null, null, M, (i2 << 9) & 7168, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dd10(q630Var2, i, 1);
        }
    }

    public static final void c(loh0.f.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-301570156);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-301570156, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.RatingReviewsInfoLine (ReviewsHeader.kt:148)");
            }
            int i3 = dVar.c;
            String F = d370.F(R.plurals.reviews_count, i3, new Object[]{Integer.valueOf(i3)}, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f(F, j, ylu0Var2.q().i, q630Var, null, null, dVar.b, M, (i2 << 6) & 7168, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pmg(dVar, q630Var, i, 3);
        }
    }

    public static final void d(mtk0 mtk0Var, loh0.f fVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-800884690);
        if ((i & 6) == 0) {
            i2 = (M.J(mtk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-800884690, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.ReviewInfoLine (ReviewsHeader.kt:67)");
            }
            boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
            int i3 = i2 & 14;
            int i4 = i2 & 896;
            boolean z = ((i2 & 112) == 32) | (i3 == 4) | (i4 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new defpackage.a0(mtk0Var, izsVar, fVar, 6);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            q630 J = xa4.J(aVar2, booleanValue, (gzs) x);
            boolean booleanValue2 = ((Boolean) mtk0Var.getValue()).booleanValue();
            boolean z2 = (i3 == 4) | (i4 == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new uh3(25, mtk0Var, izsVar);
                M.R(x2);
            }
            q630 J2 = xa4.J(aVar2, booleanValue2, (gzs) x2);
            q630 d = rte0.d(q630Var, vog0.b(4));
            if (fVar instanceof loh0.f.a) {
                M.K(-611628331);
                a((loh0.f.a) fVar, d, J, J2, M, 0);
                M.j();
            } else if (epx.f(fVar, loh0.f.c.b)) {
                M.K(-611311697);
                b(d, M, 0);
                M.j();
            } else if (fVar instanceof loh0.f.d) {
                M.K(-611173096);
                c((loh0.f.d) fVar, d, M, 0);
                M.j();
            } else if (epx.f(fVar, loh0.f.e.b)) {
                M.K(-611002875);
                g(d, M, 0);
                M.j();
            } else {
                M.K(-610908046);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iye(mtk0Var, fVar, izsVar, q630Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(loh0.e.a aVar, r5j0 r5j0Var, izs izsVar, mtk0 mtk0Var, q630 q630Var, q630 q630Var2, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(484865554);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(r5j0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i3 = i2 | (M.J(q630Var) ? 16384 : 8192) | (M.J(q630Var2) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(484865554, i3, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.ReviewsHeader (ReviewsHeader.kt:39)");
            }
            q630 d = rte0.d(txj0.f(q630Var, 1.0f), r5j0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = s200.E(hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a).g(q630Var2), 16, 8);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yzt0<loh0.f> yzt0Var = aVar.g;
            loh0.f.b bVar = loh0.f.b.b;
            wh50 d3 = jk50.d(yzt0Var, bVar, M, 48);
            if (epx.f((loh0.f) d3.getValue(), bVar)) {
                M.K(1824211350);
            } else {
                M.K(1826368640);
                d(mtk0Var, (loh0.f) d3.getValue(), izsVar, ra8.a.b(q630.a.a, dt1.a.g), M, 6 | (i3 & 896));
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jig0(aVar, r5j0Var, izsVar, mtk0Var, q630Var, q630Var2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final String str, final long j, final long j2, final q630 q630Var, q630 q630Var2, q630 q630Var3, String str2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        long j3;
        q630 q630Var4;
        int i4;
        q630 q630Var5;
        int i5;
        androidx.compose.runtime.a aVar2;
        final String str3;
        final q630 q630Var6;
        final q630 q630Var7;
        androidx.compose.runtime.f s;
        Throwable th;
        String str4;
        androidx.compose.runtime.a M = aVar.M(-1423940654);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j3 = j2;
            i3 |= M.p(j3) ? 256 : 128;
        } else {
            j3 = j2;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var4 = q630Var2;
            i3 |= M.J(q630Var4) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                q630Var5 = q630Var3;
                i3 |= M.J(q630Var5) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= M.J(str2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                    q630.a aVar3 = q630.a.a;
                    if (i6 != 0) {
                        q630Var4 = aVar3;
                    }
                    q630 q630Var8 = i4 != 0 ? aVar3 : q630Var5;
                    String str5 = i5 != 0 ? null : str2;
                    if (androidx.compose.runtime.b.d()) {
                        th = null;
                        androidx.compose.runtime.b.f(-1423940654, i3, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.ReviewsInfoLine (ReviewsHeader.kt:183)");
                    } else {
                        th = null;
                    }
                    dt1.a.getClass();
                    ty6.b bVar = dt1.a.l;
                    q630 g = str5 == null ? q630Var.g(q630Var4) : q630Var;
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, g);
                    cri.h7.getClass();
                    int i7 = i3;
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw th;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    frv0 frv0Var = wlb0.l(M).e0;
                    q630 H = s200.H(aVar3, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    if (str5 != null) {
                        H = H.g(q630Var4);
                    }
                    int i8 = i7 << 3;
                    yqv0.c(str, H, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, (i7 & 14) | (i8 & 896), 0, 8184);
                    yqv0.c(rik0.a.toString(), null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).e0, M, 0, 0, 8186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(171813404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
                    }
                    lg90 b = or.b(M, -1107727797, R.drawable.vk_icon_favorite_16, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vqv.a(b, null, str5 != null ? q630Var8 : aVar3, j3, M, 56 | (i8 & 7168), 0);
                    androidx.compose.runtime.a aVar5 = M;
                    if (str5 != null) {
                        aVar5.K(-1496347444);
                        frv0 frv0Var2 = wlb0.l(aVar5).h0;
                        long j4 = wlb0.h(aVar5).getText().m;
                        String str6 = str5;
                        yqv0.c(str6, s200.H(aVar3, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14).g(q630Var8), j4, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, aVar5, (i7 >> 18) & 14, 0, 8184);
                        str4 = str6;
                        aVar5 = aVar5;
                    } else {
                        str4 = str5;
                        aVar5.K(-1503467028);
                    }
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1231053620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, 0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j5 = wlb0.h(aVar5).getIcon().n;
                    q630 H2 = s200.H(aVar3, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    if (str4 != null) {
                        H2 = H2.g(q630Var8);
                    }
                    androidx.compose.runtime.a aVar6 = aVar5;
                    vqv.a(a2, null, H2, j5, aVar6, 56, 0);
                    aVar2 = aVar6;
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str3 = str4;
                    q630Var6 = q630Var4;
                    q630Var7 = q630Var8;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    str3 = str2;
                    q630Var6 = q630Var4;
                    q630Var7 = q630Var5;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.kig0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lig0.f(str, j, j2, q630Var, q630Var6, q630Var7, str3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            q630Var5 = q630Var3;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var4 = q630Var2;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        q630Var5 = q630Var3;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void g(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(896341642);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(896341642, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.ReviewsNotAvailableInfoLine (ReviewsHeader.kt:165)");
            }
            String N = d370.N(R.string.community_reviews_not_available, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var;
            f(N, j, ylu0Var2.getIcon().n, q630Var2, null, null, null, M, (i2 << 9) & 7168, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ay80(q630Var2, i, 1);
        }
    }
}
