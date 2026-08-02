package xsna;

import androidx.compose.runtime.a;
import java.util.List;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes16.dex */
public final class uqz implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ izs c;

    public uqz(List list, izs izsVar) {
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
            tmd tmdVar = (tmd) this.b.get(intValue);
            aVar2.K(2046431676);
            String str = tmdVar.c;
            String str2 = tmdVar.b;
            String str3 = tmdVar.d;
            izs izsVar = this.c;
            boolean J = aVar2.J(izsVar) | aVar2.y(tmdVar);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new rqz(izsVar, tmdVar);
                aVar2.R(x);
            }
            qqz.h(0, aVar2, str, str2, str3, (gzs) x, txj0.v(ksy.c(ksyVar2, q630.a.a, 2), 72));
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
