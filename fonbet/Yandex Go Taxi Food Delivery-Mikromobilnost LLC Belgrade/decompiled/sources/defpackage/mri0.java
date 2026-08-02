package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class mri0 extends zia1 {
    public final YBProduct a;
    public final String b;
    public final RegistrationType$OngoingOperation c;

    public mri0(YBProduct yBProduct, String str, RegistrationType$OngoingOperation registrationType$OngoingOperation) {
        this.a = yBProduct;
        this.b = str;
        this.c = registrationType$OngoingOperation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mri0)) {
            return false;
        }
        mri0 mri0Var = (mri0) obj;
        return this.a == mri0Var.a && this.b.equals(mri0Var.b) && this.c == mri0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "StatusCheck(product=" + this.a + ", applicationId=" + this.b + ", ongoingOperation=" + this.c + Extension.C_BRAKE;
    }
}
