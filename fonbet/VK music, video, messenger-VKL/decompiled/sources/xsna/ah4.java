package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AudioBookFreeLine.kt */
/* loaded from: classes3.dex */
public final class ah4 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var, boolean z) {
        lg90 F0;
        androidx.compose.runtime.a M = aVar.M(1976386423);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1976386423, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookFreeLine (AudioBookFreeLine.kt:27)");
            }
            float f = 20;
            q630 c = ojc.c(txj0.h(q630Var, f), false, null, null, gzsVar, 15);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630.a aVar3 = q630.a.a;
            q630 q = txj0.q(aVar3, f);
            if (z) {
                M.K(-1293538496);
                qzu0.a.getClass();
                F0 = qzu0.X(M);
            } else {
                M.K(-1293537632);
                qzu0.a.getClass();
                F0 = qzu0.F0(M);
            }
            M.j();
            uqv.b(F0, null, q, wlb0.h(M).getIcon().c, M, 440, 0);
            yqv0.c(d370.N(z ? R.string.music_audio_book_free_in_this_month : R.string.music_audio_book_available_with_subscribe, 0, M), ahn.E(s200.H(aVar3, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "freeAtThisMonthLabel"), wlb0.h(M).getText().d, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).P, M, 48, 0, 8120);
            M = M;
            q630 q2 = txj0.q(aVar3, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_chevron_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uqv.b(a2, null, q2, wlb0.h(M).getIcon().c, M, 440, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zg4(i, gzsVar, q630Var, z);
        }
    }
}
