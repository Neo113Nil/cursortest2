package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ew3 {
    public final ColorModel.Attr a;
    public final vrc b;

    public ew3(ColorModel.Attr attr, vrc vrcVar) {
        this.a = attr;
        this.b = vrcVar;
    }

    public final vrc a() {
        return this.b;
    }

    public final ColorModel b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew3)) {
            return false;
        }
        ew3 ew3Var = (ew3) obj;
        return this.a.equals(ew3Var.a) && this.b.equals(ew3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoTopupInstructionViewState(statusBarColor=" + this.a + ", fullscreenViewState=" + this.b + Extension.C_BRAKE;
    }
}
