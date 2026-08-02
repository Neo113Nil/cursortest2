package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: PinReviewManageServiceError.kt */
/* loaded from: classes18.dex */
public final class wma0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(2044594763);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2044594763, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.PinReviewManageServiceError (PinReviewManageServiceError.kt:29)");
            }
            q630.a aVar3 = q630.a.a;
            q630 D = s200.D(txj0.f(aVar3, 1.0f), 16);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (we7.m(M)) {
                M.K(69659345);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1060812596, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaDark56> (VkSdkIcons.kt:1084)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_dark_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(69724848);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            boolean z = false;
            u8p0 s = ad0.s(a, 0L, null, null, null, null, null, M, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            String N = d370.N(R.string.pin_review_subscription_info_error_title, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new d230(5);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            String N2 = d370.N(R.string.pin_review_subscription_info_error_description, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new dl70(6);
                M.R(x2);
            }
            vl20 a4 = zra0.a.a(N, a3, N2, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 196608, 8);
            String N3 = d370.N(R.string.pin_review_retry_button_text, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new wx30(6);
                M.R(x3);
            }
            com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3);
            if ((i2 & 14) == 4) {
                z = true;
            }
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new mv7(izsVar, 5);
                M.R(x4);
            }
            aVar2 = M;
            ldv0.d(null, s, a4, wra0.b.a(wra0.a.C3954a.a(N3, (gzs) x4, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, a5, aVar2, 28032, 12582912, 65504), null, null, aVar2, 14), null, null, false, aVar2, 0, 113);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new r85(izsVar, q630Var2, i, 6);
        }
    }
}
