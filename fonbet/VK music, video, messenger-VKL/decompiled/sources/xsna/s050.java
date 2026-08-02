package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bi40;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MusicPlaylistHeaderButtonsWithMix.kt */
/* loaded from: classes3.dex */
public final class s050 {

    /* compiled from: MusicPlaylistHeaderButtonsWithMix.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicTrackPlayState.values().length];
            try {
                iArr[MusicTrackPlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicTrackPlayState.REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(l050 l050Var, gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 b;
        androidx.compose.runtime.a M = aVar.M(176481373);
        if ((i & 6) == 0) {
            i2 = (M.J(tpg0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l050Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(176481373, i2, -1, "com.vk.music.playlist.display.presentation.AddWithDownload (MusicPlaylistHeaderButtonsWithMix.kt:155)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "addPlaylistButton");
            if (l050Var.k) {
                M.K(2094886922);
                qzu0.a.getClass();
                b = qzu0.y0(M);
            } else {
                M.K(2094887874);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                }
                b = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            lg90 lg90Var = b;
            boolean z = l050Var.e;
            boolean z2 = l050Var.l;
            String N = d370.N((z && z2) ? R.string.music_talkback_remove_kids_playlist : z ? R.string.music_talkback_remove_playlist : z2 ? R.string.music_talkback_playlist_add_to_my_collection : R.string.music_talkback_playlist_add_to_my_music, 0, M);
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            i(i3 | 3136 | (57344 & i4), M, N, gzsVar2, E, lg90Var);
            if (l050Var.h) {
                M.K(517157070);
                c(l050Var.i, l050Var.j, gzsVar, ahn.E(aVar2, k(l050Var.i)), M, i3 | (i4 & 7168));
                M = M;
            } else {
                M.K(510773829);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new de1(i, 2, l050Var, gzsVar, gzsVar2);
        }
    }

    public static final void b(l050 l050Var, gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 H;
        androidx.compose.runtime.a M = aVar.M(-2016817101);
        if ((i & 6) == 0) {
            i2 = (M.J(tpg0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l050Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2016817101, i2, -1, "com.vk.music.playlist.display.presentation.DeleteWithDownload (MusicPlaylistHeaderButtonsWithMix.kt:179)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "removePlaylistButton");
            if (l050Var.k) {
                M.K(-1130971367);
                qzu0.a.getClass();
                H = qzu0.x0(M);
            } else {
                M.K(-1130970720);
                qzu0.a.getClass();
                H = qzu0.H(M);
            }
            M.j();
            lg90 lg90Var = H;
            boolean z = l050Var.e;
            boolean z2 = l050Var.l;
            String N = d370.N((z && z2) ? R.string.music_talkback_remove_kids_playlist : z ? R.string.music_talkback_remove_playlist : z2 ? R.string.music_talkback_playlist_add_to_my_collection : R.string.music_talkback_playlist_add_to_my_music, 0, M);
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            i(i3 | 3136 | (57344 & i4), M, N, gzsVar2, E, lg90Var);
            if (l050Var.h) {
                M.K(-700203848);
                c(l050Var.i, l050Var.j, gzsVar, ahn.E(aVar2, k(l050Var.i)), M, i3 | (i4 & 7168));
                M = M;
            } else {
                M.K(-707407473);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c6v(i, 2, l050Var, gzsVar, gzsVar2);
        }
    }

    public static final void c(final bi40 bi40Var, final boolean z, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1623142286);
        if ((i & 48) == 0) {
            i2 = (M.J(bi40Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9361) != 9360)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1623142286, i2, -1, "com.vk.music.playlist.display.presentation.DownloadingStateButton (MusicPlaylistHeaderButtonsWithMix.kt:322)");
            }
            aVar2 = M;
            bhu0.c(gzsVar, ButtonSize.Medium, ButtonStyle.Primary, ButtonAppearance.Overlay, q630Var, null, null, false, null, null, null, false, kai.c(-1521036461, new yzs() { // from class: xsna.q050
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    izs izsVar;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1521036461, intValue, -1, "com.vk.music.playlist.display.presentation.DownloadingStateButton.<anonymous> (MusicPlaylistHeaderButtonsWithMix.kt:330)");
                        }
                        q630 q = txj0.q(q630.a.a, 24);
                        qzu0.a.getClass();
                        lg90 L = qzu0.L(aVar3);
                        lg90 J = qzu0.J(aVar3);
                        boolean z2 = z;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (z2) {
                            aVar3.K(-1291863981);
                            Object x = aVar3.x();
                            if (x == c0012a) {
                                x = new sux(6);
                                aVar3.R(x);
                            }
                            izsVar = (izs) x;
                            aVar3.j();
                        } else {
                            aVar3.K(-1291290233);
                            Object x2 = aVar3.x();
                            if (x2 == c0012a) {
                                x2 = new y510(5);
                                aVar3.R(x2);
                            }
                            izsVar = (izs) x2;
                            aVar3.j();
                        }
                        ki40.a(bi40Var, J, r050.b, izsVar, q, L, false, aVar3, 286784, 64);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i2 >> 9) & 14) | X2.b.f | (i2 & 57344), 384, 4064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new i26(i, 1, bi40Var, gzsVar, q630Var, z);
        }
    }

    public static final void d(l050 l050Var, gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-619339310);
        if ((i & 6) == 0) {
            i2 = (M.J(tpg0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l050Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-619339310, i2, -1, "com.vk.music.playlist.display.presentation.EditWithDownload (MusicPlaylistHeaderButtonsWithMix.kt:203)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "editPlaylistButton");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-672921252, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-EditOutline28> (VkSdkIcons.kt:772)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_edit_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            i(i3 | 3136 | (57344 & i4), M, d370.N(R.string.music_talkback_playlist_edit, 0, M), gzsVar2, E, a2);
            if (l050Var.h) {
                M.K(442614137);
                c(l050Var.i, l050Var.j, gzsVar, ahn.E(aVar2, k(l050Var.i)), M, i3 | (i4 & 7168));
                M = M;
            } else {
                M.K(434643696);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l54(i, 2, l050Var, gzsVar, gzsVar2);
        }
    }

    public static final void e(l050 l050Var, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1278995829);
        if ((i & 48) == 0) {
            i2 = (M.J(l050Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1278995829, i2, -1, "com.vk.music.playlist.display.presentation.MixButton (MusicPlaylistHeaderButtonsWithMix.kt:364)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            boolean z = (i2 & 7168) == 2048;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new ig1(20, gzsVar, rg50Var);
                M.R(x2);
            }
            aVar2 = M;
            bhu0.c((gzs) x2, ButtonSize.Medium, ButtonStyle.Primary, ButtonAppearance.Overlay, null, null, null, false, null, null, null, false, kai.c(-311801008, new cfi(q630Var, l050Var, rg50Var, 1), M), aVar2, X2.b.f, 384, 4080);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ec2(i, 3, l050Var, q630Var, gzsVar);
        }
    }

    public static final void f(l050 l050Var, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 d1;
        int i3;
        int i4;
        cp8 a2;
        androidx.compose.runtime.a M = aVar.M(-1726049659);
        if ((i & 48) == 0) {
            i2 = (M.J(l050Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1726049659, i2, -1, "com.vk.music.playlist.display.presentation.PlayPauseButton (MusicPlaylistHeaderButtonsWithMix.kt:247)");
            }
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            MusicTrackPlayState musicTrackPlayState = l050Var.a;
            int[] iArr = a.$EnumSwitchMapping$0;
            q630 E = ahn.E(q630Var, iArr[musicTrackPlayState.ordinal()] == 1 ? "listenPlaylistButtonPauseIcon" : "listenPlaylistButtonPlayIcon");
            if (iArr[musicTrackPlayState.ordinal()] == 2) {
                M.K(-876323946);
                a2 = cp8.c.a.a(new l5g(j(M)), new pco(24), new pco(2), M, 25008, 8);
                M.j();
            } else {
                M.K(-876317553);
                if (iArr[musicTrackPlayState.ordinal()] == 1) {
                    M.K(-876314772);
                    qzu0.a.getClass();
                    d1 = qzu0.V0(M);
                    M.j();
                } else {
                    M.K(-876313365);
                    qzu0.a.getClass();
                    d1 = qzu0.d1(M);
                    M.j();
                }
                if (iArr[musicTrackPlayState.ordinal()] == 1) {
                    i3 = -876308194;
                    i4 = R.string.music_talkback_pause;
                } else {
                    i3 = -876304675;
                    i4 = R.string.music_talkback_play;
                }
                String a3 = zq.a(M, i3, i4, M, 0);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new hb40(l050Var, 3);
                    M.R(x);
                }
                a2 = cp8.b.a.a(d1, null, null, a3, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196616, 6);
                M.j();
            }
            bhu0.d(gzsVar, buttonStyle, buttonAppearance, E, buttonSize, null, a2, null, false, null, M, ((i2 >> 9) & 14) | 25008, 4000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rz5(i, 1, l050Var, q630Var, gzsVar);
        }
    }

    public static final void g(final l050 l050Var, final boolean z, final q630 q630Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final gzs gzsVar4, final gzs gzsVar5, final gzs gzsVar6, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(630996305);
        if ((i & 6) == 0) {
            i2 = (M.J(l050Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(gzsVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(gzsVar5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.y(gzsVar6) ? 67108864 : 33554432;
        }
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(630996305, i2, -1, "com.vk.music.playlist.display.presentation.PlaylistHeaderButtonsWithMix (MusicPlaylistHeaderButtonsWithMix.kt:93)");
            }
            q630 r = p490.r(q630Var, p490.x(M), 14);
            float f = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, r);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            if (z) {
                M.K(75189869);
                M.j();
            } else {
                M.K(79570169);
                mq.d(aVar3, f, M, 6);
            }
            if (l050Var.c) {
                M.K(79663355);
                int i4 = ((i2 << 3) & 112) | 390;
                i3 = 390;
                f(l050Var, ahn.E(aVar3, "listenPlaylistButton"), gzsVar, M, (i2 & 7168) | i4);
                h(l050Var, ahn.E(aVar3, "shufflePlaylistButton"), gzsVar2, M, ((i2 >> 3) & 7168) | i4);
            } else {
                i3 = 390;
                M.K(75189869);
            }
            M.j();
            if (l050Var.d) {
                M.K(1526606512);
                d(l050Var, gzsVar5, gzsVar4, M, ((i2 << 3) & 112) | 6 | ((i2 >> 15) & 896) | ((i2 >> 9) & 7168));
                M.j();
            } else if (l050Var.e) {
                M.K(1526612476);
                b(l050Var, gzsVar5, gzsVar3, M, ((i2 << 3) & 112) | 6 | ((i2 >> 15) & 896) | ((i2 >> 6) & 7168));
                M.j();
            } else {
                if (l050Var.f || l050Var.g) {
                    M.K(1526619513);
                    a(l050Var, gzsVar5, gzsVar3, M, ((i2 << 3) & 112) | 6 | ((i2 >> 15) & 896) | ((i2 >> 6) & 7168));
                } else {
                    M.K(75189869);
                }
                M.j();
            }
            if (l050Var.m) {
                M.K(80770706);
                e(l050Var, ahn.E(aVar3, "mixPlaylistButton"), gzsVar6, M, i3 | ((i2 << 3) & 112) | ((i2 >> 15) & 7168));
            } else {
                M.K(75189869);
            }
            M.j();
            f9t.e(txj0.v(aVar3, f), M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o050
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s050.g(l050.this, z, q630Var, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, gzsVar6, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(l050 l050Var, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        l5g l5gVar;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-33804722);
        if ((i & 48) == 0) {
            i2 = (M.J(l050Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-33804722, i2, -1, "com.vk.music.playlist.display.presentation.ShuffleButton (MusicPlaylistHeaderButtonsWithMix.kt:293)");
            }
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            int i5 = i2;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            qzu0.a.getClass();
            lg90 n1 = qzu0.n1(M);
            if (l050Var.b) {
                M.K(-2053620195);
                long a2 = s7g.a(R.color.vk_azure_300, M);
                M.j();
                l5gVar = new l5g(a2);
            } else {
                M.K(-2053529520);
                M.j();
                l5gVar = null;
            }
            if (l050Var.b) {
                i3 = -2053437295;
                i4 = R.string.music_talkback_shuffle_disable;
            } else {
                i3 = -2053333166;
                i4 = R.string.music_talkback_shuffle_enable;
            }
            bhu0.d(gzsVar, buttonStyle, buttonAppearance, q630Var, buttonSize, null, cp8.b.a.a(n1, l5gVar, null, zq.a(M, i3, i4, M, 0), null, M, 196616, 20), null, false, null, M, ((i5 >> 9) & 14) | 25008 | ((i5 << 3) & 7168), 4000);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new owl(l050Var, q630Var, gzsVar, i);
        }
    }

    public static final void i(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var, lg90 lg90Var) {
        int i2;
        String str2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(409264751);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= M.J(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9361) != 9360)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(409264751, i2, -1, "com.vk.music.playlist.display.presentation.SimpleButton (MusicPlaylistHeaderButtonsWithMix.kt:228)");
            }
            bhu0.d(gzsVar, ButtonStyle.Primary, ButtonAppearance.Overlay, q630Var2, ButtonSize.Medium, null, cp8.b.a.a(lg90Var, null, null, str2, null, M, ((i2 >> 3) & 14) | 196616 | ((i2 << 3) & 7168), 22), null, false, null, M, ((i2 >> 12) & 14) | 25008 | (i2 & 7168), 4000);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p050(gzsVar, str, q630Var, lg90Var, i);
        }
    }

    public static final long j(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(523591071, 0, -1, "com.vk.music.playlist.display.presentation.getButtonContentColor (MusicPlaylistHeaderButtonsWithMix.kt:400)");
        }
        long a2 = s7g.a(R.color.vk_gray_800, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }

    public static final String k(bi40 bi40Var) {
        if (epx.f(bi40Var, bi40.c.a)) {
            return "downloadPlaylistButton";
        }
        if ((bi40Var instanceof bi40.b) || epx.f(bi40Var, bi40.d.a)) {
            return "downloadingButton";
        }
        if (epx.f(bi40Var, bi40.a.a)) {
            return "removeFromDownloadedButton";
        }
        throw new NoWhenBranchMatchedException();
    }
}
