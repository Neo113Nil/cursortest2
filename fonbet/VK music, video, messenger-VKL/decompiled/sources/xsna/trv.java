package xsna;

import java.util.List;
import kotlin.Pair;

/* compiled from: LazyStaggeredGridDsl.kt */
/* loaded from: classes18.dex */
public final class trv implements zzs<xwy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;

    public trv(List list) {
        this.b = list;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(xwy xwyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        xwy xwyVar2 = xwyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(xwyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-334987442, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:400)");
            }
            Pair pair = (Pair) this.b.get(intValue);
            aVar2.K(-26383768);
            upv.a(64, aVar2, (String) pair.d(), null, (lg90) pair.g());
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
