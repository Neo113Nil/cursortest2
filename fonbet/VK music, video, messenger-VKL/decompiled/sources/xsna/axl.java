package xsna;

import java.util.List;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class axl implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ izs c;

    public axl(List list, izs izsVar) {
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
            i5u0 i5u0Var = (i5u0) this.b.get(intValue);
            aVar2.K(1318233172);
            bxl.c(this.c, i5u0Var, txj0.f(q630.a.a, 1.0f), aVar2, 384);
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
