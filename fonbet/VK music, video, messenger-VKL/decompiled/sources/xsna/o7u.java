package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GoodQuickMessagesHolder.kt */
/* loaded from: classes18.dex */
public final class o7u {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, ArrayList arrayList, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(407335583);
        int i2 = i | (M.J(arrayList) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(407335583, i2, -1, "com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessagesContent (GoodQuickMessagesHolder.kt:128)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, null, null, null, null, null, null, false, M, ((i2 >> 3) & 14) | 805306368, 510), null, b.c.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            aVar2 = M;
            jgh0 x = p490.x(aVar2);
            q630.a aVar4 = q630.a.a;
            q630 r = p490.r(aVar4, x, 14);
            float f = kqu0.q;
            float f2 = kqu0.w;
            float f3 = kqu0.b;
            q630 E = ahn.E(s200.G(r, f3, f, f3, f2), "quickMessagesList");
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.s), dt1.a.k, aVar2, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c2 = qri.c(aVar2, E);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a2, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c2, dVar);
            aVar2.K(-616002938);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                QuickMessageItem quickMessageItem = (QuickMessageItem) it.next();
                String str2 = quickMessageItem.b;
                boolean J = ((i2 & 896) == 256) | aVar2.J(quickMessageItem);
                Object x2 = aVar2.x();
                if (J || x2 == a.C0011a.a) {
                    x2 = new com.vk.catalog2.common.ui.holders.a(13, izsVar, quickMessageItem);
                    aVar2.R(x2);
                }
                ly00.a(384, aVar2, str2, (gzs) x2, ahn.E(aVar4, "quickMessageText"));
            }
            aVar2.j();
            aVar2.G();
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
            s.d = new g4c(i, str, arrayList, izsVar, q630Var);
        }
    }
}
