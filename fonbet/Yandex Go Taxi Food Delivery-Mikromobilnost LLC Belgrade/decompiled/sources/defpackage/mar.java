package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class mar extends a {
    public final IAdapterController f;

    public mar(IAdapterController iAdapterController, IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iAdapterController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        Object finishVerification = this.f.finishVerification(continuation);
        return finishVerification == CoroutineSingletons.COROUTINE_SUSPENDED ? finishVerification : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        b();
    }
}
