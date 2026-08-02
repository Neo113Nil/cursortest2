package xsna;

import androidx.compose.runtime.a;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class n7i0 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ izs c;

    public n7i0(List list, izs izsVar) {
        this.b = list;
        this.c = izsVar;
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
            h8i0 h8i0Var = (h8i0) this.b.get(intValue);
            aVar2.K(987181200);
            izs izsVar = this.c;
            boolean J = aVar2.J(izsVar) | aVar2.J(h8i0Var);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new l7i0(izsVar, h8i0Var);
                aVar2.R(x);
            }
            n8i0.a(h8i0Var, null, (gzs) x, aVar2, 0);
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
