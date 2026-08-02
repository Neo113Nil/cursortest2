package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.domain.model.ContactPolicyType;

/* loaded from: classes5.dex */
public final class jbe {
    public final ContactPolicyType a;
    public final int b;

    public jbe(ContactPolicyType contactPolicyType, int i) {
        this.a = contactPolicyType;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbe)) {
            return false;
        }
        jbe jbeVar = (jbe) obj;
        return this.a == jbeVar.a && this.b == jbeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContactPolicy(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
