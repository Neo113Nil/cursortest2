package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b78;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkAppBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class x8u0 {
    public static final void a(b78.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-698359459);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-698359459, i2, -1, "com.vk.music.stickyplayer.presentation.components.AdvertisementButtons (VkAppBottomPlayer.kt:630)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(24, dt1.a.p), bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630 E = ahn.E(q630.a.a, "adsMoreButton");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(864001564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.music_talkback_more, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new mwm0(aVar, 18);
                M.R(x);
            }
            aVar3 = M;
            nzu0.c((gzs) x, a2, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar3, 3136, 2000);
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new c8k(aVar, q630Var, i, 3);
        }
    }

    public static final void b(b78.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(1676479359);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1676479359, i2, -1, "com.vk.music.stickyplayer.presentation.components.AdvertisementMiddle (VkAppBottomPlayer.kt:419)");
            }
            q630 E = ahn.E(q630Var, "adsTitle");
            String N = d370.N(R.string.music_player_ad_title, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.j0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3 = M;
            yqv0.c(N, E, ylu0Var.getText().m, null, null, 0, 3, null, 2, false, 0, 1, null, frv0Var, aVar3, 100663296, 48, 5816);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new jqh(aVar, q630Var, i, 5);
        }
    }

    public static final void c(b78.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(268159133);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(268159133, i2, -1, "com.vk.music.stickyplayer.presentation.components.AudioBookButtons (VkAppBottomPlayer.kt:590)");
            }
            dt1.a.getClass();
            ty6.b bVar2 = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(24, dt1.a.p), bVar2, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            ijk.a(Boolean.valueOf(bVar.isPlaying()), null, jq2.d(500, 0, luo.d, 2), "Fast forward/Close button", kai.c(-1876980134, new vog(bVar, 3), M), M, 27648, 2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sac(bVar, q630Var, i, 6);
        }
    }

    public static final void d(b78.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1407294259);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1407294259, i2, -1, "com.vk.music.stickyplayer.presentation.components.AudioBookMiddle (VkAppBottomPlayer.kt:379)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 E = ahn.E(aVar4, "title");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c((String) ((zak0) bVar.a).getValue(), defpackage.j0.d(1.0f, E, false), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).j0, M, 100663296, 48, 5880);
            if (((Boolean) ((zak0) bVar.b).getValue()).booleanValue()) {
                M.K(-1325425566);
                z3r0.a(null, M, 0);
            } else {
                M.K(-1337695211);
            }
            M.j();
            M.G();
            aVar2 = M;
            yqv0.c((String) ((zak0) bVar.c).getValue(), ahn.E(aVar4, "artist"), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).C0, aVar2, 100663344, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vi1(bVar, q630Var, i, 8);
        }
    }

    public static final void e(b78 b78Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1599339268);
        int i2 = (M.J(b78Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1599339268, i2, -1, "com.vk.music.stickyplayer.presentation.components.MiddleInfo (VkAppBottomPlayer.kt:142)");
            }
            if (b78Var instanceof b78.g) {
                M.K(1844082793);
                g((b78.g) b78Var, q630Var, M, i2 & 112);
                M.j();
            } else if (b78Var instanceof b78.a) {
                M.K(1844246721);
                b((b78.a) b78Var, q630Var, M, i2 & 112);
                M.j();
            } else if (b78Var instanceof b78.h) {
                M.K(1844412199);
                l((b78.h) b78Var, q630Var, M, i2 & 112);
                M.j();
            } else if (b78Var instanceof b78.b) {
                M.K(1844573957);
                d((b78.b) b78Var, q630Var, M, i2 & 112);
                M.j();
            } else if (b78Var instanceof b78.i) {
                M.K(1844733545);
                n((b78.i) b78Var, q630Var, M, i2 & 112);
                M.j();
            } else {
                if (!(b78Var instanceof b78.f)) {
                    throw alb0.c(-633251056, M);
                }
                M.K(1844887708);
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
            s.d = new p70(b78Var, q630Var, i, 6);
        }
    }

    public static final void f(b78.g gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1913546077);
        if ((i & 6) == 0) {
            i2 = (M.J(gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1913546077, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicButtons (VkAppBottomPlayer.kt:471)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(24, dt1.a.p), bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            Boolean valueOf = Boolean.valueOf(gVar.J());
            kuo kuoVar = luo.d;
            ijk.a(valueOf, null, jq2.d(500, 0, kuoVar, 2), "Add/Remove from my music", kai.c(1469986842, new t26(gVar, 5), M), M, 27648, 2);
            ijk.a(Boolean.valueOf(gVar.isPlaying()), null, jq2.d(500, 0, kuoVar, 2), "Next/Close button", kai.c(317053187, new gd3(gVar, 4), M), M, 27648, 2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ft3(gVar, q630Var, i, 5);
        }
    }

    public static final void g(b78.g gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(699488703);
        if ((i & 6) == 0) {
            i2 = (M.J(gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(699488703, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicMiddle (VkAppBottomPlayer.kt:299)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 E = ahn.E(aVar4, "title");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c((String) ((zak0) gVar.a).getValue(), defpackage.j0.d(1.0f, E, false), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).j0, M, 100663296, 48, 5880);
            if (((Boolean) ((zak0) gVar.b).getValue()).booleanValue()) {
                M.K(1638434902);
                z3r0.a(null, M, 0);
            } else {
                M.K(1628468681);
            }
            M.j();
            M.G();
            aVar2 = M;
            yqv0.c((String) ((zak0) gVar.c).getValue(), ahn.E(aVar4, "artist"), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).C0, aVar2, 100663344, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new j6l(gVar, q630Var, i, 5);
        }
    }

    public static final void h(b78 b78Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1253782870);
        int i2 = (M.J(b78Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1253782870, i2, -1, "com.vk.music.stickyplayer.presentation.components.PlayPauseButton (VkAppBottomPlayer.kt:120)");
            }
            if (b78Var instanceof b78.i) {
                M.K(-1884964614);
                b78.i iVar = (b78.i) b78Var;
                i(0, M, iVar.a(), iVar.isPlaying());
                M.j();
            } else {
                M.K(-1884801926);
                j(0, M, b78Var.a(), b78Var.isPlaying());
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
            s.d = new b47(b78Var, i, 12);
        }
    }

    public static final void i(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        androidx.compose.runtime.a M = aVar.M(941569683);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(941569683, i2, -1, "com.vk.music.stickyplayer.presentation.components.PlayPauseRadioButton (VkAppBottomPlayer.kt:265)");
            }
            ijk.a(Boolean.valueOf(z), null, jq2.d(500, 0, luo.d, 2), "Play/Pause radio button", kai.c(-1024637806, new zy20(izsVar, 1), M), M, (i2 & 14) | 27648, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jb40(i, izsVar, z);
        }
    }

    public static final void j(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-1795343549);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1795343549, i2, -1, "com.vk.music.stickyplayer.presentation.components.PlayPauseTrackButton (VkAppBottomPlayer.kt:231)");
            }
            ijk.a(Boolean.valueOf(z), null, jq2.d(500, 0, luo.d, 2), "Play/Pause button", kai.c(533416258, new psp(izsVar, 2), M), M, (i2 & 14) | 27648, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, izsVar, z) { // from class: xsna.v8u0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ izs c;

                {
                    this.b = z;
                    this.c = izsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x8u0.j(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void k(b78.h hVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1815766909);
        if ((i & 6) == 0) {
            i2 = (M.J(hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1815766909, i2, -1, "com.vk.music.stickyplayer.presentation.components.PodcastButtons (VkAppBottomPlayer.kt:550)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(24, dt1.a.p), bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            ijk.a(Boolean.valueOf(hVar.isPlaying()), null, jq2.d(500, 0, luo.d, 2), "Fast forward/Close button", kai.c(-1946643526, new u8u0(hVar, 0), M), M, 27648, 2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zs0(hVar, q630Var, i, 4);
        }
    }

    public static final void l(b78.h hVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-178640067);
        if ((i & 6) == 0) {
            i2 = (M.J(hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-178640067, i2, -1, "com.vk.music.stickyplayer.presentation.components.PodcastMiddle (VkAppBottomPlayer.kt:339)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 E = ahn.E(aVar4, "title");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c((String) ((zak0) hVar.a).getValue(), defpackage.j0.d(1.0f, E, false), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).j0, M, 100663296, 48, 5880);
            if (((Boolean) ((zak0) hVar.b).getValue()).booleanValue()) {
                M.K(-1453737192);
                z3r0.a(null, M, 0);
            } else {
                M.K(-1464853141);
            }
            M.j();
            M.G();
            aVar2 = M;
            yqv0.c((String) ((zak0) hVar.c).getValue(), ahn.E(aVar4, "artist"), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).C0, aVar2, 100663344, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new edh(hVar, q630Var, i, 4);
        }
    }

    public static final void m(b78.i iVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(651428125);
        if ((i & 6) == 0) {
            i2 = (M.J(iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(651428125, i2, -1, "com.vk.music.stickyplayer.presentation.components.RadioButtons (VkAppBottomPlayer.kt:653)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(24, dt1.a.p), bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            Boolean valueOf = Boolean.valueOf(iVar.J());
            kuo kuoVar = luo.d;
            ijk.a(valueOf, null, jq2.d(500, 0, kuoVar, 2), "Add/Remove from my music", kai.c(207868890, new cs7(iVar, 3), M), M, 27648, 2);
            ijk.a(Boolean.valueOf(iVar.isPlaying()), null, jq2.d(500, 0, kuoVar, 2), "Next/Close button", kai.c(-945064765, new hx9(iVar, 4), M), M, 27648, 2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nv1(iVar, q630Var, i, 10);
        }
    }

    public static final void n(b78.i iVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(509951851);
        if ((i & 6) == 0) {
            i2 = (M.J(iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(509951851, i2, -1, "com.vk.music.stickyplayer.presentation.components.RadioMiddle (VkAppBottomPlayer.kt:435)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 E = ahn.E(aVar4, "title");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            aVar2 = M;
            yqv0.c((String) ((zak0) iVar.a).getValue(), defpackage.j0.d(1.0f, E, false), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).j0, aVar2, 100663296, 48, 5880);
            aVar2.G();
            yqv0.c(d370.N(R.string.music_player_radio_station, 0, aVar2), ahn.E(aVar4, "artist"), wlb0.h(aVar2).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar2).C0, aVar2, 100663344, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new tq8(iVar, q630Var, i, 8);
        }
    }

    public static final void o(b78 b78Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(142190950);
        int i2 = (M.J(b78Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(142190950, i2, -1, "com.vk.music.stickyplayer.presentation.components.RightButtons (VkAppBottomPlayer.kt:187)");
            }
            if (b78Var instanceof b78.g) {
                M.K(1173003942);
                f((b78.g) b78Var, q630Var, M, 48);
                M.j();
            } else if (b78Var instanceof b78.a) {
                M.K(1173168862);
                a((b78.a) b78Var, q630Var, M, 48);
                M.j();
            } else if (b78Var instanceof b78.h) {
                M.K(1173334340);
                k((b78.h) b78Var, q630Var, M, 48);
                M.j();
            } else if (b78Var instanceof b78.b) {
                M.K(1173497090);
                c((b78.b) b78Var, q630Var, M, 48);
                M.j();
            } else if (b78Var instanceof b78.i) {
                M.K(1173657670);
                m((b78.i) b78Var, q630Var, M, 48);
                M.j();
            } else {
                if (!(b78Var instanceof b78.f)) {
                    throw alb0.c(-793446090, M);
                }
                M.K(1173812794);
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
            s.d = new r85(b78Var, q630Var, i, 13);
        }
    }

    public static final void p(b78 b78Var, boolean z, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(363290521);
        if ((i & 6) == 0) {
            i2 = (M.J(b78Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(363290521, i2, -1, "com.vk.music.stickyplayer.presentation.components.VkAppBottomPlayer (VkAppBottomPlayer.kt:53)");
            }
            vtu vtuVar = (vtu) M.r(uvi.l);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = io.reactivex.rxjava3.internal.operators.mixed.j.d(!z, M);
            }
            wh50 wh50Var = (wh50) x;
            Boolean valueOf = Boolean.valueOf(z);
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new w8u0(null, wh50Var, z);
                M.R(x2);
            }
            bap.g(valueOf, (wzs) x2, M, (i2 >> 3) & 14);
            int i3 = i2 & 14;
            boolean y = M.y(vtuVar) | (i3 == 4);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new km1(23, vtuVar, b78Var);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean z3 = i3 == 4;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new qqt0(b78Var, 1);
                M.R(x4);
            }
            uov0.a(ojc.e(239, null, gzsVar, (gzs) x4, q630Var), null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-594411872, new xd0(8, wh50Var, b78Var), M), M, 1572864, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yd0(i, 1, b78Var, q630Var, z);
        }
    }
}
