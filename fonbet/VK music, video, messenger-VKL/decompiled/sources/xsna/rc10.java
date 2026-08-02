package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class rc10 implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ wh50 c;

    public rc10(wow wowVar, wh50 wh50Var) {
        this.b = wowVar;
        this.c = wh50Var;
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
            jtk0 jtk0Var = (jtk0) this.b.b.get(intValue);
            aVar2.K(175589412);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, aVar2, 6);
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
            StringBuilder sb = new StringBuilder("State: ");
            jqi jqiVar = jtk0Var.a;
            MarketProductTileConfig marketProductTileConfig = jtk0Var.b;
            sb.append(jqiVar.name());
            sb.append(" Viewer: ");
            sb.append(marketProductTileConfig.b.name());
            String sb2 = sb.toString();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(sb2, null, 0L, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.w0, aVar2, 0, 0, 8126);
            f9t.e(txj0.h(aVar3, 2), aVar2, 6);
            wh50 wh50Var = this.c;
            boolean J = aVar2.J(wh50Var);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new nc10(wh50Var);
                aVar2.R(x);
            }
            izs izsVar = (izs) x;
            boolean J2 = aVar2.J(wh50Var);
            Object x2 = aVar2.x();
            if (J2 || x2 == obj) {
                x2 = new oc10(wh50Var);
                aVar2.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean J3 = aVar2.J(wh50Var);
            Object x3 = aVar2.x();
            if (J3 || x3 == obj) {
                x3 = new pc10(wh50Var);
                aVar2.R(x3);
            }
            com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, null, null, izsVar, izsVar2, (izs) x3, aVar2, 0, 70);
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
