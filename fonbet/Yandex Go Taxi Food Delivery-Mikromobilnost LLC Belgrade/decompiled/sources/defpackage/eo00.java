package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class eo00 implements fo00 {
    public final zwy0 a;

    public eo00(zwy0 zwy0Var) {
        this.a = zwy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo00) && this.a.equals(((eo00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UniversalSelectedPinStyle(imageAssetBitmap=" + this.a + Extension.C_BRAKE;
    }
}
