package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.qy40;

/* compiled from: PlayerSnackbarHost.kt */
/* loaded from: classes3.dex */
public final class d4b0 {
    public static final void a(dlv0 dlv0Var, qy40 qy40Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        String str;
        androidx.compose.runtime.a M = aVar.M(-1704013401);
        if ((i & 6) == 0) {
            i2 = i | (M.J(dlv0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(qy40Var) ? 32 : 16) | 384 | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1704013401, i3, -1, "com.vk.music.stickyplayer.presentation.components.PlayerSnackbarHost (PlayerSnackbarHost.kt:22)");
            }
            akg0 akg0Var = null;
            if (qy40Var instanceof qy40.a) {
                M.K(-1174327883);
                str = d370.N(((qy40.a) qy40Var).a, 0, M);
                M.j();
            } else {
                M.K(-2044363818);
                M.j();
                str = null;
            }
            wl20 m = wlb0.m(str, null, null, M, 6);
            if (qy40Var instanceof qy40.a.l) {
                M.K(-1174318399);
                String N = d370.N(R.string.music_player_snack_bar_playlist_button_open, 0, M);
                boolean z = (i3 & 7168) == 2048;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new src(izsVar, 3);
                    M.R(x);
                }
                akg0Var = xx1.q(0, 16380, M, null, N, (gzs) x);
                M.j();
            } else {
                M.K(-2043905514);
                M.j();
            }
            akg0 akg0Var2 = akg0Var;
            q630Var2 = q630.a.a;
            zkv0.c(dlv0Var, m, ahn.E(q630Var2, "musicPlayerSnackbar").g(q630Var2), null, akg0Var2, null, M, i3 & 14, 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n48(i, 3, dlv0Var, qy40Var, q630Var2, izsVar);
        }
    }
}
