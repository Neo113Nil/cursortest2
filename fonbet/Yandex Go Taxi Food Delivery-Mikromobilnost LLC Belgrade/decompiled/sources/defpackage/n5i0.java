package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n5i0 {
    public final float a;
    public final ColorModel b;

    public n5i0(float f, ColorModel colorModel) {
        this.a = f;
        this.b = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5i0)) {
            return false;
        }
        n5i0 n5i0Var = (n5i0) obj;
        return Float.compare(this.a, n5i0Var.a) == 0 && this.b.equals(n5i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RadialGradientColorEntity(position=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }
}
