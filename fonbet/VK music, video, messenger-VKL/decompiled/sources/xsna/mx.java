package xsna;

import androidx.compose.runtime.a;
import java.util.List;
import xsna.q630;
import xsna.xu;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class mx implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ kx c;
    public final /* synthetic */ izs d;

    public mx(List list, kx kxVar, izs izsVar) {
        this.b = list;
        this.c = kxVar;
        this.d = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            xu xuVar = (xu) this.b.get(intValue);
            aVar2.K(1528667106);
            boolean z = xuVar instanceof xu.b;
            q630.a aVar3 = q630.a.a;
            kx kxVar = this.c;
            if (z) {
                aVar2.K(1528726904);
                aVar2.K(-1059064903);
                xu.b bVar = (xu.b) xuVar;
                boolean z2 = bVar.c;
                boolean l = aVar2.l(z2);
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (l || x == c0012a) {
                    x = new pco(z2 ? 0 : 10);
                    aVar2.R(x);
                }
                float f = 16;
                kxVar.k(s200.E(aVar3, f, ((pco) x).b), aVar2, 64);
                aVar2.j();
                boolean l2 = aVar2.l(z2);
                Object x2 = aVar2.x();
                if (l2 || x2 == c0012a) {
                    x2 = new pco(z2 ? 12 : 6);
                    aVar2.R(x2);
                }
                kxVar.l(bVar, s200.G(txj0.f(aVar3, 1.0f), f, ((pco) x2).b, f, 4), aVar2, 512);
                aVar2.j();
            } else {
                if (!(xuVar instanceof xu.a)) {
                    throw alb0.c(-1059066815, aVar2);
                }
                aVar2.K(1530056153);
                xu.a aVar4 = (xu.a) xuVar;
                kxVar.h(aVar4, this.d, ahn.E(aVar3, aVar4.b.f.name()), aVar2, 4096);
                aVar2.j();
            }
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
