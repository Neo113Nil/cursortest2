package xsna;

/* compiled from: PhotoTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class aca0 implements b780 {
    public final /* synthetic */ bca0 b;

    public aca0(bca0 bca0Var) {
        this.b = bca0Var;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        bca0 bca0Var = this.b;
        bca0Var.r.b(str, th);
        i0q0.f(new l500(bca0Var, 24));
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        bca0 bca0Var = this.b;
        bca0Var.r.t(i, i2, str);
        i0q0.f(new cr20(bca0Var, 18));
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
