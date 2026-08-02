package defpackage;

import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.exceptions.EbsVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.VerificationAttemptsExceededEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class k731 extends a {
    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        EbsVerificationEbsException ebsVerificationEbsException = (EbsVerificationEbsException) obj;
        this.a.gotoVerificationAttemptsExceededError(new VerificationAttemptsExceededEbsException(ebsVerificationEbsException.getErrorCode(), ebsVerificationEbsException.getErrorMessage()));
    }
}
