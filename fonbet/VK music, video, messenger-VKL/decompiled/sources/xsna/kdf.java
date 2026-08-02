package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.upload.ui.impl.compose.views.island.IslandPart;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class kdf implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ adk c;
    public final /* synthetic */ long d;
    public final /* synthetic */ izs e;

    public kdf(wow wowVar, adk adkVar, long j, izs izsVar) {
        this.b = wowVar;
        this.c = adkVar;
        this.d = j;
        this.e = izsVar;
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
            pgf pgfVar = (pgf) this.b.b.get(intValue);
            aVar2.K(-716346909);
            q630 a = dtx.a(q630.a.a, intValue == e43.h(new wow(this.c.b)) ? IslandPart.Bottom : IslandPart.Middle, this.d);
            if (pgfVar instanceof zdd) {
                aVar2.K(946732442);
                ((zdd) pgfVar).b.invoke(a, aVar2, 0);
                aVar2.j();
            } else {
                if (!(pgfVar instanceof hze)) {
                    throw alb0.c(946731482, aVar2);
                }
                aVar2.K(-715971593);
                hze hzeVar = (hze) pgfVar;
                izs izsVar = this.e;
                boolean J = aVar2.J(izsVar);
                Object x = aVar2.x();
                Object obj = a.C0011a.a;
                if (J || x == obj) {
                    x = new bdf(izsVar);
                    aVar2.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean J2 = aVar2.J(izsVar);
                Object x2 = aVar2.x();
                if (J2 || x2 == obj) {
                    x2 = new cdf(izsVar);
                    aVar2.R(x2);
                }
                izs izsVar3 = (izs) x2;
                boolean J3 = aVar2.J(izsVar);
                Object x3 = aVar2.x();
                if (J3 || x3 == obj) {
                    x3 = new ddf(izsVar);
                    aVar2.R(x3);
                }
                wzs wzsVar = (wzs) x3;
                boolean J4 = aVar2.J(izsVar);
                Object x4 = aVar2.x();
                if (J4 || x4 == obj) {
                    x4 = new edf(izsVar);
                    aVar2.R(x4);
                }
                wzs wzsVar2 = (wzs) x4;
                boolean J5 = aVar2.J(izsVar);
                Object x5 = aVar2.x();
                if (J5 || x5 == obj) {
                    x5 = new fdf(izsVar);
                    aVar2.R(x5);
                }
                izs izsVar4 = (izs) x5;
                boolean J6 = aVar2.J(izsVar);
                Object x6 = aVar2.x();
                if (J6 || x6 == obj) {
                    x6 = new gdf(izsVar);
                    aVar2.R(x6);
                }
                izs izsVar5 = (izs) x6;
                boolean J7 = aVar2.J(izsVar);
                Object x7 = aVar2.x();
                if (J7 || x7 == obj) {
                    x7 = new hdf(izsVar);
                    aVar2.R(x7);
                }
                jaq0.c(hzeVar, izsVar2, izsVar3, a, wzsVar, wzsVar2, izsVar4, izsVar5, (izs) x7, aVar2, 0);
                aVar2.j();
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
