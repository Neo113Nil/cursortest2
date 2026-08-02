package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cr10 {
    public final rr51 a;
    public final Text.Constant b;

    public cr10(rr51 rr51Var, Text.Constant constant) {
        this.a = rr51Var;
        this.b = constant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr10)) {
            return false;
        }
        cr10 cr10Var = (cr10) obj;
        return this.a.equals(cr10Var.a) && this.b.equals(cr10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MerchantsEntity(divData=" + this.a + ", titleText=" + this.b + Extension.C_BRAKE;
    }
}
