package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.playlist.display.domain.AlbumType;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.kbb0;
import xsna.lbb0;
import xsna.q630;

/* compiled from: PlaylistInfoSubtitle.kt */
/* loaded from: classes3.dex */
public final class kab0 {
    public static final void a(kbb0 kbb0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(604174925);
        int i7 = i | (M.J(kbb0Var) ? 4 : 2);
        if (M.t(i7 & 1, (i7 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(604174925, i7, -1, "com.vk.music.playlist.display.presentation.PlaylistInfoSubtitle (PlaylistInfoSubtitle.kt:33)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            boolean z = kbb0Var instanceof kbb0.a;
            kbb0.a aVar3 = z ? (kbb0.a) kbb0Var : null;
            boolean z2 = aVar3 != null && aVar3.g;
            boolean z3 = kbb0Var instanceof kbb0.b;
            q630.a aVar4 = q630.a.a;
            if (!z3 || ((kbb0.b) kbb0Var).a() <= 0) {
                i2 = -1;
                i3 = 0;
                i4 = 48;
                if (z2) {
                    M.K(-1869385992);
                    q630 H = s200.H(txj0.q(aVar4, 20), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1390320684, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LogoVkMusic24> (VkIcons.kt:7024)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_logo_vk_music_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vqv.a(a2, null, H, l5g.d, M, 3512, 0);
                } else {
                    M.K(-1871393583);
                }
                M.j();
            } else {
                M.K(-1869686599);
                q630 H2 = s200.H(txj0.q(aVar4, 16), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(724064226, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Headphones16> (VkIcons.kt:3282)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_headphones_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i4 = 48;
                i3 = 0;
                i2 = -1;
                vqv.a(a3, null, H2, l5g.d, M, 3512, 0);
                M.j();
            }
            if (z2) {
                str = zq.a(M, -1869059810, R.string.music_album_exclusive, M, i3);
            } else {
                M.K(-1868971181);
                int i8 = (i7 & 14) | 48;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1007692290, i8, i2, "com.vk.music.playlist.framework.presentation.PlaylistMetadataFormatter.formatPlaylistInfoSubtitle (PlaylistMetadataFormatter.kt:16)");
                }
                if (kbb0Var instanceof kbb0.f) {
                    M.K(-2024643717);
                    kbb0.f fVar = (kbb0.f) kbb0Var;
                    int i9 = fVar.a;
                    str = lbb0.d(i9 > 0 ? xpm0.a(i9) : "", lbb0.c(i4, fVar.b, M), M, 384);
                    M.j();
                } else if (kbb0Var instanceof kbb0.c) {
                    M.K(-2024636101);
                    kbb0.c cVar = (kbb0.c) kbb0Var;
                    int i10 = cVar.a;
                    str = lbb0.d(i10 > 0 ? xpm0.a(i10) : "", lbb0.c(48, cVar.b, M), M, 384);
                    M.j();
                } else if (kbb0Var instanceof kbb0.g) {
                    M.K(-2024628282);
                    M.j();
                    str = ((kbb0.g) kbb0Var).b;
                } else if (z) {
                    M.K(-2024626669);
                    kbb0.a aVar5 = (kbb0.a) kbb0Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-404190397, 48, i2, "com.vk.music.playlist.framework.presentation.PlaylistMetadataFormatter.formatAlbum (PlaylistMetadataFormatter.kt:114)");
                    }
                    AlbumType albumType = aVar5.c;
                    int i11 = aVar5.d;
                    int i12 = lbb0.a.$EnumSwitchMapping$0[albumType.ordinal()];
                    if (i12 == 1) {
                        i5 = -1879909397;
                        i6 = R.string.album_type_full;
                    } else if (i12 == 2) {
                        i5 = -1879907059;
                        i6 = R.string.album_type_single;
                    } else if (i12 == 3) {
                        i5 = -1879904791;
                        i6 = R.string.album_type_ep;
                    } else {
                        if (i12 != 4) {
                            throw alb0.c(-1879910955, M);
                        }
                        i5 = -1879902378;
                        i6 = R.string.album_type_collection;
                    }
                    String a4 = zq.a(M, i5, i6, M, i3);
                    if (i11 > 0) {
                        M.K(1852673611);
                        a4 = d370.O(R.string.music_dot_delimiter, new Object[]{a4, String.valueOf(i11)}, M);
                        M.j();
                    } else {
                        M.K(1852792062);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    str = a4;
                } else {
                    if (!kbb0Var.equals(kbb0.d.a)) {
                        throw alb0.c(-2024645218, M);
                    }
                    M.K(1661141632);
                    M.j();
                    str = "";
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, i3, i2, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, null, l5g.c(14, l5g.d, 0.82f), null, null, 0, 3, null, 2, false, 0, 1, null, wuv0Var.P, M, 100663680, 48, 5818);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qg(kbb0Var, q630Var, i, 6);
        }
    }
}
