package xsna;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class ylz0 {
    public final xlz0 a;

    public ylz0(xlz0 xlz0Var) {
        this.a = xlz0Var;
    }

    public abstract void a();

    public final void b(amz0 amz0Var) {
        amz0Var.a.lock();
        try {
            if (amz0Var.m == this.a) {
                a();
            }
        } finally {
            amz0Var.a.unlock();
        }
    }
}
