package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class erl0 {
    public final String a;

    public erl0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erl0) && jl40.l(this.a, ((erl0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("SafetyCenterDeeplink(orderId=", this.a, Extension.C_BRAKE);
    }

    public erl0() {
        this(null);
    }
}
