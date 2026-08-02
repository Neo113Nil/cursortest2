package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class gi01 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ fj01 c;

    public gi01(fj01 fj01Var, long j) {
        this.c = fj01Var;
        this.b = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r1.t.b() != false) goto L6;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fj01 fj01Var = this.c;
        fj01Var.k();
        fj01Var.o();
        mb01 mb01Var = (mb01) fj01Var.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        i901 i901Var = k901Var.q;
        long j = this.b;
        i901Var.b(Long.valueOf(j), "Activity resumed, time");
        if (!mb01Var.h.v()) {
            x901 x901Var = mb01Var.i;
            mb01.i(x901Var);
        }
        dj01 dj01Var = fj01Var.h;
        dj01Var.d.k();
        dj01Var.c.a();
        dj01Var.a = j;
        dj01Var.b = j;
        rd50 rd50Var = fj01Var.i;
        fj01 fj01Var2 = (fj01) rd50Var.c;
        fj01Var2.k();
        ji01 ji01Var = (ji01) rd50Var.b;
        if (ji01Var != null) {
            fj01Var2.f.removeCallbacks(ji01Var);
        }
        x901 x901Var2 = ((mb01) fj01Var2.b).i;
        mb01.i(x901Var2);
        x901Var2.t.a(false);
        ej01 ej01Var = fj01Var.g;
        fj01 fj01Var3 = ej01Var.a;
        mb01 mb01Var2 = (mb01) fj01Var3.b;
        fj01Var3.k();
        if (mb01Var2.b()) {
            mb01Var2.o.getClass();
            ej01Var.b(System.currentTimeMillis(), false);
        }
    }
}
