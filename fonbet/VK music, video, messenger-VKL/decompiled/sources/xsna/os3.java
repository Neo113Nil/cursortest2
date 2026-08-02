package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: ArtistMixCard.kt */
/* loaded from: classes16.dex */
public final class os3 {
    public static final void a(final ds3 ds3Var, final float f, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1261318478);
        if ((i & 6) == 0) {
            i2 = (M.J(ds3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1261318478, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistImage (ArtistMixCard.kt:138)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            q630.a aVar2 = q630.a.a;
            q630 g = q630Var.g(txj0.y(aVar2, bVar, true));
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f9t.e(txj0.h(aVar2, f), M, 0);
            q630 m = txj0.m(aVar2, 158);
            uog0 uog0Var = vog0.a;
            q630 d = rte0.d(m, uog0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            fwu0.c(r18.a(0.5f, ylu0Var.getImage().a, d, uog0Var), ds3Var.g, null, null, null, null, null, abi.b, M, 100663296, 252);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ns3
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    os3.a(ds3.this, f, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(ds3 ds3Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1965812133);
        if ((i & 6) == 0) {
            i2 = (M.J(ds3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1965812133, i3, -1, "com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistMixCard (ArtistMixCard.kt:47)");
            }
            float f = PsExtractor.VIDEO_STREAM_MASK;
            q630Var2 = q630.a.a;
            q630 s = txj0.s(q630Var2, 198, f);
            float f2 = 12;
            q630 d = rte0.d(s, vog0.b(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.l().Q, vog0.b(f2));
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i4 = i3 & 14;
            c(ds3Var, M, i4);
            d(ds3Var, M, i4);
            String str = ds3Var.g;
            ra8 ra8Var = ra8.a;
            if (str == null || drm0.N(str)) {
                M.K(-380725811);
            } else {
                M.K(-378163847);
                a(ds3Var, 120, ra8Var.b(q630Var2, dt1.a.c), M, i4 | 48);
            }
            M.j();
            q630 D2 = s200.D(ra8Var.b(q630Var2, dt1.a.j), f2);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            com.vk.catalog.mvi.block.music.impl.ui.a.a(ds3Var.d, null, M, 0, 2);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ks3(ds3Var, q630Var2, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public static final void c(ds3 ds3Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2015811283);
        if ((i & 6) == 0) {
            i2 = (M.J(ds3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2015811283, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.mix.Background (ArtistMixCard.kt:79)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new n82(3);
                M.R(x);
            }
            q630 a = rdu.a(q630.a.a, (izs) x);
            kbe kbeVar = ((dai.c) ds3Var.h.getValue()).c;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ir.h(M);
            }
            q630 b = ojc.b(a, (sg50) x2, null, false, null, kbeVar, 28);
            String str = ds3Var.g;
            boolean z = (i2 & 14) == 4;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new mh(ds3Var, 6);
                M.R(x3);
            }
            fwu0.c(b, str, null, null, (gzs) x3, null, new qow(new jwx(2, 40)), abi.a, M, 100663296, 172);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ls3(ds3Var, i, 0);
        }
    }

    public static final void d(ds3 ds3Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2060002446);
        if ((i & 6) == 0) {
            i2 = i | (M.J(ds3Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2060002446, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.mix.Header (ArtistMixCard.kt:108)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 16;
            f9t.e(txj0.h(aVar2, f), M, 6);
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
            String str = ds3Var.c;
            long j = l5g.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, F, j, null, null, 0, 0, null, 2, false, 0, 2, null, wuv0Var.f, M, 100663728, 48, 5880);
            M = M;
            String str2 = ds3Var.e;
            if (str2 == null || str2.length() == 0) {
                M.K(-1348705082);
            } else {
                M.K(-1344392393);
                f9t.e(txj0.h(aVar2, 4), M, 6);
                q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
                String str3 = ds3Var.e;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str3, F2, j, null, null, 0, 0, null, 2, false, 0, 2, null, wuv0Var2.m0, M, 100663728, 48, 5880);
                M = M;
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
            s.d = new ms3(ds3Var, i, 0);
        }
    }
}
