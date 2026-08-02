package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class eft {
    public final String a;
    public final int b;

    public eft(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eft)) {
            return false;
        }
        eft eftVar = (eft) obj;
        return jl40.l(this.a, eftVar.a) && this.b == eftVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "Params(userId=", this.a, ", avatarSizeRes=", Extension.C_BRAKE);
    }
}
