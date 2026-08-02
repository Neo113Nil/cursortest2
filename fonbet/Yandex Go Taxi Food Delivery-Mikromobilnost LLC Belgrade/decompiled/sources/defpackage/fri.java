package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fri {
    public final String a;
    public final eri b;

    public fri(String str, eri eriVar) {
        this.a = str;
        this.b = eriVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fri)) {
            return false;
        }
        fri friVar = (fri) obj;
        return jl40.l(this.a, friVar.a) && jl40.l(this.b, friVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eri eriVar = this.b;
        return hashCode + (eriVar == null ? 0 : eriVar.hashCode());
    }

    public final String toString() {
        return "UrbanAdsSettings(page=" + this.a + ", overrides=" + this.b + Extension.C_BRAKE;
    }
}
