package xsna;

/* compiled from: ClipsPlaylistsErrorView.kt */
/* loaded from: classes16.dex */
public final class bse {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        gzs gzsVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1013360978);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1013360978, i2, -1, "com.vk.clips.playlists.common.ui.ClipsPlaylistsErrorView (ClipsPlaylistsErrorView.kt:10)");
            }
            gzsVar2 = gzsVar;
            q630Var2 = q630Var;
            ldv0.b(q630Var2, false, null, gzsVar2, M, ((i2 >> 3) & 14) | ((i2 << 9) & 7168), 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y61(gzsVar2, q630Var2, i, 3);
        }
    }
}
