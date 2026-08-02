package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: MusicPlaylistCell.kt */
/* loaded from: classes4.dex */
public final class uf40 implements Cell$Left.Main {
    public final wh50 a = androidx.compose.runtime.k.b(null);
    public final wh50 b;

    public uf40(xzj xzjVar) {
        this.b = androidx.compose.runtime.k.b(xzjVar);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-979989333);
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
                androidx.compose.runtime.b.f(-979989333, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicCover.Content (MusicPlaylistCell.kt:116)");
            }
            float f = 6;
            nz40.b((xzj) ((zak0) this.b).getValue(), s200.H(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.a).getValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bw9(this, spg0Var, q630Var, i, 2);
        }
    }
}
