package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes6.dex */
public final class fgq0 extends x3 {
    public final /* synthetic */ int c = 0;
    public final int w;

    public fgq0(w4l0 w4l0Var) {
        super(14, w4l0Var);
        this.w = w4l0Var.e().size();
    }

    @Override // defpackage.igq0
    public final void I(Address address) {
        int i = this.c;
        Object obj = this.b;
        int i2 = this.w;
        switch (i) {
            case 0:
                ((w4l0) obj).a(i2, address);
                break;
            default:
                w4l0 w4l0Var = (w4l0) obj;
                if (i2 < w4l0Var.e().size()) {
                    w4l0Var.l(i2, address);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.igq0
    public void cancel() {
        switch (this.c) {
            case 0:
                w4l0 w4l0Var = (w4l0) this.b;
                int size = w4l0Var.e().size();
                int i = this.w;
                if (i < size) {
                    w4l0Var.m(i);
                    break;
                }
                break;
        }
    }

    public fgq0(w4l0 w4l0Var, int i) {
        super(14, w4l0Var);
        this.w = i;
    }
}
