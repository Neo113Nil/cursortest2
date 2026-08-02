package xsna;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class r47 implements Runnable {
    public final /* synthetic */ q47 b;

    public r47(q47 q47Var) {
        this.b = q47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o57 o57Var = this.b.i;
        if (o57Var.c == null) {
            o57Var.c = new n57();
        }
        o57Var.c.b();
    }
}
