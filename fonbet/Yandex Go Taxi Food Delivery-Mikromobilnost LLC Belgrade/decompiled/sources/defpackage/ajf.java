package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ajf {
    public final String a;
    public final int b;

    public ajf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajf)) {
            return false;
        }
        ajf ajfVar = (ajf) obj;
        return jl40.l(this.a, ajfVar.a) && this.b == ajfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "CustomButtonStyle(backgroundColor=", this.a, ", cornerRadius=", Extension.C_BRAKE);
    }
}
