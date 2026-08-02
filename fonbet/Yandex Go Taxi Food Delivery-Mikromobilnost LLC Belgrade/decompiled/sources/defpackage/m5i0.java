package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m5i0 {
    public final float a;
    public final ColorModel b;

    public m5i0(float f, ColorModel colorModel) {
        this.a = f;
        this.b = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5i0)) {
            return false;
        }
        m5i0 m5i0Var = (m5i0) obj;
        return Float.compare(this.a, m5i0Var.a) == 0 && this.b.equals(m5i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RadialGradientColorEntity(position=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }
}
