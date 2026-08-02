package defpackage;

/* loaded from: classes6.dex */
public final class eev0 implements f9e0 {
    public final pzm0 a;
    public final dev0 b;

    public eev0(pzm0 pzm0Var, dev0 dev0Var) {
        this.a = pzm0Var;
        this.b = dev0Var;
    }

    @Override // defpackage.f9e0
    public final void c(d8e0 d8e0Var) {
        if (d8e0Var instanceof u7e0) {
            pzm0 pzm0Var = this.a;
            ((oy80) pzm0Var.y).o("SummaryTariffCardPromo.ButtonTapped");
            ((e8e0) pzm0Var.Dg()).close();
        }
    }

    @Override // defpackage.f9e0
    public final void onAttachedToWindow() {
        pzm0 pzm0Var = this.a;
        ((oy80) pzm0Var.y).o("SummaryTariffCardPromo.Appeared");
        pzm0Var.Bg(this.b);
    }

    @Override // defpackage.f9e0
    public final void onBackPressed() {
        ((oy80) this.a.y).o("SummaryTariffCardPromo.Disappeared");
    }

    @Override // defpackage.f9e0
    public final void onDetachedFromWindow() {
        this.a.Cg();
    }
}
