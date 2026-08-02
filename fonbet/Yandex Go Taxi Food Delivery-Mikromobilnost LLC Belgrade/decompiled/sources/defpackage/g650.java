package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g650 implements h650 {
    public final UUID a;
    public final String b;

    public g650(String str, UUID uuid) {
        this.a = uuid;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g650)) {
            return false;
        }
        g650 g650Var = (g650) obj;
        return jl40.l(this.a, g650Var.a) && jl40.l(this.b, g650Var.b);
    }

    public final int hashCode() {
        UUID uuid = this.a;
        int hashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SingleOrder(localUuid=" + this.a + ", trackingUrl=" + this.b + Extension.C_BRAKE;
    }
}
