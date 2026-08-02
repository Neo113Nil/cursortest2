package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class kzd {
    public final gzd a;
    public final izd b;

    public kzd(gzd gzdVar, izd izdVar) {
        this.a = gzdVar;
        this.b = izdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzd)) {
            return false;
        }
        kzd kzdVar = (kzd) obj;
        return this.a.equals(kzdVar.a) && this.b.equals(kzdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Localizations(closeDialogsTexts=" + this.a + ", confirmDialogsTexts=" + this.b + Extension.C_BRAKE;
    }
}
