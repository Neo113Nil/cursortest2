package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.dt1;
import xsna.g6n0;
import xsna.mmh0;
import xsna.q630;

/* compiled from: SearchAddressSuggestionsContent.kt */
/* loaded from: classes18.dex */
public final class pmh0 {
    public static final void a(g6n0.a aVar, izs<? super zlh0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(1775254936);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1775254936, i2, -1, "com.vk.ecomm.cart.impl.search_address.ui.compose.AddressItem (SearchAddressSuggestionsContent.kt:53)");
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new hc1(23, izsVar, aVar);
                M.R(x);
            }
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(s200.E(ojc.c(aVar4, false, null, null, (gzs) x, 15), 16, 10), 1.0f);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(aVar.b, ahn.E(aVar4, "search_address_suggestion_title"), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).N, M, 48, 0, 8184);
            String str = aVar.c;
            if (str == null) {
                M.K(-1370710863);
                M.j();
                aVar3 = M;
            } else {
                M.K(-1370710862);
                f9t.e(txj0.h(aVar4, 2), M, 6);
                aVar3 = M;
                yqv0.c(str, ahn.E(aVar4, "search_address_suggestion_subtitle"), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).m0, aVar3, 48, 0, 8184);
                aVar3.j();
            }
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new r21(aVar, izsVar, i, 9);
        }
    }

    public static final void b(g6n0.b bVar, izs<? super zlh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1108100029);
        int i2 = (M.y(izsVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1108100029, i2, -1, "com.vk.ecomm.cart.impl.search_address.ui.compose.CustomAddress (SearchAddressSuggestionsContent.kt:86)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nq0(izsVar, 7);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(ojc.c(aVar3, false, null, null, (gzs) x, 15), 1.0f), 48));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.ecomm_search_address_custom_address, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
            }
            lg90 b = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            f9t.e(txj0.v(aVar3, f), M, 6);
            aVar2 = M;
            yqv0.c(N, null, wlb0.h(M).getText().a, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).N, aVar2, 0, 0, 8186);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new e7c(bVar, izsVar, i, 7);
        }
    }

    public static final void c(mmh0.e eVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(986015143);
        if ((i & 6) == 0) {
            i2 = (M.J(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(986015143, i2, -1, "com.vk.ecomm.cart.impl.search_address.ui.compose.SearchAddressSuggestionsContent (SearchAddressSuggestionsContent.kt:35)");
            }
            wh50 d = jk50.d(eVar.a, EmptyList.b, M, 48);
            boolean J = M.J(d) | ((i2 & 896) == 256);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new qb6(28, d, izsVar);
                M.R(x);
            }
            lqy.a(q630Var2, null, null, null, null, null, false, null, (izs) x, M, (i2 >> 3) & 14, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iu6(i, 4, eVar, q630Var, izsVar);
        }
    }
}
