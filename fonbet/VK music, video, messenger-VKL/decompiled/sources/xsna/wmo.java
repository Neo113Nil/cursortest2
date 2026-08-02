package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import xsna.dt1;
import xsna.q630;

/* compiled from: DropdownMenu.kt */
/* loaded from: classes16.dex */
public final class wmo {
    public static final void a(gzs gzsVar, s930 s930Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(716416747);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.J(s930Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(716416747, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.PlaylistsDropdownMenu (DropdownMenu.kt:25)");
            }
            boolean z = s930Var.a;
            IntrinsicSize intrinsicSize = IntrinsicSize.Max;
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(m200.G(aVar2, intrinsicSize), "PlaylistPopupContainer");
            dt1.a.getClass();
            aou0.f(z, gzsVar, E, dt1.a.d, (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(58) & 4294967295L), null, null, kai.c(1156096353, new umo(s930Var, izsVar), M), M, ((i2 << 3) & 112) | 100690944, 224);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vmo(gzsVar, s930Var, izsVar, q630Var2, i, 0);
        }
    }
}
