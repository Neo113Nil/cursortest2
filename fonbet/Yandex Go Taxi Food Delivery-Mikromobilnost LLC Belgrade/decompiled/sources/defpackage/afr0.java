package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class afr0 extends efr0 {
    public final jww a;

    public afr0(jww jwwVar) {
        this.a = jwwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afr0) && this.a.equals(((afr0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "OpenInviteLinkInfo(args=" + this.a + Extension.C_BRAKE;
    }
}
