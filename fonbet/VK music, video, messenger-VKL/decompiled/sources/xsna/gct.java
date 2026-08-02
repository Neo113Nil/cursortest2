package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.ty6;

/* compiled from: GamesCatalogLoadingErrorContent.kt */
/* loaded from: classes17.dex */
public final class gct {
    public static final float a = 12;

    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String str;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1872802980);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1872802980, i4, -1, "com.vk.games.presentation.components.GamesCatalogLoadingErrorContent (GamesCatalogLoadingErrorContent.kt:26)");
            }
            boolean e = vbh0.e(M);
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.o;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(a, dt1.a.l), aVar3, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (e) {
                M.K(539626118);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2050180644, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorTriangleOutline56> (VkSdkIcons.kt:826)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_error_triangle_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i3 = 1040687336;
                pzu0.b(a3, null, null, ylu0Var.getIcon().l, M, 56, 4);
            } else {
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i3 = 1040687336;
                M.K(538338068);
            }
            M.j();
            String N = d370.N(R.string.vk_games_error_title, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(i3, 0, -1, str);
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.T, M, 0, 0, 8186);
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Link, ButtonAppearance.Accent, null, null, false, false, null, null, null, d370.N(R.string.vk_games_error_retry_button, 0, M), null, null, null, null, false, null, null, null, M, (i4 & 14) | X2.b.f, 0, 0, 4190192);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new j6l(gzsVar, q630Var, i, 1);
        }
    }
}
