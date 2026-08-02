package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gzv {
    public final String a;
    public final int b;

    public gzv(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzv)) {
            return false;
        }
        gzv gzvVar = (gzv) obj;
        return this.a.equals(gzvVar.a) && this.b == gzvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "InputFieldValue(text=", this.a, ", selection=", Extension.C_BRAKE);
    }
}
