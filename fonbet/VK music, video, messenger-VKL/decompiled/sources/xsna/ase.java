package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: ClipsPlaylistsErrorView.kt */
/* loaded from: classes16.dex */
public final class ase {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2056325365);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2056325365, i3, -1, "com.vk.clips.playlists.folders.list.ui.ClipsPlaylistsErrorView (ClipsPlaylistsErrorView.kt:13)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "PlaylistsErrorView");
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new src(izsVar, 1);
                M.R(x);
            }
            ldv0.b(E, false, null, (gzs) x, M, 0, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zre(izsVar, q630Var, i, 0);
        }
    }
}
