package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.FailureReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class l23 implements o23 {
    public final FailureReason a;

    public l23(FailureReason failureReason) {
        this.a = failureReason;
    }

    public final FailureReason a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l23) && this.a == ((l23) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(reason=" + this.a + Extension.C_BRAKE;
    }
}
