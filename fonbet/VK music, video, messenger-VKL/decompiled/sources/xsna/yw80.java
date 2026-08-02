package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import xsna.phw;

/* compiled from: OrderProductItem.kt */
/* loaded from: classes18.dex */
public final class yw80 {
    public static final void a(gpd0 gpd0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        com.vk.core.compose.component.cell.content.h1 b;
        com.vk.core.compose.component.cell.content.v vVar;
        ImageSize Cb;
        String str = gpd0Var.j;
        int i3 = gpd0Var.i;
        androidx.compose.runtime.a M = aVar.M(-39542272);
        if ((i & 6) == 0) {
            i2 = (M.J(gpd0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-39542272, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.ProductItem (OrderProductItem.kt:32)");
            }
            int I0 = (int) ((azl) M.r(uvi.h)).I0(72);
            String E = d370.E(R.plurals.ecomm_order_product_summary_description, i3, M);
            int i4 = i2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 H = s200.H(yu80.a(q630Var, ylu0Var.getBackground().g, gpd0Var.b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, !gpd0Var.l ? kqu0.r : 0, 7);
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new hc1(20, izsVar, gpd0Var);
                aVar3 = M;
                aVar3.R(x);
            } else {
                aVar3 = M;
            }
            q630 c = ojc.c(H, false, null, null, (gzs) x, 15);
            Image image = gpd0Var.f;
            lg90 l = fwu0.l(null, (image == null || (Cb = image.Cb(I0, true, false)) == null) ? null : Cb.d.d, null, null, aVar3, 0, 61);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.g.a(phw.a.a(l, new rek0(ylu0Var2.getBackground().x), null, null, null, aVar4, 196616, 28), Cell$Left.Main.Size.Large, null, PictureRadius.Large, null, aVar4, 12607536, 108), null, aVar4, 2);
            String str2 = gpd0Var.g;
            Object x2 = aVar4.x();
            if (x2 == c0012a) {
                x2 = new j0r(15);
                aVar4.R(x2);
            }
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(str2, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, aVar4, 12582912, 94);
            androidx.compose.runtime.a aVar5 = aVar4;
            String str3 = gpd0Var.h;
            if (str3 == null) {
                aVar5.K(-1180958380);
                aVar5.j();
                b = null;
            } else {
                aVar5.K(-1180958379);
                Object x3 = aVar5.x();
                if (x3 == c0012a) {
                    x3 = new p7x(14);
                    aVar5.R(x3);
                }
                b = Cell$Middle.c.b.b(str3, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar5, 12582912, 94);
                aVar5 = aVar5;
                aVar5.j();
            }
            if (i3 > 1) {
                str = i3 + " x " + str;
            }
            String str4 = str;
            boolean J = (i6 == 4) | aVar5.J(E);
            Object x4 = aVar5.x();
            if (J || x4 == c0012a) {
                x4 = new nv2(29, gpd0Var, E);
                aVar5.R(x4);
            }
            androidx.compose.runtime.a aVar6 = aVar5;
            androidx.compose.runtime.a aVar7 = aVar6;
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, b, Cell$Middle.b.a.a(str4, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), aVar6, 24576, 6), null, aVar7, 196608, 24);
            if (gpd0Var.k) {
                aVar7.K(-1180107863);
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                String N = d370.N(R.string.ecomm_order_review, 0, aVar7);
                boolean z2 = (i5 == 32) | (i6 == 4);
                Object x5 = aVar7.x();
                if (z2 || x5 == c0012a) {
                    x5 = new i4(14, izsVar, gpd0Var);
                    aVar7.R(x5);
                }
                vVar = com.vk.core.compose.component.cell.content.k.a(buttonStyle, buttonAppearance, null, N, null, null, null, false, null, null, (gzs) x5, aVar7, 54, 1572864, 32756);
                aVar7 = aVar7;
                aVar7.j();
            } else {
                aVar7.K(-1179707994);
                aVar7.j();
                vVar = null;
            }
            com.vk.core.compose.component.cell.content.v vVar2 = vVar;
            androidx.compose.runtime.a aVar8 = aVar7;
            wiu0.b(c, false, a, a3, vVar2, null, null, aVar8, 0, 98);
            aVar2 = aVar8;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new i3h(i, 3, gpd0Var, izsVar, q630Var);
        }
    }
}
