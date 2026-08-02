package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ltv0 {
    public final String a;

    public ltv0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltv0) && jl40.l(this.a, ((ltv0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("SuperAppDiscoveryMapDeeplink(context=", this.a, Extension.C_BRAKE);
    }

    public ltv0() {
        this(null);
    }
}
