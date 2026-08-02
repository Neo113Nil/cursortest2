package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o630 implements p630 {
    public final d5y0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof o630) {
            return this.a.equals(((o630) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TaxiOrder(orderPayload=" + this.a + Extension.C_BRAKE;
    }
}
