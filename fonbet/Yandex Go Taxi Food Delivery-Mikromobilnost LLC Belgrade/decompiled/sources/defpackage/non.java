package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class non {
    public final ColorModel a;
    public final int b;

    public non(int i, ColorModel colorModel) {
        this.a = colorModel;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof non)) {
            return false;
        }
        non nonVar = (non) obj;
        return this.a.equals(nonVar.a) && this.b == nonVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EducationGlowEntity(color=" + this.a + ", radiusPx=" + this.b + Extension.C_BRAKE;
    }
}
