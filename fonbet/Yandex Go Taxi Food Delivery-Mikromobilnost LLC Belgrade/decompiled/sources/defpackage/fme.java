package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fme {
    public final ColorModel a;
    public final ColorModel b;
    public final ColorModel c;

    public fme(ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3) {
        this.a = colorModel;
        this.b = colorModel2;
        this.c = colorModel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fme)) {
            return false;
        }
        fme fmeVar = (fme) obj;
        return this.a.equals(fmeVar.a) && this.b.equals(fmeVar.b) && this.c.equals(fmeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vfc.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlColorEntity(controlOnColor=");
        sb.append(this.a);
        sb.append(", controlOffColor=");
        sb.append(this.b);
        sb.append(", thumbColor=");
        return n.o(sb, this.c, Extension.C_BRAKE);
    }
}
