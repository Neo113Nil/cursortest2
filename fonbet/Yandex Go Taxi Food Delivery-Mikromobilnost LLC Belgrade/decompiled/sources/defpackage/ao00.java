package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ao00 implements fo00 {
    public final zwy0 a;

    public ao00(zwy0 zwy0Var) {
        this.a = zwy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao00) && jl40.l(this.a, ((ao00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SupermapUniversalMFallbackSelectedPinStyle(imageAssetThemedBitmap=" + this.a + Extension.C_BRAKE;
    }
}
