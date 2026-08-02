package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketProductTileContent.kt */
/* loaded from: classes18.dex */
public final class vc10 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(409531200);
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
        if (M.t(i2 & 1, (i2 & 8195) != 8194)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(409531200, i2, -1, "com.vk.design.demo.presentation.screens.ecomm.tile.MarketProductTileContent.Content (MarketProductTileContent.kt:36)");
            }
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Market Product Tile", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630 F = s200.F(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new t1k(1, wh50Var);
                M.R(x2);
            }
            eku0.b((gzs) x2, null, booleanValue, false, null, null, M, 6, 58);
            yqv0.c("IconCtaButton", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = qq.h(0, M);
            }
            wh50 wh50Var2 = (wh50) x3;
            vpu0.c(((Number) wh50Var2.getValue()).intValue(), kai.c(-1824037545, new xs2(wh50Var2, 3), M), txj0.f(aVar2, 1.0f), 0L, false, null, M, Tensorflow.FRAME_WIDTH, 120);
            M = M;
            int intValue = ((Number) wh50Var2.getValue()).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    M.K(-764722408);
                } else {
                    M.K(-761374811);
                    id10.a(txj0.d(aVar2, 1.0f), M, 6);
                }
                M.j();
                s3q0 s3q0Var = s3q0.a;
            } else {
                M.K(-761629972);
                sc10.a(6, M, txj0.d(aVar2, 1.0f), ((Boolean) wh50Var.getValue()).booleanValue());
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tku(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
