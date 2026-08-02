package yads;

/* loaded from: classes10.dex */
public final class qo2 implements Runnable {
    public final g82 b;
    public final vo2 c;

    public qo2(g82 g82Var, vo2 vo2Var) {
        this.b = g82Var;
        this.c = vo2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.setVisibility(4);
        this.c.a.setVisibility(0);
    }
}
