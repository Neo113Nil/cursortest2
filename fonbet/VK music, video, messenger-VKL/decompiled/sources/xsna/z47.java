package xsna;

import xsna.e57;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class z47 implements Runnable {
    public final /* synthetic */ e57.b b;
    public final /* synthetic */ q47 c;

    public z47(q47 q47Var, e57.b bVar) {
        this.c = q47Var;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o57 o57Var = this.c.i;
        if (o57Var.c == null) {
            o57Var.c = new n57();
        }
        o57Var.c.c(this.b);
    }
}
