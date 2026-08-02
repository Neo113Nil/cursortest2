package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.abr0;
import xsna.n7r0;

/* compiled from: SakCaptchaHandlerImpl.kt */
/* loaded from: classes15.dex */
public final class yzg0 implements bbr0 {
    public final /* synthetic */ xzg0 a;

    public yzg0(xzg0 xzg0Var) {
        this.a = xzg0Var;
    }

    @Override // xsna.bbr0
    public final void a(abr0 abr0Var) {
        boolean z = abr0Var instanceof abr0.b;
        xzg0 xzg0Var = this.a;
        if (z) {
            xzg0Var.c = new n7r0.c(((abr0.b) abr0Var).a, false, false, true);
            yhr0.b();
        } else {
            if (!(abr0Var instanceof abr0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            xzg0Var.c = new n7r0.c(null, false, false, true);
            yhr0.b();
        }
    }
}
