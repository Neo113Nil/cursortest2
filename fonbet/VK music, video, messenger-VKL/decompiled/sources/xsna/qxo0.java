package xsna;

/* compiled from: Timer.java */
/* loaded from: classes7.dex */
public final class qxo0 {
    public final Runnable a;
    public final long b;
    public final ju4 c = new ju4(new a());

    /* compiled from: Timer.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            qxo0 qxo0Var = qxo0.this;
            long j = qxo0Var.b;
            if (j > 0) {
                qxo0Var.c.b(j);
            }
            qxo0Var.a.run();
        }
    }

    public qxo0(long j, Runnable runnable) {
        this.a = runnable;
        this.b = j;
    }
}
