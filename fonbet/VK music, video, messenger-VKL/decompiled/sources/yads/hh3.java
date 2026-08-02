package yads;

/* loaded from: classes10.dex */
public final class hh3 implements Runnable {
    public final /* synthetic */ ih3 b;

    public hh3(ih3 ih3Var) {
        this.b = ih3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih3 ih3Var = this.b;
        if (ih3Var.d || !ih3Var.a.a()) {
            this.b.c.postDelayed(this, 200L);
            return;
        }
        ((ch3) this.b.b).a();
        ih3 ih3Var2 = this.b;
        ih3Var2.d = true;
        ih3Var2.c.removeCallbacksAndMessages(null);
        ih3Var2.e = false;
    }
}
