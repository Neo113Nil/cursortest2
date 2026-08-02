package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class i20 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public i20(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return this.a == i20Var.a && this.b == i20Var.b && this.c.equals(i20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(qv10.u("ActiveOrdersProfileState(profileInteractionAvailable=", ", logoutEnabled=", ", logoutInfoText=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
