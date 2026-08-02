package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;

/* loaded from: classes4.dex */
public final class hbo {
    public final EsiaAuthenticationUrl a;
    public final List b;

    public hbo(EsiaAuthenticationUrl esiaAuthenticationUrl, List list) {
        this.a = esiaAuthenticationUrl;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbo)) {
            return false;
        }
        hbo hboVar = (hbo) obj;
        return this.a.equals(hboVar.a) && this.b.equals(hboVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EsiaAuthentication(esiaUrl=" + this.a + ", cookie=" + this.b + Extension.C_BRAKE;
    }
}
