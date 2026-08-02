package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class do00 implements fo00 {
    public final zwy0 a;

    public do00(zwy0 zwy0Var) {
        this.a = zwy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof do00) && jl40.l(this.a, ((do00) obj).a);
    }

    public final int hashCode() {
        zwy0 zwy0Var = this.a;
        if (zwy0Var == null) {
            return 0;
        }
        return zwy0Var.hashCode();
    }

    public final String toString() {
        return "UniversalSPinStyle(imageAssetThemedBitmap=" + this.a + Extension.C_BRAKE;
    }
}
