package xsna;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class lr01 implements Runnable {
    public final /* synthetic */ gtz0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bs01 e;

    public lr01(bs01 bs01Var, gtz0 gtz0Var, int i, int i2) {
        this.e = bs01Var;
        this.b = gtz0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gtz0 gtz0Var = this.b;
        this.e.d(new gtz0(gtz0Var.a, this.c, this.d, gtz0Var.d, gtz0Var.e, gtz0Var.f, gtz0Var.g, gtz0Var.h, gtz0Var.i));
    }
}
