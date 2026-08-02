package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalTypeSetterVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class pc21 extends a {
    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        if (!(obj instanceof Exception)) {
            throw new IllegalTypeSetterVerificationFlowEbsException(this, obj.getClass().getName());
        }
        this.a.gotoVerificationError((Exception) obj);
    }
}
