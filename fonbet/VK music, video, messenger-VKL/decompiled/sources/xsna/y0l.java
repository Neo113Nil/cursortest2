package xsna;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class y0l implements yzs<efn, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ Long b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ wzs<Long, Long, s3q0> e;
    public final /* synthetic */ izs<Long, s3q0> f;
    public final /* synthetic */ wz8 g;
    public final /* synthetic */ k9x h;
    public final /* synthetic */ nyk i;
    public final /* synthetic */ eai0 j;
    public final /* synthetic */ vxk k;
    public final /* synthetic */ rwr l;

    /* JADX WARN: Multi-variable type inference failed */
    public y0l(Long l, Long l2, long j, wzs<? super Long, ? super Long, s3q0> wzsVar, izs<? super Long, s3q0> izsVar, wz8 wz8Var, k9x k9xVar, nyk nykVar, eai0 eai0Var, vxk vxkVar, rwr rwrVar) {
        this.b = l;
        this.c = l2;
        this.d = j;
        this.e = wzsVar;
        this.f = izsVar;
        this.g = wz8Var;
        this.h = k9xVar;
        this.i = nykVar;
        this.j = eai0Var;
        this.k = vxkVar;
        this.l = rwrVar;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(efn efnVar, androidx.compose.runtime.a aVar, Integer num) {
        int i = efnVar.a;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= aVar2.o(i) ? 4 : 2;
        }
        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-773828161, intValue, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:721)");
            }
            if (i == 0) {
                aVar2.K(-619517270);
                x0l.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, aVar2, 0);
                aVar2.j();
            } else if (i == 1) {
                aVar2.K(-619495944);
                f0l.a(this.b, this.c, this.e, this.g, this.h, this.i, this.j, this.k, this.l, aVar2, 0);
                aVar2.j();
            } else {
                aVar2.K(-2023979101);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
