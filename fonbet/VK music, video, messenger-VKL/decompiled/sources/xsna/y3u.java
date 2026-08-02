package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: GoodCharacteristicsContent.kt */
/* loaded from: classes18.dex */
public final class y3u {
    public static final void a(final ArrayList arrayList, final boolean z, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        lg90 b;
        androidx.compose.runtime.a M = aVar.M(471312315);
        int i2 = i | (M.J(arrayList) ? 4 : 2) | (M.l(z) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(471312315, i2, -1, "com.vk.ecomm.market.good.ui.holder.description.ui.GoodCharacteristicsContent (GoodCharacteristicsContent.kt:34)");
            }
            q630 H = s200.H(txj0.f(q630Var, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 5);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, c, cri.a.d);
            M.K(-555303646);
            List H0 = j5g.H0(new wow(arrayList), 5);
            int size = H0.size();
            for (int i3 = 0; i3 < size; i3++) {
                w3u w3uVar = (w3u) H0.get(i3);
                md10.a(0, M, w3uVar.a, w3uVar.b, null);
            }
            M.j();
            if (arrayList.size() > 5) {
                M.K(-34315742);
                dtp0 d = jq2.d(250, 0, null, 6);
                dt1.a.getClass();
                ty6.b bVar = dt1.a.k;
                mm2.b(r9g.a, z, null, anp.d(d, bVar, null, 12), anp.k(d, bVar, 12), null, kai.c(633972196, new qyq(arrayList, 2), M), M, 1600518 | (i2 & 112), 18);
                String N = d370.N(z ? R.string.good_collapse : R.string.good_all_characteristics, 0, M);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Link;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                if (z) {
                    M.K(-33131511);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(165606754, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DropdownFlippedOutline16> (VkIcons.kt:2298)");
                    }
                    b = or.b(M, -1326430920, R.drawable.vk_icon_dropdown_flipped_outline_16, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-33054259);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1793527244, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DropdownOutline16> (VkSdkIcons.kt:762)");
                    }
                    b = or.b(M, 1577142419, R.drawable.vk_icon_dropdown_outline_16, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, F, null, false, false, null, null, null, N, null, b, null, new pco(16), false, null, null, null, M, 3510, 1605632, 0, 4108256);
                M = M;
            } else {
                M.K(-36280367);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(arrayList, z, gzsVar, q630Var, i) { // from class: xsna.x3u
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3457);
                    y3u.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
