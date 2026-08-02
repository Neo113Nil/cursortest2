package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class bxy extends a {
    public final IInstructionsController f;

    public bxy(IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter, IInstructionsController iInstructionsController) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iInstructionsController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        Object updateInstructionsMetadata = this.f.updateInstructionsMetadata(continuation);
        return updateInstructionsMetadata == CoroutineSingletons.COROUTINE_SUSPENDED ? updateInstructionsMetadata : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        this.a.gotoProcessing();
    }
}
