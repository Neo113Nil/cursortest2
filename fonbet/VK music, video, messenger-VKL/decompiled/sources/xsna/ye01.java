package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ye01 implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bf01 c;

    public ye01(bf01 bf01Var, boolean z) {
        this.c = bf01Var;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (r1 != r3) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean b = ((mb01) this.c.b).b();
        mb01 mb01Var = (mb01) this.c.b;
        boolean z = false;
        boolean z2 = mb01Var.B != null && mb01Var.B.booleanValue();
        ((mb01) this.c.b).B = Boolean.valueOf(this.b);
        if (z2 == this.b) {
            k901 k901Var = ((mb01) this.c.b).j;
            mb01.k(k901Var);
            k901Var.q.b(Boolean.valueOf(this.b), "Default data collection state already set to");
        }
        if (((mb01) this.c.b).b() != b) {
            boolean b2 = ((mb01) this.c.b).b();
            mb01 mb01Var2 = (mb01) this.c.b;
            if (mb01Var2.B != null && mb01Var2.B.booleanValue()) {
                z = true;
            }
        }
        k901 k901Var2 = ((mb01) this.c.b).j;
        mb01.k(k901Var2);
        k901Var2.n.c("Default data collection is different than actual status", Boolean.valueOf(this.b), Boolean.valueOf(b));
        this.c.C();
    }
}
