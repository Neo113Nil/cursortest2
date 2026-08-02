package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import xsna.q630;

/* compiled from: VkAppInformerContainer.kt */
/* loaded from: classes3.dex */
public final class fau0 {
    public static final void a(izs izsVar, MusicPlayerInformerViewState.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(1298611833);
        int i2 = 2;
        int i3 = i | (M.y(izsVar) ? 4 : 2) | (M.J(aVar) ? 32 : 16) | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1298611833, i3, -1, "com.vk.music.informer.MusicPlayerInformerContent (VkAppInformerContainer.kt:92)");
            }
            ButtonSize buttonSize = ButtonSize.Small;
            pww pwwVar = new pww();
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.h0;
            float f2 = 0;
            u890 u890Var = new u890(f2, f2, f2, f2);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.ui.p(23, izsVar, aVar);
                M.R(x);
            }
            aVar3 = M;
            bhu0.f((gzs) x, f, false, null, null, null, frv0Var, null, null, pwwVar, u890Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(437884354, new jzi(i2, aVar, pwwVar), M), aVar3, 0, 1572870, 63932);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new uff(i, 3, izsVar, aVar, q630Var2);
        }
    }

    public static final void b(izs izsVar, MusicPlayerInformerViewState.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(1329793207);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1329793207, i2, -1, "com.vk.music.informer.VkAppInformerContainer (VkAppInformerContainer.kt:46)");
            }
            long j = l5g.b;
            float f = 12;
            q630 h = z3r0.h(z3r0.h(q630Var, 8, l5g.c(14, j, 0.12f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 0L, 24), 16, l5g.c(14, j, 0.16f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(h, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), ylu0Var.getBackground().r, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1492809135, new ys0(7, izsVar, aVar), M), M, 1572864, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yoj(izsVar, aVar, q630Var, i, 3);
        }
    }
}
