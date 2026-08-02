package xsna;

import androidx.compose.runtime.a;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class q6l implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ wh50 c;
    public final /* synthetic */ wh50 d;
    public final /* synthetic */ rh00 e;

    public q6l(wow wowVar, wh50 wh50Var, wh50 wh50Var2, rh00 rh00Var) {
        this.b = wowVar;
        this.c = wh50Var;
        this.d = wh50Var2;
        this.e = rh00Var;
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
            uu20 uu20Var = (uu20) this.b.b.get(intValue);
            aVar2.K(1394085116);
            wh50 wh50Var = this.c;
            int i2 = (i & 112) ^ 48;
            boolean J = aVar2.J(wh50Var) | ((i2 > 32 && aVar2.o(intValue)) || (i & 48) == 32);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new m6l(intValue, wh50Var);
                aVar2.R(x);
            }
            izs izsVar = (izs) x;
            wh50 wh50Var2 = this.d;
            boolean J2 = aVar2.J(wh50Var2) | ((i2 > 32 && aVar2.o(intValue)) || (i & 48) == 32);
            rh00 rh00Var = this.e;
            boolean y = J2 | aVar2.y(rh00Var);
            Object x2 = aVar2.x();
            if (y || x2 == obj) {
                x2 = new n6l(intValue, rh00Var, wh50Var2);
                aVar2.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean J3 = aVar2.J(wh50Var) | ((i2 > 32 && aVar2.o(intValue)) || (i & 48) == 32);
            Object x3 = aVar2.x();
            if (J3 || x3 == obj) {
                x3 = new o6l(intValue, wh50Var);
                aVar2.R(x3);
            }
            r6l.c(uu20Var, izsVar, gzsVar, (gzs) x3, aVar2, 0);
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
