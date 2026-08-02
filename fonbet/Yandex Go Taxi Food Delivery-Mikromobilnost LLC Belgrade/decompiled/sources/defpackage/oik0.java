package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class oik0 {
    public final nik0 a;
    public final mik0 b;
    public final lik0 c;

    public oik0(nik0 nik0Var, mik0 mik0Var, lik0 lik0Var) {
        this.a = nik0Var;
        this.b = mik0Var;
        this.c = lik0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oik0)) {
            return false;
        }
        oik0 oik0Var = (oik0) obj;
        return this.a.equals(oik0Var.a) && this.b.equals(oik0Var.b) && this.c.equals(oik0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RideCardDriverTextPartUiState(titleUiState=" + this.a + ", subtitleUiState=" + this.b + ", carPlateUiState=" + this.c + Extension.C_BRAKE;
    }
}
