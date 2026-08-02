package xsna;

import androidx.compose.runtime.a;
import xsna.kve;

/* compiled from: ClipsPlaylistsSmallFoldersView.kt */
/* loaded from: classes16.dex */
public final class jve extends ame<kve, nue> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((kve) ao50Var, izsVar, aVar, 512);
    }

    public final void g(kve kveVar, izs<? super nue, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-131924810);
        int i2 = (M.J(kveVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-131924810, i2, -1, "com.vk.clips.playlists.folders.gridlist.ClipsPlaylistsSmallFoldersView.ThemedContent (ClipsPlaylistsSmallFoldersView.kt:34)");
            }
            wh50 d = d(kve.a.c.a, new n0u0[]{kveVar.c, kveVar.a, kveVar.b}, M, (i2 & 896) | 518);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = bbk0.b(new so7(d, 1));
                M.R(x);
            }
            mm2.f(((Boolean) ((mtk0) x).getValue()).booleanValue(), null, null, anp.j(null, 15).b(anp.f(null, 3)), null, kai.c(-1789726498, new ive(0, d, izsVar), M), M, 199680, 22);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ez7(this, kveVar, izsVar, i, 2);
        }
    }
}
