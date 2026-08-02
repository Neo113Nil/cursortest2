package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class li40 implements oi40 {
    public final na11 a;

    public li40(na11 na11Var) {
        this.a = na11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li40) && jl40.l(this.a, ((li40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ApplyTransportTypeClick(selectedTransportType=" + this.a + Extension.C_BRAKE;
    }
}
