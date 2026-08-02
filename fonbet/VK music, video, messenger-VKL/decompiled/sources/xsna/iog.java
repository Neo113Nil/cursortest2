package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CommunitiesErrorState.kt */
/* loaded from: classes5.dex */
public final class iog {
    public static final void a(gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(913207514);
        int i2 = i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(913207514, i2, -1, "com.vk.settings.impl.presentation.base.view.CommunitiesErrorState (CommunitiesErrorState.kt:20)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 56;
            aVar2 = M;
            gzsVar2 = gzsVar;
            ldv0.d(q630.a.a, csa0.a(a, 0L, byc0.b(f, f), null, null, M, 200072, 18), zra0.a.a(null, null, d370.N(R.string.manage_communities_error, 0, M), null, M, 196608, 27), wra0.b.a(wra0.a.C3954a.a(d370.N(R.string.manage_communities_error_button, 0, M), gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, aVar2, (i2 & 112) | 28032, 12582912, 131040), null, null, aVar2, 14), null, null, false, aVar2, 6, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vg3(gzsVar2, i, 1);
        }
    }
}
