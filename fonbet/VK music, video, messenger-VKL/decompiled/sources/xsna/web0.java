package xsna;

import com.vkontakte.android.R;
import xsna.us2;

/* compiled from: PlaylistUnsubscribeBottomSheet.kt */
/* loaded from: classes6.dex */
public final class web0 {
    public static final void a(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(831298642);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(831298642, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistUnsubscribeBottomSheet (PlaylistUnsubscribeBottomSheet.kt:22)");
            }
            M.K(14082657);
            us2.b bVar = new us2.b();
            M.K(14083612);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int m = bVar.m(new hik0(ylu0Var.getText().k, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                bVar.g(d370.N(R.string.friends_catalog_unsubscribe, 0, M));
                s3q0 s3q0Var = s3q0.a;
                bVar.k(m);
                M.j();
                us2 n = bVar.n();
                M.j();
                b5v0.a(gzsVar, null, null, null, kai.c(-1558858481, new wo7(n, gzsVar2, gzsVar, 4), M), null, false, false, null, M, (i2 & 14) | 12807168, 326);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                bVar.k(m);
                throw th;
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new onb(gzsVar, gzsVar2, i, 4);
        }
    }
}
