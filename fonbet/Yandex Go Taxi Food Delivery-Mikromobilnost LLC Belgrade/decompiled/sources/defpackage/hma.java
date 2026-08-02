package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hma {
    public final String a;
    public final String b;

    public hma(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hma)) {
            return false;
        }
        hma hmaVar = (hma) obj;
        return this.a.equals(hmaVar.a) && jl40.l(this.b, hmaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ChargersPlusNotification(title=" + ((Object) this.a) + ", iconUrl=" + this.b + Extension.C_BRAKE;
    }
}
