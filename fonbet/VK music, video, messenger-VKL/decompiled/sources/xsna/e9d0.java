package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.List;
import xsna.q630;
import xsna.vas0;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class e9d0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e9d0(int i, Object obj, List list) {
        this.b = i;
        this.c = list;
        this.d = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                Object obj5 = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                f9d0 f9d0Var = (f9d0) this.d;
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(obj5) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                boolean z = true;
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    ua10 ua10Var = (ua10) ((wow) this.c).b.get(intValue);
                    aVar.K(735599476);
                    MarketProductTileConfig marketProductTileConfig = ua10Var.a;
                    q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, ua10Var.b);
                    pco pcoVar = new pco(162);
                    int i3 = (i & 112) ^ 48;
                    boolean J = aVar.J(f9d0Var) | aVar.J(ua10Var) | ((i3 > 32 && aVar.o(intValue)) || (i & 48) == 32);
                    Object x = aVar.x();
                    Object obj6 = a.C0011a.a;
                    if (J || x == obj6) {
                        x = new a9d0(f9d0Var, ua10Var, intValue);
                        aVar.R(x);
                    }
                    izs izsVar = (izs) x;
                    boolean J2 = ((i3 > 32 && aVar.o(intValue)) || (i & 48) == 32) | aVar.J(f9d0Var) | aVar.J(ua10Var);
                    Object x2 = aVar.x();
                    if (J2 || x2 == obj6) {
                        x2 = new b9d0(f9d0Var, ua10Var, intValue);
                        aVar.R(x2);
                    }
                    izs izsVar2 = (izs) x2;
                    boolean J3 = aVar.J(f9d0Var) | aVar.J(ua10Var);
                    if ((i3 <= 32 || !aVar.o(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = J3 | z;
                    Object x3 = aVar.x();
                    if (z2 || x3 == obj6) {
                        x3 = new c9d0(f9d0Var, ua10Var, intValue);
                        aVar.R(x3);
                    }
                    com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, b, pcoVar, izsVar, izsVar2, (izs) x3, aVar, 384, 64);
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
                    vas0.a aVar3 = (vas0.a) this.c.get(intValue3);
                    aVar2.K(702987913);
                    ((vas0) this.d).b(aVar3, false, lmi.b, aVar2, 384, 2);
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
