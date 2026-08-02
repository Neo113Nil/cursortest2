package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes7.dex */
public final class hch0 implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ jdj0 d;

    public hch0(wow wowVar, izs izsVar, jdj0 jdj0Var) {
        this.b = wowVar;
        this.c = izsVar;
        this.d = jdj0Var;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(cry cryVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        cry cryVar2 = cryVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(cryVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        boolean z = true;
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1942245546, i, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
            }
            kfd kfdVar = (kfd) this.b.b.get(intValue);
            aVar2.K(-2107738275);
            q630 d = sua.d(0.5625f, q630.a.a, false);
            if ((((i & 112) ^ 48) <= 32 || !aVar2.o(intValue)) && (i & 48) != 32) {
                z = false;
            }
            Object x = aVar2.x();
            if (z || x == a.C0011a.a) {
                x = new gch0(intValue);
                aVar2.R(x);
            }
            c7d.a(kfdVar, this.c, this.d, egi0.b(d, false, (izs) x), aVar2, 512);
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
