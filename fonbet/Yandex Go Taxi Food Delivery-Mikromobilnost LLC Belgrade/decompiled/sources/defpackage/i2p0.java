package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class i2p0 implements j2p0 {
    public final String a;

    public /* synthetic */ i2p0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i2p0) {
            return jl40.l(this.a, ((i2p0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenLegalTerms(link=", this.a, Extension.C_BRAKE);
    }
}
