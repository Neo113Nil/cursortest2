package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.MarketDiscountBadgeStyle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketBadgesScreenContent.kt */
/* loaded from: classes18.dex */
public final class ut00 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(592863515);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(592863515, i, -1, "com.vk.design.demo.presentation.screens.Content (MarketBadgesScreenContent.kt:61)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            djn0.a(true, false, M, 54, 2);
            c("Discount", null, M, 6);
            b("Style: Accent", null, M, 6);
            float f = kqu0.b;
            q630.a aVar3 = q630.a.a;
            sw00.a(50, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), MarketDiscountBadgeStyle.Accent, M, 390, 0);
            b("Style: Contrast", null, M, 6);
            sw00.a(50, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), MarketDiscountBadgeStyle.Contrast, M, 390, 0);
            M = M;
            djn0.a(false, true, M, 390, 1);
            c("Discount", null, M, 6);
            b("Style: Accent", null, M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pey(3);
                M.R(x);
            }
            ae2.a(6, 4, M, (izs) x, null, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3));
            b("Style: Contrast", null, M, 6);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new pyz(1);
                M.R(x2);
            }
            ae2.a(6, 4, M, (izs) x2, null, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3));
            c("Ozon", null, M, 6);
            b("New", null, M, 6);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new qey(3);
                M.R(x3);
            }
            ae2.a(6, 4, M, (izs) x3, null, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kb5(q630Var, i, 2);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1330836319);
        int i2 = i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1330836319, i2, -1, "com.vk.design.demo.presentation.screens.Subtitle (MarketBadgesScreenContent.kt:139)");
            }
            float f = kqu0.b;
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
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
            frv0 frv0Var = wuv0Var.v0;
            q630Var2 = aVar3;
            aVar2 = M;
            yqv0.c(str, F, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 6, 0, 8184);
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
            s.d = new bc1(str, q630Var2, i, 5);
        }
    }

    public static final void c(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(995900731);
        int i2 = i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(995900731, i2, -1, "com.vk.design.demo.presentation.screens.Title (MarketBadgesScreenContent.kt:127)");
            }
            float f = kqu0.b;
            q630.a aVar2 = q630.a.a;
            rzo0.a(6, 0, M, str, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tt00(str, q630Var, i, 0);
        }
    }
}
