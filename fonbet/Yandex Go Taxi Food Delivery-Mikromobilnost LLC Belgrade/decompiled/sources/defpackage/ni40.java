package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ni40 implements oi40 {
    public final na11 a;

    public ni40(na11 na11Var) {
        this.a = na11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni40) && jl40.l(this.a, ((ni40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectTransportType(transportType=" + this.a + Extension.C_BRAKE;
    }
}
