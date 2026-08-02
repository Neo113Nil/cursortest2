package defpackage;

import com.yandex.go.taxi.order.search.ui.search_views.d;

/* loaded from: classes6.dex */
public final class ptp0 extends yx01 {
    public final /* synthetic */ int f;
    public final /* synthetic */ qtp0 g;

    public /* synthetic */ ptp0(qtp0 qtp0Var, int i) {
        this.f = i;
        this.g = qtp0Var;
    }

    @Override // defpackage.yx01
    public final void c() {
        int i = this.f;
        qtp0 qtp0Var = this.g;
        switch (i) {
            case 0:
                d dVar = qtp0Var.w;
                dVar.M1(false);
                dVar.B0(1.0f);
                ndl0 ndl0Var = qtp0Var.b;
                ((i2f) ndl0Var.b).setVisible(false);
                ((i2f) ndl0Var.b).Hg(1.0f);
                super.c();
                break;
            default:
                d dVar2 = qtp0Var.w;
                dVar2.B0(1.0f);
                dVar2.M1(true);
                ndl0 ndl0Var2 = qtp0Var.b;
                ((i2f) ndl0Var2.b).Hg(1.0f);
                ((i2f) ndl0Var2.b).setVisible(true);
                super.c();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void d() {
        int i = this.f;
        qtp0 qtp0Var = this.g;
        switch (i) {
            case 0:
                qtp0Var.x.a(qtp0Var.a);
                super.d();
                break;
            default:
                qtp0Var.detach();
                super.d();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void e() {
        int i = this.f;
        qtp0 qtp0Var = this.g;
        switch (i) {
            case 0:
                qtp0Var.attach();
                d dVar = qtp0Var.w;
                dVar.B0(0.0f);
                dVar.M1(true);
                ndl0 ndl0Var = qtp0Var.b;
                ((i2f) ndl0Var.b).Hg(0.0f);
                ((i2f) ndl0Var.b).setVisible(true);
                super.e();
                break;
            default:
                qtp0Var.x.b(true);
                super.e();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void f(float f) {
        int i = this.f;
        qtp0 qtp0Var = this.g;
        switch (i) {
            case 0:
                qtp0Var.w.B0(f);
                ((i2f) qtp0Var.b.b).Hg(f);
                break;
            default:
                float f2 = 1.0f - f;
                qtp0Var.w.B0(f2);
                ((i2f) qtp0Var.b.b).Hg(f2);
                break;
        }
    }
}
