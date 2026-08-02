package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.uxe0;

/* compiled from: MarketItemForReviewItemContent.kt */
/* loaded from: classes18.dex */
public final class t110 {
    public static final void a(s110 s110Var, izs izsVar, wzs wzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z = s110Var.g;
        androidx.compose.runtime.a M = aVar.M(-1913106857);
        int i3 = i | (M.J(s110Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(wzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1913106857, i3, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemForReviewItemContent (MarketItemForReviewItemContent.kt:38)");
            }
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.o;
            boolean z2 = !z;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            int i4 = i3 & 14;
            boolean z3 = ((i3 & 112) == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new hn9(17, izsVar, s110Var);
                M.R(x2);
            }
            q630 b = ojc.b(q630Var, sg50Var, null, z2, null, (gzs) x2, 24);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar2, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.h(aVar4, 28), M, 6);
            c(s110Var.c, null, M, 0);
            f9t.e(txj0.h(aVar4, 8), M, 6);
            d(s110Var.d, null, M, 0);
            f9t.e(txj0.h(aVar4, 2), M, 6);
            b(s110Var.e, null, M, 0);
            f9t.e(txj0.h(aVar4, 26), M, 6);
            int i5 = s110Var.f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1131013412, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite36> (VkSdkIcons.kt:860)");
            }
            lg90 b2 = or.b(M, -1949301, R.drawable.vk_icon_favorite_36, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uxe0 a2 = uxe0.a.a(M);
            boolean z4 = ((i3 & 896) == 256) | (i4 == 4);
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new b7(12, wzsVar, s110Var);
                M.R(x3);
            }
            rxe0.a(i5, b2, (izs) x3, null, false, a2, M, 64, 24);
            if (z) {
                M.K(-385093251);
                f9t.e(txj0.h(aVar4, 4), M, 6);
                e(null, M, 0);
                i2 = 22;
            } else {
                M.K(-384958773);
                i2 = 42;
            }
            ck70.b(aVar4, i2, M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m8k(s110Var, izsVar, wzsVar, q630Var, i);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-555777481);
        int i2 = i | (M.J(str) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-555777481, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.ProductCategory (MarketItemForReviewItemContent.kt:120)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "productDescription");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, j, null, null, 0, 3, null, 2, false, 0, 1, null, wuv0Var.m0, M, (i2 & 14) | 100663296, 48, 5816);
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
            s.d = new g06(str, q630Var2, i, 6);
        }
    }

    public static final void c(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        String str2;
        androidx.compose.runtime.a M = aVar.M(-1661655908);
        int i2 = (M.J(str) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1661655908, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.ProductImage (MarketItemForReviewItemContent.kt:77)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 10;
            q630 d = rte0.d(txj0.h(txj0.v(aVar2, 128), 152), vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            str2 = str;
            fwu0.c(r18.a(f2, ylu0Var2.getImage().a, m, vog0.b(f)), str2, null, null, null, null, null, ehi.a, M, ((i2 << 3) & 112) | 100663296, 252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h0k(str2, q630Var, i, 1);
        }
    }

    public static final void d(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2117711862);
        int i2 = i | (M.J(str) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2117711862, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.ProductName (MarketItemForReviewItemContent.kt:104)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "productTitle");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, j, null, null, 0, 3, null, 2, false, 0, 1, null, wuv0Var.e0, M, (i2 & 14) | 100663296, 48, 5816);
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
            s.d = new xx9(str, q630Var2, i, 6);
        }
    }

    public static final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2025634509);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2025634509, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.SuccessSentReviewText (MarketItemForReviewItemContent.kt:133)");
            }
            String N = d370.N(R.string.market_item_reviews_product_offer_review_sent, 0, M);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "doneTitle");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.q().e;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
            aVar2 = M;
            yqv0.c(N, E, j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.l0, aVar2, 0, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new tau(q630Var2, i, 1);
        }
    }
}
