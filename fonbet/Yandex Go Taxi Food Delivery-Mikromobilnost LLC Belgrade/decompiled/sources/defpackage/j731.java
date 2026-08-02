package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.VerificationAttemptsExceededEbsException;

/* loaded from: classes4.dex */
public final class j731 implements ys11 {
    public final VerificationAttemptsExceededEbsException a;

    public j731(VerificationAttemptsExceededEbsException verificationAttemptsExceededEbsException) {
        this.a = verificationAttemptsExceededEbsException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j731) && jl40.l(this.a, ((j731) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReturnEvent(error=" + this.a + Extension.C_BRAKE;
    }
}
