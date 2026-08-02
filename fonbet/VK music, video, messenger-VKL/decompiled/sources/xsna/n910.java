package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsSize;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketPaginationDotsContent.kt */
/* loaded from: classes18.dex */
public final class n910 implements yah0 {
    public final List b = e43.l(MarketPaginationDotsSize.Small, MarketPaginationDotsSize.Large);

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        n910 n910Var;
        androidx.compose.runtime.a M = aVar.M(799613385);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 196608) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (65539 & i3) != 65538)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(799613385, i3, -1, "com.vk.design.demo.presentation.screens.MarketPaginationDotsContent.Content (MarketPaginationDotsContent.kt:48)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Pagination dots", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i3 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(true, true, M, 438, 0);
            n910Var = this;
            n910Var.b(txj0.d(aVar2, 1.0f), M, ((i3 >> 12) & 112) | 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            n910Var = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final n910 n910Var2 = n910Var;
            s.d = new wzs() { // from class: xsna.m910
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n910.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        n910 n910Var;
        androidx.compose.runtime.a M = aVar.M(1662469272);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1662469272, i2, -1, "com.vk.design.demo.presentation.screens.MarketPaginationDotsContent.Content (MarketPaginationDotsContent.kt:75)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(MarketPaginationDotsSize.Large);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            q630 E = s200.E(q630Var, kqu0.b, kqu0.c);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(txj0.h(aVar3, 128), 1.0f);
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            s910.a(6, rg50Var.getIntValue(), null, (MarketPaginationDotsSize) wh50Var.getValue(), M, 6, 4);
            M.G();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.t), dt1.a.k, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar3);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            boolean z = rg50Var.getIntValue() > 0;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new flu(rg50Var, 15);
                M.R(x3);
            }
            int i3 = 1;
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "−", null, null, null, null, z, null, null, null, M, 3510, 384, 0, 4059120);
            boolean z2 = rg50Var.getIntValue() < 5;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new t210(rg50Var, i3);
                M.R(x4);
            }
            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "+", null, null, null, null, z2, null, null, null, M, 3510, 384, 0, 4059120);
            M.G();
            n910Var = this;
            wow wowVar = new wow(n910Var.b);
            MarketPaginationDotsSize marketPaginationDotsSize = (MarketPaginationDotsSize) wh50Var.getValue();
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new ko0(1, wh50Var);
                M.R(x5);
            }
            y9i0.b("Size", wowVar, marketPaginationDotsSize, (izs) x5, txj0.f(aVar3, 1.0f), M, 27654, 0);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            n910Var = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ema(n910Var, q630Var, i, 3);
        }
    }
}
