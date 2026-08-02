package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CellButtonGroupScreenContent.kt */
/* loaded from: classes18.dex */
public final class sma implements yah0 {
    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1118414285);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1118414285, i2, -1, "com.vk.design.demo.presentation.screens.CellButtonGroupScreenContent.Content (CellButtonGroupScreenContent.kt:41)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Cell Button Group", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(true, true, M, 438, 0);
            float f2 = 4;
            float f3 = 8;
            rzo0.a(54, 0, M, "View", s200.H(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar2), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            int i4 = (i2 >> 15) & 14;
            c(i4, M);
            rzo0.a(54, 0, M, "Compose", s200.H(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar2), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            b(i4, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pma
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sma.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-337564394);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-337564394, i, -1, "com.vk.design.demo.presentation.screens.CellButtonGroupScreenContent.ComposeSample (CellButtonGroupScreenContent.kt:78)");
            }
            q630.a aVar2 = q630.a.a;
            niu0.a(txj0.f(aVar2, 1.0f), gci.a, M, 54);
            niu0.a(txj0.f(aVar2, 1.0f), gci.b, M, 54);
            niu0.a(txj0.f(aVar2, 1.0f), gci.c, M, 54);
            niu0.a(txj0.f(aVar2, 1.0f), gci.d, M, 54);
            niu0.a(txj0.f(aVar2, 1.0f), gci.e, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qma(this, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1430549435);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1430549435, i, -1, "com.vk.design.demo.presentation.screens.CellButtonGroupScreenContent.ViewSample (CellButtonGroupScreenContent.kt:135)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new od3(4);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, f);
            q630 f2 = txj0.f(aVar2, 1.0f);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new io3(3);
                M.R(x2);
            }
            ae2.a(54, 4, M, (izs) x2, null, f2);
            q630 f3 = txj0.f(aVar2, 1.0f);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new dh5(2);
                M.R(x3);
            }
            ae2.a(54, 4, M, (izs) x3, null, f3);
            q630 f4 = txj0.f(aVar2, 1.0f);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new cj1(7);
                M.R(x4);
            }
            ae2.a(54, 4, M, (izs) x4, null, f4);
            q630 f5 = txj0.f(aVar2, 1.0f);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new dj1(5);
                M.R(x5);
            }
            ae2.a(54, 4, M, (izs) x5, null, f5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rma(this, i);
        }
    }
}
