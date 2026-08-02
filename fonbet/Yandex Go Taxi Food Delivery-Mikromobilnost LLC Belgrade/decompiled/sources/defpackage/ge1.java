package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class ge1 extends kr {
    public static final ee1 Companion = new ee1();
    public final String a;

    public /* synthetic */ ge1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ce1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge1) && jl40.l(this.a, ((ge1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("AdvertisementBillingAction(encryptedUrl=", this.a, Extension.C_BRAKE);
    }
}
