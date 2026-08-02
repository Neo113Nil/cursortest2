package xsna;

/* compiled from: Executors.kt */
/* loaded from: classes8.dex */
public final class meg0 implements Runnable {
    public final j3q b;
    public final lq9 c;

    public meg0(j3q j3qVar, lq9 lq9Var) {
        this.b = j3qVar;
        this.c = lq9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.A(this.b, s3q0.a);
    }
}
