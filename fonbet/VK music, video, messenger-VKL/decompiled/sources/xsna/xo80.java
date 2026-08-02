package xsna;

/* compiled from: OnlineBookingBottomSheet.kt */
/* loaded from: classes16.dex */
public final class xo80 implements fcn {
    public final /* synthetic */ int b;
    public final /* synthetic */ dw20 c;

    public /* synthetic */ xo80(dw20 dw20Var, int i) {
        this.b = i;
        this.c = dw20Var;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        switch (this.b) {
        }
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        switch (this.b) {
        }
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        switch (this.b) {
            case 0:
                wo80 wo80Var = (wo80) this.c;
                if (!wo80Var.N0 || wo80Var.g1) {
                    wo80Var.g1 = true;
                    wo80Var.hide();
                    break;
                }
                break;
            default:
                this.c.tn();
                break;
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        switch (this.b) {
            case 0:
                b(false);
                break;
            default:
                b(false);
                break;
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        switch (this.b) {
        }
        return false;
    }
}
