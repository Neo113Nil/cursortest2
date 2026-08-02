package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import xsna.dcr;
import xsna.g6n0;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class agr implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public /* synthetic */ agr(int i, Object obj, List list) {
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
                Object obj5 = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.d;
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(obj5) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    Object obj6 = (dcr) this.c.get(intValue);
                    aVar.K(-1372510307);
                    if (obj6 instanceof dcr.b) {
                        aVar.K(-1372464800);
                        bgr.e(((dcr.b) obj6).b, null, aVar, 0);
                        aVar.j();
                    } else {
                        if (!(obj6 instanceof dcr.a)) {
                            throw alb0.c(94272806, aVar);
                        }
                        aVar.K(-1372353014);
                        dcr.a aVar2 = (dcr.a) obj6;
                        String str = aVar2.a;
                        boolean z = aVar2.b;
                        q630 E = ahn.E(q630.a.a, "delivery_points_filters_list_option_item");
                        boolean J = aVar.J(snapshotStateList) | aVar.J(obj6);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new xfr(snapshotStateList, (dcr.a) obj6);
                            aVar.R(x);
                        }
                        bgr.b(384, aVar, str, (gzs) x, E, z);
                        aVar.j();
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ksy ksyVar = (ksy) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                izs izsVar = (izs) this.d;
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar3.J(ksyVar) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar3.o(intValue3) ? 32 : 16;
                }
                if (aVar3.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    g6n0 g6n0Var = (g6n0) this.c.get(intValue3);
                    aVar3.K(-1788415270);
                    if (g6n0Var instanceof g6n0.a) {
                        aVar3.K(219405463);
                        pmh0.a((g6n0.a) g6n0Var, izsVar, aVar3, 0);
                        aVar3.j();
                    } else {
                        if (g6n0Var instanceof g6n0.b) {
                            aVar3.K(219407865);
                            pmh0.b((g6n0.b) g6n0Var, izsVar, aVar3, 0);
                        } else {
                            aVar3.K(-1790140762);
                        }
                        aVar3.j();
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
