package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes.dex */
public final class he1 extends kr {
    public static final fe1 Companion = new fe1();
    public final String a;

    public /* synthetic */ he1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, de1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he1) && jl40.l(this.a, ((he1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("AdvertisementBillingAction(encryptedUrl=", this.a, Extension.C_BRAKE);
    }
}
