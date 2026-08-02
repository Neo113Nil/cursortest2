package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class eid implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ ldf c;
    public final /* synthetic */ izs d;

    public eid(wow wowVar, ldf ldfVar, izs izsVar) {
        this.b = wowVar;
        this.c = ldfVar;
        this.d = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        boolean z;
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
        boolean z2 = false;
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ub5 ub5Var = (ub5) this.b.b.get(intValue);
            aVar2.K(-1473511067);
            ldf ldfVar = this.c;
            if (ldfVar.c == ub5Var.a) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            int i2 = ldfVar.e;
            izs izsVar = this.d;
            boolean J = aVar2.J(izsVar) | aVar2.J(ub5Var);
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new aid(izsVar, ub5Var);
                aVar2.R(x);
            }
            gzs gzsVar = (gzs) x;
            if ((((i & 112) ^ 48) > 32 && aVar2.o(intValue)) || (i & 48) == 32) {
                z = true;
            }
            Object x2 = aVar2.x();
            if (z || x2 == c0012a) {
                x2 = new bid(intValue);
                aVar2.R(x2);
            }
            fid.b(ub5Var, z2, i2, gzsVar, egi0.b(q630.a.a, true, (izs) x2), aVar2, 0);
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
