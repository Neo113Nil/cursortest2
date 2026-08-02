package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fgp extends kgp {
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public fgp(boolean z, boolean z2, String str, String str2) {
        super(true, true, z, true, z2, z2);
        this.g = str;
        this.h = str2;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgp)) {
            return false;
        }
        fgp fgpVar = (fgp) obj;
        return this.g.equals(fgpVar.g) && this.h.equals(fgpVar.h) && this.i == fgpVar.i && this.j == fgpVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + unr0.e(unr0.b(this.g.hashCode() * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        return smw0.k(", deliveryVisible=", Extension.C_BRAKE, b64.v("Custom(driverCommentTitle=", this.g, ", courierCommentTitle=", this.h, ", entranceVisible="), this.i, this.j);
    }
}
