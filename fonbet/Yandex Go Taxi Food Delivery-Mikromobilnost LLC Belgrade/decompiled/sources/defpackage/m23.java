package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class m23 implements o23 {
    public final IntentArgs a;

    public m23(IntentArgs intentArgs) {
        this.a = intentArgs;
    }

    public final IntentArgs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m23) && this.a.equals(((m23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentForm(args=" + this.a + Extension.C_BRAKE;
    }
}
