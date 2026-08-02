package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class im8 implements km8 {
    public final Text.Constant a;
    public final Text.Constant b;

    public im8(Text.Constant constant, Text.Constant constant2) {
        this.a = constant;
        this.b = constant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im8)) {
            return false;
        }
        im8 im8Var = (im8) obj;
        return this.a.equals(im8Var.a) && this.b.equals(im8Var.b);
    }

    @Override // defpackage.km8
    public final Text getMessage() {
        return this.b;
    }

    @Override // defpackage.km8
    public final Text getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReissueSuccess(title=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }
}
