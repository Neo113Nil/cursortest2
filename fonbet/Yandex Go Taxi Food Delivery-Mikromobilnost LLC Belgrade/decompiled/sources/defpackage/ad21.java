package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class ad21 extends a {
    public final IEbsController f;
    public final IVerificationSessionController g;

    public ad21(IEbsController iEbsController, IVerificationSessionController iVerificationSessionController, IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iEbsController;
        this.g = iVerificationSessionController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        Object uploadPhoto = this.f.uploadPhoto(this.g.getEbsLocation().toString(), continuation);
        return uploadPhoto == CoroutineSingletons.COROUTINE_SUSPENDED ? uploadPhoto : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        b();
    }
}
