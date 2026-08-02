package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hcm0 implements lcm0 {
    public final kao a;
    public final ColorModel b;

    public hcm0(kao kaoVar, ColorModel colorModel) {
        this.a = kaoVar;
        this.b = colorModel;
    }

    public final kao a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hcm0) {
            hcm0 hcm0Var = (hcm0) obj;
            if (this.a == hcm0Var.a && jl40.l(this.b, hcm0Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lcm0
    public final ColorModel getBackgroundColor() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(state=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
