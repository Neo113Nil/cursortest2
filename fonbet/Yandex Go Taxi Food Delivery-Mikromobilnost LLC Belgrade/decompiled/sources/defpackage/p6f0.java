package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.presentation.processing.c;

/* loaded from: classes4.dex */
public final class p6f0 extends vc5 {
    public final IFlowController E;

    public p6f0(IVerificationFlowController iVerificationFlowController) {
        super(iVerificationFlowController);
        this.E = iVerificationFlowController;
        tje.N(ds31.a(this), null, null, new c(this, null), 3);
    }

    @Override // defpackage.vc5
    public final tt11 Y() {
        return new n6f0((Object) null);
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        if (ys11Var instanceof g6f0) {
            Z().emit(new Event.Process(null, 1, null));
        } else {
            super.d0(ys11Var);
        }
    }
}
