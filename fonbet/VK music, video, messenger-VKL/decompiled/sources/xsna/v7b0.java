package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PlaylistButtons.kt */
/* loaded from: classes16.dex */
public final class v7b0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z, final boolean z2) {
        int i2;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1233589239);
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
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1233589239, i2, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.ui.NewSubscribeButton (PlaylistButtons.kt:131)");
            }
            int i4 = z ? R.drawable.vk_icon_done_outline_24 : R.drawable.vk_icon_add_square_outline_24;
            q630.a aVar2 = q630.a.a;
            int i5 = R.string.video_catalog_subscribe;
            Object obj = a.C0011a.a;
            if (z2) {
                M.K(-2116438477);
                q630 a = qri.a(aVar2, a5x.a, new bei(4));
                String a2 = z ? zq.a(M, -2116194879, R.string.video_catalog_subscribed, M, 0) : zq.a(M, -2116101662, R.string.video_catalog_subscribe, M, 0);
                z3 = (i2 & 7168) == 2048;
                Object x = M.x();
                if (z3 || x == obj) {
                    x = new cr0(izsVar, 7);
                    M.R(x);
                }
                c0k.a(i4, a, (gzs) x, null, a2, M, 0, 8);
                M.j();
            } else {
                M.K(-2115977166);
                if (z) {
                    i5 = R.string.video_catalog_subscribed;
                }
                String N = d370.N(i5, 0, M);
                q630 b = tpg0Var.b(1.0f, txj0.f(aVar2, 1.0f), true);
                boolean J = M.J(N);
                Object x2 = M.x();
                if (J || x2 == obj) {
                    x2 = new zl1(N, 5);
                    M.R(x2);
                }
                q630 b2 = egi0.b(b, false, (izs) x2);
                z3 = (i2 & 7168) == 2048;
                Object x3 = M.x();
                if (z3 || x3 == obj) {
                    x3 = new mse(izsVar, 8);
                    M.R(x3);
                }
                c0k.a(i4, b2, (gzs) x3, N, null, M, 0, 16);
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
            s.d = new wzs() { // from class: xsna.p7b0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    v7b0.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj2, izsVar, z, z2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        ButtonStyle buttonStyle;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(126126828);
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
                androidx.compose.runtime.b.f(126126828, i2, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.ui.OldSubscribeButton (PlaylistButtons.kt:173)");
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
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            lg90 a = pg90.a(i3, 0, M);
            q630 b = tpg0Var.b(1.0f, txj0.f(q630.a.a, 1.0f), true);
            boolean J = M.J(N);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new egk(N, 1);
                M.R(x);
            }
            q630 b2 = egi0.b(b, false, (izs) x);
            boolean z2 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new s3(izsVar, 3);
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
            s.d = new q7b0(i, izsVar, z);
        }
    }

    public static final void c(q4t0 q4t0Var, boolean z, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        int i3;
        q630.a aVar2;
        int i4;
        a.C0011a.C0012a c0012a;
        float f;
        int i5;
        ButtonStyle buttonStyle;
        q630 q630Var2;
        boolean z3 = q4t0Var.g;
        androidx.compose.runtime.a M = aVar.M(1675035520);
        if ((i & 6) == 0) {
            i2 = (M.J(q4t0Var) ? 4 : 2) | i;
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
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1675035520, i2, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.ui.PlaylistButtons (PlaylistButtons.kt:39)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
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
            q630.a aVar4 = q630.a.a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z3) {
                f = Float.MAX_VALUE;
                M.K(423641359);
                String str = q4t0Var.e;
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle2 = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                lg90 a2 = pg90.a(R.drawable.vk_icon_play_24, 0, M);
                String str2 = q4t0Var.e;
                if (str2 == null || str2.length() == 0) {
                    buttonStyle = buttonStyle2;
                    q630Var2 = aVar4;
                } else {
                    q630 f2 = txj0.f(aVar4, 1.0f);
                    buttonStyle = buttonStyle2;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630Var2 = f2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                }
                boolean z4 = (i2 & 14) == 4;
                Object x = M.x();
                if (z4 || x == c0012a2) {
                    x = new n7b0(q4t0Var, 0);
                    M.R(x);
                }
                q630 b = egi0.b(q630Var2, false, (izs) x);
                int i6 = i2 & 7168;
                boolean z5 = i6 == 2048;
                Object x2 = M.x();
                if (z5 || x2 == c0012a2) {
                    x2 = new zn1(izsVar, 10);
                    M.R(x2);
                }
                z2 = z3;
                aVar2 = aVar4;
                i4 = 0;
                i3 = i2;
                c0012a = c0012a2;
                i5 = 6;
                bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, b, null, false, false, a2, null, null, str, null, null, null, null, false, null, null, null, M, 1073745328, 0, 0, 4189664);
                M = M;
                if (q4t0Var.j) {
                    M.K(424537662);
                    q630 a3 = qri.a(aVar2, a5x.a, new bei(4));
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new p7x(16);
                        M.R(x3);
                    }
                    q630 b2 = egi0.b(a3, false, (izs) x3);
                    String N = d370.N(R.string.video_catalog_accessibility_watch_shuffled_order, 0, M);
                    boolean z6 = i6 == 2048;
                    Object x4 = M.x();
                    if (z6 || x4 == c0012a) {
                        x4 = new tzo(izsVar, 7);
                        M.R(x4);
                    }
                    c0k.a(R.drawable.vk_icon_shuffle_24, b2, (gzs) x4, null, N, M, 0, 8);
                    M.j();
                } else {
                    M.K(421652926);
                    M.j();
                }
            } else {
                z2 = z3;
                i3 = i2;
                aVar2 = aVar4;
                i4 = 0;
                c0012a = c0012a2;
                f = Float.MAX_VALUE;
                i5 = 6;
                M.K(421652926);
            }
            M.j();
            if (q4t0Var.i) {
                M.K(425159770);
                String N2 = d370.N(R.string.video_playlist_add_video, i4, M);
                ButtonSize buttonSize2 = ButtonSize.Medium;
                ButtonStyle buttonStyle3 = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance2 = ButtonAppearance.Neutral;
                lg90 a4 = pg90.a(R.drawable.vk_icon_add_outline_24, i4, M);
                q630 f3 = txj0.f(aVar2, 1.0f);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 E = ahn.E(s200.H(f3.g(new xpy(1.0f > f ? f : 1.0f, true)), z2 ? 4 : i4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "add_video_to_playlist_button");
                int i7 = (i3 & 7168) == 2048 ? 1 : i4;
                Object x5 = M.x();
                if (i7 != 0 || x5 == c0012a) {
                    x5 = new a97(izsVar, 9);
                    M.R(x5);
                }
                androidx.compose.runtime.a aVar5 = M;
                bhu0.e((gzs) x5, buttonSize2, buttonStyle3, buttonAppearance2, E, null, false, false, a4, null, null, N2, null, null, null, null, false, null, null, null, aVar5, 1073745328, 0, 0, 4189664);
                M = aVar5;
                M.j();
            } else {
                int i8 = i3;
                if (q4t0Var.h) {
                    M.K(425880985);
                    d(q4t0Var.f, q4t0Var.g, z, izsVar, M, i5 | ((i8 << 6) & 7168) | ((i8 << 3) & 57344));
                } else {
                    M.K(421652926);
                }
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mxs(q4t0Var, z, q630Var, izsVar, i);
        }
    }

    public static final void d(final boolean z, final boolean z2, final boolean z3, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1727156025);
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
            i2 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1727156025, i2, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.ui.SubscribeButton (PlaylistButtons.kt:111)");
            }
            if (z3) {
                M.K(-2826138);
                a((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i2 >> 3) & 7168), M, izsVar, z, z2);
                M.j();
            } else {
                M.K(-2659885);
                b((i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 6) & 896), M, izsVar, z);
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
            s.d = new wzs() { // from class: xsna.s7b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v7b0.d(z, z2, z3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
