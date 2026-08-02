package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class eaa implements jaa {
    public final String a;
    public final boolean b;
    public final boolean c;

    public eaa(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaa)) {
            return false;
        }
        eaa eaaVar = (eaa) obj;
        return jl40.l(this.a, eaaVar.a) && this.b == eaaVar.b && this.c == eaaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("OnPromoPlateToggleChange(type=", this.a, ", isChecked=", ", reloadOffer=", this.b), this.c, Extension.C_BRAKE);
    }
}
