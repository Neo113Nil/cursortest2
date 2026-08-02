package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lq10 {
    public final fq10 a;

    public lq10(fq10 fq10Var) {
        this.a = fq10Var;
    }

    public final fq10 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq10) && this.a.equals(((lq10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MerchantOffersSearchViewState(screenViewState=" + this.a + Extension.C_BRAKE;
    }
}
