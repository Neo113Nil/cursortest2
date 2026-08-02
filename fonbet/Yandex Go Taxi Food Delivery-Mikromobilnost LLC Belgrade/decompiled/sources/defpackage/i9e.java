package defpackage;

import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.IConsumerController;
import ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.a;
import ru.rt.ebs.cryptosdk.core.verification.consumer.entities.exceptions.ConsumerVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;

/* loaded from: classes4.dex */
public final class i9e implements IConsumerController {
    public final m9e a;
    public final IVerificationSessionController b;
    public final ISdkDispatchers c;

    public i9e(m9e m9eVar, IVerificationSessionController iVerificationSessionController, ISdkDispatchers iSdkDispatchers) {
        this.a = m9eVar;
        this.b = iVerificationSessionController;
        this.c = iSdkDispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.IConsumerController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verifyResSecret(Continuation continuation) {
        a aVar;
        int i;
        try {
            try {
                try {
                    if (continuation instanceof a) {
                        aVar = (a) continuation;
                        int i2 = aVar.d;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            aVar.d = i2 - Integer.MIN_VALUE;
                            Object obj = aVar.b;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = aVar.d;
                            if (i != 0) {
                                b.b(obj);
                                jse io2 = this.c.io();
                                ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.b bVar = new ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.b(this, null);
                                aVar.a = this;
                                aVar.d = 1;
                                if (tje.k0(io2, bVar, aVar) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                this = aVar.a;
                                b.b(obj);
                            }
                            this.getClass();
                            this.b.removeResSecret();
                            return zy11.a;
                        }
                    }
                    this.b.removeResSecret();
                    return zy11.a;
                } catch (Exception e) {
                    throw new ConsumerVerificationEbsException(e);
                }
                if (i != 0) {
                }
                this.getClass();
            } catch (Exception e2) {
                throw new ConsumerVerificationEbsException(e2);
            }
        } catch (Throwable th) {
            this.getClass();
            try {
                this.b.removeResSecret();
                throw th;
            } catch (Exception e3) {
                throw new ConsumerVerificationEbsException(e3);
            }
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.d;
    }
}
