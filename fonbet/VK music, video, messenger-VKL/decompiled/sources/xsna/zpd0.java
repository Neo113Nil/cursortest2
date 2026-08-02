package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import xsna.q630;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class zpd0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wow c;
    public final /* synthetic */ izs d;

    public /* synthetic */ zpd0(wow wowVar, izs izsVar, int i) {
        this.b = i;
        this.c = wowVar;
        this.d = izsVar;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                cry cryVar = (cry) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(cryVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    upd0 upd0Var = (upd0) this.c.b.get(intValue);
                    aVar.K(807895874);
                    com.vk.ecomm.product_list.presentation.g.h(upd0Var, this.d, null, aVar, 0);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ksy ksyVar = (ksy) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar2.J(ksyVar) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar2.o(intValue3) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    ProductVideoAttach productVideoAttach = (ProductVideoAttach) this.c.b.get(intValue3);
                    aVar2.K(-218720172);
                    q630 E = ahn.E(txj0.v(q630.a.a, 250), "videoAttachItem");
                    izs izsVar = this.d;
                    boolean J = aVar2.J(izsVar) | aVar2.J(productVideoAttach);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new o2s0(izsVar, productVideoAttach);
                        aVar2.R(x);
                    }
                    com.vk.ecomm.design.compose.productattaches.b.a(productVideoAttach, E, (gzs) x, aVar2, 48);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
