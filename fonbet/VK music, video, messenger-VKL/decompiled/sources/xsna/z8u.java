package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GoodsWithFiltersList.kt */
/* loaded from: classes18.dex */
public final class z8u {
    public static final void a(izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1380149764);
        int i2 = (M.y(izsVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1380149764, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.Filters (GoodsWithFiltersList.kt:180)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().a;
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630.a aVar3 = q630.a.a;
            q630 m = hr80.m(aVar3, j, aVar2);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 20;
            q630 m2 = hr80.m(aVar3, ylu0Var2.getBackground().g, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m2);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f2 = 12;
            jnv0.a(true, SubnavigationBarAppearance.Neutral, s200.G(aVar3, f2, 16, f2, f2), false, false, kai.c(-184915459, new sc8(izsVar, 2), M), M, 224310, 0);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zg7(izsVar, i, 9);
        }
    }

    public static final void b(int i, int i2, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(-1671277204);
        int i3 = (M.J(list) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1671277204, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.GoodRow (GoodsWithFiltersList.kt:99)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 u = m200.u(s200.F(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a)), IntrinsicSize.Max);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, u);
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
            Iterator a2 = yu50.a(M, c, cri.a.d, -416745635, list);
            while (a2.hasNext()) {
                b5u b5uVar = (b5u) a2.next();
                q630 c2 = txj0.c(aVar2, 1.0f);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                c(izsVar, b5uVar, c2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), M, (i3 >> 6) & 14);
            }
            M.j();
            M.K(-416738619);
            int max = Math.max(0, i);
            for (int i4 = 0; i4 < max; i4++) {
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w78(i, i2, list, izsVar);
        }
    }

    public static final void c(izs izsVar, b5u b5uVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-397219717);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(b5uVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-397219717, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.GoodView (GoodsWithFiltersList.kt:127)");
            }
            int i3 = i2;
            MarketProductTileConfig marketProductTileConfig = b5uVar.c;
            q630 E = ahn.E(q630Var, "product_" + b5uVar.a.b);
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            boolean z = (i4 == 4) | (i5 == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new w8u(izsVar, b5uVar);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i4 == 4) | (i5 == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new x8u(izsVar, b5uVar);
                M.R(x2);
            }
            izs izsVar3 = (izs) x2;
            boolean z3 = (i4 == 4) | (i5 == 32);
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new y8u(izsVar, b5uVar);
                M.R(x3);
            }
            com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, E, null, izsVar2, izsVar3, (izs) x3, M, 0, 68);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lys(izsVar, b5uVar, q630Var, i, 1);
        }
    }
}
