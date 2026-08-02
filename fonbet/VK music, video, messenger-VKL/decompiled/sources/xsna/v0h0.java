package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;

/* compiled from: SaveAsPlaylistButton.kt */
/* loaded from: classes3.dex */
public final class v0h0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final gzs gzsVar, final q630 q630Var, final boolean z, final boolean z2) {
        androidx.compose.runtime.a aVar2;
        lg90 B0;
        androidx.compose.runtime.a M = aVar.M(-362325116);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-362325116, i2, -1, "com.vk.music.stickyplayer.presentation.components.SaveAsPlaylistButton (SaveAsPlaylistButton.kt:21)");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            String N = d370.N(R.string.music_player_queue_save_playlist, 0, M);
            if (z) {
                M.K(-774035271);
                M.j();
                B0 = null;
            } else {
                M.K(-302062956);
                qzu0.a.getClass();
                B0 = qzu0.B0(M);
                M.j();
            }
            boolean z3 = (i2 & 896) == 256;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new vhk(1, gzsVar);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, F, null, z, false, B0, null, null, N, null, null, null, null, z2, null, null, null, aVar2, ((i2 << 21) & 29360128) | 1073745328, (i2 << 18) & 29360128, 0, 4058464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, gzsVar, q630Var, z, z2) { // from class: xsna.u0h0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;

                {
                    this.b = z;
                    this.c = z2;
                    this.d = gzsVar;
                    this.e = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v0h0.a(ne7.I(3073), (androidx.compose.runtime.a) obj, this.d, this.e, this.b, this.c);
                    return s3q0.a;
                }
            };
        }
    }
}
