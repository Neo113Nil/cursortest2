package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ise;

/* compiled from: ClipPlaylistFolderItem.kt */
/* loaded from: classes16.dex */
public final class p9d {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(335371828);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(335371828, i2, -1, "com.vk.clips.playlists.folders.list.ui.CreatePlaylistItem (ClipPlaylistFolderItem.kt:49)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(959305926, 0, -1, "com.vk.clips.playlists.folders.list.ui.rememberCreateFolderCover (CoverContent.kt:118)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new t7k();
                M.R(x);
            }
            t7k t7kVar = (t7k) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wiu0.b(ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1, xa4.J(q630Var, true, gzsVar)), "CreatePlaylistItem"), false, com.vk.core.compose.component.cell.content.g.a(t7kVar, Cell$Left.Main.Size.Medium, null, PictureRadius.Large, null, M, 12607536, 108), Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.clips_playlist_create, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30), null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
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
            s.d = new o9d(gzsVar, q630Var, i, 0);
        }
    }

    public static final void b(ise iseVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1380656677);
        int i2 = (M.J(iseVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1380656677, i2, -1, "com.vk.clips.playlists.folders.list.ui.PlaylistFolderItem (ClipPlaylistFolderItem.kt:24)");
            }
            if (iseVar instanceof ise.a) {
                M.K(-1758476788);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new oe1(izsVar, 2);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean z2 = (i2 & 14) == 4;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new r9(iseVar, 18);
                    M.R(x2);
                }
                a(0, M, gzsVar, rdu.a(q630Var, (izs) x2));
                M.j();
            } else {
                if (!(iseVar instanceof ise.b)) {
                    throw alb0.c(-333821553, M);
                }
                M.K(-1758130115);
                q1k.a((ise.b) iseVar, izsVar, q630Var, M, i2 & 1008);
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
            s.d = new n9d(i, 0, iseVar, izsVar, q630Var);
        }
    }
}
