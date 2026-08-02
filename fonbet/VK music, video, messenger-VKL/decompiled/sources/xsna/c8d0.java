package xsna;

import java.util.List;
import xsna.i8s0;
import xsna.r7d0;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class c8d0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c8d0(int i, Object obj, List list) {
        this.b = i;
        this.c = list;
        this.d = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                ksy ksyVar = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                d8d0 d8d0Var = (d8d0) this.d;
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(ksyVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    ta10 ta10Var = (ta10) ((wow) this.c).b.get(intValue);
                    aVar.K(-677139238);
                    d8d0Var.w().invoke(new r7d0.f(ta10Var.a.a, intValue));
                    d8d0Var.s(ta10Var, intValue, aVar, i & 112);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ksy ksyVar2 = (ksy) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar2.J(ksyVar2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar2.o(intValue3) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    i8s0.a aVar3 = (i8s0.a) this.c.get(intValue3);
                    aVar2.K(1667025059);
                    ((i8s0) this.d).c(aVar3, kmi.a, aVar2, 48);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
