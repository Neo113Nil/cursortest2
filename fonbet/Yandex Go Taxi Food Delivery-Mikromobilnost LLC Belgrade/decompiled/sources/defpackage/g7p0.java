package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g7p0 {
    public final pvi0 a;
    public final String b;
    public final String c;

    public g7p0(pvi0 pvi0Var, String str, String str2) {
        this.a = pvi0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7p0)) {
            return false;
        }
        g7p0 g7p0Var = (g7p0) obj;
        return this.a.equals(g7p0Var.a) && jl40.l(this.b, g7p0Var.b) && jl40.l(this.c, g7p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersVehicleActualPhotoUiState(photoImage=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", closeButtonText=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
