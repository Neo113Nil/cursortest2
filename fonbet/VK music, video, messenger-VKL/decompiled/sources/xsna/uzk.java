package xsna;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class uzk implements zzs<hi2, efn, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ Long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ izs<Long, s3q0> d;
    public final /* synthetic */ izs<Long, s3q0> e;
    public final /* synthetic */ wz8 f;
    public final /* synthetic */ k9x g;
    public final /* synthetic */ nyk h;
    public final /* synthetic */ eai0 i;
    public final /* synthetic */ vxk j;
    public final /* synthetic */ rwr k;

    /* JADX WARN: Multi-variable type inference failed */
    public uzk(Long l, long j, izs<? super Long, s3q0> izsVar, izs<? super Long, s3q0> izsVar2, wz8 wz8Var, k9x k9xVar, nyk nykVar, eai0 eai0Var, vxk vxkVar, rwr rwrVar) {
        this.b = l;
        this.c = j;
        this.d = izsVar;
        this.e = izsVar2;
        this.f = wz8Var;
        this.g = k9xVar;
        this.h = nykVar;
        this.i = eai0Var;
        this.j = vxkVar;
        this.k = rwrVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(hi2 hi2Var, efn efnVar, androidx.compose.runtime.a aVar, Integer num) {
        int i = efnVar.a;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1838500091, intValue, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1498)");
        }
        if (i == 0) {
            aVar2.K(1567031954);
            lzk.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aVar2, 0);
            aVar2.j();
        } else if (i == 1) {
            aVar2.K(1567050592);
            gxk.a(this.b, this.d, this.f, this.g, this.h, this.i, this.j, this.k, aVar2, 0);
            aVar2.j();
        } else {
            aVar2.K(1334373351);
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return s3q0.a;
    }
}
