package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class je01 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ bf01 c;

    public je01(bf01 bf01Var, long j) {
        this.c = bf01Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf01 bf01Var = this.c;
        x901 x901Var = ((mb01) bf01Var.b).i;
        mb01.i(x901Var);
        u901 u901Var = x901Var.m;
        long j = this.b;
        u901Var.b(j);
        k901 k901Var = ((mb01) bf01Var.b).j;
        mb01.k(k901Var);
        k901Var.p.b(Long.valueOf(j), "Session timeout duration set");
    }
}
