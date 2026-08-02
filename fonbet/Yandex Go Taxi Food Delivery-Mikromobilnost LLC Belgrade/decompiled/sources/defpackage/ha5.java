package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ha5 {
    public CharSequence a;
    public CharSequence b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha5)) {
            return false;
        }
        ha5 ha5Var = (ha5) obj;
        return jl40.l(this.a, ha5Var.a) && jl40.l(this.b, ha5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "ContentDescriptionData(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
