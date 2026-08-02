package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonsStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.pbx0;
import xsna.q630;

/* compiled from: PlaylistButtons.kt */
/* loaded from: classes6.dex */
public final class u7b0 {
    public static final void a(boolean z, PlaylistButtonsStyle playlistButtonsStyle, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(883827247);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(playlistButtonsStyle.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(883827247, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.AddVideosButton (PlaylistButtons.kt:149)");
            }
            String N = d370.N(R.string.video_playlist_add_video, 0, M);
            PlaylistButtonsStyle playlistButtonsStyle2 = PlaylistButtonsStyle.Lego;
            q630.a aVar2 = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (playlistButtonsStyle == playlistButtonsStyle2) {
                M.K(1948282206);
                q630 a = qri.a(aVar2, a5x.a, new cci(5));
                qzu0.a.getClass();
                lg90 d = qzu0.d(M);
                z2 = (i2 & 7168) == 2048;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new iyl(izsVar, 3);
                    M.R(x);
                }
                m7b0.a(d, a, (gzs) x, null, N, playlistButtonsStyle, M, 8 | ((i2 << 9) & 458752), 8);
                M.j();
            } else {
                M.K(1948569204);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                qzu0.a.getClass();
                lg90 d2 = qzu0.d(M);
                q630 H = s200.H(tpg0Var.b(1.0f, txj0.f(aVar2, 1.0f), true), z ? 4 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                z2 = (i2 & 7168) == 2048;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new nxu(izsVar, 2);
                    M.R(x2);
                }
                bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, d2, null, null, N, null, null, null, null, false, null, null, null, M, 1073745328, 0, 0, 4189664);
                M = M;
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
            s.d = new t7b0(z, playlistButtonsStyle, izsVar, i, 0);
        }
    }

    public static final void b(boolean z, boolean z2, PlaylistButtonsStyle playlistButtonsStyle, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 b;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1888751434);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(playlistButtonsStyle.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1888751434, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.NewSubscribeButton (PlaylistButtons.kt:205)");
            }
            if (z) {
                M.K(572798951);
                qzu0.a.getClass();
                b = qzu0.H(M);
                M.j();
            } else {
                M.K(572841762);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1496029726, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AddSquareOutline24> (VkIcons.kt:172)");
                }
                b = or.b(M, 654240958, R.drawable.vk_icon_add_square_outline_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            q630.a aVar2 = q630.a.a;
            int i4 = R.string.video_catalog_subscribe;
            Object obj = a.C0011a.a;
            if (z2) {
                M.K(572969110);
                q630 a = qri.a(aVar2, a5x.a, new cci(5));
                String a2 = z ? zq.a(M, 573200308, R.string.video_catalog_subscribed, M, 0) : zq.a(M, 573293525, R.string.video_catalog_subscribe, M, 0);
                z3 = (i2 & 57344) == 16384;
                Object x = M.x();
                if (z3 || x == obj) {
                    x = new nse(izsVar, 9);
                    M.R(x);
                }
                m7b0.a(b, a, (gzs) x, null, a2, playlistButtonsStyle, M, 8 | ((i2 << 6) & 458752), 8);
                M.j();
            } else {
                M.K(573446758);
                if (z) {
                    i4 = R.string.video_catalog_subscribed;
                }
                String N = d370.N(i4, 0, M);
                q630 b2 = tpg0Var.b(1.0f, txj0.f(aVar2, 1.0f), true);
                boolean J = M.J(N);
                Object x2 = M.x();
                if (J || x2 == obj) {
                    x2 = new det(N, 2);
                    M.R(x2);
                }
                q630 b3 = egi0.b(b2, false, (izs) x2);
                z3 = (i2 & 57344) == 16384;
                Object x3 = M.x();
                if (z3 || x3 == obj) {
                    x3 = new ddn(izsVar, 5);
                    M.R(x3);
                }
                m7b0.a(b, b3, (gzs) x3, N, null, playlistButtonsStyle, M, 8 | ((i2 << 6) & 458752), 16);
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
            s.d = new k750(z, z2, playlistButtonsStyle, izsVar, i);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        ButtonStyle buttonStyle;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1824632191);
        int i5 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i5 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1824632191, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.OldSubscribeButton (PlaylistButtons.kt:250)");
            }
            if (z) {
                buttonStyle = ButtonStyle.Secondary;
                i3 = R.drawable.vk_icon_check_square_outline_24;
                i4 = R.string.video_catalog_subscribed;
            } else {
                buttonStyle = ButtonStyle.Primary;
                i3 = R.drawable.vk_icon_add_square_outline_24;
                i4 = R.string.video_catalog_subscribe;
            }
            String N = d370.N(i4, 0, M);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            lg90 a = pg90.a(i3, 0, M);
            q630 b = tpg0Var.b(1.0f, txj0.f(q630.a.a, 1.0f), true);
            boolean J = M.J(N);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new kf5(N, 8);
                M.R(x);
            }
            q630 b2 = egi0.b(b, false, (izs) x);
            boolean z2 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new mnc(izsVar, 4);
                M.R(x2);
            }
            aVar2 = M;
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, b2, null, false, false, a, null, null, N, null, null, null, null, false, null, null, null, aVar2, 1073744944, 0, 0, 4189664);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xn1(i, izsVar, z);
        }
    }

    public static final void d(final w7b0 w7b0Var, final izs<? super hcb0, s3q0> izsVar, q630 q630Var, PlaylistButtonsStyle playlistButtonsStyle, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        final PlaylistButtonsStyle playlistButtonsStyle2;
        final q630 q630Var3;
        int i4;
        PlaylistButtonsStyle playlistButtonsStyle3;
        int i5;
        q630 q630Var4;
        a.C0011a.C0012a c0012a;
        q630.a aVar2;
        int i6;
        PlaylistButtonsStyle playlistButtonsStyle4;
        int i7;
        androidx.compose.runtime.a M = aVar.M(2098870709);
        int i8 = (M.J(w7b0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 = i8 | 384;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i8 | (M.J(q630Var2) ? 256 : 128);
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= M.o(playlistButtonsStyle == null ? -1 : playlistButtonsStyle.ordinal()) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            q630.a aVar3 = q630.a.a;
            q630 q630Var5 = i9 != 0 ? aVar3 : q630Var2;
            PlaylistButtonsStyle playlistButtonsStyle5 = i10 != 0 ? PlaylistButtonsStyle.Milkshake : playlistButtonsStyle;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2098870709, i3, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtons (PlaylistButtons.kt:40)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var5);
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
            Object obj = w7b0Var.a;
            boolean z = w7b0Var.d;
            if (playlistButtonsStyle5 == PlaylistButtonsStyle.Milkshake && (obj instanceof pbx0.c) && z) {
                obj = pbx0.b.a;
            }
            boolean f = epx.f(obj, pbx0.b.a);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (f) {
                M.K(-1948485283);
                PlaylistButtonsStyle playlistButtonsStyle6 = playlistButtonsStyle5;
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                qzu0.a.getClass();
                lg90 d1 = qzu0.d1(M);
                q630 a2 = qri.a(aVar3, a5x.a, new cci(5));
                boolean z2 = (i3 & 112) == 32;
                Object x = M.x();
                if (z2 || x == c0012a2) {
                    x = new th2(izsVar, 7);
                    M.R(x);
                }
                playlistButtonsStyle3 = playlistButtonsStyle6;
                i4 = i3;
                i5 = 6;
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, a2, null, false, false, d1, null, null, null, null, null, null, null, false, null, null, null, M, 1073745328, 0, 0, 4193760);
                M = M;
                M.j();
                aVar2 = aVar3;
                i6 = 1;
                q630Var4 = q630Var5;
                c0012a = c0012a2;
            } else {
                i4 = i3;
                playlistButtonsStyle3 = playlistButtonsStyle5;
                i5 = 6;
                if (obj instanceof pbx0.c) {
                    M.K(-1948032776);
                    String str = ((pbx0.c) obj).a;
                    String str2 = drm0.N(str) ? null : str;
                    if (str2 == null) {
                        str2 = zq.a(M, 1045541832, R.string.video_catalog_watch_all, M, 0);
                    } else {
                        M.K(1045539693);
                        M.j();
                    }
                    String str3 = str2;
                    ButtonSize buttonSize2 = ButtonSize.Medium;
                    ButtonStyle buttonStyle2 = ButtonStyle.Primary;
                    ButtonAppearance h = playlistButtonsStyle3.h();
                    qzu0.a.getClass();
                    lg90 d12 = qzu0.d1(M);
                    q630Var4 = q630Var5;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    float f2 = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    }
                    xpy xpyVar = new xpy(f2, true);
                    boolean z3 = (i4 & 112) == 32;
                    Object x2 = M.x();
                    if (z3 || x2 == c0012a2) {
                        x2 = new yt7(izsVar, 8);
                        M.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    c0012a = c0012a2;
                    aVar2 = aVar3;
                    i6 = 1;
                    bhu0.e(gzsVar, buttonSize2, buttonStyle2, h, xpyVar, null, false, false, d12, null, null, str3, null, null, null, null, false, null, null, null, M, 1073742256, 0, 0, 4189664);
                    M = M;
                    M.j();
                } else {
                    q630Var4 = q630Var5;
                    c0012a = c0012a2;
                    aVar2 = aVar3;
                    i6 = 1;
                    if (!epx.f(obj, pbx0.a.a)) {
                        throw alb0.c(1045522953, M);
                    }
                    M.K(1045558965);
                    M.j();
                }
            }
            if (w7b0Var.b) {
                M.K(-1947352977);
                q630 a3 = qri.a(aVar2, a5x.a, new cci(5));
                if (androidx.compose.runtime.b.d()) {
                    i7 = 0;
                    androidx.compose.runtime.b.f(-1409355882, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Shuffle24> (VkSdkIcons.kt:3360)");
                } else {
                    i7 = 0;
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_shuffle_24, i7, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.video_catalog_accessibility_watch_shuffled_order, i7, M);
                if ((i4 & 112) == 32) {
                    i7 = i6;
                }
                Object x3 = M.x();
                if (i7 != 0 || x3 == c0012a) {
                    x3 = new gc0(izsVar, 9);
                    M.R(x3);
                }
                playlistButtonsStyle4 = playlistButtonsStyle3;
                m7b0.a(a4, a3, (gzs) x3, null, N, playlistButtonsStyle4, M, 8 | ((i4 << 6) & 458752), 8);
            } else {
                playlistButtonsStyle4 = playlistButtonsStyle3;
                M.K(-1950726831);
            }
            M.j();
            f(w7b0Var, playlistButtonsStyle4, izsVar, M, i5 | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | ((i4 << 6) & 7168));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            playlistButtonsStyle2 = playlistButtonsStyle4;
            q630Var3 = q630Var4;
        } else {
            M.h();
            playlistButtonsStyle2 = playlistButtonsStyle;
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.r7b0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    u7b0.d(w7b0.this, izsVar, q630Var3, playlistButtonsStyle2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(boolean z, boolean z2, PlaylistButtonsStyle playlistButtonsStyle, final boolean z3, izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        PlaylistButtonsStyle playlistButtonsStyle2;
        izs izsVar2;
        final boolean z4;
        final boolean z5;
        androidx.compose.runtime.a M = aVar.M(1710461214);
        if ((i & 6) == 0) {
            i2 = (M.J(tpg0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(playlistButtonsStyle.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1710461214, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.SubscribeButton (PlaylistButtons.kt:183)");
            }
            if (z3) {
                M.K(858296325);
                playlistButtonsStyle2 = playlistButtonsStyle;
                izsVar2 = izsVar;
                b(z, z2, playlistButtonsStyle2, izsVar2, M, (i2 & 8190) | ((i2 >> 3) & 57344));
                z5 = z;
                z4 = z2;
                M.j();
            } else {
                playlistButtonsStyle2 = playlistButtonsStyle;
                izsVar2 = izsVar;
                z4 = z2;
                z5 = z;
                M.K(858489517);
                c((i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 9) & 896), M, izsVar2, z5);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            playlistButtonsStyle2 = playlistButtonsStyle;
            izsVar2 = izsVar;
            z4 = z2;
            z5 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final PlaylistButtonsStyle playlistButtonsStyle3 = playlistButtonsStyle2;
            final izs izsVar3 = izsVar2;
            s.d = new wzs() { // from class: xsna.o7b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u7b0.e(z5, z4, playlistButtonsStyle3, z3, izsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(w7b0 w7b0Var, PlaylistButtonsStyle playlistButtonsStyle, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        PlaylistButtonsStyle playlistButtonsStyle2;
        izs izsVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1947869067);
        if ((i & 6) == 0) {
            i2 = (M.J(tpg0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(w7b0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(playlistButtonsStyle.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1947869067, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.TrailingPlaylistButton (PlaylistButtons.kt:123)");
            }
            boolean z = w7b0Var.d;
            pbx0 pbx0Var = w7b0Var.a;
            if (z) {
                M.K(335966977);
                a(!(pbx0Var instanceof pbx0.a), playlistButtonsStyle, izsVar, M, i2 & 8078);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new d9c(i, 2, w7b0Var, playlistButtonsStyle, izsVar, false);
                    return;
                }
                return;
            }
            izsVar2 = izsVar;
            i3 = i;
            M.K(331366701);
            M.j();
            if (w7b0Var.c) {
                M.K(336170244);
                playlistButtonsStyle2 = playlistButtonsStyle;
                e(w7b0Var.e, !(pbx0Var instanceof pbx0.a), playlistButtonsStyle2, w7b0Var.g, izsVar2, M, (i2 & 14) | ((i2 << 3) & 7168) | ((i2 << 6) & 458752));
            } else {
                playlistButtonsStyle2 = playlistButtonsStyle;
                M.K(331366701);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            playlistButtonsStyle2 = playlistButtonsStyle;
            izsVar2 = izsVar;
            i3 = i;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new uq7(w7b0Var, playlistButtonsStyle2, izsVar2, i3, 2);
        }
    }
}
