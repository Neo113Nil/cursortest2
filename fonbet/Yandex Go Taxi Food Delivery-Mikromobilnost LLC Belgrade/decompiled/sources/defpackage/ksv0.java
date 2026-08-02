package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ksv0 {
    public final String a;

    public ksv0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksv0) && jl40.l(this.a, ((ksv0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("SuperAppCartDeeplink(searchSessionId=", this.a, Extension.C_BRAKE);
    }

    public ksv0() {
        this(null);
    }
}
