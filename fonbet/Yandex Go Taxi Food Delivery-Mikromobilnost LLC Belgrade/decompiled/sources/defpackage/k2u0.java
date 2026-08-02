package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class k2u0 extends a {
    public final ISecurityController f;
    public final IMetadataController g;

    public k2u0(IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter, ISecurityController iSecurityController, IMetadataController iMetadataController) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iSecurityController;
        this.g = iMetadataController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        Object verify = this.f.verify(continuation);
        return verify == CoroutineSingletons.COROUTINE_SUSPENDED ? verify : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        this.a.gotoProcessing();
        this.g.startLocationTracker();
    }
}
