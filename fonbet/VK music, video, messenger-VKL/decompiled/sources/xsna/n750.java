package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b78;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MusicStandaloneBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class n750 {
    public static final void a(b78.d dVar, izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1101346330);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1101346330, i2, -1, "com.vk.music.stickyplayer.presentation.components.AddRemoveButton (MusicStandaloneBottomPlayer.kt:506)");
            }
            ijk.a(Boolean.valueOf(dVar.J()), null, jq2.d(500, 0, luo.d, 2), "Play/Pause button", kai.c(-1937070811, new ip7(2, dVar, izsVar), M), M, 27648, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gx(dVar, izsVar, i, 8);
        }
    }

    public static final void b(b78.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(1651121825);
        int i2 = (M.J(q630Var) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1651121825, i2, -1, "com.vk.music.stickyplayer.presentation.components.AdvertisementMiddle (MusicStandaloneBottomPlayer.kt:388)");
            }
            q630 E = ahn.E(q630Var, "standaloneAdsTitle");
            String N = d370.N(R.string.music_player_ad_title, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.J;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3 = M;
            yqv0.c(N, E, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar3, 100663296, 48, 5880);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wbi(aVar, q630Var, i, 6);
        }
    }

    public static final void c(b78.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1644535125);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1644535125, i2, -1, "com.vk.music.stickyplayer.presentation.components.AudioBookMiddle (MusicStandaloneBottomPlayer.kt:339)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 48);
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
            q630 c2 = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            String str = (String) ((zak0) bVar.a).getValue();
            kuo kuoVar = luo.d;
            ijk.a(str, null, jq2.d(500, 0, kuoVar, 2), null, kai.c(-774837523, new qmi(3), M), M, 24576, 10);
            if (((Boolean) ((zak0) bVar.b).getValue()).booleanValue()) {
                M.K(340300352);
                z3r0.a(null, M, 0);
            } else {
                M.K(326591315);
            }
            M.j();
            M.G();
            ijk.a((String) ((zak0) bVar.c).getValue(), null, jq2.d(500, 0, kuoVar, 2), null, lii.c, M, 24576, 10);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g06(bVar, q630Var, i, 8);
        }
    }

    public static final void d(Object obj, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-295951078);
        int i2 = (M.J(obj) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-295951078, i2, -1, "com.vk.music.stickyplayer.presentation.components.BottomMusicTrackImage (MusicStandaloneBottomPlayer.kt:654)");
            }
            float f = a9p0.a;
            String f2 = z3r0.f((Thumb) obj, f, M, 48);
            if (f2.length() == 0) {
                M.K(889529127);
                nsa0.a(a9p0.b, 48, M, txj0.q(q630Var, f));
                M.j();
            } else {
                M.K(889757814);
                fwu0.c(txj0.q(q630Var, f), null, f2, null, null, null, null, lii.d, M, 100663296, 250);
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
            s.d = new yb1(obj, q630Var, i, 7);
        }
    }

    public static final void e(final b78 b78Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(725145044);
        int i4 = (M.J(b78Var) ? 4 : 2) | i | 48;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(725145044, i4, -1, "com.vk.music.stickyplayer.presentation.components.BottomPlayerContent (MusicStandaloneBottomPlayer.kt:130)");
            }
            final long j = wlb0.h(M).getIcon().l;
            final long j2 = wlb0.h(M).getIcon().a;
            int i5 = i4 & 14;
            boolean p = M.p(j) | M.p(j2) | (i5 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (p || x == c0012a) {
                i2 = i5;
                izs izsVar = new izs() { // from class: xsna.l750
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float f = 2;
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - oioVar.I0(f);
                        oio.P(oioVar, j, (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - oioVar.I0(f);
                        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
                        float progress = b78Var.getProgress() * Float.intBitsToFloat((int) (oioVar.d() >> 32));
                        float I0 = oioVar.I0(f);
                        oio.P(oioVar, j2, floatToRawIntBits, (Float.floatToRawIntBits(progress) << 32) | (Float.floatToRawIntBits(I0) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x = izsVar;
            } else {
                i2 = i5;
            }
            q630.a aVar3 = q630.a.a;
            q630 h = txj0.h(s200.H(bu00.c(aVar3, (izs) x), 6, 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 4), 56);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            j(b78Var, M, i2);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f, true));
            if (b78Var instanceof b78.g) {
                M.K(815713754);
                k((b78.g) b78Var, F, M, 0);
                M.j();
            } else if (b78Var instanceof b78.a) {
                M.K(815716482);
                b((b78.a) b78Var, F, M, 0);
                M.j();
            } else if (b78Var instanceof b78.h) {
                M.K(815719260);
                n((b78.h) b78Var, F, M, 0);
                M.j();
            } else if (b78Var instanceof b78.b) {
                M.K(815721918);
                c((b78.b) b78Var, F, M, 0);
                M.j();
            } else if (b78Var instanceof b78.i) {
                M.K(815724506);
                o((b78.i) b78Var, F, M, 0);
                M.j();
            } else {
                if (!(b78Var instanceof b78.f)) {
                    throw alb0.c(815712407, M);
                }
                M.K(815727029);
                p(F, M, 0);
                M.j();
            }
            float f = 8;
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), dt1.a.k, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean z = (b78Var instanceof b78.c) && ((b78.c) b78Var).b();
            if (b78Var instanceof b78.d) {
                M.K(-444369698);
                if (z) {
                    M.K(-444336466);
                    i((b78.d) b78Var, b78Var.a(), M, 0);
                    M.j();
                } else {
                    M.K(-444179854);
                    a((b78.d) b78Var, b78Var.a(), M, 0);
                    M.j();
                }
                M.j();
            } else {
                if (b78Var instanceof b78.e) {
                    M.K(-443966605);
                    f(0, M);
                } else {
                    M.K(-451611546);
                }
                M.j();
            }
            if (b78Var instanceof b78.f) {
                aVar2 = M;
                q630Var2 = aVar3;
                aVar2.K(-442989299);
                h(0, aVar2);
                g(0, aVar2);
                aVar2.j();
            } else {
                M.K(-443836002);
                m(0, M, b78Var.a(), b78Var.isPlaying());
                if (z) {
                    aVar2 = M;
                    q630Var2 = aVar3;
                    aVar2.K(-451611546);
                } else {
                    M.K(-443650963);
                    q630 E = ahn.E(aVar3, "moreButtonInSmallPlayer");
                    long b = byc0.b(24, 36);
                    if (androidx.compose.runtime.b.d()) {
                        i3 = 0;
                        androidx.compose.runtime.b.f(864001564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
                    } else {
                        i3 = 0;
                    }
                    lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_24, i3, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.music_talkback_more, i3, M);
                    long j3 = wlb0.h(M).getIcon().j;
                    boolean z2 = i2 == 4;
                    Object x2 = M.x();
                    if (z2 || x2 == c0012a) {
                        x2 = new gd40(b78Var, 3);
                        M.R(x2);
                    }
                    q630Var2 = aVar3;
                    nzu0.b((gzs) x2, a3, b, N, E, j3, false, null, false, null, null, M, 25024, 0, 1984);
                    aVar2 = M;
                }
                aVar2.j();
                aVar2.j();
            }
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new o21(b78Var, q630Var2, i, 6);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2631629);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2631629, i, -1, "com.vk.music.stickyplayer.presentation.components.InactiveAddButton (MusicStandaloneBottomPlayer.kt:595)");
            }
            q630 a = o19.a(ahn.E(q630.a.a, "addToMyMusicBtn"), 0.64f);
            float f = 36;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
            }
            lg90 b = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().j;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new nh0(27);
                M.R(x);
            }
            nzu0.c((gzs) x, b, null, a, f, j, false, null, false, null, null, M, 100691398, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lq2(i, 7);
        }
    }

    public static final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-317687149);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-317687149, i, -1, "com.vk.music.stickyplayer.presentation.components.InactiveMoreButton (MusicStandaloneBottomPlayer.kt:625)");
            }
            q630 a = o19.a(q630.a.a, 0.64f);
            long b = byc0.b(24, 36);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(864001564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().j;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new t61(29);
                M.R(x);
            }
            nzu0.b((gzs) x, a2, b, null, a, j, false, null, false, null, null, M, 100691398, 0, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r1d(i, 5);
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1360956622);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1360956622, i, -1, "com.vk.music.stickyplayer.presentation.components.InactivePlayButton (MusicStandaloneBottomPlayer.kt:610)");
            }
            q630 a = o19.a(ahn.E(q630.a.a, "playBtn"), 0.64f);
            float f = 36;
            qzu0.a.getClass();
            lg90 d1 = qzu0.d1(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().j;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new o6(21);
                M.R(x);
            }
            nzu0.c((gzs) x, d1, null, a, f, j, false, null, false, null, null, M, 100691398, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nq2(i);
        }
    }

    public static final void i(b78.d dVar, izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-910126471);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-910126471, i2, -1, "com.vk.music.stickyplayer.presentation.components.KidsAddRemoveButton (MusicStandaloneBottomPlayer.kt:552)");
            }
            ijk.a(Boolean.valueOf(dVar.J()), null, jq2.d(500, 0, luo.d, 2), "Play/Pause button", kai.c(-100485576, new eoi(izsVar, 2), M), M, 27648, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x2(dVar, izsVar, i, 6);
        }
    }

    public static final void j(b78 b78Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(244810345);
        if ((i & 6) == 0) {
            i2 = (M.J(b78Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(244810345, i2, -1, "com.vk.music.stickyplayer.presentation.components.MiniPlayerImage (MusicStandaloneBottomPlayer.kt:215)");
            }
            if (b78Var instanceof b78.f) {
                M.K(291312145);
                q(0, M);
                M.j();
            } else {
                M.K(290652434);
                ijk.a(b78Var.getImage(), null, jq2.d(500, 0, luo.d, 2), null, kai.c(-1816994399, new uwq(b78Var, 1), M), M, 24576, 10);
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
            s.d = new d3x(b78Var, i, 1);
        }
    }

    public static final void k(b78.g gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1429103391);
        int i2 = (M.J(gVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1429103391, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicMiddle (MusicStandaloneBottomPlayer.kt:241)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 48);
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
            q630 c2 = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            String str = (String) ((zak0) gVar.a).getValue();
            kuo kuoVar = luo.d;
            ijk.a(str, null, jq2.d(500, 0, kuoVar, 2), null, kai.c(1345323641, new zii(4), M), M, 24576, 10);
            if (((Boolean) ((zak0) gVar.b).getValue()).booleanValue()) {
                M.K(-318628556);
                z3r0.a(null, M, 0);
            } else {
                M.K(-329175097);
            }
            M.j();
            M.G();
            ijk.a((String) ((zak0) gVar.c).getValue(), null, jq2.d(500, 0, kuoVar, 2), null, lii.a, M, 24576, 10);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h08(gVar, q630Var, i, 6);
        }
    }

    public static final void l(b78 b78Var, boolean z, boolean z2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z3;
        androidx.compose.runtime.a aVar2;
        b78 b78Var2 = b78Var;
        androidx.compose.runtime.a M = aVar.M(-1403903563);
        if ((i & 6) == 0) {
            i2 = (M.J(b78Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= M.l(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1403903563, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicStandaloneBottomPlayer (MusicStandaloneBottomPlayer.kt:70)");
            }
            vtu vtuVar = (vtu) M.r(uvi.l);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x);
            }
            kg50 kg50Var = (kg50) x;
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 12;
            q630 h = z3r0.h(s200.H(s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bw40.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 7), 16, l5g.c(14, l5g.b, 0.15f), vog0.b(f), 0L, 24);
            int i3 = i2 & 14;
            boolean y = (i3 == 4) | M.y(vtuVar);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new ww(16, b78Var2, vtuVar);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean z4 = i3 == 4;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new wzh(b78Var2, 29);
                M.R(x3);
            }
            q630 e = ojc.e(239, null, gzsVar, (gzs) x3, h);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new i750(kg50Var, 0);
                M.R(x4);
            }
            gho b = fho.b((izs) x4, M, 6);
            Orientation orientation = Orientation.Horizontal;
            boolean z5 = ((i2 & 896) == 256) | (i3 == 4) | ((i2 & 112) == 32);
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                m750 m750Var = new m750(z3, b78Var2, z, kg50Var, null);
                b78Var2 = b78Var2;
                M.R(m750Var);
                x5 = m750Var;
            }
            q630 E = ahn.E(fho.a(e, b, orientation, false, null, false, (yzs) x5, false, 188), "dragSmallPlayer");
            uog0 b2 = vog0.b(f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            shu0.a(E, b2, ylu0Var.getBackground().x, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1137718092, new jb5(b78Var2, 10), M), aVar2, 1572864, 56);
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
            s.d = new k750(b78Var2, z, z2, q630Var, i);
        }
    }

    public static final void m(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        androidx.compose.runtime.a M = aVar.M(1219899912);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1219899912, i2, -1, "com.vk.music.stickyplayer.presentation.components.PlayPauseButton (MusicStandaloneBottomPlayer.kt:470)");
            }
            ijk.a(Boolean.valueOf(z), null, jq2.d(500, 0, luo.d, 2), "Play/Pause button", kai.c(818678633, new kzi(izsVar, 1), M), M, (i2 & 14) | 27648, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new obd(i, izsVar, z);
        }
    }

    public static final void n(b78.h hVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(49883359);
        int i2 = (M.J(hVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(49883359, i2, -1, "com.vk.music.stickyplayer.presentation.components.PodcastMiddle (MusicStandaloneBottomPlayer.kt:290)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 48);
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
            q630 c2 = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            String str = (String) ((zak0) hVar.a).getValue();
            kuo kuoVar = luo.d;
            ijk.a(str, null, jq2.d(500, 0, kuoVar, 2), null, kai.c(1627062903, new pmi(2), M), M, 24576, 10);
            if (((Boolean) ((zak0) hVar.b).getValue()).booleanValue()) {
                M.K(-1951644298);
                z3r0.a(null, M, 0);
            } else {
                M.K(-1963770103);
            }
            M.j();
            M.G();
            ijk.a((String) ((zak0) hVar.c).getValue(), null, jq2.d(500, 0, kuoVar, 2), null, lii.b, M, 24576, 10);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps7(hVar, q630Var, i, 6);
        }
    }

    public static final void o(b78.i iVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(961764237);
        int i2 = (M.J(iVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(961764237, i2, -1, "com.vk.music.stickyplayer.presentation.components.RadioMiddle (MusicStandaloneBottomPlayer.kt:435)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 48);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ijk.a((String) ((zak0) iVar.a).getValue(), null, jq2.d(500, 0, luo.d, 2), null, kai.c(511689025, new odi(5), M), M, 24576, 10);
            String N = d370.N(R.string.music_player_radio_station, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, null, ylu0Var.getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, 100663296, 48, 5882);
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
            s.d = new cx(iVar, q630Var, i, 12);
        }
    }

    public static final void p(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1433470436);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1433470436, i2, -1, "com.vk.music.stickyplayer.presentation.components.ShimmerMiddle (MusicStandaloneBottomPlayer.kt:402)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
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
            q630.a aVar3 = q630.a.a;
            q630 a2 = wdj0.a(txj0.f(txj0.h(aVar3, 20), 1.0f), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 4;
            ja8.a(hr80.m(a2, ylu0Var.c().b, vog0.b(f)), M, 0);
            q630 a3 = wdj0.a(txj0.f(txj0.h(aVar3, 14), 1.0f), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (dt.c(hr80.m(a3, ylu0Var2.c().b, vog0.b(f)), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h750(q630Var, i, 0);
        }
    }

    public static final void q(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-695013003);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-695013003, i, -1, "com.vk.music.stickyplayer.presentation.components.ShimmerMusicTrackImage (MusicStandaloneBottomPlayer.kt:638)");
            }
            q630 a = wdj0.a(txj0.q(q630.a.a, 44), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(a, ylu0Var.c().b, vog0.b(6)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yx5(i, 10);
        }
    }
}
