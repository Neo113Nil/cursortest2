package xsna;

import androidx.compose.runtime.a;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class ybz implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ wbz c;
    public final /* synthetic */ izs d;

    public ybz(wow wowVar, wbz wbzVar, izs izsVar) {
        this.b = wowVar;
        this.c = wbzVar;
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
        boolean z2 = true;
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            iar0 iar0Var = (iar0) this.b.b.get(intValue);
            aVar2.K(-990706146);
            String str = iar0Var.b;
            boolean z3 = false;
            String str2 = iar0Var.d;
            if (intValue == this.c.b) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            boolean z4 = iar0Var.e;
            izs izsVar = this.d;
            boolean J = aVar2.J(izsVar);
            if ((((i & 112) ^ 48) > 32 && aVar2.o(intValue)) || (i & 48) == 32) {
                z3 = z;
            }
            boolean z5 = J | z3;
            Object x = aVar2.x();
            if (z5 || x == a.C0011a.a) {
                x = new xbz(izsVar, intValue);
                aVar2.R(x);
            }
            zeu0.a(str, str2, z2, z4, (gzs) x, aVar2, 196608);
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
