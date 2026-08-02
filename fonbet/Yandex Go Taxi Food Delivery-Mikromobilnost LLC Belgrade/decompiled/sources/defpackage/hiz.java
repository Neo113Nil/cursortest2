package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hiz implements jiz {
    public final String a;
    public final String b;

    public hiz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiz)) {
            return false;
        }
        hiz hizVar = (hiz) obj;
        return jl40.l(this.a, hizVar.a) && jl40.l(this.b, hizVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("Share(title=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
