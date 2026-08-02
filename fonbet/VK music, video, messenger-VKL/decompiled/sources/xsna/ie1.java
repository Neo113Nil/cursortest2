package xsna;

import androidx.compose.runtime.a;

/* compiled from: LazyDsl.kt */
/* loaded from: classes7.dex */
public final class ie1 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ izs c;

    public ie1(wow wowVar, izs izsVar) {
        this.b = wowVar;
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
            rl1 rl1Var = (rl1) this.b.b.get(intValue);
            aVar2.K(-227638054);
            izs izsVar = this.c;
            boolean J = aVar2.J(izsVar);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new ge1(izsVar);
                aVar2.R(x);
            }
            zi1.a(rl1Var, (izs) x, null, aVar2, 0);
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
