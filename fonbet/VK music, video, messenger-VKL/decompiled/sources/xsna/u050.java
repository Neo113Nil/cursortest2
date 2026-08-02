package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.kbb0;
import xsna.q630;

/* compiled from: MusicPlaylistHeaderSubtitles.kt */
/* loaded from: classes3.dex */
public final class u050 implements aab0 {
    public final mtk0<kbb0> a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;

    public u050(wh50 wh50Var, gzs gzsVar, gzs gzsVar2) {
        this.a = wh50Var;
        this.b = gzsVar;
        this.c = gzsVar2;
    }

    @Override // xsna.aab0
    public final void a(q630 q630Var, dt1.b bVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        dt1.b bVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> t050Var;
        androidx.compose.runtime.a M = aVar.M(-981505105);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-981505105, i3, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistHeaderSubtitles.Component (MusicPlaylistHeaderSubtitles.kt:24)");
            }
            kbb0 value = this.a.getValue();
            boolean z = value instanceof kbb0.g;
            if (z && ((kbb0.g) value).b.length() == 0) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    t050Var = new q1h(i, 4, this, q630Var, bVar);
                    s.d = t050Var;
                }
                return;
            }
            bVar2 = bVar;
            float f = 4;
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f), bVar2, M, (((((i3 << 3) & 896) | 48) >> 3) & 112) | 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            if (z) {
                M.K(2091767293);
            } else {
                M.K(2093154047);
                zbb0.a(value, ahn.E(aVar3, "playlistOwner"), this.b, M, 48);
            }
            M.j();
            kab0.a(value, ahn.E(aVar3, "playlistInfo"), M, 48);
            if ((value instanceof kbb0.e) && ((kbb0.e) value).b()) {
                M.K(2093596944);
                wz40.a(6, M, this.c, ahn.E(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "playlistFreeLine"));
            } else {
                M.K(2091767293);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            bVar2 = bVar;
            M.h();
        }
        s = M.s();
        if (s != null) {
            t050Var = new t050(i, 0, this, q630Var, bVar2);
            s.d = t050Var;
        }
    }
}
