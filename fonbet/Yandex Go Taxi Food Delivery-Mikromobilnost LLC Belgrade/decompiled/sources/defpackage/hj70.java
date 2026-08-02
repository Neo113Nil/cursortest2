package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class hj70 implements qj70 {
    public final String a;

    public hj70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj70) && jl40.l(this.a, ((hj70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CallDriver(phoneNumber=", this.a, Extension.C_BRAKE);
    }
}
