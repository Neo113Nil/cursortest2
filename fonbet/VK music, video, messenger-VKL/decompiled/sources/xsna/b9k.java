package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CreateMarketItemReviewSentView.kt */
/* loaded from: classes18.dex */
public final class b9k {
    public static final void a(final String str, final String str2, final q630 q630Var, final boolean z, final gzs gzsVar, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        SemanticsConfiguration.Mode mode;
        boolean z2;
        boolean z3;
        y48 y48Var;
        int i3;
        androidx.compose.runtime.a M = aVar.M(769779377);
        int i4 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.l(z) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192) | (M.y(gzsVar2) ? 131072 : 65536);
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(769779377, i4, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewSentView (CreateMarketItemReviewSentView.kt:37)");
            }
            q630 D = p490.D(s200.D(q630Var, 16), p490.x(M), 14);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(1978235452);
                String N = d370.N(R.string.create_market_item_review_success_result_dialog_faqButton, 0, M);
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                Object x = M.x();
                if (x == c0012a2) {
                    x = new ur0(21);
                    M.R(x);
                }
                int i5 = ((i4 >> 9) & 112) | 28032;
                i2 = i4;
                mode = null;
                z3 = true;
                z2 = 14;
                c0012a = c0012a2;
                r48 a2 = wra0.a.C3954a.a(N, gzsVar, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, i5, 12582912, 65504);
                M = M;
                y48 a3 = wra0.b.a(a2, null, null, M, 14);
                M.j();
                y48Var = a3;
            } else {
                i2 = i4;
                c0012a = c0012a2;
                mode = null;
                z2 = 14;
                z3 = true;
                M.K(1978794102);
                M.j();
                y48Var = null;
            }
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, z3);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(1444785948, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline56> (VkSdkIcons.kt:374)");
            } else {
                i3 = 0;
            }
            lg90 b = or.b(M, 1751086399, R.drawable.vk_icon_check_circle_outline_56, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i3, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = c0012a;
            if (x2 == c0012a3) {
                x2 = new vr0(27);
                M.R(x2);
            }
            t8p0 a4 = csa0.a(b, j, 0L, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 3), M, 196616, 12);
            Object x3 = M.x();
            if (x3 == c0012a3) {
                x3 = new sc(19);
                M.R(x3);
            }
            ldv0.d(xpyVar, a4, zra0.a.a(str, null, str2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 3), M, (i2 & 14) | 196608 | ((i2 << 3) & 896), 10), y48Var, null, null, false, M, 0, 112);
            androidx.compose.runtime.a aVar3 = M;
            bhu0.e(gzsVar2, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(ahn.E(q630.a.a, "successButton"), 1.0f), null, false, false, null, null, null, d370.N(R.string.product_review_ok_button, 0, M), null, null, null, null, false, null, null, null, aVar3, ((i2 >> 15) & 14) | 28080, 0, 0, 4190176);
            M = aVar3;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, str2, q630Var, z, gzsVar, gzsVar2, i) { // from class: xsna.a9k
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ gzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    b9k.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
