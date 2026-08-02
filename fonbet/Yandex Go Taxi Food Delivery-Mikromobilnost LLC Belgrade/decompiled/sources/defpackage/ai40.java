package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ai40 implements bi40 {
    public final String a;

    public ai40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai40) && jl40.l(this.a, ((ai40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SelectTariff(tariffId=", this.a, Extension.C_BRAKE);
    }
}
