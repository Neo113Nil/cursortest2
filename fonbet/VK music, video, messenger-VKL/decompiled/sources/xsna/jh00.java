package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.pg00;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class jh00 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ kh00 d;

    public jh00(wow wowVar, izs izsVar, kh00 kh00Var) {
        this.b = wowVar;
        this.c = izsVar;
        this.d = kh00Var;
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
            pg00 pg00Var = (pg00) this.b.b.get(intValue);
            aVar2.K(-496718722);
            boolean f = epx.f(pg00Var, pg00.a.a);
            izs<? super qg00, s3q0> izsVar = this.c;
            if (f) {
                aVar2.K(1785094297);
                String N = d370.N(R.string.manage_communities_include_community, 0, aVar2);
                String N2 = d370.N(R.string.manage_communities_include_community, 0, aVar2);
                boolean J = aVar2.J(izsVar);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new hh00(izsVar);
                    aVar2.R(x);
                }
                cl0.a(3072, aVar2, N, N2, (gzs) x, q630.a.a);
                aVar2.j();
            } else {
                boolean z = pg00Var instanceof pg00.b;
                kh00 kh00Var = this.d;
                if (z) {
                    aVar2.K(1785109083);
                    kh00Var.i((pg00.b) pg00Var, izsVar, aVar2, 512);
                    aVar2.j();
                } else {
                    if (!epx.f(pg00Var, pg00.c.a)) {
                        throw alb0.c(1785092133, aVar2);
                    }
                    aVar2.K(1785111796);
                    kh00Var.k(8, aVar2);
                    aVar2.j();
                }
            }
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
