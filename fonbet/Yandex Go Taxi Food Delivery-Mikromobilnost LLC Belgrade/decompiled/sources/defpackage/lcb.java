package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lcb {
    public final long a;
    public final String b;

    public lcb(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcb)) {
            return false;
        }
        lcb lcbVar = (lcb) obj;
        return this.a == lcbVar.a && jl40.l(this.b, lcbVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = x4e.k("ChatTranslationsEntity(chatInternalId=", this.a, ", translationLang=", this.b);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
