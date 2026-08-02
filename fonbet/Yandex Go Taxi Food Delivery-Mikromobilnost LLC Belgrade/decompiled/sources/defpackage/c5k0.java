package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c5k0 implements d5k0 {
    public final d5y0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof c5k0) {
            return this.a.equals(((c5k0) obj).a);
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
