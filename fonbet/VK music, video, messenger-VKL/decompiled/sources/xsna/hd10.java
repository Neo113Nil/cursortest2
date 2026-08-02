package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import java.util.List;
import java.util.Map;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class hd10 implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;

    public hd10(List list) {
        this.b = list;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(cry cryVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        cry cryVar2 = cryVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(cryVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
            }
            Map.Entry entry = (Map.Entry) this.b.get(intValue);
            aVar2.K(1866478795);
            xzt0 xzt0Var = (xzt0) entry.getKey();
            MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) entry.getValue();
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(aVar2, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c, cri.a.d);
            String name = xzt0Var.name();
            q630 E = s200.E(new gcv(dt1.a.o), kqu0.b, kqu0.r);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(name, E, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.i0, aVar2, 0, 0, 8184);
            boolean y = aVar2.y(marketProductTileConfig);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new zwl(marketProductTileConfig);
                aVar2.R(x);
            }
            izs izsVar = (izs) x;
            q630 f = txj0.f(aVar3, 1.0f);
            boolean y2 = aVar2.y(marketProductTileConfig);
            Object x2 = aVar2.x();
            if (y2 || x2 == obj) {
                x2 = new ed10(marketProductTileConfig);
                aVar2.R(x2);
            }
            ae2.a(48, 0, aVar2, izsVar, (izs) x2, f);
            aVar2.G();
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
