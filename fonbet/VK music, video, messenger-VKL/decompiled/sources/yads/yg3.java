package yads;

/* loaded from: classes10.dex */
public final class yg3 implements Runnable {
    public final /* synthetic */ zg3 b;

    public yg3(zg3 zg3Var) {
        this.b = zg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long adPosition = this.b.a.getAdPosition();
        this.b.b.a(this.b.a.b(), adPosition);
        zg3 zg3Var = this.b;
        if (zg3Var.d) {
            zg3Var.c.postDelayed(this, 200L);
        }
    }
}
