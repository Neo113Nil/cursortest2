package defpackage;

/* loaded from: classes11.dex */
public final class evb1 implements Runnable {
    public final /* synthetic */ k391 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tvb1 w;

    public evb1(tvb1 tvb1Var, k391 k391Var, int i, int i2) {
        this.w = tvb1Var;
        this.a = k391Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k391 k391Var = this.a;
        this.w.c(new k391(k391Var.a, this.b, this.c, k391Var.d, k391Var.e, k391Var.f, k391Var.g, k391Var.h, k391Var.i));
    }
}
