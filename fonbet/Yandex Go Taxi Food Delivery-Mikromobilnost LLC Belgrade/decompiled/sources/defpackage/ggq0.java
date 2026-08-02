package defpackage;

import com.yandex.go.address.models.Address;
import java.util.List;

/* loaded from: classes6.dex */
public final class ggq0 extends x3 {
    public final List c;

    public ggq0(w4l0 w4l0Var) {
        super(14, w4l0Var);
        this.c = w4l0Var.e();
    }

    @Override // defpackage.igq0
    public final void I(Address address) {
        ((w4l0) this.b).d(address);
    }

    @Override // defpackage.igq0
    public final void cancel() {
        ((w4l0) this.b).c(this.c);
    }
}
