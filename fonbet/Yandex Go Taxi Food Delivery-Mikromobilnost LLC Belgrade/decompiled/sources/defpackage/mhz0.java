package defpackage;

/* loaded from: classes12.dex */
public final class mhz0 implements lhz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ mhz0(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.lhz0
    public final void A(int i) {
        int i2 = this.a;
        h55 h55Var = this.b;
        switch (i2) {
            case 0:
                ((c2n0) h55Var).r(new ii8(i, 21));
                break;
            default:
                xx70 xx70Var = (xx70) h55Var;
                xx70Var.r(new qu(9));
                ((pxy0) xx70Var.F).invoke(Integer.valueOf(i));
                break;
        }
    }

    @Override // defpackage.lhz0, defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((c2n0) h55Var).r(new qu(9));
                break;
            default:
                ((xx70) h55Var).r(new qu(9));
                break;
        }
    }
}
