package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: CartCommunity.kt */
/* loaded from: classes18.dex */
public final class cw9 {
    public static final void a(CartItem.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str;
        com.vk.core.compose.component.cell.content.x xVar;
        int i3;
        String str2;
        androidx.compose.runtime.a M = aVar.M(-1131171838);
        int i4 = (i & 6) == 0 ? (M.J(bVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1131171838, i4, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartCommunity (CartCommunity.kt:34)");
            }
            String str3 = "cart_community_" + fkq0.a(bVar.c);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(ahn.E(aVar2, str3).g(q630Var), 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = bVar.h;
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z2 = (i5 == 32) | (i6 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ww(3, izsVar, bVar);
                M.R(x);
            }
            q630 H = s200.H(ojc.c(aVar2, z, null, null, (gzs) x, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            lg90 l = fwu0.l(bVar.d, null, null, null, M, 0, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(l, new rek0(ylu0Var.getBackground().x), null, null, null, M, 196616, 28), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            us2 b = ws2.b(bVar.e, M, 0);
            if (bVar.f) {
                M.K(2061357516);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2124872764, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified20> (VkSdkIcons.kt:3656)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_verified_20, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                } else {
                    str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var2.getIcon().a;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new f57(2);
                    M.R(x2);
                }
                i2 = 3;
                str = str2;
                xVar = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(a3, j, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 24584, 4);
                M.j();
            } else {
                i2 = 3;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                M.K(2061762934);
                M.j();
                xVar = null;
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new zj(8);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.d.b.b(b, null, null, xVar, 1, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, i2), null, null, M, 12804096, 6, 774);
            ArrayList arrayList = bVar.g;
            wow wowVar = new wow(arrayList);
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            for (Object obj : arrayList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    e43.t();
                    throw null;
                }
                sb.append((String) obj);
                if (i7 != e43.h(wowVar)) {
                    sb.append(" · ");
                }
                i7 = i8;
            }
            String sb2 = sb.toString();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new ak(5);
                M.R(x4);
            }
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(b2, Cell$Middle.c.b.b(sb2, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 12582912, 94), null, null, M, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(1242272540, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreHorizontal28> (VkSdkIcons.kt:2644)");
            } else {
                i3 = 0;
            }
            lg90 b3 = or.b(M, -1191772860, R.drawable.vk_icon_more_horizontal_28, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.ecomm_cart_actions_with_cart, i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i3, -1, str);
            }
            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var3.getIcon().a;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new c2(7);
                M.R(x5);
            }
            com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3);
            int i9 = (i5 == 32 ? 1 : i3) | (i6 != 4 ? i3 : 1);
            Object x6 = M.x();
            if (i9 != 0 || x6 == c0012a) {
                x6 = new ie3(2, izsVar, bVar);
                M.R(x6);
            }
            wiu0.b(H, false, a2, a4, o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b3, j2, 0L, N, (gzs) x6, a5, M, 1572872, 4), null, null, null, M, 61), null, null, M, 0, 98);
            M = M;
            jqu0.a(s200.H(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 5.5d, 5), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bw9(bVar, izsVar, q630Var, i, 0);
        }
    }
}
