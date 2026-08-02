package xsna;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zpz0 implements Runnable {
    public final /* synthetic */ eqz0 b;

    public zpz0(eqz0 eqz0Var) {
        this.b = eqz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eqz0 eqz0Var = this.b;
        eqz0Var.o.lock();
        try {
            eqz0Var.k();
        } finally {
            eqz0Var.o.unlock();
        }
    }
}
