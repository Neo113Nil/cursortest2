package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.presentation.error.verification.b;

/* loaded from: classes4.dex */
public final class e831 extends vc5 {
    public final IFlowController E;

    public e831(IVerificationFlowController iVerificationFlowController) {
        super(iVerificationFlowController);
        this.E = iVerificationFlowController;
        tje.N(ds31.a(this), null, null, new b(this, null), 3);
    }

    @Override // defpackage.vc5
    public final /* bridge */ /* synthetic */ tt11 Y() {
        return d831.a;
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        if (ys11Var instanceof b831) {
            this.E.getCurrentFlow().emit(new Event.Error(((b831) ys11Var).a));
        } else {
            super.d0(ys11Var);
        }
    }
}
