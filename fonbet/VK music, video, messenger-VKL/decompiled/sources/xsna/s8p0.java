package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.gfp0;
import xsna.q630;
import xsna.yk8;

/* compiled from: TopHeader.kt */
/* loaded from: classes3.dex */
public final class s8p0 {
    public static final void a(boolean z, jai jaiVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1607453036);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1607453036, i2, -1, "com.vk.music.stickyplayer.presentation.components.Header (TopHeader.kt:81)");
            }
            ijk.a(Boolean.valueOf(z), null, jq2.d(500, 0, null, 6), "Header", kai.c(-634045515, new lx40(q630Var, izsVar, 1, jaiVar), M), M, (i2 & 14) | 28032, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lw80(z, jaiVar, izsVar, q630Var, i);
        }
    }

    public static final void b(final float f, final float f2, final gfp0 gfp0Var, final izs izsVar, final boolean z, final jai jaiVar, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        float f3;
        int i2;
        izs izsVar2;
        int i3;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1897202221);
        if ((i & 6) == 0) {
            f3 = f;
            i2 = (M.n(f3) ? 4 : 2) | i;
        } else {
            f3 = f;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(gfp0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(jaiVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1897202221, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopHeader (TopHeader.kt:39)");
            }
            q630.a aVar3 = q630.a.a;
            float f4 = 16;
            q630 H = s200.H(txj0.h(s200.F(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(hr80.l(txj0.f(ahn.E(aVar3, "topPlayer"), 1.0f), yk8.a.g(e43.l(new l5g(f870.c(1879048192)), new l5g(l5g.j)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), bw40.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 7);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (f2 < 0.9f) {
                M.K(-1708875918);
                i3 = i2;
                aVar2 = aVar3;
                a(gfp0Var instanceof gfp0.b.a, kai.c(741552850, new lg0(jaiVar, 3), M), izsVar2, o19.a(aVar3, 1.0f - f2), M, ((i3 >> 3) & 896) | 48);
            } else {
                i3 = i2;
                aVar2 = aVar3;
                M.K(-1711063185);
            }
            M.j();
            if (f2 > 0.1f) {
                M.K(-1708495610);
                jaiVar2.invoke(o19.a(aVar2, z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f2), M, Integer.valueOf((i3 >> 15) & 112));
            } else {
                M.K(-1711063185);
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
            s.d = new wzs() { // from class: xsna.r8p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s8p0.b(f, f2, gfp0Var, izsVar, z, jaiVar, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
