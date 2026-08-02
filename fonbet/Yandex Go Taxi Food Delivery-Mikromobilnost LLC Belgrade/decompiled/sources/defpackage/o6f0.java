package defpackage;

import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.EMPTY;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class o6f0 extends a {
    public final IVerificationSessionController f;

    public o6f0(IVerificationFlow iVerificationFlow, IVerificationSessionController iVerificationSessionController, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iVerificationSessionController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        try {
            this.f.successfulVerification();
            d(EMPTY.INSTANCE);
        } catch (Exception e) {
            c(e);
        }
    }
}
