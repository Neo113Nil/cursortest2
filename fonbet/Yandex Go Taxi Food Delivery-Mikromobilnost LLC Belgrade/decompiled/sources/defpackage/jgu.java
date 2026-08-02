package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jgu {
    public final String a;
    public final int b;

    public jgu(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgu)) {
            return false;
        }
        jgu jguVar = (jgu) obj;
        return jl40.l(this.a, jguVar.a) && this.b == jguVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "HiddenDelivery(id=", this.a, ", revision=", Extension.C_BRAKE);
    }
}
