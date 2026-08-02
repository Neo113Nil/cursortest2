package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.tile.TileContentType;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import xsna.iev;
import xsna.q630;

/* compiled from: MusicPlaylistLargeSlider.kt */
/* loaded from: classes3.dex */
public final class x050 {
    public static final float a = 168;
    public static final float b = 156;

    public static final void a(UIBlockMusicPlaylist uIBlockMusicPlaylist, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        String d;
        azo0 azo0Var;
        androidx.compose.runtime.a M = aVar.M(1936896135);
        int i2 = (M.J(uIBlockMusicPlaylist) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1936896135, i2, -1, "com.vk.music.playlist.framework.presentation.catalog.MusicPlaylistLargeSlider (MusicPlaylistLargeSlider.kt:48)");
            }
            epi epiVar = (epi) M.r(fpi.a);
            Playlist playlist = uIBlockMusicPlaylist.z;
            TileContentType tileContentType = TileContentType.Other;
            Thumb thumb = playlist.m;
            float f = b;
            if (thumb == null) {
                M.K(-812373833);
                M.j();
                d = null;
            } else {
                M.K(1636362378);
                d = skd.d(thumb, f, M);
                M.j();
            }
            pja0 a2 = HorizontalListItem$VisualContent.c.a(new h8b0(d), M, 0, 6);
            long b2 = byc0.b(f, f);
            String str = playlist.h;
            if (str == null) {
                str = "";
            }
            if (playlist.k) {
                M.K(-812093530);
                qzu0.a.getClass();
                lg90 S = qzu0.S(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                azo0Var = new azo0(S, new l5g(ylu0Var.getIcon().l));
                M.j();
            } else {
                M.K(-811974025);
                M.j();
                azo0Var = null;
            }
            fsv0 a3 = iev.b.a(str, null, null, null, azo0Var, null, c9b0.g((Context) M.r(AndroidCompositionLocals_androidKt.b), playlist), null, null, playlist.Eb() ? String.valueOf(playlist.l) : null, null, null, M, 0, 3502);
            float f2 = a;
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(txj0.v(aVar3, f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7);
            buw buwVar = (buw) M.r(cuw.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            boolean J = M.J(epiVar) | M.y(uIBlockMusicPlaylist);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new com.vk.movika.sdk.base.flow.binding.g(15, epiVar, uIBlockMusicPlaylist);
                M.R(x2);
            }
            q630Var2 = aVar3;
            asv0.d(tileContentType, a2, b2, a3, ahn.E(ojc.b(H, sg50Var, buwVar, false, null, (gzs) x2, 28), "musicSliderItem"), false, false, null, null, null, M, 390, 992);
            aVar2 = M;
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
            s.d = new z85(uIBlockMusicPlaylist, q630Var2, i, 7);
        }
    }
}
