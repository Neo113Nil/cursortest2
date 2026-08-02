package xsna;

import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.zzc;

/* compiled from: PlaylistImage.kt */
/* loaded from: classes16.dex */
public final class gab0 implements Cell$Left.Main {
    public final wh50 a;

    public gab0(zzc.a aVar) {
        this.a = androidx.compose.runtime.k.b(aVar);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1646467604);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1646467604, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.playlist_cell.PlaylistImage.Content (PlaylistImage.kt:34)");
            }
            hab0.a((zzc.a) ((zak0) this.a).getValue(), q630Var, M, i2 & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fqi(i, 3, this, spg0Var, q630Var);
        }
    }
}
