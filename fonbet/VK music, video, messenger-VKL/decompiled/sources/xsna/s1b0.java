package xsna;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.q630;

/* compiled from: PlayerHeader.kt */
/* loaded from: classes3.dex */
public final class s1b0 {
    public static final void a(final dz40.h hVar, final izs izsVar, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1053504149);
        if ((i & 6) == 0) {
            i2 = (M.J(hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1053504149, i2, -1, "com.vk.music.stickyplayer.presentation.components.PlayerHeader (PlayerHeader.kt:46)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            int i3 = i2;
            lg90 n = m200.n(M);
            long j = l5g.d;
            String N = d370.N(R.string.music_talkback_player_collapse_player, 0, M);
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "collapseFullPlayerButton");
            float f = 28;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new mif(izsVar, 4);
                M.R(x);
            }
            nzu0.c((gzs) x, n, N, E, f, j, false, null, false, null, null, M, 224320, 1984);
            int i5 = i3 << 3;
            b(hVar, izsVar, null, M, (i5 & 896) | (i5 & 112) | 6);
            lg90 s = m200.s(M);
            String N2 = d370.N(R.string.music_talkback_player_share, 0, M);
            q630 E2 = ahn.E(aVar4, "shareCurrentTrackButton");
            boolean z3 = ((i3 & 896) == 256) | (i4 == 32);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new y1j(z, izsVar, 2);
                M.R(x2);
            }
            aVar2 = M;
            nzu0.c(z3r0.d(6, 0, M, (gzs) x2), s, N2, E2, f, j, false, null, false, null, null, aVar2, 224320, 1984);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.r1b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s1b0.a(dz40.h.this, izsVar, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(dz40.h hVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        String str;
        Pair pair;
        androidx.compose.runtime.a M = aVar.M(729806650);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(729806650, i4, -1, "com.vk.music.stickyplayer.presentation.components.SourceInfo (PlayerHeader.kt:89)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            M.K(1264534671);
            q630.a aVar3 = q630.a.a;
            float f = 20;
            q630 b = tpg0Var.b(1.0f, s200.H(txj0.f(aVar3, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), true);
            if (hVar.a()) {
                q630 d = rte0.d(aVar3, vog0.b(8));
                boolean z = (i4 & 896) == 256;
                Object x2 = M.x();
                if (z || x2 == obj) {
                    x2 = new qq5(izsVar, 7);
                    M.R(x2);
                }
                b = b.g(ojc.c(d, false, null, null, (gzs) x2, 15));
            }
            M.j();
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new q8s(1, wh50Var);
                M.R(x3);
            }
            q630 z2 = sv1.z(b, (izs) x3);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, z2);
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
            if (hVar instanceof dz40.h.a) {
                M.K(-1826140331);
                dz40.h.a aVar5 = (dz40.h.a) hVar;
                pair = new Pair(d370.N(aVar5.a, 0, M), aVar5.b);
                M.j();
            } else {
                if (!(hVar instanceof dz40.h.b)) {
                    throw alb0.c(1742205556, M);
                }
                M.K(-1825967475);
                dz40.h.b bVar = (dz40.h.b) hVar;
                String str2 = bVar.b;
                int i5 = bVar.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(189980593, 0, -1, "com.vk.music.stickyplayer.presentation.components.getSourceTypeName (PlayerHeader.kt:153)");
                }
                try {
                    str = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getResources().getString(i5);
                } catch (Resources.NotFoundException unused) {
                    str = "";
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (str2 != null && str2.length() != 0) {
                    if (new Regex("[A-Za-z]+").a(str2)) {
                        str = v1v.a(' ', str, str2);
                    } else {
                        str = str + " «" + str2 + (char) 187;
                    }
                }
                Pair pair2 = new Pair(d370.O(R.string.music_player_header_output_source, new Object[]{bVar.d}, M), str);
                M.j();
                pair = pair2;
            }
            String str3 = (String) pair.d();
            String str4 = (String) pair.g();
            frv0 frv0Var = new frv0(wlb0.l(M).F0.a, true);
            long c2 = l5g.c(14, wlb0.h(M).getText().d, 0.6f);
            q630 E = ahn.E(txj0.f(aVar3, 1.0f), "sourceIdTitle");
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new kl60(7);
                M.R(x4);
            }
            q630 a2 = rdu.a(E, (izs) x4);
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new sux(12);
                M.R(x5);
            }
            q630Var2 = aVar3;
            yqv0.c(str3, bu00.f(a2, (izs) x5), c2, null, null, 0, 3, null, 0, false, 0, 1, null, frv0Var, M, 0, 48, 6072);
            aVar2 = M;
            if (str4 != null) {
                aVar2.K(-1824726824);
                eg10.b(str4, ((q9x) wh50Var.getValue()).a, ahn.E(s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "sourceTypeTitle"), wlb0.h(aVar2).getText().d, 3, 0, false, 0, wlb0.l(aVar2).P, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, aVar2, 384, 7088);
                aVar2 = aVar2;
            } else {
                aVar2.K(-1830234222);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lys(hVar, izsVar, q630Var2, i, 4);
        }
    }
}
