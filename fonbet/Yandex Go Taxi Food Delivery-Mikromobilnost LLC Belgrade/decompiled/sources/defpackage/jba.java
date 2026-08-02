package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jba implements kba {
    public final String a;

    public jba(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jba) && jl40.l(this.a, ((jba) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Image(imageTag=", this.a, Extension.C_BRAKE);
    }
}
