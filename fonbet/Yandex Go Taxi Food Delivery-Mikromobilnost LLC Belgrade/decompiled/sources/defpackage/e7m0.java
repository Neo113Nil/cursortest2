package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e7m0 implements f7m0 {
    public final ColorModel.Attr a;
    public final vrc b;

    public e7m0(ColorModel.Attr attr, vrc vrcVar) {
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
        if (!(obj instanceof e7m0)) {
            return false;
        }
        e7m0 e7m0Var = (e7m0) obj;
        return this.a.equals(e7m0Var.a) && this.b.equals(e7m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(statusBarColor=" + this.a + ", fullscreenViewState=" + this.b + Extension.C_BRAKE;
    }
}
