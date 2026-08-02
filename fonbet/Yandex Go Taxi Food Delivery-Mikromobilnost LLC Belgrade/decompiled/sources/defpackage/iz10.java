package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class iz10 {
    public final long a;
    public final String b;

    public iz10(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz10)) {
            return false;
        }
        iz10 iz10Var = (iz10) obj;
        return this.a == iz10Var.a && jl40.l(this.b, iz10Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = x4e.k("TranslationInfo(messageVersion=", this.a, ", translatedLang=", this.b);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
