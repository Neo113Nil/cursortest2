package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ct1 implements et1 {
    public final String a;

    public ct1(String str) {
        this.a = str;
        evu0.J(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct1) && this.a.equals(((ct1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Known(value=", this.a, Extension.C_BRAKE);
    }
}
