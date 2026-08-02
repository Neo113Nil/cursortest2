package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: ReviewFriendsComposeErrorView.kt */
/* loaded from: classes18.dex */
public final class ihg0 {
    public static final void a(String str, String str2, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(123747974);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(123747974, i2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeErrorView (ReviewFriendsComposeErrorView.kt:28)");
            }
            q630 f = txj0.f(txj0.h(q630.a.a, 362), 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (dhr0.M()) {
                M.K(-1151261286);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1060812596, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaDark56> (VkSdkIcons.kt:1084)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_dark_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1151195783);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            lg90 lg90Var = a;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new z7w(18);
                M.R(x);
            }
            u8p0 s = ad0.s(lg90Var, 0L, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 62);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new d220(13);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new d4r(25);
                M.R(x3);
            }
            vl20 a3 = zra0.a.a(str, a2, str2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, (i2 & 14) | 196608 | ((i2 << 3) & 896), 8);
            String N = d370.N(R.string.vk_common_retry, 0, M);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new v4v(27);
                M.R(x4);
            }
            ldv0.d(null, s, a3, wra0.b.a(wra0.a.C3954a.a(N, gzsVar, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, ((i2 >> 3) & 112) | 28032, 12582912, 65504), null, null, M, 14), null, null, false, M, 0, 113);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new s2(i, 4, str, str2, gzsVar);
        }
    }
}
