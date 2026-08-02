package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i3j {
    public final s3j a;
    public final fef b;

    public i3j(s3j s3jVar, fef fefVar) {
        this.a = s3jVar;
        this.b = fefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3j)) {
            return false;
        }
        i3j i3jVar = (i3j) obj;
        return jl40.l(this.a, i3jVar.a) && jl40.l(this.b, i3jVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fef fefVar = this.b;
        return hashCode + (fefVar == null ? 0 : fefVar.hashCode());
    }

    public final String toString() {
        return "Payload(detailedPriceParams=" + this.a + ", currencyRules=" + this.b + Extension.C_BRAKE;
    }
}
