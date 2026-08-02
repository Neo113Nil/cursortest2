package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: ClipsCoauthorsResetDialog.kt */
/* loaded from: classes17.dex */
public final class rmd {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1499035899);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1499035899, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.dialog.ClipCoauthorsResetDialog (ClipsCoauthorsResetDialog.kt:13)");
            }
            String N = d370.N(R.string.clips_edit_with_coauthors_confirmation_title, 0, M);
            String N2 = d370.N(R.string.clips_edit_with_coauthors_confirmation_subtitle, 0, M);
            String N3 = d370.N(R.string.clips_edit_with_coauthors_confirmation_save, 0, M);
            String N4 = d370.N(R.string.clips_edit_with_coauthors_confirmation_cancel, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ay0(gzsVar2, 24);
                M.R(x);
            }
            q630Var2 = q630.a.a;
            p7u0.e(N, N2, N3, (izs) x, gzsVar, q630Var2, N4, null, null, null, null, null, gzsVar2, M, ((i2 << 12) & 57344) | 196608, (i2 << 3) & 896, 3968);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fn7(i, 3, gzsVar, gzsVar2, q630Var2);
        }
    }
}
