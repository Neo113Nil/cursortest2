package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.presentation.esiaAuth.g;

/* loaded from: classes4.dex */
public final class ebo extends vc5 {
    public final IFlowController E;
    public final IEsiaController F;
    public final dbo G;

    public ebo(IVerificationFlowController iVerificationFlowController, IEsiaController iEsiaController) {
        super(iVerificationFlowController);
        this.E = iVerificationFlowController;
        this.F = iEsiaController;
        this.G = new dbo(this);
    }

    @Override // defpackage.vc5
    public final tt11 Y() {
        return new cbo(zt41.b, b0());
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        if (ys11Var instanceof yao) {
            cbo a = cbo.a((cbo) a0(), new ut41(this.G, this.F));
            r0 r0Var = (r0) c0();
            r0Var.getClass();
            r0Var.m(null, a);
            return;
        }
        if (ys11Var instanceof zao) {
            tje.N(ds31.a(this), null, null, new g(this, null), 3);
        } else {
            super.d0(ys11Var);
        }
    }
}
