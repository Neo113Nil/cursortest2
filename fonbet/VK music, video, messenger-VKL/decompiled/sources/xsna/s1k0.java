package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: SlidingCards.kt */
/* loaded from: classes7.dex */
public final class s1k0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(386135843);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(386135843, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCards (SlidingCards.kt:22)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new hp30(list, 21);
                M.R(x);
            }
            yjl b = rc90.b(0, (gzs) x, M, 0, 3);
            q630 f = txj0.f(q630Var, 1.0f);
            boolean J = (i3 == 4) | M.J(b) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new hf80(list, b, izsVar);
                M.R(x2);
            }
            q630 c = ojc.c(f, false, null, null, (gzs) x2, 15);
            uog0 b2 = vog0.b(kqu0.f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(c, b2, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-38794965, new ud6(12, b, list), M), M, 1572864, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xs0(i, 4, list, izsVar, q630Var);
        }
    }
}
