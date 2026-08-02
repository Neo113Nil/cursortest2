package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;

/* compiled from: APlusModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final class w {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(822218998);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(822218998, i2, -1, "com.vk.profile.core.aplus.APlusContent (APlusModalBottomSheet.kt:194)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vy20 a = qy20.c.a.a(pg90.a(R.drawable.vk_icon_blogger_mark_10k_outline_56, 0, M), ylu0Var.getIcon().a, null, M, 4);
            us2 us2Var = new us2(d370.N(R.string.profile_aplus_modal_title, 0, M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1127096448, 6, -1, "com.vk.profile.core.aplus.aPlusModalDescription (APlusModalBottomSheet.kt:219)");
            }
            String N = d370.N(R.string.profile_aplus_modal_text, 0, M);
            M.K(-723689411);
            M.j();
            us2 us2Var2 = new us2(N);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xy20 b = py20.a.b(us2Var, us2Var2, M, 384);
            ty20 a2 = oy20.b.a(oy20.a.C3478a.a(d370.N(R.string.profile_aplus_modal_button, 0, M), gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, null, M, ((i2 << 3) & 112) | 28032, 8160), null, false, M, 6);
            int i3 = (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            q630.a aVar2 = q630.a.a;
            e5v0.a(gzsVar2, aVar2, a, b, null, a2, false, false, null, M, i3, 464);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v(i, 0, gzsVar, gzsVar2, q630Var2);
        }
    }
}
