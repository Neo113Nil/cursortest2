package defpackage;

/* loaded from: classes14.dex */
public final class mkg0 extends yx01 {
    public final /* synthetic */ int f;
    public final /* synthetic */ nkg0 g;

    public /* synthetic */ mkg0(nkg0 nkg0Var, int i) {
        this.f = i;
        this.g = nkg0Var;
    }

    @Override // defpackage.yx01
    public final int b() {
        switch (this.f) {
        }
        return 200;
    }

    @Override // defpackage.yx01
    public final void d() {
        int i = this.f;
        nkg0 nkg0Var = this.g;
        switch (i) {
            case 0:
                nkg0Var.resume();
                super.d();
                break;
            default:
                nkg0Var.detach();
                super.d();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void e() {
        int i = this.f;
        nkg0 nkg0Var = this.g;
        switch (i) {
            case 0:
                nkg0Var.attach();
                super.e();
                break;
            default:
                nkg0Var.pause();
                super.e();
                break;
        }
    }
}
