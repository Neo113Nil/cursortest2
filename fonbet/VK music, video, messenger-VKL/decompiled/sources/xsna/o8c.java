package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class o8c implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ l22 c;

    public o8c(wow wowVar, l22 l22Var) {
        this.b = wowVar;
        this.c = l22Var;
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
            n4c n4cVar = (n4c) this.b.b.get(intValue);
            aVar2.K(96941088);
            l22 l22Var = this.c;
            boolean J = aVar2.J(l22Var) | aVar2.J(n4cVar);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new m8c(l22Var, n4cVar);
                aVar2.R(x);
            }
            p8c.a(n4cVar, (gzs) x, q630.a.a, aVar2, 384);
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
