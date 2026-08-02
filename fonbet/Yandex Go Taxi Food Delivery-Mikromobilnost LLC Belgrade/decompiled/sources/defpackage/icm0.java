package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class icm0 implements lcm0 {
    public final ColorModel a;

    public icm0(ColorModel colorModel) {
        this.a = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icm0) && jl40.l(this.a, ((icm0) obj).a);
    }

    @Override // defpackage.lcm0
    public final ColorModel getBackgroundColor() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(backgroundColor=" + this.a + Extension.C_BRAKE;
    }
}
