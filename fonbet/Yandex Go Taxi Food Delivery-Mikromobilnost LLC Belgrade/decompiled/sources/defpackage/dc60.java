package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.presentation.error.noInternetConnection.b;

/* loaded from: classes4.dex */
public final class dc60 extends vc5 {
    public final IFlowController E;

    public dc60(IVerificationFlowController iVerificationFlowController) {
        super(iVerificationFlowController);
        this.E = iVerificationFlowController;
    }

    @Override // defpackage.vc5
    public final /* bridge */ /* synthetic */ tt11 Y() {
        return xb60.a;
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        if (ys11Var.equals(fz5.c)) {
            tje.N(ds31.a(this), null, null, new b(this, null), 3);
        } else {
            super.d0(ys11Var);
        }
    }
}
