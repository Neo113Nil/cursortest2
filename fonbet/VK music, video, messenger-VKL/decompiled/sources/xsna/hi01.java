package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class hi01 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ fj01 c;

    public hi01(fj01 fj01Var, long j) {
        this.c = fj01Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fj01 fj01Var = this.c;
        fj01Var.k();
        fj01Var.o();
        mb01 mb01Var = (mb01) fj01Var.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        i901 i901Var = k901Var.q;
        long j = this.b;
        i901Var.b(Long.valueOf(j), "Activity paused, time");
        rd50 rd50Var = fj01Var.i;
        fj01 fj01Var2 = (fj01) rd50Var.c;
        ((mb01) fj01Var2.b).o.getClass();
        ji01 ji01Var = new ji01(rd50Var, System.currentTimeMillis(), j);
        rd50Var.b = ji01Var;
        fj01Var2.f.postDelayed(ji01Var, 2000L);
        if (mb01Var.h.v()) {
            fj01Var.h.c.a();
        }
    }
}
