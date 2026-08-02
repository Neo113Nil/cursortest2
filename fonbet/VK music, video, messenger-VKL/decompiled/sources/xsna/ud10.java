package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.design.compose.reviewcard.ReviewCardTypeOfState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketReviewCardContent.kt */
/* loaded from: classes18.dex */
public final class ud10 implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ud10 ud10Var;
        androidx.compose.runtime.a M = aVar.M(-632428855);
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
                androidx.compose.runtime.b.f(-632428855, i3, -1, "com.vk.design.demo.presentation.screens.MarketReviewCardContent.Content (MarketReviewCardContent.kt:33)");
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Review Card", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i3 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(true, false, M, 438, 0);
            ud10Var = this;
            ud10Var.b(txj0.d(aVar2, 1.0f), M, ((i3 >> 12) & 112) | 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            ud10Var = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new td10(ud10Var, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1431783576);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1431783576, i2, -1, "com.vk.design.demo.presentation.screens.MarketReviewCardContent.Content (MarketReviewCardContent.kt:60)");
            }
            zrp<ReviewCardTypeOfState> h = ReviewCardTypeOfState.h();
            ArrayList arrayList = new ArrayList(c5g.u(h, 10));
            Iterator<E> it = h.iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((ReviewCardTypeOfState) it.next(), new wgg0(r6.ordinal(), "", "ProductName", "Product description description description description", 4)));
            }
            boolean y = M.y(arrayList);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new hvz(arrayList, 3);
                M.R(x);
            }
            nb90.a(rc90.b(0, (gzs) x, M, 0, 3), q630Var, s200.m(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 0, 12, null, null, false, null, null, null, null, kai.c(-827461159, new pja(arrayList, 2), M), M, ((i2 << 3) & 112) | 196992, 24576, 16344);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ofj(this, q630Var, i, 1);
        }
    }
}
