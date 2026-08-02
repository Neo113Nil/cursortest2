package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cnk0 {
    public final long a;
    public final hhs0 b;

    public cnk0(long j, hhs0 hhs0Var) {
        this.a = j;
        this.b = hhs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cnk0) {
            cnk0 cnk0Var = (cnk0) obj;
            return this.a == cnk0Var.a && this.b == cnk0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RideCardSharingPayload(threshold=" + this.a + ", uriProviderDelegate=" + this.b + Extension.C_BRAKE;
    }
}
