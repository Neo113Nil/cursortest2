package xsna;

import androidx.compose.runtime.a;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class v5l implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ j20 c;
    public final /* synthetic */ wh50 d;
    public final /* synthetic */ wh50 e;

    public v5l(List list, j20 j20Var, wh50 wh50Var, wh50 wh50Var2) {
        this.b = list;
        this.c = j20Var;
        this.d = wh50Var;
        this.e = wh50Var2;
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
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            s8r s8rVar = (s8r) this.b.get(intValue);
            aVar2.K(-945180610);
            boolean J = aVar2.J(s8rVar);
            j20 j20Var = this.c;
            boolean J2 = J | aVar2.J(j20Var);
            Object x = aVar2.x();
            if (J2 || x == a.C0011a.a) {
                x = new s5l(s8rVar, j20Var, this.d, this.e);
                aVar2.R(x);
            }
            w5l.b(s8rVar, (gzs) x, aVar2, 0);
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
