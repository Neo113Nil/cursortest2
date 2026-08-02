package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class aqd implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ t1m c;
    public final /* synthetic */ long d;
    public final /* synthetic */ izs e;

    public aqd(wow wowVar, t1m t1mVar, long j, izs izsVar) {
        this.b = wowVar;
        this.c = t1mVar;
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
            aVar2.K(-1147361307);
            dqd.b(pgfVar, intValue, this.c, this.d, this.e, aVar2, i & 112);
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
