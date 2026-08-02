package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class by3 implements qas0 {
    public final Text.Resource a;
    public final pdq0 b;

    public by3(Text.Resource resource, pdq0 pdq0Var) {
        this.a = resource;
        this.b = pdq0Var;
    }

    public final Text a() {
        return this.a;
    }

    public final pdq0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by3)) {
            return false;
        }
        by3 by3Var = (by3) obj;
        return this.a.equals(by3Var.a) && this.b.equals(by3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSourceSelector(buttonText=" + this.a + ", selectPaymentMethodViewState=" + this.b + Extension.C_BRAKE;
    }
}
