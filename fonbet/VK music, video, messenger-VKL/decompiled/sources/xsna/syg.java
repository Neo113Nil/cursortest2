package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CommunityCreateReviewErrorView.kt */
/* loaded from: classes18.dex */
public final class syg {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final String str, final String str2, final gzs gzsVar, q630 q630Var) {
        final q630 q630Var2;
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(1739518997);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | 384 | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1739518997, i2, -1, "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.CreateCommunityReviewErrorView (CommunityCreateReviewErrorView.kt:34)");
            }
            q630.a aVar2 = q630.a.a;
            q630 D = p490.D(s200.D(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.d((int) (iah0.f().heightPixels * 0.5f)), 1, txj0.f(aVar2, 1.0f)), 16), p490.x(M), 14);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (we7.m(M)) {
                M.K(-169878329);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1060812596, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaDark56> (VkSdkIcons.kt:1084)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_dark_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-169812826);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new jt(17);
                M.R(x);
            }
            u8p0 s = ad0.s(a, 0L, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 62);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new sm0(9);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new e60(18);
                M.R(x3);
            }
            vl20 a4 = zra0.a.a(str, a3, str2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, (i2 & 14) | 196608 | ((i2 << 3) & 896), 8);
            String N = d370.N(R.string.vk_common_retry, 0, M);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new jr3(7);
                M.R(x4);
            }
            ldv0.d(null, s, a4, wra0.b.a(wra0.a.C3954a.a(N, gzsVar, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, ((i2 >> 6) & 112) | 28032, 12582912, 65504), null, null, M, 14), null, null, false, M, 0, 113);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(i, str, str2, gzsVar, q630Var2) { // from class: xsna.ryg
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ gzs e;

                {
                    this.b = str;
                    this.c = str2;
                    this.d = q630Var2;
                    this.e = gzsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    syg.a(ne7.I(1), (androidx.compose.runtime.a) obj, this.b, this.c, this.e, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}
