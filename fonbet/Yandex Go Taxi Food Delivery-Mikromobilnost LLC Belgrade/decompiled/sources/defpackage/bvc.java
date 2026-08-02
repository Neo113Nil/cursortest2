package defpackage;

import com.yandex.go.taxi.order.search.ui.search_views.d;

/* loaded from: classes14.dex */
public final class bvc extends yx01 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cvc g;

    public /* synthetic */ bvc(cvc cvcVar, int i) {
        this.f = i;
        this.g = cvcVar;
    }

    @Override // defpackage.yx01
    public int b() {
        switch (this.f) {
            case 1:
                return 0;
            default:
                return super.b();
        }
    }

    @Override // defpackage.yx01
    public final void c() {
        int i = this.f;
        cvc cvcVar = this.g;
        switch (i) {
            case 0:
                d dVar = cvcVar.w;
                dVar.M1(false);
                dVar.B0(1.0f);
                super.c();
                break;
            default:
                d dVar2 = cvcVar.w;
                dVar2.B0(1.0f);
                dVar2.M1(true);
                super.c();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void d() {
        int i = this.f;
        cvc cvcVar = this.g;
        switch (i) {
            case 0:
                d dVar = cvcVar.w;
                dVar.M1(true);
                dVar.B0(1.0f);
                super.d();
                break;
            default:
                ndl0 ndl0Var = cvcVar.y;
                ((i2f) ndl0Var.b).Hg(0.0f);
                ((i2f) ndl0Var.b).setVisible(false);
                cvcVar.detach();
                super.d();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void e() {
        int i = this.f;
        cvc cvcVar = this.g;
        switch (i) {
            case 0:
                cvcVar.attach();
                cvcVar.resume();
                ndl0 ndl0Var = cvcVar.y;
                ((i2f) ndl0Var.b).setVisible(true);
                ((i2f) ndl0Var.b).Hg(1.0f);
                d dVar = cvcVar.w;
                dVar.M1(true);
                dVar.B0(0.0f);
                super.e();
                break;
            default:
                cvcVar.pause();
                d dVar2 = cvcVar.w;
                dVar2.B0(1.0f);
                dVar2.M1(true);
                super.e();
                break;
        }
    }

    @Override // defpackage.yx01
    public void f(float f) {
        switch (this.f) {
            case 0:
                this.g.w.B0(f);
                break;
        }
    }
}
