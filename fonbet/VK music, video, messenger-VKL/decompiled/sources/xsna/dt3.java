package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.oq3;
import xsna.q630;

/* compiled from: ArtistSliderCard.kt */
/* loaded from: classes16.dex */
public final class dt3 {
    public static final void a(jt3 jt3Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1201720916);
        int i2 = (i & 6) == 0 ? (M.J(jt3Var) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1201720916, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.ArtistBubbles (ArtistSliderCard.kt:151)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, c, cri.a.d);
            M.K(1903287124);
            List list = jt3Var.h;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                d((oq3) list.get(i3), M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zs3(jt3Var, i, 0);
        }
    }

    public static final void b(jt3 jt3Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2043760415);
        if ((i & 6) == 0) {
            i2 = (M.J(jt3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2043760415, i3, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.ArtistSliderCard (ArtistSliderCard.kt:61)");
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
            c(jt3Var, M, i4);
            e(jt3Var, M, i4);
            a(jt3Var, M, i4);
            q630 D2 = s200.D(ra8.a.b(q630Var2, dt1.a.j), f2);
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
            com.vk.catalog.mvi.block.music.impl.ui.a.a(jt3Var.d, ahn.E(q630Var2, "artist_slider_play_pause_btn"), M, 48, 0);
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
            s2.d = new ct3(jt3Var, q630Var2, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public static final void c(jt3 jt3Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-215483926);
        if ((i & 6) == 0) {
            i2 = (M.J(jt3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-215483926, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.Background (ArtistSliderCard.kt:90)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new d40(2);
                M.R(x);
            }
            q630 a = rdu.a(q630.a.a, (izs) x);
            kbe kbeVar = ((dai.c) jt3Var.i.getValue()).c;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ir.h(M);
            }
            fwu0.c(ahn.E(ojc.b(a, (sg50) x2, null, false, null, kbeVar, 28), "artist_slider_background"), jt3Var.f, null, null, null, null, new qow(new jwx(2, 40)), dbi.a, M, 100663296, 188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new at3(jt3Var, i, 0);
        }
    }

    public static final void d(oq3 oq3Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1365730505);
        int i2 = (M.J(oq3Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1365730505, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.Bubble (ArtistSliderCard.kt:160)");
            }
            oq3.a aVar2 = oq3Var.b;
            float f = aVar2.b;
            float f2 = aVar2.c;
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(aVar3, f2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            long j = aVar2.a;
            tbr tbrVar = txj0.a;
            q630 n = txj0.n(aVar3, uco.c(j), uco.b(j));
            uog0 uog0Var = vog0.a;
            q630 d = rte0.d(n, uog0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            fwu0.c(fto0.t(r18.a(0.5f, ylu0Var.getImage().a, d, uog0Var), aVar2.d), oq3Var.a, null, null, null, null, null, dbi.b, M, 100663296, 252);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bt3(oq3Var, i, 0);
        }
    }

    public static final void e(jt3 jt3Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2004465707);
        if ((i & 6) == 0) {
            i2 = i | (M.J(jt3Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2004465707, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.Header (ArtistSliderCard.kt:119)");
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
            q630 E = ahn.E(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), "artist_slider_title");
            String str = jt3Var.c;
            long j = l5g.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.f, M, 100663728, 48, 5880);
            M = M;
            String str2 = jt3Var.e;
            if (str2 == null || str2.length() == 0) {
                M.K(825903041);
            } else {
                M.K(830759873);
                f9t.e(txj0.h(aVar2, 4), M, 6);
                q630 E2 = ahn.E(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), "artist_slider_subtitle");
                String str3 = jt3Var.e;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str3, E2, j, null, null, 0, 0, null, 2, false, 0, 2, null, wuv0Var2.m0, M, 100663728, 48, 5880);
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
            s.d = new ys3(jt3Var, i, 0);
        }
    }
}
