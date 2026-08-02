package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dqk0 {
    public final String a;

    public dqk0(String str) {
        this.a = str;
        if (evu0.J(str)) {
            ny61.g("Ride order id should not be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqk0) && jl40.l(this.a, ((dqk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RideOrderId(value=", this.a, Extension.C_BRAKE);
    }
}
