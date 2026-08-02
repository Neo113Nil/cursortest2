package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class d2k0 extends a {
    public final IEbsController f;
    public final IVerificationSessionController g;

    public d2k0(IEbsController iEbsController, IVerificationSessionController iVerificationSessionController, IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iEbsController;
        this.g = iVerificationSessionController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        IVerificationSessionController iVerificationSessionController = this.g;
        VerificationRequestScheme verificationRequestScheme = iVerificationSessionController.getVerificationRequestScheme();
        String uri = (verificationRequestScheme instanceof VerificationRequestScheme.WithoutEsia ? (VerificationRequestScheme.WithoutEsia) verificationRequestScheme : null) != null ? iVerificationSessionController.getEbsLocation().toString() : null;
        Object initNegotiate = this.f.initNegotiate(uri != null ? cvu0.v(uri, "upload", "negotiate", false) : null, continuation);
        return initNegotiate == CoroutineSingletons.COROUTINE_SUSPENDED ? initNegotiate : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        b();
    }
}
