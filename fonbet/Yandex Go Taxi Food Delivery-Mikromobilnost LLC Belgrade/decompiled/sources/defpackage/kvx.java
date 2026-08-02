package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kvx implements ovx {
    public final dem a;

    public kvx(dem demVar) {
        this.a = demVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvx) && jl40.l(this.a, ((kvx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OfferSummary(offer=" + this.a + Extension.C_BRAKE;
    }
}
