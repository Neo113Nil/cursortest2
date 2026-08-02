package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lj6 {
    public final qvi0 a;
    public final String b;
    public final String c;
    public final kfx0 d;

    public lj6(qvi0 qvi0Var, String str, String str2, kfx0 kfx0Var) {
        this.a = qvi0Var;
        this.b = str;
        this.c = str2;
        this.d = kfx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj6)) {
            return false;
        }
        lj6 lj6Var = (lj6) obj;
        return this.a.equals(lj6Var.a) && this.b.equals(lj6Var.b) && jl40.l(this.c, lj6Var.c) && jl40.l(this.d, lj6Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        kfx0 kfx0Var = this.d;
        return b + (kfx0Var == null ? 0 : kfx0Var.hashCode());
    }

    public final String toString() {
        return "BrandingFeatureUiState(remoteImageWithFallback=" + this.a + ", subtitle=" + this.b + ", title=" + this.c + ", uiAction=" + this.d + Extension.C_BRAKE;
    }
}
